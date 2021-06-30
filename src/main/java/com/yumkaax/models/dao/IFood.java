package com.yumkaax.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.yumkaax.models.entity.Food;

public interface IFood extends CrudRepository<Food, Long>{
	
	public Food findByIdLike(Long id);
	
}
