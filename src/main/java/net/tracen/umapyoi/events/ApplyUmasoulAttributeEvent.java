package net.tracen.umapyoi.events;

import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;
import top.theillusivec4.curios.api.SlotContext;

public class ApplyUmasoulAttributeEvent extends Event {
	private final ItemStack soul;
	private final SlotContext slotContext;
	private final UUID uuid;
	private final Multimap<Attribute, AttributeModifier> atts;
	public ApplyUmasoulAttributeEvent(ItemStack soul, SlotContext slotContext, UUID uuid, Multimap<Attribute, AttributeModifier> atts) {
		this.soul = soul;
		this.uuid = uuid;
		this.slotContext = slotContext;
		this.atts = atts;
	}
	
	public SlotContext getSlotContext() {
		return slotContext;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public Multimap<Attribute, AttributeModifier> getAttributes() {
		return atts;
	}

	public ItemStack getUmaSoul() {
		return soul;
	}

}
