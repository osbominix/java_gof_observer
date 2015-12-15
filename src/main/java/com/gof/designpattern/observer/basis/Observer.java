package com.gof.designpattern.observer.basis;

import com.gof.designpattern.observer.Butterfly;

/**
 * Created by yl on 15.12.15.
 */
public abstract class Observer {

    protected Butterfly butterfly;

    public abstract void doReaction();

    public Observer(Butterfly butterfly){
        this.butterfly = butterfly;
        this.butterfly.addObserver(this);
    }
}
