package io.github.susimsek.solid.ocp.solution;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
public abstract class Motobike {
    // Properties
    String name;
    String color;
    IBrakeBehavior iBrakeBehavior;

    // Methods
    public void brake() {
        iBrakeBehavior.brake();
    }
}