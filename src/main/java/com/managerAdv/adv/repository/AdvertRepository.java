package com.managerAdv.adv.repository;

import com.managerAdv.adv.entity.Advert;
import org.springframework.data.repository.CrudRepository;


public interface AdvertRepository extends CrudRepository<Advert, Long> {
    Advert getAdvertById(Long id);
}
