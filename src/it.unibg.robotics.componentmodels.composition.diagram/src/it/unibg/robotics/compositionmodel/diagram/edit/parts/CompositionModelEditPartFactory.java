package org.hyperflex.compositionmodel.diagram.edit.parts;

import org.hyperflex.compositionmodel.diagram.part.CompositionModelVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class CompositionModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CompositionModelVisualIDRegistry.getVisualID(view)) {

			case SystemEditPart.VISUAL_ID:
				return new SystemEditPart(view);

			case System2EditPart.VISUAL_ID:
				return new System2EditPart(view);

			case SystemNameEditPart.VISUAL_ID:
				return new SystemNameEditPart(view);

			case SystemProvidedInterfEditPart.VISUAL_ID:
				return new SystemProvidedInterfEditPart(view);

			case SystemRequiredInterfEditPart.VISUAL_ID:
				return new SystemRequiredInterfEditPart(view);

			case SystemCompositeEditPart.VISUAL_ID:
				return new SystemCompositeEditPart(view);

			case SystemCompositeNameEditPart.VISUAL_ID:
				return new SystemCompositeNameEditPart(view);

			case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
				return new SystemCompositeProvidedInterfEditPart(view);

			case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
				return new SystemCompositeRequiredInterfEditPart(view);

			case ROSCompositeEditPart.VISUAL_ID:
				return new ROSCompositeEditPart(view);

			case ROSCompositeNameEditPart.VISUAL_ID:
				return new ROSCompositeNameEditPart(view);

			case ROSMsgProducerEditPart.VISUAL_ID:
				return new ROSMsgProducerEditPart(view);

			case ROSMsgConsumerEditPart.VISUAL_ID:
				return new ROSMsgConsumerEditPart(view);

			case SystemCompositeContainerCompartmentEditPart.VISUAL_ID:
				return new SystemCompositeContainerCompartmentEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionNameEditPart.VISUAL_ID:
				return new ConnectionNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
