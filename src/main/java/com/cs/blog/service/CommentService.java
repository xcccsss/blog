package com.cs.blog.service;

import com.cs.blog.po.Comment;

import java.util.List;

/**
 * Created on 2020/3/24
 **/

public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
