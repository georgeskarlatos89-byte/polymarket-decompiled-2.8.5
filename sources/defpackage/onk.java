package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class onk {
    public final Object a;
    public final boolean b;

    public onk(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public static onk a(onk onkVar, ycd ycdVar, boolean z, int i) {
        Object obj = ycdVar;
        if ((i & 1) != 0) {
            obj = onkVar.a;
        }
        if ((i & 2) != 0) {
            z = onkVar.b;
        }
        onkVar.getClass();
        return new onk(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onk)) {
            return false;
        }
        onk onkVar = (onk) obj;
        if (Intrinsics.areEqual(this.a, onkVar.a) && this.b == onkVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return hdi.t(sb, this.b, ')');
    }
}
