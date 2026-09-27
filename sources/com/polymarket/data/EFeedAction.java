package com.polymarket.data;

import com.fingerprintjs.android.fpjs_pro.g;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EFeedAction;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "UrlCase", "EventCase", "MarketCase", "TournamentCase", "HubSectionCase", "Companion", "Lcom/polymarket/data/EFeedAction$EventCase;", "Lcom/polymarket/data/EFeedAction$HubSectionCase;", "Lcom/polymarket/data/EFeedAction$MarketCase;", "Lcom/polymarket/data/EFeedAction$TournamentCase;", "Lcom/polymarket/data/EFeedAction$UrlCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EFeedAction implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EFeedAction$EventCase;", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventCase extends EFeedAction {
        private final String associated0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.id = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/polymarket/data/EFeedAction$HubSectionCase;", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "associated1", "associated2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "getAssociated2", "hubId", "getHubId", "section", "getSection", "feed", "getFeed", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HubSectionCase extends EFeedAction {
        private final String associated0;
        private final String associated1;
        private final String associated2;
        private final String feed;
        private final String hubId;
        private final String section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HubSectionCase(String str, String str2, String str3) {
            super(null);
            g.x(str, str2, str3);
            this.associated0 = str;
            this.associated1 = str2;
            this.associated2 = str3;
            this.hubId = str;
            this.section = str2;
            this.feed = str3;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getFeed() {
            return this.feed;
        }

        public final String getHubId() {
            return this.hubId;
        }

        public final String getSection() {
            return this.section;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EFeedAction$MarketCase;", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketCase extends EFeedAction {
        private final String associated0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.id = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EFeedAction$TournamentCase;", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TournamentCase extends EFeedAction {
        private final String associated0;
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TournamentCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.id = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EFeedAction$UrlCase;", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UrlCase extends EFeedAction {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ EFeedAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/EFeedAction$Companion;", "", "<init>", "()V", "url", "Lcom/polymarket/data/EFeedAction;", "associated0", "", "event", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "market", "tournament", "hubSection", "hubId", "section", "feed", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EFeedAction event(String id) {
            id.getClass();
            return new EventCase(id);
        }

        public final EFeedAction hubSection(String hubId, String section, String feed) {
            hubId.getClass();
            section.getClass();
            feed.getClass();
            return new HubSectionCase(hubId, section, feed);
        }

        public final EFeedAction market(String id) {
            id.getClass();
            return new MarketCase(id);
        }

        public final EFeedAction tournament(String id) {
            id.getClass();
            return new TournamentCase(id);
        }

        public final EFeedAction url(String associated0) {
            associated0.getClass();
            return new UrlCase(associated0);
        }

        private Companion() {
        }
    }

    private EFeedAction() {
    }
}
