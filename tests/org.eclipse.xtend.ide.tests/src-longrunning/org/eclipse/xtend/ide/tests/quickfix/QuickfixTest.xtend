package org.eclipse.xtend.ide.tests.quickfix

import com.google.inject.Inject
import static org.eclipse.xtend.core.validation.IssueCodes.*
import static org.eclipse.xtext.xbase.validation.IssueCodes.*
import org.eclipse.xtend.ide.tests.AbstractXtendUITestCase
import org.junit.After
import org.junit.Test
import org.junit.Ignore

class QuickfixTest extends AbstractXtendUITestCase {
	
	@Inject extension QuickfixTestBuilder builder
	
	@After
	override tearDown() {
		builder.tearDown
	}
	
	@Test 
	def void missingMember() {
		create('Foo.xtend', '''
			class Foo {
				def foo() {
					bar|
				}
			}
		''')
		.assertIssueCodes(FEATURECALL_LINKING_DIAGNOSTIC)
		.assertResolutionLabels("Create method 'bar'", "Create field 'bar'", "Create local variable 'bar'")
		.assertModelAfterQuickfix("Create method 'bar'", '''
			class Foo {
				def foo() {
					bar
				}
				def bar() { }
			
			}
		''')
		.assertModelAfterQuickfix("Create field 'bar'", '''
			class Foo {
				Object bar
				def foo() {
					bar
				}
			}
		''')
		.assertModelAfterQuickfix("Create local variable 'bar'", '''
			class Foo {
				def foo() {
					val bar = null
					bar
				}
			}
		''')
	}
	
	@Test
	def void invalidNumberOfArguments() {
		create('Foo.xtend', '''
			class Foo {
				def foo() {
					bar|(1)
				}
				def bar() {}
			}
		''')
		.assertIssueCodes(INVALID_NUMBER_OF_ARGUMENTS)
//		.assertResolutionLabels("Make class abstract")
//		.assertModelAfterQuickfix(0, '''
//			abstract class Foo {
//				def void bar()
//			}
//		''')
	}

	@Test
	def void missingConcreteMembers() {
		create('Foo.xtend', '''
			abstract class Foo {
				def bar()
			}
			
			class Bar| extends Foo {
			}
		''')
		.assertIssueCodes(CLASS_MUST_BE_ABSTRACT)
		.assertResolutionLabels("Add unimplemented methods", "Make class abstract")
		.assertModelAfterQuickfix("Add unimplemented methods", '''
			abstract class Foo {
				def bar()
			}
			
			class Bar extends Foo {
			
				override bar() {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}
				
			}
		''')
		.assertModelAfterQuickfix("Make class abstract", '''
			abstract class Foo {
				def bar()
			}
			
			abstract class Bar extends Foo {
			}
		''')
	}
	
	// TODO: this testcase goes completely wrong 
	@Ignore@Test
	def void missingConcreteMembers2() {
		create('Foo.xtend', '''
			class Foo| implements Comparable<Foo> {
			}
		''')
		.assertIssueCodes(CLASS_MUST_BE_ABSTRACT)
		.assertResolutionLabels("Add unimplemented methods", "Make class abstract")
		.assertModelAfterQuickfix("Add unimplemented methods", '''
			class Foo implements Comparable<Foo> {
				override compareTo(Foo o) {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}
			}
		''')
		.assertModelAfterQuickfix("Make class abstract", '''
			abstract class Foo implements Comparable<Foo> {
			}
		''')
	}
	
	@Test
	def void inconsistentIndentation() {
		val tripleQuotes = "'''"
		create('Foo.xtend', '''
			class Foo {
				def bar() �tripleQuotes�
					tab
			        |space
				�tripleQuotes�
			}
		''')
		.assertIssueCodes(INCONSISTENT_INDENTATION)
		.assertResolutionLabels("Correct indentation")
		.assertModelAfterQuickfix('''
			class Foo {
				def bar() �tripleQuotes�
					tab
					space
				�tripleQuotes�
			}
		''')
	}
	
