/**
 * 
 */
package edu.mhs.compsys.processors;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import edu.mhs.compsys.idt.Change;
import edu.mhs.compsys.idt.Dataset;
import edu.mhs.compsys.idt.StateTransition;
import edu.mhs.compsys.processing.BinaryImage;
import edu.mhs.compsys.processing.IChangeProcessor;

/**
 * This Processor will recognize changes in the window-menus and quantify those.
 * It will recognize WINDOW_MENU_OPEN, WINDOW_MENU_CLOSE, and
 * WINDOW_MENU_ITEM_SELECTED,
 * 
 */
public class WindowMenuProcessor implements IChangeProcessor {

	private ArrayList<Change> _changes;

	/**
	 * @see edu.mhs.compsys.processing.IChangeProcessor#process(java.awt.image.
	 *      BufferedImage, java.awt.image.BufferedImage,
	 *      edu.mhs.compsys.processing.BinaryImage, java.util.ArrayList,
	 *      edu.mhs.compsys.idt.Dataset)
	 */
	@Override
	public void process(BufferedImage img, BufferedImage img2,
			BinaryImage diff, ArrayList<StateTransition> changes, Dataset data) {
		_changes = new ArrayList<Change>();

	}

	/**
	 * @see edu.mhs.compsys.processing.IChangeProcessor#getChanges()
	 */
	@Override
	public Change[] getChanges() {
		// TODO Auto-generated method stub
		return (Change[]) _changes.toArray();
	}
}
