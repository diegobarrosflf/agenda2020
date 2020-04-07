public class App{
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();

		System.out.println("Agenda 2020\n");

		Contato c1 = new Contato("Diego", "9854-6543");
		Contato c2 = new Contato("Marcio", "6548-3265", "marcio@gmail.com");
		Contato c3 = new Contato("Jerovane", "6548-3265");

		// c1.mostraContato();
		// c2.mostraContato();
		// c3.mostraContato();

		agenda.addContato(c1);
		agenda.addContato(c2);
		agenda.addContato(c3);

		System.out.println("quantidade de contatos " + agenda.getContatos().size());




	}
}