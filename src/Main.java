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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}