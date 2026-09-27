package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gu4 implements Parcelable {
    public static final Parcelable.Creator<gu4> CREATOR = new ea4(6);
    public final String a;
    public final x60 b;
    public final boolean c;
    public final boolean d;

    public gu4(String str, x60 x60Var, boolean z, boolean z2) {
        this.a = str;
        this.b = x60Var;
        this.c = z;
        this.d = z2;
    }

    public static gu4 e(gu4 gu4Var, String str, x60 x60Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = gu4Var.a;
        }
        if ((i & 2) != 0) {
            x60Var = gu4Var.b;
        }
        boolean z2 = true;
        if ((i & 4) != 0) {
            z = gu4Var.c;
        } else {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = gu4Var.d;
        }
        gu4Var.getClass();
        return new gu4(str, x60Var, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu4)) {
            return false;
        }
        gu4 gu4Var = (gu4) obj;
        if (Intrinsics.areEqual(this.a, gu4Var.a) && Intrinsics.areEqual(this.b, gu4Var.b) && this.c == gu4Var.c && this.d == gu4Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        x60 x60Var = this.b;
        if (x60Var != null) {
            i = x60Var.hashCode();
        }
        return Boolean.hashCode(this.d) + hdi.g((i2 + i) * 31, 31, this.c);
    }

    public final String toString() {
        return "ConfirmationChallengeState(hCaptchaToken=" + this.a + ", attestationResult=" + this.b + ", passiveChallengeComplete=" + this.c + ", attestationComplete=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ gu4() {
        this(null, null, false, false);
    }
}
