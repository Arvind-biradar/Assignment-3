class p41{
public static void main(String [] arg){
System.out.println("");

for(int a=1;a<=9;a++){
	for(int i=1;i<=9-a;i++){
		System.out.print("  "); 
	         }
           for(int b=1;b<=a;b++){
                System.out.print(b+" ");
                   }
				   for(int d=a;d>1;){
				 System.out.print((--d)+" ");}
System.out.println("");}
}
}