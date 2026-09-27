package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h4a {
    public final enf a;
    public final iw5 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, enf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [iw5, java.lang.Object] */
    public h4a() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h4a) {
                h4a h4aVar = (h4a) obj;
                if (!Intrinsics.areEqual(this.a, h4aVar.a) || !Intrinsics.areEqual(this.b, h4aVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "InteractionsOptions(rageClick=" + this.a + ", deadClick=" + this.b + ')';
    }
}
