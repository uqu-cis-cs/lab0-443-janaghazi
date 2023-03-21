package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;

public class App {

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/



 public static void twisters () {
    for (int x = 1; x<=110; x++) {

        if (x%2 == 0) {
            System.out.print ("tweetle"); 
        }
         if (x%4 == 0) {
            System.out.print ("beetle"); 
        }
         if (x%6 == 0) {
            System.out.print ("poodle"); 
        }
        if (x%2!=0 && x%4!=0 && x%6!=0) {
            System.out.print (" " + x +" " );
        }
        if (x%11==0) {
            System.out.println (""); // new line
        }
        
    }
 }
  
 
public static String phoneKeypad (String str) {
    String sentence = "";
    str = str.toUpperCase();
    for (int i =0; i<str.length(); i++) {
        switch ( str.charAt(i) ){
            // i tried multipe case constant rule switch but it wouldn't run
                case 'A' :
                case 'B' :
                case 'C' :
                    sentence += "2";
                    break;
                case 'D' :
                case 'E' :
                case 'F':
                    sentence += "3";
                    break;
                case 'G' : 
                case 'H' :
                case 'I' :
                    sentence += "4";
                    break;
                case 'J' :
                case 'K' : 
                case 'L':
                    sentence += "5";
                    break;
                case 'M' : 
                case 'N' :
                case 'O':
                    sentence += "6";
                    break;
                case 'P' :
                case 'Q' : 
                case 'R' : 
                case  'S' :
                    sentence += "7";
                    break;
                case 'T' : 
                case 'U' :
                case 'V' :
                    sentence += "8";
                    break;
                case 'W' :
                case 'X' :  
                case 'Y' : 
                case 'Z':
                    sentence += "9";
                    break;

             default :
                    System.out.print ("");
            }

            }
        return sentence;
    }
    
    public static void main (String [] args) { 
        /* Write your code here */
         Scanner keyboard = new Scanner(System.in); 

             //call method twisters()
                 twisters();

                //prompt user to enter a string 
                 System.out.println ("Please enter a line of string");
                 String sentence = keyboard.nextLine();

                //call method phoneKeypad(string)

                 System.out.println( phoneKeypad(sentence));
    }

}