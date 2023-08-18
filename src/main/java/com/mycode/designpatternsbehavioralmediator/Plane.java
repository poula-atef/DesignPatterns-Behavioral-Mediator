package com.mycode.designpatternsbehavioralmediator;

import com.mycode.designpatternsbehavioralmediator.mediator.Mediator;
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
