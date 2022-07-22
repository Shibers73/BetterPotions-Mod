package net.shiba73.betterpotions.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shiba73.betterpotions.BetterPotions;

public class ConduitPowerPotion {
    public static Potion registerConduitPowerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(BetterPotions.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 6000, 1)));
    }
}