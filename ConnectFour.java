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

  //check the overflow
  // public Boolean noOverflow(){
  //
  // }

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

  public Boolean checkFour() {
    /*
    Logic:
    1. loop through every column (the order matter) to find the first piece
    2. check for each specific player in each direction (down, right, upRight, downRight)
    3. record the number of piece
    4. once the count reach 4, end the game
    */
    int count = 0;//countingt the number of piece in a line

    for (int i = 0; i < 7; i++) {//loop horizontally
      for (int j = 0; j < 6; j++) {//loop vertically

//player a
        if (board[i][j].equals("1")) {//found the 1st piece of player a
          count = 1; //found 1 piece in the line
          for (int k = 1; k < 4; k++) {
            //up-right
            if (j-k > -1) {//to prevent overflow and error
              if (i + k < 7) {
                if (board[i+k][j-k].equals("0")) {//if the next piece found is empty
                  count = 1;//set the count back
                  break;
                }
                else if (board[i+k][j-k].equals("2")) {//if the next piece found is occupied by player b
                  count = 1;//set the count back
                  break;
                }
                else {//if the next piece found is occupied by player a
                  count++;//add a count
                  if (count == 4){//if the count accumulated to 4
                    gameOver = true;//the player win, game over
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i+k][j].equals("2")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("2")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i][j+k].equals("2")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }

//player b
        if (board[i][j].equals("2")) {
          count = 1;
          for (int k = 1; k < 4; k++) {
            //up-right
            if (j-k > -1) {
              if (i + k < 7) {
                if (board[i+k][j-k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j-k].equals("1")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i+k][j].equals("1")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("1")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i][j+k].equals("1")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
      }
    }
    return gameOver;
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
          if (player.equals("a")){
            player = "b";
          }else{
            player = "a";
          }

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



            Boolean ifFour = newGame.checkFour();
            if(ifFour){
              System.out.println("Game over!");
              System.out.println("Player " + player + " win!!!");
              System.out.println("----------------------------");
              break;
            }




          }




  }
}
