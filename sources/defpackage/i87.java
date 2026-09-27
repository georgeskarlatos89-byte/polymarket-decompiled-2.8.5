package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i87 implements Parcelable {
    public static final Parcelable.Creator<i87> CREATOR = new m77(10);
    public final Long a;
    public final String b;
    public final qfb c;
    public final e87 d;
    public final g87 e;
    public final h87 f;
    public final at9 g;

    public i87(Long l, String str, qfb qfbVar, e87 e87Var, g87 g87Var, h87 h87Var, at9 at9Var) {
        h87Var.getClass();
        this.a = l;
        this.b = str;
        this.c = qfbVar;
        this.d = e87Var;
        this.e = g87Var;
        this.f = h87Var;
        this.g = at9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i87)) {
            return false;
        }
        i87 i87Var = (i87) obj;
        if (Intrinsics.areEqual(this.a, i87Var.a) && Intrinsics.areEqual(this.b, i87Var.b) && this.c == i87Var.c && this.d == i87Var.d && Intrinsics.areEqual(this.e, i87Var.e) && Intrinsics.areEqual(this.f, i87Var.f) && Intrinsics.areEqual(this.g, i87Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        qfb qfbVar = this.c;
        if (qfbVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qfbVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        e87 e87Var = this.d;
        if (e87Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e87Var.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        g87 g87Var = this.e;
        if (g87Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = g87Var.hashCode();
        }
        int hashCode6 = (this.f.hashCode() + ((i5 + hashCode5) * 31)) * 31;
        at9 at9Var = this.g;
        if (at9Var != null) {
            i = at9Var.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "ElementsSessionContext(amount=" + this.a + ", currency=" + this.b + ", linkMode=" + this.c + ", allowRedisplay=" + this.d + ", billingDetails=" + this.e + ", prefillDetails=" + this.f + ", incentiveEligibilitySession=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.b);
        qfb qfbVar = this.c;
        if (qfbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(qfbVar.name());
        }
        e87 e87Var = this.d;
        if (e87Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e87Var.writeToParcel(parcel, i);
        }
        g87 g87Var = this.e;
        if (g87Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            g87Var.writeToParcel(parcel, i);
        }
        this.f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, i);
    }
}
