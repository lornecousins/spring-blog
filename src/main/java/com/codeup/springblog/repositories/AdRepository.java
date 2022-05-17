package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {
    List<Ad> findByTitle(String title);

    @Query("FROM Ad a WHERE a.title LIKE %?1%")
    List<Ad> searchByTitleLike(@Param("term") String term);
}
