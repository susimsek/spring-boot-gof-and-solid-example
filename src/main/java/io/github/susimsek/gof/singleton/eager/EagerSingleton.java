package io.github.susimsek.gof.singleton.eager;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class EagerSingleton {

    final static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public void getMessage(){
        System.out.println("Eager Singleton Initialization");
    }

}
