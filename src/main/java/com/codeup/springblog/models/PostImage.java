package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "post_images")
public class PostImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private boolean isAwesome;

    @Column
    private String historyOfPost;

    @Column
    private String topicDescription;
}
