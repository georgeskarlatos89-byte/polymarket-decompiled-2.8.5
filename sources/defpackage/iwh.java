package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class iwh implements lwh {
    public final ttf a;

    public iwh(ttf ttfVar) {
        ttfVar.getClass();
        this.a = ttfVar;
    }

    @Override // defpackage.lwh
    public final ttf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iwh) && Intrinsics.areEqual(this.a, ((iwh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(referenceLinkHandler=" + this.a + ")";
    }
}
