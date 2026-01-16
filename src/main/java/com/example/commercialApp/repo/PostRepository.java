package com.example.commercialApp.repo;

import com.example.commercialApp.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
