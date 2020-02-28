package com.chengzi;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


import java.io.IOException;
import java.io.InputStream;

public class JacksonTest {
    public static void main(String[] args) throws IOException {
        //解析xml
        InputStream input=JacksonTest.class.getResourceAsStream("/book.xml");
        JacksonXmlModule module=new JacksonXmlModule();
        XmlMapper mapper=new XmlMapper(module);
        Book book =mapper.readValue(input,Book.class);
        System.out.println(book.id);
        System.out.println(book.name);
        System.out.println(book.author);
        System.out.println(book.isbn);
        System.out.println(book.tags);
        System.out.println(book.pubDate);

        //解析json
        InputStream input1 = JacksonTest.class.getResourceAsStream("/JsontoJava.json");
        ObjectMapper mapper1 = new ObjectMapper().registerModule(new JavaTimeModule());
        // 反序列化时忽略不存在的JavaBean属性:
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Book book1 = mapper1.readValue(input1, Book.class);
        System.out.println(book.id);
        System.out.println(book.name);
        System.out.println(book.author);
        System.out.println(book.isbn);
        System.out.println(book.tags);
        System.out.println(book.pubDate);
        System.out.println(book.price);
        // 序列化为JSON:
        String json = mapper.writeValueAsString(book);
        System.out.println(json);
        JavaTimeModule d=new JavaTimeModule();
    }
}

