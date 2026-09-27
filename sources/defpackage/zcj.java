package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zcj extends adj {
    public final String b;

    public zcj(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zcj) || !Intrinsics.areEqual(this.b, ((zcj) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.adj
    public final String toString() {
        return sv6.n("Unknown(unknownValue=", this.b, ")");
    }
}
