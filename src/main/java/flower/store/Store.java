package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerPack> search(String color) {
        List<FlowerPack> matchingFlowerPacks = new ArrayList<>();
    
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if ((flowerPack.getFlower()).getColor().equalsIgnoreCase(color)) {
                    matchingFlowerPacks.add(flowerPack);
                }
            }
        }
    
        return matchingFlowerPacks;
    }
    
}

