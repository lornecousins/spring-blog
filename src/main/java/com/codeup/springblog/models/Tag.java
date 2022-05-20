package com.codeup.springblog.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    String name;

    @ManyToMany(mappedBy = "postTags")
    @JsonBackReference
    private List<Post> tagPosts;

    public Tag() {}

    public Tag(List<Post> tagPosts) {
        this.tagPosts = tagPosts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getTagPosts() {
        return tagPosts;
    }

    public void setTagPosts(List<Post> tagPosts) {
        this.tagPosts = tagPosts;
    }
}
