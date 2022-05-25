package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;

public class Steps {
	Metodos m = new Metodos();
	
	@Given("dado que acesse a url {string}")
	public void dado_que_acesse_a_url(String string) {
		m.executarNavegador(string);
	}

	@Given("preenchar os campos")
	public void preenchar_os_campos() throws InterruptedException {
		m.PreenchercampoFistname();
	}
}
