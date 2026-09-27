package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ti5 implements Parcelable {
    public static final Parcelable.Creator<ti5> CREATOR = new ji5(1);
    public final fj5 a;
    public final ki5 b;
    public final Integer c;

    public ti5(fj5 fj5Var, ki5 ki5Var, Integer num) {
        fj5Var.getClass();
        ki5Var.getClass();
        this.a = fj5Var;
        this.b = ki5Var;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti5)) {
            return false;
        }
        ti5 ti5Var = (ti5) obj;
        if (this.a == ti5Var.a && Intrinsics.areEqual(this.b, ti5Var.b) && Intrinsics.areEqual(this.c, ti5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Args(integrationType=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", statusBarColor=");
        return g.p(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num);
        }
    }
}
