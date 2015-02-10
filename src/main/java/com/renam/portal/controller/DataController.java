package com.renam.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.renam.portal.domain.Comment;
import com.renam.portal.services.DataService;
  
@Controller  
public class DataController {  
  
 @Autowired  
 DataService dataService;  
  
 @RequestMapping("form")  
 public ModelAndView getFormAndListComments(@ModelAttribute Comment comment) {
	 List commentList = dataService.getList();  
	 return new ModelAndView("form", "commentList", commentList);
}  
  
 @RequestMapping("register")  
 public ModelAndView registerComment(@ModelAttribute Comment comment) {  
  dataService.insertRow(comment);  
  return new ModelAndView("redirect:form");  
 }  
 
 @RequestMapping("delete")  
 public ModelAndView deleteComment(@RequestParam int id) {  
  dataService.deleteRow(id);  
  return new ModelAndView("redirect:form");  
 }  
  
 @RequestMapping("edit")  
 public ModelAndView editComment(@RequestParam int id,  
   @ModelAttribute Comment comment) {  
	 Comment commentObject = dataService.getRowById(id);  
  return new ModelAndView("edit", "commentObject", commentObject);  
 }  
  
 @RequestMapping("update")  
 public ModelAndView updateComment(@ModelAttribute Comment comment) {  
  dataService.updateRow(comment);  
  return new ModelAndView("redirect:form"); 
 }  
  
}  
