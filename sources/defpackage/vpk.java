package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vpk {
    public final wpk a;
    public final u81 b;

    public vpk(wpk wpkVar, u81 u81Var) {
        wpkVar.getClass();
        this.a = wpkVar;
        this.b = u81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpk)) {
            return false;
        }
        vpk vpkVar = (vpk) obj;
        if (this.a == vpkVar.a && Intrinsics.areEqual(this.b, vpkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        u81 u81Var = this.b;
        if (u81Var == null) {
            hashCode = 0;
        } else {
            hashCode = u81Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + this.a + ", event=" + this.b + ')';
    }
}
