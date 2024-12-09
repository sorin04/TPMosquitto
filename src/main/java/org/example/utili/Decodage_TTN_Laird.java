package org.example.utili;

import com.google.gson.Gson;
import org.example.pojo.Response;

import java.util.Base64;
import java.util.Locale;

public class Decodage_TTN_Laird {
    String json=null;
    Response pojoTTNV3;

    public Decodage_TTN_Laird(String json) {
        this.json=json;
        Gson gson=new Gson();
        pojoTTNV3=gson.fromJson(json,Response.class);
    }

    public String getUplinkMessage(){
        String frmPayloadBase64 = pojoTTNV3.getUplinkMessage().getFrmPayload();
        byte[] decodedBytes = Base64.getDecoder().decode(frmPayloadBase64);
        int decimalPart = decodedBytes[17] & 0xFF;
        int integerPart = decodedBytes[18] & 0xFF;
        double temperature = integerPart + (decimalPart / 100.0);

        String batteryPercentage = null;
        switch (decodedBytes[5]) {
            case 0:
                batteryPercentage = "0-5%";
                break;
            case 1:
                batteryPercentage = "5-20%";
                break;
            case 2:
                batteryPercentage = "20-40%";
                break;
            case 3:
                batteryPercentage = "40-60%";
                break;
            case 4:
                batteryPercentage = "60-80%";
                break;
            case 5:
                batteryPercentage = "80-100%";
                break;
            default:
                batteryPercentage = "Unknown capacity";
                break;


    }
        return String.format(Locale.US, "Temperature: %.2f°C, Battery: %s", temperature, batteryPercentage);

    }
}
