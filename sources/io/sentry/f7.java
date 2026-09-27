package io.sentry;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum f7 implements j2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE),
    UNKNOWN(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE),
    UNKNOWN_ERROR(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE),
    INVALID_ARGUMENT(CarouselScreenFragment.CAROUSEL_ANIMATION_MS),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(CarouselScreenFragment.CAROUSEL_ANIMATION_MS),
    ABORTED(409),
    OUT_OF_RANGE(CarouselScreenFragment.CAROUSEL_ANIMATION_MS),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    f7(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static f7 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static f7 fromHttpStatusCode(int i) {
        for (f7 f7Var : values()) {
            if (f7Var.matches(i)) {
                return f7Var;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        if (i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode) {
            return true;
        }
        return false;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.j2
    public void serialize(l3 l3Var, x0 x0Var) {
        ((io.sentry.internal.debugmeta.c) l3Var).D(apiName());
    }

    f7(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }

    public static f7 fromHttpStatusCode(Integer num, f7 f7Var) {
        f7 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : f7Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : f7Var;
    }
}
