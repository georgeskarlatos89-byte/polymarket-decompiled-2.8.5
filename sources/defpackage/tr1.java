package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tr1 {
    public final j5a a;
    public final i5a b;

    public tr1(j5a j5aVar, i5a i5aVar) {
        this.a = j5aVar;
        this.b = i5aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tr1) {
                tr1 tr1Var = (tr1) obj;
                if (!Intrinsics.areEqual(this.a, tr1Var.a) || !Intrinsics.areEqual(this.b, tr1Var.b)) {
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
        return "ButtonItem(style=" + this.a + ", state=" + this.b + ")";
    }
}
