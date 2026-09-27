package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iqf implements o9h {
    @Override // defpackage.o9h
    public final Object d(Continuation continuation) {
        return c9h.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iqf) {
                c9h c9hVar = c9h.c;
                if (!Intrinsics.areEqual(c9hVar, c9hVar)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return c9h.c.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + c9h.c + ")";
    }
}
