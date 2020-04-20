import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda{

	//Atributo lista de contatos
	private List<Contato> contatos = new ArrayList<>();

	//construtor
	public Agenda(){
		povoarAgenda();
	}

	public List<Contato> getContatos(){
		return this.contatos;
	}

	//serviço sobre um contato
	public void editarContato(Scanner teclado){

		System.out.println("\n Digite o nome do contato");
		String nome = teclado.nextLine();

		listarContatos(findByName(nome));

		System.out.println("Escolher um id de contato para editar");
		int id = teclado.nextInt();
		Contato obj = findById(id);

		//limpar buffer
		teclado.nextLine();

		System.out.println("Digite o nome do contato");
		obj.setNome(teclado.nextLine());

		System.out.println("Digite o telefone do contato");
		obj.setTelefone(teclado.nextLine());

		System.out.println("Digite o email do contato");
		obj.setEmail(teclado.nextLine());

		obj.mostrarContato();
		System.out.println("\nContato editado.\n");

	}


	public boolean deletarContato(Scanner teclado){

		System.out.println("Digite o nome do contato");
		String nome = teclado.nextLine();

		List<Contato> result = findByName(nome);

		listarContatos(result);

		System.out.println("Escolha o id do contato para deletar.");

		int id = teclado.nextInt();

		if(deleteById(id)){
			System.out.println("Contato deletado."); return true;
		}
		else{
			System.out.println("Não foi possível deletar o contato."); return false;
		}



	}


	public Contato findById(int id){
		for (Contato c : contatos) {
			if(c.getId() == id) return c;
		}
		System.out.println("Desculpe, nenhum contato encontrado...");
		return null;
	}

	//deleta um contato peo id
	public boolean deleteById(int id){
		Contato obj = findById(id);
		if(obj == null) return false;
		else return contatos.remove(obj);
	}


	//criar novo contato
	public Contato criarNovoContato(Scanner teclado){

		System.out.println("Digite o nome do contato");
		String nome = teclado.nextLine();

		System.out.println("Digite o telefone do contato");
		String telefone = teclado.nextLine();

		System.out.println("Digite o email do contato");
		String email = teclado.nextLine();

		return new Contato(nome,telefone, email);
	}

	//adicionar um contato
	public boolean addContato(Contato obj){
		if(obj == null) return false;
		else contatos.add(obj); return true;
	}

	//Pesquisar contato por nome
	public List<Contato> findByName(String nome){
		List<Contato> result = new ArrayList<>();
		for(Contato c : contatos){
			if(c.getNome().toLowerCase().contains(nome.toLowerCase())) result.add(c);
		}
		if(result.size() < 1) System.out.println("\nNenhum contato encontrado.\n");
		return result;
	}

	//dado uma lista imprimir os contatos
	public void listarContatos(List<Contato> contatos){
		for (Contato c : contatos ) {
			c.mostrarContato();
		}
	}

	private void povoarAgenda(){

		Contato c1 = new Contato("João Barros", "3214-6548", "barros@gmail.com");
		Contato c2 = new Contato("José da Silva", "6548-9875", "Jose@gmail.com");
		Contato c3 = new Contato("Maria da Silva", "3214-3574", "maria@gmail.com");
		Contato c4 = new Contato("João de Deus", "9517-6548", "jdeus@gmail.com");
		Contato c5 = new Contato("José Pequeno", "1976-6482", "pequeno@gmail.com");
		Contato c6 = new Contato("Maria das Graças", "9876-6547", "gracinhadatuf@gmail.com");
		Contato c7 = new Contato("João Victor", "3214-6548", "jv@gmail.com");
		Contato c8 = new Contato("Maria Cecília", "3549-9865", "cece@gmail.com");

		contatos.addAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));

	}



}