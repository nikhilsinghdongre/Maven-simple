package com.mindtree.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mindtree.demo.entity.Blog;
import com.mindtree.demo.repository.BlogRepo;
@SpringBootTest
class BlogServiceTest {
	
	@MockBean
	private BlogRepo dao;
	
	@Autowired
	private BlogService service;

	@Test
	void testCreateBlog() {
		Blog blog  = new Blog();
		blog.setId(100);
		blog.setName("Tester");
		blog.setMessage("Tesing");
		when(dao.save(blog)).thenReturn(blog);
		assertEquals(service.createBlog(blog), blog);
	}

	@Test
	void testGetAllBlogs() {
		Blog blog  = new Blog();
		blog.setId(100);
		blog.setName("Tester");
		blog.setMessage("Tesing");
		List<Blog> blogs = new ArrayList<>() ;
		blogs.add(blog);
		when(dao.findAll()).thenReturn(blogs);
		assertEquals(service.getAllBlogs(), blogs);
	}

}

