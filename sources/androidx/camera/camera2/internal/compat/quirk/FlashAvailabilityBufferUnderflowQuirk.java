package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import defpackage.ykf;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements ykf {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
