import java.util.*;

/** 
 *  A class filled with school and personal practice attempts at algorithm
 *  problems involving Arrays and Strings
 */

class ArraysAndStrings {
  
  /** Main method used to test the answers below **/
  public static void main(String[] args) {
    if (isUnique(str)) {
      System.out.println("Unique String");
    } else {
      System.out.println("Not a unique string");
    }
  }
  
  /** Given an NxN matrix, rotate all values in matrix by 90 degrees **/ 
  private int[][] rotateMatrix (int[][] matrix) {
    int N = matrix[0].length; // get matrix length
    
    int[][] rotatedMatrix = new int[N][N];

    return rotatedMatrix; // return the new, rotated matrix
  }

  /** Given a String, determine if it has all unique chars **/
  public static boolean isUnique(String str) {
    char[] characters = str.toCharArray();
    HashMap<Character,Boolean> characterMap;
    characterMap = new HashMap<Character,Boolean>();
    for (int i = 0; i < characters.length; i++) {
      char charAtIndex = characters[i];
      Boolean charExists = characterMap.get(charAtIndex);
      if (charExists != null && charExists) {
        return false;
      } else {
        characterMap.put(charAtIndex, true);
      }
    }
    return true;      
  }

  /** Give a string, remove duplicate characters in string **/ 
}