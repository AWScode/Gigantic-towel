/* Library.java created by Mr. Considine
This program holds all of the information for
the Library class. Library builds a record of
all the words in a book and can sort them in any
way the user would like. This class can also
return words that fit the search criteria. */
import java.util.*;

public class Library {

  public ArrayList<String> words;//original list
  public ArrayList<String> orgWords;//organized list

  public Library() {
    this.words = new ArrayList<String>();
    this.orgWords = new ArrayList<String>();

    //Sample
    words.add("once");
    words.add("upon");
    words.add("a");
    words.add("time");
    words.add("there");
    words.add("was");
    words.add("a");
    words.add("girl");
    words.add("who");
    words.add("lived");
    words.add("in");
    words.add("a");
    words.add("beautiful");
    words.add("castle");
    words.add("one");
    words.add("day");
    words.add("the");
    words.add("castle");
    words.add("there");
    words.add("fell");
    words.add("there");
    words.add("down");

  }

  //???????needed??????comparing strings by their alphabetical order
  public static int unicode(String a){
    //converting a String to int in unicode
    char[] uniCharacter = a.toCharArray();
    int uniInt = Integer.parseInt(new String(uniCharacter));


    return uniInt;
  }


  //Sort with Insertion
  public void alphaSort(String[] words){
    for (int i = 1; i < words.length; i++){//start from the 2nd
      String temp;
      if (unicode(words[i]) > unicode(words[i-1])) {
        //stay
      }else if (unicode(words[i]) < unicode(words[i-1])) {
        //move forward until detected bigger than the former
        for (int j = i; j >= 0; j--){
          temp = words[j];//hold the content temperately
          //switch spots
          words[j] = words[j-1];
          words[j-1] = temp;//actually always holding the same thing
          if (unicode(temp) > unicode(words[j-1])) {
            break;
          }
        }

      }else{
        System.out.println("2 items have the same name.");
      }
    }





  }
  //Sort with Selection
  public void wLengthSort(String[] words, String[] orgWords){

    // for (int i = 0; i < words.length-1; i++){
    //   for (int j = i+1; j < words.length; j++)
    //             if (words[j] < words[index])
    //                 index = j;
    //
    //         int smallerNumber = words[index];
    //         words[index] = words[i];
    //         words[i] = smallerNumber;
    // }


    String track  = words[0]; //track the smallest one
    int c = 0;//count
    //find the minimum
    for (int i = 0; i < words.length; i++){
      if (unicode(track) < unicode(words[i])) {
        //stay
        orgWords[c] = track;
        c = c + 1;
      }else if (unicode(track) > unicode(words[i])) {

        track = words[i];
        orgWords[c] = track;
        c = c + 1;
        //remove words[i] from the words[]



      }
    }
  }

  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }

  public ArrayList<String> getTopWords(){
    ArrayList<String> topWords = new ArrayList<String>();

    return topWords;
  }


  public static void main(String[] args) {

    Library myLib = new Library();
    int ttry = unicode("hello");
    System.out.println(ttry);

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("\n");
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: castle : " + Integer.toString(myLib.getWordCount("castle")));
    System.out.println("Word: once : " + Integer.toString(myLib.getWordCount("once")));

  }

}
