package net.shiba73.betterpotions;

import net.minecraft.potion.Potion;

import static net.shiba73.betterpotions.potions.AbsorptionPotion.registerAbsorptionPotion;
import static net.shiba73.betterpotions.potions.BadOmenPotion.registerBadOmenPotion;
import static net.shiba73.betterpotions.potions.BlindnessPotion.registerBlindnessPotion;
import static net.shiba73.betterpotions.potions.ConduitPowerPotion.registerConduitPowerPotion;
import static net.shiba73.betterpotions.potions.DarknessPotion.registerDarknessPotion;
import static net.shiba73.betterpotions.potions.DolphinsGracePotion.registerDolphinsGracePotion;
import static net.shiba73.betterpotions.potions.GlowingPotion.registerGlowingPotion;
import static net.shiba73.betterpotions.potions.HastePotion.registerHastePotion;
import static net.shiba73.betterpotions.potions.HealthBoostPotion.registerHealthBoostPotion;
import static net.shiba73.betterpotions.potions.HeroOfTheVillagePotion.registerHeroOfTheVillagePotion;
import static net.shiba73.betterpotions.potions.LevitationPotion.registerLevitationPotion;
import static net.shiba73.betterpotions.potions.MiningFatiguePotion.registerMiningFatiguePotion;
import static net.shiba73.betterpotions.potions.NauseaPotion.registerNauseaPotion;
import static net.shiba73.betterpotions.potions.ResistancePotion.registerResistancePotion;
import static net.shiba73.betterpotions.potions.SaturationPotion.registerSaturationPotion;
import static net.shiba73.betterpotions.potions.UnluckPotion.registerUnluckPotion;
import static net.shiba73.betterpotions.potions.WitherPotion.registerWitherPotion;

public class ModPotions {

    public static Potion HASTE_POTION;
    public static Potion ABSORPTION_POTION;
    public static Potion WITHER_POTION;
    public static Potion MINING_FATIGUE_POTION;
    public static Potion NAUSEA_POTION;
    public static Potion RESISTANCE_POTION;
    public static Potion BLINDNESS_POTION;
    public static Potion HEALTH_BOOST_POTION;
    public static Potion SATURATION_POTION;
    public static Potion GLOWING_POTION;
    public static Potion LEVITATION_POTION;
    public static Potion UNLUCK_POTION;
    public static Potion CONDUIT_POWER_POTION;
    public static Potion DOLPHINS_GRACE_POTION;
    public static Potion BAD_OMEN_POTION;
    public static Potion HERO_OF_THE_VILLAGE_POTION;
    public static Potion DARKNESS_POTION;


    public static void registerPotions() {
        HASTE_POTION = registerHastePotion("haste_potion");
        ABSORPTION_POTION = registerAbsorptionPotion("absorption_potion");
        WITHER_POTION = registerWitherPotion("wither_potion");
        MINING_FATIGUE_POTION = registerMiningFatiguePotion("mining_fatigue_potion");
        NAUSEA_POTION = registerNauseaPotion("nausea_potion");
        RESISTANCE_POTION = registerResistancePotion("resistance_potion");
        BLINDNESS_POTION = registerBlindnessPotion("blindness_potion");
        HEALTH_BOOST_POTION = registerHealthBoostPotion("health_boost_potion");
        SATURATION_POTION = registerSaturationPotion("saturation_potion");
        GLOWING_POTION = registerGlowingPotion("glowing_potion");
        LEVITATION_POTION = registerLevitationPotion("levitation_potion");
        UNLUCK_POTION = registerUnluckPotion("unluck_potion");
        CONDUIT_POWER_POTION = registerConduitPowerPotion("conduit_power_potion");
        DOLPHINS_GRACE_POTION = registerDolphinsGracePotion("dolphins_grace_potion");
        BAD_OMEN_POTION = registerBadOmenPotion("bad_omen_potion");
        HERO_OF_THE_VILLAGE_POTION = registerHeroOfTheVillagePotion("hero_of_the_village_potion");
        DARKNESS_POTION = registerDarknessPotion("darkness_potion");
    }
}
