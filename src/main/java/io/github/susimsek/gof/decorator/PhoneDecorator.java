package io.github.susimsek.gof.decorator;


public class PhoneDecorator implements Phone {

    private IPhone iPhone;

    public PhoneDecorator(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public String getName() {
        return iPhone.getName();
    }

    @Override
    public int cameraCount() {
        return iPhone.cameraCount();
    }

    @Override
    public Double getPrice() {
        return iPhone.getPrice();
    }
}
