package com.legopitstop.ediblebamboo.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class DriedBambooBlock extends Block {
    public DriedBambooBlock() {
        super(Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN)
        .hardnessAndResistance(0.5f, 2.5f)
        .sound(SoundType.PLANT)
        .harvestLevel(0)
        .harvestTool(ToolType.HOE));
    }
}
