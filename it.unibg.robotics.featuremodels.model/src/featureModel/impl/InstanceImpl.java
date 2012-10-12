/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package featureModel.impl;

import featureModel.Feature;
import featureModel.Instance;
import featureModel.featureModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.InstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link featureModel.impl.InstanceImpl#getDescritpion <em>Descritpion</em>}</li>
 *   <li>{@link featureModel.impl.InstanceImpl#getSelectedFeatures <em>Selected Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends EObjectImpl implements Instance {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescritpion() <em>Descritpion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescritpion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRITPION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescritpion() <em>Descritpion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescritpion()
	 * @generated
	 * @ordered
	 */
	protected String descritpion = DESCRITPION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectedFeatures() <em>Selected Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> selectedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return featureModelPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featureModelPackage.INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescritpion() {
		return descritpion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescritpion(String newDescritpion) {
		String oldDescritpion = descritpion;
		descritpion = newDescritpion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featureModelPackage.INSTANCE__DESCRITPION, oldDescritpion, descritpion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSelectedFeatures() {
		if (selectedFeatures == null) {
			selectedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, featureModelPackage.INSTANCE__SELECTED_FEATURES);
		}
		return selectedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case featureModelPackage.INSTANCE__ID:
				return getId();
			case featureModelPackage.INSTANCE__DESCRITPION:
				return getDescritpion();
			case featureModelPackage.INSTANCE__SELECTED_FEATURES:
				return getSelectedFeatures();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case featureModelPackage.INSTANCE__ID:
				setId((String)newValue);
				return;
			case featureModelPackage.INSTANCE__DESCRITPION:
				setDescritpion((String)newValue);
				return;
			case featureModelPackage.INSTANCE__SELECTED_FEATURES:
				getSelectedFeatures().clear();
				getSelectedFeatures().addAll((Collection<? extends Feature>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case featureModelPackage.INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case featureModelPackage.INSTANCE__DESCRITPION:
				setDescritpion(DESCRITPION_EDEFAULT);
				return;
			case featureModelPackage.INSTANCE__SELECTED_FEATURES:
				getSelectedFeatures().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case featureModelPackage.INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case featureModelPackage.INSTANCE__DESCRITPION:
				return DESCRITPION_EDEFAULT == null ? descritpion != null : !DESCRITPION_EDEFAULT.equals(descritpion);
			case featureModelPackage.INSTANCE__SELECTED_FEATURES:
				return selectedFeatures != null && !selectedFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", descritpion: ");
		result.append(descritpion);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl