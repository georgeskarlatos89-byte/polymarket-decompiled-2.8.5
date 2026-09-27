package defpackage;

import com.launchdarkly.sdk.LDContext;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class so7 {
    public final HashMap a = new HashMap();
    public final LDContext b;

    public so7(LDContext lDContext) {
        this.b = lDContext;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof so7) {
            so7 so7Var = (so7) obj;
            if (so7Var.a.equals(this.a) && Objects.equals(this.b, so7Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
