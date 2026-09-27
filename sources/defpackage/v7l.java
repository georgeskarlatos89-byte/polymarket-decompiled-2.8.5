package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class v7l {
    public static volatile v7l a;
    public static final v7l b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v7l] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static v7l a() {
        v7l v7lVar = a;
        if (v7lVar != null) {
            return v7lVar;
        }
        synchronized (v7l.class) {
            try {
                v7l v7lVar2 = a;
                if (v7lVar2 != null) {
                    return v7lVar2;
                }
                int i = d7l.a;
                v7l d = a8l.d();
                a = d;
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
