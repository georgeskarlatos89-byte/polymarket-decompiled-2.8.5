package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mt7 {
    public static volatile mt7 a;
    public static final mt7 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [mt7, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static mt7 a() {
        mt7 mt7Var;
        mt7 mt7Var2 = a;
        if (mt7Var2 == null) {
            synchronized (mt7.class) {
                try {
                    mt7Var = a;
                    if (mt7Var == null) {
                        Class cls = jt7.a;
                        mt7 mt7Var3 = null;
                        if (cls != null) {
                            try {
                                mt7Var3 = (mt7) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (mt7Var3 != null) {
                            mt7Var = mt7Var3;
                        } else {
                            mt7Var = b;
                        }
                        a = mt7Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return mt7Var;
        }
        return mt7Var2;
    }
}
