package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wi8 {
    public final List a;
    public final ArrayList b;

    public wi8(ArrayList arrayList, List list) {
        list.getClass();
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wi8) {
                wi8 wi8Var = (wi8) obj;
                if (!Intrinsics.areEqual(this.a, wi8Var.a) || !Intrinsics.areEqual(this.b, wi8Var.b)) {
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
        return "FootballBoxScoreUi(columnTitles=" + this.a + ", rows=" + this.b + ")";
    }
}
