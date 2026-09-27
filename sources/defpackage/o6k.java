package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o6k implements cb0 {
    public final String a;

    public o6k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6k)) {
            return false;
        }
        if (Intrinsics.areEqual(this.a, ((o6k) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m51.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
