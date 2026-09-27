package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class khj {
    public static final khj i = new khj(new khj(null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final khj c;
    public final boolean d;
    public final khj e;
    public final khj f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ khj(khj khjVar, int i2) {
        this(r4, r5, r6, true, r6, r6, r10, r11);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        khj khjVar2 = (i2 & 32) != 0 ? null : khjVar;
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
    }

    public khj(boolean z, boolean z2, khj khjVar, boolean z3, khj khjVar2, khj khjVar3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = khjVar;
        this.d = z3;
        this.e = khjVar2;
        this.f = khjVar3;
        this.g = z4;
        this.h = z5;
    }
}
