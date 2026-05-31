package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TicTacToeTest {
    @Test
    public void testGetMarker_shouldReturnCorrectMarker(){
        Player player= new Player('X');
        assertEquals('X',player.getMarker());
    }
@Test
    public void testIsCellEmpty_shouldReturnTrue(){
    Board board = new Board();
    assertTrue(board.isCellEmpty(0,0));
}

}
