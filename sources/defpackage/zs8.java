package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zs8 extends c7n {
    public final lcf b;
    public final String c;
    public final Object d;

    public zs8(lcf lcfVar, sw5 sw5Var, int i) {
        String str = lcfVar.b;
        sw5Var = (i & 4) != 0 ? null : sw5Var;
        str.getClass();
        this.b = lcfVar;
        this.c = str;
        this.d = sw5Var;
    }

    @Override // defpackage.c7n
    public final lcf c() {
        return this.b;
    }

    @Override // defpackage.c7n
    public final Object d() {
        return this.d;
    }

    @Override // defpackage.c7n
    public final String e() {
        return this.c;
    }
}
