package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e4c extends l0 {
    public static final Parcelable.Creator<e4c> CREATOR = new cdh(3);
    public boolean c;

    public e4c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            e4c.class.getClassLoader();
        }
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.l0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
