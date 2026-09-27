package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hwh implements lwh {
    public final Throwable a;
    public final ttf b;

    public hwh(Throwable th, ttf ttfVar) {
        ttfVar.getClass();
        this.a = th;
        this.b = ttfVar;
    }

    @Override // defpackage.lwh
    public final ttf a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hwh) {
                hwh hwhVar = (hwh) obj;
                if (!Intrinsics.areEqual(this.a, hwhVar.a) || !Intrinsics.areEqual(this.b, hwhVar.b)) {
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
        return "Error(result=" + this.a + ", referenceLinkHandler=" + this.b + ")";
    }
}
