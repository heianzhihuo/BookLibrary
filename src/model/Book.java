package model;

import java.sql.Date;

public class Book {
	
	private long ISBN;
	private String Title;
	private long AuthorID;
	private String Publisher;
	private Date PublishDate;
	private float Price;
	
	public void setISBN(long ISBN){
		this.ISBN = ISBN;
	}
	
	public long getISBN(){
		return ISBN;
	}
	
	public void setTitle(String Title){
		this.Title = Title;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public void setAuthorID(long AuthorID){
		this.AuthorID = AuthorID;
	}
	
	public long getAuthorID(){
		return AuthorID;
	}
	
	public void setPublisher(String Publisher){
		this.Publisher = Publisher;
	}
	
	public String getPublisher(){
		return Publisher;
	}
	
	public void setPublishDate(Date PublishDate){
		this.PublishDate = PublishDate;
	}
	
	public Date getPublishDate(){
		return PublishDate;
	}
	
	public void setPrice(float Price){
		this.Price = Price;
	}
	
	public float getPrice(){
		return Price;
	}
}