package com.mycode.designpatternsbehavioralmediator;

import com.mycode.designpatternsbehavioralmediator.entities.Plane;
import com.mycode.designpatternsbehavioralmediator.entities.mediator.AirPortMediator;
import com.mycode.designpatternsbehavioralmediator.entities.mediator.Mediator;


public class DesignPatternsBehavioralMediatorApplication {

    public static void main(String[] args) {
        Plane a = new Plane("A");
        Plane b = new Plane("B");
        Plane c = new Plane("C");
        Plane d = new Plane("D");

        Mediator mediator = new AirPortMediator();
        mediator.addPlane(a);
        mediator.addPlane(b);
        mediator.addPlane(c);
        mediator.addPlane(d);

        a.setMediator(mediator);
        b.setMediator(mediator);
        c.setMediator(mediator);
        d.setMediator(mediator);

        b.land();
    }

}
