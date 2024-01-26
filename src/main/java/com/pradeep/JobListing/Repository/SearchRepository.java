package com.pradeep.JobListing.Repository;

import com.pradeep.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
