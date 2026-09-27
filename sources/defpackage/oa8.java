package defpackage;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class oa8 extends ra8 {
    public final URI a;

    public oa8(URI uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof oa8) || !Intrinsics.areEqual(this.a, ((oa8) obj).a)) {
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
        return "Hls(url=" + this.a + ")";
    }
}
