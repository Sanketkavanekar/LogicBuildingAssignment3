class Question6{
   public static void main(String[] args){
    
   
   int countprimes = 0;
   int i = 2;
   int count ; 
   while (countprimes < 5) {
       count = 0;
      for (int j = 2; j <= i / 2; j++) {
              if (i % j == 0) {
                   count++; 
                    break;

}   
}
    if (count == 0) {
         System.out.println(i);
         countprimes++;
       }
      i++;
}
}
}