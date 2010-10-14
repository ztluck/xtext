/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.Bug326937TestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface Bug326937TestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bug326937TestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/2010/xtext/ui/tests/Bug326937TestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bug326937TestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Bug326937TestLanguagePackage eINSTANCE = org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AorBImpl <em>Aor B</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AorBImpl
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getAorB()
   * @generated
   */
  int AOR_B = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AOR_B__NAME = 0;

  /**
   * The number of structural features of the '<em>Aor B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AOR_B_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AImpl <em>A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AImpl
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getA()
   * @generated
   */
  int A = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A__NAME = AOR_B__NAME;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A__CONTENTS = AOR_B_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A_FEATURE_COUNT = AOR_B_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.BImpl <em>B</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.BImpl
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getB()
   * @generated
   */
  int B = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int B__NAME = AOR_B__NAME;

  /**
   * The number of structural features of the '<em>B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int B_FEATURE_COUNT = AOR_B_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>A</em>'.
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A
   * @generated
   */
  EClass getA();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.A#getContents()
   * @see #getA()
   * @generated
   */
  EReference getA_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB <em>Aor B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aor B</em>'.
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB
   * @generated
   */
  EClass getAorB();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.AorB#getName()
   * @see #getAorB()
   * @generated
   */
  EAttribute getAorB_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.B <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>B</em>'.
   * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.B
   * @generated
   */
  EClass getB();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Bug326937TestLanguageFactory getBug326937TestLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AImpl <em>A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AImpl
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getA()
     * @generated
     */
    EClass A = eINSTANCE.getA();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference A__CONTENTS = eINSTANCE.getA_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AorBImpl <em>Aor B</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.AorBImpl
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getAorB()
     * @generated
     */
    EClass AOR_B = eINSTANCE.getAorB();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AOR_B__NAME = eINSTANCE.getAorB_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.BImpl <em>B</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.BImpl
     * @see org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl.Bug326937TestLanguagePackageImpl#getB()
     * @generated
     */
    EClass B = eINSTANCE.getB();

  }

} //Bug326937TestLanguagePackage
