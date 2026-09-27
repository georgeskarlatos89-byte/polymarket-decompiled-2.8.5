package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ywl extends g5 {
    public static final Parcelable.Creator<ywl> CREATOR = new rwl(8);
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final t5n[] j;
    public final float k;
    public final float l;
    public final float m;
    public final fnl[] n;
    public final float o;

    public ywl(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, t5n[] t5nVarArr, float f8, float f9, float f10, fnl[] fnlVarArr, float f11) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = t5nVarArr;
        this.k = f8;
        this.l = f9;
        this.m = f10;
        this.n = fnlVarArr;
        this.o = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeFloat(this.c);
        hxn.o(parcel, 4, 4);
        parcel.writeFloat(this.d);
        hxn.o(parcel, 5, 4);
        parcel.writeFloat(this.e);
        hxn.o(parcel, 6, 4);
        parcel.writeFloat(this.f);
        hxn.o(parcel, 7, 4);
        parcel.writeFloat(this.g);
        hxn.o(parcel, 8, 4);
        parcel.writeFloat(this.h);
        hxn.m(parcel, 9, this.j, i);
        hxn.o(parcel, 10, 4);
        parcel.writeFloat(this.k);
        hxn.o(parcel, 11, 4);
        parcel.writeFloat(this.l);
        hxn.o(parcel, 12, 4);
        parcel.writeFloat(this.m);
        hxn.m(parcel, 13, this.n, i);
        hxn.o(parcel, 14, 4);
        parcel.writeFloat(this.i);
        hxn.o(parcel, 15, 4);
        parcel.writeFloat(this.o);
        hxn.q(parcel, p);
    }
}
