package http;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Moeda;

public class JsonConverter {

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public double Conversor(String json){
        Moeda moeda = gson.fromJson(json, Moeda.class);
        return Double.valueOf(moeda.conversionRate());
    }
}
