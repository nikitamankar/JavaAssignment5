/*9)Find the Maximum span of the given array.                                             
    span is the number of elements between the duplicate element
    including those 2 repeated numbers.
    if the array as only one elemnt,then the span is 1.
	input[]={1,2,1,1,3}
	output1=4
	input[]={1,2,3,4,1,1,5}
	output1=6                             */
public class maximumSpan09 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,1,1,3};
		
	 String s2 = null;
	 int n=1;
	 StringBuffer sb=new StringBuffer();
	 for(int i=0;i<a.length;i++)
	  sb.append(String.valueOf(a[i]));
	 String s1=sb.toString();
	 System.out.println("Convert array to String:   "+s1);
	 int p=0,l=0;
	 for(int k=0;k<s1.length();k++){
		 for(int m=k+1;m<s1.length();m++){
		 if(s1.charAt(k)==s1.charAt(m)){
			p++;
		
		  if(p>0){
				l=p;
			}
	   } else if(p==0){
		      p=1;
		    }
	}
 }
System.out.println("Count:"+p);
		 
		if(l>=1){
	 for(int i=0;i<s1.length();i++)
	  for(int j=i+1;j<s1.length();j++)
		
	   if(s1.charAt(i)==s1.charAt(j))
	    s2=String.valueOf(s1.charAt(j));
	int n1=s1.indexOf(s2);
    System.out.println(n1);
	 int n2=s1.lastIndexOf(s2);
	 System.out.println(n2);
	 System.out.println("Span is:      "+(n2-n1));
	 
     for(int k=n1;k<n2;k++)
	  n++;
	 System.out.println("Output is:   "+n);
	}
}
}
