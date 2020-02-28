package com.chengzi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//使用Stream
public class FunctionalProcessing {
    public static void main(String[] args){
        //Stream.of()
        Stream<String> stream=Stream.of("a","b","c","d");
        stream.forEach(System.out::print);
        System.out.println();

        //基于数组或Collection
        Stream<String> stream1= Arrays.stream(new String[]{"a","b","c"});
        Stream<String> stream2= List.of("a","b").stream();
        stream1.forEach(System.out::print);
        System.out.println();
        stream2.forEach(System.out::print);
        System.out.println();

        //基于Supplier
        Stream<Integer> stream3=Stream.generate(new NatualSupplier());
        stream3.limit(20).forEach(System.out::print);
        System.out.println();

        //通过API提供的一些接口
        try(Stream<String> stream4= Files.lines(Paths.get("Module2/src/main/resources/requirements.txt"))) {
            stream4.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } ;

        Pattern p=Pattern.compile("\\s+");
        Stream<String> stream5=p.splitAsStream("The quick brown fox jumps over the lazy dog");
        stream5.forEach(System.out::print);


    }
}

class NatualSupplier implements Supplier<Integer>{
    int n=0;
    public Integer get(){
        n++;
        return n;
    }
}