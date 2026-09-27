package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class owd implements j8i {
    public static final Parcelable.Creator<owd> CREATOR = new ahc(20);
    public final String a;
    public final String b;
    public final Integer c;

    public owd(String str, String str2, Integer num) {
        str.getClass();
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof owd)) {
            return false;
        }
        owd owdVar = (owd) obj;
        if (Intrinsics.areEqual(this.a, owdVar.a) && Intrinsics.areEqual(this.b, owdVar.b) && Intrinsics.areEqual(this.c, owdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num = this.c;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return g.p(m51.r("PassiveCaptchaParams(siteKey=", this.a, ", rqData=", this.b, ", tokenTimeoutSeconds="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num);
        }
    }
}
