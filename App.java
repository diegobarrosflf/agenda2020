public class App{
	public static void main(String[] args) {
		
		System.out.println("Agenda 2020");

		Contato c1 = new Contato("Diego", "9854-6543");
		Contato c2 = new Contato("Marcio", "6548-3265", "marcio@gmail.com");
		Contato c3 = new Contato("Jerovane", "6548-3265");

		c1.mostraContato();
		c2.mostraContato();
		c3.mostraContato();



	}
}