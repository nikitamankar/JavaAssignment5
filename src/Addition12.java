/*12)Add elements of digits:9999 
    output:9+9+9+9=3+6=9;               */
public class Addition12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="9999";
		int max=0,sum=0;
      for(int i=0;i<a.length();i++){
	      char c=a.charAt(i);
	      String n=String.valueOf(c);
	      int k=Integer.parseInt(n);
	         max=max+k;
	     }
		System.out.println("Addition:            "+max);
		
		String s=String.valueOf(max);
		System.out.println(s);
		 for(int j=0;j<s.length();j++){
			 char cc=s.charAt(j);
		      String m=String.valueOf(cc);
		      int p=Integer.parseInt(m);
		         sum=sum+p;
		      
		 }
		 System.out.println(sum);
	}
}
