package edu.calpoly.csc305.lab1a;

class Example {
  private int[] nums = {1, 3, 5};
  private static final String NAME = "Lemar";

  boolean sameName(String other) {
    return other.equals(NAME);
  }

  public int[] getNums() {
    return nums;
  }
}  
