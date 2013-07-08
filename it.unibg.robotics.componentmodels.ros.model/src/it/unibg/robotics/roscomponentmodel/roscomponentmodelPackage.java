/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.roscomponentmodel;

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
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface roscomponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roscomponentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robotics.unibg.it/componentmodels.ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roscomponentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	roscomponentmodelPackage eINSTANCE = it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.AbstractComponentImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 19;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NODES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MSG_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MSG_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TOPICS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SRV_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SRV_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__WIRES = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROPERTIES = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Msg Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srv Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_PRODUCERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Srv Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SRV_CONSUMERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.MsgInterfaceImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgInterface()
	 * @generated
	 */
	int MSG_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE__CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgInterfaceImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgInterface()
	 * @generated
	 */
	int NODE_MSG_INTERFACE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__NAME = MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__CONNECTION = MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE__TOPIC_NAME = MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_INTERFACE_FEATURE_COUNT = MSG_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
	 * @generated
	 */
	int NODE_MSG_PRODUCER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_PRODUCER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
	 * @generated
	 */
	int NODE_MSG_CONSUMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__NAME = NODE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__CONNECTION = NODE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER__TOPIC_NAME = NODE_MSG_INTERFACE__TOPIC_NAME;

	/**
	 * The number of structural features of the '<em>Node Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MSG_CONSUMER_FEATURE_COUNT = NODE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.CompositeMsgInterfaceImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgInterface()
	 * @generated
	 */
	int COMPOSITE_MSG_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__NAME = MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__CONNECTION = MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE__EXPOSED = MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Msg Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MSG_INTERFACE_FEATURE_COUNT = MSG_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl <em>Package Msg Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgProducer()
	 * @generated
	 */
	int PACKAGE_MSG_PRODUCER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Package Msg Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_PRODUCER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl <em>Package Msg Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgConsumer()
	 * @generated
	 */
	int PACKAGE_MSG_CONSUMER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__NAME = COMPOSITE_MSG_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__CONNECTION = COMPOSITE_MSG_INTERFACE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER__EXPOSED = COMPOSITE_MSG_INTERFACE__EXPOSED;

	/**
	 * The number of structural features of the '<em>Package Msg Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSG_CONSUMER_FEATURE_COUNT = COMPOSITE_MSG_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.TopicImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PropertyImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
	 * @generated
	 */
	int SRV_PRODUCER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_PRODUCER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_PRODUCER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
	 * @generated
	 */
	int SRV_CONSUMER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CONSUMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl <em>Package Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvProducer()
	 * @generated
	 */
	int PACKAGE_SRV_PRODUCER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER__NAME = SRV_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER__PROMOTE = SRV_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_PRODUCER_FEATURE_COUNT = SRV_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
	 * @generated
	 */
	int NODE_SRV_PRODUCER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER__NAME = SRV_PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER__SRV_NAME = SRV_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_PRODUCER_FEATURE_COUNT = SRV_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl <em>Package Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvConsumer()
	 * @generated
	 */
	int PACKAGE_SRV_CONSUMER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER__NAME = SRV_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER__PROMOTE = SRV_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SRV_CONSUMER_FEATURE_COUNT = SRV_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
	 * @generated
	 */
	int NODE_SRV_CONSUMER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER__NAME = SRV_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER__SRV_NAME = SRV_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Srv Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SRV_CONSUMER_FEATURE_COUNT = SRV_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.WireImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getArchitectureModel()
	 * @generated
	 */
	int ARCHITECTURE_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodePropertyImpl <em>Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.NodePropertyImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeProperty()
	 * @generated
	 */
	int NODE_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibg.robotics.roscomponentmodel.impl.CompositePropertyImpl <em>Composite Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibg.robotics.roscomponentmodel.impl.CompositePropertyImpl
	 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeProperty()
	 * @generated
	 */
	int COMPOSITE_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Exposed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY__EXPOSED = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getNodes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getMsgProducers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getMsgConsumers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getTopics()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getSrvProducers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getSrvConsumers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SrvConsumers();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getWires()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Wires();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Package#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Package#getProperties()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Properties();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getMsgProducers <em>Msg Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getMsgProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getMsgConsumers <em>Msg Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getMsgConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_MsgConsumers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getParameters()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getSrvProducers <em>Srv Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Producers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getSrvProducers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvProducers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibg.robotics.roscomponentmodel.Node#getSrvConsumers <em>Srv Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv Consumers</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getSrvConsumers()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SrvConsumers();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgProducer <em>Node Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgProducer
	 * @generated
	 */
	EClass getNodeMsgProducer();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgConsumer <em>Node Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgConsumer
	 * @generated
	 */
	EClass getNodeMsgConsumer();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgProducer <em>Package Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Msg Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgProducer
	 * @generated
	 */
	EClass getPackageMsgProducer();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgConsumer <em>Package Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Msg Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgConsumer
	 * @generated
	 */
	EClass getPackageMsgConsumer();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.SrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvProducer
	 * @generated
	 */
	EClass getSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.SrvProducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvProducer#getName()
	 * @see #getSrvProducer()
	 * @generated
	 */
	EAttribute getSrvProducer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer
	 * @generated
	 */
	EClass getSrvConsumer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer#getName()
	 * @see #getSrvConsumer()
	 * @generated
	 */
	EAttribute getSrvConsumer_Name();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer <em>Package Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvProducer
	 * @generated
	 */
	EClass getPackageSrvProducer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvProducer#getPromote()
	 * @see #getPackageSrvProducer()
	 * @generated
	 */
	EReference getPackageSrvProducer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer <em>Node Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Producer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvProducer
	 * @generated
	 */
	EClass getNodeSrvProducer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvProducer#getSrvName()
	 * @see #getNodeSrvProducer()
	 * @generated
	 */
	EAttribute getNodeSrvProducer_SrvName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer <em>Package Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvConsumer
	 * @generated
	 */
	EClass getPackageSrvConsumer();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promote</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvConsumer#getPromote()
	 * @see #getPackageSrvConsumer()
	 * @generated
	 */
	EReference getPackageSrvConsumer_Promote();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer <em>Node Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Srv Consumer</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvConsumer
	 * @generated
	 */
	EClass getNodeSrvConsumer();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvConsumer#getSrvName()
	 * @see #getNodeSrvConsumer()
	 * @generated
	 */
	EAttribute getNodeSrvConsumer_SrvName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Source();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.Wire#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.Wire#getTarget()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Target();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Model</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.ArchitectureModel
	 * @generated
	 */
	EClass getArchitectureModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibg.robotics.roscomponentmodel.ArchitectureModel#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.ArchitectureModel#getPackage()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EReference getArchitectureModel_Package();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.MsgInterface <em>Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Interface</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgInterface
	 * @generated
	 */
	EClass getMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.MsgInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgInterface#getName()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EAttribute getMsgInterface_Name();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.MsgInterface#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.MsgInterface#getConnection()
	 * @see #getMsgInterface()
	 * @generated
	 */
	EReference getMsgInterface_Connection();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.CompositeMsgInterface <em>Composite Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Msg Interface</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeMsgInterface
	 * @generated
	 */
	EClass getCompositeMsgInterface();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.CompositeMsgInterface#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeMsgInterface#getExposed()
	 * @see #getCompositeMsgInterface()
	 * @generated
	 */
	EReference getCompositeMsgInterface_Exposed();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgInterface <em>Node Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Msg Interface</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgInterface
	 * @generated
	 */
	EClass getNodeMsgInterface();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeMsgInterface#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgInterface#getTopicName()
	 * @see #getNodeMsgInterface()
	 * @generated
	 */
	EAttribute getNodeMsgInterface_TopicName();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.NodeProperty <em>Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Property</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeProperty
	 * @generated
	 */
	EClass getNodeProperty();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeProperty#getValue()
	 * @see #getNodeProperty()
	 * @generated
	 */
	EAttribute getNodeProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.unibg.robotics.roscomponentmodel.NodeProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.NodeProperty#getType()
	 * @see #getNodeProperty()
	 * @generated
	 */
	EAttribute getNodeProperty_Type();

	/**
	 * Returns the meta object for class '{@link it.unibg.robotics.roscomponentmodel.CompositeProperty <em>Composite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Property</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeProperty
	 * @generated
	 */
	EClass getCompositeProperty();

	/**
	 * Returns the meta object for the reference '{@link it.unibg.robotics.roscomponentmodel.CompositeProperty#getExposed <em>Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed</em>'.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeProperty#getExposed()
	 * @see #getCompositeProperty()
	 * @generated
	 */
	EReference getCompositeProperty_Exposed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	roscomponentmodelFactory getroscomponentmodelFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NODES = eINSTANCE.getPackage_Nodes();

		/**
		 * The meta object literal for the '<em><b>Msg Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MSG_PRODUCERS = eINSTANCE.getPackage_MsgProducers();

		/**
		 * The meta object literal for the '<em><b>Msg Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MSG_CONSUMERS = eINSTANCE.getPackage_MsgConsumers();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TOPICS = eINSTANCE.getPackage_Topics();

		/**
		 * The meta object literal for the '<em><b>Srv Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SRV_PRODUCERS = eINSTANCE.getPackage_SrvProducers();

		/**
		 * The meta object literal for the '<em><b>Srv Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SRV_CONSUMERS = eINSTANCE.getPackage_SrvConsumers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__WIRES = eINSTANCE.getPackage_Wires();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PROPERTIES = eINSTANCE.getPackage_Properties();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Msg Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MSG_PRODUCERS = eINSTANCE.getNode_MsgProducers();

		/**
		 * The meta object literal for the '<em><b>Msg Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MSG_CONSUMERS = eINSTANCE.getNode_MsgConsumers();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETERS = eINSTANCE.getNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Srv Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_PRODUCERS = eINSTANCE.getNode_SrvProducers();

		/**
		 * The meta object literal for the '<em><b>Srv Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SRV_CONSUMERS = eINSTANCE.getNode_SrvConsumers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl <em>Node Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgProducer()
		 * @generated
		 */
		EClass NODE_MSG_PRODUCER = eINSTANCE.getNodeMsgProducer();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl <em>Node Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgConsumer()
		 * @generated
		 */
		EClass NODE_MSG_CONSUMER = eINSTANCE.getNodeMsgConsumer();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl <em>Package Msg Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgProducer()
		 * @generated
		 */
		EClass PACKAGE_MSG_PRODUCER = eINSTANCE.getPackageMsgProducer();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl <em>Package Msg Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageMsgConsumer()
		 * @generated
		 */
		EClass PACKAGE_MSG_CONSUMER = eINSTANCE.getPackageMsgConsumer();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.TopicImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PropertyImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl <em>Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.SrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvProducer()
		 * @generated
		 */
		EClass SRV_PRODUCER = eINSTANCE.getSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_PRODUCER__NAME = eINSTANCE.getSrvProducer_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl <em>Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.SrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getSrvConsumer()
		 * @generated
		 */
		EClass SRV_CONSUMER = eINSTANCE.getSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_CONSUMER__NAME = eINSTANCE.getSrvConsumer_Name();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl <em>Package Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvProducer()
		 * @generated
		 */
		EClass PACKAGE_SRV_PRODUCER = eINSTANCE.getPackageSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SRV_PRODUCER__PROMOTE = eINSTANCE.getPackageSrvProducer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl <em>Node Srv Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvProducerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvProducer()
		 * @generated
		 */
		EClass NODE_SRV_PRODUCER = eINSTANCE.getNodeSrvProducer();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_PRODUCER__SRV_NAME = eINSTANCE.getNodeSrvProducer_SrvName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl <em>Package Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.PackageSrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getPackageSrvConsumer()
		 * @generated
		 */
		EClass PACKAGE_SRV_CONSUMER = eINSTANCE.getPackageSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SRV_CONSUMER__PROMOTE = eINSTANCE.getPackageSrvConsumer_Promote();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl <em>Node Srv Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeSrvConsumerImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeSrvConsumer()
		 * @generated
		 */
		EClass NODE_SRV_CONSUMER = eINSTANCE.getNodeSrvConsumer();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SRV_CONSUMER__SRV_NAME = eINSTANCE.getNodeSrvConsumer_SrvName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.WireImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__SOURCE = eINSTANCE.getWire_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__TARGET = eINSTANCE.getWire_Target();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.ArchitectureModelImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getArchitectureModel()
		 * @generated
		 */
		EClass ARCHITECTURE_MODEL = eINSTANCE.getArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_MODEL__PACKAGE = eINSTANCE.getArchitectureModel_Package();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.MsgInterfaceImpl <em>Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.MsgInterfaceImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getMsgInterface()
		 * @generated
		 */
		EClass MSG_INTERFACE = eINSTANCE.getMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_INTERFACE__NAME = eINSTANCE.getMsgInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_INTERFACE__CONNECTION = eINSTANCE.getMsgInterface_Connection();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.CompositeMsgInterfaceImpl <em>Composite Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.CompositeMsgInterfaceImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeMsgInterface()
		 * @generated
		 */
		EClass COMPOSITE_MSG_INTERFACE = eINSTANCE.getCompositeMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MSG_INTERFACE__EXPOSED = eINSTANCE.getCompositeMsgInterface_Exposed();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodeMsgInterfaceImpl <em>Node Msg Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodeMsgInterfaceImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeMsgInterface()
		 * @generated
		 */
		EClass NODE_MSG_INTERFACE = eINSTANCE.getNodeMsgInterface();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_MSG_INTERFACE__TOPIC_NAME = eINSTANCE.getNodeMsgInterface_TopicName();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.AbstractComponentImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.NodePropertyImpl <em>Node Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.NodePropertyImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getNodeProperty()
		 * @generated
		 */
		EClass NODE_PROPERTY = eINSTANCE.getNodeProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PROPERTY__VALUE = eINSTANCE.getNodeProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PROPERTY__TYPE = eINSTANCE.getNodeProperty_Type();

		/**
		 * The meta object literal for the '{@link it.unibg.robotics.roscomponentmodel.impl.CompositePropertyImpl <em>Composite Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibg.robotics.roscomponentmodel.impl.CompositePropertyImpl
		 * @see it.unibg.robotics.roscomponentmodel.impl.roscomponentmodelPackageImpl#getCompositeProperty()
		 * @generated
		 */
		EClass COMPOSITE_PROPERTY = eINSTANCE.getCompositeProperty();

		/**
		 * The meta object literal for the '<em><b>Exposed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROPERTY__EXPOSED = eINSTANCE.getCompositeProperty_Exposed();

	}

} //roscomponentmodelPackage