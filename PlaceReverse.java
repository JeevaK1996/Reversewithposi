# Reversewithposi
package hunter;

public class PlaceReverse {
	public static void main(String[]args){
		String s1[]=new String[]{"This","is","reverse","example"};
		
		for(int i=0;i<s1.length;i++){
			
				StringBuffer sb=new StringBuffer(s1[i]);
				sb.reverse();
				s1[i]=sb.toString();
			
		}
		for(int j=0;j<s1.length;j++){
			System.out.print(s1[j]+" ");
		}
	}
}
