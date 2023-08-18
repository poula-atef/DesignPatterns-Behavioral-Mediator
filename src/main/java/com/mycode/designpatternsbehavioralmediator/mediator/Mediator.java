package com.mycode.designpatternsbehavioralmediator.mediator;

import com.mycode.designpatternsbehavioralmediator.Plane;

public interface Mediator {
    void addPlane(Plane plane);

    void land(Plane plane);
}
