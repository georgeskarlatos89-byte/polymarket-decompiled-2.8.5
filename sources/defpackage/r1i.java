package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r1i {
    public final LinkedHashMap a;

    public r1i(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r1i) || !Intrinsics.areEqual(this.a, ((r1i) obj).a)) {
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
        return "Plurals(items=" + this.a + ")";
    }
}
