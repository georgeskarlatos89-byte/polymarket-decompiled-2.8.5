package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s7k implements t7k {
    public final mk8 a;

    public s7k(mk8 mk8Var) {
        this.a = mk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s7k) && Intrinsics.areEqual(this.a, ((s7k) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        mk8 mk8Var = this.a;
        if (mk8Var == null) {
            return 0;
        }
        return mk8Var.hashCode();
    }

    public final String toString() {
        return "FormFieldValuesChanged(formValues=" + this.a + ")";
    }
}
