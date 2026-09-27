package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class yjl {
    public static final gkl a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [gkl] */
    static {
        ykl yklVar;
        try {
            yklVar = cll.a;
        } catch (NoClassDefFoundError unused) {
            yklVar = null;
        }
        if (yklVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = gkl.a[i];
                try {
                    yklVar = (gkl) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = yklVar;
    }
}
