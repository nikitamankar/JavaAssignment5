import java.util.StringTokenizer;

/*6)String format : CTS-LLL-XXXX
    ip1: CTS-hyd-1234
    ip2: hyderabad
    -> LLL must be first 3 letters of ip2.
    -> XXXX must be a 4-digit number       */
public class StringValidate06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input1="CTS-hyd-123n";
        String input2="hyderabad";
        StringTokenizer st=new StringTokenizer(input1,"-");
       String s =st.nextToken();
       System.out.println(s);
        String s1=st.nextToken();
        System.out.println(s1);
        String s2=st.nextToken();
        System.out.println(s2);
        
       
        int n=0;
        String s3=input2.substring(0, 3);
        if((s.equals("CTS"))&&(s1.matches(s3))){
        	for(int i=0;i<s2.length();i++){
        		char c=s2.charAt(i);
        	if(Character.isDigit(c)){
               n++;
        	} else{
            	   n=0;
        	}
          }
        	System.out.println(n);
	}
       
        
        if(n==4)
         System.out.println("String format is CTS-LLL-XXXX ");
         else
		System.out.println("String format is not CTS-LLL-XXXX ");
	
      
	}

}
