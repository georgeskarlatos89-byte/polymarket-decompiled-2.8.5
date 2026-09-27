package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bu4 implements eu4 {
    public final wn1 a;

    public bu4(wn1 wn1Var) {
        this.a = wn1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof bu4) || !Intrinsics.areEqual(this.a, ((bu4) obj).a)) {
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
        return "Error(error=" + this.a + ")";
    }
}
