package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xzg extends v2 {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = v2.g;
        }
        if (v2.f.c(this, null, obj)) {
            v2.b(this);
            return true;
        }
        return false;
    }

    public final boolean i(Throwable th) {
        if (v2.f.c(this, null, new f2(th))) {
            v2.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(ujb ujbVar) {
        f2 f2Var;
        ujbVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ujbVar.isDone()) {
                if (v2.f.c(this, null, v2.e(ujbVar))) {
                    v2.b(this);
                    return true;
                }
                return false;
            }
            l2 l2Var = new l2(this, ujbVar);
            if (v2.f.c(this, null, l2Var)) {
                try {
                    ujbVar.addListener(l2Var, ot6.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        f2Var = new f2(th);
                    } catch (Throwable unused) {
                        f2Var = f2.b;
                    }
                    v2.f.c(this, l2Var, f2Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof b2) {
            ujbVar.cancel(((b2) obj).a);
        }
        return false;
    }
}
