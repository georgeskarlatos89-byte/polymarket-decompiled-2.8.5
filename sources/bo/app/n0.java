package bo.app;

import android.graphics.Bitmap;
import defpackage.hdi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n0 {
    public final Bitmap a;
    public final Map b;

    public n0() {
        this.a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (Intrinsics.areEqual(this.a, n0Var.a) && Intrinsics.areEqual(this.b, n0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Bitmap bitmap = this.a;
        int i = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i2 = hashCode * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapAndHeaders(bitmap=");
        sb.append(this.a);
        sb.append(", headers=");
        return hdi.s(sb, this.b, ')');
    }

    public n0(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }
}
