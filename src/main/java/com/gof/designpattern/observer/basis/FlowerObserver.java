package com.gof.designpattern.observer.basis;

import com.gof.designpattern.observer.Butterfly;

/**
 * Created by yl on 15.12.15.
 */
public class FlowerObserver extends Observer {


    public FlowerObserver(Butterfly butterfly) {
        super(butterfly);
    }

    @Override
    public void doReaction() {
        System.out.println("Flower swings as butterfly is flying.");
    }
}
