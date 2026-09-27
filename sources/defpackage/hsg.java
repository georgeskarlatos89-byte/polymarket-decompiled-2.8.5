package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hsg implements wsg {
    public final Bitmap a;

    public hsg(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof hsg) || !Intrinsics.areEqual(this.a, ((hsg) obj).a)) {
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
        return "RawFrameCaptured(image=" + this.a + ")";
    }
}
