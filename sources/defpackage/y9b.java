package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y9b extends bab {
    public static final Parcelable.Creator<y9b> CREATOR = new v5a(12);
    public final o9b a;
    public final mgb b;
    public final c25 c;
    public final Boolean d;

    public /* synthetic */ y9b(o9b o9bVar, mgb mgbVar, c25 c25Var, Boolean bool, int i) {
        this(o9bVar, (i & 2) != 0 ? null : mgbVar, (i & 4) != 0 ? null : c25Var, (i & 8) != 0 ? null : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.bab
    public final o9b e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9b)) {
            return false;
        }
        y9b y9bVar = (y9b) obj;
        if (Intrinsics.areEqual(this.a, y9bVar.a) && Intrinsics.areEqual(this.b, y9bVar.b) && Intrinsics.areEqual(this.c, y9bVar.c) && Intrinsics.areEqual(this.d, y9bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        mgb mgbVar = this.b;
        if (mgbVar == null) {
            hashCode = 0;
        } else {
            hashCode = mgbVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        c25 c25Var = this.c;
        if (c25Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c25Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "Completed(linkAccountUpdate=" + this.a + ", selectedPayment=" + this.b + ", shippingAddress=" + this.c + ", authorizationConsentGranted=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            pxl.i(parcel, 1, bool);
        }
    }

    public y9b(o9b o9bVar, mgb mgbVar, c25 c25Var, Boolean bool) {
        o9bVar.getClass();
        this.a = o9bVar;
        this.b = mgbVar;
        this.c = c25Var;
        this.d = bool;
    }
}
