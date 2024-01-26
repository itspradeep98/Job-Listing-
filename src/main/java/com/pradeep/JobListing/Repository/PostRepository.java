package com.pradeep.JobListing.Repository;

import com.pradeep.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
