package defpackage;

import com.polymarket.usviewmodels.SquadsPositionSlipPresentation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gze {
    public final kze a;
    public final String b;
    public final String c;
    public final SquadsPositionSlipPresentation.OwnerStrip d;
    public final String e;

    public gze(kze kzeVar, String str, String str2, SquadsPositionSlipPresentation.OwnerStrip ownerStrip, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        ownerStrip = (i & 8) != 0 ? null : ownerStrip;
        str3 = (i & 32) != 0 ? null : str3;
        str.getClass();
        this.a = kzeVar;
        this.b = str;
        this.c = str2;
        this.d = ownerStrip;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gze) {
                gze gzeVar = (gze) obj;
                if (!Intrinsics.areEqual(this.a, gzeVar.a) || !Intrinsics.areEqual(this.b, gzeVar.b) || !Intrinsics.areEqual(this.c, gzeVar.c) || !Intrinsics.areEqual(this.d, gzeVar.d) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.e, gzeVar.e)) {
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
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        SquadsPositionSlipPresentation.OwnerStrip ownerStrip = this.d;
        if (ownerStrip == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ownerStrip.hashCode();
        }
        int i3 = (i2 + hashCode2) * 961;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", othersText=null, wonCountText=");
        return woa.r(sb, this.e, ")");
    }
}
