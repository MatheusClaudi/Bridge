package bridge.com.bridge;

import bridge.com.bridge.coberturaBolo.CoberturaBoloCaramelo;
import bridge.com.bridge.coberturaBolo.CoberturaBoloMorango;
import bridge.com.bridge.saborBolo.SaborBoloBaunilha;
import bridge.com.bridge.saborBolo.SaborBoloChocolate;

public class Cliente {
	public static void main(String[] args) {
		FabricaBolo fBoloBaunilha = new FabricaBolo(new CoberturaBoloMorango(), new SaborBoloBaunilha());
		FabricaBolo fBoloChocolate = new FabricaBolo(new CoberturaBoloCaramelo(), new SaborBoloChocolate());
		fBoloBaunilha.prepararBolo();
		fBoloChocolate.prepararBolo();
	}
}