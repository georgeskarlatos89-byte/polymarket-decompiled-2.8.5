package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class k5l {
    public static final l5l a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l5l] */
    static {
        p5l p5lVar;
        try {
            p5lVar = q5l.a;
        } catch (NoClassDefFoundError unused) {
            p5lVar = null;
        }
        if (p5lVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = l5l.a[i];
                try {
                    p5lVar = (l5l) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = p5lVar;
    }
}
