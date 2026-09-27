package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mba {
    public static final mba d = new mba(n0g.STRICT, 6);
    public final n0g a;
    public final qta b;
    public final n0g c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mba(n0g n0gVar, int i) {
        this(n0gVar, r4, n0gVar);
        qta qtaVar;
        if ((i & 2) != 0) {
            qtaVar = new qta(1, 0, 0);
        } else {
            qtaVar = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mba)) {
            return false;
        }
        mba mbaVar = (mba) obj;
        if (this.a == mbaVar.a && Intrinsics.areEqual(this.b, mbaVar.b) && this.c == mbaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        qta qtaVar = this.b;
        if (qtaVar == null) {
            i = 0;
        } else {
            i = qtaVar.c;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public mba(n0g n0gVar, qta qtaVar, n0g n0gVar2) {
        n0gVar.getClass();
        n0gVar2.getClass();
        this.a = n0gVar;
        this.b = qtaVar;
        this.c = n0gVar2;
    }
}
