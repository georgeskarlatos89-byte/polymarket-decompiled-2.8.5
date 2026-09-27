package defpackage;

import com.polymarket.usviewmodels.SquadsPositionCardState;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hze {
    public final cze a;
    public final SquadsPositionCardState b;
    public final eze c;
    public final gze d;
    public final fze e;
    public final String f;
    public final zye g;

    public hze(cze czeVar, SquadsPositionCardState squadsPositionCardState, eze ezeVar, gze gzeVar, fze fzeVar, String str, zye zyeVar, int i) {
        gzeVar = (i & 8) != 0 ? null : gzeVar;
        fzeVar = (i & 16) != 0 ? null : fzeVar;
        str = (i & 32) != 0 ? null : str;
        zyeVar = (i & 64) != 0 ? null : zyeVar;
        squadsPositionCardState.getClass();
        this.a = czeVar;
        this.b = squadsPositionCardState;
        this.c = ezeVar;
        this.d = gzeVar;
        this.e = fzeVar;
        this.f = str;
        this.g = zyeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hze) {
                hze hzeVar = (hze) obj;
                if (!Intrinsics.areEqual(this.a, hzeVar.a) || this.b != hzeVar.b || !Intrinsics.areEqual(this.c, hzeVar.c) || !Intrinsics.areEqual(this.d, hzeVar.d) || !Intrinsics.areEqual(this.e, hzeVar.e) || !Intrinsics.areEqual(this.f, hzeVar.f) || !Intrinsics.areEqual(this.g, hzeVar.g)) {
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
        int hashCode4 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        gze gzeVar = this.d;
        if (gzeVar == null) {
            hashCode = 0;
        } else {
            hashCode = gzeVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        fze fzeVar = this.e;
        if (fzeVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fzeVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        zye zyeVar = this.g;
        if (zyeVar != null) {
            i = zyeVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "PositionShareCardContent(body=" + this.a + ", state=" + this.b + ", details=" + this.c + ", header=" + this.d + ", eventRow=" + this.e + ", ctaTitle=" + this.f + ", actions=" + this.g + ")";
    }
}
