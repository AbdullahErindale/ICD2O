class U6_L15 {
  public static void main(String [] args) {
    int min = 1;
    int max = 3;
    char output = 0;
    double N = 0;
    for (int i = 0; i < 10; i++) {
      N = (int) (max * Math.random()) + min;
    }
    if (N == 1){
      output = 's';
    }
    if (N == 2){
      output = 'p';
    }
    if (N == 3){
      output = 'r';
    }
    System.out.println(output);
  }
}
