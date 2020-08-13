package com.legopitstop.ediblebamboo.init;

import com.legopitstop.ediblebamboo.EdibleBamboo;
import com.legopitstop.ediblebamboo.base.BlockItemBase;
import com.legopitstop.ediblebamboo.base.ItemBase;
import com.legopitstop.ediblebamboo.items.DriedBamboo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EdibleBambooItems {
    // Register items
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EdibleBamboo.MOD_ID);

    // Block Items
    public static final RegistryObject<Item> DRIED_BAMBOO_BLOCK_ITEM = ITEMS.register("dried_bamboo_block",
            () -> new BlockItemBase(EdibleBambooBlocks.DRIED_BAMBOO_BLOCK.get()));
    // Items
    public static final RegistryObject<DriedBamboo> DRIED_BAMBOO = ITEMS.register("dried_bamboo", DriedBamboo::new);
}