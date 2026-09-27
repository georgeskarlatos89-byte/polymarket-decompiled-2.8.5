package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ph7 extends sh7 {
    public final String a;
    public int b;

    public ph7(String str) {
        this.a = str;
    }

    @Override // defpackage.sh7
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ph7.class == obj.getClass()) {
            ph7 ph7Var = (ph7) obj;
            if (Intrinsics.areEqual(this.a, ph7Var.a) && this.b == ph7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "GenericError(message=" + this.a + ", code=" + this.b + ")";
    }
}
