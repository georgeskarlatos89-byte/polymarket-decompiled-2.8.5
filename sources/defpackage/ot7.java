package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ot7 {
    public static volatile ot7 a;
    public static final ot7 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ot7, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static ot7 a() {
        ot7 ot7Var;
        zff zffVar = zff.c;
        ot7 ot7Var2 = a;
        if (ot7Var2 == null) {
            synchronized (ot7.class) {
                try {
                    ot7Var = a;
                    if (ot7Var == null) {
                        Class cls = kt7.a;
                        ot7 ot7Var3 = null;
                        if (cls != null) {
                            try {
                                ot7Var3 = (ot7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (ot7Var3 != null) {
                            ot7Var = ot7Var3;
                        } else {
                            ot7Var = b;
                        }
                        a = ot7Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ot7Var;
        }
        return ot7Var2;
    }
}
