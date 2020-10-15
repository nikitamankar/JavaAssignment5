/*11)input1="aBrd";
    input2="aqrbA";
    input3=2;
    output1=boolean true;
    2nd char of ip1 and last 2nd char of ip2 show be equal      */
public class Stringmatches11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input1="aBrd";
      String input2="aqrcA";
      int input3=2;
      boolean b=false;
      String s1=String.valueOf(input1.charAt(input3-1));
      System.out.println(s1);
      String s2=String.valueOf(input2.charAt(input2.length()-input3));
      System.out.println(s2);
      if(s1.equalsIgnoreCase(s2)){
    	 b=true; 
      }
      if(b==true)
    	  System.out.println("True");
      else
    	  System.out.println("False");
      
      
	}

}
