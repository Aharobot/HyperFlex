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
package it.unibg.robotics.resolutionmodel.ros.commands.resolution.handlers;

import it.unibg.robotics.featuremodels.Feature;
import it.unibg.robotics.featuremodels.FeatureModel;
import it.unibg.robotics.featuremodels.Instance;
import it.unibg.robotics.featuremodels.featuremodelsPackage;
import it.unibg.robotics.resolutionmodel.RMAbstractTransformation;
import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.ResolutionModel;
import it.unibg.robotics.resolutionmodel.presentation.resolutionmodelEditor;
import it.unibg.robotics.resolutionmodel.ros.ROSAbstractConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSActionConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSNewActionConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSNewServiceConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSNewTopicConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodel.ros.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodel.ros.ROSServiceConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSTopicConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSTransfConnection;
import it.unibg.robotics.resolutionmodel.ros.ROSTransfImplementation;
import it.unibg.robotics.resolutionmodel.ros.ROSTransfProperty;
import it.unibg.robotics.resolutionmodel.ros.impl.rosFactoryImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.ros.model.ros.Action;
import org.ros.model.ros.ActionClient;
import org.ros.model.ros.ActionServer;
import org.ros.model.ros.Architecture;
import org.ros.model.ros.Node;
import org.ros.model.ros.Package;
import org.ros.model.ros.Parameter;
import org.ros.model.ros.Publisher;
import org.ros.model.ros.Service;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;
import org.ros.model.ros.Subscriber;
import org.ros.model.ros.Topic;
import org.ros.model.ros.diagram.edit.parts.ArchitectureEditPart;
import org.ros.model.ros.diagram.part.RosDiagramEditor;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;
import org.ros.model.ros.impl.RosFactoryImpl;
import org.ros.model.smach.SMACHStateMachine;



