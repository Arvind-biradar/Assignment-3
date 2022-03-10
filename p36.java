  		class p36{
public static void main(String args[]){
 

 for(int r=1;r<=5;r++){	   
	  for(int f=1;f<=5-r;f++){
		  System.out.print(" ");
	  }
	   for(int c=1;c<=r;c++){
		   		   
		  if(c>=2&&r>=3&&c!=r&&r!=5){
		   System.out.print(" ");
		   }
		   else 
                  System.out.print("*");
	    }
	   System.out.println("");	 
 } 

		}}