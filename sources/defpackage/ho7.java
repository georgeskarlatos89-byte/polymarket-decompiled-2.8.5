package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ho7 extends jo7 {
    public final u81 a;

    public ho7(u81 u81Var) {
        this.a = u81Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ho7) || !Intrinsics.areEqual(this.a, ((ho7) obj).a)) {
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
        return "Event(event=" + this.a + ')';
    }
}
