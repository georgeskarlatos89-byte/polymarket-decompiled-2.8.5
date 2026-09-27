package bo.app;

import android.util.Base64;
import defpackage.b69;
import defpackage.d2i;
import defpackage.zv5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gh implements pa {
    public static final String d = b69.s(gh.class);
    public final long a;
    public final long b;
    public t9 c;

    public gh() {
        long e = zv5.e();
        this.b = e;
        this.a = e / 1000;
    }

    public static String a(String str) {
        if (d2i.d(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            b69.r(d, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }
}
