/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.featuremodels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.hyperflex.featuremodels.ContainmentAssociation;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.featuremodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.hyperflex.featuremodels.impl.ContainmentAssociationImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainmentAssociationImpl extends EObjectImpl implements ContainmentAssociation {
	/**
	 * The cached value of the '{@link #getSubFeatures() <em>Sub Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> subFeatures;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return featuremodelsPackage.Literals.CONTAINMENT_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSubFeatures() {
		if (subFeatures == null) {
			subFeatures = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES, featuremodelsPackage.FEATURE__CONTAINER_PARENT);
		}
		return subFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getParent() {
		if (eContainerFeatureID() != featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Feature newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Feature newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, featuremodelsPackage.FEATURE__CONTAINERS, Feature.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.CONTAINMENT_ASSOCIATION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, featuremodelsPackage.CONTAINMENT_ASSOCIATION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFeatures()).basicAdd(otherEnd, msgs);
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Feature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				return ((InternalEList<?>)getSubFeatures()).basicRemove(otherEnd, msgs);
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				return eInternalContainer().eInverseRemove(this, featuremodelsPackage.FEATURE__CONTAINERS, Feature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				return getSubFeatures();
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				return getParent();
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__UPPER_BOUND:
				return getUpperBound();
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__LOWER_BOUND:
				return getLowerBound();
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
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				getSubFeatures().clear();
				getSubFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				setParent((Feature)newValue);
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
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
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				getSubFeatures().clear();
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				setParent((Feature)null);
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
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
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__SUB_FEATURES:
				return subFeatures != null && !subFeatures.isEmpty();
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__PARENT:
				return getParent() != null;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case featuremodelsPackage.CONTAINMENT_ASSOCIATION__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
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
		result.append(" (upperBound: ");
		result.append(upperBound);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(')');
		return result.toString();
	}

} //ContainmentAssociationImpl
