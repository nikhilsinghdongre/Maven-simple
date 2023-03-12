package com.mindtree.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.demo.entity.Blog;
import com.mindtree.demo.repository.BlogRepo;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepo dao;

	public Blog createBlog(Blog blog) {
		return dao.save(blog);
	}
	
	public List<Blog> getAllBlogs(){
		return dao.findAll();
	}
}
