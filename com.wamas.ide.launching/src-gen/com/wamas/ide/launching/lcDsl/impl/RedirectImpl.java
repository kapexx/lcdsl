/**
 * generated by Xtext 2.12.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.AnyPath;
import com.wamas.ide.launching.lcDsl.ExistingPath;
import com.wamas.ide.launching.lcDsl.InputStream;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.OutputStream;
import com.wamas.ide.launching.lcDsl.Redirect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redirect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RedirectImpl#getOutWhich <em>Out Which</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RedirectImpl#getOutFile <em>Out File</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RedirectImpl#isNoAppend <em>No Append</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RedirectImpl#getInWhich <em>In Which</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RedirectImpl#getInFile <em>In File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedirectImpl extends MinimalEObjectImpl.Container implements Redirect
{
  /**
   * The default value of the '{@link #getOutWhich() <em>Out Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutWhich()
   * @generated
   * @ordered
   */
  protected static final OutputStream OUT_WHICH_EDEFAULT = OutputStream.STDOUT;

  /**
   * The cached value of the '{@link #getOutWhich() <em>Out Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutWhich()
   * @generated
   * @ordered
   */
  protected OutputStream outWhich = OUT_WHICH_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutFile() <em>Out File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutFile()
   * @generated
   * @ordered
   */
  protected AnyPath outFile;

  /**
   * The default value of the '{@link #isNoAppend() <em>No Append</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoAppend()
   * @generated
   * @ordered
   */
  protected static final boolean NO_APPEND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoAppend() <em>No Append</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoAppend()
   * @generated
   * @ordered
   */
  protected boolean noAppend = NO_APPEND_EDEFAULT;

  /**
   * The default value of the '{@link #getInWhich() <em>In Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInWhich()
   * @generated
   * @ordered
   */
  protected static final InputStream IN_WHICH_EDEFAULT = InputStream.STDIN;

  /**
   * The cached value of the '{@link #getInWhich() <em>In Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInWhich()
   * @generated
   * @ordered
   */
  protected InputStream inWhich = IN_WHICH_EDEFAULT;

  /**
   * The cached value of the '{@link #getInFile() <em>In File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInFile()
   * @generated
   * @ordered
   */
  protected ExistingPath inFile;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RedirectImpl()
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
    return LcDslPackage.Literals.REDIRECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputStream getOutWhich()
  {
    return outWhich;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutWhich(OutputStream newOutWhich)
  {
    OutputStream oldOutWhich = outWhich;
    outWhich = newOutWhich == null ? OUT_WHICH_EDEFAULT : newOutWhich;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__OUT_WHICH, oldOutWhich, outWhich));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyPath getOutFile()
  {
    return outFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutFile(AnyPath newOutFile, NotificationChain msgs)
  {
    AnyPath oldOutFile = outFile;
    outFile = newOutFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__OUT_FILE, oldOutFile, newOutFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutFile(AnyPath newOutFile)
  {
    if (newOutFile != outFile)
    {
      NotificationChain msgs = null;
      if (outFile != null)
        msgs = ((InternalEObject)outFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.REDIRECT__OUT_FILE, null, msgs);
      if (newOutFile != null)
        msgs = ((InternalEObject)newOutFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.REDIRECT__OUT_FILE, null, msgs);
      msgs = basicSetOutFile(newOutFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__OUT_FILE, newOutFile, newOutFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoAppend()
  {
    return noAppend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoAppend(boolean newNoAppend)
  {
    boolean oldNoAppend = noAppend;
    noAppend = newNoAppend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__NO_APPEND, oldNoAppend, noAppend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputStream getInWhich()
  {
    return inWhich;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInWhich(InputStream newInWhich)
  {
    InputStream oldInWhich = inWhich;
    inWhich = newInWhich == null ? IN_WHICH_EDEFAULT : newInWhich;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__IN_WHICH, oldInWhich, inWhich));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistingPath getInFile()
  {
    return inFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInFile(ExistingPath newInFile, NotificationChain msgs)
  {
    ExistingPath oldInFile = inFile;
    inFile = newInFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__IN_FILE, oldInFile, newInFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInFile(ExistingPath newInFile)
  {
    if (newInFile != inFile)
    {
      NotificationChain msgs = null;
      if (inFile != null)
        msgs = ((InternalEObject)inFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.REDIRECT__IN_FILE, null, msgs);
      if (newInFile != null)
        msgs = ((InternalEObject)newInFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.REDIRECT__IN_FILE, null, msgs);
      msgs = basicSetInFile(newInFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.REDIRECT__IN_FILE, newInFile, newInFile));
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
      case LcDslPackage.REDIRECT__OUT_FILE:
        return basicSetOutFile(null, msgs);
      case LcDslPackage.REDIRECT__IN_FILE:
        return basicSetInFile(null, msgs);
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
      case LcDslPackage.REDIRECT__OUT_WHICH:
        return getOutWhich();
      case LcDslPackage.REDIRECT__OUT_FILE:
        return getOutFile();
      case LcDslPackage.REDIRECT__NO_APPEND:
        return isNoAppend();
      case LcDslPackage.REDIRECT__IN_WHICH:
        return getInWhich();
      case LcDslPackage.REDIRECT__IN_FILE:
        return getInFile();
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
      case LcDslPackage.REDIRECT__OUT_WHICH:
        setOutWhich((OutputStream)newValue);
        return;
      case LcDslPackage.REDIRECT__OUT_FILE:
        setOutFile((AnyPath)newValue);
        return;
      case LcDslPackage.REDIRECT__NO_APPEND:
        setNoAppend((Boolean)newValue);
        return;
      case LcDslPackage.REDIRECT__IN_WHICH:
        setInWhich((InputStream)newValue);
        return;
      case LcDslPackage.REDIRECT__IN_FILE:
        setInFile((ExistingPath)newValue);
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
      case LcDslPackage.REDIRECT__OUT_WHICH:
        setOutWhich(OUT_WHICH_EDEFAULT);
        return;
      case LcDslPackage.REDIRECT__OUT_FILE:
        setOutFile((AnyPath)null);
        return;
      case LcDslPackage.REDIRECT__NO_APPEND:
        setNoAppend(NO_APPEND_EDEFAULT);
        return;
      case LcDslPackage.REDIRECT__IN_WHICH:
        setInWhich(IN_WHICH_EDEFAULT);
        return;
      case LcDslPackage.REDIRECT__IN_FILE:
        setInFile((ExistingPath)null);
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
      case LcDslPackage.REDIRECT__OUT_WHICH:
        return outWhich != OUT_WHICH_EDEFAULT;
      case LcDslPackage.REDIRECT__OUT_FILE:
        return outFile != null;
      case LcDslPackage.REDIRECT__NO_APPEND:
        return noAppend != NO_APPEND_EDEFAULT;
      case LcDslPackage.REDIRECT__IN_WHICH:
        return inWhich != IN_WHICH_EDEFAULT;
      case LcDslPackage.REDIRECT__IN_FILE:
        return inFile != null;
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
    result.append(" (outWhich: ");
    result.append(outWhich);
    result.append(", noAppend: ");
    result.append(noAppend);
    result.append(", inWhich: ");
    result.append(inWhich);
    result.append(')');
    return result.toString();
  }

} //RedirectImpl
