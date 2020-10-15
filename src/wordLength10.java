/*10)Getting the first and last n letters from a word where wordlength > 2n.
    Ex: Input: california,3.
        output: calnia.                   */
public class wordLength10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="california";
		int n=3;
		StringBuffer sb=new StringBuffer();
		sb.append(input.substring(0, n)).append(input.substring(input.length()-n, input.length()));
		System.out.println(sb);

	}

}
