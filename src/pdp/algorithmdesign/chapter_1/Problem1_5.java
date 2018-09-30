package pdp.algorithmdesign.chapter_1;

import pdp.algorithmdesign.Problem;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-3 最大间隙问题
 * ◆问题描述:给定n个实数x1,x2,...,xn,求这n个实数在实数轴上相邻两个数之间的最大差值.
 * ◆算法设计:给定n个实数x1,x2,...,xn,求最大它们的最大间隙.
 * ◆数据输入:input.txt
 *           5
 *           2.3 3.1 7.5 1.5 6.3
 * ◆输出结果:output.text
 *           3.2
 */
public class Problem1_5 extends Problem{

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Problem1_5 problem1_5 = new Problem1_5();
        Integer n = Integer.valueOf(problem1_5.scanner.nextLine());
        BigDecimal[] arr = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            arr[i] = problem1_5.scanner.nextBigDecimal();
        }
        Arrays.sort(arr);
        BigDecimal maxSpaceing = new BigDecimal(0.0);
        for (int i = 0; i < arr.length - 1; i++) {
            BigDecimal temp = arr[i + 1].subtract(arr[i]);
            if (temp.compareTo(maxSpaceing) == 1) maxSpaceing = temp;
        }
        problem1_5.output(maxSpaceing.toString());
        problem1_5.scanner.close();
    }

}