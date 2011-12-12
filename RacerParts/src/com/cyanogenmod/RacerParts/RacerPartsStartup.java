package com.cyanogenmod.RacerParts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

public class RacerPartsStartup extends BroadcastReceiver
{
   @Override
   public void onReceive(final Context context, final Intent bootintent) {
      Utils.updateSettings(PreferenceManager.getDefaultSharedPreferences(context));
   }
}
