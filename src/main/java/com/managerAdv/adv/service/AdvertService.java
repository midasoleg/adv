package com.managerAdv.adv.service;

import com.managerAdv.adv.entity.Advert;

import java.util.List;


public interface AdvertService {

    Advert createAdvert(Advert advert);

    Advert updateAdvert(Advert advert);

    void deleteAdvert(Long id);

    Advert getAdvertById(Long id);

    List<Advert> getAllAdverts();

}
