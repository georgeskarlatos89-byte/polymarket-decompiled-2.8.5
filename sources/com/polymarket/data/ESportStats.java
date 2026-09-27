package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/ESportStats;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SoccerCase", "FootballCase", "UnsupportedCase", "Companion", "Lcom/polymarket/data/ESportStats$FootballCase;", "Lcom/polymarket/data/ESportStats$SoccerCase;", "Lcom/polymarket/data/ESportStats$UnsupportedCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ESportStats implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportStats$FootballCase;", "Lcom/polymarket/data/ESportStats;", "associated0", "Lcom/polymarket/data/ESportStatsFootball;", "<init>", "(Lcom/polymarket/data/ESportStatsFootball;)V", "getAssociated0", "()Lcom/polymarket/data/ESportStatsFootball;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FootballCase extends ESportStats {
        private final ESportStatsFootball associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FootballCase(ESportStatsFootball eSportStatsFootball) {
            super(null);
            eSportStatsFootball.getClass();
            this.associated0 = eSportStatsFootball;
        }

        public final ESportStatsFootball getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportStats$SoccerCase;", "Lcom/polymarket/data/ESportStats;", "associated0", "Lcom/polymarket/data/ESportStatsSoccer;", "<init>", "(Lcom/polymarket/data/ESportStatsSoccer;)V", "getAssociated0", "()Lcom/polymarket/data/ESportStatsSoccer;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SoccerCase extends ESportStats {
        private final ESportStatsSoccer associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoccerCase(ESportStatsSoccer eSportStatsSoccer) {
            super(null);
            eSportStatsSoccer.getClass();
            this.associated0 = eSportStatsSoccer;
        }

        public final ESportStatsSoccer getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportStats$UnsupportedCase;", "Lcom/polymarket/data/ESportStats;", "associated0", "Lcom/polymarket/data/ESportStatsUnsupported;", "<init>", "(Lcom/polymarket/data/ESportStatsUnsupported;)V", "getAssociated0", "()Lcom/polymarket/data/ESportStatsUnsupported;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedCase extends ESportStats {
        private final ESportStatsUnsupported associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedCase(ESportStatsUnsupported eSportStatsUnsupported) {
            super(null);
            eSportStatsUnsupported.getClass();
            this.associated0 = eSportStatsUnsupported;
        }

        public final ESportStatsUnsupported getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ESportStats(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ESportStats$Companion;", "", "<init>", "()V", "soccer", "Lcom/polymarket/data/ESportStats;", "associated0", "Lcom/polymarket/data/ESportStatsSoccer;", "football", "Lcom/polymarket/data/ESportStatsFootball;", "unsupported", "Lcom/polymarket/data/ESportStatsUnsupported;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ESportStats football(ESportStatsFootball associated0) {
            associated0.getClass();
            return new FootballCase(associated0);
        }

        public final ESportStats soccer(ESportStatsSoccer associated0) {
            associated0.getClass();
            return new SoccerCase(associated0);
        }

        public final ESportStats unsupported(ESportStatsUnsupported associated0) {
            associated0.getClass();
            return new UnsupportedCase(associated0);
        }

        private Companion() {
        }
    }

    private ESportStats() {
    }
}