	@Test 
	def void missingOverride() {
		create('Foo.xtend', '''
			class Foo implements Comparable<Foo> {
				def comp|areTo(Foo o) {
					1
				}
			}
		''')
		.assertIssueCodes(MISSING_OVERRIDE)
		.assertResolutionLabels("Change 'def' to 'override'")
		.assertModelAfterQuickfix('''
			class Foo implements Comparable<Foo> {
				override compareTo(Foo o) {
					1
				}
			}
		''')
	}

	@Test 
	def void obsoleteOverride() {
		create('Foo.xtend', '''
			class Foo {
				override| bar() {
				}
			}
		''')
		.assertIssueCodes(OBSOLETE_OVERRIDE)
		.assertResolutionLabels("Change 'override' to 'def'")
		.assertModelAfterQuickfix('''
			class Foo {
				def bar() {
				}
			}
		''')
	}
	
	@Test 
	def void missingConstructorFromSuper() {
		create('Foo.xtend', '''
			class Foo {
				new(int i) {
				}
			}
			
			class Bar| extends Foo {
			}
		''')
		.assertIssueCodes(MISSING_CONSTRUCTOR)
		.assertResolutionLabels("Add constructor new(int)")
		.assertModelAfterQuickfix('''
			class Foo {
				new(int i) {
				}
			}
			
			class Bar extends Foo {

				new(int i) {
					super(i)
				}
			}
		''')
	}

	@Test
	def void missingAbstract() {
		create('Foo.xtend', '''
			class Foo {
				def void bar|()
			}
		''')
		.assertIssueCodes(MISSING_ABSTRACT)
		.assertResolutionLabels("Make class abstract")
		.assertModelAfterQuickfix('''
			abstract class Foo {
				def void bar()
			}
		''')
	}
	
	// TODO: reenable when exception validation can be switched on
	// https://bugs.eclipse.org/bugs/show_bug.cgi?id=398273))
	@Ignore@Test 
	def void unhandledCheckedException() {
		create('Foo.xtend', '''
			class Foo {
				def void bar|() {
					throw new Exception()
				}
			}
		''')
		.assertIssueCodes(UNHANDLED_EXCEPTION)
		.assertResolutionLabels("Add throws declaration", "Surround with try/catch block")
		.assertModelAfterQuickfix("Add throws declaration", '''
			class Foo {
				def void bar() throws Exception {
					throw new Exception()
				}
			}
		''')
		.assertModelAfterQuickfix("Surround with try/catch block", '''
			class Foo {
				def void bar() {
					try {
						throw new Exception()
					} catch(Exception exc) {
						throw new RuntimeException("auto-generated try/catch")
					}
				}
			}
		''')
	}
	
	@Test
	def void unusedImport() {
		create('Foo.xtend', '''
			import java.util.List|
			
			class Foo {
			}
		''')
		.assertIssueCodes(IMPORT_UNUSED)
		.assertResolutionLabels("Organize imports")
		.assertModelAfterQuickfix('''
			class Foo {
			}
		''')
	}

	@Test
	def void duplicateImport() {
		create('Foo.xtend', '''
			import java.util.List
			import java.util.List|
			
			class Foo {
				List foo
			}
		''')
		.assertIssueCodes(IMPORT_DUPLICATE)
		.assertResolutionLabels("Organize imports")
		.assertModelAfterQuickfix('''
			import java.util.List
			
			class Foo {
				List foo
			}
		''')
	}
	
	@Test
	def void wildcardImport() {
		create('Foo.xtend', '''
			import java.util.*|
			
			class Foo {
				List foo
			}
		''')
		.assertIssueCodes(IMPORT_WILDCARD_DEPRECATED)
		.assertResolutionLabels("Organize imports")
		.assertModelAfterQuickfix('''
			import java.util.List
			
			class Foo {
				List foo
			}
		''')
	}
}
