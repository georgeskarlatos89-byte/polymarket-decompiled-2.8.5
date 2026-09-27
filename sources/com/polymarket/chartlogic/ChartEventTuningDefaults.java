package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartEventTuningDefaults;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartEventTuningDefaults {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartEventTuningDefaults[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final double lineWidth;
    private static final double minimumVisibleHorizontalRun;
    private static final double minimumVisibleVerticalMove;
    private static final int samplingBucketCount;

    private static final /* synthetic */ ChartEventTuningDefaults[] $values() {
        return new ChartEventTuningDefaults[0];
    }

    static {
        ChartEventTuningDefaults[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
        lineWidth = 2.0d;
        minimumVisibleHorizontalRun = 1.5d;
        minimumVisibleVerticalMove = 2.5d;
        samplingBucketCount = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
    }

    private ChartEventTuningDefaults(String str, int i) {
    }

    public static final /* synthetic */ double access$getLineWidth$cp() {
        return lineWidth;
    }

    public static final /* synthetic */ double access$getMinimumVisibleHorizontalRun$cp() {
        return minimumVisibleHorizontalRun;
    }

    public static final /* synthetic */ double access$getMinimumVisibleVerticalMove$cp() {
        return minimumVisibleVerticalMove;
    }

    public static final /* synthetic */ int access$getSamplingBucketCount$cp() {
        return samplingBucketCount;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartEventTuningDefaults valueOf(String str) {
        return (ChartEventTuningDefaults) Enum.valueOf(ChartEventTuningDefaults.class, str);
    }

    public static ChartEventTuningDefaults[] values() {
        return (ChartEventTuningDefaults[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0014\u001a\u00020\u0011H\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/polymarket/chartlogic/ChartEventTuningDefaults$Companion;", "", "<init>", "()V", "lineWidth", "", "getLineWidth", "()D", "minimumVisibleHorizontalRun", "getMinimumVisibleHorizontalRun", "minimumVisibleVerticalMove", "getMinimumVisibleVerticalMove", "samplingBucketCount", "", "getSamplingBucketCount", "()I", "pathStyle", "Lcom/polymarket/chartlogic/ChartPathStyle;", "getPathStyle", "()Lcom/polymarket/chartlogic/ChartPathStyle;", "Swift_Companion_pathStyle", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartPathStyle Swift_Companion_pathStyle();

        public final double getLineWidth() {
            return ChartEventTuningDefaults.access$getLineWidth$cp();
        }

        public final double getMinimumVisibleHorizontalRun() {
            return ChartEventTuningDefaults.access$getMinimumVisibleHorizontalRun$cp();
        }

        public final double getMinimumVisibleVerticalMove() {
            return ChartEventTuningDefaults.access$getMinimumVisibleVerticalMove$cp();
        }

        public final ChartPathStyle getPathStyle() {
            return Swift_Companion_pathStyle();
        }

        public final int getSamplingBucketCount() {
            return ChartEventTuningDefaults.access$getSamplingBucketCount$cp();
        }

        private Companion() {
        }
    }
}
