package com.ywl.hr.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.User;
import com.ywl.hr.service.DocumentServiceI;

@Controller
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	private DocumentServiceI docService;
	@RequestMapping("/selectDocument")
	public String showDocument(Document doc,Model model)
	{
		try {
			docService.showDocument(model, "documents", doc);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return "document/document";
	}
	@RequestMapping(value="/addDocument",method=RequestMethod.POST)
	public String addDocument(Document doc,@RequestParam(name="file",required=false)MultipartFile file,HttpSession session)
	{
		
		try {
			if(file!=null)
			{
				File file1=new File("E:/upload/"+file.getOriginalFilename());
				file.transferTo(file1);
				doc.setFileName(file.getOriginalFilename());
			}
			User user=(User) session.getAttribute("user_session");
			doc.setUser(user);
			docService.addDocument(doc);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:selectDocument.action";
		}
		return "redirect:selectDocument.action";
	}
	@RequestMapping(value="/addDocument",method=RequestMethod.GET)
	public String addDocument(Document doc)
	{
		return "document/showAddDocument";
	}
	@RequestMapping(value="/updateDocument",method=RequestMethod.POST)
	public String updateDoc(Document doc,Model model,String flag,@RequestParam(name="file",required=false)MultipartFile file)
	{
		if("2".equals(flag))
		{
			try {
				if(file!=null)
				{
					System.out.println(file.getOriginalFilename());
					File file1=new File("E:/upload/"+file.getOriginalFilename());
					file.transferTo(file1);
					doc.setFileName(file.getOriginalFilename());
				}
				docService.updateDocument(doc);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "redirect:selectDocument.action";
	}
	@RequestMapping(value="/updateDocument",method=RequestMethod.GET)
	public String updateDoc(Model model ,Document doc)
	{
		try {
			System.out.println(doc);
			model.addAttribute("document", docService.queryById(doc.getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "document/showUpdateDocument";
	}
	@RequestMapping("/removeDocument")
	public String delDoc(String ids)
	{
		try {
			docService.delDocument(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:selectDocument.action";
		}
		return "redirect:selectDocument.action";
	}
	@RequestMapping("/downLoad")
	public ResponseEntity<byte[]> download(Document doc) throws Exception
	{
		Document doc1 = docService.downDoc(doc);
		File file=new File("E:/upload/"+doc1.getFileName());
		InputStream in=new FileInputStream(file);
		byte[] buf=new byte[in.available()];
		in.read(buf);
		HttpHeaders headers=new HttpHeaders();
		headers.add("content-disposition","attachment;filename="+doc1.getFileName());
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<byte[]>(buf, headers, status);
	}
}
