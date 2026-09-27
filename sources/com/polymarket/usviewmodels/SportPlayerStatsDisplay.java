package com.polymarket.usviewmodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "FootballCase", "Companion", "Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay$FootballCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SportPlayerStatsDisplay implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay$FootballCase;", "Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;", "associated0", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;", "<init>", "(Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FootballCase extends SportPlayerStatsDisplay {
        private final FootballPlayerStatsDisplay associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FootballCase(FootballPlayerStatsDisplay footballPlayerStatsDisplay) {
            super(null);
            footballPlayerStatsDisplay.getClass();
            this.associated0 = footballPlayerStatsDisplay;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FootballCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((FootballCase) other).associated0);
        }

        public final FootballPlayerStatsDisplay getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ SportPlayerStatsDisplay(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay$Companion;", "", "<init>", "()V", "football", "Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;", "associated0", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportPlayerStatsDisplay football(FootballPlayerStatsDisplay associated0) {
            associated0.getClass();
            return new FootballCase(associated0);
        }

        private Companion() {
        }
    }

    private SportPlayerStatsDisplay() {
    }
}
