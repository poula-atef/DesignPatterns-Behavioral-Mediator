package com.mycode.designpatternsbehavioralmediator.entities.mediator;

import com.mycode.designpatternsbehavioralmediator.entities.Plane;

public interface Mediator {
    void addPlane(Plane plane);

    void land(Plane plane);
}
