package com.mindtree.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.demo.entity.Blog;
import com.mindtree.demo.service.BlogService;

@RestController
public class BlogController {
	
	@Autowired
	private BlogService service;

	@PostMapping("/create")
	public Blog createBlog(@RequestBody Blog blog) {
		return service.createBlog(blog); 
	} 
	
	@GetMapping("/getAll")
	public List<Blog> getAll(){
		return service.getAllBlogs();
	}
}
