/**
 * generated by Xtext 2.12.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.PluginWithVersion;
import com.wamas.ide.launching.lcDsl.PluginWithVersionAndStartLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin With Version And Start Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.PluginWithVersionAndStartLevelImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.PluginWithVersionAndStartLevelImpl#isAutoStart <em>Auto Start</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.PluginWithVersionAndStartLevelImpl#getStartLevel <em>Start Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginWithVersionAndStartLevelImpl extends MinimalEObjectImpl.Container implements PluginWithVersionAndStartLevel
{
  /**
   * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected PluginWithVersion plugin;

  /**
   * The default value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoStart()
   * @generated
   * @ordered
   */
  protected static final boolean AUTO_START_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoStart()
   * @generated
   * @ordered
   */
  protected boolean autoStart = AUTO_START_EDEFAULT;

  /**
   * The default value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartLevel()
   * @generated
   * @ordered
   */
  protected static final int START_LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartLevel()
   * @generated
   * @ordered
   */
  protected int startLevel = START_LEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginWithVersionAndStartLevelImpl()
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
    return LcDslPackage.Literals.PLUGIN_WITH_VERSION_AND_START_LEVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginWithVersion getPlugin()
  {
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlugin(PluginWithVersion newPlugin, NotificationChain msgs)
  {
    PluginWithVersion oldPlugin = plugin;
    plugin = newPlugin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN, oldPlugin, newPlugin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlugin(PluginWithVersion newPlugin)
  {
    if (newPlugin != plugin)
    {
      NotificationChain msgs = null;
      if (plugin != null)
        msgs = ((InternalEObject)plugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN, null, msgs);
      if (newPlugin != null)
        msgs = ((InternalEObject)newPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN, null, msgs);
      msgs = basicSetPlugin(newPlugin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN, newPlugin, newPlugin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutoStart()
  {
    return autoStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoStart(boolean newAutoStart)
  {
    boolean oldAutoStart = autoStart;
    autoStart = newAutoStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__AUTO_START, oldAutoStart, autoStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStartLevel()
  {
    return startLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartLevel(int newStartLevel)
  {
    int oldStartLevel = startLevel;
    startLevel = newStartLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__START_LEVEL, oldStartLevel, startLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN:
        return basicSetPlugin(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN:
        return getPlugin();
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__AUTO_START:
        return isAutoStart();
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__START_LEVEL:
        return getStartLevel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN:
        setPlugin((PluginWithVersion)newValue);
        return;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__AUTO_START:
        setAutoStart((Boolean)newValue);
        return;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__START_LEVEL:
        setStartLevel((Integer)newValue);
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
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN:
        setPlugin((PluginWithVersion)null);
        return;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__AUTO_START:
        setAutoStart(AUTO_START_EDEFAULT);
        return;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__START_LEVEL:
        setStartLevel(START_LEVEL_EDEFAULT);
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
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__PLUGIN:
        return plugin != null;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__AUTO_START:
        return autoStart != AUTO_START_EDEFAULT;
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL__START_LEVEL:
        return startLevel != START_LEVEL_EDEFAULT;
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
    result.append(" (autoStart: ");
    result.append(autoStart);
    result.append(", startLevel: ");
    result.append(startLevel);
    result.append(')');
    return result.toString();
  }

} //PluginWithVersionAndStartLevelImpl
