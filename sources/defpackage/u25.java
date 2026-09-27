package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u25 {
    public final dqd a;

    public /* synthetic */ u25(dqd dqdVar, int i) {
        this((i & 8) != 0 ? null : dqdVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u25) {
                u25 u25Var = (u25) obj;
                if (!Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.a, u25Var.a)) {
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
        int hashCode2 = Long.hashCode(0L) * 29791;
        dqd dqdVar = this.a;
        if (dqdVar == null) {
            hashCode = 0;
        } else {
            hashCode = dqdVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContainerStyle(color=0, width=null, height=null, padding=" + this.a + ")";
    }

    public u25(dqd dqdVar) {
        this.a = dqdVar;
    }
}
