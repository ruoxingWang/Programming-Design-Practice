package pdp.algorithmdesign.chapter_2;

import pdp.algorithmdesign.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:2-7 集合划分问题
 * ◆问题描述:n个元素的集合{1,2,3,...,n}可以划分若干个非空集合,
 *           例如n=4时,集合{1,2,3,4}可以划分为15个不同的非空子集.
 * ◆算法设计:给定正整数n,计算n个元素集合{1,2,3,..,n}可以划分为多少个不同的非空子集.
 * ◆数据输入:input.txt
 *           5
 * ◆输出结果:output.text
 *            52
 */
public class Problem2_7 extends Problem{

    public static void main(String[] args) {
        Problem2_7 problem2_7 = new Problem2_7();
        int n = problem2_7.scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += f(n, i);
        problem2_7.output("" + sum);
        problem2_7.scanner.close();
    }

    /**
     * 描述:
     * @param n 输入的正整数n
     * @param m 每非空集合的元素个数
     * @return 返回m个元素的集合数目
     */
    private static int f(int n, int m) {
        return m == 1 || n == m ? 1 : f(n - 1, m - 1) + f(n - 1, m) * m;
    }
}