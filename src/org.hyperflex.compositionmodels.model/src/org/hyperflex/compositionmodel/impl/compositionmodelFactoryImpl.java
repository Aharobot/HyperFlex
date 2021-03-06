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
package org.hyperflex.compositionmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.hyperflex.compositionmodel.ArchitectureModel;
import org.hyperflex.compositionmodel.Connection;
import org.hyperflex.compositionmodel.SystemComposite;
import org.hyperflex.compositionmodel.SystemCompositeProperty;
import org.hyperflex.compositionmodel.SystemCompositeProvidedInterf;
import org.hyperflex.compositionmodel.SystemCompositeRequiredInterf;
import org.hyperflex.compositionmodel.SystemProperty;
import org.hyperflex.compositionmodel.SystemProvidedInterf;
import org.hyperflex.compositionmodel.SystemRequiredInterf;
import org.hyperflex.compositionmodel.compositionmodelFactory;
import org.hyperflex.compositionmodel.compositionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class compositionmodelFactoryImpl extends EFactoryImpl implements compositionmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static compositionmodelFactory init() {
		try {
			compositionmodelFactory thecompositionmodelFactory = (compositionmodelFactory)EPackage.Registry.INSTANCE.getEFactory(compositionmodelPackage.eNS_URI);
			if (thecompositionmodelFactory != null) {
				return thecompositionmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new compositionmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compositionmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case compositionmodelPackage.SYSTEM: return createSystem();
			case compositionmodelPackage.CONNECTION: return createConnection();
			case compositionmodelPackage.ARCHITECTURE_MODEL: return createArchitectureModel();
			case compositionmodelPackage.SYSTEM_COMPOSITE: return createSystemComposite();
			case compositionmodelPackage.SYSTEM_PROVIDED_INTERF: return createSystemProvidedInterf();
			case compositionmodelPackage.SYSTEM_REQUIRED_INTERF: return createSystemRequiredInterf();
			case compositionmodelPackage.SYSTEM_COMPOSITE_PROVIDED_INTERF: return createSystemCompositeProvidedInterf();
			case compositionmodelPackage.SYSTEM_COMPOSITE_REQUIRED_INTERF: return createSystemCompositeRequiredInterf();
			case compositionmodelPackage.SYSTEM_PROPERTY: return createSystemProperty();
			case compositionmodelPackage.SYSTEM_COMPOSITE_PROPERTY: return createSystemCompositeProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hyperflex.compositionmodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureModel createArchitectureModel() {
		ArchitectureModelImpl architectureModel = new ArchitectureModelImpl();
		return architectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComposite createSystemComposite() {
		SystemCompositeImpl systemComposite = new SystemCompositeImpl();
		return systemComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemProvidedInterf createSystemProvidedInterf() {
		SystemProvidedInterfImpl systemProvidedInterf = new SystemProvidedInterfImpl();
		return systemProvidedInterf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequiredInterf createSystemRequiredInterf() {
		SystemRequiredInterfImpl systemRequiredInterf = new SystemRequiredInterfImpl();
		return systemRequiredInterf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCompositeProvidedInterf createSystemCompositeProvidedInterf() {
		SystemCompositeProvidedInterfImpl systemCompositeProvidedInterf = new SystemCompositeProvidedInterfImpl();
		return systemCompositeProvidedInterf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCompositeRequiredInterf createSystemCompositeRequiredInterf() {
		SystemCompositeRequiredInterfImpl systemCompositeRequiredInterf = new SystemCompositeRequiredInterfImpl();
		return systemCompositeRequiredInterf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemProperty createSystemProperty() {
		SystemPropertyImpl systemProperty = new SystemPropertyImpl();
		return systemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCompositeProperty createSystemCompositeProperty() {
		SystemCompositePropertyImpl systemCompositeProperty = new SystemCompositePropertyImpl();
		return systemCompositeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compositionmodelPackage getcompositionmodelPackage() {
		return (compositionmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static compositionmodelPackage getPackage() {
		return compositionmodelPackage.eINSTANCE;
	}

} //compositionmodelFactoryImpl
