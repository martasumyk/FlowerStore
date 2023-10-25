package com.example.demo.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers(){
        return List.of(new Flower(45, FlowerColor.RED, (int) 0.8));
    }
}
