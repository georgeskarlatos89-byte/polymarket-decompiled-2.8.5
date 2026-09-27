package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pz4 {
    public final Uri a;
    public final boolean b;

    public pz4(boolean z, Uri uri) {
        uri.getClass();
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(pz4.class, cls)) {
            return false;
        }
        obj.getClass();
        pz4 pz4Var = (pz4) obj;
        if (Intrinsics.areEqual(this.a, pz4Var.a) && this.b == pz4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
