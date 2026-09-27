package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartOutgoingPointRetainer;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartOutgoingPointRetainer {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartOutgoingPointRetainer[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartOutgoingPointRetainer[] $values() {
        return new ChartOutgoingPointRetainer[0];
    }

    static {
        ChartOutgoingPointRetainer[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartOutgoingPointRetainer(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartOutgoingPointRetainer valueOf(String str) {
        return (ChartOutgoingPointRetainer) Enum.valueOf(ChartOutgoingPointRetainer.class, str);
    }

    public static ChartOutgoingPointRetainer[] values() {
        return (ChartOutgoingPointRetainer[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ[\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¨\u0006\u0013"}, d2 = {"Lcom/polymarket/chartlogic/ChartOutgoingPointRetainer$Companion;", "", "<init>", "()V", "retainedPointsBySeriesID", "", "", "", "Lcom/polymarket/chartlogic/ChartTimeSeriesPoint;", "series", "Lcom/polymarket/chartlogic/ChartSeriesInput;", "sampling", "Lcom/polymarket/chartlogic/ChartSampling;", "chartWidth", "", "minimumVisibleHorizontalRun", "Swift_Companion_retainedPointsBySeriesID_0", "outgoingPointRetentionDuration", "Swift_Companion_outgoingPointRetentionDuration_1", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native double Swift_Companion_outgoingPointRetentionDuration_1(ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun);

        private final native Map<String, List<ChartTimeSeriesPoint>> Swift_Companion_retainedPointsBySeriesID_0(List<ChartSeriesInput> series, Map<String, ? extends List<ChartTimeSeriesPoint>> retainedPointsBySeriesID, ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun);

        public final double outgoingPointRetentionDuration(ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun) {
            sampling.getClass();
            return Swift_Companion_outgoingPointRetentionDuration_1(sampling, chartWidth, minimumVisibleHorizontalRun);
        }

        public final Map<String, List<ChartTimeSeriesPoint>> retainedPointsBySeriesID(List<ChartSeriesInput> series, Map<String, ? extends List<ChartTimeSeriesPoint>> retainedPointsBySeriesID, ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun) {
            series.getClass();
            retainedPointsBySeriesID.getClass();
            sampling.getClass();
            return Swift_Companion_retainedPointsBySeriesID_0(series, retainedPointsBySeriesID, sampling, chartWidth, minimumVisibleHorizontalRun);
        }

        private Companion() {
        }
    }
}
