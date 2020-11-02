package bridge.com.bridge;

import bridge.com.bridge.coberturaBolo.CoberturaBolo;
import bridge.com.bridge.saborBolo.SaborBolo;

public class FabricaBolo {
	
	CoberturaBolo coberturaBolo;
	SaborBolo saborBolo;
	
	
	public FabricaBolo(CoberturaBolo coberturaBolo, SaborBolo saborBolo) {
		this.coberturaBolo = coberturaBolo;
		this.saborBolo = saborBolo;
	}
	
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	
	private void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	
	private void fazerCobertura() {
		this.coberturaBolo.fazerCobertura();
	}
	
	private void fazerMassa() {
		this.saborBolo.fazerMassa();
	}
	
	private void decorarBolo() {
		System.out.println("Decora bolo");
	}
}
