/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.AddPlugin#getPlugin <em>Plugin</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getAddPlugin()
 * @model
 * @generated
 */
public interface AddPlugin extends EObject
{
  /**
   * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plugin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plugin</em>' containment reference.
   * @see #setPlugin(Plugin)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getAddPlugin_Plugin()
   * @model containment="true"
   * @generated
   */
  Plugin getPlugin();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.AddPlugin#getPlugin <em>Plugin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plugin</em>' containment reference.
   * @see #getPlugin()
   * @generated
   */
  void setPlugin(Plugin value);

} // AddPlugin
