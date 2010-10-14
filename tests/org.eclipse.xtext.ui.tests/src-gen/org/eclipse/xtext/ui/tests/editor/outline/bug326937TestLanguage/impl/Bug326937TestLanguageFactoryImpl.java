/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.ui.tests.editor.outline.bug326937TestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug326937TestLanguageFactoryImpl extends EFactoryImpl implements Bug326937TestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Bug326937TestLanguageFactory init()
  {
    try
    {
      Bug326937TestLanguageFactory theBug326937TestLanguageFactory = (Bug326937TestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/2010/xtext/ui/tests/Bug326937TestLanguage"); 
      if (theBug326937TestLanguageFactory != null)
      {
        return theBug326937TestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Bug326937TestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bug326937TestLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Bug326937TestLanguagePackage.A: return createA();
      case Bug326937TestLanguagePackage.AOR_B: return createAorB();
      case Bug326937TestLanguagePackage.B: return createB();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public A createA()
  {
    AImpl a = new AImpl();
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AorB createAorB()
  {
    AorBImpl aorB = new AorBImpl();
    return aorB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public B createB()
  {
    BImpl b = new BImpl();
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bug326937TestLanguagePackage getBug326937TestLanguagePackage()
  {
    return (Bug326937TestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Bug326937TestLanguagePackage getPackage()
  {
    return Bug326937TestLanguagePackage.eINSTANCE;
  }

} //Bug326937TestLanguageFactoryImpl
