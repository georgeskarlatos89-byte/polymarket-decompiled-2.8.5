package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m1i implements cb0 {
    public final String a;

    public /* synthetic */ m1i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1i) {
            if (!Intrinsics.areEqual(this.a, ((m1i) obj).a)) {
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
        return hdi.o("StringAnnotation(value=", this.a, ')');
    }
}
