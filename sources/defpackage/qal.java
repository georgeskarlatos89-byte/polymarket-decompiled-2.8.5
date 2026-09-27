package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qal extends g5 {
    public static final Parcelable.Creator<qal> CREATOR = new mbl(0);
    public int a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qal)) {
            return false;
        }
        qal qalVar = (qal) obj;
        if (this.a == qalVar.a && dkn.b(Boolean.valueOf(this.b), Boolean.valueOf(qalVar.b))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        int i2 = this.a;
        hxn.o(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        hxn.o(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        hxn.q(parcel, p);
    }
}
