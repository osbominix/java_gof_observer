package com.gof.designpattern.observer;

import com.gof.designpattern.observer.basis.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yl on 15.12.15.
 */
public class Butterfly {

    private Set<Observer> observerObject= new HashSet<Observer>();

    public void addObserver(Observer observer) {
        observerObject.add(observer);
    }

    public void flying(boolean isFlying) {
        if (isFlying) {
            System.out.println("Butterfly is flying.");
            notifyAllObserver();
        } else {
            System.out.println("Butterfly is sleeping.");
            System.out.println();
        }
    }

    public void notifyAllObserver() {
        for (Observer observer : observerObject) {
            observer.doReaction();
        }
    }

}
