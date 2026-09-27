package defpackage;

import com.polymarket.usviewmodels.SquadsPositionDetailsPresentation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eze {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final SquadsPositionDetailsPresentation.Emphasis e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public eze(String str, String str2, String str3, String str4, SquadsPositionDetailsPresentation.Emphasis emphasis, String str5, boolean z, String str6, int i) {
        str5 = (i & 32) != 0 ? null : str5;
        z = (i & 64) != 0 ? false : z;
        str6 = (i & 128) != 0 ? null : str6;
        boolean z2 = (i & 256) == 0;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        emphasis.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = emphasis;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eze)) {
            return false;
        }
        eze ezeVar = (eze) obj;
        if (Intrinsics.areEqual(this.a, ezeVar.a) && Intrinsics.areEqual(this.b, ezeVar.b) && Intrinsics.areEqual(this.c, ezeVar.c) && Intrinsics.areEqual(this.d, ezeVar.d) && this.e == ezeVar.e && Intrinsics.areEqual(this.f, ezeVar.f) && this.g == ezeVar.g && Intrinsics.areEqual(this.h, ezeVar.h) && this.i == ezeVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() + hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = hdi.g((hashCode2 + hashCode) * 31, 31, this.g);
        String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.i) + ((g + i) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("Details(costTitle=", this.a, ", costText=", this.b, ", valueTitle=");
        k84.q(r, this.c, ", valueText=", this.d, ", emphasis=");
        r.append(this.e);
        r.append(", deltaText=");
        r.append(this.f);
        r.append(", isDeltaGain=");
        m51.y(", multiplierText=", this.h, ", hasEqualColumns=", r, this.g);
        return ix2.r(r, this.i, ")");
    }
}
