package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.ace;
import defpackage.ldi;
import defpackage.mdi;
import defpackage.odi;
import defpackage.qdi;
import defpackage.ykf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements ykf {
    public static final ldi a;
    public static final ldi b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        ldi ldiVar = new ldi();
        odi odiVar = odi.YUV;
        mdi mdiVar = mdi.VGA;
        ldiVar.a(qdi.a(odiVar, mdiVar));
        odi odiVar2 = odi.PRIV;
        mdi mdiVar2 = mdi.PREVIEW;
        ldiVar.a(qdi.a(odiVar2, mdiVar2));
        mdi mdiVar3 = mdi.MAXIMUM;
        ldiVar.a(qdi.a(odiVar, mdiVar3));
        a = ldiVar;
        ldi ldiVar2 = new ldi();
        ace.w(odiVar2, mdiVar2, ldiVar2, odiVar2, mdiVar);
        ldiVar2.a(qdi.a(odiVar, mdiVar3));
        b = ldiVar2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean b() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String upperCase = Build.MODEL.toUpperCase(Locale.US);
            Iterator it = d.iterator();
            while (it.hasNext()) {
                if (upperCase.startsWith((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
