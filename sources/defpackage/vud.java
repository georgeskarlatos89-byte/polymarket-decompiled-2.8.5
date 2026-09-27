package defpackage;

import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vud {
    public final RoundedCornersAnimatedTransformation a;
    public final String b;

    public vud(RoundedCornersAnimatedTransformation roundedCornersAnimatedTransformation, String str) {
        this.a = roundedCornersAnimatedTransformation;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vud) {
                vud vudVar = (vud) obj;
                if (Intrinsics.areEqual(this.a, vudVar.a) && Intrinsics.areEqual(this.b, vudVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(value=");
        sb.append(this.a);
        sb.append(", memoryCacheKey=");
        return m51.m(sb, this.b, ')');
    }
}
