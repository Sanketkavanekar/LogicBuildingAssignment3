class Question9{
   public static void main(String[] args){
  
   int number=4825;
   int largest=0;
    while(number>0){

    int digit=number%10;
    if(digit>largest){
       largest=digit;
}
number/=10;

}

System.out.println("largest number is:"+largest);




}   
}