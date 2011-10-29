import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author 1. Israel, 2. Marcelo Botega (a.k.a Gambá), 3. Cássio, 4. Rafael Paz,
 *         5. Henrique Lauro, 6. Vitor Souza, 7. Rafael Santini, 8. Alvaro, 9. Leonardo,
 *         10. Heitor, 11. Felipe, 12. Robson, 13. Fernando, 14. Arrison, 
 *         15. Max, 16. Vitor França, 17. Thiago Ghisi
 * 
 */
public class CampoMinadoTest {

	static Invocable invocable;

	@BeforeClass
	public static void setUp() {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			engine.eval(new FileReader("campoMinado.js"));
		} catch (Exception e) {
			fail("Não conseguiu carregar arquivo com funcoes javascript!");
			e.printStackTrace();
		}
		invocable = (Invocable) engine;
	}

	@Test
	public void testLerCampoMinado() throws ScriptException,
			NoSuchMethodException {
		String[][] campoMinado = new String[][] { { ".", "*" }, };

		String[][] mapaBombas = new String[][] { { "1", "*" }, };

		String[][] retorno = (String[][]) invocable.invokeFunction(
				"lerCampoMinado", campoMinado);

		assertEquals(mapaBombas, retorno);

	}

	@Test
	public void testeMina2x2() throws ScriptException,
			NoSuchMethodException {
		
		String[][] campoMinado = new String[][] { 
				{ ".", "*" },  
				{ "*", "." }};

		String[][] mapaBombas = new String[][] { 
				{ "2", "*" }, 
				{ "*", "2" }};

		String[][] retorno = (String[][]) invocable.invokeFunction(
				"retornaMapaCampoMinado", campoMinado);

		assertEquals(mapaBombas, retorno);

	}
	
	@Test
	public void testeMapa1x3() throws ScriptException,
			NoSuchMethodException {
		
		String[][] campoMinado = new String[][] { 
				{ ".", "*", "." }};
				

		String[][] mapaBombas = new String[][] { 
				{ "1", "*", "1"}};
				

		String[][] retorno = (String[][]) invocable.invokeFunction(
				"retornaMapaCampoMinado", campoMinado);

		assertEquals(mapaBombas, retorno);

	}
	
	@Test
	public void testeMapa4x4() throws ScriptException,
			NoSuchMethodException {
		
		String[][] campoMinado = new String[][] { 
				{ "*", ".", ".", "." },
				{ ".", ".", ".", "." },
				{ ".", "*", ".", "." },
				{ ".", ".", ".", "." }};
		
		

		String[][] mapaBombas = new String[][] { 
				{ "*", "1", "0", "0" },
				{ "2", "2", "1", "0" },
				{ "1", "*", "1", "0" },
				{ "1", "1", "1", "0" }};
				

		String[][] retorno = (String[][]) invocable.invokeFunction(
				"retornaMapaCampoMinado", campoMinado);

		assertEquals(mapaBombas, retorno);

	}
	
//	@SuppressWarnings("unused")
//	@Test
//	public void testeTemBombasAoRedor() throws ScriptException,
//			NoSuchMethodException {
//
//		String[][] campoMinado = new String[][] { 
//				{ "*", ".", ".", "." },
//				{ ".", ".", ".", "." },
//				{ ".", "*", ".", "." },
//				{ ".", ".", ".", "." }};
//		
//		Double retorno = (Double) invocable.invokeFunction(
//				"contaBombasAoRedor", campoMinado, 0, 1);
//
//		assertEquals( new Double(1), retorno);
//		
//		retorno = (Double) invocable.invokeFunction(
//				"contaBombasAoRedor", campoMinado, 1, 1);
//
//		assertEquals( new Double(2), retorno);
//		
//	}

	@Test
	public void testeTemBombasAoRedor() throws ScriptException,
			NoSuchMethodException {

		String[][] campoMinado = new String[][] { 
				{ "*", ".", "." },
				{ ".", ".", "."},
				{ ".", "*", "."},
				};
		
		Double retorno = (Double) invocable.invokeFunction(
				"contaBombasAoRedor", campoMinado, 1, 1);

		assertEquals( new Double(2), retorno);
		
	}

	@Test
	public void testeTemBombasAoRedor2() throws ScriptException,
			NoSuchMethodException {

		String[][] campoMinado = new String[][] { 
				{ "*", "*", "*" },
				{ "*", ".", "*"},
				{ "*", "*", "*"},
				};
		
		Double retorno = (Double) invocable.invokeFunction(
				"contaBombasAoRedor", campoMinado, 1, 1);

		assertEquals( new Double(8), retorno);
		
	}

	@Test
	public void testeTemBombasAoRedor3() throws ScriptException,
			NoSuchMethodException {

		String[][] campoMinado = new String[][] { 
				{ "."},
				};
		
		Double retorno = (Double) invocable.invokeFunction(
				"contaBombasAoRedor", campoMinado, 0, 0);

		assertEquals( new Double(0), retorno);
		
	}
	
	
	// @Test
	// public void testGetTrueValue() throws ScriptException,
	// NoSuchMethodException {
	// Boolean bTrue = (Boolean) invocable.invokeFunction("getTrueValue");
	// assertTrue("Deve retornar um boolean true", bTrue.booleanValue());
	// }
	//
	// @Test
	// public void testSum() throws ScriptException, NoSuchMethodException {
	// Double sum = (Double) invocable.invokeFunction("sum", 1, 2);
	// assertEquals(new Double(3.0), sum);
	// }
	//
}
