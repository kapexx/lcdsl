/**
 * generated by Xtext 2.12.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.TraceEnablement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Enablement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TraceEnablementImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TraceEnablementImpl#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceEnablementImpl extends MinimalEObjectImpl.Container implements TraceEnablement
{
  /**
   * The default value of the '{@link #getPlugin() <em>Plugin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected static final String PLUGIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected String plugin = PLUGIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhat() <em>What</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhat()
   * @generated
   * @ordered
   */
  protected EList<String> what;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceEnablementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LcDslPackage.Literals.TRACE_ENABLEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlugin()
  {
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlugin(String newPlugin)
  {
    String oldPlugin = plugin;
    plugin = newPlugin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TRACE_ENABLEMENT__PLUGIN, oldPlugin, plugin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getWhat()
  {
    if (what == null)
    {
      what = new EDataTypeEList<String>(String.class, this, LcDslPackage.TRACE_ENABLEMENT__WHAT);
    }
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LcDslPackage.TRACE_ENABLEMENT__PLUGIN:
        return getPlugin();
      case LcDslPackage.TRACE_ENABLEMENT__WHAT:
        return getWhat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.TRACE_ENABLEMENT__PLUGIN:
        setPlugin((String)newValue);
        return;
      case LcDslPackage.TRACE_ENABLEMENT__WHAT:
        getWhat().clear();
        getWhat().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.TRACE_ENABLEMENT__PLUGIN:
        setPlugin(PLUGIN_EDEFAULT);
        return;
      case LcDslPackage.TRACE_ENABLEMENT__WHAT:
        getWhat().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.TRACE_ENABLEMENT__PLUGIN:
        return PLUGIN_EDEFAULT == null ? plugin != null : !PLUGIN_EDEFAULT.equals(plugin);
      case LcDslPackage.TRACE_ENABLEMENT__WHAT:
        return what != null && !what.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (plugin: ");
    result.append(plugin);
    result.append(", what: ");
    result.append(what);
    result.append(')');
    return result.toString();
  }

} //TraceEnablementImpl
