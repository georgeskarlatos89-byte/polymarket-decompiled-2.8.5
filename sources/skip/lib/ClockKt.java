package skip.lib;

import defpackage.d47;
import defpackage.h47;
import defpackage.m47;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lskip/lib/Duration;", "Ld47;", "toKotlinDuration", "(Lskip/lib/Duration;)J", "toSkipDuration-LRDsOJo", "(J)Lskip/lib/Duration;", "toSkipDuration", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClockKt {
    public static final long toKotlinDuration(Duration duration) {
        duration.getClass();
        return h47.h(duration.toNanoseconds(), m47.NANOSECONDS);
    }

    /* renamed from: toSkipDuration-LRDsOJo, reason: not valid java name */
    public static final Duration m1272toSkipDurationLRDsOJo(long j) {
        return Duration.INSTANCE.nanoseconds(d47.f(j));
    }
}
