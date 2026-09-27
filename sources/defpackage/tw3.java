package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tw3 extends dx3 {
    public final ew4 a;

    public tw3(ew4 ew4Var) {
        this.a = ew4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof tw3) || !Intrinsics.areEqual(this.a, ((tw3) obj).a)) {
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
        return "Connected(event=" + this.a + ")";
    }
}
