package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mk8 {
    public final LinkedHashMap a;
    public final mbe b;

    public mk8(LinkedHashMap linkedHashMap, mbe mbeVar) {
        mbeVar.getClass();
        this.a = linkedHashMap;
        this.b = mbeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mk8) {
                mk8 mk8Var = (mk8) obj;
                if (!Intrinsics.areEqual(this.a, mk8Var.a) || this.b != mk8Var.b) {
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
        return "FormFieldValues(fieldValuePairs=" + this.a + ", userRequestedReuse=" + this.b + ")";
    }
}
