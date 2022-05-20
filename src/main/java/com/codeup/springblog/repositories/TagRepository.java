package com.codeup.springblog.repositories;


import com.codeup.springblog.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag getByName(String name);

    void findAllById(long l);

    Tag getById(long id);


}
