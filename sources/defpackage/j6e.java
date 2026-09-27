package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j6e implements j8i {
    public static final Parcelable.Creator<j6e> CREATOR = new i5e(12);
    public final String a;
    public final Long b;
    public final boolean c;
    public final String d;
    public final c6e e;
    public final p5e f;
    public final String g;
    public final v5e h;
    public final w5e i;
    public final x5e j;
    public final y5e k;
    public final a6e l;
    public final m5e m;
    public final n5e n;
    public final z5e o;
    public final h6e p;
    public final ggb q;
    public final boolean r;
    public final l5e s;

    public /* synthetic */ j6e(String str, Long l, boolean z, String str2, c6e c6eVar, p5e p5eVar, String str3, v5e v5eVar, w5e w5eVar, x5e x5eVar, y5e y5eVar, a6e a6eVar, m5e m5eVar, n5e n5eVar, z5e z5eVar, h6e h6eVar, bgb bgbVar, l5e l5eVar, int i) {
        this(str, l, z, str2, c6eVar, (i & 32) != 0 ? null : p5eVar, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : v5eVar, (i & 256) != 0 ? null : w5eVar, (i & Barcode.FORMAT_UPC_A) != 0 ? null : x5eVar, (i & Barcode.FORMAT_UPC_E) != 0 ? null : y5eVar, (i & 2048) != 0 ? null : a6eVar, (i & 4096) != 0 ? null : m5eVar, (i & 8192) != 0 ? null : n5eVar, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : z5eVar, (32768 & i) != 0 ? null : h6eVar, (ggb) ((65536 & i) != 0 ? null : bgbVar), false, (i & 262144) != 0 ? null : l5eVar);
    }

    public static j6e e(j6e j6eVar, p5e p5eVar, v5e v5eVar, ggb ggbVar, boolean z, int i) {
        p5e p5eVar2;
        v5e v5eVar2;
        h6e h6eVar;
        ggb ggbVar2;
        boolean z2;
        String str = j6eVar.a;
        Long l = j6eVar.b;
        boolean z3 = j6eVar.c;
        String str2 = j6eVar.d;
        c6e c6eVar = j6eVar.e;
        if ((i & 32) != 0) {
            p5eVar2 = j6eVar.f;
        } else {
            p5eVar2 = p5eVar;
        }
        String str3 = j6eVar.g;
        if ((i & 128) != 0) {
            v5eVar2 = j6eVar.h;
        } else {
            v5eVar2 = v5eVar;
        }
        w5e w5eVar = j6eVar.i;
        p5e p5eVar3 = p5eVar2;
        v5e v5eVar3 = v5eVar2;
        x5e x5eVar = j6eVar.j;
        y5e y5eVar = j6eVar.k;
        a6e a6eVar = j6eVar.l;
        m5e m5eVar = j6eVar.m;
        n5e n5eVar = j6eVar.n;
        z5e z5eVar = j6eVar.o;
        h6e h6eVar2 = j6eVar.p;
        if ((i & 65536) != 0) {
            h6eVar = h6eVar2;
            ggbVar2 = j6eVar.q;
        } else {
            h6eVar = h6eVar2;
            ggbVar2 = ggbVar;
        }
        if ((i & 131072) != 0) {
            z2 = j6eVar.r;
        } else {
            z2 = z;
        }
        l5e l5eVar = j6eVar.s;
        j6eVar.getClass();
        str.getClass();
        return new j6e(str, l, z3, str2, c6eVar, p5eVar3, str3, v5eVar3, w5eVar, x5eVar, y5eVar, a6eVar, m5eVar, n5eVar, z5eVar, h6eVar, ggbVar2, z2, l5eVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6e)) {
            return false;
        }
        j6e j6eVar = (j6e) obj;
        if (Intrinsics.areEqual(this.a, j6eVar.a) && Intrinsics.areEqual(this.b, j6eVar.b) && this.c == j6eVar.c && Intrinsics.areEqual(this.d, j6eVar.d) && this.e == j6eVar.e && Intrinsics.areEqual(this.f, j6eVar.f) && Intrinsics.areEqual(this.g, j6eVar.g) && Intrinsics.areEqual(this.h, j6eVar.h) && Intrinsics.areEqual(this.i, j6eVar.i) && Intrinsics.areEqual(this.j, j6eVar.j) && Intrinsics.areEqual(this.k, j6eVar.k) && Intrinsics.areEqual(this.l, j6eVar.l) && Intrinsics.areEqual(this.m, j6eVar.m) && Intrinsics.areEqual(this.n, j6eVar.n) && Intrinsics.areEqual(this.o, j6eVar.o) && Intrinsics.areEqual(this.p, j6eVar.p) && Intrinsics.areEqual(this.q, j6eVar.q) && this.r == j6eVar.r && this.s == j6eVar.s) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16 = this.a.hashCode() * 31;
        int i = 0;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int g = hdi.g((hashCode16 + hashCode) * 31, 31, this.c);
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        c6e c6eVar = this.e;
        if (c6eVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c6eVar.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        p5e p5eVar = this.f;
        if (p5eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = p5eVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        v5e v5eVar = this.h;
        if (v5eVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = v5eVar.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        w5e w5eVar = this.i;
        if (w5eVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = Boolean.hashCode(w5eVar.a);
        }
        int i7 = (i6 + hashCode7) * 31;
        x5e x5eVar = this.j;
        if (x5eVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = x5eVar.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        y5e y5eVar = this.k;
        if (y5eVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = y5eVar.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        a6e a6eVar = this.l;
        if (a6eVar == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = a6eVar.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        m5e m5eVar = this.m;
        if (m5eVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = m5eVar.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        n5e n5eVar = this.n;
        if (n5eVar == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = n5eVar.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        z5e z5eVar = this.o;
        if (z5eVar == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = z5eVar.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        h6e h6eVar = this.p;
        if (h6eVar == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = h6eVar.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        ggb ggbVar = this.q;
        if (ggbVar == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = ggbVar.hashCode();
        }
        int g2 = hdi.g((i14 + hashCode15) * 31, 31, this.r);
        l5e l5eVar = this.s;
        if (l5eVar != null) {
            i = l5eVar.hashCode();
        }
        return g2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethod(id=");
        sb.append(this.a);
        sb.append(", created=");
        sb.append(this.b);
        sb.append(", liveMode=");
        m51.y(", code=", this.d, ", type=", sb, this.c);
        sb.append(this.e);
        sb.append(", billingDetails=");
        sb.append(this.f);
        sb.append(", customerId=");
        sb.append(this.g);
        sb.append(", card=");
        sb.append(this.h);
        sb.append(", cardPresent=");
        sb.append(this.i);
        sb.append(", fpx=");
        sb.append(this.j);
        sb.append(", ideal=");
        sb.append(this.k);
        sb.append(", sepaDebit=");
        sb.append(this.l);
        sb.append(", auBecsDebit=");
        sb.append(this.m);
        sb.append(", bacsDebit=");
        sb.append(this.n);
        sb.append(", netbanking=");
        sb.append(this.o);
        sb.append(", usBankAccount=");
        sb.append(this.p);
        sb.append(", linkPaymentDetails=");
        sb.append(this.q);
        sb.append(", isLinkPassthroughMode=");
        sb.append(this.r);
        sb.append(", allowRedisplay=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        c6e c6eVar = this.e;
        if (c6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c6eVar.writeToParcel(parcel, i);
        }
        p5e p5eVar = this.f;
        if (p5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p5eVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        v5e v5eVar = this.h;
        if (v5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v5eVar.writeToParcel(parcel, i);
        }
        w5e w5eVar = this.i;
        if (w5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(w5eVar.a ? 1 : 0);
        }
        x5e x5eVar = this.j;
        if (x5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x5eVar.writeToParcel(parcel, i);
        }
        y5e y5eVar = this.k;
        if (y5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            y5eVar.writeToParcel(parcel, i);
        }
        a6e a6eVar = this.l;
        if (a6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a6eVar.writeToParcel(parcel, i);
        }
        m5e m5eVar = this.m;
        if (m5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m5eVar.writeToParcel(parcel, i);
        }
        n5e n5eVar = this.n;
        if (n5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n5eVar.writeToParcel(parcel, i);
        }
        z5e z5eVar = this.o;
        if (z5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(z5eVar.a);
        }
        h6e h6eVar = this.p;
        if (h6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            h6eVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.r ? 1 : 0);
        l5e l5eVar = this.s;
        if (l5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l5eVar.writeToParcel(parcel, i);
        }
    }

    public j6e(String str, Long l, boolean z, String str2, c6e c6eVar, p5e p5eVar, String str3, v5e v5eVar, w5e w5eVar, x5e x5eVar, y5e y5eVar, a6e a6eVar, m5e m5eVar, n5e n5eVar, z5e z5eVar, h6e h6eVar, ggb ggbVar, boolean z2, l5e l5eVar) {
        str.getClass();
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = str2;
        this.e = c6eVar;
        this.f = p5eVar;
        this.g = str3;
        this.h = v5eVar;
        this.i = w5eVar;
        this.j = x5eVar;
        this.k = y5eVar;
        this.l = a6eVar;
        this.m = m5eVar;
        this.n = n5eVar;
        this.o = z5eVar;
        this.p = h6eVar;
        this.q = ggbVar;
        this.r = z2;
        this.s = l5eVar;
    }
}
