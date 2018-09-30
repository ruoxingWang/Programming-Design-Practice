package pdp.algorithmdesign.chapter_1;

import pdp.algorithmdesign.Problem;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-1 统计数字问题
 * ◆问题描述:一本书的页码从自然数1开始顺序编码知道自然数n。书的页码按照通常的习惯编排,
 *           每个页码都不含前导数字0,例如第6页用数字6表示,而不是06或者006等。数字统计
 *           问题要求统计总页面n,计算书的全部页码中分别用到多少次数字0,1,2,...,9。
 * ◆算法设计:给定表示书的总页码的十进制数n(1<=n<=10^9),计算出书的全部页码分别用到多少次数字0,1,2,...,9
 * ◆数据输入:input.txt
 *           11
 * ◆输出结果:output.text
 *           1 4 1 1 1 1 1 1 1 1 1
 */
public class Problem1_1 extends Problem {

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Problem1_1 problem1_1 = new Problem1_1();
        final String line = problem1_1.scanner.nextLine().trim();
        int n = Integer.valueOf(line);//总页码
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i <= n; i++) {
            buffer.append(sumDigit(n,i)).append('\n');
        }
        problem1_1.output(buffer.toString());
        problem1_1.scanner.close();
    }

    private static long sumDigit(int n, int k) {
        long sum = 0;
        long factor = 1;
        long low,current,high; //低位,当前,高位
        while (n / factor != 1) {
            low = n - (n / factor) * factor;
            current = (n / factor) % 10;
            high = n / (factor * 10);

            if (k == 0) {
                if (high == 0) factor *= 10;
                else if (current == 0 ) sum += (high - 1 )* factor + low + 1;
                else sum += high * factor;
                factor *= 10;
                continue;
            }
            if (current < k)
                sum += high * factor;
            else if (current == k)
                sum += high * factor + low + 1;
            else
                sum += (high + 1) * factor;
            factor *= 10;
        }
        return sum;
    }
}