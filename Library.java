/* Library.java created by Mr. Considine
This program holds all of the information for
the Library class. Library builds a record of
all the words in a book and can sort them in any
way the user would like. This class can also
return words that fit the search criteria. */
import java.util.*;
import java.io.*;

public class Library {

  public ArrayList<String> words;//original list
  public ArrayList<String> sortList;//organized list

  public Library() {
    this.words = new ArrayList<String>();
    this.sortList = new ArrayList<String>();

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

  public int findLength(String a){
    int length = a.length();
    return length;
  }



  public void printList(ArrayList<String> printL){
    for (int i = 0; i <= printL.size(); i++) {
      String tempForPrint = printL.get(i);
      System.out.println(tempForPrint);
    }
  }

  public ArrayList<String> mergeSort(ArrayList<String> words){
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    int high = words.size();//number of item in the list
    int low = 0;
    int mid = (high - low)/2;
    //int trackWhenToStop = high;//default

    if (high == 1) {//if there is only one term
      return words;
    }else if (high < 1){
      System.out.println("The list doesn't exist");
    }else{
      //splitting part
      while(true){
        //split
        high = high/2;
        //add items into new ArrayList
        for (int i = low; i <= mid; i++) {
          a.set(i, words.get(i));
        }
        for (int j = mid + 1; j <= high; j++) {
          b.set(j, words.get(j));
        }

        if (high == 1) {
          break;
        }
      }

      //merging part
      ArrayList<String> c = new ArrayList<String>();
      int ii = 0;
      int jj = 0;

      while(true){
        if(findLength(a.get(ii)) < findLength(b.get(jj))){
          c.add(a.get(ii));
          ii++;
        }else{
          jj++;
        }
        if (jj == b.size()) {
          c.add(b.get(jj));
        }
      }
      //it reported error after successfully compiled
      //really don't know if it works...........
      //seems like it doesn't



    }


    return c;
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
  public ArrayList<String> wLengthSort(ArrayList<String> words, ArrayList<String> sortList){


    ArrayList<String> tempList = new ArrayList<String>();
    for (int h = 0; h < words.size(); h++ ) {//duplicating the list
      //purpose: to keep the length of the original list
      tempList.set(h, words.get(h));
    }

    for (int i = 0; i < words.size(); i++ ) {//number of minumum we need
      String min = tempList.get(0);//track the minumum, always start from the 1st item
      for (int j = 0; j < tempList.size() ; j++ ) {//the method to find the minimum
        if (min.length() > tempList.get(j).length()) {
          min = tempList.get(j);
        }
      }
      tempList.remove(min);
      sortList.add(min);
    }
    return sortList;
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

  public void readNewBook(String filename){
    File newBook = new File(filename);
    try{
      FileReader fr = new FileReader(newBook);
    }
    catch (FileNotFoundException e){
      System.out.println("The file is not found.");
    }
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

    myLib.readNewBook("Emma");



  }

}
