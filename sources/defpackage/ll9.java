package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class ll9 implements Parcelable {
    public static final ll9 A;
    public static final ll9 B;
    public static final ll9 C;
    public static final ll9 D;
    public static final ll9 E;
    public static final ll9 z;
    public final String a;
    public final boolean b;
    public final fud c;
    public static final kl9 Companion = new Object();
    public static final Parcelable.Creator<ll9> CREATOR = new hl9(1);
    public static final Lazy[] d = {null, null, LazyKt.a(w4b.PUBLICATION, new w29(23))};
    public static final ll9 e = new ll9("billing_details[name]", (fud) null, 6);
    public static final ll9 f = new ll9("card[brand]", (fud) null, 6);
    public static final ll9 g = new ll9("card[networks][preferred]", (fud) null, 6);
    public static final ll9 h = new ll9("card[number]", (fud) null, 6);
    public static final ll9 i = new ll9("card[cvc]", (fud) null, 6);
    public static final ll9 j = new ll9("card[exp_month]", (fud) null, 6);
    public static final ll9 k = new ll9("card[exp_year]", (fud) null, 6);
    public static final ll9 l = new ll9("billing_details[address]", (fud) null, 6);
    public static final ll9 m = new ll9("billing_details[email]", (fud) null, 6);
    public static final ll9 n = new ll9("billing_details[phone]", (fud) null, 6);
    public static final ll9 o = new ll9("billing_details[address][line1]", (fud) null, 6);
    public static final ll9 p = new ll9("billing_details[address][line2]", (fud) null, 6);
    public static final ll9 q = new ll9("billing_details[address][city]", (fud) null, 6);
    public static final ll9 r = new ll9("", (fud) null, 6);
    public static final ll9 s = new ll9("billing_details[address][postal_code]", (fud) null, 6);
    public static final ll9 t = new ll9("", (fud) null, 6);
    public static final ll9 u = new ll9("billing_details[address][state]", (fud) null, 6);
    public static final ll9 v = new ll9("billing_details[address][country]", (fud) null, 6);
    public static final ll9 w = new ll9("save_for_future_use", (fud) null, 6);
    public static final ll9 x = new ll9(PlaceTypes.ADDRESS, (fud) null, 6);
    public static final ll9 y = new ll9("same_as_shipping", (fud) null, 4);

    /* JADX WARN: Type inference failed for: r0v0, types: [kl9, java.lang.Object] */
    static {
        eud eudVar = eud.Extras;
        z = new ll9("set_as_default_payment_method", eudVar, 2);
        dud dudVar = dud.Options;
        new ll9("blik", dudVar, 2);
        A = new ll9("blik[code]", dudVar, 2);
        B = new ll9("konbini[confirmation_number]", dudVar, 2);
        C = new ll9("bacs_debit[confirmed]", eudVar, 2);
        D = new ll9("phone_number_country", eudVar, 2);
        E = new ll9("card[validated_scan]", eudVar, 2);
    }

    public /* synthetic */ ll9(int i2, String str, boolean z2, fud fudVar) {
        if (1 == (i2 & 1)) {
            this.a = str;
            if ((i2 & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i2 & 4) == 0) {
                this.c = dud.Params;
                return;
            } else {
                this.c = fudVar;
                return;
            }
        }
        dqn.d(i2, 1, jl9.a.getDescriptor());
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
        if (!(obj instanceof ll9)) {
            return false;
        }
        ll9 ll9Var = (ll9) obj;
        if (Intrinsics.areEqual(this.a, ll9Var.a) && this.b == ll9Var.b && Intrinsics.areEqual(this.c, ll9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r2 = g.r("IdentifierSpec(v1=", this.a, ", ignoreField=", ", destination=", this.b);
        r2.append(this.c);
        r2.append(")");
        return r2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i2);
    }

    public ll9(String str, boolean z2, fud fudVar) {
        str.getClass();
        fudVar.getClass();
        this.a = str;
        this.b = z2;
        this.c = fudVar;
    }

    public /* synthetic */ ll9(String str, fud fudVar, int i2) {
        this(str, (i2 & 2) == 0, (i2 & 4) != 0 ? dud.Params : fudVar);
    }

    public ll9() {
        this("", (fud) null, 6);
    }
}
