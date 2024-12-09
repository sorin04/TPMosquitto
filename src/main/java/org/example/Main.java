package org.example;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MosquittoClient mqttClient = new MosquittoClient();
        mqttClient.connect();
    }
}