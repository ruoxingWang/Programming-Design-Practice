package pdp.algorithmdesign;


import pdp.algorithmdesign.chapter_1.Problem1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-1 统计数字问题
 * ◆问题描述:
 *
 * ◆算法设计:
 *
 * ◆数据输入:input.txt
 *
 * ◆输出结果:output.text
 *
 */
public class Demo {

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Scanner scanner = getInput();
        while (scanner.hasNext()) {
            final String line = scanner.nextLine();
            if (line.equals("")) continue;

            int n = Integer.valueOf(line);//总页码
            System.out.println(n);

        }

        scanner.close();
    }


    /**
     * 描述:获取input的输入流
     */
    public static Scanner getInput() {
        String classPath = Demo.class.getResource("").getPath();//获取类路径
        Scanner scanner = null;
        File inputFile = new File(classPath,"input.txt");
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scanner;
    }

    public static void printPath() {
        Problem1_1.class.getProtectionDomain().getCodeSource().getLocation().getFile();//jar中

        final String rootPath = Demo.class.getResource("/").getPath();//获取根路径
        System.out.println(rootPath);
        // /E:/JetBrains/workspace/javafxtest/out/production/ProgramDesignPractice/

        final String classPath = Demo.class.getResource("").getPath();//获取类路径
        System.out.println(classPath);
        // /E:/JetBrains/workspace/javafxtest/out/production/ProgramDesignPractice/com/ruoxing/algorithmdesign/

        URL xmlpath = Demo.class.getClassLoader().getResource("");
        System.out.println(xmlpath);
        // file:/E:/JetBrains/workspace/javafxtest/out/production/ProgramDesignPractice/

        final String property = System.getProperty("java.class.path");//获取jar
        // System.out.println(property);

        final String user = System.getProperty("user.dir");//工程路径
        System.out.println(user);
        //E:\JetBrains\workspace\javafxtest
    }
}
