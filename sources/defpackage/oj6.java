package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oj6 implements dv7 {
    public jgf a;

    public static void a(jgf jgfVar, jgf jgfVar2) {
        oj6 oj6Var = (oj6) jgfVar;
        if (oj6Var.a == null) {
            oj6Var.a = jgfVar2;
        } else {
            l.o();
        }
    }

    @Override // defpackage.kgf
    public final Object get() {
        jgf jgfVar = this.a;
        if (jgfVar != null) {
            return jgfVar.get();
        }
        l.o();
        return null;
    }
}
