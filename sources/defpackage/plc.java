package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class plc {
    public static final plc a = new Object();

    public final boolean a(MotionEvent motionEvent, int i) {
        if ((Float.floatToRawIntBits(motionEvent.getRawX(i)) & bd0.API_PRIORITY_OTHER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & bd0.API_PRIORITY_OTHER) < 2139095040) {
            return true;
        }
        return false;
    }
}
