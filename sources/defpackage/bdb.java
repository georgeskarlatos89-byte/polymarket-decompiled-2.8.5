package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bdb implements Parcelable {
    public static final Parcelable.Creator<bdb> CREATOR = new v5a(22);
    public final qbb A;
    public final boolean B;
    public final boolean C;
    public final String D;
    public final p8e E;
    public final boolean F;
    public final List G;
    public final y54 H;
    public final LinkBrand I;
    public final c8i a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final adb f;
    public final vd g;
    public final boolean h;
    public final Map i;
    public final zcb j;
    public final b53 k;
    public final q63 l;
    public final p28 m;
    public final uce n;
    public final qce o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final qfb t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public bdb(c8i c8iVar, String str, String str2, String str3, String str4, adb adbVar, vd vdVar, boolean z, Map map, zcb zcbVar, b53 b53Var, q63 q63Var, p28 p28Var, uce uceVar, qce qceVar, boolean z2, boolean z3, boolean z4, String str5, qfb qfbVar, boolean z5, String str6, boolean z6, boolean z7, boolean z8, boolean z9, qbb qbbVar, boolean z10, boolean z11, String str7, p8e p8eVar, boolean z12, List list, y54 y54Var, LinkBrand linkBrand) {
        c8iVar.getClass();
        str.getClass();
        adbVar.getClass();
        b53Var.getClass();
        q63Var.getClass();
        uceVar.getClass();
        str5.getClass();
        p8eVar.getClass();
        list.getClass();
        y54Var.getClass();
        linkBrand.getClass();
        this.a = c8iVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = adbVar;
        this.g = vdVar;
        this.h = z;
        this.i = map;
        this.j = zcbVar;
        this.k = b53Var;
        this.l = q63Var;
        this.m = p28Var;
        this.n = uceVar;
        this.o = qceVar;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = str5;
        this.t = qfbVar;
        this.u = z5;
        this.v = str6;
        this.w = z6;
        this.x = z7;
        this.y = z8;
        this.z = z9;
        this.A = qbbVar;
        this.B = z10;
        this.C = z11;
        this.D = str7;
        this.E = p8eVar;
        this.F = z12;
        this.G = list;
        this.H = y54Var;
        this.I = linkBrand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        if (this.z) {
            return this.D;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bdb) {
                bdb bdbVar = (bdb) obj;
                if (!Intrinsics.areEqual(this.a, bdbVar.a) || !Intrinsics.areEqual(this.b, bdbVar.b) || !Intrinsics.areEqual(this.c, bdbVar.c) || !Intrinsics.areEqual(this.d, bdbVar.d) || !Intrinsics.areEqual(this.e, bdbVar.e) || !Intrinsics.areEqual(this.f, bdbVar.f) || !Intrinsics.areEqual(this.g, bdbVar.g) || this.h != bdbVar.h || !Intrinsics.areEqual(this.i, bdbVar.i) || !Intrinsics.areEqual(this.j, bdbVar.j) || !Intrinsics.areEqual(this.k, bdbVar.k) || !Intrinsics.areEqual(this.l, bdbVar.l) || this.m != bdbVar.m || !Intrinsics.areEqual(this.n, bdbVar.n) || !Intrinsics.areEqual(this.o, bdbVar.o) || this.p != bdbVar.p || this.q != bdbVar.q || this.r != bdbVar.r || !Intrinsics.areEqual(this.s, bdbVar.s) || this.t != bdbVar.t || this.u != bdbVar.u || !Intrinsics.areEqual(this.v, bdbVar.v) || this.w != bdbVar.w || this.x != bdbVar.x || this.y != bdbVar.y || this.z != bdbVar.z || !Intrinsics.areEqual(this.A, bdbVar.A) || this.B != bdbVar.B || this.C != bdbVar.C || !Intrinsics.areEqual(this.D, bdbVar.D) || !Intrinsics.areEqual(this.E, bdbVar.E) || this.F != bdbVar.F || !Intrinsics.areEqual(this.G, bdbVar.G) || !Intrinsics.areEqual(this.H, bdbVar.H) || this.I != bdbVar.I) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
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
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode11 = (this.f.hashCode() + ((i3 + hashCode3) * 31)) * 31;
        vd vdVar = this.g;
        if (vdVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = vdVar.hashCode();
        }
        int c = sv6.c(this.i, hdi.g((hashCode11 + hashCode4) * 31, 31, this.h), 31);
        zcb zcbVar = this.j;
        if (zcbVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = zcbVar.hashCode();
        }
        int hashCode12 = (this.l.hashCode() + ((this.k.hashCode() + ((c + hashCode5) * 31)) * 31)) * 31;
        p28 p28Var = this.m;
        if (p28Var == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = p28Var.hashCode();
        }
        int hashCode13 = (this.n.hashCode() + ((hashCode12 + hashCode6) * 31)) * 31;
        qce qceVar = this.o;
        if (qceVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = qceVar.hashCode();
        }
        int e2 = hdi.e(hdi.g(hdi.g(hdi.g((hashCode13 + hashCode7) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s);
        qfb qfbVar = this.t;
        if (qfbVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = qfbVar.hashCode();
        }
        int g = hdi.g((e2 + hashCode8) * 31, 31, this.u);
        String str4 = this.v;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int g2 = hdi.g(hdi.g(hdi.g(hdi.g((g + hashCode9) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z);
        qbb qbbVar = this.A;
        if (qbbVar == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = qbbVar.hashCode();
        }
        int g3 = hdi.g(hdi.g((g2 + hashCode10) * 31, 31, this.B), 31, this.C);
        String str5 = this.D;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return this.I.hashCode() + ((this.H.hashCode() + hdi.f(hdi.g((this.E.hashCode() + ((g3 + i) * 31)) * 31, 31, this.F), 31, this.G)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkConfiguration(stripeIntent=");
        sb.append(this.a);
        sb.append(", merchantName=");
        sb.append(this.b);
        sb.append(", sellerBusinessName=");
        k84.q(sb, this.c, ", merchantCountryCode=", this.d, ", merchantLogoUrl=");
        sb.append(this.e);
        sb.append(", customerInfo=");
        sb.append(this.f);
        sb.append(", shippingDetails=");
        sb.append(this.g);
        sb.append(", passthroughModeEnabled=");
        sb.append(this.h);
        sb.append(", flags=");
        sb.append(this.i);
        sb.append(", cardBrandChoice=");
        sb.append(this.j);
        sb.append(", cardBrandFilter=");
        sb.append(this.k);
        sb.append(", cardFundingFilter=");
        sb.append(this.l);
        sb.append(", financialConnectionsAvailability=");
        sb.append(this.m);
        sb.append(", billingDetailsCollectionConfiguration=");
        sb.append(this.n);
        sb.append(", defaultBillingDetails=");
        sb.append(this.o);
        sb.append(", useAttestationEndpointsForLink=");
        sb.append(this.p);
        sb.append(", suppress2faModal=");
        hdi.B(sb, this.q, ", disableRuxInFlowController=", this.r, ", elementsSessionId=");
        sb.append(this.s);
        sb.append(", linkMode=");
        sb.append(this.t);
        sb.append(", allowDefaultOptIn=");
        m51.y(", googlePlacesApiKey=", this.v, ", collectMissingBillingDetailsForExistingPaymentMethods=", sb, this.u);
        hdi.B(sb, this.w, ", allowUserEmailEdits=", this.x, ", allowLogOut=");
        hdi.B(sb, this.y, ", enableDisplayableDefaultValuesInEce=", this.z, ", linkAppearance=");
        sb.append(this.A);
        sb.append(", linkSignUpOptInFeatureEnabled=");
        sb.append(this.B);
        sb.append(", linkSignUpOptInInitialValue=");
        m51.y(", customerId=", this.D, ", saveConsentBehavior=", sb, this.C);
        sb.append(this.E);
        sb.append(", forceSetupFutureUseBehaviorAndNewMandate=");
        sb.append(this.F);
        sb.append(", linkSupportedPaymentMethodsOnboardingEnabled=");
        sb.append(this.G);
        sb.append(", clientAttributionMetadata=");
        sb.append(this.H);
        sb.append(", linkBrand=");
        sb.append(this.I);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
        vd vdVar = this.g;
        if (vdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vdVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        Map map = this.i;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        zcb zcbVar = this.j;
        if (zcbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zcbVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        p28 p28Var = this.m;
        if (p28Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(p28Var.name());
        }
        this.n.writeToParcel(parcel, i);
        qce qceVar = this.o;
        if (qceVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qceVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeString(this.s);
        qfb qfbVar = this.t;
        if (qfbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(qfbVar.name());
        }
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeString(this.v);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        qbb qbbVar = this.A;
        if (qbbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qbbVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeString(this.D);
        parcel.writeParcelable(this.E, i);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeStringList(this.G);
        parcel.writeParcelable(this.H, i);
        parcel.writeString(this.I.name());
    }
}
