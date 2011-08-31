import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

	private List<Nota> notasEntregues = new ArrayList<Nota>();
	private List<Nota> notasDisponiveis = new ArrayList<Nota>();

	public CaixaEletronico(){
		this(100,50,20,10);
	}
	
	private CaixaEletronico(int ...notas){
		for (int nota : notas) {
			notasDisponiveis.add(new Nota(nota));
		}
	}
	
	public String sacar(double valorDesejado) {
		if (valorDesejado % 10 != 0) {
			throw new RuntimeException("Notas não disponíveis");
		}
 		for (Nota nota : notasDisponiveis) {
			valorDesejado = adicionaNota(nota, valorDesejado);
		}
		return escreveNotas();
	}

	private double adicionaNota(Nota nota, double valorDesejado) {
		int quantidade = (int) (valorDesejado / nota.getValor());
		if (quantidade > 0) {
			nota.setQuantidade(quantidade);
			notasEntregues.add(nota);
		}
		return valorDesejado -= (nota.getValor() * quantidade);
	}

	private String escreveNotas() {
		String retorno = "";
		String prefixo = " e ";
		for (Nota nota : notasEntregues) {
			if (!retorno.isEmpty()) {
				retorno += prefixo;
			}
			
			if (nota.getQuantidade() == 1) {
				retorno += "1 nota de R$" + nota.getValor();
			} else {
				retorno += nota.getQuantidade() + " notas de R$" + nota.getValor();
			}
		}
		return retorno;
	}
}
