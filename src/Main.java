/* Universidad del Valle de Guatemala
 Abril de 2015
 Julio Ayala - 12362
 Ricardo Zepeda - 12311
 Bases de datos
 Main.java archivo principal que llama al GUI 
*/

import javax.swing.UIManager;

public class Main {
	
	public static void main(String[] args)  {
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}

		try {
			GUI frame = new GUI();
			frame.setVisible(true);
			frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
			frame.getTextPane().requestFocus();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}