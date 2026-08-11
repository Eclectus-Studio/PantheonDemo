package com.eclectusstudio.pantheonDemo.frog;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.frog_variant.FrogVariant;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.BiomeCondition;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.ConditionTarget;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.SpawnCondition;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.ArrayList;
import java.util.List;

public class RedFrogVariant extends FrogVariant {
    public RedFrogVariant() {
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
                new ResourceLocation(PantheonDemo.NAMESPACE, "red_frog"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/frog/red"),
                spawnConditions);
    }
}
