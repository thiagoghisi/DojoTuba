
public class CalculadoraDeRomanos {

	public int calcularRomano(String romano) {
		int valor = totalizadorFracionario(romano); 
		
		if(romano.indexOf("L")>romano.indexOf("X")) {
			valor -= contaOcorrenciasDeCaracter(romano,'X')*10;
		}else{
			valor += contaOcorrenciasDeCaracter(romano,'X')*10;
		}
		
		if(romano.contains("I")){
			if(romano.indexOf("V")>romano.indexOf("I") || romano.lastIndexOf("X")>romano.indexOf("I")){
				valor -= contaOcorrenciasDeCaracter(romano,'I');
			}else{
				valor += contaOcorrenciasDeCaracter(romano,'I');
			}
		}
		
		return valor;
	}
	
	private int totalizadorFracionario(String romano){
		int valor = 0;
		if (romano.contains("V")) {
			valor += 5;
		}
		
		if (romano.contains("L")) {
			valor += 50;
		}
		return valor;
	}
	
	private int contaOcorrenciasDeCaracter(String string, char caracter){
		int quantidadeDeCaracter = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==caracter){
				quantidadeDeCaracter++;
			}
		}
		return quantidadeDeCaracter;
	}
	
}
