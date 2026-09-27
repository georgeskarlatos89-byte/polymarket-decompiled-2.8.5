package io.radar.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Log;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.hdi;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.android.core.m0;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/radar/sdk/RadarLogger;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", d.d, "", "message", "", "type", "Lio/radar/sdk/Radar$RadarLogType;", "throwable", "", "e", "getBatteryLevel", "", "i", "logBackgrounding", "logPastTermination", "logResigningActive", "w", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarLogger {
    private static final String TAG = "RadarLogger";
    private final Context context;

    public RadarLogger(Context context) {
        context.getClass();
        this.context = context;
    }

    public static /* synthetic */ void d$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.d(str, radarLogType, th);
    }

    public static /* synthetic */ void e$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.e(str, radarLogType, th);
    }

    public static /* synthetic */ void i$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.i(str, radarLogType, th);
    }

    public static /* synthetic */ void w$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.w(str, radarLogType, th);
    }

    public final void d(String message, Radar.RadarLogType type, Throwable throwable) {
        message.getClass();
        Radar.RadarLogLevel logLevel$sdk_release = RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context);
        Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.DEBUG;
        if (logLevel$sdk_release.compareTo(radarLogLevel) >= 0) {
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, radarLogLevel, message, type, null, 8, null);
        }
    }

    public final void e(String message, Radar.RadarLogType type, Throwable throwable) {
        message.getClass();
        Radar.RadarLogLevel logLevel$sdk_release = RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context);
        Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.ERROR;
        if (logLevel$sdk_release.compareTo(radarLogLevel) >= 0) {
            m0.e(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, radarLogLevel, message, type, null, 8, null);
        }
    }

    public final float getBatteryLevel() {
        int i;
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i2 = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("level", -1);
        } else {
            i = -1;
        }
        if (registerReceiver != null) {
            i2 = registerReceiver.getIntExtra("scale", -1);
        }
        return i / i2;
    }

    public final void i(String message, Radar.RadarLogType type, Throwable throwable) {
        message.getClass();
        Radar.RadarLogLevel logLevel$sdk_release = RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context);
        Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.INFO;
        if (logLevel$sdk_release.compareTo(radarLogLevel) >= 0) {
            Log.i(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, radarLogLevel, message, type, null, 8, null);
        }
    }

    public final void logBackgrounding() {
        float batteryLevel = getBatteryLevel();
        d$default(this, "App entering background | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (batteryLevel * 100.0f) + "% battery", null, null, 6, null);
    }

    public final void logPastTermination() {
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context) == Radar.RadarLogLevel.DEBUG) {
            Object systemService = this.context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
            systemService.getClass();
            ActivityManager activityManager = (ActivityManager) systemService;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    if (runningAppProcessInfo.importance == 100 && Intrinsics.areEqual(runningAppProcessInfo.processName, this.context.getPackageName())) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                        SharedPreferences sharedPreferences = this.context.getSharedPreferences("RadarSDK", 0);
                        long j = sharedPreferences.getLong("last_timestamp", 0L);
                        long currentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.putLong("last_timestamp", currentTimeMillis);
                        edit.apply();
                        float batteryLevel = getBatteryLevel();
                        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 10);
                        historicalProcessExitReasons.getClass();
                        if (!historicalProcessExitReasons.isEmpty()) {
                            for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                                if (applicationExitInfo.getTimestamp() > j) {
                                    Radar radar = Radar.INSTANCE;
                                    Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.DEBUG;
                                    StringBuilder sb = new StringBuilder("App terminating | with reason: ");
                                    sb.append(applicationExitInfo.getDescription());
                                    sb.append(" | at ");
                                    sb.append(simpleDateFormat.format(new Date(applicationExitInfo.getTimestamp())));
                                    sb.append(" | with ");
                                    radar.sendLog$sdk_release(radarLogLevel, hdi.r(sb, batteryLevel * 100.0f, "% battery"), null, new Date(applicationExitInfo.getTimestamp()));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void logResigningActive() {
        float batteryLevel = getBatteryLevel();
        d$default(this, "App resigning active | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (batteryLevel * 100.0f) + "% battery", null, null, 6, null);
    }

    public final void w(String message, Radar.RadarLogType type, Throwable throwable) {
        message.getClass();
        Radar.RadarLogLevel logLevel$sdk_release = RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context);
        Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.WARNING;
        if (logLevel$sdk_release.compareTo(radarLogLevel) >= 0) {
            m0.q(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, radarLogLevel, message, type, null, 8, null);
        }
    }
}
