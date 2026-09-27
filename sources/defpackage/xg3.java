package defpackage;

import io.radar.sdk.util.RadarSimpleLogBuffer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xg3 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xg3) && Intrinsics.areEqual("messaging", "messaging")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE) - 1690588804;
    }

    public final String toString() {
        return "ChannelMessageLimit(channelType=messaging, baseLimit=500)";
    }
}
