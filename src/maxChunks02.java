import java.util.StringTokenizer;
/*2)find the maximum chunk of a given string
    i/p: this isssss soooo good
    o/p=5                 */
public class maxChunks02 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="this issss soooo good";
		StringTokenizer st=new StringTokenizer(input," ");
		int k=0;
		while(st.hasMoreTokens()){
			String s2=st.nextToken();
			int n=1;
			for(int i=0;i<s2.length()-1;i++){
             if(s2.charAt(i)==s2.charAt(i+1))
					n++;
			   }
			System.out.println(n);
			if(n>k){
				k=n;
			}
		}
		System.out.println("Maximum chunks of a string is:     "+k);
	}
}
