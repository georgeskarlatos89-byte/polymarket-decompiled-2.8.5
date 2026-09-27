package defpackage;

import com.launchdarkly.sdk.LDContext;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ul9 {
    public final LDContext a;

    public ul9(LDContext lDContext) {
        this.a = lDContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ul9.class == obj.getClass() && Objects.equals(this.a, ((ul9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }
}
