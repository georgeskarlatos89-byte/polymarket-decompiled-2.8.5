package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class aze implements cze {
    public final dze a;
    public final List b;
    public final String c;
    public final List d;

    public aze(dze dzeVar, List list, String str, List list2, int i) {
        str = (i & 4) != 0 ? null : str;
        list2 = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        dzeVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = dzeVar;
        this.b = list;
        this.c = str;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aze) {
                aze azeVar = (aze) obj;
                if (this.a != azeVar.a || !Intrinsics.areEqual(this.b, azeVar.b) || !Intrinsics.areEqual(this.c, azeVar.c) || !Intrinsics.areEqual(this.d, azeVar.d)) {
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
        int f = hdi.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((f + hashCode) * 31);
    }

    public final String toString() {
        return "Combo(layout=" + this.a + ", legs=" + this.b + ", viewMoreText=" + this.c + ", expandedGroups=" + this.d + ")";
    }
}
