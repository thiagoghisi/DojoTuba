import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TesteCalculoNumerosRomanos {
	
	CalculadoraDeRomanos calculadora;
	
	@Before
	public void setUp() {
		calculadora = new CalculadoraDeRomanos();		
	}
	
	@Test
	public void deveRetornarUm(){
		Assert.assertEquals(1, calculadora.calcularRomano("I"));
	}
	
	@Test
	public void deveRetornarDois(){
		Assert.assertEquals(2, calculadora.calcularRomano("II"));
	}

	@Test
	public void deveRetornarTres(){
		Assert.assertEquals(3, calculadora.calcularRomano("III"));
	}
	
	@Test
	public void deveRetornarQuatro(){
		Assert.assertEquals(4, calculadora.calcularRomano("IV"));
	}
	
	@Test
	public void deveRetornarCinco(){
		Assert.assertEquals(5, calculadora.calcularRomano("V"));
	}
	
	@Test
	public void deveRetornarSeis(){
		Assert.assertEquals(6, calculadora.calcularRomano("VI"));
	}		
	
	@Test
	public void deveRetornarSete(){
		Assert.assertEquals(7, calculadora.calcularRomano("VII"));
	}	
	
	@Test
	public void deveRetornarOito(){
		Assert.assertEquals(8, calculadora.calcularRomano("VIII"));
	}	
	
	@Test
	public void deveRetornarNove(){
		Assert.assertEquals(9, calculadora.calcularRomano("IX"));
	}
	
	@Test
	public void deveRetornarDez(){
		Assert.assertEquals(10, calculadora.calcularRomano("X"));
	}
	
	@Test
	public void deveRetornarOnze(){
		Assert.assertEquals(11, calculadora.calcularRomano("XI"));
	}
	@Test
	public void deveRetornarQuatorze(){
		Assert.assertEquals(14, calculadora.calcularRomano("XIV"));
	}
	
	@Test
	public void deveRetornarQuinze(){
		Assert.assertEquals(15, calculadora.calcularRomano("XV"));
	}
	
	@Test
	public void deveRetornarDezoito(){
		Assert.assertEquals(18, calculadora.calcularRomano("XVIII"));
	}
	
	@Test
	public void deveRetornarDezenove(){
		Assert.assertEquals(19, calculadora.calcularRomano("XIX"));
	}
	
	@Test
	public void deveRetornarVinte(){
		Assert.assertEquals(20, calculadora.calcularRomano("XX"));
	}
	
	@Test
	public void deveRetornarVinteDois(){
		Assert.assertEquals(22, calculadora.calcularRomano("XXII"));
	}
	
	@Test
	public void deveRetornarVinteSeis(){
		Assert.assertEquals(26, calculadora.calcularRomano("XXVI"));
	}
	
	@Test
	public void deveRetornarVinteOito(){
		Assert.assertEquals(28, calculadora.calcularRomano("XXVIII"));
	}
	
	@Test
	public void deveRetornarVinteNove(){
		Assert.assertEquals(29, calculadora.calcularRomano("XXIX"));
	}
	
	@Test
	public void deveRetornarTrinta(){
		Assert.assertEquals(30, calculadora.calcularRomano("XXX"));
	}
	
	@Test
	public void deveRetornarQuarenta(){
		Assert.assertEquals(40, calculadora.calcularRomano("XL"));
	}
	
}
