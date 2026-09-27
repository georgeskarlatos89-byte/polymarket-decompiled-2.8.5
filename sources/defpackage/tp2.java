package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tp2 {
    public final int a;
    public final Integer b;
    public final boolean c;

    public tp2(int i, Integer num, boolean z) {
        this.a = i;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp2)) {
            return false;
        }
        tp2 tp2Var = (tp2) obj;
        if (this.a == tp2Var.a && Intrinsics.areEqual(this.b, tp2Var.b) && this.c == tp2Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetEntry(score=");
        sb.append(this.a);
        sb.append(", tiebreak=");
        sb.append(this.b);
        sb.append(", isHighlighted=");
        return ix2.r(sb, this.c, ")");
    }
}
