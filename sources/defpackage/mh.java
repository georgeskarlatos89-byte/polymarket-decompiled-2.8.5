package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mh {
    public final List a;
    public final Map b;

    public mh(List list, Map map) {
        list.getClass();
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mh) {
                mh mhVar = (mh) obj;
                if (!Intrinsics.areEqual(this.a, mhVar.a) || !Intrinsics.areEqual(this.b, mhVar.b)) {
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
        return "AdvancedChartFrameState(series=" + this.a + ", transitionsByID=" + this.b + ")";
    }
}
