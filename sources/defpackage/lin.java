package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class lin {
    public static final long a(leh lehVar, long j) {
        lehVar.getClass();
        lehVar.h(j);
        long min = Math.min(j, lehVar.c().c);
        lehVar.c().skip(min);
        return min;
    }

    public static final long b(leh lehVar) {
        lehVar.getClass();
        return lehVar.c().c;
    }

    public static final wzc c(Function1 function1) {
        xzc xzcVar = new xzc();
        function1.invoke(xzcVar);
        boolean z = xzcVar.b;
        vzc vzcVar = xzcVar.a;
        vzcVar.a = z;
        vzcVar.b = false;
        String str = xzcVar.d;
        if (str != null) {
            boolean z2 = xzcVar.e;
            boolean z3 = xzcVar.f;
            vzcVar.d = str;
            vzcVar.c = -1;
            vzcVar.e = z2;
            vzcVar.f = z3;
        } else {
            vzcVar.b(xzcVar.c, xzcVar.e, xzcVar.f);
        }
        return vzcVar.a();
    }
}
