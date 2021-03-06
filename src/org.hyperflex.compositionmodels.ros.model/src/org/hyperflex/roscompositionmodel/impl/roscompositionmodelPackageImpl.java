/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
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
package org.hyperflex.roscompositionmodel.impl;

import org.hyperflex.compositionmodel.compositionmodelPackage;

import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;

import org.hyperflex.roscompositionmodel.ROSComposite;
import org.hyperflex.roscompositionmodel.ROSMsgConsumer;
import org.hyperflex.roscompositionmodel.ROSMsgProducer;
import org.hyperflex.roscompositionmodel.ROSProperty;
import org.hyperflex.roscompositionmodel.ROSSrvConsumer;
import org.hyperflex.roscompositionmodel.ROSSrvProducer;
import org.hyperflex.roscompositionmodel.RosTopic;
import org.hyperflex.roscompositionmodel.roscompositionmodelFactory;
import org.hyperflex.roscompositionmodel.roscompositionmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class roscompositionmodelPackageImpl extends EPackageImpl implements roscompositionmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosMsgProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosMsgConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSrvProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSrvConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTopicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPropertyEClass = null;

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
	 * @see org.hyperflex.roscompositionmodel.roscompositionmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private roscompositionmodelPackageImpl() {
		super(eNS_URI, roscompositionmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link roscompositionmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static roscompositionmodelPackage init() {
		if (isInited) return (roscompositionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(roscompositionmodelPackage.eNS_URI);

		// Obtain or create and register package
		roscompositionmodelPackageImpl theroscompositionmodelPackage = (roscompositionmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof roscompositionmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new roscompositionmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		compositionmodelPackage.eINSTANCE.eClass();
		roscomponentmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theroscompositionmodelPackage.createPackageContents();

		// Initialize created meta-data
		theroscompositionmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theroscompositionmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(roscompositionmodelPackage.eNS_URI, theroscompositionmodelPackage);
		return theroscompositionmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSComposite() {
		return rosCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSComposite_Composite() {
		return (EReference)rosCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSMsgProducer() {
		return rosMsgProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgProducer_MsgProducer() {
		return (EReference)rosMsgProducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSMsgConsumer() {
		return rosMsgConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgConsumer_MsgConsumer() {
		return (EReference)rosMsgConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSSrvProducer() {
		return rosSrvProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSSrvProducer_SrvProducer() {
		return (EReference)rosSrvProducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSSrvConsumer() {
		return rosSrvConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSSrvConsumer_SrvConsumer() {
		return (EReference)rosSrvConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosTopic() {
		return rosTopicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSProperty() {
		return rosPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSProperty_Property() {
		return (EReference)rosPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscompositionmodelFactory getroscompositionmodelFactory() {
		return (roscompositionmodelFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rosCompositeEClass = createEClass(ROS_COMPOSITE);
		createEReference(rosCompositeEClass, ROS_COMPOSITE__COMPOSITE);

		rosMsgProducerEClass = createEClass(ROS_MSG_PRODUCER);
		createEReference(rosMsgProducerEClass, ROS_MSG_PRODUCER__MSG_PRODUCER);

		rosMsgConsumerEClass = createEClass(ROS_MSG_CONSUMER);
		createEReference(rosMsgConsumerEClass, ROS_MSG_CONSUMER__MSG_CONSUMER);

		rosSrvProducerEClass = createEClass(ROS_SRV_PRODUCER);
		createEReference(rosSrvProducerEClass, ROS_SRV_PRODUCER__SRV_PRODUCER);

		rosSrvConsumerEClass = createEClass(ROS_SRV_CONSUMER);
		createEReference(rosSrvConsumerEClass, ROS_SRV_CONSUMER__SRV_CONSUMER);

		rosTopicEClass = createEClass(ROS_TOPIC);

		rosPropertyEClass = createEClass(ROS_PROPERTY);
		createEReference(rosPropertyEClass, ROS_PROPERTY__PROPERTY);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		compositionmodelPackage thecompositionmodelPackage = (compositionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(compositionmodelPackage.eNS_URI);
		roscomponentmodelPackage theroscomponentmodelPackage = (roscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(roscomponentmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rosCompositeEClass.getESuperTypes().add(thecompositionmodelPackage.getComposite());
		rosMsgProducerEClass.getESuperTypes().add(thecompositionmodelPackage.getCompProvidedInterf());
		rosMsgConsumerEClass.getESuperTypes().add(thecompositionmodelPackage.getCompRequiredInterf());
		rosSrvProducerEClass.getESuperTypes().add(thecompositionmodelPackage.getCompProvidedInterf());
		rosSrvConsumerEClass.getESuperTypes().add(thecompositionmodelPackage.getCompRequiredInterf());
		rosTopicEClass.getESuperTypes().add(thecompositionmodelPackage.getConnection());
		rosPropertyEClass.getESuperTypes().add(thecompositionmodelPackage.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(rosCompositeEClass, ROSComposite.class, "ROSComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSComposite_Composite(), thecompositionmodelPackage.getComposite(), null, "composite", null, 1, 1, ROSComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosMsgProducerEClass, ROSMsgProducer.class, "ROSMsgProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSMsgProducer_MsgProducer(), theroscomponentmodelPackage.getCompositeMsgProducer(), null, "msgProducer", null, 1, 1, ROSMsgProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosMsgConsumerEClass, ROSMsgConsumer.class, "ROSMsgConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSMsgConsumer_MsgConsumer(), theroscomponentmodelPackage.getCompositeMsgConsumer(), null, "msgConsumer", null, 1, 1, ROSMsgConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosSrvProducerEClass, ROSSrvProducer.class, "ROSSrvProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSSrvProducer_SrvProducer(), theroscomponentmodelPackage.getCompositeSrvProducer(), null, "srvProducer", null, 1, 1, ROSSrvProducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosSrvConsumerEClass, ROSSrvConsumer.class, "ROSSrvConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSSrvConsumer_SrvConsumer(), theroscomponentmodelPackage.getCompositeSrvConsumer(), null, "srvConsumer", null, 1, 1, ROSSrvConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTopicEClass, RosTopic.class, "RosTopic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosPropertyEClass, ROSProperty.class, "ROSProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSProperty_Property(), theroscomponentmodelPackage.getCompositeProperty(), null, "property", null, 0, 1, ROSProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //roscompositionmodelPackageImpl
