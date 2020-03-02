package com.chengzi.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest {
    public static void main(String[] args) throws IOException {
        File f=new File("Module2\\src\\main\\resources\\requirements.txt");
        System.out.println(f);
        //得到路径和规范路径
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalPath());
        //该File对象是否是文件或目录
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        //该系统下的分隔符
        System.out.println(File.separator);
        //文件是否可读可写可执行
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        //文件的字节数
        System.out.println(f.length());

        //创建一个新文件
        File f2=new File("Module2\\src\\main\\resources\\newCreateFile");
        System.out.println(f2.createNewFile());

        System.out.println("-----------------------------------");
        //Path对象练习
        Path path= Paths.get("Module2\\src\\main\\resources\\newCreateFile");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());
        System.out.println(path.normalize());
        System.out.println(path.toFile());

        //InputStream实现类测试
        InputStream input=new FileInputStream("Module2\\src\\main\\resources\\requirements.txt");
        StringBuilder sb=new StringBuilder();
        int n;
        while((n=input.read())!=-1){
            sb.append(n);
        }
        System.out.println(sb.toString());

        System.out.println("Hell0".getBytes("UTF-8"));




    }
}
