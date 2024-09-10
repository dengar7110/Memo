package com.garden.memo.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garden.memo.post.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	
	// WHERE `id` = #{userId} ORDER BY `id` DESC
	List<Post> findByUserIdOrderByIdDesc(int userId);

}
