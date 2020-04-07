import java.util.ArrayList;
import java.util.List;

public class Agenda{

	//Atributo lista de contatos
	private List<Contato> contatos = new ArrayList<>();

	public List<Contato> getContatos(){
		return this.contatos;
	}

	//serviço sobre um contato

	//adicionar um contato
	public boolean addContato(Contato obj){
		if(obj == null) return false;
		else contatos.add(obj); return true;
	}



}