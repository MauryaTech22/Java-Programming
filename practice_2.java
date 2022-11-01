public class practice_2 {



    public static void main(String args[]) {

        //convert uppercase character to lowercae
        for(char ch ='A'; ch<='Z'; ch++){
            System.out.println((char)(ch | ' ' ));
//prints abcdefghijklmnopqrstuvwxyz
        }

    }
}
//        int x = 6;
//        System.out.println(x + "+" + 1 + " is " + -~x);
//        x = -4;
//        System.out.println(x + "+ " + 1 + " is " + -~x);
//        x = 0;
//        System.out.println(x + " + " + 1 + "is " + -~x);
//
//    }
//}


//
//        int x= 3, y=4;
//        System.out.println("Before sqwap: x= "+ x +"and y= "+y);
//        //swap using xor
//        x=x^y;
//        y=x^y;
//        x=x^y;
//        System.out.println("After swqap: x=" + x + "and y = " + y);
//    }
//}
