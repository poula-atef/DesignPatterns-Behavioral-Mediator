package com.mycode.designpatternsbehavioralmediator.entities;

import com.mycode.designpatternsbehavioralmediator.entities.mediator.Mediator;
import lombok.Data;

@Data
public class Plane {
    private Mediator mediator;
    private String id;

    public Plane(String id) {
        this.id = id;
    }

    public void land() {
        mediator.land(this);
    }
}
