package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nja extends pja {
    public final ita a;

    public nja(ita itaVar) {
        this.a = itaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nja) || !Intrinsics.areEqual(this.a, ((nja) obj).a)) {
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
        return "LocalClass(type=" + this.a + ')';
    }
}
