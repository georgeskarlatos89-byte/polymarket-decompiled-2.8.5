package com.polymarket.usviewmodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SportStatsDisplay;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SoccerCase", "FootballCase", "Companion", "Lcom/polymarket/usviewmodels/SportStatsDisplay$FootballCase;", "Lcom/polymarket/usviewmodels/SportStatsDisplay$SoccerCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SportStatsDisplay implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportStatsDisplay$FootballCase;", "Lcom/polymarket/usviewmodels/SportStatsDisplay;", "associated0", "Lcom/polymarket/usviewmodels/FootballStatsDisplay;", "<init>", "(Lcom/polymarket/usviewmodels/FootballStatsDisplay;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/FootballStatsDisplay;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FootballCase extends SportStatsDisplay {
        private final FootballStatsDisplay associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FootballCase(FootballStatsDisplay footballStatsDisplay) {
            super(null);
            footballStatsDisplay.getClass();
            this.associated0 = footballStatsDisplay;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FootballCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((FootballCase) other).associated0);
        }

        public final FootballStatsDisplay getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportStatsDisplay$SoccerCase;", "Lcom/polymarket/usviewmodels/SportStatsDisplay;", "associated0", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay;", "<init>", "(Lcom/polymarket/usviewmodels/SoccerStatsDisplay;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SoccerStatsDisplay;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SoccerCase extends SportStatsDisplay {
        private final SoccerStatsDisplay associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoccerCase(SoccerStatsDisplay soccerStatsDisplay) {
            super(null);
            soccerStatsDisplay.getClass();
            this.associated0 = soccerStatsDisplay;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SoccerCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SoccerCase) other).associated0);
        }

        public final SoccerStatsDisplay getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ SportStatsDisplay(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SportStatsDisplay$Companion;", "", "<init>", "()V", "soccer", "Lcom/polymarket/usviewmodels/SportStatsDisplay;", "associated0", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay;", "football", "Lcom/polymarket/usviewmodels/FootballStatsDisplay;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportStatsDisplay football(FootballStatsDisplay associated0) {
            associated0.getClass();
            return new FootballCase(associated0);
        }

        public final SportStatsDisplay soccer(SoccerStatsDisplay associated0) {
            associated0.getClass();
            return new SoccerCase(associated0);
        }

        private Companion() {
        }
    }

    private SportStatsDisplay() {
    }
}
