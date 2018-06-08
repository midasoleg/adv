package com.managerAdv.adv.service.Impl;


import com.managerAdv.adv.entity.AdvertCategory;
import com.managerAdv.adv.repository.AdvertCategoryRepository;
import com.managerAdv.adv.service.AdvertCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AdvertCategoryServiceImpl implements AdvertCategoryService {

    @Autowired
    private AdvertCategoryRepository advertCategoryRepository;

    @Override
    public AdvertCategory createAdvCategory(AdvertCategory category) {
        AdvertCategory savedCategory = advertCategoryRepository.save(category);
        return savedCategory;
    }

    @Override
    public AdvertCategory updateAdvCategory(AdvertCategory category) {
        return advertCategoryRepository.save(category);
    }

    @Override
    public void deleteAdvCategory(Integer idCategory) {
        advertCategoryRepository.delete(idCategory);
    }

    @Override
    public AdvertCategory getAdvCategoryById(Integer idCategory) {
        return advertCategoryRepository.getAdvertCategoryByIdCategory(idCategory);
    }

    @Override
    public Set<AdvertCategory> getAllAdvCategories() {
        return null;
    }
}
