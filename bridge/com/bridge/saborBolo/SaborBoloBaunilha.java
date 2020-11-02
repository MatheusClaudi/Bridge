package bridge.com.bridge.saborBolo;

public class SaborBoloBaunilha  extends SaborBolo {

	@Override
	public void fazerMassa() {
		this.fazerMassaBaunilha();
	}
	
	private void fazerMassaBaunilha() {
		System.out.println("Faz a massa de baunilha");
	}
}
