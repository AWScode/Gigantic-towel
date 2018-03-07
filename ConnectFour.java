//Kitty Liu
//ConnectFour Game
//Due day: 2018.3.10 (?)

import java.util.*;

public class ConnectFour {

  //Instance Variables here
  String[][] board;
  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public ConnectFour() {
    //Constructor Method here
    this.column1 = new String[6];
    this.column1[0] = "0";
    this.column1[1] = "0";
    this.column1[2] = "0";
    this.column1[3] = "0";
    this.column1[4] = "0";
    this.column1[5] = "0";

    this.column2 = new String[6];
    this.column2[0] = "0";
    this.column2[1] = "0";
    this.column2[2] = "0";
    this.column2[3] = "0";
    this.column2[4] = "0";
    this.column2[5] = "2";

    this.column3 = new String[6];
    this.column3[0] = "0";
    this.column3[1] = "0";
    this.column3[2] = "0";
    this.column3[3] = "0";
    this.column3[4] = "0";
    this.column3[5] = "0";

    this.column4 = new String[6];
    this.column4[0] = "0";
    this.column4[1] = "0";
    this.column4[2] = "0";
    this.column4[3] = "0";
    this.column4[4] = "0";
    this.column4[5] = "0";

    this.column5 = new String[6];
    this.column5[0] = "0";
    this.column5[1] = "0";
    this.column5[2] = "0";
    this.column5[3] = "0";
    this.column5[4] = "0";
    this.column5[5] = "0";

    this.column6 = new String[6];
    this.column6[0] = "0";
    this.column6[1] = "0";
    this.column6[2] = "0";
    this.column6[3] = "0";
    this.column6[4] = "0";
    this.column6[5] = "0";

    this.column7 = new String[6];
    this.column7[0] = "0";
    this.column7[1] = "0";
    this.column7[2] = "0";
    this.column7[3] = "0";
    this.column7[4] = "0";
    this.column7[5] = "0";

    this.board = new String[7][6];
    this.board[0] = column1;
    this.board[1] = column2;
    this.board[2] = column3;
    this.board[3] = column4;
    this.board[4] = column5;
    this.board[5] = column6;
    this.board[6] = column7;

    this.gameOver = false;
  }

  // Get and Set Methods here
  public void getPiece(){

  }

  // Other methods here
  public void displayBoard(){
    for (int j = 0; j < 6; j++) {
      String row = "";
      for (int i = 0; i < 7; i++) {
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }

  public void addPiece() {
      //Place a piece in the column that is passed in.
      //Find the lowest possible empty space and fill.
      //The largest row number that is empty.

      System.out.println("  ----Which player are you?----");
      System.out.println("  press a - player 1");
      System.out.println("  press b - player 2");
      System.out.println("  -------------------------------");

      System.out.print("  "); Scanner q1 = new Scanner(System.in);
      String player =  q1.next();

//--------for first player-----------
      if(player.equals("a")){
        System.out.println("  ----Insert (1 - 7) the column number that you want to place the piece----");
        System.out.print("  "); Scanner q2 = new Scanner(System.in);
        int colNumBeforeAdjusted =  q2.nextInt();// colNum = the input column number
        //System.out.println(colNum);
        int colNum = colNumBeforeAdjusted - 1;
        // System.out.println(colNumBeforeAdjusted);
        // System.out.println(colNum);

        if(board[colNum][5].equals("0")){
          board[colNum][5] = "1";
        }else{
          for (int i = 5; i >= 0; i--) {
            //read the status of the position
            //System.out.println(board[colNum][i]);
            if(board[colNum][i].equals("1")||board[colNum][i].equals("2")){
              //change the upper one to "1"
              board[colNum][i-1] = "1";
              break;
            }else{
              System.out.print("This column has no space");
            }
          }
        }

      }
//--------for second player-----------
      if(player.equals("b")){
        System.out.println("  ----Insert (1 - 7) the column number that you want to place the piece----");
        System.out.print("  "); Scanner q2 = new Scanner(System.in);
        int colNumBeforeAdjusted =  q2.nextInt();// colNum = the input column number
        //System.out.println(colNum);
        int colNum = colNumBeforeAdjusted - 1;
        // System.out.println(colNumBeforeAdjusted);
        // System.out.println(colNum);

        if(board[colNum][5].equals("0")){
          board[colNum][5] = "2";
        }else{
          for (int i = 5; i >= 0; i--) {
            //read the status of the position
            //System.out.println(board[colNum][i]);
            if(board[colNum][i].equals("1")||board[colNum][i].equals("2")){
              //change the upper one to "1"
              board[colNum][i-1] = "2";
              break;
            }else{
              System.out.print("This column has no space");
            }
          }
        }

      }

  displayBoard();




  }

  public void checkFour() {
    //record a variable to track the position
    //String position = board [0][0]; //start from the top left

/*
    int positionX = 0;
    int positionY = 0;
    Boolean occupied = false;
    Boolean isFour = false;
    int numberOfPiece = 0;
    //maybe
    String direction = ; //down, right, upRight, downRight

    //check if there is a piece
    //check 1 and 2 separately


    //finding the position of the first piece
    for (int i = 0; i < 7; i++) { // i=横着的
      for (int j = 0; j < 6; j++) { // j=竖着的
        positionX = i;
        positionY = j;
        board [positionX][positionY];
          //if(position.equals("1")){ //check if there is a piece

            //record the #
            numberOfPiece = numberOfPiece +1;

            //look for the adjacent piece
              //down

              //right

              //upRight

              //downRight



          }
      }
      */
    }






  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
    newGame.addPiece();
  }
}
