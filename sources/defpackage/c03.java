package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface c03 {
    default void a(wp7 wp7Var) {
        int i;
        ArrayList arrayList = wp7Var.a;
        a03 b = b();
        if (b == a03.UNKNOWN) {
            return;
        }
        int i2 = tp7.a[b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    o9n.f("ExifData", "Unknown flash state: " + b);
                    return;
                }
                i = 1;
            } else {
                i = 32;
            }
        } else {
            i = 0;
        }
        if ((i & 1) == 1) {
            wp7Var.c("LightSource", String.valueOf(4), arrayList);
        }
        wp7Var.c("Flash", String.valueOf(i), arrayList);
    }

    a03 b();

    oki e();

    long f();

    default CaptureResult m() {
        return null;
    }

    xz2 n();

    zz2 r();

    vz2 s();
}
