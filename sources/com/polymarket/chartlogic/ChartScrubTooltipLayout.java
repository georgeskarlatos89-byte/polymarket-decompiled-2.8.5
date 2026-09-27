package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartScrubTooltipLayout;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartScrubTooltipLayout {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartScrubTooltipLayout[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartScrubTooltipLayout[] $values() {
        return new ChartScrubTooltipLayout[0];
    }

    static {
        ChartScrubTooltipLayout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartScrubTooltipLayout(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartScrubTooltipLayout valueOf(String str) {
        return (ChartScrubTooltipLayout) Enum.valueOf(ChartScrubTooltipLayout.class, str);
    }

    public static ChartScrubTooltipLayout[] values() {
        return (ChartScrubTooltipLayout[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0082 ¨\u0006\r"}, d2 = {"Lcom/polymarket/chartlogic/ChartScrubTooltipLayout$Companion;", "", "<init>", "()V", "resolvedCenters", "", "", "centers", "pillHeight", "minimumGap", "minY", "maxY", "Swift_Companion_resolvedCenters_0", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<Double> Swift_Companion_resolvedCenters_0(List<Double> centers, double pillHeight, double minimumGap, double minY, double maxY);

        public final List<Double> resolvedCenters(List<Double> centers, double pillHeight, double minimumGap, double minY, double maxY) {
            centers.getClass();
            return Swift_Companion_resolvedCenters_0(centers, pillHeight, minimumGap, minY, maxY);
        }

        private Companion() {
        }
    }
}
