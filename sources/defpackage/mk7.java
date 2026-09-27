package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mk7 implements xog {
    public final ik7 a;
    public final LinkedHashMap b;

    public mk7(ik7 ik7Var, LinkedHashMap linkedHashMap) {
        this.a = ik7Var;
        this.b = linkedHashMap;
    }

    @Override // defpackage.xog
    public final Object a(String str) {
        if (Intrinsics.areEqual(str, "context")) {
            return this.a;
        }
        if (Intrinsics.areEqual(str, Keys.KEY_SOCURE_RESULT)) {
            return this.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mk7) {
                mk7 mk7Var = (mk7) obj;
                if (!Intrinsics.areEqual(this.a, mk7Var.a) || !Intrinsics.areEqual(this.b, mk7Var.b)) {
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
        return "EvaluationTarget(context=" + this.a + ", result=" + this.b + ')';
    }
}
