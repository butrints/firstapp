public class forloop {
     public static void main(String[] args){

         System.out.println("BEGIN");

         for(int i=0; i<14; i++){

             System.out.println(i);
             if(i==8){
                 continue;
             }
         }
         System.out.println("END");
     }
}

