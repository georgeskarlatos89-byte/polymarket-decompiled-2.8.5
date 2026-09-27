package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lic {
    public final eng a = eng.Inherit;

    public lic() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lic) {
            if (this.a == ((lic) obj).a && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + hdi.g(this.a.hashCode() * 31, 29791, true);
    }

    public lic(int i) {
    }
}
