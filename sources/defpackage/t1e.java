package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t1e implements Parcelable {
    public static final Parcelable.Creator<t1e> CREATOR = new pzd(8);
    public final int a;
    public final u1e b;

    public t1e(int i, u1e u1eVar) {
        u1eVar.getClass();
        this.a = i;
        this.b = u1eVar;
        if (i >= 5 && i <= 99) {
            return;
        }
        dmk.v("Timeout value must be between 5 and 99, inclusive");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1e)) {
            return false;
        }
        t1e t1eVar = (t1e) obj;
        if (this.a == t1eVar.a && Intrinsics.areEqual(this.b, t1eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Stripe3ds2Config(timeout=" + this.a + ", uiCustomization=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        u1e u1eVar = this.b;
        u1eVar.getClass();
        parcel.writeParcelable(u1eVar.a, i);
    }
}
