package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rh {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final Map c;
    public final boolean d;

    public rh(ArrayList arrayList, LinkedHashMap linkedHashMap, Map map, boolean z) {
        map.getClass();
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = map;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rh) {
                rh rhVar = (rh) obj;
                if (!Intrinsics.areEqual(this.a, rhVar.a) || !Intrinsics.areEqual(this.b, rhVar.b) || !Intrinsics.areEqual(this.c, rhVar.c) || this.d != rhVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + sv6.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "AdvancedRebuildResult(series=" + this.a + ", transitionsByID=" + this.b + ", retainedPointsBySeriesID=" + this.c + ", shouldAnimateTransition=" + this.d + ")";
    }
}
