package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e2e implements Parcelable {
    public static final d2e CREATOR = new Object();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final m9i g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final Integer k;
    public final String l;
    public final boolean m;
    public final String n;
    public final boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e2e(String str, int i, String str2, String str3, String str4, boolean z, m9i m9iVar, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, String str7, boolean z5, int i2) {
        this(str, i, str2, str3, str4, z, r10, str5, z2, r13, num, str6, z4, r17, r18);
        m9i m9iVar2;
        boolean z6;
        String str8;
        boolean z7;
        if ((i2 & 64) != 0) {
            m9iVar2 = null;
        } else {
            m9iVar2 = m9iVar;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            z6 = true;
        } else {
            z6 = z3;
        }
        if ((i2 & 8192) != 0) {
            str8 = null;
        } else {
            str8 = str7;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            z7 = false;
        } else {
            z7 = z5;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2e)) {
            return false;
        }
        e2e e2eVar = (e2e) obj;
        if (Intrinsics.areEqual(this.a, e2eVar.a) && this.b == e2eVar.b && Intrinsics.areEqual(this.c, e2eVar.c) && Intrinsics.areEqual(this.d, e2eVar.d) && Intrinsics.areEqual(this.e, e2eVar.e) && this.f == e2eVar.f && Intrinsics.areEqual(this.g, e2eVar.g) && Intrinsics.areEqual(this.h, e2eVar.h) && this.i == e2eVar.i && this.j == e2eVar.j && Intrinsics.areEqual(this.k, e2eVar.k) && Intrinsics.areEqual(this.l, e2eVar.l) && this.m == e2eVar.m && Intrinsics.areEqual(this.n, e2eVar.n) && this.o == e2eVar.o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int e = hdi.e(hdi.e(woa.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = hdi.g((e + hashCode) * 31, 31, this.f);
        m9i m9iVar = this.g;
        if (m9iVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = m9iVar.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        String str2 = this.h;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int g2 = hdi.g(hdi.g((i2 + hashCode3) * 31, 31, this.i), 31, this.j);
        Integer num = this.k;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int g3 = hdi.g(hdi.e((g2 + hashCode4) * 31, 31, this.l), 31, this.m);
        String str3 = this.n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Boolean.hashCode(this.o) + ((g3 + i) * 31);
    }

    public final String toString() {
        StringBuilder q = m51.q("Args(objectId=", this.a, ", requestCode=", this.b, ", clientSecret=");
        k84.q(q, this.c, ", url=", this.d, ", returnUrl=");
        ace.A(this.e, ", enableLogging=", ", toolbarCustomization=", q, this.f);
        q.append(this.g);
        q.append(", stripeAccountId=");
        q.append(this.h);
        q.append(", shouldCancelSource=");
        hdi.B(q, this.i, ", shouldCancelIntentOnUserNavigation=", this.j, ", statusBarColor=");
        q.append(this.k);
        q.append(", publishableKey=");
        q.append(this.l);
        q.append(", isInstantApp=");
        m51.y(", referrer=", this.n, ", forceInAppWebView=", q, this.m);
        return ix2.r(q, this.o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.k);
        parcel.writeString(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public e2e(String str, int i, String str2, String str3, String str4, boolean z, m9i m9iVar, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, String str7, boolean z5) {
        woa.A(str, str2, str3, str6);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = m9iVar;
        this.h = str5;
        this.i = z2;
        this.j = z3;
        this.k = num;
        this.l = str6;
        this.m = z4;
        this.n = str7;
        this.o = z5;
    }
}
