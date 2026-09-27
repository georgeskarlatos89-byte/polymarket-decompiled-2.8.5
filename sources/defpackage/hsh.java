package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hsh implements jsh {
    public final boolean a;
    public final Function1 b;

    public hsh(boolean z, Function1 function1) {
        function1.getClass();
        this.a = z;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsh)) {
            return false;
        }
        hsh hshVar = (hsh) obj;
        if (this.a == hshVar.a && Intrinsics.areEqual(this.b, hshVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Toggle(isOn=" + this.a + ", onChange=" + this.b + ")";
    }
}
