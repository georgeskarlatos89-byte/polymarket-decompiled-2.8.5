package io.sentry.protocol;

import defpackage.dmk;
import io.sentry.j2;
import io.sentry.l3;
import io.sentry.x0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w implements j2 {
    public static final w b = new w("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public volatile String a;

    public w(String str) {
        String str2;
        if (str.equals("0000-0000")) {
            str2 = "00000000-0000-0000-0000-000000000000";
        } else {
            str2 = str;
        }
        if (str2.length() != 32 && str2.length() != 36) {
            dmk.v("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
        this.a = str2.length() == 36 ? str2.replace("-", "") : str2;
    }

    public final String a() {
        String str;
        String str2 = this.a;
        if (str2 == null) {
            synchronized (this) {
                try {
                    str = this.a;
                    if (str == null) {
                        str = io.sentry.config.a.i0();
                        this.a = str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            return a().equals(((w) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        ((io.sentry.internal.debugmeta.c) l3Var).D(a());
    }

    public final String toString() {
        return a();
    }
}
