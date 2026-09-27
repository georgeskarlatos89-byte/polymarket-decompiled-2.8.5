package defpackage;

import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n85 extends a {
    public static final m85 b = new m85(null);
    public final String a;

    public n85(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof n85) || !Intrinsics.areEqual(this.a, ((n85) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m51.m(new StringBuilder("CoroutineName("), this.a, ')');
    }
}
