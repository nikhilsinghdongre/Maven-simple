package com.mindtree.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.demo.entity.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Integer>{

}
