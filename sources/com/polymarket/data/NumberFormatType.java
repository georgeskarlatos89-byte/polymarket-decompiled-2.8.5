package com.polymarket.data;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/polymarket/data/NumberFormatType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "PercentageAdaptiveCase", "PercentageCappedCase", "IntegerCase", "DecimalCase", "CompactCase", "SharesCase", "OddsCase", "PercentageWholeCase", "ProfitPercentageCase", "Companion", "Lcom/polymarket/data/NumberFormatType$CompactCase;", "Lcom/polymarket/data/NumberFormatType$DecimalCase;", "Lcom/polymarket/data/NumberFormatType$IntegerCase;", "Lcom/polymarket/data/NumberFormatType$OddsCase;", "Lcom/polymarket/data/NumberFormatType$PercentageAdaptiveCase;", "Lcom/polymarket/data/NumberFormatType$PercentageCappedCase;", "Lcom/polymarket/data/NumberFormatType$PercentageWholeCase;", "Lcom/polymarket/data/NumberFormatType$ProfitPercentageCase;", "Lcom/polymarket/data/NumberFormatType$SharesCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class NumberFormatType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final NumberFormatType percentageAdaptive = new PercentageAdaptiveCase();
    private static final NumberFormatType percentageCapped = new PercentageCappedCase();
    private static final NumberFormatType integer = new IntegerCase();
    private static final NumberFormatType compact = new CompactCase();
    private static final NumberFormatType shares = new SharesCase();
    private static final NumberFormatType percentageWhole = new PercentageWholeCase();
    private static final NumberFormatType profitPercentage = new ProfitPercentageCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$CompactCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CompactCase extends NumberFormatType {
        public CompactCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/NumberFormatType$DecimalCase;", "Lcom/polymarket/data/NumberFormatType;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "places", "getPlaces", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DecimalCase extends NumberFormatType {
        private final int associated0;
        private final int places;

        public DecimalCase(int i) {
            super(null);
            this.associated0 = i;
            this.places = i;
        }

        public final int getAssociated0() {
            return this.associated0;
        }

        public final int getPlaces() {
            return this.places;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$IntegerCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IntegerCase extends NumberFormatType {
        public IntegerCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/NumberFormatType$OddsCase;", "Lcom/polymarket/data/NumberFormatType;", "associated0", "Lcom/polymarket/data/OddsFormat;", "<init>", "(Lcom/polymarket/data/OddsFormat;)V", "getAssociated0", "()Lcom/polymarket/data/OddsFormat;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OddsCase extends NumberFormatType {
        private final OddsFormat associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OddsCase(OddsFormat oddsFormat) {
            super(null);
            oddsFormat.getClass();
            this.associated0 = oddsFormat;
        }

        public final OddsFormat getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$PercentageAdaptiveCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PercentageAdaptiveCase extends NumberFormatType {
        public PercentageAdaptiveCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$PercentageCappedCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PercentageCappedCase extends NumberFormatType {
        public PercentageCappedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$PercentageWholeCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PercentageWholeCase extends NumberFormatType {
        public PercentageWholeCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$ProfitPercentageCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProfitPercentageCase extends NumberFormatType {
        public ProfitPercentageCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/NumberFormatType$SharesCase;", "Lcom/polymarket/data/NumberFormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SharesCase extends NumberFormatType {
        public SharesCase() {
            super(null);
        }
    }

    public /* synthetic */ NumberFormatType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ NumberFormatType access$getCompact$cp() {
        return compact;
    }

    public static final /* synthetic */ NumberFormatType access$getInteger$cp() {
        return integer;
    }

    public static final /* synthetic */ NumberFormatType access$getPercentageAdaptive$cp() {
        return percentageAdaptive;
    }

    public static final /* synthetic */ NumberFormatType access$getPercentageCapped$cp() {
        return percentageCapped;
    }

    public static final /* synthetic */ NumberFormatType access$getPercentageWhole$cp() {
        return percentageWhole;
    }

    public static final /* synthetic */ NumberFormatType access$getProfitPercentage$cp() {
        return profitPercentage;
    }

    public static final /* synthetic */ NumberFormatType access$getShares$cp() {
        return shares;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/NumberFormatType$Companion;", "", "<init>", "()V", "percentageAdaptive", "Lcom/polymarket/data/NumberFormatType;", "getPercentageAdaptive", "()Lcom/polymarket/data/NumberFormatType;", "percentageCapped", "getPercentageCapped", AttributeType.INTEGER, "getInteger", "decimal", "places", "", "compact", "getCompact", "shares", "getShares", "odds", "associated0", "Lcom/polymarket/data/OddsFormat;", "percentageWhole", "getPercentageWhole", "profitPercentage", "getProfitPercentage", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NumberFormatType decimal(int places) {
            return new DecimalCase(places);
        }

        public final NumberFormatType getCompact() {
            return NumberFormatType.access$getCompact$cp();
        }

        public final NumberFormatType getInteger() {
            return NumberFormatType.access$getInteger$cp();
        }

        public final NumberFormatType getPercentageAdaptive() {
            return NumberFormatType.access$getPercentageAdaptive$cp();
        }

        public final NumberFormatType getPercentageCapped() {
            return NumberFormatType.access$getPercentageCapped$cp();
        }

        public final NumberFormatType getPercentageWhole() {
            return NumberFormatType.access$getPercentageWhole$cp();
        }

        public final NumberFormatType getProfitPercentage() {
            return NumberFormatType.access$getProfitPercentage$cp();
        }

        public final NumberFormatType getShares() {
            return NumberFormatType.access$getShares$cp();
        }

        public final NumberFormatType odds(OddsFormat associated0) {
            associated0.getClass();
            return new OddsCase(associated0);
        }

        private Companion() {
        }
    }

    private NumberFormatType() {
    }
}
