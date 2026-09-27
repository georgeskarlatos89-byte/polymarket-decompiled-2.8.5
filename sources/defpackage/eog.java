package defpackage;

import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class eog {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public eog f;
    public eog g;

    public eog(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final eog a() {
        eog eogVar = this.f;
        if (eogVar == this) {
            eogVar = null;
        }
        eog eogVar2 = this.g;
        eogVar2.getClass();
        eogVar2.f = this.f;
        eog eogVar3 = this.f;
        eogVar3.getClass();
        eogVar3.g = this.g;
        this.f = null;
        this.g = null;
        return eogVar;
    }

    public final void b(eog eogVar) {
        eogVar.getClass();
        eogVar.g = this;
        eogVar.f = this.f;
        eog eogVar2 = this.f;
        eogVar2.getClass();
        eogVar2.g = eogVar;
        this.f = eogVar;
    }

    public final eog c() {
        this.d = true;
        return new eog(this.a, this.b, this.c, true, false);
    }

    public final void d(eog eogVar, int i) {
        eogVar.getClass();
        byte[] bArr = eogVar.a;
        if (eogVar.e) {
            int i2 = eogVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!eogVar.d) {
                    int i4 = eogVar.b;
                    if (i3 - i4 <= 8192) {
                        ArraysKt.m(bArr, 0, bArr, i4, i2);
                        i2 = eogVar.c - eogVar.b;
                        eogVar.c = i2;
                        eogVar.b = 0;
                    } else {
                        omf.a();
                        return;
                    }
                } else {
                    omf.a();
                    return;
                }
            }
            int i5 = this.b;
            ArraysKt.m(this.a, i2, bArr, i5, i5 + i);
            eogVar.c += i;
            this.b += i;
            return;
        }
        dmk.n("only owner can write");
    }

    public eog() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
