package com.brittosaji.stopmotion;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;

/**
 * Created by britto on 23/6/17.
 */

public class CameraStatus {
    public static boolean getStatus(Context context){
        PackageManager pm= context.getPackageManager();
        if(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            return true;
        }
        else{
            return false;
        }
    }

    public static Camera getCamera(){
        Camera deviceCamera=null;
        try{
            deviceCamera=Camera.open();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return deviceCamera;
    }
}
