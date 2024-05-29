package ai.identfy.android;

import android.content.Context;
import android.content.Intent;

public class Identfy {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, InitActivity.class));
    }

}
