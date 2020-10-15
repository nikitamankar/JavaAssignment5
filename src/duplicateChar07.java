/*7) ip: "this is sample test case"
    op: "this amplec"
    remove the duplicates in the given string
   */
public class duplicateChar07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "this is sample test case";
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++)
			if(sb.charAt(i)==sb.charAt(j))
				sb.deleteCharAt(j);
	      }
		System.out.println(sb);

	}

}
