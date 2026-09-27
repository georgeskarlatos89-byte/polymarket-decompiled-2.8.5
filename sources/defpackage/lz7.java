package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lz7 implements nz7 {
    public final int a;
    public final List b;

    public lz7(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.nz7
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nz7
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lz7) {
                lz7 lz7Var = (lz7) obj;
                if (this.a != lz7Var.a || !Intrinsics.areEqual(this.b, lz7Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Error(message=" + this.a + ", formatArgs=" + this.b + ")";
    }
}
