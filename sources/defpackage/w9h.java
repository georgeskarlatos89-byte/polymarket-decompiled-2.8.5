package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w9h {
    public final pq4 a;

    public /* synthetic */ w9h(pq4 pq4Var) {
        this.a = pq4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w9h) {
            if (!Intrinsics.areEqual(this.a, ((w9h) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
