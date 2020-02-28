package com.chengzi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.LocalDate;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {



	public long id;
	public String name;
	public String author;

	@JsonDeserialize(using = IsbnDeserializer.class)
	public BigInteger isbn;

	public List<String> tags;
	public LocalDate pubDate;
	public BigDecimal price;

	Book(String name,String author,List<String> list){
		this.name=name;
		this.author=author;
		this.tags=list;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigInteger getIsbn() {
		return isbn;
	}

	public void setIsbn(BigInteger isbn) {
		this.isbn = isbn;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
