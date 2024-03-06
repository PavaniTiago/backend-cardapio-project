package com.example.cardapio.food;

public record FoodResponseDTO(Integer id, String title, String imageurl, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImageurl(), food.getPrice());
    }
}
