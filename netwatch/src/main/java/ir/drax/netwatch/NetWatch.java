package ir.drax.netwatch;

import android.app.Activity;
import android.content.Context;

/**
 * Main Initialization class
 * Here we get Singleton instance of Builder to set configs
 * requesting to unregister is also available here
 */
public class NetWatch {
    public static Builder builder(Context context){
        return Builder.getInstance((Activity) context);
    }
    public static Builder builder(Activity activity){
        return Builder.getInstance(activity);
    }

    public static void unregister(Context context){
        Builder.getInstance((Activity) context).unregister();
    }

    public static boolean isConnected(Context context){
        return Builder.getInstance((Activity) context).isConnected();
    }

}
