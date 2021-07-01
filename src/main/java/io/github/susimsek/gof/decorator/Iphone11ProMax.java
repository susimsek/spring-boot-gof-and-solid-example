package io.github.susimsek.gof.decorator;

public class Iphone11ProMax extends Iphone11Pro {

    public Iphone11ProMax(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 200;
    }

    @Override
    public String getName() {
        return super.getName() + " Max";
    }

}
