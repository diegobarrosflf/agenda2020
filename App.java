import java.util.Scanner;

public class App{
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		boolean loop = true;

		

		while(loop){
			System.out.println("Agenda 2020\n");

			System.out.println("(1) Pesquisar");
			System.out.println("(2) Adicionar");
			System.out.println("(3) Deletar");
			System.out.println("(4) Editar");
			System.out.println("(5) Listar");
			System.out.println("(6) Sair\n");

			System.out.println("Escolha uma opção do menu.");

			menu = teclado.nextInt();

			//esvaziar o buffer do teclado
			teclado.nextLine();


			switch(menu){

				case 1:
					System.out.println("Digite um nome para pesquisar");
					String nome = teclado.nextLine();
					agenda.listarContatos(agenda.findByName(nome));
					break;

				case 2:
					System.out.println("Cadastro de contato");
					agenda.addContato(agenda.criarNovoContato(teclado));
					break;

				case 3:
					System.out.println("Deletar contato");
					agenda.deletarContato(teclado);
					break;

				case 4:
					System.out.println("Editar contato");
					agenda.editarContato(teclado);
					break;

				case 5:
					System.out.println("Lista de contatos");
					agenda.listarContatos();
					break;


				case 6:
					System.out.println("Saindo...");
					teclado.close();
					loop = false;
			}


		}





	}
}