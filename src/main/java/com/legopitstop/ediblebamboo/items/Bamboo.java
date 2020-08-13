package com.legopitstop.ediblebamboo.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Bamboo extends Item {
    public Bamboo() {
        super(new Properties()
        .group(ItemGroup.FOOD)
        .food(new Food.Builder()
            .hunger(1)
            .saturation(0.1f)
            .build())
        );
    }
}
