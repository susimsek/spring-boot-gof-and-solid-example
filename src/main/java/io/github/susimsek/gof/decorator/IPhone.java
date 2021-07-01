package io.github.susimsek.gof.decorator;

import org.springframework.stereotype.Component;

public class IPhone implements Phone {

    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public Double getPrice() {
        return 699.90;
    }
}
