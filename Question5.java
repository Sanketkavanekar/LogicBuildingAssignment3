class Question5{
    public static void main(String [] args){
 int n=21;
 if(n<=1){
  System.out.println("1");
}
 int a=0;
 int b=1;
   
 for (int i=2;i<=21;i++){
    int temp=a+b;
    a=b;
    b=temp;
 

}  
System.out.println(b);
}

    




    }
   