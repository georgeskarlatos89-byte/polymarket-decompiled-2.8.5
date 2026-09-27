package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ar6 extends gr6 {
    public final lr6 a;

    public ar6(lr6 lr6Var) {
        this.a = lr6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ar6) || !Intrinsics.areEqual(this.a, ((ar6) obj).a)) {
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
        return "AppendEvent(event=" + this.a + ')';
    }
}
