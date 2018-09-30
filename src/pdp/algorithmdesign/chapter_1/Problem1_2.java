package pdp.algorithmdesign.chapter_1;

import pdp.algorithmdesign.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-2 字典序问题
 * ◆问题描述:在数据加密和数据压缩中常需要对特殊的字符串编码.给定的字母表示字母表A由26个小写英文字母组成,
 *           即A={a,b,...,z}.
 * ◆算法设计:对于给定的长度不超过6的升序字符串,计算它在上述字典中的编码
 * ◆数据输入:input.txt
 *           2 a b
 * ◆输出结果:output.text
 *           1 2
 */
public class Problem1_2 extends Problem{
    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        f0();
        Problem1_2 problem1_2 = new Problem1_2();
        int k = Integer.valueOf(problem1_2.scanner.nextLine());
        for (int i = 0; i < k; i++) {
            Long code = dictionary.get(problem1_2.scanner.nextLine());
            problem1_2.out.append(code).append('\n');
        }
        problem1_2.output();
        problem1_2.scanner.close();
        /*System.out.println(dictionary.get("a"));
        System.out.println(dictionary.get("z"));
        System.out.println(dictionary.get("ab"));
        System.out.println(dictionary.get("az"));
        System.out.println(dictionary.get("yz"));
        System.out.println(dictionary.get("abc"));
        System.out.println(dictionary.get("xyz"));
        System.out.println(dictionary.get("vwxyz"));
        System.out.println(dictionary.get("uvwxyz"));*/

    }

    public static void f0() {
        long currentTime = System.currentTimeMillis();
        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
        System.out.println("打表耗时:" + (System.currentTimeMillis() - currentTime) + "ms");
    }
    private static Map<String,Long> dictionary = new HashMap<>();
    private static long index = 1;
    /**
     * 描述:初始化长度不超过6的升序字符串的编码
     */
    public static void f1() {
        for (int i = 'a'; i <= 'z'; i++) {
            dictionary.put("" + (char)(i),index++);
        }
    }
    public static void f2() {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= 25; j++) {
                if (i + j > 'z') break;
                dictionary.put("" + (char)(i) + (char)(i + j),index++);
            }
        }
    }

    public static void f3() {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= 25; j++) {
                for (int k = 1; k <= 25; k++) {
                    if (i + j + k > 'z') break;
                    dictionary.put("" + (char)(i) + (char)(i + j) + (char)(i + j + k),index++);
                }
            }
        }
    }

    public static void f4() {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= 25; j++) {
                for (int k = 1; k <= 25; k++) {
                    for (int l = 1; l <= 25; l++) {
                        if (i + j + k + l> 'z') break;
                        dictionary.put("" + (char)(i) + (char)(i + j) + (char)(i + j + k) + (char)(i + j + k + l),index++);
                    }
                }
            }
        }
    }

    public static void f5() {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= 25; j++) {
                for (int k = 1; k <= 25; k++) {
                    for (int l = 1; l <= 25; l++) {
                        for (int m = 1; m <= 25; m++) {
                            if (i + j + k + l + m> 'z') break;
                            dictionary.put("" + (char)(i) + (char)(i + j) + (char)(i + j + k)
                                    + (char)(i + j + k + l) + (char)(i + j + k + l + m),index++);
                        }
                    }
                }
            }
        }
    }

    public static void f6() {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= 25; j++) {
                for (int k = 1; k <= 25; k++) {
                    for (int l = 1; l <= 25; l++) {
                        for (int m = 1; m <= 25; m++) {
                            for (int n = 1; n <= 25; n++) {
                                if (i + j + k + l + m> 'z') break;
                                dictionary.put("" + (char)(i) + (char)(i + j) + (char)(i + j + k)
                                        + (char)(i + j + k + l) + (char)(i + j + k + l + m)
                                        + (char)(i + j + k + l + m + n),index++);
                            }
                        }
                    }
                }
            }
        }
    }
}