package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pnf {
    public final i4 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public pnf(ts8 ts8Var, String str, Object[] objArr) {
        this.a = ts8Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    public final vff a() {
        int i = this.d;
        if ((i & 1) != 0) {
            return vff.PROTO2;
        }
        if ((i & 4) == 4) {
            return vff.EDITIONS;
        }
        return vff.PROTO3;
    }
}
