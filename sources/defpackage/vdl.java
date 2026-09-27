package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vdl implements edd {
    public final Object a;

    public vdl() {
        this.a = new Object();
    }

    public static k26 a(dgn dgnVar) {
        new n19(3);
        dgnVar.getClass();
        new HashMap();
        throw null;
    }

    public g27 b(j7c j7cVar) {
        j7cVar.b.getClass();
        j7cVar.b.getClass();
        return g27.a;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [w9l, java.lang.Exception] */
    public Object c() {
        if (w4n.b == null) {
            w4n.b = new Exception();
        }
        synchronized (w4n.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.edd
    public String t() {
        return woa.q(new StringBuilder("attempted to overwrite the existing value '"), this.a, '\'');
    }

    public /* synthetic */ vdl(Object obj) {
        this.a = obj;
    }
}
