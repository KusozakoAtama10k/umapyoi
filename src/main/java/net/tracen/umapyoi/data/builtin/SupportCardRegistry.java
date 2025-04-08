package net.tracen.umapyoi.data.builtin;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.Umapyoi;
import net.tracen.umapyoi.registry.TrainingSupportRegistry;
import net.tracen.umapyoi.registry.UmaSkillRegistry;
import net.tracen.umapyoi.registry.training.SupportType;
import net.tracen.umapyoi.registry.training.card.SupportCard;
import net.tracen.umapyoi.registry.training.card.SupportEntry;
import net.tracen.umapyoi.utils.GachaRanking;
import net.tracen.umapyoi.utils.UmaSkillUtils;

public class SupportCardRegistry {
    
    public static final ResourceKey<SupportCard> R_KITASANBLACK = register("r_kitasan_black");
    public static final ResourceKey<SupportCard> R_SUPERCREEK = register("r_super_creek");
    public static final ResourceKey<SupportCard> R_OGURICAP = register("r_oguri_cap");
    public static final ResourceKey<SupportCard> R_KS_MIRACLE = register("r_ks_miracle");
    public static final ResourceKey<SupportCard> R_AGNUS_TACHYON = register("r_agnus_tachyon");
    
    public static final ResourceKey<SupportCard> R_TURF_TRAINING = register("r_turf_training");
    public static final ResourceKey<SupportCard> R_DIRT_TRAINING = register("r_dirt_training");
    public static final ResourceKey<SupportCard> R_SNOW_TRAINING = register("r_snow_training");
                
    
    public static final ResourceKey<SupportCard> BASIC_SPEED_CARD = register("basic_speed_card");
    public static final ResourceKey<SupportCard> BASIC_STAMINA_CARD = register("basic_stamina_card");
    public static final ResourceKey<SupportCard> BASIC_STRENGTH_CARD = register("basic_strength_card");
    public static final ResourceKey<SupportCard> BASIC_GUTS_CARD = register("basic_guts_card");
    public static final ResourceKey<SupportCard> BASIC_WISDOM_CARD = register("basic_wisdom_card");
    
    public static final ResourceKey<SupportCard> ADV_SPEED_CARD = register("adv_speed_card");
    public static final ResourceKey<SupportCard> ADV_STAMINA_CARD = register("adv_stamina_card");
    public static final ResourceKey<SupportCard> ADV_STRENGTH_CARD = register("adv_strength_card");
    public static final ResourceKey<SupportCard> ADV_GUTS_CARD = register("adv_guts_card");
    public static final ResourceKey<SupportCard> ADV_WISDOM_CARD = register("adv_wisdom_card");
    
    public static final ResourceKey<SupportCard> SPEED_MASTER_CARD = register("speed_master_card");
    public static final ResourceKey<SupportCard> STAMINA_MASTER_CARD = register("stamina_master_card");
    public static final ResourceKey<SupportCard> STRENGTH_MASTER_CARD = register("strength_master_card");
    public static final ResourceKey<SupportCard> GUTS_MASTER_CARD = register("guts_master_card");
    public static final ResourceKey<SupportCard> WISDOM_MASTER_CARD = register("wisdom_master_card");

    public static final ResourceKey<SupportCard> SSR_KITASANBLACK = register("ssr_kitasan_black");
    public static final ResourceKey<SupportCard> SSR_SUPERCREEK = register("ssr_super_creek");
    public static final ResourceKey<SupportCard> SSR_OGURICAP = register("ssr_oguri_cap");
    public static final ResourceKey<SupportCard> SSR_KS_MIRACLE = register("ssr_ks_miracle");
    public static final ResourceKey<SupportCard> SR_AGNUS_TACHYON = register("sr_agnus_tachyon");
    public static final ResourceKey<SupportCard> SSR_AGNUS_TACHYON = register("ssr_agnus_tachyon");
    
    public static final ResourceKey<SupportCard> SSR_FINE_MOTION = register("ssr_fine_motion");
    
    public static final ResourceKey<SupportCard> SSR_RUDOLF_G = register("ssr_g_rudolf");
    public static final ResourceKey<SupportCard> SSR_MEJIRO_RAMONU_W = register("ssr_w_mejiro_ramonu");
    
    
    public static final ResourceKey<SupportCard> R_ACUPUNCTUIST = register("r_acupunctuist");
    public static final ResourceKey<SupportCard> SSR_ACUPUNCTUIST = register("ssr_acupunctuist");
    public static final ResourceKey<SupportCard> SSR_THREE_GODDESSES = register("ssr_three_goddesses");
    public static final ResourceKey<SupportCard> SSR_TEAM_SIRIUS = register("ssr_team_sirius");
    public static final ResourceKey<SupportCard> SSR_ANIME_MAIN = register("ssr_anime_main");
    public static final ResourceKey<SupportCard> SSR_ORFEVRE = register("ssr_orfevre");
    
