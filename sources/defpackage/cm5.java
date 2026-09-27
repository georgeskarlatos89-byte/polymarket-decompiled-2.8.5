package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cm5 implements Parcelable {
    public static final Parcelable.Creator<cm5> CREATOR = new ji5(4);
    public final String a;
    public final r43 b;
    public final pce c;
    public final boolean d;

    public cm5(String str, r43 r43Var, pce pceVar, boolean z) {
        str.getClass();
        r43Var.getClass();
        pceVar.getClass();
        this.a = str;
        this.b = r43Var;
        this.c = pceVar;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm5)) {
            return false;
        }
        cm5 cm5Var = (cm5) obj;
        if (Intrinsics.areEqual(this.a, cm5Var.a) && this.b == cm5Var.b && Intrinsics.areEqual(this.c, cm5Var.c) && this.d == cm5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Args(lastFour=" + this.a + ", cardBrand=" + this.b + ", appearance=" + this.c + ", isTestMode=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
