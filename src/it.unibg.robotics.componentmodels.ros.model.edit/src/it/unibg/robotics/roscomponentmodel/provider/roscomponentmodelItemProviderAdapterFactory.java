/**
 * HyperFlex toolchain
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
package org.hyperflex.roscomponentmodel.provider;

import org.hyperflex.roscomponentmodel.util.roscomponentmodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class roscomponentmodelItemProviderAdapterFactory extends roscomponentmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roscomponentmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.Composite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeItemProvider compositeItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeAdapter() {
		if (compositeItemProvider == null) {
			compositeItemProvider = new CompositeItemProvider(this);
		}

		return compositeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeMsgProducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMsgProducerItemProvider nodeMsgProducerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeMsgProducerAdapter() {
		if (nodeMsgProducerItemProvider == null) {
			nodeMsgProducerItemProvider = new NodeMsgProducerItemProvider(this);
		}

		return nodeMsgProducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeMsgConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMsgConsumerItemProvider nodeMsgConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeMsgConsumerAdapter() {
		if (nodeMsgConsumerItemProvider == null) {
			nodeMsgConsumerItemProvider = new NodeMsgConsumerItemProvider(this);
		}

		return nodeMsgConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeMsgProducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMsgProducerItemProvider compositeMsgProducerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeMsgProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeMsgProducerAdapter() {
		if (compositeMsgProducerItemProvider == null) {
			compositeMsgProducerItemProvider = new CompositeMsgProducerItemProvider(this);
		}

		return compositeMsgProducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeMsgConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMsgConsumerItemProvider compositeMsgConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeMsgConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeMsgConsumerAdapter() {
		if (compositeMsgConsumerItemProvider == null) {
			compositeMsgConsumerItemProvider = new CompositeMsgConsumerItemProvider(this);
		}

		return compositeMsgConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.Topic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicItemProvider topicItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicAdapter() {
		if (topicItemProvider == null) {
			topicItemProvider = new TopicItemProvider(this);
		}

		return topicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.SrvProducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvProducerItemProvider srvProducerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.SrvProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSrvProducerAdapter() {
		if (srvProducerItemProvider == null) {
			srvProducerItemProvider = new SrvProducerItemProvider(this);
		}

		return srvProducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.SrvConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvConsumerItemProvider srvConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.SrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSrvConsumerAdapter() {
		if (srvConsumerItemProvider == null) {
			srvConsumerItemProvider = new SrvConsumerItemProvider(this);
		}

		return srvConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeSrvProducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvProducerItemProvider compositeSrvProducerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSrvProducerAdapter() {
		if (compositeSrvProducerItemProvider == null) {
			compositeSrvProducerItemProvider = new CompositeSrvProducerItemProvider(this);
		}

		return compositeSrvProducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeSrvProducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSrvProducerItemProvider nodeSrvProducerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeSrvProducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSrvProducerAdapter() {
		if (nodeSrvProducerItemProvider == null) {
			nodeSrvProducerItemProvider = new NodeSrvProducerItemProvider(this);
		}

		return nodeSrvProducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvConsumerItemProvider compositeSrvConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSrvConsumerAdapter() {
		if (compositeSrvConsumerItemProvider == null) {
			compositeSrvConsumerItemProvider = new CompositeSrvConsumerItemProvider(this);
		}

		return compositeSrvConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeSrvConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSrvConsumerItemProvider nodeSrvConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeSrvConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSrvConsumerAdapter() {
		if (nodeSrvConsumerItemProvider == null) {
			nodeSrvConsumerItemProvider = new NodeSrvConsumerItemProvider(this);
		}

		return nodeSrvConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.Wire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireItemProvider wireItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.Wire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWireAdapter() {
		if (wireItemProvider == null) {
			wireItemProvider = new WireItemProvider(this);
		}

		return wireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.MsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgInterfaceItemProvider msgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.MsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMsgInterfaceAdapter() {
		if (msgInterfaceItemProvider == null) {
			msgInterfaceItemProvider = new MsgInterfaceItemProvider(this);
		}

		return msgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeMsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMsgInterfaceItemProvider compositeMsgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeMsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeMsgInterfaceAdapter() {
		if (compositeMsgInterfaceItemProvider == null) {
			compositeMsgInterfaceItemProvider = new CompositeMsgInterfaceItemProvider(this);
		}

		return compositeMsgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeMsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMsgInterfaceItemProvider nodeMsgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeMsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeMsgInterfaceAdapter() {
		if (nodeMsgInterfaceItemProvider == null) {
			nodeMsgInterfaceItemProvider = new NodeMsgInterfaceItemProvider(this);
		}

		return nodeMsgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.NodeProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodePropertyItemProvider nodePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.NodeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodePropertyAdapter() {
		if (nodePropertyItemProvider == null) {
			nodePropertyItemProvider = new NodePropertyItemProvider(this);
		}

		return nodePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.roscomponentmodel.CompositeProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePropertyItemProvider compositePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.roscomponentmodel.CompositeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositePropertyAdapter() {
		if (compositePropertyItemProvider == null) {
			compositePropertyItemProvider = new CompositePropertyItemProvider(this);
		}

		return compositePropertyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (compositeItemProvider != null) compositeItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (nodeMsgProducerItemProvider != null) nodeMsgProducerItemProvider.dispose();
		if (nodeMsgConsumerItemProvider != null) nodeMsgConsumerItemProvider.dispose();
		if (compositeMsgProducerItemProvider != null) compositeMsgProducerItemProvider.dispose();
		if (compositeMsgConsumerItemProvider != null) compositeMsgConsumerItemProvider.dispose();
		if (topicItemProvider != null) topicItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (srvProducerItemProvider != null) srvProducerItemProvider.dispose();
		if (srvConsumerItemProvider != null) srvConsumerItemProvider.dispose();
		if (compositeSrvProducerItemProvider != null) compositeSrvProducerItemProvider.dispose();
		if (nodeSrvProducerItemProvider != null) nodeSrvProducerItemProvider.dispose();
		if (compositeSrvConsumerItemProvider != null) compositeSrvConsumerItemProvider.dispose();
		if (nodeSrvConsumerItemProvider != null) nodeSrvConsumerItemProvider.dispose();
		if (wireItemProvider != null) wireItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (msgInterfaceItemProvider != null) msgInterfaceItemProvider.dispose();
		if (compositeMsgInterfaceItemProvider != null) compositeMsgInterfaceItemProvider.dispose();
		if (nodeMsgInterfaceItemProvider != null) nodeMsgInterfaceItemProvider.dispose();
		if (nodePropertyItemProvider != null) nodePropertyItemProvider.dispose();
		if (compositePropertyItemProvider != null) compositePropertyItemProvider.dispose();
	}

}
