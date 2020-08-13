package com.legopitstop.ediblebamboo.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DriedBamboo extends Item {
    public DriedBamboo() {
        super(new Properties()
        .group(ItemGroup.FOOD)
        .food(new Food.Builder()
            .hunger(2)
            .saturation(0.4f)
            .build())
        );
    }
}
