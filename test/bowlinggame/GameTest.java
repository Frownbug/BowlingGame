package bowlinggame;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GameTest {
	@Mock
	private Game game;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void scoreShouldReturnCurrentGameScore() {
		assertEquals(0, game.score);
	}
}
