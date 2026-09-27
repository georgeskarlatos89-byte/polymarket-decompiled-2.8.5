package bo.app;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x1 implements ga {
    public final LinkedHashSet a;
    public final boolean b;

    public x1(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
        this.b = linkedHashSet.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x1) && Intrinsics.areEqual(this.a, ((x1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // bo.app.ga
    public final boolean isEmpty() {
        return this.b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.a + ')';
    }
}
