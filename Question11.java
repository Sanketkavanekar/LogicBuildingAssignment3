class Question11{
    public static void main(String [] args){
   
    int a=12;
    int b=34;
    int c=32;
    int d=++a + b-- + --c + a++ - --b + c++;
    System.out.println(d+ "," +a+ "," +b+ "," +c);
    
}
   }