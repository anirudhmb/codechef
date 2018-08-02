import java.io.*;
class CHEFCHR{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<t;i++){
			String n = br.readLine();
			check(n);
		}
	}
	
	public static void check(String s){
		char list[] = new char[4];
		boolean flg = false;
		int count = 0;
		for(int i = 0;i<s.length()-3;i++){			
				
			if(s.charAt(i)=='c' || s.charAt(i)=='h' || s.charAt(i)=='e' || s.charAt(i)=='f'){
				list[0] = s.charAt(i);
				if(s.charAt(i+1)!=list[0] && (s.charAt(i+1)=='c' || s.charAt(i+1)=='h' || s.charAt(i+1)=='e' || s.charAt(i+1)=='f')){
					list[1] = s.charAt(i+1);
					if(s.charAt(i+2)!=list[0] && s.charAt(i+2)!=list[1] && (s.charAt(i+2)=='c' || s.charAt(i+2)=='h' || s.charAt(i+2)=='e' || s.charAt(i+2)=='f')){
						list[2] = s.charAt(i+2);
						if(s.charAt(i+3)!=list[0] && s.charAt(i+3)!=list[1] && s.charAt(i+3) != list[2] && (s.charAt(i+3)=='c' || s.charAt(i+3)=='h' || s.charAt(i+3)=='e' || s.charAt(i+3)=='f')){
							list[3] = s.charAt(i+3);
							flg = true;
							count++;
						}
					}
				}
			}			
			/*for(int k = 0;k<4;k++)System.out.print(list[k]);
			System.out.println(" "+count);*/
		}
		
		System.out.println((flg?"lovely "+count:"normal"));
	}
}