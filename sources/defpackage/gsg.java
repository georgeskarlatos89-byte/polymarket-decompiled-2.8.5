package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gsg implements wsg {
    public final Bitmap a;

    public gsg(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gsg) && Intrinsics.areEqual(this.a, ((gsg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "MaskCaptured(mask=" + this.a + ")";
    }
}
