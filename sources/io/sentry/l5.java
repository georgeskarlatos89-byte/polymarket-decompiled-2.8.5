package io.sentry;

import java.time.Instant;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l5 extends y4 {
    public final Instant a = Instant.now();

    @Override // io.sentry.y4
    public final long d() {
        return (this.a.getEpochSecond() * Duration.ATTOSECONDS_PER_NANOSECOND) + r4.getNano();
    }
}
