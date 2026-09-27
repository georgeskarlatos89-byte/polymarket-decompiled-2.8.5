package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xu8 extends arl {
    public final Uri b;

    public xu8(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xu8) && Intrinsics.areEqual(this.b, ((xu8) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AppLink(appLinkReturnUri=" + this.b + ")";
    }
}
