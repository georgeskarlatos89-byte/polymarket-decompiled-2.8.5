package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class oyb extends g85 {
    @Override // defpackage.g85
    public String toString() {
        u39 u39Var;
        String str;
        mv6 mv6Var = mv6.a;
        u39 u39Var2 = qyb.b;
        if (this == u39Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                u39Var = u39Var2.e;
            } catch (UnsupportedOperationException unused) {
                u39Var = null;
            }
            if (this == u39Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + pw5.f(this);
        }
        return str;
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        k6n.c(i);
        return this;
    }
}
