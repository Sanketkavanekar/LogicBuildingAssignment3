class Question21{
   public static void main(String[] args){

   int rows=5;
   for(int i=1;i<=rows;i++){
      int count=1; 
      for(int j=1;j<=i;j++){
        System.out.print(count);
       if(j<i){
           System.out.print("*");

    }
 count+=2;    

       
    }
System.out.println();

}
}
}