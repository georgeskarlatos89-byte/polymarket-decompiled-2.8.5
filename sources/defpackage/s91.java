package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s91 implements u1g {
    public final jca a;

    public /* synthetic */ s91(jca jcaVar) {
        this.a = jcaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s91) {
            if (!Intrinsics.areEqual(this.a, ((s91) obj).a)) {
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
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
