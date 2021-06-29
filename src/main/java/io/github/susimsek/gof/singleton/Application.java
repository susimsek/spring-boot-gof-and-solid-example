package io.github.susimsek.gof.singleton;

import io.github.susimsek.gof.singleton.billpugh.BillPughSingleton;
import io.github.susimsek.gof.singleton.eager.EagerSingleton;
import io.github.susimsek.gof.singleton.lazy.LazySingleton;
import io.github.susimsek.gof.singleton.staticblock.StaticBlockSingleton;
import io.github.susimsek.gof.singleton.threadsafe.ThreadSafeSingleton;

public class Application {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.getMessage();

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        staticBlockSingleton.getMessage();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.getMessage();

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.getMessage();

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.getMessage();

    }

}
