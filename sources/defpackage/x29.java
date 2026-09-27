package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x29 implements Serializable {
    public final Function0 a = gzl.a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof x29) || !Intrinsics.areEqual(this.a, ((x29) obj).a)) {
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
        return "HCaptchaInternalConfig(htmlProvider=" + this.a + ")";
    }
}
