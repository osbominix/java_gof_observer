package com.gof.designpattern.observer.basis;

import com.gof.designpattern.observer.Butterfly;

/**
 * Created by yl on 15.12.15.
 */
public class AirObserver extends Observer {


    public AirObserver(Butterfly butterfly) {
        super(butterfly);
    }

    @Override
    public void doReaction() {
        System.out.println("Air moves as butterfly is flying.");
    }
}
