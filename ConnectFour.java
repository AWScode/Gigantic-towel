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
    this.column2[5] = "0";

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

  public void addPiece(int colNum, String player) {
      //Place a piece in the column that is passed in.
      //Find the lowest possible empty space and fill.
      //The largest row number that is empty.
      String q  = "99";//default
      if(player.equals("a")){
        q = "1";
      }
      if(player.equals("b")){
        q = "2";
      }

      //System.out.println(player);
        if(board[colNum][5].equals("0")){
          board[colNum][5] = q;
        }else{
          for (int i = 0; i <= 5; i++) {
            //read the status of the position
            //System.out.println(board[colNum][i]);
            if(board[colNum][i].equals("1")||board[colNum][i].equals("2")){
              //change the upper one to "1"

              board[colNum][i-1] = q;
              break;
            }
          }
        }


  }

  public Boolean checkFourVertical() {
    int x = 0;
    int y = 0;
    Boolean isFour = false;
    int countinga = 0;//default
    int countingb = 0;//default


    for (int i = 0; i < 7; i++) { // i=横着的
      for (int j = 0; j < 6; j++) { // j=竖着的
        x = i;
        y = j;

        if(board[x][y].equals("1")){
             countinga = 1;
             for(int c = 1; c <= y; c++){

                 if (board[x][y-c].equals("1")){
                   countinga = countinga + 1;
                   if (countinga >= 4) {
                     System.out.println("down -- Player a won");
                     isFour = true;
                   }
                 }
              }
        }

        if(board[x][y].equals("2")){
             countingb = 1;
             for(int c = 1; c <= y; c++){

                 if (board[x][y-c].equals("2")){
                   countingb = countingb + 1;
                   if (countingb >= 4) {
                     System.out.println("down -- Player b won");
                     isFour = true;
                   }
                 }
              }
        }





      }
    }


    return isFour;
  }

  public Boolean checkFourHorizontal() {
    int x = 0;
    int y = 0;
    Boolean isFour = false;
    int countinga = 0;//default
    int countingb = 0;//default


    for (int i = 0; i < 7; i++) { // i=横着的
      for (int j = 0; j < 6; j++) { // j=竖着的
        x = i;
        y = j;

        if(board[x][y].equals("1")){
             countinga = 1;
             for(int c = 1; c <= 6-x; c++){

                 if (board[x+c][y].equals("1")){
                   countinga = countinga + 1;
                   if (countinga >= 4) {
                     System.out.println("down -- Player a won");
                     isFour = true;
                   }
                 }
              }
        }

        if(board[x][y].equals("2")){
             countingb = 1;
             for(int c = 1; c <= 6-x; c++){

                 if (board[x+c][y].equals("2")){
                   countingb = countingb + 1;
                   if (countingb >= 4) {
                     System.out.println("down -- Player b won");
                     isFour = true;
                   }
                 }
              }
        }





      }
    }


    return isFour;
  }








  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();


          System.out.println("  ----Which player are you?----");
          System.out.println("  press a - player a");
          System.out.println("  press b - player b");
          System.out.println("  -------------------------------");

          System.out.print("  "); Scanner q1 = new Scanner(System.in);
          String player =  q1.next();

          while (true){




            if (player.equals("a")){
              player = "b";
            }else{
              player = "a";
            }
            System.out.println("======Player " + player + "'s turn======");


            System.out.println("  ----Insert (1 - 7) the column number that you want to place the piece----");
            System.out.print("  "); Scanner q2 = new Scanner(System.in);
            int colNumBeforeAdjusted =  q2.nextInt();// colNum = the input column number
            //System.out.println(colNum);
            int colNum = colNumBeforeAdjusted - 1;
            // System.out.println(colNumBeforeAdjusted);
            // System.out.println(colNum);
            newGame.addPiece(colNum, player);
            newGame.displayBoard();



            Boolean ifFourDown = newGame.checkFourVertical();
            Boolean ifFourRight = newGame.checkFourHorizontal();
            Boolean ifFourDownRight = newGame.checkFourDownRight();
            Boolean ifFourUpRight = newGame.checkFourUpRight();
            if(ifFourDown || ifFourRight || ifFourDownRight || ifFourUpRight){
              break;
            }




          }











  }
}
