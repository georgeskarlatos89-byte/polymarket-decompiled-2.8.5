package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wwg {
    public final IntRange a;
    public final aga b;

    public wwg(IntRange intRange, aga agaVar) {
        agaVar.getClass();
        this.a = intRange;
        this.b = agaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wwg) {
                wwg wwgVar = (wwg) obj;
                if (!Intrinsics.areEqual(this.a, wwgVar.a) || !Intrinsics.areEqual(this.b, wwgVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(range=" + this.a + ", type=" + this.b + ')';
    }
}
