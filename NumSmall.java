# NumSmall
import java.util.*;
		class NumSmall{
		public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int k1=in.nextInt();
		String s=Integer.toString(num);
		String sum="";
		char charArray[]=s.toCharArray();
		for(int i=0;i<k1;i++){
		for(int j=i+1;j<charArray.length;j++){
		if(charArray[i]>charArray[j]){
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		}
		}sum=sum+charArray[i];
		}
		System.out.println(sum);
		}
		}
