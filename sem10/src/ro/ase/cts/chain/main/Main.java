package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.*;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Ion", null, null);
		Client client2 = new Client("Maria", "078934686", null);
		Client client3 = new Client("Ana", null, "ana@gmail.com");
		
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "Mesaj");
		
	}

}
