package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class s95 implements Parcelable {
    public final String a;
    public static final r95 Companion = new Object();
    public static final Parcelable.Creator<s95> CREATOR = new j15(10);
    public static final s95 b = new s95("US");

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r95] */
    static {
        new s95("CA");
        new s95("GB");
    }

    public /* synthetic */ s95(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            dqn.d(i, 1, q95.a.getDescriptor());
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
        if ((obj instanceof s95) && Intrinsics.areEqual(this.a, ((s95) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("CountryCode(value=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }

    public s95(String str) {
        str.getClass();
        this.a = str;
    }
}
