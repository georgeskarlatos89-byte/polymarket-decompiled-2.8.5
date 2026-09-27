package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w1f {
    public final String a;

    public w1f(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1f) {
            return Intrinsics.areEqual(this.a, ((w1f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
