package com.itproger.WebJava.G.D.repo;

import com.itproger.WebJava.G.D.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
