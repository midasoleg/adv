package com.managerAdv.adv.repository;

import com.managerAdv.adv.entity.AdvertCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertCategoryRepository extends CrudRepository<AdvertCategory, Integer> {

    AdvertCategory getAdvertCategoryByIdCategory (Integer id);
}
