package io.github.susimsek.gof.facade;

public class CustomEncryptor {

    public static void main(String[] args) {
        String text = "Content";
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"KEY");

        ShaEncryptor shaEncryptor = new ShaEncryptor();
        shaEncryptor.encrypt(text,"KEY",true);

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncType.SHA);
    }
}
