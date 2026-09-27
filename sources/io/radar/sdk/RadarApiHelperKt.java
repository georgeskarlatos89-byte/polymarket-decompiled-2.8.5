package io.radar.sdk;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"networkErrorMessage", "", "host", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "elapsedMs", "", "kind", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarApiHelperKt {
    public static final String networkErrorMessage(String str, Exception exc, long j, String str2) {
        str.getClass();
        exc.getClass();
        str2.getClass();
        return "📍 Radar API network error | host = " + str + "; kind = " + str2 + "; exception = " + exc.getClass().getSimpleName() + "; message = " + exc.getLocalizedMessage() + "; elapsedMs = " + j;
    }
}
