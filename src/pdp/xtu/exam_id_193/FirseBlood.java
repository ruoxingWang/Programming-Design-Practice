package pdp.xtu.exam_id_193;
/*
 ��Ŀ����
ICPC�����У�ĳ����ĵ�һ����ȷ�ύ������ΪFirst Blood���ָ���һ���ύ����־�ļ���������������Ŀ��First Blood�����
����
�����ĵ�һ����һ������N,��ʾ������Ŀ��������1��N��16����
 �Ժ�ÿ����һ����־��Ϣ�������ύ��ʱ�䣬��ʽΪСʱ:����:�룬 �ύ����ţ���Ŀ�����(��1001��ʼ)����������
  ������Ϊ��Accepted��Ϊ��ȷ�ύ��������Ϊ�����ύ������ж������ͬʱ����ȷ�ύͬһ���⣬�Գ�����ǰ�Ķ���Ϊ׼��
���
����Ŀ˳��ÿ�����һ�����First Blood�����������ţ� First Blood��ʱ�䣬�ύ�Ķ���š����û����ȷ�ύ����ֻ��Ҫ�����š�
��������
3
00:35:10 Team001 1001 Wrong Answer
00:55:20 Team002 1002 Runtime Error
00:56:21 Team003 1002 Time Limit Error
01:06:22 Team001 1001 Accepted
01:26:56 Team002 1001 Accepted
02:08:10 Team003 1001 Wrong Answer
02:10:33 Team003 1001 Accepted
02:20:10 Team001 1002 Time Limit Error
02:40:20 Team003 1003 Accepted
02:42:52 Team002 1002 Accepted
02:50:35 Team003 1002 Runtime Error
02:51:48 Team003 1002 Accepted
�������
1001 01:06:22 Team001
1002 02:42:52 Team002
1003 02:40:20 Team003
 */

/*
 *  int main()
    {
        int fb[20];
        char name[20][20],str[200],time[20][15];
        int n,i,num;
        char na[20],ans[20],ti[15],c;
        scanf("%d",&n);
        memset(fb,0,sizeof(fb));
        getchar();
        while(scanf("%s %s %d %s",&ti,&na,&num,&ans)!=EOF)
        {
            while(c=getchar(),c!='\n');
            num-=1000;
            if(strcmp(ans,"Accepted")==0)
            {
                if(fb[num]==0||strcmp(ti,time[num])<0)
                {
                    fb[num]=1;
                    strcpy(name[num],na);
                    strcpy(time[num],ti);
                }
            }
        }
        for(i=1;i<=n;i++)
        {
            if(fb[i]==0)
                printf("%d\n",i+1000);
            else
                printf("%d %s %s\n",i+1000,time[i],name[i]);
        }

    }
 */
import java.util.Scanner;

public class FirseBlood {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
	}
}
