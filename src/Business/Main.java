package Business;

import GUI.Login;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIController controller = new GUIController();
		controller.initialize();
		controller.buildSemesterSchedule("1");
        /*Login ventana = new Login();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);*/
	}

}
