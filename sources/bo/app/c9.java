package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c9 {
    public final JSONArray a;

    public c9(JSONArray jSONArray) {
        jSONArray.getClass();
        this.a = jSONArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c9) && Intrinsics.areEqual(this.a, ((c9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.a + ')';
    }
}
