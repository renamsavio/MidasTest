package com.renam.portal.domain;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
  
@Entity(name = "comment")
public class Comment {  
  
 @Id  
 @GeneratedValue  
 private int id;  
  
 @Column(name = "comment")  
 private String comment;  
  
 public int getId() {  
  return id;  
 }  
  
 public void setId(int id) {  
  this.id = id;  
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }  
  
 
  
  
  
}  