import java.util.StringTokenizer;
/*3)i/p1: new york
    i/p2: new jersey
    o/p: new y+r+                        */
public class String03 {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="new york";
       String s2="new jersey";
      
     StringTokenizer st1=new StringTokenizer(s1," ");
     String p=st1.nextToken();
     String q=st1.nextToken();
     
     StringTokenizer st2=new StringTokenizer(s2," ");
     String r=st2.nextToken();
     String s=st2.nextToken();
    
     if(p.matches(r)){
      StringBuffer sb=new StringBuffer(p); 
       for(int i=0;i<q.length();i++)
    	   for(int j=0;j<s.length();j++){
    		   if(q.charAt(i)==s.charAt(j))
    			   sb.append(" "+s.charAt(j)).append('+');
    			}
       System.out.print(sb);
     }
	}
}
