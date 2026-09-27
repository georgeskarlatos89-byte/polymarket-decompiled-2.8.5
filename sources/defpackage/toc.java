package defpackage;

import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class toc {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if ((obj instanceof toc) && Intrinsics.areEqual(((toc) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
