import java.util.*;
class CODERLIF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<t;i++){
			check(sc.nextLine());
		}
	}
	
	public static void check(String s){
		boolean flg = false;
		String m[] = s.split(" ");
		for(int i = 0;i<m.length - 5;i++){
			if(m[i].equals("1") && m[i+1].equals("1") && m[i+2].equals("1") && m[i+3].equals("1") && m[i+4].equals("1") && m[i+5].equals("1")){
				System.out.println("#coderlifematters");
				flg = true;
				return;
			}
		}
		System.out.println("#allcodersarefun");
	}
}