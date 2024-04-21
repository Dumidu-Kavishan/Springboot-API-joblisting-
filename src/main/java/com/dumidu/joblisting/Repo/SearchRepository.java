package com.dumidu.joblisting.Repo;

import com.dumidu.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
