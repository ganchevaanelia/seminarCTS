package ro.ase.cts.chain.clase;

public class NotificatorSMS extends Notificator {

	@Override
	public void trimiteNotificare(Client client, String text) {
		if (client.getNrTelefon() != null) {
			System.out.println("trimite SMS catre" + client.getNume() + "Mesaj: " + text);
		} else {
			if (super.getNotificator() != null) {
				this.getNotificator().trimiteNotificare(client, text);
			}
			else {
				System.out.println("Domnule manager, nu avem numar de telef pt "+client.getNume());
			}
		}

	}

}
