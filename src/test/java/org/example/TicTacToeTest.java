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
@Test
    public void place_shouldPutMarkerInCorrectPosition_Positive(){
        Board board = new Board();
        board.place(0,0,'X');
        assertEquals('X',board.getCells()[0][0],"Cell should contain X");
}
@Test
    public void place_shouldNotPutWrongMarker_Negative(){
        Board board=new Board();
        board.place(1,1,'0');
        assertNotEquals('X',board.getCells()[1][1],"Cell should not contain X");
    }

    @Test
    public void clear_shouldEmptyAllCells_Positive(){
        Board board =new Board();
        board.place(1,1,'X');
        board.clear();
        assertTrue(board.isCellEmpty(1,1),"Board should be empty after clear");
    }
    @Test
    public void clear_ShouldNotBeEmptyBeforeCallingClear_Negative(){
        Board board = new Board();
        board.place(2,2,'0');
        assertFalse(board.isCellEmpty(2,2),"Cell should not be empty before clear");
    }
}
