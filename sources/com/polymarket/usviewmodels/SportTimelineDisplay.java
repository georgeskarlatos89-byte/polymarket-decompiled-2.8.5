package com.polymarket.usviewmodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SoccerCase", "FootballCase", "Companion", "Lcom/polymarket/usviewmodels/SportTimelineDisplay$FootballCase;", "Lcom/polymarket/usviewmodels/SportTimelineDisplay$SoccerCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SportTimelineDisplay implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportTimelineDisplay$FootballCase;", "Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "associated0", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay;", "<init>", "(Lcom/polymarket/usviewmodels/FootballTimelineDisplay;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/FootballTimelineDisplay;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FootballCase extends SportTimelineDisplay {
        private final FootballTimelineDisplay associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FootballCase(FootballTimelineDisplay footballTimelineDisplay) {
            super(null);
            footballTimelineDisplay.getClass();
            this.associated0 = footballTimelineDisplay;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FootballCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((FootballCase) other).associated0);
        }

        public final FootballTimelineDisplay getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportTimelineDisplay$SoccerCase;", "Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "associated0", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;", "<init>", "(Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SoccerCase extends SportTimelineDisplay {
        private final SoccerTimelineDisplay associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoccerCase(SoccerTimelineDisplay soccerTimelineDisplay) {
            super(null);
            soccerTimelineDisplay.getClass();
            this.associated0 = soccerTimelineDisplay;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SoccerCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SoccerCase) other).associated0);
        }

        public final SoccerTimelineDisplay getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ SportTimelineDisplay(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SportTimelineDisplay$Companion;", "", "<init>", "()V", "soccer", "Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "associated0", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;", "football", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportTimelineDisplay football(FootballTimelineDisplay associated0) {
            associated0.getClass();
            return new FootballCase(associated0);
        }

        public final SportTimelineDisplay soccer(SoccerTimelineDisplay associated0) {
            associated0.getClass();
            return new SoccerCase(associated0);
        }

        private Companion() {
        }
    }

    private SportTimelineDisplay() {
    }
}
