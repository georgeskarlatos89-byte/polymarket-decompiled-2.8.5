package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bee implements Parcelable {
    public static final Parcelable.Creator<bee> CREATOR = new lce(17);
    public final yde a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;
    public final ude f;

    public bee(yde ydeVar, List list, String str, String str2, boolean z, ude udeVar) {
        ydeVar.getClass();
        list.getClass();
        udeVar.getClass();
        this.a = ydeVar;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = udeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bee)) {
            return false;
        }
        bee beeVar = (bee) obj;
        if (Intrinsics.areEqual(this.a, beeVar.a) && Intrinsics.areEqual(this.b, beeVar.b) && Intrinsics.areEqual(this.c, beeVar.c) && Intrinsics.areEqual(this.d, beeVar.d) && this.e == beeVar.e && Intrinsics.areEqual(this.f, beeVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int f = hdi.f(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f.hashCode() + hdi.g((i2 + i) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntentConfiguration(mode=");
        sb.append(this.a);
        sb.append(", paymentMethodTypes=");
        sb.append(this.b);
        sb.append(", paymentMethodConfigurationId=");
        k84.q(sb, this.c, ", onBehalfOf=", this.d, ", requireCvcRecollection=");
        sb.append(this.e);
        sb.append(", intentBehavior=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bee(xde xdeVar, List list) {
        this(xdeVar, list, null, null, false, sde.a);
        list.getClass();
    }
}
