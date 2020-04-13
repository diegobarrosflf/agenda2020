import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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

	//adicionar um contato
	public boolean addContato(Contato obj){
		if(obj == null) return false;
		else contatos.add(obj); return true;
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