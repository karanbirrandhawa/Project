import java.util.*;

/** 
 *  A class filled with school and personal practice attempts at algorithm
 *  problems involving Arrays and Strings
 */

class ArraysAndStrings {
  
  /** Main method used to test the answers below **/
  public static void main(String[] args) {
  
  
  
  
  // Test for NxN Matrix
  /*
    int[][] matrix = new int[10][10];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = j;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }
    System.out.println("---------------");
    int[][] rotatedMatrix = rotateMatrix(matrix);
 
    for (int i = 0; i < rotatedMatrix.length; i++) {
      for (int j = 0; j < rotatedMatrix[0].length; j++) {
        System.out.print(rotatedMatrix[i][j] + " ");
      }
      System.out.print("\n");
    }
    */
  }
  
  /** Given an NxN matrix, rotate all values in matrix by 90 degrees **/ 
  public static int[][] rotateMatrix (int[][] matrix) {
    int N = matrix[0].length; // get matrix length    
    int[][] rotatedMatrix = new int[N][N];
    
    for (int j = 0; j < N; j++) {
      int newJ = N;
      for (int i = 0; i < N; i++) {
        newJ--;
        rotatedMatrix[j][newJ] = matrix[i][j]; // i.e. [i][0] --> [0][newJ] 
      }    
    }
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

  /** Give a string, remove duplicate characters in string, does not account for upper/lowercase**/ 
  public static String removeDuplicates(String str) {
    StringBuilder builder = new StringBuilder();
    HashMap<Character, Boolean> characterMap = new HashMap<Character, Boolean>();
    char[]characters = str.toCharArray();
    for (int i = 0; i < characters.length; i++) {
      char charAtIndex = characters[i];
      Boolean charExists = characterMap.get(charAtIndex);
      if (charExists != null && charExists) {
        // Do nothing
      } else {
        characterMap.put(charAtIndex, true);
        builder.append(charAtIndex);
      }
    }
    return builder.toString();
  }

  /** Check if two strings are anagrams, accounts for lowercase **/
  public static boolean isAnagram(String str1, String str2) {
    char[] characters1 = str1.toCharArray();
    char[] characters2 = str2.toCharArray();
    if (characters1.length != characters2.length) {
      return false;
    }

    for (int i = 0; i < characters1.length; i++) {
      char char1 = Character.toLowerCase(characters1[i]);
      char char2 = Character.toLowerCase(characters2[characters1.length - i - 1]);
      if (char1 != char2) {
        return false;
      }
    }
    return true;
  }
}