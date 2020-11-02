package bridge.com.bridge.coberturaBolo;

public class CoberturaBoloMorango extends CoberturaBolo {

	@Override
	public void fazerCobertura() {
		this.fazerCoberturaMorango();
	}
	
	private void fazerCoberturaMorango() {
		System.out.println("Faz cobertura de morango");
	}
}
