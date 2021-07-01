package io.github.susimsek.gof.decorator;

public class Iphone11 extends PhoneDecorator{

    public Iphone11(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getName() {
        return super.getName() + " 11";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1;
    }
}
