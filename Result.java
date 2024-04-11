package org.example;


public class Result {


        public static int factorial(int n) {

            if(n>1){
              return n*factorial(n-1);
            }
            else return  1;
        }

}
