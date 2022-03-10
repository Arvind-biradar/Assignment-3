class p28{
public static void main(String args[]){
 
 int j=9;
 
 for(int a=1;a<=5;a++){	   
	for(int p=1;p<=5-a;p++){
		System.out.print(" ");		
	}
	   for(int i=1;i<=a;i++){
	   System.out.print("*");	    
	   }
	  System.out.println("");	 
 }
 
    for(int k=4;k>0;k--){	
	for(int q=1 ;q<=5-k;q++){
		System.out.print(" ");
	}
	
	for(int t=1;t<=k;t++){
	   System.out.print("*");
	   }
	System.out.println("");} 
}
}