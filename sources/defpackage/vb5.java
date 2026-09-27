package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vb5 extends wb5 {
    public final String b;

    public vb5(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof vb5) || !Intrinsics.areEqual(this.b, ((vb5) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.wb5
    public final String toString() {
        return sv6.n("Unknown(unknownValue=", this.b, ")");
    }
}
