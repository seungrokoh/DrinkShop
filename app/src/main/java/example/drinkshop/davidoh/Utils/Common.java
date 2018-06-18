package example.drinkshop.davidoh.Utils;

import example.drinkshop.davidoh.Retrofit.IDrinkShopAPI;
import example.drinkshop.davidoh.Retrofit.RetrofitClient;
import example.drinkshop.davidoh.model.User;

public class Common {
    //In Emulator, localhost = 10.2.2.2
    private static final String BASE_URL = "http://plplim.ipdisk.co.kr:8000/drinkshop/";

    public static User currentUser = null;

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
