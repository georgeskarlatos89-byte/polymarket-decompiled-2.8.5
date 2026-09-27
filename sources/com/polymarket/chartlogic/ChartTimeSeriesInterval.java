package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001e"}, d2 = {"Lcom/polymarket/chartlogic/ChartTimeSeriesInterval;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "fiveMinute", "tenMinute", "fifteenMinute", "halfHour", "hour", "game", "sixHour", "day", "week", "month", "max", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartTimeSeriesInterval implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartTimeSeriesInterval[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ChartTimeSeriesInterval fiveMinute = new ChartTimeSeriesInterval("fiveMinute", 0, "5m", null, 2, null);
    public static final ChartTimeSeriesInterval tenMinute = new ChartTimeSeriesInterval("tenMinute", 1, "10m", null, 2, null);
    public static final ChartTimeSeriesInterval fifteenMinute = new ChartTimeSeriesInterval("fifteenMinute", 2, "15m", null, 2, null);
    public static final ChartTimeSeriesInterval halfHour = new ChartTimeSeriesInterval("halfHour", 3, "30m", null, 2, null);
    public static final ChartTimeSeriesInterval hour = new ChartTimeSeriesInterval("hour", 4, "1h", null, 2, null);
    public static final ChartTimeSeriesInterval game = new ChartTimeSeriesInterval("game", 5, "game", null, 2, null);
    public static final ChartTimeSeriesInterval sixHour = new ChartTimeSeriesInterval("sixHour", 6, "6h", null, 2, null);
    public static final ChartTimeSeriesInterval day = new ChartTimeSeriesInterval("day", 7, "1d", null, 2, null);
    public static final ChartTimeSeriesInterval week = new ChartTimeSeriesInterval("week", 8, "1w", null, 2, null);
    public static final ChartTimeSeriesInterval month = new ChartTimeSeriesInterval("month", 9, "1m", null, 2, null);
    public static final ChartTimeSeriesInterval max = new ChartTimeSeriesInterval("max", 10, "max", null, 2, null);

    private static final /* synthetic */ ChartTimeSeriesInterval[] $values() {
        return new ChartTimeSeriesInterval[]{fiveMinute, tenMinute, fifteenMinute, halfHour, hour, game, sixHour, day, week, month, max};
    }

    static {
        ChartTimeSeriesInterval[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ChartTimeSeriesInterval(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartTimeSeriesInterval valueOf(String str) {
        return (ChartTimeSeriesInterval) Enum.valueOf(ChartTimeSeriesInterval.class, str);
    }

    public static ChartTimeSeriesInterval[] values() {
        return (ChartTimeSeriesInterval[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/chartlogic/ChartTimeSeriesInterval$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/chartlogic/ChartTimeSeriesInterval;", "rawValue", "", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChartTimeSeriesInterval init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case 1619:
                    if (!rawValue.equals("1d")) {
                        return null;
                    }
                    return ChartTimeSeriesInterval.day;
                case 1623:
                    if (rawValue.equals("1h")) {
                        return ChartTimeSeriesInterval.hour;
                    }
                    return null;
                case 1628:
                    if (rawValue.equals("1m")) {
                        return ChartTimeSeriesInterval.month;
                    }
                    return null;
                case 1638:
                    if (rawValue.equals("1w")) {
                        return ChartTimeSeriesInterval.week;
                    }
                    return null;
                case 1752:
                    if (rawValue.equals("5m")) {
                        return ChartTimeSeriesInterval.fiveMinute;
                    }
                    return null;
                case 1778:
                    if (rawValue.equals("6h")) {
                        return ChartTimeSeriesInterval.sixHour;
                    }
                    return null;
                case 48686:
                    if (rawValue.equals("10m")) {
                        return ChartTimeSeriesInterval.tenMinute;
                    }
                    return null;
                case 48841:
                    if (rawValue.equals("15m")) {
                        return ChartTimeSeriesInterval.fifteenMinute;
                    }
                    return null;
                case 50608:
                    if (rawValue.equals("30m")) {
                        return ChartTimeSeriesInterval.halfHour;
                    }
                    return null;
                case 107876:
                    if (rawValue.equals("max")) {
                        return ChartTimeSeriesInterval.max;
                    }
                    return null;
                case 3165170:
                    if (rawValue.equals("game")) {
                        return ChartTimeSeriesInterval.game;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private ChartTimeSeriesInterval(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
