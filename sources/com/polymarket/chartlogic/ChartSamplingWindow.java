package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartSamplingWindow;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartSamplingWindow {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartSamplingWindow[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartSamplingWindow[] $values() {
        return new ChartSamplingWindow[0];
    }

    static {
        ChartSamplingWindow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartSamplingWindow(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartSamplingWindow valueOf(String str) {
        return (ChartSamplingWindow) Enum.valueOf(ChartSamplingWindow.class, str);
    }

    public static ChartSamplingWindow[] values() {
        return (ChartSamplingWindow[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0082 J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0082 ¨\u0006\u0011"}, d2 = {"Lcom/polymarket/chartlogic/ChartSamplingWindow$Companion;", "", "<init>", "()V", "window", "", "for_", "Lcom/polymarket/chartlogic/ChartTimeSeriesInterval;", "timestamps", "", "Swift_Companion_window_0", "interval", "rounded", "duration", "Swift_Companion_rounded_1", "windowDuration", "Swift_Companion_windowDuration_2", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native double Swift_Companion_rounded_1(double duration);

        private final native double Swift_Companion_windowDuration_2(ChartTimeSeriesInterval interval);

        private final native double Swift_Companion_window_0(ChartTimeSeriesInterval interval, List<Double> timestamps);

        public final double rounded(double duration) {
            return Swift_Companion_rounded_1(duration);
        }

        public final double window(ChartTimeSeriesInterval for_, List<Double> timestamps) {
            for_.getClass();
            timestamps.getClass();
            return Swift_Companion_window_0(for_, timestamps);
        }

        public final double windowDuration(ChartTimeSeriesInterval for_) {
            for_.getClass();
            return Swift_Companion_windowDuration_2(for_);
        }

        private Companion() {
        }
    }
}
