package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q5j implements oye {
    public final int a;

    public q5j(int i) {
        this.a = i;
    }

    @Override // defpackage.oye
    public final long e(i1a i1aVar, long j, owa owaVar, long j2) {
        int i = (int) (j2 >> 32);
        int c = ix2.c(i1aVar.d(), i, 2, i1aVar.a);
        if (c < 0) {
            c = i1aVar.a;
        } else if (c + i > ((int) (j >> 32))) {
            c = i1aVar.c - i;
        }
        int i2 = i1aVar.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = i1aVar.d + i3;
        }
        return (c << 32) | (i4 & 4294967295L);
    }
}
