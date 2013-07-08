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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage
 * @generated
 */
public class roscomponentmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static roscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = roscomponentmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected roscomponentmodelSwitch<Adapter> modelSwitch =
		new roscomponentmodelSwitch<Adapter>() {
			@Override
			public Adapter casePackage(it.unibg.robotics.roscomponentmodel.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNodeMsgProducer(NodeMsgProducer object) {
				return createNodeMsgProducerAdapter();
			}
			@Override
			public Adapter caseNodeMsgConsumer(NodeMsgConsumer object) {
				return createNodeMsgConsumerAdapter();
			}
			@Override
			public Adapter casePackageMsgProducer(PackageMsgProducer object) {
				return createPackageMsgProducerAdapter();
			}
			@Override
			public Adapter casePackageMsgConsumer(PackageMsgConsumer object) {
				return createPackageMsgConsumerAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseSrvProducer(SrvProducer object) {
				return createSrvProducerAdapter();
			}
			@Override
			public Adapter caseSrvConsumer(SrvConsumer object) {
				return createSrvConsumerAdapter();
			}
			@Override
			public Adapter casePackageSrvProducer(PackageSrvProducer object) {
				return createPackageSrvProducerAdapter();
			}
			@Override
			public Adapter caseNodeSrvProducer(NodeSrvProducer object) {
				return createNodeSrvProducerAdapter();
			}
			@Override
			public Adapter casePackageSrvConsumer(PackageSrvConsumer object) {
				return createPackageSrvConsumerAdapter();
			}
			@Override
			public Adapter caseNodeSrvConsumer(NodeSrvConsumer object) {
				return createNodeSrvConsumerAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseArchitectureModel(ArchitectureModel object) {
				return createArchitectureModelAdapter();
			}
			@Override
			public Adapter caseMsgInterface(MsgInterface object) {
				return createMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseCompositeMsgInterface(CompositeMsgInterface object) {
				return createCompositeMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseNodeMsgInterface(NodeMsgInterface object) {
				return createNodeMsgInterfaceAdapter();
			}
			@Override
			public Adapter caseAbstractComponent(AbstractComponent object) {
				return createAbstractComponentAdapter();
			}
			@Override
			public Adapter caseNodeProperty(NodeProperty object) {
				return createNodePropertyAdapter();
			}
			@Override
			public Adapter caseCompositeProperty(CompositeProperty object) {
				return createCompositePropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgProducer <em>Node Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgProducer
	 * @generated
	 */
	public Adapter createNodeMsgProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgConsumer <em>Node Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgConsumer
	 * @generated
	 */
	public Adapter createNodeMsgConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgProducer <em>Package Msg Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgProducer
	 * @generated
	 */
	public Adapter createPackageMsgProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.PackageMsgConsumer <em>Package Msg Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.PackageMsgConsumer
	 * @generated
	 */
	public Adapter createPackageMsgConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.SrvProducer <em>Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.SrvProducer
	 * @generated
	 */
	public Adapter createSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.SrvConsumer <em>Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.SrvConsumer
	 * @generated
	 */
	public Adapter createSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvProducer <em>Package Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvProducer
	 * @generated
	 */
	public Adapter createPackageSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvProducer <em>Node Srv Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvProducer
	 * @generated
	 */
	public Adapter createNodeSrvProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.PackageSrvConsumer <em>Package Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.PackageSrvConsumer
	 * @generated
	 */
	public Adapter createPackageSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeSrvConsumer <em>Node Srv Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeSrvConsumer
	 * @generated
	 */
	public Adapter createNodeSrvConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.ArchitectureModel
	 * @generated
	 */
	public Adapter createArchitectureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.MsgInterface <em>Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.MsgInterface
	 * @generated
	 */
	public Adapter createMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.CompositeMsgInterface <em>Composite Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeMsgInterface
	 * @generated
	 */
	public Adapter createCompositeMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeMsgInterface <em>Node Msg Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeMsgInterface
	 * @generated
	 */
	public Adapter createNodeMsgInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.AbstractComponent
	 * @generated
	 */
	public Adapter createAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.NodeProperty <em>Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.NodeProperty
	 * @generated
	 */
	public Adapter createNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibg.robotics.roscomponentmodel.CompositeProperty <em>Composite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibg.robotics.roscomponentmodel.CompositeProperty
	 * @generated
	 */
	public Adapter createCompositePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //roscomponentmodelAdapterFactory