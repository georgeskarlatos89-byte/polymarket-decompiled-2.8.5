package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cra {
    public final KClass a;

    public cra(KClass kClass) {
        kClass.getClass();
        this.a = kClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cra) {
            if (Intrinsics.areEqual(this.a, ((cra) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vzm.m(this.a).getName();
    }
}
