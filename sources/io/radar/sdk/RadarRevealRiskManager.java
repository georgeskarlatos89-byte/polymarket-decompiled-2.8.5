package io.radar.sdk;

import android.content.Context;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarSDKFraud;
import io.radar.sdk.model.RadarRevealRiskToken;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/radar/sdk/RadarRevealRiskManager;", "", "Landroid/content/Context;", "context", "Lio/radar/sdk/RadarLogger;", "logger", "<init>", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;)V", "Lkotlin/Function2;", "Lio/radar/sdk/Radar$RadarStatus;", "Lio/radar/sdk/model/RadarRevealRiskToken;", "", "callback", "revealRisk", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "Lio/radar/sdk/RadarLogger;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarRevealRiskManager {
    private final Context context;
    private final RadarLogger logger;

    public RadarRevealRiskManager(Context context, RadarLogger radarLogger) {
        context.getClass();
        radarLogger.getClass();
        this.context = context;
        this.logger = radarLogger;
    }

    public final void revealRisk(final Function2<? super Radar.RadarStatus, ? super RadarRevealRiskToken, Unit> callback) {
        callback.getClass();
        RadarSDKFraud.Companion.getFraudPayload$default(RadarSDKFraud.INSTANCE, this.context, this.logger, null, null, new Function2<Radar.RadarStatus, String, Unit>() { // from class: io.radar.sdk.RadarRevealRiskManager$revealRisk$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Radar.RadarStatus radarStatus, String str) {
                radarStatus.getClass();
                str.getClass();
                if (radarStatus != Radar.RadarStatus.SUCCESS) {
                    callback.invoke(radarStatus, null);
                } else {
                    RadarApiClient.revealRisk$sdk_release$default(Radar.INSTANCE.getApiClient$sdk_release(), str, null, callback, 2, null);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Radar.RadarStatus radarStatus, String str) {
                invoke2(radarStatus, str);
                return Unit.INSTANCE;
            }
        }, 12, null);
    }
}
