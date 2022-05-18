package com.codeup.springblog.controller;


import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {


    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    public List<Post> generatePosts(){
        List<Post> allPosts = new ArrayList<>();
        Post post1 = new Post(1, "First post", "This is my first post!");
        Post post2 = new Post(2, "Another post!", "Amazing content!");
        Post post3 = new Post(3, "Third post", "Fascinating information!");
        allPosts.add(post1);
        allPosts.add(post2);
        allPosts.add(post3);
        return allPosts;
    }

    @GetMapping
public String allPosts(Model model){
    Post post1 = new Post("first post", "How about this awesome post right here");
    Post post2 = new Post("second post", "And won't you look at that?  Just another awesome post, again");
    ArrayList<Post> posts = new ArrayList<>();
            posts.add(post1);
            posts.add(post2);
            model.addAttribute("posts",posts);
        return"posts/index";
}

    @GetMapping("/{id}")
            public String onePost(@PathVariable long id, Model model){
        Post post = postDao.findById(id);
        model.addAttribute("post", post);
        return "posts/show";
    }


    @GetMapping("/{title}")
            public String onePost (@PathVariable String title, Model model){
                Post newPost = new Post(title, "How about this awesome post right here");
                model.addAttribute("post", newPost);
                return "posts/show";
            }

            @GetMapping("/create")
            public String createForm() {
                return "posts/create";
            }

            @PostMapping("/create")
            public String submitPost (@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
            Post post = new Post(title, body);
            postDao.save(post);
        return "redirect:/posts";
            }

        @GetMapping("/history")
        public String postHistory(){
        return Post.PostDetails.historyOfPost
        }

        }
