package com.chengzi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Jackson_JsontoJava {

    public static void main(String[] args){
        ObjectMapper mapper=new ObjectMapper();
        Boook boook = null;
        List<Boook> list=null;
        try {
            boook=mapper.readValue(new FileInputStream("Module1/src/main/resources/JsontoJava.json" ),Boook.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(boook.id);
        System.out.println(boook.name);
        System.out.println(boook.author);
        System.out.println(boook.isbn);
        System.out.println(boook.tags);
        System.out.println(boook.pubDate);
        System.out.println(boook.price);

    }
}
