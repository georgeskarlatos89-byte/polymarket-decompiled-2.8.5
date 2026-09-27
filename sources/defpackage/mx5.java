package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mx5 {
    public final Drawable a;
    public final boolean b;

    public mx5(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mx5) {
            mx5 mx5Var = (mx5) obj;
            if (Intrinsics.areEqual(this.a, mx5Var.a) && this.b == mx5Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
