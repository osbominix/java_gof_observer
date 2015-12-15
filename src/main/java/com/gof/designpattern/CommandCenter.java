package com.gof.designpattern;

import com.gof.designpattern.observer.Butterfly;
import com.gof.designpattern.observer.basis.AirObserver;
import com.gof.designpattern.observer.basis.FlowerObserver;

/**
 * Created by yl on 15.12.15.
 */
public class CommandCenter {

    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();

        new AirObserver(butterfly);
        new FlowerObserver(butterfly);

        butterfly.flying(false);
        butterfly.flying(true);



    }
}
