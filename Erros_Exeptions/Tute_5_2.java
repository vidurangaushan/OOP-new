package Erros_Exeptions;

public class Tute_5_2 {
	
		 static int divide(String s1[]) { int x,y;
		 x = Integer.parseInt(s1[0]);
		 y = Integer.parseInt(s1[1]);
		 return x/y;
		 }
		 public static void main (String args[ ]) {
		 String a[] = {"10", "0"};
		 System.out.println(a[0]+"/"+a[1]+" = "+divide(a));
		 }
		 
}
