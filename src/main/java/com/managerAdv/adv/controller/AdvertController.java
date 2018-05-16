package com.managerAdv.adv.controller;

import com.managerAdv.adv.entity.Advert;
import com.managerAdv.adv.service.Impl.AdvertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AdvertController {

    @Autowired
    private AdvertServiceImpl advertService;

    @RequestMapping
    public String getAllAdverts(Model model){
        model.addAttribute("adverts", advertService.getAllAdverts());
        return "index";
    }

//    @RequestMapping
//    public String getAllAdverts(Model model){
//        model.addAttribute("adverts", advertService.getAllAdverts());
//        return "adverts/all";
//    }

    @RequestMapping(value = "/editor")
    public String editorPage(Model model){
        model.addAttribute("advert", new Advert());
        return "adverts/add";
    }

    @RequestMapping(value = "/editor/add")
    public String addAdvert(@ModelAttribute Advert advert){
        advertService.createAdvert(advert);
        return "redirect:../";
    }

    @GetMapping("/adverts/{id}")
    public String getById(@PathVariable("id") Long id, Model model){
        model.addAttribute("advert", advertService.getAdvertById(id));
        return "adverts/advert";
    }

    @GetMapping("/delete/{id}")
    public String deleteAdvertById(@PathVariable("id") Long id){
        advertService.deleteAdvert(id);
        return "redirect:../";
    }

    @GetMapping("/update/{id}")
    public String updateAdvertById(@PathVariable("id") Long id, Model model){
        model.addAttribute("advert", advertService.getAdvertById(id));
        return "adverts/update";
    }

    @PostMapping("/updateAdvert")
    public String updateAdvert(@ModelAttribute("advert") Advert advert){
        advertService.updateAdvert(advert);
        return "redirect:/adverts/" + advert.getId();
    }

}
