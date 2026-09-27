package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ebg {
    public float a = 0.0f;
    public boolean b = true;
    public ktn c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebg)) {
            return false;
        }
        ebg ebgVar = (ebg) obj;
        if (Float.compare(this.a, ebgVar.a) == 0 && this.b == ebgVar.b && Intrinsics.areEqual(this.c, ebgVar.c) && Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = hdi.g(Float.hashCode(this.a) * 31, 31, this.b);
        ktn ktnVar = this.c;
        if (ktnVar == null) {
            hashCode = 0;
        } else {
            hashCode = ktnVar.hashCode();
        }
        return (g + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
