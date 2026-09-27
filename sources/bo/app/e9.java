package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e9 {
    public final f9 a;

    public e9(f9 f9Var) {
        this.a = f9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e9) && Intrinsics.areEqual(this.a, ((e9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.a + ')';
    }
}
