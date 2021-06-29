package io.github.susimsek.gof.singleton.threadsafe;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ThreadSafeSingleton {

    static ThreadSafeSingleton INSTANCE;

    // before instance create
    static {
        try {
            INSTANCE = new ThreadSafeSingleton();
        }catch (Exception e){

        }
    }

    private ThreadSafeSingleton(){
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

    public void getMessage(){
        System.out.println("Thread Safe Singleton Initialization");
    }

}
