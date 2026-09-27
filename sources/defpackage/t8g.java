package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t8g {
    public final l8g a;
    public final String b;
    public final m8g c;
    public final String d;
    public final String e;
    public final o8g f;
    public final pfh g;

    public t8g(l8g l8gVar) {
        l8gVar.getClass();
        this.a = l8gVar;
        this.b = l8gVar.a;
        m8g m8gVar = l8gVar.b;
        this.c = m8gVar;
        this.f = o8g.STANDALONE;
        this.g = pfh.RISK_SDK;
        int i = s8g.a[m8gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.d = "https://risk.checkout.com";
                    this.e = "https://fpjs.checkout.com";
                    return;
                } else {
                    dmk.a();
                    throw null;
                }
            }
            this.d = "https://risk.sandbox.checkout.com";
            this.e = "https://fpjs.sandbox.checkout.com";
            return;
        }
        this.d = "https://prism-qa.ckotech.co";
        this.e = "https://fpjs.cko-qa.ckotech.co";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t8g) && Intrinsics.areEqual(this.a, ((t8g) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RiskSDKInternalConfigImpl(config=" + this.a + ')';
    }
}
