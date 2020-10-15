import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
/*15)Input1=845.69, output=3:2;
    Input1=20.789; output=2:3;
    Input1=20.0; output=2:1;  
    output is in Hashmap format.
    Hint: count the no of digits.      */
public class digits15 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Double, String> m1=new HashMap<Double, String>();
        m1.put(845.79, "Input1");
        m1.put(20.789, "Input2");
        m1.put(20.0, "Input3");
         Iterator<Double> i=m1.keySet().iterator();
         while(i.hasNext()){
        	  String s1=i.next().toString();
        	  System.out.print(s1+"         ");
        	  StringTokenizer st=new StringTokenizer(s1,".");
        	  String s2=st.nextToken();
              String s3=st.nextToken();
        	  int n=s2.length();
        	  int m=s3.length();
     StringBuffer sb=new StringBuffer();
     sb.append("Output  ").append(n).append(":").append(m);
     System.out.println(sb);
     }
  }
}
