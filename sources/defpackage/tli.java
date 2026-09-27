package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tli {
    public final List a;

    public tli(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tli) && Intrinsics.areEqual(this.a, ((tli) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hdi.q("Form(elements=", ", enabled=true)", this.a);
    }
}
