package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i9c implements j9c {
    public final Map a;

    public i9c(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof i9c) || !Intrinsics.areEqual(this.a, ((i9c) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Holding(payload=" + this.a + ")";
    }
}
