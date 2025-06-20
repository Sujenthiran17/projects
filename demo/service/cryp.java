package com.example.demo.service;
import java.util.*;
import java.security.*;
public class cryp {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen=KeyPairGenerator.getInstance("DSA");
        keyGen.initialize(2048);
        KeyPair keypair=keyGen.generateKeyPair();
        PublicKey publicKey=keypair.getPublic();
        PrivateKey privateKey=keypair.getPrivate();
        String msg="This is a confidential message";
        Signature signature=Signature.getInstance("SHA256withDSA");
        signature.initSign(privateKey);
        signature.update(msg.getBytes());
        byte[] signbyte=signature.sign();
        String signbase54=Base64.getEncoder().encodeToString(signbyte);
        System.out.println(signbase54);
        Signature verify=Signature.getInstance("SHA256withDSA");
        verify.initVerify(publicKey);
        verify.update(msg.getBytes());
        boolean isverified=verify.verify(signbyte);
        System.out.println(isverified);
    }
}
