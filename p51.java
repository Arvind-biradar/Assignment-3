import java.util.*;
class p51{
public static void main (String args[]){

Scanner sc=new Scanner(System.in);
System.out.print(" ENTER the vatuee to draw piramid block :");
int g=sc.nextInt();


for (int a=1;a<=g;a++){
	for(int b=1;b<=g-a;b++){
		System.out.print(" ");
	}
	for (int c=1;c<=a;c++){
		if(c>=2&&a>=3&&c!=a&&a<=g-1){
			System.out.print("  ");
		}else 
		     System.out.print("* ");

         }
		System.out.println("");
}
}
}						  
	