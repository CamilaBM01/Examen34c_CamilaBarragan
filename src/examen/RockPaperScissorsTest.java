package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	RockPaperScissors r1 = new RockPaperScissors();

	@Test
	void CP1() {
		String resultadoEsperado="It's a tie!";
		String resultadoObtenido= r1.checkGame("Rock", "Rock");
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	@Test
	void CP2() {
		
		String resultadoEsperado="You win this round!";
		String resultadoObtenido= r1.checkGame("Scissors","Rock");
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		
	}
	@Test
	void CP3() {
		String resultadoEsperado="You win this round!";
		String resultadoObtenido= r1.checkGame("Rock","Paper");
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		
	}
	
	@Test
	void CP4() {
		String resultadoEsperado="You win this round!";
		String resultadoObtenido= r1.checkGame("Paper","Scissors");
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		
	}
	

}
