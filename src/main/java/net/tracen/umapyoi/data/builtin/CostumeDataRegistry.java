package net.tracen.umapyoi.data.builtin;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.Umapyoi;
import net.tracen.umapyoi.registry.cosmetics.CosmeticData;

public class CostumeDataRegistry {

	
	public static final ResourceKey<CosmeticData> COMMON_COSTUME = register("common_costume");
	public static final ResourceKey<CosmeticData> STARTING_FUTURE = register("starting_futute");
	public static final ResourceKey<CosmeticData> KINDERGARTEN_UNIFORM = register("kindergarten_uniform");

	public static void registerAll(BootstapContext<CosmeticData> bootstrap) {

		bootstrap.register(COMMON_COSTUME, new CosmeticData(CosmeticData.COMMON_COSTUME));
		bootstrap.register(STARTING_FUTURE, new CosmeticData(
				new ResourceLocation(Umapyoi.MODID, "common_uma"), 
				new ResourceLocation(Umapyoi.MODID, "common_uma_flat"),
				new ResourceLocation(Umapyoi.MODID, "common_uma"),
				new ResourceLocation(Umapyoi.MODID, "common_uma_flat")
				));
		bootstrap.register(KINDERGARTEN_UNIFORM, new CosmeticData(new ResourceLocation(Umapyoi.MODID, "kindergarten_uniform")));

	}

	private static ResourceKey<CosmeticData> register(String id) {
		ResourceKey<CosmeticData> loc = ResourceKey.create(CosmeticData.REGISTRY_KEY,
				new ResourceLocation(Umapyoi.MODID, id));
		return loc;
	}
}
