/*8)Color Code Validation:
	String should starts with the Character '#'.
	Length of String is 7. 
	It should contain 6 Characters after '#' Symbol.
	It should contain Characters Between 'A-F' and Digits '0-9'.
	if String is acceptable then Output1=1
	else  Output1=-1;          */
public class colorValidation08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="#ABCD1A";
	
		int n=0;
		if(s.length()<=7){
			if(s.charAt(0)=='#')
				for(int i=1;i<s.length();i++){
					char c=s.charAt(i);
		           if((c>='A'&&c<='F')||(c>='0'&&c<='9')){
				   if(Character.isDefined(c))
		           n++;
		           }
		        }
	       } 
		
		if(n==6){
			System.out.println("1");
		}else{
				System.out.println("-1");
		}
   
	}

}
