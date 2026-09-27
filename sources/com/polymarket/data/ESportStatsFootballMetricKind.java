package com.polymarket.data;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/ESportStatsFootballMetricKind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "totalYards", "yardsPerPlay", "passingYards", "rushingYards", "firstDowns", "turnovers", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportStatsFootballMetricKind implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ESportStatsFootballMetricKind[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ESportStatsFootballMetricKind totalYards = new ESportStatsFootballMetricKind("totalYards", 0, "totalYards", null, 2, null);
    public static final ESportStatsFootballMetricKind yardsPerPlay = new ESportStatsFootballMetricKind("yardsPerPlay", 1, "yardsPerPlay", null, 2, null);
    public static final ESportStatsFootballMetricKind passingYards = new ESportStatsFootballMetricKind("passingYards", 2, "passingYards", null, 2, null);
    public static final ESportStatsFootballMetricKind rushingYards = new ESportStatsFootballMetricKind("rushingYards", 3, "rushingYards", null, 2, null);
    public static final ESportStatsFootballMetricKind firstDowns = new ESportStatsFootballMetricKind("firstDowns", 4, "firstDowns", null, 2, null);
    public static final ESportStatsFootballMetricKind turnovers = new ESportStatsFootballMetricKind("turnovers", 5, "turnovers", null, 2, null);

    private static final /* synthetic */ ESportStatsFootballMetricKind[] $values() {
        return new ESportStatsFootballMetricKind[]{totalYards, yardsPerPlay, passingYards, rushingYards, firstDowns, turnovers};
    }

    static {
        ESportStatsFootballMetricKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ESportStatsFootballMetricKind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ESportStatsFootballMetricKind valueOf(String str) {
        return (ESportStatsFootballMetricKind) Enum.valueOf(ESportStatsFootballMetricKind.class, str);
    }

    public static ESportStatsFootballMetricKind[] values() {
        return (ESportStatsFootballMetricKind[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportStatsFootballMetricKind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESportStatsFootballMetricKind;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ESportStatsFootballMetricKind init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1511113928:
                    if (!rawValue.equals("yardsPerPlay")) {
                        return null;
                    }
                    return ESportStatsFootballMetricKind.yardsPerPlay;
                case -711488619:
                    if (rawValue.equals("totalYards")) {
                        return ESportStatsFootballMetricKind.totalYards;
                    }
                    return null;
                case -185869503:
                    if (rawValue.equals("firstDowns")) {
                        return ESportStatsFootballMetricKind.firstDowns;
                    }
                    return null;
                case -109403198:
                    if (rawValue.equals("turnovers")) {
                        return ESportStatsFootballMetricKind.turnovers;
                    }
                    return null;
                case 725337288:
                    if (rawValue.equals("passingYards")) {
                        return ESportStatsFootballMetricKind.passingYards;
                    }
                    return null;
                case 2106343823:
                    if (rawValue.equals("rushingYards")) {
                        return ESportStatsFootballMetricKind.rushingYards;
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

    private ESportStatsFootballMetricKind(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
