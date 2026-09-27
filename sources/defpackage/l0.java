package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class l0 implements Parcelable {
    public final Parcelable a;
    public static final k0 b = new l0();
    public static final Parcelable.Creator<l0> CREATOR = new jvd(1);

    public l0(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
        } else {
            dmk.v("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public l0() {
        this.a = null;
    }

    public l0(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
