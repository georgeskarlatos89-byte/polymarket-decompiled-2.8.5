package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ScreenUtils {
    public static int dpToPx(float f, Context context) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static Point getScreenDimensions(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }
}
