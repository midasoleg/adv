package com.managerAdv.adv.service;


import com.managerAdv.adv.entity.AdvertCategory;

import java.util.Set;

public interface AdvertCategoryService {

    AdvertCategory createAdvCategory (AdvertCategory category);

    AdvertCategory updateAdvCategory (AdvertCategory category);

    void deleteAdvCategory(Integer idCategory);

    AdvertCategory getAdvCategoryById (Integer idCategory);

    Set<AdvertCategory> getAllAdvCategories();
}
