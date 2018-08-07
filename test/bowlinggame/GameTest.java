package bowlinggame;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GameTest {
	@InjectMocks
	private Game game;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	private void rollMany(int n, int pins) {
		for(int i = 0; i < n; i++) {
			game.roll(pins);
		}
	}
	@Test
	public void testGutterGame() throws Exception {
		rollMany(20, 0);
		assertEquals(0, game.score());
	}
	@Test
	public void testAllOnes() throws Exception {
		rollMany(20, 1);
		assertEquals(20, game.score());
	}
	@Test
	public void testOneSpare() throws Exception {
		game.roll(5);
		game.roll(5);
		game.roll(3);
		rollMany(17, 0);
		assertEquals(16, game.score());
	}
}
