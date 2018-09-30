package pdp.xtu.exam_id_192;


/*��Ŀ����
����һ��ASCII��������֣������ÿ���ַ���ASCII�롣
����
һ�����֣���ASCII���ַ���ɡ�
���
������кţ��к�Ϊ16���ƣ�ռ5λ����0��ʼ�������к�ǰ��Ϊ0��Ȼ���һ�� 
ÿ��������32���ַ���ASCII�룬ÿ��ASCII��Ϊ16���ƣ�ռ2λ��ǰ��Ϊ0���м��ÿո������ 
����16����ʹ�ô�дA~F��ʾ10~15�����һ����ĩ�޿ո��޻��С�
��������
ACM International Collegiate Programming Contest,
I LOVE YOU
Lotus is a mystic symbol. 

�������
00000 41 43 4D 20 49 6E 74 65 72 6E 61 74 69 6F 6E 61
00001 6C 20 43 6F 6C 6C 65 67 69 61 74 65 20 50 72 6F
00002 67 72 61 6D 6D 69 6E 67 20 43 6F 6E 74 65 73 74
00003 2C 0A 49 20 4C 4F 56 45 20 59 4F 55 0A 4C 6F 74
00004 75 73 20 69 73 20 61 20 6D 79 73 74 69 63 20 73
00005 79 6D 62 6F 6C 2E 20 0A
 *ʮ����ת��Ϊʮ�����ƣ����ΪC8----->Integer.toHexString(200);
 *ʮ������ת��Ϊʮ���ƣ����140----->nteger.parseInt("8C",16);
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ASCIItoHex {
	public static void main(String[] args) throws Exception {
		Scanner cin = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		/*do {
			String string = cin.nextLine();
			if (string.equals("")) {
				break;
			}
			sb.append(string);
			sb.append('\n');
		} while (true);*/
		/*while(cin.hasNext()){
			String string = cin.nextLine();  
		    sb.append(string);
		    sb.append('\n');
		}*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		while((string = br.readLine())!=null){
			sb.append(string);
			sb.append('\n');
		}
		br.close();
		String str = new String(sb); 
		int len = str.length();
		char[] ch = new char[len];
		String[] strHex = new String[len];
		for(int index = 0; index < len; index ++){
			ch[index] = str.charAt(index);
			strHex[index] = Integer.toHexString(ch[index]).toUpperCase();
		}
		int i = 0;
		for(i = 0; i < len / 16; i++){
			System.out.printf("%05d ",i);
			for(int j = 0; j < 16 ;j ++) {
				System.out.print(print(strHex[j + i * 16],j,15));
			}
			System.out.println();
		}
		
		if(len % 16 != 0){
			System.out.printf("%05d ",i);
			for(int j = 0; j < len % 16 ;j ++) {
				System.out.print(print(strHex[j + i * 16],j,len % 16 - 1));
			}
		}
		
	}
	
	public static String print(String str,int i,int j){
		int len = str.length();
		if(j != i){
			return len == 1 ? "0"+str + " ": str + " ";
		}
		return len == 1 ? "0"+str: str;

	}
}
