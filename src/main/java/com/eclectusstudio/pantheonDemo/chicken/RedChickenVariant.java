package com.eclectusstudio.pantheonDemo.chicken;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.chicken_variant.ChickenModelVariant;
import com.eclectusstudio.pantheon.common.data.chicken_variant.ChickenVariant;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.BiomeCondition;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.ConditionTarget;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.SpawnCondition;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.ArrayList;
import java.util.List;

public class RedChickenVariant extends ChickenVariant {
    public RedChickenVariant() {
        List<SpawnCondition> spawnConditions = new ArrayList<>();
        List<ConditionTarget> conditionTargets = List.of(
                new ConditionTarget(new ResourceLocation("minecraft", "plains"), false)
        );
        spawnConditions.add(
                new SpawnCondition(
                        1,
                        new BiomeCondition(conditionTargets)
                ));
        super(
                new ResourceLocation(PantheonDemo.NAMESPACE,"red_chicken"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/chicken/red"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/chicken/red_baby"),
                ChickenModelVariant.NORMAL,
                spawnConditions
        );
    }
}
