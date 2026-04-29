package com.sikoneko.vikingaxe.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class VikingAxeItem extends AxeItem {
	private static final float EXTRA_MOB_DAMAGE = 5.0f;

	public VikingAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		// Apply extra damage to mobs
		if (target instanceof MobEntity) {
			target.damage(attacker.getDamageSources().generic(), EXTRA_MOB_DAMAGE);
			// Apply knockback
			target.takeKnockback(0.5f, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
		}
		return super.postHit(stack, target, attacker);
	}
}
