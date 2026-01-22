public class Java1{
     public static void main(String[] args){
		 int i = 0;
		 System.out.println("var :" + i); // 0
		 i++;
		 System.out.println("vara :" + i++); // 1
		 System.out.println("varb :" + i);  // 2
		 ++i;
		 System.out.println("varc :" + i++);  //3
		 System.out.println("vard :" + i++); // 4
		 
		 for(int l=0;l<10;l++){
			 System.out.println("l: " +l);
		 }
		 int j = 10;
		 while(j>0){
			 System.out.println("j: " +j);
			 j--;
		 }
		 int k=10;
		 do{
			 System.out.println("k: "+ k);
			
			k--;
		 }while(k>0);
	 }
}
