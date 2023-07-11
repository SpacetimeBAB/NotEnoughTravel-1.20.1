package com.flowingss.notenoughtravel.entity.custom;

import com.flowingss.notenoughtravel.entity.RideableEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class BikeEntity extends Animal implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public BikeEntity(EntityType<? extends Animal> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }




    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        if (!this.isVehicle()) {
            player.startRiding(this);

            return super.mobInteract(player, hand);
        }

        return super.mobInteract(player, hand);
    }

    @Override
    public void travel(Vec3 pos) {
        if (this.isAlive()) {
            if (this.isVehicle()) {
                LivingEntity passenger = (LivingEntity) getControllingPassenger();
                this.yRotO = getYRot();
                this.xRotO = getXRot();

                setYRot(passenger.getYRot()*0.5f);
                setXRot(passenger.getXRot() * 0.5f);
                setRot(getYRot(), getXRot());

                this.yBodyRot = this.getYRot();
                this.yHeadRot = this.yBodyRot;
                float x = passenger.xxa * 0.5F;
                float z = passenger.zza;

                if (z <= 0)
                    z *= 0.25f;

                this.setSpeed(0.3f);
                super.travel(new Vec3(x, pos.y, z));
            }
        }
    }
    @Nullable
    @Override
    public LivingEntity getControllingPassenger() {
        return getFirstPassenger() instanceof LivingEntity entity ? entity : null;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    @Override
    public boolean isControlledByLocalInstance() {
        return true;
    }





    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this,"controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()){
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.bike", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }




}
