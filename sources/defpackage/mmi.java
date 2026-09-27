package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mmi {
    public final r43 a;
    public final String b;
    public final d3g c;
    public final lmi d;
    public final jmi e;
    public final d3g f;

    public mmi(r43 r43Var, String str, d3g d3gVar, lmi lmiVar, jmi jmiVar, d3g d3gVar2) {
        r43Var.getClass();
        this.a = r43Var;
        this.b = str;
        this.c = d3gVar;
        this.d = lmiVar;
        this.e = jmiVar;
        this.f = d3gVar2;
    }

    public static mmi a(mmi mmiVar, lmi lmiVar, jmi jmiVar, d3g d3gVar, int i) {
        r43 r43Var = mmiVar.a;
        String str = mmiVar.b;
        d3g d3gVar2 = mmiVar.c;
        if ((i & 16) != 0) {
            jmiVar = mmiVar.e;
        }
        jmi jmiVar2 = jmiVar;
        if ((i & 32) != 0) {
            d3gVar = mmiVar.f;
        }
        mmiVar.getClass();
        r43Var.getClass();
        return new mmi(r43Var, str, d3gVar2, lmiVar, jmiVar2, d3gVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mmi) {
                mmi mmiVar = (mmi) obj;
                if (this.a != mmiVar.a || !Intrinsics.areEqual(this.b, mmiVar.b) || !Intrinsics.areEqual(this.c, mmiVar.c) || !Intrinsics.areEqual(this.d, mmiVar.d) || !Intrinsics.areEqual(this.e, mmiVar.e) || !Intrinsics.areEqual(this.f, mmiVar.f)) {
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
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        d3g d3gVar = this.c;
        if (d3gVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d3gVar.hashCode();
        }
        int hashCode4 = (this.e.hashCode() + ((this.d.hashCode() + ((i2 + hashCode2) * 31)) * 31)) * 31;
        d3g d3gVar2 = this.f;
        if (d3gVar2 != null) {
            i = d3gVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "State(cardBrand=" + this.a + ", last4=" + this.b + ", title=" + this.c + ", primaryButton=" + this.d + ", form=" + this.e + ", error=" + this.f + ")";
    }
}
