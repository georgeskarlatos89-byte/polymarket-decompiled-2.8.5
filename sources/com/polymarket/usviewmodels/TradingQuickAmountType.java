package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "displayText", "", "getDisplayText", "()Ljava/lang/String;", "Swift_displayText", "className", "isCurrency", "", "()Z", "Swift_isCurrency", "isShares", "Swift_isShares", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CurrencyCase", "SharesCase", "PercentageCase", "MaxCase", "Companion", "Lcom/polymarket/usviewmodels/TradingQuickAmountType$CurrencyCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType$MaxCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType$PercentageCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType$SharesCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TradingQuickAmountType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TradingQuickAmountType max = new MaxCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType$CurrencyCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class CurrencyCase extends TradingQuickAmountType {
        private final EAmount associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyCase(EAmount eAmount) {
            super(null);
            eAmount.getClass();
            this.associated0 = eAmount;
        }

        public boolean equals(Object other) {
            if (!(other instanceof CurrencyCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((CurrencyCase) other).associated0);
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType$MaxCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MaxCase extends TradingQuickAmountType {
        public MaxCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType$PercentageCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PercentageCase extends TradingQuickAmountType {
        private final double associated0;

        public PercentageCase(double d) {
            super(null);
            this.associated0 = d;
        }

        public boolean equals(Object other) {
            if (!(other instanceof PercentageCase) || this.associated0 != ((PercentageCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final double getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType$SharesCase;", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SharesCase extends TradingQuickAmountType {
        private final int associated0;

        public SharesCase(int i) {
            super(null);
            this.associated0 = i;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SharesCase) || this.associated0 != ((SharesCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final int getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ TradingQuickAmountType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_displayText(String className);

    private final native boolean Swift_isCurrency(String className);

    private final native boolean Swift_isShares(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ TradingQuickAmountType access$getMax$cp() {
        return max;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDisplayText() {
        return Swift_displayText(getClass().getName());
    }

    public final boolean isCurrency() {
        return Swift_isCurrency(getClass().getName());
    }

    public final boolean isShares() {
        return Swift_isShares(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TradingQuickAmountType$Companion;", "", "<init>", "()V", "currency", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "associated0", "Lcom/polymarket/data/EAmount;", "shares", "", "percentage", "", "max", "getMax", "()Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TradingQuickAmountType currency(EAmount associated0) {
            associated0.getClass();
            return new CurrencyCase(associated0);
        }

        public final TradingQuickAmountType getMax() {
            return TradingQuickAmountType.access$getMax$cp();
        }

        public final TradingQuickAmountType percentage(double associated0) {
            return new PercentageCase(associated0);
        }

        public final TradingQuickAmountType shares(int associated0) {
            return new SharesCase(associated0);
        }

        private Companion() {
        }
    }

    private TradingQuickAmountType() {
    }
}
