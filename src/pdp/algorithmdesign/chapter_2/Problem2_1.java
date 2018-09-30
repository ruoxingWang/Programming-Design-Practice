package pdp.algorithmdesign.chapter_2;

import pdp.algorithmdesign.Problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:2-1 众数问题
 * ◆问题描述:给定含有n个元素的多重集合,每个元素在S中出现的次数称为该元素的重数,
 *           多重集S中充数最大的元素称为众数.
 *           例如,S={1,2,2,2,3,5},多重集S的众数是2,重数为2。
 * ◆算法设计:给定n个自然数组成的多重集S,计算众数及其重数
 * ◆数据输入:input.txt
 *           6       ---自然数个数
 *           1 2 2 2 3 5
 * ◆输出结果:output.text
 *            2      ---众数
 *            3      ---重数
 */
public class Problem2_1 extends Problem{

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Problem2_1 problem2_1 = new Problem2_1();
        int n = problem2_1.scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        int maxNumber = 0;
        int maxTimes = 1;
        for (int i = 0; i < n; i++) {
            int j = problem2_1.scanner.nextInt();
            if (set.add(j)) {
                map.put(j,1);
            } else {
                int temp = map.get(j) + 1;
                if (maxTimes < temp) {
                    maxTimes = temp;
                    maxNumber = j;
                }
                map.put(j,temp);
            }
        }
        problem2_1.output("" + maxNumber +'\n' + maxTimes);
        problem2_1.scanner.close();
    }
}