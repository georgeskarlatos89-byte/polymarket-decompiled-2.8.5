package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class iq0 implements Parcelable {
    public static final Parcelable.Creator<iq0> CREATOR = new xd0(4);
    public final String a;
    public final Set b;

    public iq0(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        if (Intrinsics.areEqual(this.a, iq0Var.a) && Intrinsics.areEqual(this.b, iq0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Args(publishableKey=" + this.a + ", productUsage=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Set set = this.b;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }
}
