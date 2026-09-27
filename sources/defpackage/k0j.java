package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k0j {
    public j0j b;
    public long f;
    public float[] g;
    public final bpc a = d1a.a();
    public long c = -1;
    public long d = 0;
    public long e = 0;

    public final void a(j0j j0jVar, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = j0jVar.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            j0jVar.g = j3;
            j0jVar.a(j0jVar.e, j0jVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!e1a.b(j2, this.d)) {
            this.d = j2;
            z = true;
        } else {
            z = false;
        }
        if (!e1a.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 != this.f) {
            this.f = j3;
            return true;
        }
        return z;
    }
}
