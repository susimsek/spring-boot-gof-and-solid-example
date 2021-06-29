package io.github.susimsek.gof.singleton.billpugh;

import io.github.susimsek.gof.singleton.eager.EagerSingleton;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

public class BillPughSingleton {

    private BillPughSingleton(){
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // init class loader
    @FieldDefaults(level = AccessLevel.PRIVATE)
    private static class SingletonHelper{
        final static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void getMessage(){
        System.out.println("Bill Pugh Singleton Initialization");
    }

}
