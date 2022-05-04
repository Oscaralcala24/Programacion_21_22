package U8.Tarea1RetroFit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        OkHttpClient okHttpClient =
                new OkHttpClient.Builder()
                        .connectTimeout(1, TimeUnit.MINUTES)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(15, TimeUnit.SECONDS)
                        .build();

        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();
    }
}
