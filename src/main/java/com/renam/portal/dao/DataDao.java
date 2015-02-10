package com.renam.portal.dao;

import java.util.List;  
  
import com.renam.portal.domain.Comment;  
  
public interface DataDao {  
 public int insertRow(Comment comment);  
  
 public List<Comment> getList();  
  
 public Comment getRowById(int id);  
  
 public int updateRow(Comment comment);  
  
 public int deleteRow(int id);  
  
}