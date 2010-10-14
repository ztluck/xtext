/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB;
import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.Bug326937TestLanguageFactory;
import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.Bug326937TestLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug326937TestLanguagePackageImpl extends EPackageImpl implements Bug326937TestLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aorBEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.Bug326937TestLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Bug326937TestLanguagePackageImpl()
  {
    super(eNS_URI, Bug326937TestLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Bug326937TestLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Bug326937TestLanguagePackage init()
  {
    if (isInited) return (Bug326937TestLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(Bug326937TestLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Bug326937TestLanguagePackageImpl theBug326937TestLanguagePackage = (Bug326937TestLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bug326937TestLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bug326937TestLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBug326937TestLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theBug326937TestLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBug326937TestLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Bug326937TestLanguagePackage.eNS_URI, theBug326937TestLanguagePackage);
    return theBug326937TestLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getA()
  {
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getA_Contents()
  {
    return (EReference)aEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAorB()
  {
    return aorBEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAorB_Name()
  {
    return (EAttribute)aorBEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getB()
  {
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bug326937TestLanguageFactory getBug326937TestLanguageFactory()
  {
    return (Bug326937TestLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    aEClass = createEClass(A);
    createEReference(aEClass, A__CONTENTS);

    aorBEClass = createEClass(AOR_B);
    createEAttribute(aorBEClass, AOR_B__NAME);

    bEClass = createEClass(B);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    aEClass.getESuperTypes().add(this.getAorB());
    bEClass.getESuperTypes().add(this.getAorB());

    // Initialize classes and features; add operations and parameters
    initEClass(aEClass, org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getA_Contents(), this.getAorB(), null, "contents", null, 0, -1, org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aorBEClass, AorB.class, "AorB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAorB_Name(), ecorePackage.getEString(), "name", null, 0, 1, AorB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEClass, org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Bug326937TestLanguagePackageImpl
