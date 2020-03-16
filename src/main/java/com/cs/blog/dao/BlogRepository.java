package com.cs.blog.dao;

import com.cs.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created on 2020/3/16
 **/

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {
}
