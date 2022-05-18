USE spring_blog_db;


INSERT INTO pet_details (is_sterile, personality_description, weight_in_ounces)
VALUES (TRUE, 'Very happy', 45.23),
       (FALSE, 'Sad', 15.23),
       (TRUE, 'Aggressive', 5.23),
       (FALSE, 'Hyper', 95.23);

# pets
# private long id;
# private int age;
# private String type;
# private String name;
INSERT INTO pets (age, name, type, pet_details_id)
VALUES (3, 'Sparky', 'Dog', null),
       (10, 'Pickles', 'Cat', 1),
       (4, 'Sampson', 'Fish', 2),
       (5, 'Chili', 'Alligator', 3),
       (2, 'Spot', 'Snake', 4);



