package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rpk {
    public static final rpk b;
    public st6 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rpk] */
    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static st6 a(Context context) {
        st6 st6Var;
        rpk rpkVar = b;
        synchronized (rpkVar) {
            try {
                st6Var = rpkVar.a;
                if (st6Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    st6Var = new st6(context, false);
                    rpkVar.a = st6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return st6Var;
    }
}
