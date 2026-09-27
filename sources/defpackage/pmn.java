package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pmn extends g5 {
    public static final Parcelable.Creator<pmn> CREATOR = new num(28);
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public pmn(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        arn.e(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 2, this.a);
        hxn.j(parcel, 3, this.b);
        hxn.j(parcel, 4, this.c);
        hxn.j(parcel, 5, this.d);
        hxn.o(parcel, 6, 8);
        parcel.writeLong(this.e);
        hxn.o(parcel, 7, 8);
        parcel.writeLong(this.f);
        hxn.j(parcel, 8, this.g);
        hxn.o(parcel, 9, 4);
        parcel.writeInt(this.h ? 1 : 0);
        hxn.o(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        hxn.o(parcel, 11, 8);
        parcel.writeLong(this.j);
        hxn.j(parcel, 12, this.k);
        hxn.o(parcel, 14, 8);
        parcel.writeLong(this.l);
        hxn.o(parcel, 15, 4);
        parcel.writeInt(this.m);
        hxn.o(parcel, 16, 4);
        parcel.writeInt(this.n ? 1 : 0);
        hxn.o(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        Boolean bool = this.p;
        if (bool != null) {
            hxn.o(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        hxn.o(parcel, 22, 8);
        parcel.writeLong(this.q);
        hxn.l(parcel, 23, this.r);
        hxn.j(parcel, 25, this.s);
        hxn.j(parcel, 26, this.t);
        hxn.j(parcel, 27, this.u);
        hxn.o(parcel, 28, 4);
        parcel.writeInt(this.v ? 1 : 0);
        hxn.o(parcel, 29, 8);
        parcel.writeLong(this.w);
        hxn.o(parcel, 30, 4);
        parcel.writeInt(this.x);
        hxn.j(parcel, 31, this.y);
        hxn.o(parcel, 32, 4);
        parcel.writeInt(this.z);
        hxn.o(parcel, 34, 8);
        parcel.writeLong(this.A);
        hxn.j(parcel, 35, this.B);
        hxn.j(parcel, 36, this.C);
        hxn.o(parcel, 37, 8);
        parcel.writeLong(this.D);
        hxn.o(parcel, 38, 4);
        parcel.writeInt(this.E);
        hxn.o(parcel, 39, 8);
        parcel.writeLong(this.F);
        hxn.q(parcel, p);
    }

    public pmn(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }
}
