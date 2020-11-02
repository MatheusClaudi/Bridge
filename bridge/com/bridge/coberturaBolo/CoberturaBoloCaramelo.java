package bridge.com.bridge.coberturaBolo;

public class CoberturaBoloCaramelo extends CoberturaBolo {

	@Override
	public void fazerCobertura() {
		this.fazerCoberturaCaramleo();
	}
	
	private void fazerCoberturaCaramleo() {
		System.out.println("Faz cobertura de caramelo");
	}

}
