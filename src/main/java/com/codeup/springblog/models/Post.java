package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;


//    private PostDetails postDetails;

    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(long id, String title, String description, User owner) {
        this.id = id;
        this.title = title;
        this.body = description;
        this.owner = owner;
    }

        public long getId () {
            return id;
        }

        public void setId ( long id){
            this.id = id;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public String getBody () {
            return body;
        }

        public void setBody (String body){
            this.body = body;
        }

        public User getOwner () {
            return owner;
        }

        public void setOwner (User owner){
            this.owner = owner;
        }
    }