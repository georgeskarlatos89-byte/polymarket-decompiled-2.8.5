package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ldc {
    public final Set a;
    public final ybc b;

    public ldc(int i, Set set) {
        set = (i & 1) != 0 ? fd7.a : set;
        ybc ybcVar = new ybc();
        set.getClass();
        this.a = set;
        this.b = ybcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ldc) {
                ldc ldcVar = (ldc) obj;
                if (!Intrinsics.areEqual(this.a, ldcVar.a) || !Intrinsics.areEqual(this.b, ldcVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageLimitConfig(channelMessageLimits=" + this.a + ", messageBufferConfig=" + this.b + ")";
    }
}
