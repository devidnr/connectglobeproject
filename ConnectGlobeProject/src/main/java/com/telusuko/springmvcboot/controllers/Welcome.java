package com.telusuko.springmvcboot.controllers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.telusuko.springmvcboot.models.Login;
import com.telusuko.springmvcboot.models.UserModel;
import com.telusuko.springmvcboot.models.imageEntityClass;
import com.telusuko.springmvcboot.models.uploadEntity;
import com.telusuko.springmvcboot.reposistory.GlobalService;
import com.telusuko.springmvcboot.reposistory.UserReposistory;

@Controller
public class Welcome {
	
	@Autowired
	UserReposistory repo;
	@Autowired
	GlobalService service;
	@GetMapping("/")
	public String home() {
		return "Login";
	}
	public String role;
	public int logid;
	@GetMapping("/logout")
	public String home1() {
		return "Login";
	}
	@PostMapping("/login")
	public  String login(@ModelAttribute("login") Login login,Model Model) {
		ModelAndView mav = new ModelAndView();
	    mav.addObject("login", new Login());
		 UserModel user = repo.getUserByUsername(login.getEmail());
	        if (user.getEmail().equals(login.getEmail())) {
	        	if(user.getPassword().equals(login.getPassword())) {
	        		 mav = new ModelAndView("user");
	        		    Model.addAttribute("users", user);
	        		    role=user.getRoles();
	        		    logid=user.getUserId();
	        		    System.out.print("role"+role);
	        		    Model.addAttribute("role",role);
	        	return "Home";}
	        }
	        else
	        	System.out.print("user not found");
	return "Login";
		
	}
	@GetMapping("/register")
	public String registerrr(Model m) {
		//m.addAttribute("register",new UserModel());
		return "Registration";
	}
	
	@GetMapping("/home")
	public String header(Model m) {
		m.addAttribute("role", role);
		
		  UserModel user = repo.findById(logid);
		 
		System.out.println("role in home"+role+logid);
		m.addAttribute("users",user);
		return "Home";
	}
	@GetMapping("/Home")
	public String ho() {
		return "Home";
	}
	@GetMapping("MyPosts/home")
	public String head() {
		//UserModel user=repo.findById(userId);
		//m.addAttribute("role",user.getRoles());
		System.out.println("role in redirect"+role);
		return "redirect:/home";
	}
	@GetMapping("MyPosts/home/{id}")
	public String head(@PathVariable(value = "id") int userId,Model m) {
		UserModel user=repo.findById(userId);
		//m.addAttribute("role",user.getRoles());
		System.out.println(user);
		return "redirect:/home";
	}
	@GetMapping("/profile")
	public String pro() {
		
		return "profile";
	}
	@PostMapping("/upload")
	public String uploadPost(@RequestParam("image") MultipartFile p,@RequestParam("tag") String tag,@RequestParam("userId") int id) throws IOException {
		System.out.println("Upload method");
		
		
		 byte[] i=p.getBytes();
		 uploadEntity u=new uploadEntity(id,tag,i);
		 uploadEntity t=service.saveToMyPosts(u);
		 int Uid=t.getUserId();
		 List<imageEntityClass> l=service.getMyPosts(Uid);
		 ModelAndView mk=new ModelAndView();
		 UserModel ui=repo.getById(Uid); 
		 mk.addObject("MyPosts", l);
		  mk.addObject("userModel",ui);
		System.out.println("file uploaded succes");
		return "Posts";
	}
	
	@PostMapping("/save")
	public String saveToRegister(@ModelAttribute("register") UserModel m) {
		 repo.save(m);
		 return "Login";
		
	}
	@GetMapping("/MyPosts")
	public String post(Model m) {
		System.out.println("role in post"+role);
		m.addAttribute("role", role);
		 return "Posts";
		
	}
	@GetMapping("/MyPosts/{id}")
	public ModelAndView post(@PathVariable(value = "id") int userId) throws UnsupportedEncodingException {
		
		  System.out.println(userId);
          System.out.println("roles in posts"+role);

		  List<imageEntityClass> l=service.getMyPosts(userId);
		  ModelAndView mi=new ModelAndView("/Posts");
		  
		  UserModel u=repo.getById(userId); mi.addObject("MyPosts", l);
		  mi.addObject("userModel", u);
		 
		return mi;
		
	}
	
	
}