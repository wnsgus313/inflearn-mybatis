package com.inflearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inflearn.service.QuestionService;
import com.inflearnVO.QuestionVO;

@Controller
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@RequestMapping("/community")
	public String community(Model m) {
		List<QuestionVO> list = questionService.getQuestions();
		m.addAttribute("list", list);
		return "community";
	}
	
	@RequestMapping("/question/{id}")
	public String question(@PathVariable int id, Model m) {
    	QuestionVO q = questionService.getQuestionById(id);
    	
    	m.addAttribute("question", q);  
    	return "question";
    }
	
	 @RequestMapping("/questionform")
	 public String questionForm() {
		 return "questionform";
	 }
	 
	 @RequestMapping(value="/addQuestion", method=RequestMethod.POST)
	 public String save(@ModelAttribute("q") QuestionVO q) {
		 int i = questionService.insertQuestion(q);
		 if(i > 0) {
			 return "redirect:/community";
		 }
		 else {
			 return "redirect:/addquestion-error";
		 }	
	 }
	 
	 @RequestMapping(value="/deleteQuestion/{id}", method=RequestMethod.GET)
	 public String delete(@PathVariable int id) {
		 questionService.deleteQuestion(id);
		 return "redirect:/community";
	 }
	 
	 @RequestMapping(value="/editQuestion/{id}")
	 public String edit(@PathVariable int id, Model m) {
		QuestionVO q = questionService.getQuestionById(id);
   		m.addAttribute("question", q);
   		return "editform";
	 }
	 
	 @RequestMapping(value="editQuestion", method=RequestMethod.POST)
	 public String editsave(@ModelAttribute("q") QuestionVO q) {
		 questionService.updateQuestion(q);
		 return "redirect:/community";
	 }


}
