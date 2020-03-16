package com.cs.blog.dao;

import com.cs.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
