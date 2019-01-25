package edu.cnm.deepdive.projecteuler;

public class Problem1 {

  public static void main(String[] args) {
    System.out.println(fizzBuzzSum(1,1000));
  }
    public static long fizzBuzzSum ( int start, int end ){

      long sum = 0;
      //TODO Iterate from start (inclusive) to end (exclusive); if current value
      // is divisible by 3 or 5, add it so sum.

      for (int i = start; i < end; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
          sum = sum + i;
        }
      }

      return sum;

    }
  }

