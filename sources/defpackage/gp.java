package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gp {
    public final LinkedHashMap a;

    public gp(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gp) {
                gp gpVar = (gp) obj;
                if (!Intrinsics.areEqual("$exposure", "$exposure") || !Intrinsics.areEqual(this.a, gpVar.a) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() + 1938820149) * 31;
    }

    public final String toString() {
        return "AnalyticsEvent(eventType=$exposure, eventProperties=" + this.a + ", userProperties=null)";
    }
}
