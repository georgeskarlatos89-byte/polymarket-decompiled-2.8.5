package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h0 {
    public final String a;
    public final Pattern b;

    public h0(String str) {
        Pattern pattern;
        this.a = str;
        try {
            pattern = Pattern.compile(str);
        } catch (Throwable unused) {
            p4.c().getOptions().getLogger().f(p5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            pattern = null;
        }
        this.b = pattern;
    }

    public final boolean equals(Object obj) {
        if (obj != null && h0.class == obj.getClass()) {
            return Objects.equals(this.a, ((h0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
