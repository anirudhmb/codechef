import java.util.*;
class HILLS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long t = Long.parseLong(sc.next());
		
		for(int z = 0;z<t;z++){
			long n = sc.nextLong();
			long u = sc.nextLong();
			long d = sc.nextLong();
			
			long h[] = new long[(int)n];
			for(int j = 0;j<n;j++)	h[j] = sc.nextLong();
			int p = 1;
			long i = 0;
			while(i<n-1){
				if(h[i]<h[i+1]){
					if(h[i+1]-h[i]<=u){
						i++;
						continue;
					}else{
						System.out.println(i+1);
						break;
					}
				}
				else if(h[i]>h[i+1]){
					if(h[i]-h[i+1]<=d){
						i++;
						continue;
					}
					else{
						if(p==1){
							p = 0;
							i++;
							continue;
						}
						else{
							System.out.println(i+1);
							break;
						}
					}
				}
				else i++;
			}
			if(i==n-1){
				System.out.println(n);
			}
		}
	}
}