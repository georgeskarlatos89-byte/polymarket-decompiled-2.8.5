package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class q2f {
    public static final p2f a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        p2f p2fVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (Intrinsics.areEqual(lowerCase, "robolectric")) {
                p2fVar = new Object();
                a = p2fVar;
            }
        }
        p2fVar = null;
        a = p2fVar;
    }
}
