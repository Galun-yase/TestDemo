package com.chengzi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class Boook {

    public long id;
    public String name;
    public String author;

    @JsonDeserialize(using = IsbnDeserializer.class)
    public BigInteger isbn;

    public List<String> tags;
    public String pubDate;

    public BigDecimal price;
}
