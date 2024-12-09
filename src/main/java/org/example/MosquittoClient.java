package org.example;

import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt3.Mqtt3AsyncClient;
import com.hivemq.client.mqtt.mqtt3.message.connect.connack.Mqtt3ConnAck;
import com.hivemq.client.mqtt.mqtt3.message.publish.Mqtt3Publish;
import org.example.utili.Decodage_TTN_Laird;

import static org.example.ConfigurationHiveMQ_TTN_V3.*;

public class MosquittoClient {
    private Mqtt3AsyncClient client;
    private Decodage_TTN_Laird decodageTtnLaird;

     public MosquittoClient() {
         client = MqttClient.builder()
                 .useMqttVersion3()
                 .serverHost(SERVER_URI)
                 .serverPort(PORT)
                 .sslWithDefaultConfig()
                 .buildAsync();

     }

     public void connect(){
         client.connectWith()
                 .simpleAuth()
                 .username(USER_NAME)
                 .password(PASSWORD)
                 .applySimpleAuth()
                 .send()
                 .whenComplete((mqtt3ConnAck, throwable) ->{
                     if (throwable != null) {
                         System.err.println("Echec connexion: " + throwable.getMessage());
                     } else {
                         Mqtt3ConnAck connAck = mqtt3ConnAck;
                         System.out.println("Connecter avec succes: " + connAck.getReturnCode());
                         subscribe();
                     }
                 });
     }

    public void subscribe() {
        client.subscribeWith()
                .topicFilter(TOPIC)
                .qos(MqttQos.AT_MOST_ONCE)
                .callback(mqtt3Publish -> {
                    String json = new String(mqtt3Publish.getPayloadAsBytes());
                    decodageTtnLaird = new Decodage_TTN_Laird(json);
                    System.out.println("Message reçu sur le topic '" + TOPIC + "': " + decodageTtnLaird.getUplinkMessage());
                })
                .send()
                .whenComplete((mqtt3SubAck, throwable) -> {
                    if (throwable != null) {
                        System.err.println("Echec souscription: " + throwable.getMessage());
                    } else {
                        System.out.println("Souscription réussie. Return code: " + mqtt3SubAck.getReturnCodes());
                    }
                });
    }
}
