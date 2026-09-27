package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kp1 {
    public final List a;
    public final zrf b;
    public final boolean c;

    public kp1(List list, zrf zrfVar, int i) {
        boolean z;
        list = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        zrfVar = (i & 2) != 0 ? null : zrfVar;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        list.getClass();
        this.a = list;
        this.b = zrfVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kp1) {
                kp1 kp1Var = (kp1) obj;
                if (!Intrinsics.areEqual(this.a, kp1Var.a) || !Intrinsics.areEqual(this.b, kp1Var.b) || this.c != kp1Var.c) {
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
        int hashCode2 = this.a.hashCode() * 31;
        zrf zrfVar = this.b;
        if (zrfVar == null) {
            hashCode = 0;
        } else {
            hashCode = zrfVar.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleLayout(avatarRects=");
        sb.append(this.a);
        sb.append(", highlightRect=");
        sb.append(this.b);
        sb.append(", isFullBleed=");
        return ix2.r(sb, this.c, ")");
    }
}
