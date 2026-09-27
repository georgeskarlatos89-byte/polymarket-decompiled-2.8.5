package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ou4 implements pu4 {
    public final c8i a;
    public final toc b;

    public ou4(c8i c8iVar, toc tocVar, int i) {
        tocVar = (i & 2) != 0 ? new toc() : tocVar;
        c8iVar.getClass();
        this.a = c8iVar;
        this.b = tocVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ou4) {
            ou4 ou4Var = (ou4) obj;
            if (Intrinsics.areEqual(this.a, ou4Var.a) && Intrinsics.areEqual(this.b, ou4Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Succeeded(intent=" + this.a + ", metadata=" + this.b + ", completedFullPaymentFlow=true)";
    }
}
