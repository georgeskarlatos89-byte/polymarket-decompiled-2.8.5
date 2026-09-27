package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ysc {
    public final int a;
    public wzc b = null;
    public Bundle c = null;

    public ysc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysc)) {
            return false;
        }
        ysc yscVar = (ysc) obj;
        if (this.a != yscVar.a || !Intrinsics.areEqual(this.b, yscVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = yscVar.c;
        if (Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        if (bundle != null && bundle2 != null && lyn.a(bundle, bundle2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        wzc wzcVar = this.b;
        if (wzcVar != null) {
            i = wzcVar.hashCode();
        } else {
            i = 0;
        }
        int i2 = hashCode + i;
        Bundle bundle = this.c;
        if (bundle != null) {
            return lyn.b(bundle) + (i2 * 31);
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ysc.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
