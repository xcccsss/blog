package com.cs.blog.service;

import com.cs.blog.po.Blog;
import com.cs.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created on 2020/3/16
 **/

public interface BlogService {
    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blogQuery);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
