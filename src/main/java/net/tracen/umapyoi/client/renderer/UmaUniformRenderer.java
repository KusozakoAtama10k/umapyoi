package net.tracen.umapyoi.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.tracen.umapyoi.Umapyoi;
import net.tracen.umapyoi.utils.ClientUtils;

public class UmaUniformRenderer {
    public static class SummerUniformRenderer extends AbstractSuitRenderer {

        @Override
        protected ResourceLocation getModel(ItemStack stack) {
            return ClientUtils.SUMMER_UNIFORM;
        }

        @Override
        protected ResourceLocation getTexture(ItemStack stack, boolean tanned) {
            return tanned ? new ResourceLocation(Umapyoi.MODID, "textures/model/summer_uniform_tanned.png")
                    : new ResourceLocation(Umapyoi.MODID, "textures/model/summer_uniform.png");
        }

        @Override
        protected ResourceLocation getFlatModel(ItemStack stack) {
            return ClientUtils.SUMMER_UNIFORM_FLAT;
        }

        @Override
        protected ResourceLocation getFlatTexture(ItemStack stack, boolean tanned) {
            return tanned ? new ResourceLocation(Umapyoi.MODID, "textures/model/summer_uniform_tanned.png")
                    : new ResourceLocation(Umapyoi.MODID, "textures/model/summer_uniform.png");
        }

    }

    public static class WinterUniformRenderer extends AbstractSuitRenderer {

        @Override
        protected ResourceLocation getModel(ItemStack stack) {
            return ClientUtils.WINTER_UNIFORM;
        }

        @Override
        protected ResourceLocation getTexture(ItemStack stack, boolean tanned) {
            return tanned ? new ResourceLocation(Umapyoi.MODID, "textures/model/winter_uniform_tanned.png")
                    : new ResourceLocation(Umapyoi.MODID, "textures/model/winter_uniform.png");
        }

        @Override
        protected ResourceLocation getFlatModel(ItemStack stack) {
            return ClientUtils.WINTER_UNIFORM_FLAT;
        }

        @Override
        protected ResourceLocation getFlatTexture(ItemStack stack, boolean tanned) {
            return tanned ? new ResourceLocation(Umapyoi.MODID, "textures/model/winter_uniform_tanned.png")
                    : new ResourceLocation(Umapyoi.MODID, "textures/model/winter_uniform.png");
        }

    }
}
