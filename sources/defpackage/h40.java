package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class h40 {
    public static final d40 a() {
        return new d40(new Path());
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction c(jxd jxdVar) {
        int i = g40.a[jxdVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Path.Direction.CW;
            }
            dmk.a();
            return null;
        }
        return Path.Direction.CCW;
    }
}
