package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hj8 {
    public final String a;
    public final ArrayList b;

    public hj8(ArrayList arrayList, String str) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hj8) {
                hj8 hj8Var = (hj8) obj;
                if (!Intrinsics.areEqual(this.a, hj8Var.a) || !Intrinsics.areEqual(this.b, hj8Var.b)) {
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
        return "FootballLineupSectionUi(title=" + this.a + ", rows=" + this.b + ")";
    }
}
