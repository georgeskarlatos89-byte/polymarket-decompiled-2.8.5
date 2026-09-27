package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jgl extends g5 {
    public static final Parcelable.Creator<jgl> CREATOR = new ofl(5);
    public final String a;
    public final cgl b;
    public final String c;
    public final long d;
    public final long e;

    public jgl(jgl jglVar, long j, long j2) {
        arn.h(jglVar);
        this.a = jglVar.a;
        this.b = jglVar.b;
        this.c = jglVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        k84.q(sb, "origin=", str, ",name=", str2);
        return woa.r(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ofl.a(this, parcel, i);
    }

    public jgl(String str, cgl cglVar, String str2, long j, long j2) {
        this.a = str;
        this.b = cglVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
