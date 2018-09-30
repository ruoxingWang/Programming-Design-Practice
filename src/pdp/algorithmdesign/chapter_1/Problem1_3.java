package pdp.algorithmdesign.chapter_1;

import pdp.algorithmdesign.Problem;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-3 最多约数问题
 * ◆问题描述:正整数x的约数是能整除x的正整数,正整数x的约数个数记为div(x),
 *           例如,1,2,5,10是正整数的约数,且div(10)=4.设a和b是2个正整数,a<=b
 *           找出a和b之间约数个数最多的数x。
 * ◆算法设计:给定2个正整数a<=b,计算a和b之间约数最多的数的约数个数
 * ◆数据输入:input.txt
 *           1 36
 * ◆输出结果:output.text
 *           9
 */
public class Problem1_3 extends Problem{

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Problem1_3 problem1_3 = new Problem1_3();
        int a = problem1_3.scanner.nextInt();
        int b = problem1_3.scanner.nextInt();
        int divisorNumMax = 0;
        for (int i = a; i <= b; i++) {
            int divisorI = divisorNum(i);
            if (divisorI > divisorNumMax) divisorNumMax = divisorI;
        }
        problem1_3.output("" + divisorNumMax);
        problem1_3.scanner.close();
    }


    /**
     * 描述:计算正整数n的约数个数
     */
    private static int divisorNum(int n) {
        if (n == 1) return 1;
        int sum = 0;
        int sqrtN = (int)Math.sqrt(n);//
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) sum += 2;
        }
        return sqrtN * sqrtN == n ? sum - 1 : sum;
    }
}