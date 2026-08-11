package com.eclectusstudio.pantheonDemo.wolf;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.wolf_variant.WolfModel;
import com.eclectusstudio.pantheon.common.data.wolf_variant.WolfVariant;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.BiomeCondition;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.ConditionTarget;
import com.eclectusstudio.pantheon.common.data_common.mob_variant.spawn_condition.SpawnCondition;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.ArrayList;
import java.util.List;

public class RedWolfVariant extends WolfVariant {
    public RedWolfVariant() {
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
                new ResourceLocation(PantheonDemo.NAMESPACE, "red_wolf"),
                new WolfModel(
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_angry"),
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_tame"),
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_wild")
                ),
                new WolfModel(
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_baby_angry"),
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_baby_tame"),
                        new ResourceLocation(PantheonDemo.NAMESPACE, "entity/wolf/red_baby_wild")
                ),
                spawnConditions);
    }
}
