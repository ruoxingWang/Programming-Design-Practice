package pdp.algorithmdesign;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 项目:Programming-Design-Practice
 * 类型:Java类
 * 日期:2018-03-25 21:24 星期日
 * 作者:ruoxing Wang
 * 描述:
 */

public class Problem {
    private String classPath;//类路径
    private String problemID;
    private File inputFile;
    private File outputFile;
    protected StringBuffer out = new StringBuffer();
    protected Scanner scanner;
    public Problem(){
        classPath = this.getClass().getResource("").getPath();
        problemID = this.getClass().getSimpleName().replaceAll("Problem","");
        inputFile = new File(classPath,"input" + problemID + ".txt");
        outputFile = new File(classPath,"output" + problemID + ".txt");
        scanner = input();
    }

    /**
     * 描述:返回标准输入输出
     */
    public Scanner input(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scanner;
    }
    public void output(String ... strings){
        try(FileWriter writer = new FileWriter(outputFile)) {
            for (String string : strings) {
                writer.write(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void output(){
        output(out.toString());
    }
}