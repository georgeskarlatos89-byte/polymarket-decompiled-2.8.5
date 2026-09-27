package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class k95 implements Parcelable {
    public final s95 a;
    public final String b;
    public static final j95 Companion = new Object();
    public static final Parcelable.Creator<k95> CREATOR = new j15(9);

    public /* synthetic */ k95(int i, s95 s95Var, String str) {
        if (3 == (i & 3)) {
            this.a = s95Var;
            this.b = str;
        } else {
            dqn.d(i, 3, i95.a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k95)) {
            return false;
        }
        k95 k95Var = (k95) obj;
        if (Intrinsics.areEqual(this.a, k95Var.a) && Intrinsics.areEqual(this.b, k95Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public k95(s95 s95Var, String str) {
        s95Var.getClass();
        str.getClass();
        this.a = s95Var;
        this.b = str;
    }
}
