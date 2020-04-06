public class App{
	public static void main(String[] args) {
		
		System.out.println("Agenda 2020");

		Contato c1 = new Contato("Diego", "9854-6543");
		Contato c2 = new Contato("Marcio", "6548-3265", "marcio@gmail.com");
		Contato c3 = new Contato("Jerovane", "6548-3265");

		System.out.println(c1.getNome());
		System.out.println(c1.getTelefone());

		System.out.println(c2.getNome());
		System.out.println(c2.getTelefone());

		System.out.println(c3.getNome());
		System.out.println(c3.getTelefone());



	}
}