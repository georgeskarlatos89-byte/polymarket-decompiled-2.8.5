package com.polymarket.chartlogic;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/chartlogic/ChartMorphPlanBuilder;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartMorphPlanBuilder {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChartMorphPlanBuilder[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ChartMorphPlanBuilder[] $values() {
        return new ChartMorphPlanBuilder[0];
    }

    static {
        ChartMorphPlanBuilder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ChartMorphPlanBuilder(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChartMorphPlanBuilder valueOf(String str) {
        return (ChartMorphPlanBuilder) Enum.valueOf(ChartMorphPlanBuilder.class, str);
    }

    public static ChartMorphPlanBuilder[] values() {
        return (ChartMorphPlanBuilder[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0019\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¨\u0006\n"}, d2 = {"Lcom/polymarket/chartlogic/ChartMorphPlanBuilder$Companion;", "", "<init>", "()V", "makePlan", "Lcom/polymarket/chartlogic/ChartMorphPlan;", "oldModel", "Lcom/polymarket/chartlogic/ChartRenderModel;", "newModel", "Swift_Companion_makePlan_0", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartMorphPlan Swift_Companion_makePlan_0(ChartRenderModel oldModel, ChartRenderModel newModel);

        public final ChartMorphPlan makePlan(ChartRenderModel oldModel, ChartRenderModel newModel) {
            oldModel.getClass();
            newModel.getClass();
            return Swift_Companion_makePlan_0(oldModel, newModel);
        }

        private Companion() {
        }
    }
}
