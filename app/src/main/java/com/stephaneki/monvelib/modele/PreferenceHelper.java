package com.stephaneki.monvelib.modele;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by stephaneki on 12/09/2018 .
 */
public class PreferenceHelper {

    private static final String PREF_FILE_KEY = "com.stephaneki.monvelib.pref_file_key";

    private static final String USER_CONTRACT = "user_contract";

    public static String getUserSelectedContract(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_FILE_KEY, Context.MODE_PRIVATE);
        if (!sharedPref.contains(USER_CONTRACT))
            return null;
        return sharedPref.getString(USER_CONTRACT, null);
    }

    public static void saveUserSelectedContract(Context context, String contractName){
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_FILE_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(USER_CONTRACT, contractName);
        editor.apply();
    }

}
