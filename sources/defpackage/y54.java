package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y54 implements k8i, Parcelable {
    public static final Parcelable.Creator<y54> CREATOR = new z04(13);
    public final String a;
    public final m4e b;
    public final q8e c;
    public final String d;
    public final String e;

    public y54(String str, m4e m4eVar, q8e q8eVar, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = m4eVar;
        this.c = q8eVar;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y54)) {
            return false;
        }
        y54 y54Var = (y54) obj;
        if (Intrinsics.areEqual(this.a, y54Var.a) && this.b == y54Var.b && this.c == y54Var.c && Intrinsics.areEqual(this.d, y54Var.d) && Intrinsics.areEqual(this.e, y54Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        m4e m4eVar = this.b;
        if (m4eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = m4eVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        q8e q8eVar = this.c;
        if (q8eVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = q8eVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.e.hashCode() + ((i4 + i) * 31);
    }

    @Override // defpackage.k8i
    public final Map o0() {
        Map map;
        Map map2;
        Map map3;
        Pair pair = new Pair("merchant_integration_source", "elements");
        Pair pair2 = new Pair("merchant_integration_subtype", "mobile");
        Pair pair3 = new Pair("merchant_integration_version", k84.g("stripe-android/", this.e));
        UUID uuid = s1e.h;
        Map e = d1c.e(pair, pair2, pair3, new Pair("client_session_id", s1e.h.toString()));
        q8e q8eVar = this.c;
        Map map4 = null;
        if (q8eVar != null) {
            map = hdi.v("payment_method_selection_flow", q8eVar.a());
        } else {
            map = null;
        }
        if (map == null) {
            map = zc7.a;
            map.getClass();
        }
        LinkedHashMap j = d1c.j(e, map);
        m4e m4eVar = this.b;
        if (m4eVar != null) {
            map2 = hdi.v("payment_intent_creation_flow", m4eVar.a());
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = zc7.a;
            map2.getClass();
        }
        LinkedHashMap j2 = d1c.j(j, map2);
        String str = this.a;
        if (str != null) {
            map3 = hdi.v("elements_session_config_id", str);
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = zc7.a;
            map3.getClass();
        }
        LinkedHashMap j3 = d1c.j(j2, map3);
        String str2 = this.d;
        if (str2 != null) {
            map4 = hdi.v("checkout_session_id", str2);
        }
        if (map4 == null) {
            map4 = zc7.a;
            map4.getClass();
        }
        return d1c.j(j3, map4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientAttributionMetadata(elementsSessionConfigId=");
        sb.append(this.a);
        sb.append(", paymentIntentCreationFlow=");
        sb.append(this.b);
        sb.append(", paymentMethodSelectionFlow=");
        sb.append(this.c);
        sb.append(", checkoutSessionId=");
        sb.append(this.d);
        sb.append(", stripeSdkVersion=");
        return woa.r(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        m4e m4eVar = this.b;
        if (m4eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(m4eVar.name());
        }
        q8e q8eVar = this.c;
        if (q8eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(q8eVar.name());
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
