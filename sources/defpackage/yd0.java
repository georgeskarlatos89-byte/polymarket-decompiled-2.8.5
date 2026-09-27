package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yd0 implements Parcelable {
    public static final Parcelable.Creator<yd0> CREATOR = new xd0(0);
    public final String a;
    public final String b;
    public final String c;

    public yd0(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (!StringsKt.T(str)) {
            if (!e.u(str, "sk_", false)) {
                if (!e.u(str, "rk_", false)) {
                    return;
                }
                dmk.v("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
                throw null;
            }
            dmk.v("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        dmk.v("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return !StringsKt.L(this.a, "test", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd0)) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        if (Intrinsics.areEqual(this.a, yd0Var.a) && Intrinsics.areEqual(this.b, yd0Var.b) && Intrinsics.areEqual(this.c, yd0Var.c)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return e.u(this.a, "uk_", false);
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
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Options(apiKey=***)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public /* synthetic */ yd0(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yd0(Function0 function0, Function0 function02) {
        this((String) function0.invoke(), (String) function02.invoke(), 4);
        function0.getClass();
        function02.getClass();
    }
}
