public class Contato{

	//Atributos
	private String nome;
	private String telefone;
	private String email;

	//Construtor
	public Contato(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	public Contato(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;

	}

	//Getters & Setters
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

	public void mostraContato(){
		System.out.println("--- Contato ---");
		System.out.println(this.nome);
		System.out.println(this.telefone);
		if(this.email != null) System.out.println(this.email);
		System.out.println( "\n");
	}




}