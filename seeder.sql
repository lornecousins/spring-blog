USE spring_blog_db;

INSERT INTO posts (body, title)
VALUES ('Here is a great posts, don''t you think?', 'Post1');

INSERT INTO posts (body, title)
VALUES ('Another fantastic post by a fantastic poster', 'Post2');

INSERT INTO post_details (history_of_post, is_awesome, topic_description, owner_id) VALUES ('3 years', true, 'Awesomeness of Post', 1);

INSERT INTO post_details (history_of_post, is_awesome, topic_description, owner_id) VALUES ('2 years', true, 'Awesomeness of Post', 2);

INSERT INTO tags (name)
VALUE ('Silly'), ('Funny'), ('humor');

INSERT INTO post_tags (post_id, tag_id)
VALUE (12, 1), (12, 2), (13, 3), (13, 2);