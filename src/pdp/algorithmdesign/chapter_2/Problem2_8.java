package pdp.algorithmdesign.chapter_2;

import pdp.algorithmdesign.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:2-8 集合划分问题
 * ◆问题描述:n个元素的集合{1,2,3,...,n}可以划分若干个非空集合,
 *           例如n=4时,集合{1,2,3,4}可以划分为15个不同的非空子集.
 * ◆算法设计:给定正整数n,计算n个元素集合{1,2,3,..,n}可以划分为多少个不同的由m个非空子集组成的集合.
 * ◆数据输入:input.txt
 *           4 3
 * ◆输出结果:output.text
 *           6
 */
public class Problem2_8 extends Problem{

    public static void main(String[] args) {
        Problem2_8 problem2_8 = new Problem2_8();
        int n = problem2_8.scanner.nextInt();
        int m = problem2_8.scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) map.put(i, f(n, i));
        problem2_8.output("" + map.get(m));
        problem2_8.scanner.close();
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