package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ujh {
    public static final boolean a;
    public static final ml0 b;
    public static final ml0 c;
    public static final ml0 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            new tjh(Date.class, 0);
            new tjh(Timestamp.class, 1);
            b = rjh.c;
            c = rjh.d;
            d = sjh.c;
            return;
        }
        b = null;
        c = null;
        d = null;
    }
}
