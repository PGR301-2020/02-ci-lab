import no.pgr301.bowlinggame.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void testNoStrikeNoSpare() {
        Game game = new Game();
        game.roll(5);
        game.roll(4);
        assertEquals(9, game.score());
    }

    @Test
    public void testStrike() {
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        assertEquals(-1, game.score());
    }
}
}
