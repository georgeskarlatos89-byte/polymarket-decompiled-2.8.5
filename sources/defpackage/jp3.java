package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jp3 {
    public final ip3 a;

    public jp3(ip3 ip3Var) {
        ip3Var.getClass();
        this.a = ip3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jp3) && this.a == ((jp3) obj).a && Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ChatLoggerConfigImpl(level=" + this.a + ", handler=null)";
    }
}
