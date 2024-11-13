class strings {
   public static void main(String [] args) {
      String w1 = "shellshock";
      String w2 = "shellac";
      String w3 = "fortify";
      
      if ((w3.compareTo(w1) < 0) && (w3.compareTo(w2) < 0)) {
        System.out.println(w3);
      } 
      if ((w2.compareTo(w1) < 0) && (w2.compareTo(w3) < 0)) {
        System.out.println(w2);
      } 
      if ((w1.compareTo(w2) < 0) && (w1.compareTo(w3) < 0)) {
        System.out.println(w1);
      }
      if ((w1.compareTo(w2) > 0) && (w1.compareTo(w3) < 0)) {
        System.out.println(w1);
      }
      if ((w1.compareTo(w2) < 0) && (w1.compareTo(w3) > 0)) {
        System.out.println(w1);
      }
      if ((w2.compareTo(w1) > 0) && (w2.compareTo(w3) < 0)) {
        System.out.println(w2);
      }
      if ((w2.compareTo(w1) < 0) && (w2.compareTo(w3) > 0)) {
        System.out.println(w2);
      }
      if ((w3.compareTo(w1) > 0) && (w3.compareTo(w2) < 0)) {
        System.out.println(w3);
      }
      if ((w3.compareTo(w1) < 0) && (w3.compareTo(w2) > 0)) {
        System.out.println(w3);
      }
      if ((w1.compareTo(w2) > 0) && (w1.compareTo(w3) > 0)) {
        System.out.println(w1);
      }
      if ((w2.compareTo(w1) > 0) && (w2.compareTo(w3) > 0)) {
        System.out.println(w2);
      }
      if ((w3.compareTo(w1) > 0) && (w3.compareTo(w2) > 0)) {
        System.out.println(w3);
      }
   }
}
