import java.util.Arrays;
import java.util.*;
public class practice2 {
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";
        //convert string to lowercase. Why? so that we don't have to check separaely for lower  & uppercase.
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        //first check - if the length are the same
        if(str1.length() == str2.length()) {
            //convert string into char array\
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sort the char aray
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical then the stings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + "  are anagram of each other.");

            } else {
                System.out.println(str1 + "and" + str2 +  " are not anagram of each other.");
            }
        }
            else{
                //case when length are not equal
                System.out.println(str1+ "and" + str2+ " are not anagram of each other.");
            }
        }
    }



