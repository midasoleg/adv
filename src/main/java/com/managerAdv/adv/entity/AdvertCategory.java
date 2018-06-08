package com.managerAdv.adv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "category")
public class AdvertCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;

    @Column(name = "category")
    private String advertCategory;

    @OneToMany
    @JoinTable(name = "category_adverts", joinColumns =
    @JoinColumn(name = "id_category"), inverseJoinColumns =
    @JoinColumn(name = "id_advert"))
    private Set<Advert> categories;

    public AdvertCategory() {
    }

    public Set<Advert> getCategories() {
        return categories;
    }

    public void setCategories(Set<Advert> categories) {
        this.categories = categories;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getAdvertCategory() {
        return advertCategory;
    }

    public void setAdvertCategory(String advertCategory) {
        this.advertCategory = advertCategory;
    }
}
