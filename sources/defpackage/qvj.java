package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qvj extends c7n {
    public final lcf b;
    public final String c;
    public final Integer d;
    public final int e;

    public qvj(lcf lcfVar, int i, kkn kknVar, int i2) {
        int i3;
        String str = lcfVar.b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        str.getClass();
        this.b = lcfVar;
        this.c = str;
        this.d = num;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else if (i < 1000) {
            i3 = 3;
        } else {
            dmk.v(sv6.j(i, "Max value ", " is too large"));
            throw null;
        }
        this.e = i3;
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
