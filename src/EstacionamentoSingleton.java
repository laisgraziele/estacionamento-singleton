import java.util.ArrayList;


public class EstacionamentoSingleton {
	
	
	private static EstacionamentoSingleton vaga;
	
	private ArrayList<String> vagasDisponiveis = new ArrayList<String>();
	
	
	public static EstacionamentoSingleton getVaga() {
		
		if(vaga == null) {
			
			vaga = new EstacionamentoSingleton();
		}

		return vaga;
	
	}
	
	private EstacionamentoSingleton () {
		
		vagasDisponiveis.add("A1");
		vagasDisponiveis.add("A2");
		
	}
	
	
	public boolean ocupaVaga(String vaga) {
		return vagasDisponiveis.remove(vaga);
		
	}
	
}
