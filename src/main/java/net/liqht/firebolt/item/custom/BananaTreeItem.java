package net.liqht.firebolt.item.custom;

import net.liqht.firebolt.item.ModItems;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BananaTreeItem extends Item {
    public BananaTreeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient && hand.equals(Hand.MAIN_HAND)) {
            //give the player one banana
            user.dropItem(ModItems.BANANA);
            user.dropItem(ModItems.BANANA);
            user.dropItem(ModItems.BANANA);
            user.dropItem(ModItems.BANANA);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Right Click to get 4 bananas").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("Press shift for more info!").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }



}
