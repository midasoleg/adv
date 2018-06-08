package com.managerAdv.adv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "adverts")
public class Advert implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_advert")
    private Long id;

    /**
     * Заголовок объявления
     */
    @Column(name = "title")
    private String title;

    /**
     * Описание объявления
     */
    @Column(name = "description")
    private String description;

    /**
     * Тип / категория объявления
     */
/*    @Column(name = "category_id")
    private int category;*/
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id_category")
    private AdvertCategory advertCategory;

    /**
     * Поле информаци о пользователе(если он авторизирован)
     */
/*    @Column(name = "security_id")
    private int securityId;*/

    /**
     * Поле информаци о пользователе
     */
/*    @Column(name = "user_id")
    private int userId;*/

    /**
     * Координаты lat long
     */
/*    @Column(name = "coordinates")
    private int coordinates;*/

    /**
     * Поле цены
     */
    @Column(name = "price")
    private int price;
    /**
     * Этаж / этажность
     */
    @Column(name = "floors")
    private int floors;

    /**
     * Кол-во комнат
     */
    @Column(name = "rooms")
    private int rooms;

    /**
     * Дата создания объявления
     */
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreated;

    /**
     * Прикрепленные изображения к объявлению 3<=
     */
    /*
    @Column(name = "adv_img")
    private int images;*/

    public Advert() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdvertCategory getAdvertCategory() {
        return advertCategory;
    }

    public void setAdvertCategory(AdvertCategory advertCategory) {
        this.advertCategory = advertCategory;
    }

    public Date getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(Date dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

/*    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }*/

/*    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }*/


    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateOfCreated=" + dateOfCreated +
                '}';

    }
}