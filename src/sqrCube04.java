/*4)input1={2,4,3,5,6};
 *  if odd  find square 
    if even find cube
    finally add it
    output1=208(4+16+27+125+36)           */
public class sqrCube04 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1={2,4,3,5,6};
		int[] b=new int[input1.length];
		int[] c=new int[input1.length];
		
		int evenSum=0, oddSum=0;
		for(int i=0;i<input1.length;i++)
			if(input1[i]%2==0){
		        b[i]=(int)Math.pow(input1[i], 2);
				System.out.println(b[i]);
			}else if(input1[i]%2!=0){
	           c[i]=(int)Math.pow(input1[i], 3);
				System.out.println(c[i]);
				}
		for(int i=0;i<b.length;i++)
			evenSum=evenSum+b[i];
		System.out.println("Addition of even:          "+evenSum);
		for(int i=0;i<c.length;i++)
			oddSum=oddSum+c[i];
		System.out.println("Addition of odd:          "+oddSum);
		
		System.out.println("Addition of array:     "+(evenSum+oddSum));
		
	}
}