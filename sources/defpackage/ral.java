package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ral extends g5 {
    public static final Parcelable.Creator<ral> CREATOR = new mbl(1);
    public String a;
    public String b;
    public ehn c;
    public long d;
    public boolean e;
    public String f;
    public final jgl g;
    public long h;
    public jgl i;
    public final long j;
    public final jgl k;

    public ral(ral ralVar) {
        arn.h(ralVar);
        this.a = ralVar.a;
        this.b = ralVar.b;
        this.c = ralVar.c;
        this.d = ralVar.d;
        this.e = ralVar.e;
        this.f = ralVar.f;
        this.g = ralVar.g;
        this.h = ralVar.h;
        this.i = ralVar.i;
        this.j = ralVar.j;
        this.k = ralVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 2, this.a);
        hxn.j(parcel, 3, this.b);
        hxn.i(parcel, 4, this.c, i);
        long j = this.d;
        hxn.o(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        hxn.o(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        hxn.j(parcel, 7, this.f);
        hxn.i(parcel, 8, this.g, i);
        long j2 = this.h;
        hxn.o(parcel, 9, 8);
        parcel.writeLong(j2);
        hxn.i(parcel, 10, this.i, i);
        hxn.o(parcel, 11, 8);
        parcel.writeLong(this.j);
        hxn.i(parcel, 12, this.k, i);
        hxn.q(parcel, p);
    }

    public ral(String str, String str2, ehn ehnVar, long j, boolean z, String str3, jgl jglVar, long j2, jgl jglVar2, long j3, jgl jglVar3) {
        this.a = str;
        this.b = str2;
        this.c = ehnVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = jglVar;
        this.h = j2;
        this.i = jglVar2;
        this.j = j3;
        this.k = jglVar3;
    }
}
