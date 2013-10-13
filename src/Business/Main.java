package Business;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIController controller = new GUIController();
		controller.initialize();
		controller.buildSemesterSchedule("1");
	}

}
