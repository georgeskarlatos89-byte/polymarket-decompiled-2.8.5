package com.polymarket.usviewmodels;

import com.polymarket.data.EOrderReceipt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TradeExecution;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "MarketCase", "ComboCase", "Companion", "Lcom/polymarket/usviewmodels/TradeExecution$ComboCase;", "Lcom/polymarket/usviewmodels/TradeExecution$MarketCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TradeExecution implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/TradeExecution$ComboCase;", "Lcom/polymarket/usviewmodels/TradeExecution;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "comboMarketSlug", "getComboMarketSlug", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ComboCase extends TradeExecution {
        private final String associated0;
        private final String comboMarketSlug;

        public ComboCase(String str) {
            super(null);
            this.associated0 = str;
            this.comboMarketSlug = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getComboMarketSlug() {
            return this.comboMarketSlug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TradeExecution$MarketCase;", "Lcom/polymarket/usviewmodels/TradeExecution;", "associated0", "Lcom/polymarket/data/EOrderReceipt;", "<init>", "(Lcom/polymarket/data/EOrderReceipt;)V", "getAssociated0", "()Lcom/polymarket/data/EOrderReceipt;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MarketCase extends TradeExecution {
        private final EOrderReceipt associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketCase(EOrderReceipt eOrderReceipt) {
            super(null);
            eOrderReceipt.getClass();
            this.associated0 = eOrderReceipt;
        }

        public final EOrderReceipt getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ TradeExecution(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/TradeExecution$Companion;", "", "<init>", "()V", "market", "Lcom/polymarket/usviewmodels/TradeExecution;", "associated0", "Lcom/polymarket/data/EOrderReceipt;", "combo", "comboMarketSlug", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TradeExecution combo(String comboMarketSlug) {
            return new ComboCase(comboMarketSlug);
        }

        public final TradeExecution market(EOrderReceipt associated0) {
            associated0.getClass();
            return new MarketCase(associated0);
        }

        private Companion() {
        }
    }

    private TradeExecution() {
    }
}
