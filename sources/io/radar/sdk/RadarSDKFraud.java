package io.radar.sdk;

import android.content.Context;
import android.location.Location;
import defpackage.d1c;
import io.radar.sdk.Radar;
import io.radar.sdk.fraud.RadarSDKFraud;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lio/radar/sdk/RadarSDKFraud;", "", "()V", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarSDKFraud {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/RadarSDKFraud$Companion;", "", "()V", "getFraudPayload", "", "context", "Landroid/content/Context;", "logger", "Lio/radar/sdk/RadarLogger;", "location", "Landroid/location/Location;", "googlePlayProjectNumber", "", "callback", "Lkotlin/Function2;", "Lio/radar/sdk/Radar$RadarStatus;", "", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;Landroid/location/Location;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getFraudPayload$default(Companion companion, Context context, RadarLogger radarLogger, Location location, Long l, Function2 function2, int i, Object obj) {
            if ((i & 4) != 0) {
                location = null;
            }
            if ((i & 8) != 0) {
                l = null;
            }
            companion.getFraudPayload(context, radarLogger, location, l, function2);
        }

        public final void getFraudPayload(Context context, final RadarLogger logger, Location location, Long googlePlayProjectNumber, final Function2<? super Radar.RadarStatus, ? super String, Unit> callback) {
            context.getClass();
            logger.getClass();
            callback.getClass();
            try {
                RadarSDKFraud.Companion companion = io.radar.sdk.fraud.RadarSDKFraud.INSTANCE;
                Object invoke = io.radar.sdk.fraud.RadarSDKFraud.class.getMethod("sharedInstance", null).invoke(null, null);
                Function1<Map<String, ? extends Object>, Unit> function1 = new Function1<Map<String, ? extends Object>, Unit>() { // from class: io.radar.sdk.RadarSDKFraud$Companion$getFraudPayload$getFraudPayloadCallback$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(Map<String, ? extends Object> result) {
                        Object obj;
                        String str;
                        Object obj2;
                        String str2 = null;
                        if (result != null) {
                            obj = result.get("payload");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        if ((result != null && result.containsKey("error")) || str == null) {
                            if (result != null) {
                                obj2 = result.get("error");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str2 = (String) obj2;
                            }
                            if (str2 == null) {
                                str2 = "Unknown error";
                            }
                            RadarLogger.e$default(RadarLogger.this, "Error getting fraud payload: ".concat(str2), Radar.RadarLogType.SDK_ERROR, null, 4, null);
                            callback.invoke(Radar.RadarStatus.ERROR_PLUGIN, "");
                            return;
                        }
                        callback.invoke(Radar.RadarStatus.SUCCESS, str);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }
                };
                LinkedHashMap h = d1c.h(new Pair("context", context), new Pair("location", location));
                if (googlePlayProjectNumber != null) {
                    h.put("googlePlayProjectNumber", googlePlayProjectNumber);
                }
                io.radar.sdk.fraud.RadarSDKFraud.class.getMethod("getFraudPayload", Map.class, Function1.class).invoke(invoke, h, function1);
            } catch (ClassNotFoundException unused) {
                RadarLogger.d$default(logger, "Skipping fraud checks: RadarSDKFraud submodule not available", null, null, 6, null);
                callback.invoke(Radar.RadarStatus.ERROR_PLUGIN, "");
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                logger.e("Error calling fraud detection ".concat(message), Radar.RadarLogType.SDK_EXCEPTION, e);
                callback.invoke(Radar.RadarStatus.ERROR_PLUGIN, "");
            }
        }

        private Companion() {
        }
    }
}
