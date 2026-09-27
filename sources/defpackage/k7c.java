package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class k7c {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (k7c.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
