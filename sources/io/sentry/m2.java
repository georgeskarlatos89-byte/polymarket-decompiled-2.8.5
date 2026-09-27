package io.sentry;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum m2 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
