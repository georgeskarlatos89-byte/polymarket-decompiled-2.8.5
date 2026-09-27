package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/data/EMarketImageContext;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "TeamCase", "IconCase", "EventImageCase", "PlayerImageCase", "Companion", "Lcom/polymarket/data/EMarketImageContext$EventImageCase;", "Lcom/polymarket/data/EMarketImageContext$IconCase;", "Lcom/polymarket/data/EMarketImageContext$PlayerImageCase;", "Lcom/polymarket/data/EMarketImageContext$TeamCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EMarketImageContext implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarketImageContext$EventImageCase;", "Lcom/polymarket/data/EMarketImageContext;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventImageCase extends EMarketImageContext {
        private final URI associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventImageCase(URI uri) {
            super(null);
            uri.getClass();
            this.associated0 = uri;
        }

        public final URI getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarketImageContext$IconCase;", "Lcom/polymarket/data/EMarketImageContext;", "associated0", "Lcom/polymarket/data/EMarketIcon;", "<init>", "(Lcom/polymarket/data/EMarketIcon;)V", "getAssociated0", "()Lcom/polymarket/data/EMarketIcon;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IconCase extends EMarketImageContext {
        private final EMarketIcon associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCase(EMarketIcon eMarketIcon) {
            super(null);
            eMarketIcon.getClass();
            this.associated0 = eMarketIcon;
        }

        public final EMarketIcon getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarketImageContext$PlayerImageCase;", "Lcom/polymarket/data/EMarketImageContext;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PlayerImageCase extends EMarketImageContext {
        private final URI associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayerImageCase(URI uri) {
            super(null);
            uri.getClass();
            this.associated0 = uri;
        }

        public final URI getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EMarketImageContext$TeamCase;", "Lcom/polymarket/data/EMarketImageContext;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "associated1", "Ljava/net/URI;", "<init>", "(Lcom/polymarket/data/ESportsTeam;Ljava/net/URI;)V", "getAssociated0", "()Lcom/polymarket/data/ESportsTeam;", "getAssociated1", "()Ljava/net/URI;", "eventImageURL", "getEventImageURL", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TeamCase extends EMarketImageContext {
        private final ESportsTeam associated0;
        private final URI associated1;
        private final URI eventImageURL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeamCase(ESportsTeam eSportsTeam, URI uri) {
            super(null);
            eSportsTeam.getClass();
            this.associated0 = eSportsTeam;
            this.associated1 = uri;
            this.eventImageURL = uri;
        }

        public final ESportsTeam getAssociated0() {
            return this.associated0;
        }

        public final URI getAssociated1() {
            return this.associated1;
        }

        public final URI getEventImageURL() {
            return this.eventImageURL;
        }
    }

    public /* synthetic */ EMarketImageContext(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0082 ¨\u0006\u0014"}, d2 = {"Lcom/polymarket/data/EMarketImageContext$Companion;", "", "<init>", "()V", "team", "Lcom/polymarket/data/EMarketImageContext;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "eventImageURL", "Ljava/net/URI;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/data/EMarketIcon;", "eventImage", "playerImage", "forActivity", "marketSlug", "", "outcome", "largeImage", "Swift_Companion_forActivity_0", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EMarketImageContext Swift_Companion_forActivity_0(String marketSlug, String outcome, String largeImage);

        public static /* synthetic */ EMarketImageContext team$default(Companion companion, ESportsTeam eSportsTeam, URI uri, int i, Object obj) {
            if ((i & 2) != 0) {
                uri = null;
            }
            return companion.team(eSportsTeam, uri);
        }

        public final EMarketImageContext eventImage(URI associated0) {
            associated0.getClass();
            return new EventImageCase(associated0);
        }

        public final EMarketImageContext forActivity(String marketSlug, String outcome, String largeImage) {
            return Swift_Companion_forActivity_0(marketSlug, outcome, largeImage);
        }

        public final EMarketImageContext icon(EMarketIcon associated0) {
            associated0.getClass();
            return new IconCase(associated0);
        }

        public final EMarketImageContext playerImage(URI associated0) {
            associated0.getClass();
            return new PlayerImageCase(associated0);
        }

        public final EMarketImageContext team(ESportsTeam associated0, URI eventImageURL) {
            associated0.getClass();
            return new TeamCase(associated0, eventImageURL);
        }

        private Companion() {
        }
    }

    private EMarketImageContext() {
    }
}
