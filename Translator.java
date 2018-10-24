/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefenC5afvink7;

/**
 *
 * @author Rick
 */
public class Translator {
    
    static final String[] ONE = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};

  public static String controle(String symbol) throws NotAnAA {
    String controleAA = "";
//    int totaal = 0;
    for (int i = 0; i < ONE.length; i++) {
      if (ONE[i].equals(symbol)) {
          controleAA = ONE[i];
//          totaal++;        
      }     
    }
 if (controleAA.equals("")) {
        controleAA = ("Dit is een niet geldige aminozuur: "+symbol);
      }
    return controleAA;
  } 

class NotAnAA extends Exception {

/**
* Overschrijven van de constructor van Exception
*/
  public NotAnAA() {
  /** call van de constructor van de super class: Exception
  */
    super();
  }

  public NotAnAA(String err) {
    super(err);
  }
}
}

