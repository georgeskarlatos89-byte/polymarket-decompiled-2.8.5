package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mfh implements AutoCloseable {
    public final kq1 a;

    public /* synthetic */ mfh(kq1 kq1Var) {
        this.a = kq1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mfh) {
            if (!Intrinsics.areEqual(this.a, ((mfh) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ")";
    }
}
