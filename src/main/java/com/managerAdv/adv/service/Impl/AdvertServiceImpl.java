package com.managerAdv.adv.service.Impl;

import com.managerAdv.adv.entity.Advert;
import com.managerAdv.adv.repository.AdvertRepository;
import com.managerAdv.adv.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class AdvertServiceImpl implements AdvertService{

    @Autowired
    private AdvertRepository advertRepository;

    @Override
    public Advert createAdvert(Advert advert) {
        Advert savedAdvert = advertRepository.save(advert);
        return savedAdvert;
    }

    @Override
    public Advert updateAdvert(Advert advert) {
        return advertRepository.save(advert);
    }

    @Override
    public void deleteAdvert(Long id) {
        advertRepository.delete(id);
    }

    @Override
    public Advert getAdvertById(Long id) {
        return advertRepository.getAdvertById(id);
    }

    @Override
    public List<Advert> getAllAdverts() {
        return StreamSupport
                .stream(
                        Spliterators.spliteratorUnknownSize(advertRepository.findAll().iterator(), Spliterator.NONNULL), false)
                .collect(Collectors.toList());
    }
}
