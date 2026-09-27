package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fx9 {
    public final mzj a;
    public final String b;
    public final fhb c;
    public final List d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final LinkBrand h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final k6h l;
    public final boolean m;

    public fx9(mzj mzjVar, String str, fhb fhbVar, List list, Set set, boolean z, boolean z2, LinkBrand linkBrand, boolean z3, boolean z4, boolean z5, k6h k6hVar, boolean z6) {
        str.getClass();
        list.getClass();
        set.getClass();
        linkBrand.getClass();
        k6hVar.getClass();
        this.a = mzjVar;
        this.b = str;
        this.c = fhbVar;
        this.d = list;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = linkBrand;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = k6hVar;
        this.m = z6;
    }

    public static fx9 a(fx9 fx9Var, mzj mzjVar, boolean z, boolean z2, k6h k6hVar, int i) {
        mzj mzjVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        k6h k6hVar2;
        if ((i & 1) != 0) {
            mzjVar2 = fx9Var.a;
        } else {
            mzjVar2 = mzjVar;
        }
        String str = fx9Var.b;
        fhb fhbVar = fx9Var.c;
        List list = fx9Var.d;
        Set set = fx9Var.e;
        boolean z6 = fx9Var.f;
        boolean z7 = fx9Var.g;
        LinkBrand linkBrand = fx9Var.h;
        boolean z8 = true;
        if ((i & 256) != 0) {
            z3 = fx9Var.i;
        } else {
            z3 = true;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            z4 = fx9Var.j;
        } else {
            z4 = z;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            z5 = fx9Var.k;
        } else {
            z5 = z2;
        }
        if ((i & 2048) != 0) {
            k6hVar2 = fx9Var.l;
        } else {
            k6hVar2 = k6hVar;
        }
        if ((i & 4096) != 0) {
            z8 = fx9Var.m;
        }
        fx9Var.getClass();
        str.getClass();
        list.getClass();
        set.getClass();
        linkBrand.getClass();
        k6hVar2.getClass();
        return new fx9(mzjVar2, str, fhbVar, list, set, z6, z7, linkBrand, z3, z4, z5, k6hVar2, z8);
    }

    public final boolean b() {
        int i;
        if (this.k) {
            return false;
        }
        fhb fhbVar = this.c;
        if (fhbVar == null) {
            i = -1;
        } else {
            i = ex9.a[fhbVar.ordinal()];
        }
        if (i != -1) {
            mzj mzjVar = this.a;
            if (i != 1) {
                if (i == 2) {
                    boolean z = this.g;
                    boolean z2 = this.j;
                    if (z) {
                        if (mzjVar == null || !z2) {
                            return false;
                        }
                        return true;
                    }
                    if (this.f) {
                        if (mzjVar == null) {
                            return false;
                        }
                        return true;
                    }
                    return z2;
                }
                dmk.a();
                return false;
            }
            if (mzjVar != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx9)) {
            return false;
        }
        fx9 fx9Var = (fx9) obj;
        if (Intrinsics.areEqual(this.a, fx9Var.a) && Intrinsics.areEqual(this.b, fx9Var.b) && this.c == fx9Var.c && Intrinsics.areEqual(this.d, fx9Var.d) && Intrinsics.areEqual(this.e, fx9Var.e) && this.f == fx9Var.f && this.g == fx9Var.g && this.h == fx9Var.h && this.i == fx9Var.i && this.j == fx9Var.j && this.k == fx9Var.k && this.l == fx9Var.l && this.m == fx9Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        mzj mzjVar = this.a;
        if (mzjVar == null) {
            hashCode = 0;
        } else {
            hashCode = mzjVar.hashCode();
        }
        int e = hdi.e(hashCode * 31, 31, this.b);
        fhb fhbVar = this.c;
        if (fhbVar != null) {
            i = fhbVar.hashCode();
        }
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + hdi.g(hdi.g(hdi.g((this.h.hashCode() + hdi.g(hdi.g(sv6.d(this.e, hdi.f((e + i) * 31, 31, this.d), 31), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineSignupViewState(userInput=");
        sb.append(this.a);
        sb.append(", merchantName=");
        sb.append(this.b);
        sb.append(", signupMode=");
        sb.append(this.c);
        sb.append(", fields=");
        sb.append(this.d);
        sb.append(", prefillEligibleFields=");
        sb.append(this.e);
        sb.append(", allowsDefaultOptIn=");
        sb.append(this.f);
        sb.append(", linkSignUpOptInFeatureEnabled=");
        sb.append(this.g);
        sb.append(", linkBrand=");
        sb.append(this.h);
        sb.append(", didAskToChangeSignupDetails=");
        hdi.B(sb, this.i, ", isExpanded=", this.j, ", apiFailed=");
        sb.append(this.k);
        sb.append(", signUpState=");
        sb.append(this.l);
        sb.append(", userHasInteracted=");
        return ix2.r(sb, this.m, ")");
    }
}
