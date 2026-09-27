package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import com.polymarket.data.EUserPosition;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionCardState;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "pregame", "live", "won", "lost", "cashedOutProfit", "cashedOutLoss", "switched", "isCashedOut", "", "()Z", "Swift_isCashedOut", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsPositionCardState implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SquadsPositionCardState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SquadsPositionCardState pregame = new SquadsPositionCardState("pregame", 0);
    public static final SquadsPositionCardState live = new SquadsPositionCardState("live", 1);
    public static final SquadsPositionCardState won = new SquadsPositionCardState("won", 2);
    public static final SquadsPositionCardState lost = new SquadsPositionCardState("lost", 3);
    public static final SquadsPositionCardState cashedOutProfit = new SquadsPositionCardState("cashedOutProfit", 4);
    public static final SquadsPositionCardState cashedOutLoss = new SquadsPositionCardState("cashedOutLoss", 5);
    public static final SquadsPositionCardState switched = new SquadsPositionCardState("switched", 6);

    private static final /* synthetic */ SquadsPositionCardState[] $values() {
        return new SquadsPositionCardState[]{pregame, live, won, lost, cashedOutProfit, cashedOutLoss, switched};
    }

    static {
        SquadsPositionCardState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private SquadsPositionCardState(String str, int i) {
    }

    private final native boolean Swift_isCashedOut(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SquadsPositionCardState valueOf(String str) {
        return (SquadsPositionCardState) Enum.valueOf(SquadsPositionCardState.class, str);
    }

    public static SquadsPositionCardState[] values() {
        return (SquadsPositionCardState[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean isCashedOut() {
        return Swift_isCashedOut(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionCardState$Companion;", "", "<init>", "()V", "derive", "Lcom/polymarket/usviewmodels/SquadsPositionCardState;", "for_", "Lcom/polymarket/data/EUserPosition;", "Swift_Companion_derive_0", "position", "cashedOut", "realizedPnl", "Lcom/polymarket/data/EAmount;", "Swift_Companion_cashedOut_1", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SquadsPositionCardState Swift_Companion_cashedOut_1(EAmount realizedPnl);

        private final native SquadsPositionCardState Swift_Companion_derive_0(EUserPosition position);

        public final SquadsPositionCardState cashedOut(EAmount realizedPnl) {
            return Swift_Companion_cashedOut_1(realizedPnl);
        }

        public final SquadsPositionCardState derive(EUserPosition for_) {
            for_.getClass();
            return Swift_Companion_derive_0(for_);
        }

        private Companion() {
        }
    }
}
