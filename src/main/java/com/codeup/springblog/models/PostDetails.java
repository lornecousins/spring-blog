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



    public PostDetails(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getisAwesome() {
        return isAwesome;
    }

    public void setAwesome(boolean awesome) {
        isAwesome = awesome;
    }

    public String getHistoryOfPost() {
        return historyOfPost;
    }

    public void setHistoryOfPost(String historyOfPost) {
        this.historyOfPost = historyOfPost;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

//    public PostDetails(long id, boolean isAwesome, String historyOfPost, String topicDescription) {
//        this.id = id;
//        this.isAwesome = isAwesome;
//        this.historyOfPost = historyOfPost;
//        this.topicDescription = topicDescription;
//    }

    @Override
    public String toString(){
        return "PostDetails{" + "id=" + id + ", topicDescription='" + topicDescription + '\'' +
                ", isAwesome=" + isAwesome +
                ", historyOfPost=" + historyOfPost +
                '}';
    }
}

