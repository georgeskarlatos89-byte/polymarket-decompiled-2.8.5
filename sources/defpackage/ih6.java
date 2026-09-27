package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ih6 extends end {
    public final y45 a;
    public final long b;
    public final /* synthetic */ Object c;

    public ih6(y45 y45Var, Object obj) {
        this.c = obj;
        if (y45Var == null) {
            y45 y45Var2 = u45.a;
            y45Var = u45.b;
        }
        this.a = y45Var;
        this.b = ((byte[]) obj).length;
    }

    @Override // defpackage.gnd
    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.gnd
    public final y45 b() {
        return this.a;
    }

    @Override // defpackage.end
    public final byte[] e() {
        return (byte[]) this.c;
    }
}
