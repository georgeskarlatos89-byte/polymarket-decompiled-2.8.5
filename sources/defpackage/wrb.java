package defpackage;

import io.sentry.android.core.m0;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wrb {
    public static final lrb a = new Object();

    public static void a(String str) {
        a.getClass();
        HashSet hashSet = lrb.a;
        if (hashSet.contains(str)) {
            return;
        }
        m0.q("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = lrb.a;
        if (hashSet.contains(str)) {
            return;
        }
        m0.q("LOTTIE", str, th);
        hashSet.add(str);
    }
}
