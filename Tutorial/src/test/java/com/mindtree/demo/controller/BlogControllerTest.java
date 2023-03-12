package com.mindtree.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.demo.entity.Blog;
import com.mindtree.demo.service.BlogService;
@SpringBootTest
class BlogControllerTest {
	
	@Mock
	private BlogService service;

	@InjectMocks
	private BlogController controller;
	
	@Test
	void testCreateBlog() {
		Blog blog  = new Blog();
		blog.setId(100);
		blog.setName("Tester");
		blog.setMessage("Tesing");
		when(service.createBlog(blog)).thenReturn(blog);
		assertEquals(controller.createBlog(blog), blog);
	}

	@Test
	void testGetAll() {
		Blog blog  = new Blog();
		blog.setId(100);
		blog.setName("Tester");
		blog.setMessage("Tesing");
		List<Blog> blogs = new ArrayList<>() ;
		blogs.add(blog);
		when(service.getAllBlogs()).thenReturn(blogs);
		assertEquals(controller.getAll(), blogs);		
	}

}

