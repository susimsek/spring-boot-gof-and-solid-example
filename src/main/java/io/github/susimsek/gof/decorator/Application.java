package io.github.susimsek.gof.decorator;

import io.github.susimsek.gof.builder.Product;
import io.github.susimsek.gof.builder.ProductLombok;

public class Application {

    public static void main(String[] args) {
        Phone phone = new Iphone11ProMax(new IPhone());
        System.out.println("Name : " + phone.getName());
        System.out.println("Price : " + phone.getPrice());
        System.out.println("Camera Count : " + phone.cameraCount());


    }
}