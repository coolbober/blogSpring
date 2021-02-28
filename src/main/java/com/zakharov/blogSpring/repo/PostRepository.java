package com.zakharov.blogSpring.repo;

import com.zakharov.blogSpring.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
