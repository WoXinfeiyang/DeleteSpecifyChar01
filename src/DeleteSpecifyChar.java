import java.util.Scanner;
/**
 * �ļ�����:ɾ��ָ���ַ�DeleteSpecifyChar
 * ʱ��:2016-9-10 10:55
 * ˵��:1����Ŀ:���������ַ���M��N,���ַ���M��ɾ���ַ���N�����е��ַ�������,����"abcda"
 * ��"ac",��ɾ��֮��ĵ�һ���ַ������"bd"��
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
			/*�����ҵ���ͬ�ַ�*/
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
