package com.Excercise1.app.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookEntity implements Serializable {
  
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private String id;
	    private Long isbn;
	    private String title;
	    private Integer year;
	    private Integer quantity;
	    private Integer LendedQuantity;
	    private Integer TotalQuantity;
	    private Boolean register;
	    @OneToOne
	    private AuthorEntity author;
	    @OneToOne
	    private PublisherEntity publisher;


	    
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public Long getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(Long isbn) {
	        this.isbn = isbn;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public Integer getYear() {
	        return year;
	    }

	    public void setYear(Integer year) {
	        this.year = year;
	    }

	    public Integer getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Integer quantity) {
	        this.quantity = quantity;
	    }

	    public Integer getLendedQuantity() {
	        return LendedQuantity;
	    }

	    public void setLendedQuantity(Integer LendedQuantity) {
	        this.LendedQuantity = LendedQuantity;
	    }

	    public Integer getTotalQuantity() {
	        return TotalQuantity;
	    }

	    public void setTotalQuantity(Integer TotalQuantity) {
	        this.TotalQuantity = TotalQuantity;
	    }

	    public Boolean getRegister() {
	        return register;
	    }

	    public void setRegister(Boolean register) {
	        this.register = register;
	    }

	    public AuthorEntity getAuthor() {
	        return author;
	    }

	    public void setAuthor(AuthorEntity author) {
	        this.author = author;
	    }

	    public PublisherEntity getPublisher() {
	        return publisher;
	    }

	    public void setPublisher(PublisherEntity publisher) {
	        this.publisher = publisher;
	    }

}
