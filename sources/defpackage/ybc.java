package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ybc {
    public final Set a;
    public final zbc b;

    public ybc() {
        fd7 fd7Var = fd7.a;
        zbc zbcVar = zbc.DROP_OLDEST;
        fd7Var.getClass();
        zbcVar.getClass();
        this.a = fd7Var;
        this.b = zbcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ybc) {
                ybc ybcVar = (ybc) obj;
                if (!Intrinsics.areEqual(this.a, ybcVar.a) || this.b != ybcVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + woa.b(bd0.API_PRIORITY_OTHER, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MessageBufferConfig(channelTypes=" + this.a + ", capacity=2147483647, overflow=" + this.b + ")";
    }
}
