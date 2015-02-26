package com.test.scrubdemo.utils;

import android.util.Log;

/**
 * Created by sauravrp on 2/26/15.
 */
public class Utils
{
    private static boolean sLogEnabled = false;

    public static void enableLogging(boolean enable)
    {
        sLogEnabled = enable;
    }

    public static void LogDebug(String tag, String log)
    {
       if(sLogEnabled)
       {
           Log.d(tag, log);
       }
    }

    public static void LogError(String tag, String log)
    {
        if(sLogEnabled)
        {
            Log.e(tag, log);
        }
    }
}
