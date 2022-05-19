USE spring_blog_db;

INSERT INTO posts (body, title)
VALUES ('A post about cats.', 'Cat Post');

INSERT INTO post_images (title, url, post_id)
VALUES ('White cat',
        'https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?cs=srgb&dl=pexels-pixabay-45201.jpg&fm=jpg',
        1),
       ('Dark cat',
        'https://images.pexels.com/photos/617278/pexels-photo-617278.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
        1),
       ('King cat',
        'https://images.pexels.com/photos/1314550/pexels-photo-1314550.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
        1);
