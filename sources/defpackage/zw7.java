package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zw7 implements ax7 {
    public final String a;
    public final e19 b;

    public zw7(String str, e19 e19Var) {
        e19Var.getClass();
        this.a = str;
        this.b = e19Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zw7) {
                zw7 zw7Var = (zw7) obj;
                if (!Intrinsics.areEqual(this.a, zw7Var.a) || !Intrinsics.areEqual(this.b, zw7Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
