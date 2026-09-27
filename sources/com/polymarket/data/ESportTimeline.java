package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/data/ESportTimeline;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SoccerCase", "FootballCase", "UnavailableCase", "UnsupportedCase", "Companion", "Lcom/polymarket/data/ESportTimeline$FootballCase;", "Lcom/polymarket/data/ESportTimeline$SoccerCase;", "Lcom/polymarket/data/ESportTimeline$UnavailableCase;", "Lcom/polymarket/data/ESportTimeline$UnsupportedCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ESportTimeline implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportTimeline$FootballCase;", "Lcom/polymarket/data/ESportTimeline;", "associated0", "Lcom/polymarket/data/ESportTimelineFootball;", "<init>", "(Lcom/polymarket/data/ESportTimelineFootball;)V", "getAssociated0", "()Lcom/polymarket/data/ESportTimelineFootball;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FootballCase extends ESportTimeline {
        private final ESportTimelineFootball associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FootballCase(ESportTimelineFootball eSportTimelineFootball) {
            super(null);
            eSportTimelineFootball.getClass();
            this.associated0 = eSportTimelineFootball;
        }

        public final ESportTimelineFootball getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportTimeline$SoccerCase;", "Lcom/polymarket/data/ESportTimeline;", "associated0", "Lcom/polymarket/data/ESportTimelineSoccer;", "<init>", "(Lcom/polymarket/data/ESportTimelineSoccer;)V", "getAssociated0", "()Lcom/polymarket/data/ESportTimelineSoccer;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SoccerCase extends ESportTimeline {
        private final ESportTimelineSoccer associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoccerCase(ESportTimelineSoccer eSportTimelineSoccer) {
            super(null);
            eSportTimelineSoccer.getClass();
            this.associated0 = eSportTimelineSoccer;
        }

        public final ESportTimelineSoccer getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportTimeline$UnavailableCase;", "Lcom/polymarket/data/ESportTimeline;", "associated0", "Lcom/polymarket/data/ESportTimelineUnavailable;", "<init>", "(Lcom/polymarket/data/ESportTimelineUnavailable;)V", "getAssociated0", "()Lcom/polymarket/data/ESportTimelineUnavailable;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnavailableCase extends ESportTimeline {
        private final ESportTimelineUnavailable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnavailableCase(ESportTimelineUnavailable eSportTimelineUnavailable) {
            super(null);
            eSportTimelineUnavailable.getClass();
            this.associated0 = eSportTimelineUnavailable;
        }

        public final ESportTimelineUnavailable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportTimeline$UnsupportedCase;", "Lcom/polymarket/data/ESportTimeline;", "associated0", "Lcom/polymarket/data/ESportTimelineUnsupported;", "<init>", "(Lcom/polymarket/data/ESportTimelineUnsupported;)V", "getAssociated0", "()Lcom/polymarket/data/ESportTimelineUnsupported;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedCase extends ESportTimeline {
        private final ESportTimelineUnsupported associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedCase(ESportTimelineUnsupported eSportTimelineUnsupported) {
            super(null);
            eSportTimelineUnsupported.getClass();
            this.associated0 = eSportTimelineUnsupported;
        }

        public final ESportTimelineUnsupported getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ESportTimeline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/ESportTimeline$Companion;", "", "<init>", "()V", "soccer", "Lcom/polymarket/data/ESportTimeline;", "associated0", "Lcom/polymarket/data/ESportTimelineSoccer;", "football", "Lcom/polymarket/data/ESportTimelineFootball;", "unavailable", "Lcom/polymarket/data/ESportTimelineUnavailable;", "unsupported", "Lcom/polymarket/data/ESportTimelineUnsupported;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ESportTimeline football(ESportTimelineFootball associated0) {
            associated0.getClass();
            return new FootballCase(associated0);
        }

        public final ESportTimeline soccer(ESportTimelineSoccer associated0) {
            associated0.getClass();
            return new SoccerCase(associated0);
        }

        public final ESportTimeline unavailable(ESportTimelineUnavailable associated0) {
            associated0.getClass();
            return new UnavailableCase(associated0);
        }

        public final ESportTimeline unsupported(ESportTimelineUnsupported associated0) {
            associated0.getClass();
            return new UnsupportedCase(associated0);
        }

        private Companion() {
        }
    }

    private ESportTimeline() {
    }
}
