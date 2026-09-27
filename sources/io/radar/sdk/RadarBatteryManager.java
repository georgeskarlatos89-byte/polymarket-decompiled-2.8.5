package io.radar.sdk;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import io.radar.sdk.util.BatteryState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/radar/sdk/RadarBatteryManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "powerManager", "Landroid/os/PowerManager;", "usageStatsManager", "Landroid/app/usage/UsageStatsManager;", "getAppStandbyBucket", "", "()Ljava/lang/Integer;", "getBatteryState", "Lio/radar/sdk/util/BatteryState;", "getLocationPowerSaveMode", "isDeviceIdleMode", "", "isIgnoringBatteryOptimizations", "isPowerSaveMode", "()Ljava/lang/Boolean;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarBatteryManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int locationUnaffected = 0;
    private final Context context;
    private final PowerManager powerManager;
    private final UsageStatsManager usageStatsManager;

    public RadarBatteryManager(Context context) {
        context.getClass();
        this.context = context;
        this.powerManager = (PowerManager) context.getSystemService("power");
        this.usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
    }

    public static final /* synthetic */ int access$getLocationUnaffected$cp() {
        return locationUnaffected;
    }

    private final int getLocationPowerSaveMode() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return powerManager.getLocationPowerSaveMode();
        }
        return locationUnaffected;
    }

    private final boolean isDeviceIdleMode() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return powerManager.isDeviceIdleMode();
        }
        return false;
    }

    private final boolean isIgnoringBatteryOptimizations() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(this.context.getPackageName());
        }
        return false;
    }

    private final Boolean isPowerSaveMode() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public final Integer getAppStandbyBucket() {
        UsageStatsManager usageStatsManager = this.usageStatsManager;
        if (usageStatsManager != null) {
            return Integer.valueOf(usageStatsManager.getAppStandbyBucket());
        }
        return null;
    }

    public final BatteryState getBatteryState() {
        int i;
        boolean z;
        float f;
        Float f2 = null;
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        } else {
            i = -1;
        }
        if (i != 2 && i != 5) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (registerReceiver != null) {
            f2 = Float.valueOf((registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1));
        }
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        return new BatteryState(z2, f, isPowerSaveMode(), isIgnoringBatteryOptimizations(), getLocationPowerSaveMode(), isDeviceIdleMode());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/RadarBatteryManager$Companion;", "", "()V", "locationUnaffected", "", "getLocationUnaffected", "()I", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLocationUnaffected() {
            return RadarBatteryManager.access$getLocationUnaffected$cp();
        }

        private Companion() {
        }
    }
}
