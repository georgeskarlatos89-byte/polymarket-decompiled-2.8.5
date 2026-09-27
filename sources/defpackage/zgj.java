package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zgj {
    public final KClass a;
    public final wka b;

    public zgj(KClass kClass, wka wkaVar) {
        kClass.getClass();
        this.a = kClass;
        this.b = wkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgj)) {
            return false;
        }
        wka wkaVar = this.b;
        if (wkaVar == null) {
            zgj zgjVar = (zgj) obj;
            if (zgjVar.b == null) {
                return Intrinsics.areEqual(this.a, zgjVar.a);
            }
        }
        return Intrinsics.areEqual(wkaVar, ((zgj) obj).b);
    }

    public final int hashCode() {
        wka wkaVar = this.b;
        if (wkaVar != null) {
            return wkaVar.hashCode();
        }
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
