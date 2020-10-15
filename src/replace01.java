/*1)i/p: bengal
    o/p: ceogbl
    if z is there replace with a  */

public class replace01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="bengal";
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<s.length();i++){
    	char c=s.charAt(i);
    	if(i%2==0){
    		c=(char)(c+1);
             sb.append(c);
    	}else{
    		sb.append(c);
    		
    	}
     }
       System.out.println(sb);
	}
}
