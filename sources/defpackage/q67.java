package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q67 implements t67 {
    public final s43 a;

    public q67(s43 s43Var) {
        this.a = s43Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof q67) || !Intrinsics.areEqual(this.a, ((q67) obj).a)) {
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
        return "BrandChoiceChanged(cardBrandChoice=" + this.a + ")";
    }
}
