package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ru4 implements Parcelable {
    public static final Parcelable.Creator<ru4> CREATOR = new ea4(7);
    public final su4 a;
    public final u7e b;
    public final Integer c;
    public final c8i d;

    public ru4(su4 su4Var, u7e u7eVar, Integer num) {
        su4Var.getClass();
        u7eVar.getClass();
        this.a = su4Var;
        this.b = u7eVar;
        this.c = num;
        this.d = u7eVar.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru4)) {
            return false;
        }
        ru4 ru4Var = (ru4) obj;
        if (Intrinsics.areEqual(this.a, ru4Var.a) && Intrinsics.areEqual(this.b, ru4Var.b) && Intrinsics.areEqual(this.c, ru4Var.c)) {
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
        StringBuilder sb = new StringBuilder("Args(confirmationOption=");
        sb.append(this.a);
        sb.append(", paymentMethodMetadata=");
        sb.append(this.b);
        sb.append(", statusBarColor=");
        return g.p(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num);
        }
    }
}
