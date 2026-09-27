package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zl9 {
    public final Object a;

    public /* synthetic */ zl9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zl9) {
            if (!Intrinsics.areEqual(this.a, ((zl9) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Pending(value=" + this.a + ')';
    }
}
