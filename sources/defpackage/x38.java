package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x38 extends a48 {
    public static final Parcelable.Creator<x38> CREATOR = new ci7(14);
    public final f48 a;
    public final i87 b;

    public x38(f48 f48Var, i87 i87Var) {
        f48Var.getClass();
        this.a = f48Var;
        this.b = i87Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.a48
    public final f48 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x38)) {
            return false;
        }
        x38 x38Var = (x38) obj;
        if (Intrinsics.areEqual(this.a, x38Var.a) && Intrinsics.areEqual(this.b, x38Var.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a48
    public final i87 g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        i87 i87Var = this.b;
        if (i87Var == null) {
            hashCode = 0;
        } else {
            hashCode = i87Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ForData(configuration=" + this.a + ", elementsSessionContext=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        i87 i87Var = this.b;
        if (i87Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i87Var.writeToParcel(parcel, i);
        }
    }
}
