package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rqk extends gnf implements Serializable {
    private static final qqk i = new qqk(null);
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    @Override // defpackage.gnf
    public final int a(int i2) {
        return (c() >>> (32 - i2)) & ((-i2) >> 31);
    }

    @Override // defpackage.gnf
    public final int c() {
        int i2 = this.c;
        int i3 = i2 ^ (i2 >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i4 = this.g;
        this.f = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.g = i5;
        int i6 = this.h + 362437;
        this.h = i6;
        return i5 + i6;
    }
}
