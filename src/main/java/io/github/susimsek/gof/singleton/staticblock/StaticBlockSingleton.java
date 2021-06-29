package io.github.susimsek.gof.singleton.staticblock;

import io.github.susimsek.gof.singleton.eager.EagerSingleton;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class StaticBlockSingleton {

    static StaticBlockSingleton INSTANCE;

    // before instance create
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){

        }
    }

    private StaticBlockSingleton(){
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    public void getMessage(){
        System.out.println("Static Block Singleton Initialization");
    }

}
