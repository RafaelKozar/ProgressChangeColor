package bakeapp.rako.progresschangecolor;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by rako on 05/09/2018.
 */

public class Teste {

    public static int convertdpToInt(float dip, Context ctx) {
        Resources r = ctx.getResources();
        float px = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                r.getDisplayMetrics()
        );
        return (int) px;
    }


}
