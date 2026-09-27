package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c6d implements Parcelable {
    public static final Parcelable.Creator<c6d> CREATOR = new ahc(8);
    public final float a;
    public final boolean b;

    public c6d(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6d)) {
            return false;
        }
        c6d c6dVar = (c6d) obj;
        if (Float.compare(this.a, c6dVar.a) == 0 && this.b == c6dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NfcCoilScaleState(coilScale=" + this.a + ", isComplete=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
