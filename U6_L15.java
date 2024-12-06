class U6_L15 {
  public static void main(String [] args) {
    int min = 1;
    int max = 10;
    double N = 0;
    for (int i = 0; i < 10; i++) {
      N = (int) (max * Math.random()) + min;
      System.out.printf("%.0f\n", N);
    }
  }
}
