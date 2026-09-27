package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jj8 {
    public final String a;
    public final List b;
    public final ArrayList c;

    public jj8(String str, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jj8) {
                jj8 jj8Var = (jj8) obj;
                if (!Intrinsics.areEqual(this.a, jj8Var.a) || !Intrinsics.areEqual(this.b, jj8Var.b) || !Intrinsics.areEqual(this.c, jj8Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FootballPlayerSectionUi(title=" + this.a + ", columnTitles=" + this.b + ", rows=" + this.c + ")";
    }
}
