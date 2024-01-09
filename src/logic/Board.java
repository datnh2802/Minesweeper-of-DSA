package logic;

import java.util.Random;
import java.util.Stack;

public class Board {
    public static final int NUM_ROWS = 15;
    public static final int NUM_COLUMNS = 20;
    public static final int NUM_MINES = NUM_ROWS * NUM_COLUMNS / 8;
    public int remainingMines;

    public Square[][] square;
  public Stack<boolean[][]> undoList ;

  public Board() {
    boolean[][] squaresStats ;
    undoList = new Stack<>();
    remainingMines=NUM_MINES;
    square = new Square[NUM_ROWS][NUM_COLUMNS];
    squaresStats = new boolean[NUM_ROWS][NUM_COLUMNS];

    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square[0].length; j++) {
        square[i][j] = new Square();
        //squaresStats[i][j]=square[i][j].isOpen();
      }
    }
    //undoList.push(squaresStats);// save opened and unopened status
