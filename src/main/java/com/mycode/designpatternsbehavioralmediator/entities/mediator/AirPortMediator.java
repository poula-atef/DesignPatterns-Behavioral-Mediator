package com.mycode.designpatternsbehavioralmediator.entities.mediator;

import com.mycode.designpatternsbehavioralmediator.entities.Plane;

import java.util.ArrayList;
import java.util.List;

public class AirPortMediator implements Mediator {
    private List<Plane> planes;

    public AirPortMediator() {
        planes = new ArrayList<>();
    }

    @Override
    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void land(Plane plane) {
        for (Plane p : planes) {
            if (plane.getId().equals(p.getId()))
                continue;
            System.out.println("Message To Plane " + p.getId() + " :: Plane " + plane.getId() + " Will Land");
        }
    }
}
