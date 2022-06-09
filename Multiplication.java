public class  Multiplication {
   public   static   void   main(String  args[]){
       int  x=5;
       for( int  i=0 ;  i <3 ;  i++ )  {  
              for(int  j =1; j<11; j++) {
                   if( i==0)
                       System.out.print(x*j+"\t");
                   if( i==1)
                       System.out.print( j+"\t"); 
                   if( i==2)
                       System.out.print( x+"\t"); 
              }
              System.out.println();
       }
 
}};

