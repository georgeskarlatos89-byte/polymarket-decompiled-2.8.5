package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/ETradingIntent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "isSell", "", "()Z", "Swift_isSell", "className", "", "isBuy", "Swift_isBuy", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "BuyCase", "SellCase", "Companion", "Lcom/polymarket/data/ETradingIntent$BuyCase;", "Lcom/polymarket/data/ETradingIntent$SellCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ETradingIntent implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ETradingIntent buy = new BuyCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/ETradingIntent$BuyCase;", "Lcom/polymarket/data/ETradingIntent;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BuyCase extends ETradingIntent {
        public BuyCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/ETradingIntent$SellCase;", "Lcom/polymarket/data/ETradingIntent;", "associated0", "Lcom/polymarket/data/EUserPosition;", "<init>", "(Lcom/polymarket/data/EUserPosition;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "userPosition", "getUserPosition", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SellCase extends ETradingIntent {
        private final EUserPosition associated0;
        private final EUserPosition userPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SellCase(EUserPosition eUserPosition) {
            super(null);
            eUserPosition.getClass();
            this.associated0 = eUserPosition;
            this.userPosition = eUserPosition;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SellCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SellCase) other).associated0);
        }

        public final EUserPosition getAssociated0() {
            return this.associated0;
        }

        public final EUserPosition getUserPosition() {
            return this.userPosition;
        }
    }

    public /* synthetic */ ETradingIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean Swift_isBuy(String className);

    private final native boolean Swift_isSell(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ETradingIntent access$getBuy$cp() {
        return buy;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean isBuy() {
        return Swift_isBuy(getClass().getName());
    }

    public final boolean isSell() {
        return Swift_isSell(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/ETradingIntent$Companion;", "", "<init>", "()V", "buy", "Lcom/polymarket/data/ETradingIntent;", "getBuy", "()Lcom/polymarket/data/ETradingIntent;", "sell", "userPosition", "Lcom/polymarket/data/EUserPosition;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ETradingIntent getBuy() {
            return ETradingIntent.access$getBuy$cp();
        }

        public final ETradingIntent sell(EUserPosition userPosition) {
            userPosition.getClass();
            return new SellCase(userPosition);
        }

        private Companion() {
        }
    }

    private ETradingIntent() {
    }
}
