package com.example.demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor
public class Flower {

    private double sepalLength;

    private FlowerColor color;

    private int price;
}