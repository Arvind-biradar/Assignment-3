import java.util.*;
class p{
public static void main(String [] arg){

Scanner sc=new Scanner(System.in);
System.out.println( "Enter the marks char");
char ch=sc.next().charAt(0);
//char marks=sc.next.charAt(0);
//int s;
//double marks = sc.nextDouble();
//if(40<=marks&&marks<60){
//System.out.println( "Your Grade is 'C'");
//s=1;
//}
  //else if(60<=marks&& marks<75) {
	//  s=2;
	//   System.out.println( "Your Grade is 'B'");
	//}
		//   else if(75<=marks){
			  // s=3;
		  // System.out.println( "Your Grade is 'A'");
		  //}
		    //else
				//s=4;
          //System.out.println( "Invalid");
	  
	  switch(ch){
		   default :System.out.println( "INvalid");break;
		   case 'a':System.out.println( "Your Grade is 'C'");break;
		   case 'b':System.out.println( "INvalid");break;
           case 'c':System.out.println( "Your Grade is 'A'");break;
		   case 'd':System.out.println( "Your Grade is 'B'");break;
	  }

}	 } 
	   
