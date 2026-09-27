package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ps6 {
    public final List a;
    public final float b;

    public ps6(List list, float f) {
        list.getClass();
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps6)) {
            return false;
        }
        ps6 ps6Var = (ps6) obj;
        if (Intrinsics.areEqual(this.a, ps6Var.a) && Float.compare(this.b, ps6Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffAndBlocks(newBlocks=" + this.a + ", changeRatio=" + this.b + ")";
    }

    public /* synthetic */ ps6(ArrayList arrayList) {
        this(arrayList, 1.0f);
    }
}
