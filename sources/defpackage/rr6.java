package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rr6 extends sr6 {
    public final nr6 a;

    public rr6(nr6 nr6Var) {
        this.a = nr6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof rr6) || !Intrinsics.areEqual(this.a, ((rr6) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SaveSnapshot(snapshot=" + this.a + ')';
    }
}
