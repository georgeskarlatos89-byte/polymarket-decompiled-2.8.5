package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.android.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class edi {
    public final String a;
    public final String b;
    public final d3g c;
    public final int d;
    public final Integer e;
    public final String f;
    public final String g;
    public final boolean h;
    public final d3g i;
    public final Integer j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public edi(d7e d7eVar, y2h y2hVar, int i, int i2, Integer num, boolean z, il9 il9Var, Integer num2, int i3) {
        this(r5, r6, i2, num, r9, r2, r11, r12, r13, 2);
        y2h y2hVar2;
        boolean z2;
        il9 il9Var2;
        Integer num3;
        String str;
        upg upgVar;
        upg upgVar2;
        String str2 = null;
        if ((i3 & 2) != 0) {
            y2hVar2 = null;
        } else {
            y2hVar2 = y2hVar;
        }
        if ((i3 & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 64) != 0) {
            il9Var2 = null;
        } else {
            il9Var2 = il9Var;
        }
        if ((i3 & 128) != 0) {
            num3 = null;
        } else {
            num3 = num2;
        }
        d7eVar.getClass();
        String str3 = d7eVar.getType().code;
        il9 b = xun.b(i);
        if (y2hVar2 != null && (upgVar2 = y2hVar2.c) != null) {
            str = upgVar2.a;
        } else {
            str = null;
        }
        if (y2hVar2 != null && (upgVar = y2hVar2.c) != null) {
            str2 = upgVar.b;
        }
    }

    public final nk8 a(l7e l7eVar) {
        String str;
        if (l7eVar != null) {
            str = l7eVar.b;
        } else {
            str = null;
        }
        return new nk8(this.c, true, this.d, this.e, this.f, this.g, this.h, str, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edi)) {
            return false;
        }
        edi ediVar = (edi) obj;
        if (Intrinsics.areEqual(this.a, ediVar.a) && Intrinsics.areEqual(this.b, ediVar.b) && Intrinsics.areEqual(this.c, ediVar.c) && this.d == ediVar.d && Intrinsics.areEqual(this.e, ediVar.e) && Intrinsics.areEqual(this.f, ediVar.f) && Intrinsics.areEqual(this.g, ediVar.g) && this.h == ediVar.h && Intrinsics.areEqual(this.i, ediVar.i) && Intrinsics.areEqual(this.j, ediVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b = woa.b(this.d, (this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        int i = 0;
        Integer num = this.e;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str = this.f;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int g = hdi.g((i3 + hashCode3) * 31, 31, this.h);
        d3g d3gVar = this.i;
        if (d3gVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d3gVar.hashCode();
        }
        int i4 = (g + hashCode4) * 31;
        Integer num2 = this.j;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("SupportedPaymentMethod(code=", this.a, ", syntheticCode=", this.b, ", displayName=");
        r.append(this.c);
        r.append(", iconResource=");
        r.append(this.d);
        r.append(", iconResourceNight=");
        r.append(this.e);
        r.append(", lightThemeIconUrl=");
        r.append(this.f);
        r.append(", darkThemeIconUrl=");
        ace.A(this.g, ", iconRequiresTinting=", ", subtitle=", r, this.h);
        r.append(this.i);
        r.append(", outlinedIconResource=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public edi(String str, String str2, int i, int i2, boolean z, il9 il9Var, int i3) {
        this(str, r5, xun.b(i), i2, (Integer) null, (String) null, (String) null, r11, r12, r13);
        Integer valueOf = Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_bank_outlined);
        String str3 = (i3 & 2) != 0 ? str : str2;
        boolean z2 = (i3 & 32) != 0 ? false : z;
        il9 il9Var2 = (i3 & 256) != 0 ? null : il9Var;
        Integer num = (i3 & Barcode.FORMAT_UPC_A) != 0 ? null : valueOf;
        str.getClass();
        str3.getClass();
    }

    public /* synthetic */ edi(String str, d3g d3gVar, int i, Integer num, String str2, String str3, boolean z, d3g d3gVar2, Integer num2, int i2) {
        this(str, str, d3gVar, i, num, str2, str3, z, (i2 & 256) != 0 ? null : d3gVar2, (i2 & Barcode.FORMAT_UPC_A) != 0 ? null : num2);
    }

    public edi(String str, String str2, d3g d3gVar, int i, Integer num, String str3, String str4, boolean z, d3g d3gVar2, Integer num2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d3gVar;
        this.d = i;
        this.e = num;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = d3gVar2;
        this.j = num2;
    }
}
