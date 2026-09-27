package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kxi {
    public static final kxi c = new kxi(2, false);
    public static final kxi d = new kxi(1, true);
    public final int a;
    public final boolean b;

    public kxi(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxi)) {
            return false;
        }
        kxi kxiVar = (kxi) obj;
        if (this.a == kxiVar.a && this.b == kxiVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (Intrinsics.areEqual(this, c)) {
            return "TextMotion.Static";
        }
        if (Intrinsics.areEqual(this, d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
