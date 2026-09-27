package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a1f {
    public final boolean a;
    public final List b;

    static {
        new a1f(false);
    }

    public a1f(boolean z) {
        List emptyList = CollectionsKt.emptyList();
        emptyList.getClass();
        this.a = z;
        this.b = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a1f) {
                a1f a1fVar = (a1f) obj;
                if (this.a != a1fVar.a || !Intrinsics.areEqual(this.b, a1fVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb.append(this.a);
        sb.append(", poisoningFeatures=");
        return sv6.r(sb, this.b, ')');
    }
}
