import java.util.*;
public class practice_3 {
public static void fibonacci(int n){
    int num1 = 0, num2 = 1;
    int count = 0;
    //iterate till count is N
    while(count < n){
        //print the number
        System.out.println(num1 + " ");
        //swap
        int num3 = num2 + num1;
        num1 = num2;
        num2 = num3;
        count = count+1;

    }
}
public static void main(String args[]){
    //given number
    int n =10;
    //function call
    fibonacci(n);
}
}
