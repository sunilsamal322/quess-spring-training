package com.spring.firstproject.controller;

import com.spring.firstproject.model.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {

    @GetMapping("/foodmenu")
    public List<Food> getListOfFood()
    {
        List<Food> foodItemList=new ArrayList<>();

        foodItemList.add(new Food(1,"Chicken 65",100));
        foodItemList.add(new Food(2,"Chicken Dum Biriyani",250));
        foodItemList.add(new Food(3,"Butter Chicken",150));
        foodItemList.add(new Food(4,"Gobi Masala",80));
        foodItemList.add(new Food(5,"Panner Butter Masala",200));

        return foodItemList;
    }
}
