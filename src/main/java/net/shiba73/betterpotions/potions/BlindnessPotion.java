package net.shiba73.betterpotions.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shiba73.betterpotions.BetterPotions;

public class BlindnessPotion {
    public static Potion registerBlindnessPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(BetterPotions.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 6000, 1)));
    }
}