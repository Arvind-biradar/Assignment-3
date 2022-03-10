class p26{
public static void main(String args[]){
 
 int j=1;
 
 for(int a=1;a<=5;a++){
	   
	   for(int k=1;k<=5-a;k++){
	   System.out.print(" ");
	   }
	   for(int i=1;i<=j;i++){
	   System.out.print("*");
	    
	   }
	   j+=2;
	   System.out.println("");
	 
 }
 j=7;
 for(int m=1;m<=4;m++){
	 for(int l=1;l<=m;l++){
	 System.out.print(" ");}
	 for(int n=1;n<=j;n++){
		 System.out.print("*");
	 }
	 System.out.println("");
	 j-=2;
	 
 }
 
}
}