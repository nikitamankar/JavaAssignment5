import java.util.StringTokenizer;
/*5)input1="the sun raises in the east";
    output1=raises;
    count no vowels in each word and print the word which has max
    no of vowels if two word has max no of vowel print the first one  */
public class vowelsCount05 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="the sun raises in the easti";
	    String s2="aeiou";
		int max=0;
		String s3=" ";
		StringTokenizer st=new StringTokenizer(input1, " ");
		while(st.hasMoreTokens()){
			String s=st.nextToken();
		    int n=0;
		    for(int i=0;i<s2.length();i++){
		    	for(int j=0;j<s.length();j++)
		    		if(s2.charAt(i)==s.charAt(j)){
		    			n++;
		    			}
		    }
		 if(n>max){
		         max=n;
		         s3=s;
		 }
 } 
	    System.out.println(s3);
	    System.out.println(max);

   }
}