    public static final ResourceKey<SupportCard> SSR_NEO_UNIVERSE_WIDSOM = register("ssr_neo_universe_wisdom");
    public static final ResourceKey<SupportCard> SSR_MEJIRO_MCQUEEN_STAMINA = register("ssr_mejiro_mcqueen_stamina");
    public static final ResourceKey<SupportCard> R_TM_OPERA = register("r_tm_opera");
    
    public static final ResourceKey<SupportCard> SSR_SATONO_DIAMOND_STAMINA = register("ssr_satono_diamond_stamina");
    public static final ResourceKey<SupportCard> SSR_KIRYUUIN_AOI = register("ssr_kiryuuin_aoi");
    public static void registerAll(BootstapContext<SupportCard> bootstrap) {
    	
        bootstrap.register(SSR_ANIME_MAIN,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.GROUP)
                .addSupporter(UmaDataRegistry.SPECIAL_WEEK.location())
                .addSupporter(UmaDataRegistry.TOKAI_TEIO.location())
                .addSupporter(UmaDataRegistry.KITASAN_BLACK.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 3))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.HEART_AND_SOUL.getId()))
                .build());
    	
        bootstrap.register(SSR_KIRYUUIN_AOI,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(3)
                .supportType(SupportType.FRIENDSHIP)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "kiryuuin_aoi"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.MEMORY_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.STEEL_WILL.getId()))
                .build());
    	
        bootstrap.register(SSR_SATONO_DIAMOND_STAMINA,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.STAMINA)
                .addSupporter(UmaDataRegistry.SATONO_DIAMOND.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 2))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.STEEL_WILL.getId()))
                .build());
    	
        bootstrap.register(SSR_NEO_UNIVERSE_WIDSOM,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.WISDOM)
                .addSupporter(UmaDataRegistry.NEO_UNIVERSE.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 3))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.ADV_LOWHEALTH_BUFF.getId()))
                .build());
        
    	
        bootstrap.register(SSR_THREE_GODDESSES,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(2)
                .supportType(SupportType.GROUP)
                .addSupporter(UmaDataRegistry.DARLEY_ARABIAN.location())
                .addSupporter(UmaDataRegistry.GODOLPHIN_BARB.location())
                .addSupporter(UmaDataRegistry.BYERLEY_TURK.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.MEMORY_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.DIVINE_SPEED.getId()))
                .build());
        
        bootstrap.register(SSR_TEAM_SIRIUS,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(1)
                .supportType(SupportType.GROUP)
                .addSupporter(UmaDataRegistry.MEJIRO_MCQUEEN.location())
                .addSupporter(UmaDataRegistry.RICE_SHOWER.location())
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "winning_ticket"))
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "narita_brian"))
                .addSupporter(UmaDataRegistry.SILENCE_SUZUKA.location())
                .addSupporter(UmaDataRegistry.SPECIAL_WEEK.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 3))

                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.TOP_UMAMUSUME.getId()))
                .build());
    	
        bootstrap.register(SSR_ORFEVRE,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.GUTS)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "orfevre"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.DIVINE_SPEED.getId()))
                .build());
    	
        bootstrap.register(SSR_MEJIRO_MCQUEEN_STAMINA,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.STAMINA)
                .addSupporter(UmaDataRegistry.MEJIRO_MCQUEEN.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 4))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 2))
                .build());
        
        bootstrap.register(SSR_ACUPUNCTUIST,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(3)
                .supportType(SupportType.FRIENDSHIP)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "anshinzawa_sasami"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.RANDOM_STATUS_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.ACUPUNCTUIST_SUPPORT.getId(), 1))
                .build());
        
        bootstrap.register(R_ACUPUNCTUIST,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(3)
                .supportType(SupportType.FRIENDSHIP)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "anshinzawa_sasami"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.ACUPUNCTUIST_SUPPORT.getId(), 1))
                .build());
    	
        bootstrap.register(R_TM_OPERA,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.STAMINA)
                .addSupporter(UmaDataRegistry.TM_OPERA_O.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 1))
                .build());
        
        bootstrap.register(R_TURF_TRAINING,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.SPEED)
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.TURF_RUNNER.getId()))
                .build());
        
        bootstrap.register(R_DIRT_TRAINING,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.STRENGTH)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.DIRT_RUNNER.getId()))
                .build());
        
        bootstrap.register(R_SNOW_TRAINING,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.GUTS)
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.SNOW_RUNNER.getId()))
                .build());
        
        bootstrap.register(R_KITASANBLACK,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(12)
                .supportType(SupportType.SPEED)
                .addSupporter(UmaDataRegistry.KITASAN_BLACK.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .build());
        
        bootstrap.register(R_SUPERCREEK,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.STAMINA)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "super_creek"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.NUTRITIONAL_SUPPLEMENTS.getId()))
                .build());
        
        bootstrap.register(R_OGURICAP,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.STRENGTH)
                .addSupporter(UmaDataRegistry.OGURI_CAP.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .build());
        
        bootstrap.register(R_AGNUS_TACHYON,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.WISDOM)
                .addSupporter(UmaDataRegistry.AGNUS_TACHYON.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .build());
        
        bootstrap.register(R_KS_MIRACLE,
                SupportCard.Builder.create()
                .ranking(GachaRanking.R)
                .maxDamage(10)
                .supportType(SupportType.GUTS)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "ks_miracle"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 2))
                .build());
        
        bootstrap.register(BASIC_SPEED_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.R).maxDamage(10).supportType(SupportType.SPEED)
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1)).build());
        bootstrap.register(BASIC_STAMINA_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.R).maxDamage(10).supportType(SupportType.STAMINA)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1)).build());
        bootstrap.register(BASIC_STRENGTH_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.R).maxDamage(10).supportType(SupportType.STRENGTH)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1)).build());
        bootstrap.register(BASIC_GUTS_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.R).maxDamage(10).supportType(SupportType.GUTS)
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 1)).build());
        bootstrap.register(BASIC_WISDOM_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.R).maxDamage(10).supportType(SupportType.WISDOM)
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 1)).build());
        
        bootstrap.register(ADV_SPEED_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SR).maxDamage(8).supportType(SupportType.SPEED)
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1)).build());
        bootstrap.register(ADV_STAMINA_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SR).maxDamage(8).supportType(SupportType.STAMINA)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 1)).build());
        bootstrap.register(ADV_STRENGTH_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SR).maxDamage(8).supportType(SupportType.STRENGTH)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 2)).build());
        bootstrap.register(ADV_GUTS_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SR).maxDamage(8).supportType(SupportType.GUTS)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 2)).build());
        bootstrap.register(ADV_WISDOM_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SR).maxDamage(8).supportType(SupportType.WISDOM)
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 2)).build());
        
        bootstrap.register(SPEED_MASTER_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SSR).maxDamage(5).supportType(SupportType.SPEED)
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 2)).build());
        bootstrap.register(STAMINA_MASTER_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SSR).maxDamage(5).supportType(SupportType.STAMINA)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 2)).build());
        bootstrap.register(STRENGTH_MASTER_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SSR).maxDamage(5).supportType(SupportType.STRENGTH)
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 3)).build());
        bootstrap.register(GUTS_MASTER_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SSR).maxDamage(5).supportType(SupportType.GUTS)
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 3)).build());
        bootstrap.register(WISDOM_MASTER_CARD,
                SupportCard.Builder.create().ranking(GachaRanking.SSR).maxDamage(5).supportType(SupportType.WISDOM)
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 3))
                .build());
        
        bootstrap.register(SSR_KITASANBLACK,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(6)
                .supportType(SupportType.SPEED)
                .addSupporter(UmaDataRegistry.KITASAN_BLACK.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 3))
                .build());
        
        bootstrap.register(SSR_SUPERCREEK,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.STAMINA)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "super_creek"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 3))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.BIG_EATER.getId()))
                .build());
        
        bootstrap.register(SSR_OGURICAP,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.STRENGTH)
                .addSupporter(UmaDataRegistry.OGURI_CAP.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STAMINA_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 3))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.NUTRITIONAL_SUPPLEMENTS.getId()))
                .build());
        
        bootstrap.register(SR_AGNUS_TACHYON,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SR)
                .supportType(SupportType.WISDOM)
                .maxDamage(8)
                .addSupporter(UmaDataRegistry.AGNUS_TACHYON.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.LAST_LEG.getId()))
                .build());
        
        bootstrap.register(SSR_AGNUS_TACHYON,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.SPEED)
                .addSupporter(UmaDataRegistry.AGNUS_TACHYON.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 3))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.ADV_LOWHEALTH_BUFF.getId()))
                .build());
        
        bootstrap.register(SSR_KS_MIRACLE,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.GUTS)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "ks_miracle"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(UmaSkillUtils.getSkillSupportEnrty(UmaSkillRegistry.HEART_AND_SOUL.getId()))
                .build());
        
        bootstrap.register(SSR_FINE_MOTION,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.WISDOM)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "fine_motion"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 1))
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 2))
                .build());
        
        bootstrap.register(SSR_RUDOLF_G,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(6)
                .supportType(SupportType.GUTS)
                .addSupporter(UmaDataRegistry.SYMBOLI_RUDOLF.location())
                .addSupport(new SupportEntry(TrainingSupportRegistry.GUTS_SUPPORT.getId(), 3))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.STRENGTH_SUPPORT.getId(), 1))
                .build());
    
        bootstrap.register(SSR_MEJIRO_RAMONU_W,
                SupportCard.Builder.create()
                .ranking(GachaRanking.SSR)
                .maxDamage(5)
                .supportType(SupportType.WISDOM)
                .addSupporter(new ResourceLocation(Umapyoi.MODID, "mejiro_ramonu"))
                .addSupport(new SupportEntry(TrainingSupportRegistry.WISDOM_SUPPORT.getId(), 4))
                .addSupport(new SupportEntry(TrainingSupportRegistry.SPEED_SUPPORT.getId(), 2))
                .addSupport(new SupportEntry(TrainingSupportRegistry.AP_SUPPORT.getId(), 2))
                .build());
    }

    private static ResourceKey<SupportCard> register(String id) {
        ResourceKey<SupportCard> loc = ResourceKey.create(SupportCard.REGISTRY_KEY, new ResourceLocation(Umapyoi.MODID, id));
        return loc;
    }
}
