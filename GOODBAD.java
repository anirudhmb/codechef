import java.util.*;
class GOODBAD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		
		for(int z = 0;z<t;z++){
			int n = Integer.parseInt(sc.next());
			int k = Integer.parseInt(sc.next());
			
			String s = sc.next();
			int c = 0, b = 0;
			for(int i = 0;i<s.length();i++){
				if(s.charAt(i)>='a' && s.charAt(i)<='z')	c++;
				if(s.charAt(i)>='A' && s.charAt(i)<='Z') b++;
			}
			
			if(c>k && b>k)System.out.println("none");
			else if(c<k && b<k)System.out.println("both");
			else if(c<k)System.out.println("brother");
			else if(b<k)System.out.println("chef");
		}
	}
}