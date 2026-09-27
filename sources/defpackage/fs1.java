package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fs1 {
    public final il9 a;

    public fs1(il9 il9Var) {
        this.a = il9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fs1) && Intrinsics.areEqual(this.a, ((fs1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BuyButtonOverride(label=" + this.a + ", lockEnabled=false)";
    }
}
