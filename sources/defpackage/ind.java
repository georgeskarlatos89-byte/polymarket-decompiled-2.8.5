package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ind extends knd {
    public final zrf a;

    public ind(zrf zrfVar) {
        this.a = zrfVar;
    }

    @Override // defpackage.knd
    public final zrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ind) {
                if (!Intrinsics.areEqual(this.a, ((ind) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
