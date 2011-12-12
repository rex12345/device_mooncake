package com.cyanogenmod.RacerParts;

import com.cyanogenmod.RacerParts.R;


import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;


public class RacerParts extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.bladeparts);
    }

   @Override
   public void onPause() {
      super.onPause();
      Utils.updateSettings(PreferenceManager.getDefaultSharedPreferences(getBaseContext()));
   }
}