/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ROSResolutionHandler extends AbstractHandler {

	private Hashtable<Package, Package> packageHashTable;
	private Hashtable<Publisher, Publisher> publisherHashTable;
	private Hashtable<Subscriber, Subscriber> subscriberHashTable;
	private Hashtable<Topic, Topic> topicHashTable;
	private Hashtable<ServiceServer, ServiceServer> serviceServerHashTable;
	private Hashtable<ServiceClient, ServiceClient> serviceClientHashTable;
	private Hashtable<Service, Service> serviceHashTable;
	private Hashtable<ActionServer, ActionServer> actionServerHashTable;
	private Hashtable<ActionClient, ActionClient> actionClientHashTable;
	private Hashtable<Action, Action> actionHashTable;
	private Hashtable<Node, Node> nodeHashTable;
	private Hashtable<Parameter, Parameter> parameterHashTable;
	private Hashtable<ROSTopicConnection, ROSTopicConnection> topicConnectionHashTable;
	private Hashtable<ROSServiceConnection, ROSServiceConnection> serviceConnectionHashTable;
	private Hashtable<ROSActionConnection, ROSActionConnection> actionConnectionHashTable;
	private Hashtable<SMACHStateMachine, SMACHStateMachine> stateMachineHashTable;

	private Architecture targetRosModel = null;
	private Architecture sourceRosModel = null;
	private FeatureModel sourceFeatureModel = null;
	private ResolutionModel resolutionModel = null;

	/*
	 * We don't use treeSet because there is a problem due to the fact that TaskContext
	 * doesn't implement comparable
	 */
	private ArrayList<Node> requiredComponents;
	private ArrayList<ROSTopicConnection> requiredTopicConnections;
	private ArrayList<ROSServiceConnection> requiredServiceConnections;
	private ArrayList<ROSActionConnection> requiredActionConnections;


	/**
	 * The constructor.
	 */
	public ROSResolutionHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		resolutionmodelEditor resolutionModelEditor = null;

		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);


		if(activeEditor instanceof resolutionmodelEditor){

			resolutionModelEditor = (resolutionmodelEditor)activeEditor;
			StructuredSelection structSelect = (StructuredSelection)resolutionModelEditor.getSite().getSelectionProvider().getSelection();

			if(structSelect.getFirstElement() instanceof ResolutionModel){

				resolutionModel = (ResolutionModel)structSelect.getFirstElement();

				sourceFeatureModel = getSourceFeatureModel();

				sourceRosModel =  getSourceRosModel();
				if(sourceRosModel == null){
					MessageDialog.openError(null, "Error", 
							"It wasn't possible to find the Template System Model!!!");
					return null;
				}

				cloneRosArchitecture(sourceRosModel);

				/* 
				 * Creating a copy is not enough
				 * We have to fill the hashtables
				 */ 
				//				targetOrocosModel = EcoreUtil.copy(sourceRttModel);


				Instance instance;

				if(sourceFeatureModel.getInstances().size() < 1){
					MessageDialog.openWarning(null, "Warning", 
							"You have to create at least an instance!!!");
					return null;
				}

				ElementListSelectionDialog instanceDialog = 
						new ElementListSelectionDialog(
								PlatformUI.getWorkbench().getDisplay().getActiveShell(), new LabelProvider());
				instanceDialog.setTitle("Instance Selection");
				instanceDialog.setMessage("Select the desired instance");
				instanceDialog.setElements(sourceFeatureModel.getInstances().toArray());
				if(instanceDialog.open() != Window.OK){
					return null;
				}
				instance = (Instance)instanceDialog.getResult()[0];

				doTransformation(instance);

				// Create a resource set to hold the resources.
				ResourceSet resourceSet = new ResourceSetImpl();

				// Register the appropriate resource factory to handle all file extensions.
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				(Resource.Factory.Registry.DEFAULT_EXTENSION, 
						new XMIResourceFactoryImpl());

				// Register the package to ensure it is available during loading.
				resourceSet.getPackageRegistry().put(featuremodelsPackage.eNS_URI, featuremodelsPackage.eINSTANCE);

				// If there are no arguments, emit an appropriate usage message.
				try {

					IEditorInput editorPart = activeEditor.getEditorInput();
					IFileEditorInput fileEditorInput = null;

					String modelfilePath = "";
					String diagramfilePath = "";
					if(editorPart instanceof IFileEditorInput){
						fileEditorInput = (IFileEditorInput)editorPart;
					}
					IProject currentProject = fileEditorInput.getFile().getProject();

					String tmp = fileEditorInput.getFile().getLocation().toOSString();
					//tmp = tmp.substring(0,modelfilePath.lastIndexOf('/')+1) + instance.getId();
					modelfilePath = tmp + "-configured.ros_system";
					diagramfilePath = tmp + "-configured.ros_system_diagram";
					IPath modelLocation = new Path(modelfilePath);
					IFile modelfile = currentProject.getFile(modelLocation.lastSegment());
					if(modelfile.exists()){
						FileDialog fileDialog = new FileDialog(new Shell(), SWT.SAVE);
						fileDialog.setFilterNames(new String[]{"RTT","All files"});
						fileDialog.setFilterExtensions(new String[]{"*.rtt","*.*"});
						modelfilePath = fileDialog.open();
						if(modelfilePath == null){
							return null;
						}
						diagramfilePath = modelfilePath + "_diagram";
						modelLocation = new Path(modelfilePath);
						modelfile = currentProject.getFile(modelLocation.lastSegment());
					}
					URI modelURI = URI.createFileURI(modelLocation.toOSString());
					Resource modelResource = resourceSet.createResource(modelURI);

					IPath diagramLocation = new Path(diagramfilePath);
					IFile diagramFile = currentProject.getFile(diagramLocation.lastSegment());
					URI diagramURI = URI.createFileURI(diagramLocation.toString());
					Resource diagramResource = resourceSet.createResource(diagramURI);

					// create the new model and save it
					modelResource.getContents().add(targetRosModel);

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					modelResource.save(baos, null);

					ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
					modelfile.create(bais, false, null);
					baos.close();
					bais.close();

					// create the new diagram and save it
					Diagram diagram = ViewService.createDiagram(targetRosModel,
							ArchitectureEditPart.MODEL_ID,
							RosDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					if (diagram != null) {
						diagramResource.getContents().add(diagram);
						diagram.setName(modelLocation.lastSegment());
						diagram.setElement(targetRosModel);
					}

					//						diagramResource.save(RttDiagramEditorUtil.getSaveOptions());
					baos = new ByteArrayOutputStream();
					diagramResource.save(baos, null);
					bais = new ByteArrayInputStream(baos.toByteArray());
					diagramFile.create(bais, false, null);
					baos.close();
					bais.close();

					//				RttDiagramEditorUtil.openDiagram(diagramResource);

					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					page.openEditor(new FileEditorInput(diagramFile), RosDiagramEditor.ID);


				}
				catch (IOException exception) {
					exception.printStackTrace();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		//		MessageDialog.openInformation(
		//				window.getShell(),
		//				"New Model",
		//				"File Saved");
		return null;
	}


	private void doTransformation(Instance featureModelInstance){

		requiredComponents = new ArrayList<Node>();
		requiredTopicConnections = new ArrayList<ROSTopicConnection>();
		requiredServiceConnections = new ArrayList<ROSServiceConnection>();
		requiredActionConnections = new ArrayList<ROSActionConnection>();

		//connectionHashTable = new Hashtable<ROSAbstractConnection, ROSAbstractConnection>();
		topicConnectionHashTable = new Hashtable<ROSTopicConnection, ROSTopicConnection>();
		serviceConnectionHashTable = new Hashtable<ROSServiceConnection, ROSServiceConnection>();
		actionClientHashTable = new Hashtable<ActionClient, ActionClient>();



		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			if(! featureModelInstance.getSelectedFeatures().contains(currentResElem.getFeature())){

				// The feature associated to the resolution element is not selected
				continue;

			}

			if(currentResElem.getRequiredComponents() != null){ 
				if(currentResElem.getRequiredComponents() instanceof ROSRequiredComponents){
					ROSRequiredComponents requiredTaskContextsTmp = (ROSRequiredComponents)currentResElem.getRequiredComponents();
					for(Node node : requiredTaskContextsTmp.getROSNodes()){
						if(! requiredComponents.contains(node)){
							requiredComponents.add(nodeHashTable.get(node));
						}
					}
				}else{
					MessageDialog.openError(null, "Error", 
							"The ROS resolution element " + currentResElem.getName() + 
							" contains a " + currentResElem.getRequiredComponents().getClass()
							+ "instance!!!");
					return;
				}
			}

			if(currentResElem.getRequiredConnections() != null){
				if(currentResElem.getRequiredConnections() instanceof ROSRequiredConnections){
					ROSRequiredConnections requiredConnectionsTmp = (ROSRequiredConnections)currentResElem.getRequiredConnections();
					for(ROSTopicConnection conn : requiredConnectionsTmp.getRequiredTopicConnections()){
						if(! requiredTopicConnections.contains(conn)){
							requiredTopicConnections.add(topicConnectionHashTable.get(conn));
						}
					}
					for(ROSServiceConnection conn : requiredConnectionsTmp.getRequiredServiceConnections()){
						if(! requiredServiceConnections.contains(conn)){
							requiredServiceConnections.add(serviceConnectionHashTable.get(conn));
						}
					}
					for(ROSAbstractConnection conn : requiredConnectionsTmp.getRequiredActionConnections()){
						if(! requiredActionConnections.contains(conn)){
							requiredActionConnections.add(actionConnectionHashTable.get(conn));
						}
					}

				}else{
					MessageDialog.openError(null, "Error", 
							"The RTT resolution element " + currentResElem.getName() + 
							" contains a " + currentResElem.getRequiredConnections().getClass()
							+ "instance!!!");
					return;
				}

			}

			for(RMAbstractTransformation currentTransf : currentResElem.getTransformations()){

				if(currentTransf instanceof ROSTransfImplementation){

					ROSTransfImplementation transf = (ROSTransfImplementation)currentTransf;

					Node targetNode = nodeHashTable.get(transf.getTargetNode());

					((Package)targetNode.eContainer()).setName(transf.getClassNamespace());
					targetNode.setName(transf.getClassName());

					// add the target task context to the required components list
					// it should be already there,
					// This is done for the case in which the user forget to add it
					if(! requiredComponents.contains(targetNode)){
						requiredComponents.add(targetNode);
					}


				}else if(currentTransf instanceof ROSTransfConnection){

					ROSTransfConnection transf = (ROSTransfConnection)currentTransf;

					for(ROSAbstractConnection newRosConnection : transf.getNewConnections()){

						if(newRosConnection instanceof ROSTopicConnection ||
								newRosConnection instanceof ROSNewTopicConnection){

							Topic targetTopic;
							Publisher pub;
							Subscriber sub;

							if(newRosConnection instanceof ROSTopicConnection){

								ROSTopicConnection currentConn = (ROSTopicConnection)newRosConnection;
								targetTopic = topicHashTable.get(currentConn.getTopic());

								pub = publisherHashTable.get(currentConn.getPublisher());
								sub = subscriberHashTable.get(currentConn.getSubscriber());

								// update the topic source and target
								targetTopic.setPublisher(pub);
								targetTopic.setSubscriber(sub);

							}else{

								ROSNewTopicConnection currentConn = (ROSNewTopicConnection)newRosConnection;
								targetTopic = getTopicFromName(currentConn.getTopicName());

								pub = publisherHashTable.get(currentConn.getPublisher());
								sub = subscriberHashTable.get(currentConn.getSubscriber());

								// create the new topic connection
								targetTopic.setPublisher(pub);
								targetTopic.setSubscriber(sub);

								if(! targetRosModel.getTopic().contains(targetTopic)){
									targetRosModel.getTopic().add(targetTopic);
								}

							}

							// add the new connection to the required connections list
							ROSTopicConnection newRequiredConn = rosFactoryImpl.eINSTANCE.createROSTopicConnection();
							newRequiredConn.setTopic(targetTopic);
							newRequiredConn.setPublisher(pub);
							newRequiredConn.setSubscriber(sub);

							if(! requiredTopicConnections.contains(newRequiredConn)){
								requiredTopicConnections.add(newRequiredConn);
							}

							// we add also the connected components
							if(! requiredComponents.contains((Node)pub.eContainer())){
								requiredComponents.add((Node)pub.eContainer());
							}
							if(! requiredComponents.contains((Node)sub.eContainer())){
								requiredComponents.add((Node)sub.eContainer());
							}

						}else if(newRosConnection instanceof ROSServiceConnection ||
								newRosConnection instanceof ROSNewServiceConnection){

							Service targetService;
							ServiceServer ss;
							ServiceClient sc;

							if(newRosConnection instanceof ROSServiceConnection){

								ROSServiceConnection currentConn = (ROSServiceConnection)newRosConnection;
								targetService = serviceHashTable.get(currentConn.getService());

								ss = serviceServerHashTable.get(currentConn.getServiceServer());
								sc = serviceClientHashTable.get(currentConn.getServiceClient());

								// update the service server and client
								if(! targetService.getServiceserver().contains(ss)){
									targetService.getServiceserver().add(ss);
								}
								if(! targetService.getServiceclient().contains(sc)){
									targetService.getServiceclient().add(sc);
								}

							}else{

								ROSNewServiceConnection currentConn = (ROSNewServiceConnection)newRosConnection;
								targetService = getServiceFromName(currentConn.getServiceName());

								ss = serviceServerHashTable.get(currentConn.getServiceServer());
								sc = serviceClientHashTable.get(currentConn.getServiceClient());

								// create the new service connection
								if(! targetService.getServiceserver().contains(ss)){
									targetService.getServiceserver().add(ss);
								}
								if(! targetService.getServiceclient().contains(sc)){
									targetService.getServiceclient().add(sc);
								}

								if(! targetRosModel.getService().contains(targetService)){
									targetRosModel.getService().add(targetService);
								}

							}

							// add the new connection to the required connections list
							ROSServiceConnection newRequiredConn = rosFactoryImpl.eINSTANCE.createROSServiceConnection();
							newRequiredConn.setService(targetService);
							newRequiredConn.setServiceServer(ss);
							newRequiredConn.setServiceClient(sc);
							if(! requiredServiceConnections.contains(newRequiredConn)){
								requiredServiceConnections.add(newRequiredConn);
							}

							// we add also the connected components
							if(! requiredComponents.contains((Node)ss.eContainer())){
								requiredComponents.add((Node)ss.eContainer());
							}
							if(! requiredComponents.contains((Node)sc.eContainer())){
								requiredComponents.add((Node)sc.eContainer());
							}

						}else if(newRosConnection instanceof ROSActionConnection ||
								newRosConnection instanceof ROSNewActionConnection){

							Action targetAction;
							ActionServer as;
							ActionClient ac;

							if(newRosConnection instanceof ROSActionConnection){

								ROSActionConnection currentConn = (ROSActionConnection)newRosConnection;
								targetAction = actionHashTable.get(currentConn.getAction());

								as = actionServerHashTable.get(currentConn.getActionServer());
								ac = actionClientHashTable.get(currentConn.getActionClient());

								// update the service server and client
								targetAction.setActionserver(as);
								targetAction.setActionclient(ac);

							}else{

								ROSNewActionConnection currentConn = (ROSNewActionConnection)newRosConnection;
								targetAction = getActionFromName(currentConn.getActionName());

								as = actionServerHashTable.get(currentConn.getActionServer());
								ac = actionClientHashTable.get(currentConn.getActionClient());

								// create the new service connection
								targetAction.setActionserver(as);
								targetAction.setActionclient(ac);

								if(! targetRosModel.getAction().contains(targetAction)){
									targetRosModel.getAction().add(targetAction);
								}

							}

							// add the new connection to the required connections list
							ROSActionConnection newRequiredConn = rosFactoryImpl.eINSTANCE.createROSActionConnection();
							newRequiredConn.setAction(targetAction);
							newRequiredConn.setActionServer(as);
							newRequiredConn.setActionClient(ac);
							if(requiredActionConnections.contains(newRequiredConn)){
								requiredActionConnections.add(newRequiredConn);
							}

							// we add also the connected components
							if(! requiredComponents.contains((Node)as.eContainer())){
								requiredComponents.add((Node)as.eContainer());
							}
							if(! requiredComponents.contains((Node)ac.eContainer())){
								requiredComponents.add((Node)ac.eContainer());
							}

						}





					}

				}else if(currentTransf instanceof ROSTransfProperty){


					ROSTransfProperty transf = (ROSTransfProperty)currentTransf;

					Parameter targetProperty = parameterHashTable.get(transf.getTargetProperty());
					targetProperty.setValue(transf.getValue());

					// add the target task context to the required components list
					// it should be already there,
					// This is done for the case in which the user forget to add it
					if(! requiredComponents.contains((Node)targetProperty.eContainer())){
						requiredComponents.add((Node)targetProperty.eContainer());
					}

				}

			}
		}

		/*
		 *  Here we check and remove connections and components that are not anymore used
		 *  We first create an array of the elements that have to be removed, than we remove them
		 *  If we directly remove during the iteration an exception is thrown
		 */
		ArrayList<Topic> usedTopics = new ArrayList<Topic>();
		for(Topic topic : targetRosModel.getTopic()){

			for(ROSTopicConnection conn : requiredTopicConnections){

				if(conn.getTopic().equals(topic)){
					usedTopics.add(topic);
					break;
				}

			}

		}

		targetRosModel.getTopic().retainAll(usedTopics);

		//		ArrayList<Topic> unusedTopics = new ArrayList<Topic>();
		//		for(Topic topic : targetRosModel.getTopic()){
		//
		//			boolean used = false;
		//			
		//			for(ROSTopicConnection conn : requiredTopicConnections){
		//								
		//				if(conn.getTopic().equals(topic)){
		//					used = true;
		//					break;
		//				}
		//				
		//			}
		//			
		//			if(! used){
		//				unusedTopics.add(topic);
		//			}
		//			
		//
		//		}
		//
		//		for(Topic topic : unusedTopics){
		//			
		//			targetRosModel.getTopic().remove(topic);
		//			
		//		}

		ArrayList<Service> unusedServices = new ArrayList<Service>();

		for(Service service : targetRosModel.getService()){

			boolean used = false;
			ArrayList<ServiceServer> connectedServiceServers = new ArrayList<ServiceServer>();
			ArrayList<ServiceClient> connectedServiceClients = new ArrayList<ServiceClient>();

			for(ROSServiceConnection conn : requiredServiceConnections){

				if(conn.getService().equals(service)){
					used = true;
					connectedServiceServers.add(conn.getServiceServer());
					connectedServiceClients.add(conn.getServiceClient());

				}

			}

			if(used){

				service.getServiceserver().retainAll(connectedServiceServers);
				service.getServiceclient().retainAll(connectedServiceClients);

			}else{
				unusedServices.add(service);
			}


		}

		targetRosModel.getService().removeAll(unusedServices);


		ArrayList<Action> usedActions = new ArrayList<Action>();
		for(Action action : targetRosModel.getAction()){

			for(ROSActionConnection conn : requiredActionConnections){

				if(conn.getAction().equals(action)){
					usedActions.add(action);
					break;
				}

			}

		}

		targetRosModel.getAction().retainAll(usedActions);




		for(Package pack : targetRosModel.getPackages()){

			ArrayList<Node> unusedNode = new ArrayList<Node>();

			for(Node node : pack.getNode()){

				if(! requiredComponents.contains(node)){
					unusedNode.add(node);
				}

			}

			for(Node node : unusedNode){
				pack.getNode().remove(node);
			}

		}



	}


	private void cloneRosArchitecture(Architecture source){

		targetRosModel = RosFactoryImpl.eINSTANCE.createArchitecture();

		targetRosModel.setName(source.getName());

		packageHashTable = new Hashtable<Package, Package>();
		publisherHashTable = new Hashtable<Publisher, Publisher>();
		subscriberHashTable = new Hashtable<Subscriber, Subscriber>();
		topicHashTable = new Hashtable<Topic, Topic>();
		serviceServerHashTable = new Hashtable<ServiceServer, ServiceServer>();
		serviceClientHashTable = new Hashtable<ServiceClient, ServiceClient>();
		serviceHashTable = new Hashtable<Service, Service>();
		actionServerHashTable = new Hashtable<ActionServer, ActionServer>();
		actionClientHashTable = new Hashtable<ActionClient, ActionClient>();
		actionHashTable = new Hashtable<Action, Action>();
		nodeHashTable = new Hashtable<Node, Node>();
		parameterHashTable = new Hashtable<Parameter, Parameter>();
		stateMachineHashTable = new Hashtable<SMACHStateMachine, SMACHStateMachine>();

		targetRosModel.setName(source.getName());

		for(Package sourcePackage : source.getPackages()){
			targetRosModel.getPackages().add(cloneRosPackage(sourcePackage));
		}

		for(Topic sourceTopic : source.getTopic()){
			targetRosModel.getTopic().add(cloneRosTopic(sourceTopic));
		}

		for(Service sourceService : source.getService()){
			targetRosModel.getService().add(cloneRosService(sourceService));
		}

		for(Action sourceAction : source.getAction()){
			targetRosModel.getAction().add(cloneRosAction(sourceAction));
		}



	}

	private Package cloneRosPackage(Package source){

		Package target = RosFactoryImpl.eINSTANCE.createPackage();

		target.setName(source.getName());
		target.setAuthor(source.getAuthor());
		target.setDescription(source.getDescription());
		target.setLicense(source.getLicense());
		target.setUrl(source.getUrl());
		target.setRosdep(source.getRosdep());

		for(String depend : source.getDepend()){
			target.getDepend().add(depend);
		}

		for(Node sourceNode : source.getNode()) {
			target.getNode().add(cloneRosNode(sourceNode));
		}

		for(SMACHStateMachine sourceCoordinator : source.getCoordinators()){
			target.getCoordinators().add(cloneRosSMACHStateMachine(sourceCoordinator));
		}

		packageHashTable.put(source, target);

		return target;

	}

	private Node cloneRosNode(Node source){

		Node target = RosFactoryImpl.eINSTANCE.createNode();

		target.setName(source.getName());
		target.setLoopRate(source.getLoopRate());
		target.setArgs(source.getArgs());
		target.setParamSource(source.getParamSource());
		target.setNamespace(source.getNamespace());

		for(Publisher sourcePublisher : source.getPublisher()){
			target.getPublisher().add(cloneRosPublisher(sourcePublisher));
		}

		for(Subscriber sourceSubscriber : source.getSubscriber()){
			target.getSubscriber().add(cloneRosSubscriber(sourceSubscriber));
		}

		for(ServiceServer sourceServiceServer : source.getServiceServer()){
			target.getServiceServer().add(cloneRosServiceServer(sourceServiceServer));
		}

		for(ServiceClient sourceServiceClient : source.getServiceClient()){
			target.getServiceClient().add(cloneRosServiceClient(sourceServiceClient));
		}

		for(ActionServer sourceActionServer : source.getActionserver()){
			target.getActionserver().add(cloneRosActionServer(sourceActionServer));
		}

		for(ActionClient sourceActionClient : source.getActionclient()){
			target.getActionclient().add(cloneRosActionClient(sourceActionClient));
		}

		for(Parameter sourceParameter : source.getParameter()){
			target.getParameter().add(cloneRosParameter(sourceParameter));
		}

		nodeHashTable.put(source, target);

		return target;

	}

	private Publisher cloneRosPublisher(Publisher source){

		Publisher target = RosFactoryImpl.eINSTANCE.createPublisher();

		target.setName(source.getName());
		target.setQueueSize(source.getQueueSize());
		target.setLatch(source.isLatch());
		target.setEventHandler(source.getEventHandler());
		target.setMsg(source.getMsg());

		publisherHashTable.put(source, target);

		return target;


	}

	private Subscriber cloneRosSubscriber(Subscriber source){

		Subscriber target = RosFactoryImpl.eINSTANCE.createSubscriber();

		target.setName(source.getName());
		target.setQueueSize(source.getQueueSize());
		target.setEventPort(source.isEventPort());
		target.setEventHandler(source.getEventHandler());
		target.setMsg(source.getMsg());

		subscriberHashTable.put(source, target);

		return target;


	}

	private ServiceServer cloneRosServiceServer(ServiceServer source){

		ServiceServer target = RosFactoryImpl.eINSTANCE.createServiceServer();

		target.setName(source.getName());
		target.setMsg(source.getMsg());

		serviceServerHashTable.put(source, target);

		return target;


	}

	private ServiceClient cloneRosServiceClient(ServiceClient source){

		ServiceClient target = RosFactoryImpl.eINSTANCE.createServiceClient();

		target.setName(source.getName());
		target.setMsg(source.getMsg());

		serviceClientHashTable.put(source, target);

		return target;


	}

	private ActionServer cloneRosActionServer(ActionServer source){

		ActionServer target = RosFactoryImpl.eINSTANCE.createActionServer();

		target.setName(source.getName());
		target.setActionType(source.getActionType());

		actionServerHashTable.put(source, target);

		return target;


	}

	private ActionClient cloneRosActionClient(ActionClient source){

		ActionClient target = RosFactoryImpl.eINSTANCE.createActionClient();

		target.setName(source.getName());
		target.setActionType(source.getActionType());

		actionClientHashTable.put(source, target);

		return target;


	}

	private Parameter cloneRosParameter(Parameter source){

		Parameter target = RosFactoryImpl.eINSTANCE.createParameter();

		target.setName(source.getName());
		target.setValue(source.getValue());
		target.setType(source.getType());

		parameterHashTable.put(source, target);

		return target;


	}

	private SMACHStateMachine cloneRosSMACHStateMachine(SMACHStateMachine source){

		//TODO

		SMACHStateMachine target = null;

		stateMachineHashTable.put(source, target);

		return target;


	}

	private Topic cloneRosTopic(Topic source){

		Topic target = RosFactoryImpl.eINSTANCE.createTopic();

		target.setName(source.getName());
		target.setPublisher(publisherHashTable.get(source.getPublisher()));
		target.setSubscriber(subscriberHashTable.get(source.getSubscriber()));

		topicHashTable.put(source, target);

		return target;

	}

	private Service cloneRosService(Service source){

		Service target = RosFactoryImpl.eINSTANCE.createService();

		target.setName(source.getName());
		for(ServiceServer serviceServer : source.getServiceserver()){
			target.getServiceserver().add(serviceServerHashTable.get(serviceServer));
		}
		for(ServiceClient serviceClient : source.getServiceclient()){
			target.getServiceclient().add(serviceClientHashTable.get(serviceClient));
		}

		serviceHashTable.put(source, target);

		return target;

	}

	private Action cloneRosAction(Action source){

		Action target = RosFactoryImpl.eINSTANCE.createAction();

		target.setName(source.getName());
		target.setActionserver(actionServerHashTable.get(source.getActionserver()));
		target.setActionclient(actionClientHashTable.get(source.getActionclient()));

		actionHashTable.put(source, target);

		return target;

	}

	private FeatureModel getSourceFeatureModel(){

		Feature currentFeature;

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			currentFeature = currentResElem.getFeature();

			if(currentFeature != null){

				return currentFeature.getFeatureModel();

			}

		}

		return null;


	}

	private Architecture getSourceRosModel(){

		Architecture architecture = null;

		System.err.println("*******" + resolutionModel.getName());

		for(RMResolutionElement currentResElem : resolutionModel.getResolutionElements()){

			for(RMAbstractTransformation currentTransf : currentResElem.getTransformations()){

				if(currentTransf instanceof ROSTransfImplementation){

					ROSTransfImplementation transfImpl = (ROSTransfImplementation) currentTransf;
					System.err.println("-----" + transfImpl.getTargetNode().getName());
					return (Architecture)transfImpl.getTargetNode().eContainer().eContainer();


				}else if(currentTransf instanceof ROSTransfProperty){

					ROSTransfProperty transfProperty = (ROSTransfProperty) currentTransf;
					Node node = (Node)transfProperty.getTargetProperty().eContainer();
					return (Architecture)node.eContainer().eContainer();

				}else if(currentTransf instanceof ROSTransfConnection){

					ROSTransfConnection transfConn = (ROSTransfConnection) currentTransf;
					ROSAbstractConnection connection = transfConn.getNewConnections().get(0);

					return getArchitectureFromROSAbstractConnection(connection);

				}

			}

			if(currentResElem.getRequiredComponents() instanceof ROSRequiredComponents){

				ROSRequiredComponents rosReqComponenents = (ROSRequiredComponents)currentResElem.getRequiredComponents();
				for(Node currentReqComp : rosReqComponenents.getROSNodes()){

					return (Architecture)currentReqComp.eContainer().eContainer();

				}

			}

			if(currentResElem.getRequiredConnections() instanceof ROSRequiredConnections){

				ROSRequiredConnections rosReqConnections = (ROSRequiredConnections)currentResElem.getRequiredConnections();

				return getArchitectureFromROSRequiredConnections(rosReqConnections);


			}


		}

		return architecture;

	}

	private Architecture getArchitectureFromROSAbstractConnection(ROSAbstractConnection connection){

		Node node = null;

		if(connection instanceof ROSTopicConnection){

			node = (Node)((ROSTopicConnection)connection).getPublisher().eContainer();

		}else if(connection instanceof ROSNewTopicConnection){

			node = (Node)((ROSNewTopicConnection)connection).getPublisher().eContainer();

		}else if(connection instanceof ROSServiceConnection){

			node = (Node)((ROSServiceConnection)connection).getServiceServer().eContainer();

		}else if(connection instanceof ROSNewServiceConnection){

			node = (Node)((ROSNewServiceConnection)connection).getServiceServer().eContainer();

		}else if(connection instanceof ROSActionConnection){

			node = (Node)((ROSActionConnection)connection).getActionServer().eContainer();

		}else if(connection instanceof ROSNewActionConnection){

			node = (Node)((ROSNewActionConnection)connection).getActionServer().eContainer();

		}

		return (Architecture)node.eContainer().eContainer();

	}

	private Architecture getArchitectureFromROSRequiredConnections(ROSRequiredConnections requiredConnection){

		Node node = null;

		for(ROSTopicConnection conn : requiredConnection.getRequiredTopicConnections()){
			node = (Node)conn.getPublisher().eContainer();
		}

		for(ROSServiceConnection conn : requiredConnection.getRequiredServiceConnections()){
			node = (Node)conn.getServiceServer().eContainer();
		}

		for(ROSActionConnection conn : requiredConnection.getRequiredActionConnections()){
			node = (Node)conn.getActionServer().eContainer();
		}

		return (Architecture)node.eContainer().eContainer();

	}

	/*
	 * If exists, returns the topic with the requested name.
	 * Otherwise it creates a new topic with the requested name;
	 */
	private Topic getTopicFromName(String topicName){

		for(Topic topic : targetRosModel.getTopic()){

			if(topic.getName().equals(topicName)){
				return topic;
			}


		}
		Topic result = RosFactoryImpl.eINSTANCE.createTopic();
		result.setName(topicName);
		return result;

	}

	/*
	 * If exists, returns the service with the requested name.
	 * Otherwise it creates a new service with the requested name;
	 */
	private Service getServiceFromName(String serviceName){

		for(Service service : targetRosModel.getService()){

			if(service.getName().equals(serviceName)){
				return service;
			}


		}
		Service result = RosFactoryImpl.eINSTANCE.createService();
		result.setName(serviceName);
		return result;

	}

	/*
	 * If exists, returns the action with the requested name.
	 * Otherwise it creates a new action with the requested name;
	 */
	private Action getActionFromName(String actionName){

		for(Action action : targetRosModel.getAction()){

			if(action.getName().equals(actionName)){
				return action;
			}


		}
		Action result = RosFactoryImpl.eINSTANCE.createAction();
		result.setName(actionName);
		return result;

	}

	//	// Check if the input connection is already defined in the list of required connections
	//	private boolean isExistingTargetConnectionAlreadyRequired(ROSExistingTargetConnection connection){
	//
	//		for(ROSAbstractConnection currentConn : requiredConnections){
	//
	//			if(currentConn.getClass().equals(requiredConnections.getClass())){
	//
	//				if(currentConn instanceof ROSTopicConnection){
	//
	//					Publisher pubA = ((ROSTopicConnection)currentConn).getPublisher();
	//					Publisher pubB = ((ROSTopicConnection)connection).getPublisher();
	//
	//					Subscriber subA = ((ROSTopicConnection)currentConn).getSubscriber();
	//					Subscriber subB = ((ROSTopicConnection)connection).getSubscriber();
	//
	//					Topic topA = ((ROSTopicConnection)currentConn).getTopic();
	//					Topic topB = ((ROSTopicConnection)connection).getTopic();
	//
	//					if(pubA == pubB && subA == subB && topA == topB){
	//						return true;
	//					}
	//
	//				}else if(currentConn instanceof ROSServiceConnection){
	//
	//					ServiceServer ssA = ((ROSServiceConnection)currentConn).getServiceServer();
	//					ServiceServer ssB = ((ROSServiceConnection)connection).getServiceServer();
	//
	//					ServiceClient scA = ((ROSServiceConnection)currentConn).getServiceClient();
	//					ServiceClient scB = ((ROSServiceConnection)connection).getServiceClient();
	//
	//					Service sA = ((ROSServiceConnection)currentConn).getService();
	//					Service sB = ((ROSServiceConnection)connection).getService();
	//
	//					if(ssA == ssB && scA == scB && sA == sB){
	//						return true;
	//					}
	//
	//				}else if(currentConn instanceof ROSActionConnection){
	//
	//					ActionServer asA = ((ROSActionConnection)currentConn).getActionServer();
	//					ActionServer asB = ((ROSActionConnection)connection).getActionServer();
	//
	//					ActionClient acA = ((ROSActionConnection)currentConn).getActionClient();
	//					ActionClient acB = ((ROSActionConnection)connection).getActionClient();
	//
	//					Action aA = ((ROSActionConnection)currentConn).getAction();
	//					Action aB = ((ROSActionConnection)connection).getAction();
	//
	//					if(asA == asB && acA == acB && aA == aB){
	//						return true;
	//					}
	//
	//				} 
	//
	//			}
	//
	//		}
	//
	//		return false;
	//
	//	}


}
