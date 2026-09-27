package com.polymarket.usviewmodels;

import com.polymarket.chartlogic.ChartTimeSeriesInterval;
import com.polymarket.data.ETimeSeriesInterval;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/ChartBridge;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartBridge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartBridge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartBridge[] $values() {
        return new ChartBridge[0];
    }

    static {
        ChartBridge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartBridge(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartBridge valueOf(String str) {
        return (ChartBridge) Enum.valueOf(ChartBridge.class, str);
    }

    public static ChartBridge[] values() {
        return (ChartBridge[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/ChartBridge$Companion;", "", "<init>", "()V", "chartTimeSeriesInterval", "Lcom/polymarket/chartlogic/ChartTimeSeriesInterval;", "interval", "Lcom/polymarket/data/ETimeSeriesInterval;", "Swift_Companion_chartTimeSeriesInterval_0", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartTimeSeriesInterval Swift_Companion_chartTimeSeriesInterval_0(ETimeSeriesInterval interval);

        public final ChartTimeSeriesInterval chartTimeSeriesInterval(ETimeSeriesInterval interval) {
            interval.getClass();
            return Swift_Companion_chartTimeSeriesInterval_0(interval);
        }

        private Companion() {
        }
    }
}
