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
package org.hyperflex.resolutionmodels.rosresolutionmodels;

import org.eclipse.emf.common.util.EList;

import org.hyperflex.resolutionmodels.RMTransfConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Transf Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSTransfConnection#getNewConnections <em>New Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTransfConnection()
 * @model
 * @generated
 */
public interface ROSTransfConnection extends RMTransfConnection {
	/**
	 * Returns the value of the '<em><b>New Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.resolutionmodels.rosresolutionmodels.ROSConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Connections</em>' containment reference list.
	 * @see org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSTransfConnection_NewConnections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ROSConnection> getNewConnections();

} // ROSTransfConnection
