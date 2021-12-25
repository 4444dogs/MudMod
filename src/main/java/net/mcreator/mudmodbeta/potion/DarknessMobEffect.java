
package net.mcreator.mudmodbeta.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DarknessMobEffect extends MobEffect {
	public DarknessMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
		setRegistryName("darkness");
	}

	@Override
	public String getDescriptionId() {
		return "effect.mud_mod_beta.darkness";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
