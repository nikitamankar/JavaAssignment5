import java.util.StringTokenizer;

/*13)leap year or not using API?    */
public class leapYear13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="15/08/2020";
		StringTokenizer st=new StringTokenizer(s,"/");
		st.nextToken();
		st.nextToken();
		String k=st.nextToken();
	    int n=Integer.parseInt(k);
		System.out.println(n);
		
		if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0)){
    	 System.out.println("This is Leap Year");
		}else{
    	 System.out.println("This is not Leap Year");
		}
	}

}
