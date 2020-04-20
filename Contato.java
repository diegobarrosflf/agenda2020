public class Contato{

	//Atributos
	private static int qtdContatos = 0;
	private int id;
	private String nome;
	private String telefone;
	private String email;

	//Construtor
	public Contato(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
		this.id = ++qtdContatos;
	}

	public Contato(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.id = ++qtdContatos;

	}

	//Getters & Setters
	public int getQtdContatos(){
		return this.qtdContatos;
	}

	public int getId(){
		return this.id;
	}


	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getTelefone(){
		return this.telefone;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void mostrarContato(){
		System.out.println("--- Contato ---");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		if(this.email != null) System.out.println("Email: " +this.email);
		System.out.println( "\n");
	}




}