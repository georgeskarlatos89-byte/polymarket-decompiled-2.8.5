package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ltd extends ntd {
    public final Throwable a;

    public ltd(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ltd) && Intrinsics.areEqual(this.a, ((ltd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c.d("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
