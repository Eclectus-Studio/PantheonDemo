package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.api.equipment.*;
import com.eclectusstudio.pantheon.common.resource.equipment.Equipment;

import java.util.List;

public class PantheonDemoEquipment {
    public static final List<Equipment> equipment = List.of(
            new HorseBodyEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new HumanoidBabyEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new HumanoidEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new HumanoidLeggingEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new NautilusBodyEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new SkeletonHorseEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new WolfBodyEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT),
            new ZombieHorseEquipment(PantheonDemoEquipmentLocation.RUBY_EQUIPMENT)
    );
}
