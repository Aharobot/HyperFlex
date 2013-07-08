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
package it.unibg.robotics.roscomponentmodel.util;

import it.unibg.robotics.roscomponentmodel.AbstractComponent;
import it.unibg.robotics.roscomponentmodel.ArchitectureModel;
import it.unibg.robotics.roscomponentmodel.CompositeMsgInterface;
import it.unibg.robotics.roscomponentmodel.CompositeProperty;
import it.unibg.robotics.roscomponentmodel.MsgInterface;
import it.unibg.robotics.roscomponentmodel.Node;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgInterface;
import it.unibg.robotics.roscomponentmodel.NodeMsgProducer;
import it.unibg.robotics.roscomponentmodel.NodeProperty;
import it.unibg.robotics.roscomponentmodel.NodeSrvConsumer;
import it.unibg.robotics.roscomponentmodel.NodeSrvProducer;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgProducer;
import it.unibg.robotics.roscomponentmodel.PackageSrvConsumer;
import it.unibg.robotics.roscomponentmodel.PackageSrvProducer;
import it.unibg.robotics.roscomponentmodel.Property;
import it.unibg.robotics.roscomponentmodel.SrvConsumer;
import it.unibg.robotics.roscomponentmodel.SrvProducer;
import it.unibg.robotics.roscomponentmodel.Topic;
import it.unibg.robotics.roscomponentmodel.Wire;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public class roscomponentmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = roscomponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case roscomponentmodelPackage.PACKAGE: {
				it.unibg.robotics.roscomponentmodel.Package package_ = (it.unibg.robotics.roscomponentmodel.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseAbstractComponent(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractComponent(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_PRODUCER: {
				NodeMsgProducer nodeMsgProducer = (NodeMsgProducer)theEObject;
				T result = caseNodeMsgProducer(nodeMsgProducer);
				if (result == null) result = caseNodeMsgInterface(nodeMsgProducer);
				if (result == null) result = caseMsgInterface(nodeMsgProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_CONSUMER: {
				NodeMsgConsumer nodeMsgConsumer = (NodeMsgConsumer)theEObject;
				T result = caseNodeMsgConsumer(nodeMsgConsumer);
				if (result == null) result = caseNodeMsgInterface(nodeMsgConsumer);
				if (result == null) result = caseMsgInterface(nodeMsgConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PACKAGE_MSG_PRODUCER: {
				PackageMsgProducer packageMsgProducer = (PackageMsgProducer)theEObject;
				T result = casePackageMsgProducer(packageMsgProducer);
				if (result == null) result = caseCompositeMsgInterface(packageMsgProducer);
				if (result == null) result = caseMsgInterface(packageMsgProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER: {
				PackageMsgConsumer packageMsgConsumer = (PackageMsgConsumer)theEObject;
				T result = casePackageMsgConsumer(packageMsgConsumer);
				if (result == null) result = caseCompositeMsgInterface(packageMsgConsumer);
				if (result == null) result = caseMsgInterface(packageMsgConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.SRV_PRODUCER: {
				SrvProducer srvProducer = (SrvProducer)theEObject;
				T result = caseSrvProducer(srvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.SRV_CONSUMER: {
				SrvConsumer srvConsumer = (SrvConsumer)theEObject;
				T result = caseSrvConsumer(srvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PACKAGE_SRV_PRODUCER: {
				PackageSrvProducer packageSrvProducer = (PackageSrvProducer)theEObject;
				T result = casePackageSrvProducer(packageSrvProducer);
				if (result == null) result = caseSrvProducer(packageSrvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_SRV_PRODUCER: {
				NodeSrvProducer nodeSrvProducer = (NodeSrvProducer)theEObject;
				T result = caseNodeSrvProducer(nodeSrvProducer);
				if (result == null) result = caseSrvProducer(nodeSrvProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.PACKAGE_SRV_CONSUMER: {
				PackageSrvConsumer packageSrvConsumer = (PackageSrvConsumer)theEObject;
				T result = casePackageSrvConsumer(packageSrvConsumer);
				if (result == null) result = caseSrvConsumer(packageSrvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_SRV_CONSUMER: {
				NodeSrvConsumer nodeSrvConsumer = (NodeSrvConsumer)theEObject;
				T result = caseNodeSrvConsumer(nodeSrvConsumer);
				if (result == null) result = caseSrvConsumer(nodeSrvConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.WIRE: {
				Wire wire = (Wire)theEObject;
				T result = caseWire(wire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.ARCHITECTURE_MODEL: {
				ArchitectureModel architectureModel = (ArchitectureModel)theEObject;
				T result = caseArchitectureModel(architectureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.MSG_INTERFACE: {
				MsgInterface msgInterface = (MsgInterface)theEObject;
				T result = caseMsgInterface(msgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_MSG_INTERFACE: {
				CompositeMsgInterface compositeMsgInterface = (CompositeMsgInterface)theEObject;
				T result = caseCompositeMsgInterface(compositeMsgInterface);
				if (result == null) result = caseMsgInterface(compositeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_MSG_INTERFACE: {
				NodeMsgInterface nodeMsgInterface = (NodeMsgInterface)theEObject;
				T result = caseNodeMsgInterface(nodeMsgInterface);
				if (result == null) result = caseMsgInterface(nodeMsgInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.ABSTRACT_COMPONENT: {
				AbstractComponent abstractComponent = (AbstractComponent)theEObject;
				T result = caseAbstractComponent(abstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.NODE_PROPERTY: {
				NodeProperty nodeProperty = (NodeProperty)theEObject;
				T result = caseNodeProperty(nodeProperty);
				if (result == null) result = caseProperty(nodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case roscomponentmodelPackage.COMPOSITE_PROPERTY: {
				CompositeProperty compositeProperty = (CompositeProperty)theEObject;
				T result = caseCompositeProperty(compositeProperty);
				if (result == null) result = caseProperty(compositeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(it.unibg.robotics.roscomponentmodel.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgProducer(NodeMsgProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgConsumer(NodeMsgConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Msg Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Msg Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMsgProducer(PackageMsgProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Msg Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Msg Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMsgConsumer(PackageMsgConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvProducer(SrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvConsumer(SrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageSrvProducer(PackageSrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvProducer(NodeSrvProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageSrvConsumer(PackageSrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Srv Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Srv Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSrvConsumer(NodeSrvConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWire(Wire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureModel(ArchitectureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgInterface(MsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMsgInterface(CompositeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Msg Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMsgInterface(NodeMsgInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponent(AbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeProperty(NodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeProperty(CompositeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //roscomponentmodelSwitch