package io.sentry.android.core;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b2 {
    public final Integer a;
    public final Boolean b;

    public b2(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (!io.sentry.util.b.j(this.a, b2Var.a) || !io.sentry.util.b.j(this.b, b2Var.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
