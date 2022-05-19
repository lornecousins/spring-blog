package com.codeup.springblog.controller;


import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class PostController {


    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

//    public List<Post> generatePosts(){
//        Post post1 = new Post(1, "First post", "This is my first post!");
//        Post post2 = new Post(2, "Another post!", "Amazing content!");
//        Post post3 = new Post(3, "Third post", "Fascinating information!");
//        List<Post> allPosts = new ArrayList<>();
//        allPosts.add(post1);
//        allPosts.add(post2);
//        allPosts.add(post3);
//        return allPosts;
//    }

//    @GetMapping("/posts")
//    public String allPosts(Model model){
//        List<Post> allPosts = generatePosts();
////        List<Post> allPosts = postDao.findAll();
//        model.addAttribute("allPosts", allPosts);
//        return"posts/index";
//}

//    @GetMapping("/{id}")
//            public String onePost(@PathVariable long id, Model model){
//        List<Post> allPosts = generatePosts();
//        Post post = null;
//        for (int i = 0; i < allPosts.size(); i++){
//            if (allPosts.get(i).getId() == id){
//                post = allPosts.get(i);
//            }
//        }
////        Post post = postDao.findById(id);
//        model.addAttribute("post", post);
//        return "posts/show";
//    }


//    @GetMapping("/{title}")
//            public String onePost (@PathVariable String title, Model model){
//                Post newPost = new Post(title, "How about this awesome post right here");
//                model.addAttribute("post", newPost);
//                return "posts/show";
//            }

            @GetMapping("/posts/create")
            public String createForm() {
                return "posts/create";
            }

//            @PostMapping("/create")
//            public String submitPost (@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
//            Post post = new Post(title, body);
//            postDao.save(post);
//        return "redirect:/posts";
//            }

//        @GetMapping("/{id}")
//        public String postHistory(@PathVariable long id, Model model){
//
//        }

    @PostMapping("/posts/create")
    public String submitPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body){
        User user = userDao.getById(2L);
        Post post = new Post();
        post.setTitle(title);
        post.setBody(body);
        post.setOwner(user);
        user.getPosts().add(post);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String postById(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.getById(id));
        return "posts/show";
    }
    @PostMapping("/posts/edit")
    public String updatePost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "id") long id) {
        Post post = new Post(id, title, body);
        postDao.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/delete")
    public String updatePost(@RequestParam(name = "deletePost") long id) {
        postDao.deleteById(id);
        return "redirect:/posts";
    }

        }
