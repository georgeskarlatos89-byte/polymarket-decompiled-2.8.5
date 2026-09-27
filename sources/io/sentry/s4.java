package io.sentry;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum s4 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE,
    ARRAY;

    public static s4 inferFrom(Object obj) {
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Byte) && !(obj instanceof BigInteger) && !(obj instanceof AtomicInteger) && !(obj instanceof AtomicLong)) {
            if (obj instanceof Number) {
                return DOUBLE;
            }
            if (!(obj instanceof Collection) && (obj == null || !obj.getClass().isArray())) {
                return STRING;
            }
            return ARRAY;
        }
        return INTEGER;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
