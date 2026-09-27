package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.api.Keys;
import io.intercom.android.sdk.models.AttributeType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p5e implements j8i, k8i {
    public static final Parcelable.Creator<p5e> CREATOR = new i5e(4);
    public final hd a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ p5e(String str, String str2, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5e)) {
            return false;
        }
        p5e p5eVar = (p5e) obj;
        if (Intrinsics.areEqual(this.a, p5eVar.a) && Intrinsics.areEqual(this.b, p5eVar.b) && Intrinsics.areEqual(this.c, p5eVar.c) && Intrinsics.areEqual(this.d, p5eVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        hd hdVar = this.a;
        if (hdVar == null) {
            hashCode = 0;
        } else {
            hashCode = hdVar.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map] */
    @Override // defpackage.k8i
    public final Map o0() {
        Map map;
        Map map2;
        Map map3;
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        zc7 zc7Var2 = null;
        hd hdVar = this.a;
        if (hdVar != null) {
            map = ace.r(PlaceTypes.ADDRESS, hdVar.o0());
        } else {
            map = null;
        }
        if (map == null) {
            map = zc7Var;
        }
        LinkedHashMap j = d1c.j(zc7Var, map);
        String str = this.b;
        if (str != null) {
            map2 = hdi.v("email", str);
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = zc7Var;
        }
        LinkedHashMap j2 = d1c.j(j, map2);
        String str2 = this.c;
        if (str2 != null) {
            map3 = hdi.v(Keys.KEY_NAME, str2);
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = zc7Var;
        }
        LinkedHashMap j3 = d1c.j(j2, map3);
        String str3 = this.d;
        if (str3 != null) {
            zc7Var2 = hdi.v(AttributeType.PHONE, str3);
        }
        if (zc7Var2 != null) {
            zc7Var = zc7Var2;
        }
        return d1c.j(j3, zc7Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingDetails(address=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", name=");
        return sv6.p(sb, this.c, ", phone=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        hd hdVar = this.a;
        if (hdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hdVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public p5e(hd hdVar, String str, String str2, String str3) {
        this.a = hdVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
