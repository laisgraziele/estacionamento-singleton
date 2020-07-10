
public class EstacionandoSingleton {
	
	
	private static void estacionar (String vaga) {
			
			EstacionamentoSingleton estaciona = EstacionamentoSingleton.getVaga();
			
			System.out.println(estaciona.ocupaVaga(vaga));
			
		}
	
		
	public static void main(String[] args) {
		
		estacionar("A2");
		estacionar("A2");
		
	}
		
}


