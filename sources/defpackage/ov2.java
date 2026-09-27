package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ov2 {
    public final xl8 a;
    public final csc b;

    static {
        csc cscVar = xgh.f;
        xl8 xl8Var = xl8.c;
        xpl.b(cscVar);
    }

    public ov2(xl8 xl8Var, csc cscVar) {
        xl8Var.getClass();
        this.a = xl8Var;
        this.b = cscVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ov2) {
                ov2 ov2Var = (ov2) obj;
                if (Intrinsics.areEqual(this.a, ov2Var.a) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.b, ov2Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return e.r(this.a.a.a, '.', '/') + AgentHeaderCreator.AGENT_DIVIDER + this.b;
    }
}
