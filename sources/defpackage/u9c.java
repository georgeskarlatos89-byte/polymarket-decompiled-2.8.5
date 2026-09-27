package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u9c {
    public final Bitmap a;
    public final Map b;

    public u9c(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u9c) {
                u9c u9cVar = (u9c) obj;
                if (Intrinsics.areEqual(this.a, u9cVar.a) && Intrinsics.areEqual(this.b, u9cVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.a);
        sb.append(", extras=");
        return hdi.s(sb, this.b, ')');
    }
}
