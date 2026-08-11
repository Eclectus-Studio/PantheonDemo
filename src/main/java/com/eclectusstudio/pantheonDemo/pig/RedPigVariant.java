package com.eclectusstudio.pantheonDemo.pig;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.pig_variant.PigModelVariant;
import com.eclectusstudio.pantheon.common.data.pig_variant.PigVariant;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.BiomeCondition;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.ConditionTarget;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.SpawnCondition;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.ArrayList;
import java.util.List;

public class RedPigVariant extends PigVariant {
    public RedPigVariant() {
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
                new ResourceLocation(PantheonDemo.NAMESPACE,"red_pig"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/pig/red"),
                new ResourceLocation(PantheonDemo.NAMESPACE, "entity/pig/red_baby"),
                PigModelVariant.NORMAL,
                spawnConditions);
    }
}
