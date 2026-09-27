package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b8g {
    public final long a = ib4.m;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b8g) {
                long j = ((b8g) obj).a;
                int i = ib4.n;
                if (!hkj.a(this.a, j) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) ib4.h(this.a)) + ", rippleAlpha=null)";
    }
}
