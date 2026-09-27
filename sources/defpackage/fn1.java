package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fn1 {
    public final gn1 a;
    public final zm1 b;

    public fn1(gn1 gn1Var, zm1 zm1Var) {
        this.a = gn1Var;
        this.b = zm1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fn1) {
                fn1 fn1Var = (fn1) obj;
                if (this.a != fn1Var.a || !Intrinsics.areEqual(this.b, fn1Var.b)) {
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
        return "BrazePushEvent(eventType=" + this.a + ", notificationPayload=" + this.b + ')';
    }
}
