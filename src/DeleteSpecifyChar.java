import java.util.Scanner;
/**
 * 文件名称:删除指定字符DeleteSpecifyChar
 * 时间:2016-9-10 10:55
 * 说明:1、题目:输入两个字符串M和N,从字符串M中删除字符串N中所有的字符。例如,输入"abcda"
 * 和"ac",则删除之后的第一个字符串变成"bd"。
 * */
public class DeleteSpecifyChar {
	
	public static String deleteSpecifyChar(String M,String N){
		if(M==null||N==null){
			return null;
		}
		char[]Marray=M.toCharArray();
		char[]Narray=N.toCharArray();
		int m=0,n=0;
		int deleteCount=0;
		boolean isSame=false;		
		for(m=0;m<Marray.length;m++){
			for(n=0;n<Narray.length;n++){
				if(Marray[m]==Narray[n]){
					deleteCount++;
					isSame=true;
					break;
				}
			}
			/*当已找到相同字符*/
			if(isSame==true){
				Marray[m]=' ';
				isSame=false;
			}
			
		}
		
		char[] resultArray=new char[Marray.length-deleteCount];
		int k=0;
		for(m=0;m<Marray.length;m++){
			if(Marray[m]!=' '){
				resultArray[k++]=Marray[m];
			}
		}
		return new String(resultArray);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String M=in.nextLine();
			String N=in.nextLine();
			System.out.println(deleteSpecifyChar(M, N));
		}
		
	}

}
