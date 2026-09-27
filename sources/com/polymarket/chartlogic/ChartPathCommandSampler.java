package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartPathCommandSampler;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartPathCommandSampler {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartPathCommandSampler[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartPathCommandSampler[] $values() {
        return new ChartPathCommandSampler[0];
    }

    static {
        ChartPathCommandSampler[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartPathCommandSampler(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartPathCommandSampler valueOf(String str) {
        return (ChartPathCommandSampler) Enum.valueOf(ChartPathCommandSampler.class, str);
    }

    public static ChartPathCommandSampler[] values() {
        return (ChartPathCommandSampler[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082 ¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/polymarket/chartlogic/ChartPathCommandSampler$Companion;", "", "<init>", "()V", "y", "", "at", "in_", "", "Lcom/polymarket/chartlogic/ChartPathCommand;", "(DLjava/util/List;)Ljava/lang/Double;", "Swift_Companion_y_0", "x", "commands", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Double Swift_Companion_y_0(double x, List<ChartPathCommand> commands);

        public final Double y(double at, List<ChartPathCommand> in_) {
            in_.getClass();
            return Swift_Companion_y_0(at, in_);
        }

        private Companion() {
        }
    }
}
