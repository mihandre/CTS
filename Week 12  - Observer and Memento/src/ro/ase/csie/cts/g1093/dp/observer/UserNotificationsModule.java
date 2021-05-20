package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("PopUp: Connection is up!");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("PopUp: Connection has been lost!");
		
	}

}
