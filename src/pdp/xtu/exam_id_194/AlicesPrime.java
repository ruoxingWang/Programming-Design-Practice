package pdp.xtu.exam_id_194;

/*
 * ��Ŀ����
Alice�ǳ�ϲ����������������Щ�����ǳ�����˼��
����239�����Ǹ���������239�����һλȥ����23��Ҳ�Ǹ���������23�����һλȥ����2��Ҳ�Ǹ�������
����Alice��̫���ڼ��㣬��������������������������������������
����
��
���
��������С���������ÿ���������ţ�Ȼ�������������������,�м��ÿո������
��������
�������
1 2
2 3
3 5
4 7
5 23
...
����
����������ֻ��83�����Ҳ��ᳬ��32λint�ı�ʾ��Χ��
 */
/*
 * #include <stdio.h>
#include <math.h>
#include<string.h>
#define N 5000001
#define SQRT_N  3000
int a[N]={1,1};
int bb[2][N];
int elem[N];
int cnt;
int main(){
     int i,j;
    for(i=2;i<=SQRT_N;i++){
        if(!a[i]){
            for(j=i*i;j<N;j+=i) a[j] = 1;
        }
    }
    int t,c,b;
    elem[0]=0;elem[1]=0;elem[2]=0;elem[3]=0;
    for(i=4;i<5000010;i++)
    {
        if(a[i]==0&&a[i-2]==0)elem[i]=elem[i-1]+1;
        else elem[i]=elem[i-1];
    }
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d%d",&c,&b);
        if(c>b)
        {
            int temp=c;c=b;b=temp;
        }
        int res=elem[b]-elem[c];
        if(!a[c+1]&&!a[c-1])
            res--;
        printf("%d\n",res);
    }
    return 0;
}
 */
import java.util.Scanner;

public class AlicesPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	}

}
