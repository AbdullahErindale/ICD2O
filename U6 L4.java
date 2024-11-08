class U6 L4 {
   public static void main(String [] args) {
      String w1 = "shellshock";
      String w2 = "shellac";
      String w3 = "fortify";
      
      if (w3.compareTo(w1) < 0) {
        System.out.println(w3);
      } if (w2.compareTo(w1) < 0) {
        System.out.println(w2);
      } if (w1.compareTo(w3) > 0) {
        System.out.println(w1);
      }
      
   }
}
