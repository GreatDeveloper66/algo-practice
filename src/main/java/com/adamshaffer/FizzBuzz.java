package com.adamshaffer;

public class FizzBuzz {
    private FizzBuzz() {
        /* This utility class should not be instantiated */
    }


    public static String fizzBuzz(int i) {
        StringBuilder resultStringBuilder = new StringBuilder();
        for(int j = 1;j <= i;j++) {
            if(j % 3 == 0 && j % 5 == 0) {
                resultStringBuilder.append("FizzBuzz\n");
            } else if(j % 3 == 0) {
                resultStringBuilder.append("Fizz\n");
            } else if(j % 5 == 0) {
                resultStringBuilder.append("Buzz\n");
            } else {
                String strInteger = Integer.toString(j);
                resultStringBuilder.append(strInteger);  
                resultStringBuilder.append("\n"); 
            }
        }
        
        return resultStringBuilder.toString();
    }

}
