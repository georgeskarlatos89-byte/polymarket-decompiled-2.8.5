package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jmi {
    public final List a;
    public final boolean b;

    public jmi(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmi)) {
            return false;
        }
        jmi jmiVar = (jmi) obj;
        if (Intrinsics.areEqual(this.a, jmiVar.a) && this.b == jmiVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Form(elements=" + this.a + ", enabled=" + this.b + ")";
    }
}
