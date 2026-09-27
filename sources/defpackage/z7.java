package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z7 implements j8i {
    public static final Parcelable.Creator<z7> CREATOR = new z4l(2);
    public final ee1 a;
    public final int b;
    public final y7 c;
    public final p63 d;
    public final String e;

    public z7(ee1 ee1Var, int i, y7 y7Var, p63 p63Var, String str) {
        ee1Var.getClass();
        y7Var.getClass();
        p63Var.getClass();
        this.a = ee1Var;
        this.b = i;
        this.c = y7Var;
        this.d = p63Var;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (Intrinsics.areEqual(this.a, z7Var.a) && this.b == z7Var.b && this.c == z7Var.c && this.d == z7Var.d && Intrinsics.areEqual(this.e, z7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + woa.b(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountRange(binRange=");
        sb.append(this.a);
        sb.append(", panLength=");
        sb.append(this.b);
        sb.append(", brandInfo=");
        sb.append(this.c);
        sb.append(", funding=");
        sb.append(this.d);
        sb.append(", country=");
        return woa.r(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeString(this.e);
    }
}
