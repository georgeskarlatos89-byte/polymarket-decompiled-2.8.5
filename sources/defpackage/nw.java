package defpackage;

import android.content.Context;
import com.polymarket.usdependencies.GeoComplianceGate;
import io.radar.sdk.RadarVerifiedReceiver;
import io.radar.sdk.model.RadarVerifiedLocationToken;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nw extends RadarVerifiedReceiver {
    @Override // io.radar.sdk.RadarVerifiedReceiver
    public final void onIpChanged(Context context) {
        context.getClass();
        GeoComplianceGate.INSTANCE.handleLocationChanged();
    }

    @Override // io.radar.sdk.RadarVerifiedReceiver
    public final void onTokenUpdated(Context context, RadarVerifiedLocationToken radarVerifiedLocationToken) {
        context.getClass();
        radarVerifiedLocationToken.getClass();
    }
}
