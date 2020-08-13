package com.legopitstop.ediblebamboo.init;

import com.legopitstop.ediblebamboo.EdibleBamboo;
import com.legopitstop.ediblebamboo.blocks.DriedBambooBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class EdibleBambooBlocks {
    // Register blocks
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EdibleBamboo.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> DRIED_BAMBOO_BLOCK = BLOCKS.register("dried_bamboo_block", DriedBambooBlock::new);
}
