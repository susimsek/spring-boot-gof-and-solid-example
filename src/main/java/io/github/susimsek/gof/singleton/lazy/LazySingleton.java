package io.github.susimsek.gof.singleton.lazy;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class LazySingleton {

    static LazySingleton INSTANCE;


    private LazySingleton(){
    }

    public static LazySingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public void getMessage(){
        System.out.println("Lazy Singleton Initialization");
    }

}
