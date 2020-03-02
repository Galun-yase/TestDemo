package com.chengzi.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringJoiner;

public class File_readandprint {
    /**
    *以字节为单位读取文件，常用于读取二进制文件（图片，声音，视频）
     */
    public void readFileByBytes(String filename){
        File file=new File(filename);
        InputStream input=null;
        StringJoiner sj=new StringJoiner(",");
        //一次读一个字节
        try{
            input=new FileInputStream(file);
            int tempbyte;
            while((tempbyte=input.read())!=-1){
                sj.add(tempbyte+" ");
            }
            System.out.println(sj.toString());
            input.close();
        }catch (IOException e){
            e.printStackTrace();
            return;
        }
        //一次读入很多(50)字节,数据存在临时变量数组tempbytes中
        try{
            input=new FileInputStream(file);
            byte[] tempbytes=new byte[50];
            int tempbyte;
            while ((tempbyte=input.read(tempbytes))!=-1){
                for(int i:tempbytes){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 以字符为单位读取文件，常用于读取文本
     */
    public void readFileByChars(String filename){
        File file=new File(filename);
        Reader reader=null;
        //一次读取一个字符
        try{
            reader=new InputStreamReader(new FileInputStream(file));
            int tempchar;
            StringBuilder sb=new StringBuilder();
            while((tempchar=reader.read())!=-1){
                sb.append(tempchar).append(" ");
            }
            System.out.println(sb.toString());
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        //一次读取多个字符
        try{
            reader=new FileReader(file);
            int tempchar;
            char[] tempchars=new char[10];
            while((tempchar=reader.read(tempchars))!=-1){
                for(int i:tempchars ){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     *以行为单位读取文件，常用于读取面向行的格式化文件(直接读出文本，不是字节或字符显示)
     */
    public void readFileByLines(String filename){
        File file=new File(filename);
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader(file));
            String tempstring;
            while((tempstring=reader.readLine())!=null){
                System.out.println(tempstring);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        File_readandprint fileread=new File_readandprint();
        String filename="Module2\\src\\main\\resources\\requirements.txt";

        //fileread.readFileByBytes(filename);
        //fileread.readFileByChars(filename);
        fileread.readFileByLines(filename);
    }

}
