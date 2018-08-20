import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		String s="";
		for(int i=n;i<m;i++){
			int sum=0;
			int l=String.valueOf(i).length();
			for(int j=0;j<l;j++)
			{
			int r=Integer.parseInt(String.valueOf(i).substring(j, j+1));
			sum+=(int)Math.pow(r,l);
			}
			if(sum==i){
			s+=String.valueOf(sum)+" ";
			}
		}
		System.out.print("S is :"+s);
	}
}
