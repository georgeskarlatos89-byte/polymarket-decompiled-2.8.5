package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fr0 {
    public final String a;
    public final zgj b;

    public fr0(String str, zgj zgjVar) {
        this.a = str;
        this.b = zgjVar;
        if (!StringsKt.T(str)) {
            return;
        }
        dmk.v("Name can't be blank");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fr0) {
                fr0 fr0Var = (fr0) obj;
                if (!Intrinsics.areEqual(this.a, fr0Var.a) || !Intrinsics.areEqual(this.b, fr0Var.b)) {
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
        return "AttributeKey: ".concat(this.a);
    }
}
