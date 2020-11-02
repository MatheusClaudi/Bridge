package bridge.com.bridge.saborBolo;

public class SaborBoloChocolate extends SaborBolo {

	@Override
	public void fazerMassa() {
		this.fazerMassaChocolate();
	}
	
	private void fazerMassaChocolate() {
		System.out.println("Faz a massa de chocolate");
	}
}
