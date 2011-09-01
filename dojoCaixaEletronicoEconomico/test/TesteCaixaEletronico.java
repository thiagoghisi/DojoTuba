import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TesteCaixaEletronico {
	
	CaixaEletronico caixa;
	
	@Before
	public void setUp(){
		caixa = new CaixaEletronico();	
	}
	
	@Test
	public void sacarDez(){
		Assert.assertEquals("1 nota de R$10.0", caixa.sacar(10.0));
	}
	
	@Test
	public void sacarVinte(){
		Assert.assertEquals("1 nota de R$20.0", caixa.sacar(20.0));
	}
	
	@Test
	public void sacarTrinta(){
		Assert.assertEquals("1 nota de R$20.0 e 1 nota de R$10.0", caixa.sacar(30.0));
	}

	@Test
	public void sacarQuarenta(){
		Assert.assertEquals("2 notas de R$20.0", caixa.sacar(40.0));
	}

	@Test
	public void sacarCinquenta(){
		Assert.assertEquals("1 nota de R$50.0", caixa.sacar(50.0));
	}

	@Test
	public void sacarSessenta(){
		Assert.assertEquals("1 nota de R$50.0 e 1 nota de R$10.0", caixa.sacar(60.0));
	}
	
	@Test
	public void sacarSetenta(){
		Assert.assertEquals("1 nota de R$50.0 e 1 nota de R$20.0", caixa.sacar(70.0));
	}
	
	@Test
	public void sacarOitenta(){
		Assert.assertEquals("1 nota de R$50.0 e 1 nota de R$20.0 e 1 nota de R$10.0", caixa.sacar(80.0));
	}
	
	@Test
	public void sacarNoventa(){
		Assert.assertEquals("1 nota de R$50.0 e 2 notas de R$20.0", caixa.sacar(90.0));
	}

	@Test
	public void sacarCem(){
		Assert.assertEquals("1 nota de R$100.0", caixa.sacar(100.0));
	}
	
	@Test
	public void sacarCentoVinte(){
		Assert.assertEquals("1 nota de R$100.0 e 1 nota de R$20.0", caixa.sacar(120.0));
	}

	@Test (expected = RuntimeException.class)
	public void sacarCinquentaCinco(){
		caixa.sacar(55.0);
		Assert.fail("O caixa deveria não permitir (lançar uma exception) valores que não são multiplos de 10!");
	}
	
	@Test
	public void sacarUmMilEOitocentosETrinta(){
		Assert.assertEquals("18 notas de R$100.0 e 1 nota de R$20.0 e 1 nota de R$10.0", caixa.sacar(1830.0));
	}
}
