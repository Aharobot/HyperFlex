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
package org.hyperflex.roscomponentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Srv Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.roscomponentmodel.NodeSrvProducer#getSrvName <em>Srv Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNodeSrvProducer()
 * @model
 * @generated
 */
public interface NodeSrvProducer extends SrvProducer {
	/**
	 * Returns the value of the '<em><b>Srv Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Name</em>' attribute.
	 * @see #setSrvName(String)
	 * @see org.hyperflex.roscomponentmodel.roscomponentmodelPackage#getNodeSrvProducer_SrvName()
	 * @model
	 * @generated
	 */
	String getSrvName();

	/**
	 * Sets the value of the '{@link org.hyperflex.roscomponentmodel.NodeSrvProducer#getSrvName <em>Srv Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Name</em>' attribute.
	 * @see #getSrvName()
	 * @generated
	 */
	void setSrvName(String value);

} // NodeSrvProducer