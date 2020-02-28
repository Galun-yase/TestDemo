package com.chengzi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jackson_JavatoJson {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("list");
        list.add("array");

        ObjectMapper mapper=new ObjectMapper();
        Book book=new Book("任青城","chengzi", list);
        String jsontext ="";

        try {
            jsontext= mapper.writeValueAsString(book);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(new FileOutputStream(new File("Module1/src/main/resources/JavatoJson_Book.json")),book);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(jsontext);

    }



}
