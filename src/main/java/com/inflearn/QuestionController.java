package com.inflearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    	m.addAttribute("img", q.getFileName());
    	return "question";
    }
	
	 @RequestMapping("/questionform")
	 public String questionForm() {
		 return "questionform";
	 }
	 
	 @RequestMapping("/showImg")
	 public ResponseEntity<byte[]> getFile(@RequestParam int id) throws IOException{
		 QuestionVO q = questionService.getQuestionById(id);

		 File file = new File("/Users/junhyeonbae/Desktop/spring-camp/inflearn-mybatis/src/main/resources/files/" + q.getFileName());
		 
		 HttpHeaders header = new HttpHeaders();
		 header.setContentType(MediaType.IMAGE_JPEG);
		 
		 return new ResponseEntity<byte[]>(IOUtils.toByteArray(new FileInputStream(file)), header, HttpStatus.CREATED);
		 
	 }
	 
	 @RequestMapping(value="/addQuestion", method=RequestMethod.POST)
	 public String save(@ModelAttribute QuestionVO q) throws IOException {
		 String fileName = null;
		 MultipartFile uploadFile = q.getUploadFile();
		 if (!uploadFile.isEmpty()) {
			 String originalFileName = uploadFile.getOriginalFilename();
			 String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
			 UUID uuid = UUID.randomUUID();	//UUID 구하기
			 fileName = uuid + "." + ext;
			 uploadFile.transferTo(new File("/Users/junhyeonbae/Desktop/spring-camp/inflearn-mybatis/src/main/resources/files/" + fileName));
		 }
		 
		 q.setFileName(fileName);

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
