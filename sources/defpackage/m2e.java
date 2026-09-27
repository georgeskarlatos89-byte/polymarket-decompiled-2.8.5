package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m2e implements Parcelable {
    public static final Parcelable.Creator<m2e> CREATOR = new pzd(10);
    public static m2e c;
    public final String a;
    public final String b;

    public m2e(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2e)) {
            return false;
        }
        m2e m2eVar = (m2e) obj;
        if (Intrinsics.areEqual(this.a, m2eVar.a) && Intrinsics.areEqual(this.b, m2eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return hdi.p("PaymentConfiguration(publishableKey=", this.a, ", stripeAccountId=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public final boolean z0() {
        return !e.u(this.a, "pk_test", false);
    }
}
