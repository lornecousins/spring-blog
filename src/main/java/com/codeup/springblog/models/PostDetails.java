package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "post_details")
public class PostDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private boolean isAwesome;

    @Column
    private String historyOfPost;

    @Column
    private String topicDescription;

    @OneToOne
    private Post owner;

    public PostDetails(){}


    public PostDetails(long id, boolean isAwesome, String historyOfPost, String topicDescription, Post owner) {
        this.id = id;
        this.isAwesome = isAwesome;
        this.historyOfPost = historyOfPost;
        this.topicDescription = topicDescription;
        this.owner = owner;
    }
}

