package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ee1 implements j8i {
    public static final Parcelable.Creator<ee1> CREATOR = new d51(13);
    public final String a;
    public final String b;
    public final boolean c;

    public ee1(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(k73 k73Var) {
        boolean z;
        boolean z2;
        k73Var.getClass();
        String str = k73Var.d;
        BigDecimal bigDecimal = null;
        try {
            if (d.e(str)) {
                bigDecimal = new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (bigDecimal == null) {
            return false;
        }
        int length = str.length();
        String str2 = this.a;
        if (length >= str2.length() ? new BigDecimal(r2i.H(str2.length(), str)).compareTo(new BigDecimal(str2)) >= 0 : bigDecimal.compareTo(new BigDecimal(r2i.H(str.length(), str2))) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int length2 = str.length();
        String str3 = this.b;
        if (length2 >= str3.length() ? new BigDecimal(r2i.H(str3.length(), str)).compareTo(new BigDecimal(str3)) <= 0 : bigDecimal.compareTo(new BigDecimal(r2i.H(str.length(), str3))) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1)) {
            return false;
        }
        ee1 ee1Var = (ee1) obj;
        if (Intrinsics.areEqual(this.a, ee1Var.a) && Intrinsics.areEqual(this.b, ee1Var.b) && this.c == ee1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hdi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ix2.r(m51.r("BinRange(low=", this.a, ", high=", this.b, ", isStatic="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
