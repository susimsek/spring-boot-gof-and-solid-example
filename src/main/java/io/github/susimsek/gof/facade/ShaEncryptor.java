package io.github.susimsek.gof.facade;

class ShaEncryptor {

    public void encrypt(String text, String key,boolean type){
        if(type)
            System.out.println("<SHA>" + text + key + "</SHA>");
        else
            System.out.println("<SHA>" + key + text + "</SHA>");
    }
}
