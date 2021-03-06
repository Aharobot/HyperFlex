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
package org.hyperflex.orocoscomponentmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface orocoscomponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orocoscomponentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hyperflex.org/componentmodels.orocos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orocoscomponentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	orocoscomponentmodelPackage eINSTANCE = org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.AbstractComponentImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompositeImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__INPUT_PORTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OUTPUT_PORTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONNECTION_POLICIES = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OPERATIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation Callers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OPERATION_CALLERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Peers Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PEERS_CONNECTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROPERTIES = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TaskContextImpl <em>Task Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TaskContextImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTaskContext()
	 * @generated
	 */
	int TASK_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__INPUT_PORTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__OUTPUT_PORTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__PROPERTIES = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__OPERATIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation Callers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__OPERATION_CALLERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__NAMESPACE = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__CLASS_NAME = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__PERIOD = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__PRIORITY = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Auto Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__AUTO_START = ABSTRACT_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auto Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT__AUTO_CONF = ABSTRACT_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONTEXT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.DataPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.InputDataPortImpl <em>Input Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.InputDataPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getInputDataPort()
	 * @generated
	 */
	int INPUT_DATA_PORT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_PORT__NAME = DATA_PORT__NAME;

	/**
	 * The number of structural features of the '<em>Input Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_PORT_FEATURE_COUNT = DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCInputDataPortImpl <em>TC Input Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TCInputDataPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCInputDataPort()
	 * @generated
	 */
	int TC_INPUT_DATA_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_INPUT_DATA_PORT__NAME = INPUT_DATA_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Event Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_INPUT_DATA_PORT__EVENT_PORT = INPUT_DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TC Input Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_INPUT_DATA_PORT_FEATURE_COUNT = INPUT_DATA_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.OutputDataPortImpl <em>Output Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.OutputDataPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOutputDataPort()
	 * @generated
	 */
	int OUTPUT_DATA_PORT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_PORT__NAME = DATA_PORT__NAME;

	/**
	 * The number of structural features of the '<em>Output Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_PORT_FEATURE_COUNT = DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOutputDataPortImpl <em>TC Output Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TCOutputDataPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOutputDataPort()
	 * @generated
	 */
	int TC_OUTPUT_DATA_PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OUTPUT_DATA_PORT__NAME = OUTPUT_DATA_PORT__NAME;

	/**
	 * The number of structural features of the '<em>TC Output Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OUTPUT_DATA_PORT_FEATURE_COUNT = OUTPUT_DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompInputPortImpl <em>Comp Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompInputPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompInputPort()
	 * @generated
	 */
	int COMP_INPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INPUT_PORT__NAME = INPUT_DATA_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INPUT_PORT__EXPOSED_PORT = INPUT_DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INPUT_PORT_FEATURE_COUNT = INPUT_DATA_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOutputPortImpl <em>Comp Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompOutputPortImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOutputPort()
	 * @generated
	 */
	int COMP_OUTPUT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OUTPUT_PORT__NAME = OUTPUT_DATA_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OUTPUT_PORT__EXPOSED_PORT = OUTPUT_DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OUTPUT_PORT_FEATURE_COUNT = OUTPUT_DATA_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.ConnectionPolicyImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionPolicy()
	 * @generated
	 */
	int CONNECTION_POLICY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Lock Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__LOCK_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__BUFFER_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__TRANSPORT = 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY__NOTE = 7;

	/**
	 * The number of structural features of the '<em>Connection Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POLICY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.PropertyImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getProperty()
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
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.OperationImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.OperationCallerImpl <em>Operation Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.OperationCallerImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOperationCaller()
	 * @generated
	 */
	int OPERATION_CALLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationImpl <em>Comp Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompOperationImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOperation()
	 * @generated
	 */
	int COMP_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION__EXPOSED_OP = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOperationImpl <em>TC Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TCOperationImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOperation()
	 * @generated
	 */
	int TC_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION__SRV_NAME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Own Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION__OWN_THREAD = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TC Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationCallerImpl <em>Comp Operation Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompOperationCallerImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOperationCaller()
	 * @generated
	 */
	int COMP_OPERATION_CALLER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION_CALLER__NAME = OPERATION_CALLER__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Op Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION_CALLER__EXPOSED_OP_CALLER = OPERATION_CALLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Operation Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_OPERATION_CALLER_FEATURE_COUNT = OPERATION_CALLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOperationCallerImpl <em>TC Operation Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TCOperationCallerImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOperationCaller()
	 * @generated
	 */
	int TC_OPERATION_CALLER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION_CALLER__NAME = OPERATION_CALLER__NAME;

	/**
	 * The feature id for the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION_CALLER__SRV_NAME = OPERATION_CALLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TC Operation Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_OPERATION_CALLER_FEATURE_COUNT = OPERATION_CALLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.PeersConnectionImpl <em>Peers Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.PeersConnectionImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getPeersConnection()
	 * @generated
	 */
	int PEERS_CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEERS_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEERS_CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEERS_CONNECTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Peers Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEERS_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.SystemImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPOSITE = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCPropertyImpl <em>TC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.TCPropertyImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCProperty()
	 * @generated
	 */
	int TC_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompPropertyImpl <em>Comp Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.impl.CompPropertyImpl
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompProperty()
	 * @generated
	 */
	int COMP_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_PROPERTY__EXPOSED_PROPERTY = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionType
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.ConnectionTransport <em>Connection Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionTransport
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionTransport()
	 * @generated
	 */
	int CONNECTION_TRANSPORT = 23;

	/**
	 * The meta object id for the '{@link org.hyperflex.orocoscomponentmodel.LockPolicy <em>Lock Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hyperflex.orocoscomponentmodel.LockPolicy
	 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getLockPolicy()
	 * @generated
	 */
	int LOCK_POLICY = 24;


	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getComponents()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getInputPorts()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getOutputPorts()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_OutputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getConnectionPolicies <em>Connection Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Policies</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getConnectionPolicies()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ConnectionPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getOperations()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getOperationCallers <em>Operation Callers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Callers</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getOperationCallers()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_OperationCallers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getPeersConnections <em>Peers Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peers Connections</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getPeersConnections()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_PeersConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.Composite#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Composite#getProperties()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Properties();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TaskContext <em>Task Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Context</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext
	 * @generated
	 */
	EClass getTaskContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getInputPorts()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getOutputPorts()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_OutputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getProperties()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getOperations()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getOperationCallers <em>Operation Callers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Callers</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getOperationCallers()
	 * @see #getTaskContext()
	 * @generated
	 */
	EReference getTaskContext_OperationCallers();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getNamespace()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getClassName()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getPeriod()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#getPriority()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#isAutoStart <em>Auto Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Start</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#isAutoStart()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_AutoStart();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TaskContext#isAutoConf <em>Auto Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Conf</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TaskContext#isAutoConf()
	 * @see #getTaskContext()
	 * @generated
	 */
	EAttribute getTaskContext_AutoConf();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TCInputDataPort <em>TC Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Input Data Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCInputDataPort
	 * @generated
	 */
	EClass getTCInputDataPort();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCInputDataPort#isEventPort <em>Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCInputDataPort#isEventPort()
	 * @see #getTCInputDataPort()
	 * @generated
	 */
	EAttribute getTCInputDataPort_EventPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TCOutputDataPort <em>TC Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Output Data Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOutputDataPort
	 * @generated
	 */
	EClass getTCOutputDataPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.CompInputPort <em>Comp Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Input Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompInputPort
	 * @generated
	 */
	EClass getCompInputPort();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.CompInputPort#getExposedPort <em>Exposed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompInputPort#getExposedPort()
	 * @see #getCompInputPort()
	 * @generated
	 */
	EReference getCompInputPort_ExposedPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.CompOutputPort <em>Comp Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Output Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOutputPort
	 * @generated
	 */
	EClass getCompOutputPort();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.CompOutputPort#getExposedPort <em>Exposed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOutputPort#getExposedPort()
	 * @see #getCompOutputPort()
	 * @generated
	 */
	EReference getCompOutputPort_ExposedPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy <em>Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Policy</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy
	 * @generated
	 */
	EClass getConnectionPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getName()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Name();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getSource()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_Source();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getTarget()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EReference getConnectionPolicy_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getType()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Policy</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getLockPolicy()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_LockPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getBufferSize()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getTransport()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Transport();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionPolicy#getNote()
	 * @see #getConnectionPolicy()
	 * @generated
	 */
	EAttribute getConnectionPolicy_Note();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.OperationCaller <em>Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Caller</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.OperationCaller
	 * @generated
	 */
	EClass getOperationCaller();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.OperationCaller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.OperationCaller#getName()
	 * @see #getOperationCaller()
	 * @generated
	 */
	EAttribute getOperationCaller_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.CompOperation <em>Comp Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Operation</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperation
	 * @generated
	 */
	EClass getCompOperation();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.CompOperation#getExposedOp <em>Exposed Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed Op</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperation#getExposedOp()
	 * @see #getCompOperation()
	 * @generated
	 */
	EReference getCompOperation_ExposedOp();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TCOperation <em>TC Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Operation</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperation
	 * @generated
	 */
	EClass getTCOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCOperation#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperation#getSrvName()
	 * @see #getTCOperation()
	 * @generated
	 */
	EAttribute getTCOperation_SrvName();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCOperation#isOwnThread <em>Own Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Own Thread</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperation#isOwnThread()
	 * @see #getTCOperation()
	 * @generated
	 */
	EAttribute getTCOperation_OwnThread();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.CompOperationCaller <em>Comp Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Operation Caller</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperationCaller
	 * @generated
	 */
	EClass getCompOperationCaller();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.CompOperationCaller#getExposedOpCaller <em>Exposed Op Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed Op Caller</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompOperationCaller#getExposedOpCaller()
	 * @see #getCompOperationCaller()
	 * @generated
	 */
	EReference getCompOperationCaller_ExposedOpCaller();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TCOperationCaller <em>TC Operation Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Operation Caller</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperationCaller
	 * @generated
	 */
	EClass getTCOperationCaller();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCOperationCaller#getSrvName <em>Srv Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srv Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCOperationCaller#getSrvName()
	 * @see #getTCOperationCaller()
	 * @generated
	 */
	EAttribute getTCOperationCaller_SrvName();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.PeersConnection <em>Peers Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peers Connection</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.PeersConnection
	 * @generated
	 */
	EClass getPeersConnection();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.PeersConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.PeersConnection#getSource()
	 * @see #getPeersConnection()
	 * @generated
	 */
	EReference getPeersConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.PeersConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.PeersConnection#getTarget()
	 * @see #getPeersConnection()
	 * @generated
	 */
	EReference getPeersConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.PeersConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.PeersConnection#getName()
	 * @see #getPeersConnection()
	 * @generated
	 */
	EAttribute getPeersConnection_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hyperflex.orocoscomponentmodel.System#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.System#getComposite()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Composite();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.DataPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.DataPort#getName()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.InputDataPort <em>Input Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.InputDataPort
	 * @generated
	 */
	EClass getInputDataPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.OutputDataPort <em>Output Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data Port</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.OutputDataPort
	 * @generated
	 */
	EClass getOutputDataPort();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.AbstractComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.AbstractComponent#getName()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.TCProperty <em>TC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TC Property</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCProperty
	 * @generated
	 */
	EClass getTCProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCProperty#getValue()
	 * @see #getTCProperty()
	 * @generated
	 */
	EAttribute getTCProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hyperflex.orocoscomponentmodel.TCProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.TCProperty#getType()
	 * @see #getTCProperty()
	 * @generated
	 */
	EAttribute getTCProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.hyperflex.orocoscomponentmodel.CompProperty <em>Comp Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Property</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompProperty
	 * @generated
	 */
	EClass getCompProperty();

	/**
	 * Returns the meta object for the reference '{@link org.hyperflex.orocoscomponentmodel.CompProperty#getExposedProperty <em>Exposed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exposed Property</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.CompProperty#getExposedProperty()
	 * @see #getCompProperty()
	 * @generated
	 */
	EReference getCompProperty_ExposedProperty();

	/**
	 * Returns the meta object for enum '{@link org.hyperflex.orocoscomponentmodel.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link org.hyperflex.orocoscomponentmodel.ConnectionTransport <em>Connection Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Transport</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.ConnectionTransport
	 * @generated
	 */
	EEnum getConnectionTransport();

	/**
	 * Returns the meta object for enum '{@link org.hyperflex.orocoscomponentmodel.LockPolicy <em>Lock Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Policy</em>'.
	 * @see org.hyperflex.orocoscomponentmodel.LockPolicy
	 * @generated
	 */
	EEnum getLockPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	orocoscomponentmodelFactory getorocoscomponentmodelFactory();

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
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompositeImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPONENTS = eINSTANCE.getComposite_Components();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__INPUT_PORTS = eINSTANCE.getComposite_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__OUTPUT_PORTS = eINSTANCE.getComposite_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Connection Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__CONNECTION_POLICIES = eINSTANCE.getComposite_ConnectionPolicies();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__OPERATIONS = eINSTANCE.getComposite_Operations();

		/**
		 * The meta object literal for the '<em><b>Operation Callers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__OPERATION_CALLERS = eINSTANCE.getComposite_OperationCallers();

		/**
		 * The meta object literal for the '<em><b>Peers Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PEERS_CONNECTIONS = eINSTANCE.getComposite_PeersConnections();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PROPERTIES = eINSTANCE.getComposite_Properties();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TaskContextImpl <em>Task Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TaskContextImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTaskContext()
		 * @generated
		 */
		EClass TASK_CONTEXT = eINSTANCE.getTaskContext();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__INPUT_PORTS = eINSTANCE.getTaskContext_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OUTPUT_PORTS = eINSTANCE.getTaskContext_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__PROPERTIES = eINSTANCE.getTaskContext_Properties();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OPERATIONS = eINSTANCE.getTaskContext_Operations();

		/**
		 * The meta object literal for the '<em><b>Operation Callers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONTEXT__OPERATION_CALLERS = eINSTANCE.getTaskContext_OperationCallers();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__NAMESPACE = eINSTANCE.getTaskContext_Namespace();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__CLASS_NAME = eINSTANCE.getTaskContext_ClassName();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__PERIOD = eINSTANCE.getTaskContext_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__PRIORITY = eINSTANCE.getTaskContext_Priority();

		/**
		 * The meta object literal for the '<em><b>Auto Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__AUTO_START = eINSTANCE.getTaskContext_AutoStart();

		/**
		 * The meta object literal for the '<em><b>Auto Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONTEXT__AUTO_CONF = eINSTANCE.getTaskContext_AutoConf();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCInputDataPortImpl <em>TC Input Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TCInputDataPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCInputDataPort()
		 * @generated
		 */
		EClass TC_INPUT_DATA_PORT = eINSTANCE.getTCInputDataPort();

		/**
		 * The meta object literal for the '<em><b>Event Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_INPUT_DATA_PORT__EVENT_PORT = eINSTANCE.getTCInputDataPort_EventPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOutputDataPortImpl <em>TC Output Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TCOutputDataPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOutputDataPort()
		 * @generated
		 */
		EClass TC_OUTPUT_DATA_PORT = eINSTANCE.getTCOutputDataPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompInputPortImpl <em>Comp Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompInputPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompInputPort()
		 * @generated
		 */
		EClass COMP_INPUT_PORT = eINSTANCE.getCompInputPort();

		/**
		 * The meta object literal for the '<em><b>Exposed Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INPUT_PORT__EXPOSED_PORT = eINSTANCE.getCompInputPort_ExposedPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOutputPortImpl <em>Comp Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompOutputPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOutputPort()
		 * @generated
		 */
		EClass COMP_OUTPUT_PORT = eINSTANCE.getCompOutputPort();

		/**
		 * The meta object literal for the '<em><b>Exposed Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_OUTPUT_PORT__EXPOSED_PORT = eINSTANCE.getCompOutputPort_ExposedPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.ConnectionPolicyImpl <em>Connection Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.ConnectionPolicyImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionPolicy()
		 * @generated
		 */
		EClass CONNECTION_POLICY = eINSTANCE.getConnectionPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__NAME = eINSTANCE.getConnectionPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__SOURCE = eINSTANCE.getConnectionPolicy_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POLICY__TARGET = eINSTANCE.getConnectionPolicy_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__TYPE = eINSTANCE.getConnectionPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__LOCK_POLICY = eINSTANCE.getConnectionPolicy_LockPolicy();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__BUFFER_SIZE = eINSTANCE.getConnectionPolicy_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__TRANSPORT = eINSTANCE.getConnectionPolicy_Transport();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POLICY__NOTE = eINSTANCE.getConnectionPolicy_Note();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.PropertyImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.OperationImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.OperationCallerImpl <em>Operation Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.OperationCallerImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOperationCaller()
		 * @generated
		 */
		EClass OPERATION_CALLER = eINSTANCE.getOperationCaller();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALLER__NAME = eINSTANCE.getOperationCaller_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationImpl <em>Comp Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompOperationImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOperation()
		 * @generated
		 */
		EClass COMP_OPERATION = eINSTANCE.getCompOperation();

		/**
		 * The meta object literal for the '<em><b>Exposed Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_OPERATION__EXPOSED_OP = eINSTANCE.getCompOperation_ExposedOp();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOperationImpl <em>TC Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TCOperationImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOperation()
		 * @generated
		 */
		EClass TC_OPERATION = eINSTANCE.getTCOperation();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_OPERATION__SRV_NAME = eINSTANCE.getTCOperation_SrvName();

		/**
		 * The meta object literal for the '<em><b>Own Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_OPERATION__OWN_THREAD = eINSTANCE.getTCOperation_OwnThread();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompOperationCallerImpl <em>Comp Operation Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompOperationCallerImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompOperationCaller()
		 * @generated
		 */
		EClass COMP_OPERATION_CALLER = eINSTANCE.getCompOperationCaller();

		/**
		 * The meta object literal for the '<em><b>Exposed Op Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_OPERATION_CALLER__EXPOSED_OP_CALLER = eINSTANCE.getCompOperationCaller_ExposedOpCaller();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCOperationCallerImpl <em>TC Operation Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TCOperationCallerImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCOperationCaller()
		 * @generated
		 */
		EClass TC_OPERATION_CALLER = eINSTANCE.getTCOperationCaller();

		/**
		 * The meta object literal for the '<em><b>Srv Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_OPERATION_CALLER__SRV_NAME = eINSTANCE.getTCOperationCaller_SrvName();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.PeersConnectionImpl <em>Peers Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.PeersConnectionImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getPeersConnection()
		 * @generated
		 */
		EClass PEERS_CONNECTION = eINSTANCE.getPeersConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEERS_CONNECTION__SOURCE = eINSTANCE.getPeersConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEERS_CONNECTION__TARGET = eINSTANCE.getPeersConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEERS_CONNECTION__NAME = eINSTANCE.getPeersConnection_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.SystemImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPOSITE = eINSTANCE.getSystem_Composite();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.DataPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__NAME = eINSTANCE.getDataPort_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.InputDataPortImpl <em>Input Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.InputDataPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getInputDataPort()
		 * @generated
		 */
		EClass INPUT_DATA_PORT = eINSTANCE.getInputDataPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.OutputDataPortImpl <em>Output Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.OutputDataPortImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getOutputDataPort()
		 * @generated
		 */
		EClass OUTPUT_DATA_PORT = eINSTANCE.getOutputDataPort();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.AbstractComponentImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__NAME = eINSTANCE.getAbstractComponent_Name();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.TCPropertyImpl <em>TC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.TCPropertyImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getTCProperty()
		 * @generated
		 */
		EClass TC_PROPERTY = eINSTANCE.getTCProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_PROPERTY__VALUE = eINSTANCE.getTCProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_PROPERTY__TYPE = eINSTANCE.getTCProperty_Type();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.impl.CompPropertyImpl <em>Comp Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.impl.CompPropertyImpl
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getCompProperty()
		 * @generated
		 */
		EClass COMP_PROPERTY = eINSTANCE.getCompProperty();

		/**
		 * The meta object literal for the '<em><b>Exposed Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_PROPERTY__EXPOSED_PROPERTY = eINSTANCE.getCompProperty_ExposedProperty();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.ConnectionType
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.ConnectionTransport <em>Connection Transport</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.ConnectionTransport
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getConnectionTransport()
		 * @generated
		 */
		EEnum CONNECTION_TRANSPORT = eINSTANCE.getConnectionTransport();

		/**
		 * The meta object literal for the '{@link org.hyperflex.orocoscomponentmodel.LockPolicy <em>Lock Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hyperflex.orocoscomponentmodel.LockPolicy
		 * @see org.hyperflex.orocoscomponentmodel.impl.orocoscomponentmodelPackageImpl#getLockPolicy()
		 * @generated
		 */
		EEnum LOCK_POLICY = eINSTANCE.getLockPolicy();

	}

} //orocoscomponentmodelPackage
