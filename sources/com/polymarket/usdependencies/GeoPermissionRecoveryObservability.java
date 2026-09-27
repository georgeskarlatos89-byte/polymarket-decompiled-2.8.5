package com.polymarket.usdependencies;

import com.polymarket.clients.GeoGatedAction;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTripOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usdependencies/GeoPermissionRecoveryObservability;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoPermissionRecoveryObservability {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ GeoPermissionRecoveryObservability[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ GeoPermissionRecoveryObservability[] $values() {
        return new GeoPermissionRecoveryObservability[0];
    }

    static {
        GeoPermissionRecoveryObservability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private GeoPermissionRecoveryObservability(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static GeoPermissionRecoveryObservability valueOf(String str) {
        return (GeoPermissionRecoveryObservability) Enum.valueOf(GeoPermissionRecoveryObservability.class, str);
    }

    public static GeoPermissionRecoveryObservability[] values() {
        return (GeoPermissionRecoveryObservability[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082 J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082 J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 ¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usdependencies/GeoPermissionRecoveryObservability$Companion;", "", "<init>", "()V", "recordShown", "", "action", "Lcom/polymarket/clients/GeoGatedAction;", RadarTripOptions.KEY_MODE, "", "Swift_Companion_recordShown_0", "recordPromptCompleted", "granted", "", "Swift_Companion_recordPromptCompleted_1", "recordSettingsOpened", "Swift_Companion_recordSettingsOpened_2", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native void Swift_Companion_recordPromptCompleted_1(boolean granted);

        private final native void Swift_Companion_recordSettingsOpened_2(GeoGatedAction action);

        private final native void Swift_Companion_recordShown_0(GeoGatedAction action, String mode);

        public final void recordPromptCompleted(boolean granted) {
            Swift_Companion_recordPromptCompleted_1(granted);
        }

        public final void recordSettingsOpened(GeoGatedAction action) {
            action.getClass();
            Swift_Companion_recordSettingsOpened_2(action);
        }

        public final void recordShown(GeoGatedAction action, String mode) {
            action.getClass();
            mode.getClass();
            Swift_Companion_recordShown_0(action, mode);
        }

        private Companion() {
        }
    }
}
