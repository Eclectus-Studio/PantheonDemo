package com.eclectusstudio.pantheonDemo.cow;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.cow_variant.CowModelVariant;
import com.eclectusstudio.pantheon.common.data.cow_variant.CowVariant;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.BiomeCondition;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.ConditionTarget;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.SpawnCondition;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.ArrayList;
import java.util.List;

public class RedCowVariant extends CowVariant {
    public RedCowVariant() {
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
                new ResourceLocation(PantheonDemo.NAMESPACE, "red_cow"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/cow/red"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/chicken/red_baby"),
                CowModelVariant.NORMAL,
                spawnConditions);
    }
}
