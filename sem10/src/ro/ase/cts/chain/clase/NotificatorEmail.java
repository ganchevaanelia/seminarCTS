package ro.ase.cts.chain.clase;

public class NotificatorEmail extends Notificator{

	@Override
	public void trimiteNotificare(Client client, String text) {
		if (client.getEmail() != null) {
			System.out.println("trimite email catre" + client.getNume() + "Mesaj: " + text);
		} else {
			if (super.getNotificator() != null) {
				this.getNotificator().trimiteNotificare(client, text);
			}
			else {
				System.out.println("Domnule manager, nu avem email pt "+client.getNume());
			}
		}
		
	}

}
