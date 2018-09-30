package pdp.xtu.exam_id_191;

/*
 * ��Ŀ����
����ת�þ��ǰ�ԭ����A������Ԫ��aijת�ɾ���B��bji�� 
��ʵ�У��󲿷ֵľ�����ϡ���,����,�洢����ʱ�����ǿ���ֻ�洢�洢ÿ������Ԫ�ص������ֵ�����Ұ����������� ����˵3��3����
0 1 0
0 2 3
0 0 0
��ת�þ���Ϊ
0 0 0
1 2 0
0 3 0
�������ʹ��ϡ�����Ĵ洢������(i,j,aij)Ϊ
0 1 1
1 1 2
1 2 3
��ת�þ���
1 0 1
1 1 2
2 1 3
���
���ÿ�������Ľ����ÿ���������֮����һ�����С�
��������
2
3 3 3
0 1 1
1 1 2
1 2 3
1 3 1
0 0 1
�������
1 0 1
1 1 2
2 1 3

0 0 1
*/
import java.util.Scanner;

public class MatrixTransposition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		for (int k = 0; k < K; k++) {
			int row = input.nextInt();
			int col = input.nextInt();
			int nozero = input.nextInt();
			
			int[][] matrix = new int[row][col];
			for (int n = 0; n < nozero; n++) {
				int ro = input.nextInt();
				int co = input.nextInt();
				int va = input.nextInt();
				add(matrix, ro, co, va);
			}
			
			int[][] spareMatrix = spareMatrix(matrix, nozero);
			int[][] TMatrix = TransposeMatrix(spareMatrix);			
			printMatrix(TMatrix);
			System.out.println();
		}

	}

	// ��Ӿ���Ԫ��
	public static void add(int[][] matrix, int ro, int co, int value) {
		matrix[ro][co] = value;
	}

	// �����ת��
	public static int[][] TransposeMatrix(int[][] matrix) {
		int ro = matrix.length;
		int co = matrix[0].length;
		int[][] newMatrix = new int[co][ro];
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}
		return newMatrix;
	}

	// ����һ�������ϡ�����
	public static int[][] spareMatrix(int[][] matrix, int n) {
		int ro = matrix.length;
		int co = matrix[0].length;
		int index = 0;
		int[][] newMatrix = new int[n][3];
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				if (matrix[i][j] != 0) {
					newMatrix[index][0] = i;
					newMatrix[index][1] = j;
					newMatrix[index][2] = matrix[i][j];
					index++;
				}
			}
		}
		return newMatrix;
	}

	// ��ӡ����
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (j != matrix[0].length - 1)
					System.out.print(matrix[i][j] + " ");
				else
					System.out.print(matrix[i][j]);
			}
			if(i != matrix.length-1) System.out.println();
		}
	}
}
