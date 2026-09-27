package com.polymarket.usdependencies;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.data.EAmount;
import com.polymarket.data.EAppTab;
import com.polymarket.data.EReferralLinkType;
import com.polymarket.data.EUTMParameters;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.py2;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 ;2\u00020\u0001:(\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082 J\u0011\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\f\u0082\u0001\u001f<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ¨\u0006["}, d2 = {"Lcom/polymarket/usdependencies/USRoute;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "url", "Ljava/net/URI;", "base", "Swift_url_0", "className", "", "isAllowedFromMicrosite", "", "()Z", "Swift_isAllowedFromMicrosite", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "HomeCase", "EventCase", "UserProfileByNameCase", "UserProfileByWalletCase", "ProfileCase", "ProfilePositionsCase", "ProfileOrdersCase", "ProfileActivityCase", "DepositCase", "WithdrawalCase", "EventBuyCase", "OrderBookCase", "EventSellCase", "WaitlistReferralCase", "ReferralShareCase", "ReferralCase", "SquadJoinCase", "SquadCase", "SquadInvitesCase", "SquadsCase", "SquadsTutorialCase", "TournamentCase", "SportsTeamCase", "SettingsCase", "SystemNotificationSettingsCase", "SupportCase", "CombosCase", "ThreeDSCallbackCase", "RfiVerificationCase", "MicrositeCase", "HubCase", "SettingsPage", "FundsPage", "FundsLink", "EventTab", "SportsTeamReference", "SportsTeamTab", "EntryPoint", "RouteQueryEvent", "Companion", "Lcom/polymarket/usdependencies/USRoute$CombosCase;", "Lcom/polymarket/usdependencies/USRoute$DepositCase;", "Lcom/polymarket/usdependencies/USRoute$EventBuyCase;", "Lcom/polymarket/usdependencies/USRoute$EventCase;", "Lcom/polymarket/usdependencies/USRoute$EventSellCase;", "Lcom/polymarket/usdependencies/USRoute$HomeCase;", "Lcom/polymarket/usdependencies/USRoute$HubCase;", "Lcom/polymarket/usdependencies/USRoute$MicrositeCase;", "Lcom/polymarket/usdependencies/USRoute$OrderBookCase;", "Lcom/polymarket/usdependencies/USRoute$ProfileActivityCase;", "Lcom/polymarket/usdependencies/USRoute$ProfileCase;", "Lcom/polymarket/usdependencies/USRoute$ProfileOrdersCase;", "Lcom/polymarket/usdependencies/USRoute$ProfilePositionsCase;", "Lcom/polymarket/usdependencies/USRoute$ReferralCase;", "Lcom/polymarket/usdependencies/USRoute$ReferralShareCase;", "Lcom/polymarket/usdependencies/USRoute$RfiVerificationCase;", "Lcom/polymarket/usdependencies/USRoute$SettingsCase;", "Lcom/polymarket/usdependencies/USRoute$SportsTeamCase;", "Lcom/polymarket/usdependencies/USRoute$SquadCase;", "Lcom/polymarket/usdependencies/USRoute$SquadInvitesCase;", "Lcom/polymarket/usdependencies/USRoute$SquadJoinCase;", "Lcom/polymarket/usdependencies/USRoute$SquadsCase;", "Lcom/polymarket/usdependencies/USRoute$SquadsTutorialCase;", "Lcom/polymarket/usdependencies/USRoute$SupportCase;", "Lcom/polymarket/usdependencies/USRoute$SystemNotificationSettingsCase;", "Lcom/polymarket/usdependencies/USRoute$ThreeDSCallbackCase;", "Lcom/polymarket/usdependencies/USRoute$TournamentCase;", "Lcom/polymarket/usdependencies/USRoute$UserProfileByNameCase;", "Lcom/polymarket/usdependencies/USRoute$UserProfileByWalletCase;", "Lcom/polymarket/usdependencies/USRoute$WaitlistReferralCase;", "Lcom/polymarket/usdependencies/USRoute$WithdrawalCase;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class USRoute implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final USRoute profile = new ProfileCase();
    private static final USRoute profilePositions = new ProfilePositionsCase();
    private static final USRoute profileOrders = new ProfileOrdersCase();
    private static final USRoute profileActivity = new ProfileActivityCase();
    private static final USRoute referralShare = new ReferralShareCase();
    private static final USRoute squads = new SquadsCase();
    private static final USRoute squadsTutorial = new SquadsTutorialCase();
    private static final USRoute systemNotificationSettings = new SystemNotificationSettingsCase();
    private static final USRoute support = new SupportCase();
    private static final USRoute combos = new CombosCase();
    private static final USRoute threeDSCallback = new ThreeDSCallbackCase();
    private static final USRoute rfiVerification = new RfiVerificationCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$CombosCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CombosCase extends USRoute {
        public CombosCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$DepositCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "Lcom/polymarket/usdependencies/USRoute$FundsPage;", "associated2", "Lcom/polymarket/usdependencies/USRoute$FundsLink;", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/usdependencies/USRoute$FundsPage;Lcom/polymarket/usdependencies/USRoute$FundsLink;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Lcom/polymarket/usdependencies/USRoute$FundsPage;", "getAssociated2", "()Lcom/polymarket/usdependencies/USRoute$FundsLink;", "amount", "getAmount", "page", "getPage", ActionType.LINK, "getLink", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositCase extends USRoute {
        private final EAmount amount;
        private final EAmount associated0;
        private final FundsPage associated1;
        private final FundsLink associated2;
        private final FundsLink link;
        private final FundsPage page;

        public DepositCase(EAmount eAmount, FundsPage fundsPage, FundsLink fundsLink) {
            super(null);
            this.associated0 = eAmount;
            this.associated1 = fundsPage;
            this.associated2 = fundsLink;
            this.amount = eAmount;
            this.page = fundsPage;
            this.link = fundsLink;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final FundsPage getAssociated1() {
            return this.associated1;
        }

        public final FundsLink getAssociated2() {
            return this.associated2;
        }

        public final FundsLink getLink() {
            return this.link;
        }

        public final FundsPage getPage() {
            return this.page;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EventBuyCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "", "associated2", "associated3", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssociated2", "getAssociated3", "()Z", "eventSlug", "getEventSlug", "outcomeIndex", "getOutcomeIndex", "marketSlug", "getMarketSlug", "long", "getLong", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventBuyCase extends USRoute {
        private final String associated0;
        private final Integer associated1;
        private final String associated2;
        private final boolean associated3;
        private final String eventSlug;
        private final boolean long;
        private final String marketSlug;
        private final Integer outcomeIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventBuyCase(String str, Integer num, String str2, boolean z) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.associated1 = num;
            this.associated2 = str2;
            this.associated3 = z;
            this.eventSlug = str;
            this.outcomeIndex = num;
            this.marketSlug = str2;
            this.long = z;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final boolean getAssociated3() {
            return this.associated3;
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final boolean getLong() {
            return this.long;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }

        public final Integer getOutcomeIndex() {
            return this.outcomeIndex;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EventCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent;", "associated2", "Lcom/polymarket/usdependencies/USRoute$EventTab;", "<init>", "(Ljava/lang/String;Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent;Lcom/polymarket/usdependencies/USRoute$EventTab;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent;", "getAssociated2", "()Lcom/polymarket/usdependencies/USRoute$EventTab;", "slug", "getSlug", "query", "getQuery", "tab", "getTab", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventCase extends USRoute {
        private final String associated0;
        private final RouteQueryEvent associated1;
        private final EventTab associated2;
        private final RouteQueryEvent query;
        private final String slug;
        private final EventTab tab;

        public EventCase(String str, RouteQueryEvent routeQueryEvent, EventTab eventTab) {
            super(null);
            this.associated0 = str;
            this.associated1 = routeQueryEvent;
            this.associated2 = eventTab;
            this.slug = str;
            this.query = routeQueryEvent;
            this.tab = eventTab;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final RouteQueryEvent getAssociated1() {
            return this.associated1;
        }

        public final EventTab getAssociated2() {
            return this.associated2;
        }

        public final RouteQueryEvent getQuery() {
            return this.query;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final EventTab getTab() {
            return this.tab;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EventSellCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "positionId", "getPositionId", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventSellCase extends USRoute {
        private final String associated0;
        private final String positionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventSellCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.positionId = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getPositionId() {
            return this.positionId;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$HomeCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "Lcom/polymarket/data/EAppTab;", "associated1", "", "associated2", "<init>", "(Lcom/polymarket/data/EAppTab;Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/data/EAppTab;", "getAssociated1", "()Ljava/lang/String;", "getAssociated2", "tab", "getTab", "categorySlug", "getCategorySlug", "subtab", "getSubtab", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HomeCase extends USRoute {
        private final EAppTab associated0;
        private final String associated1;
        private final String associated2;
        private final String categorySlug;
        private final String subtab;
        private final EAppTab tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeCase(EAppTab eAppTab, String str, String str2) {
            super(null);
            eAppTab.getClass();
            this.associated0 = eAppTab;
            this.associated1 = str;
            this.associated2 = str2;
            this.tab = eAppTab;
            this.categorySlug = str;
            this.subtab = str2;
        }

        public final EAppTab getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getCategorySlug() {
            return this.categorySlug;
        }

        public final String getSubtab() {
            return this.subtab;
        }

        public final EAppTab getTab() {
            return this.tab;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$HubCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "slug", "getSlug", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HubCase extends USRoute {
        private final String associated0;
        private final String slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HubCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.slug = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getSlug() {
            return this.slug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$MicrositeCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "query", "getQuery", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MicrositeCase extends USRoute {
        private final String associated0;
        private final String associated1;
        private final String id;
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MicrositeCase(String str, String str2) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.associated1 = str2;
            this.id = str;
            this.query = str2;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getId() {
            return this.id;
        }

        public final String getQuery() {
            return this.query;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$OrderBookCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "associated2", "associated3", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "getAssociated2", "getAssociated3", "()Z", "eventSlug", "getEventSlug", "marketSideId", "getMarketSideId", "marketSlug", "getMarketSlug", "long", "getLong", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderBookCase extends USRoute {
        private final String associated0;
        private final String associated1;
        private final String associated2;
        private final boolean associated3;
        private final String eventSlug;
        private final boolean long;
        private final String marketSideId;
        private final String marketSlug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderBookCase(String str, String str2, String str3, boolean z) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.associated1 = str2;
            this.associated2 = str3;
            this.associated3 = z;
            this.eventSlug = str;
            this.marketSideId = str2;
            this.marketSlug = str3;
            this.long = z;
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

        public final boolean getAssociated3() {
            return this.associated3;
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final boolean getLong() {
            return this.long;
        }

        public final String getMarketSideId() {
            return this.marketSideId;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ProfileActivityCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProfileActivityCase extends USRoute {
        public ProfileActivityCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ProfileCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProfileCase extends USRoute {
        public ProfileCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ProfileOrdersCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProfileOrdersCase extends USRoute {
        public ProfileOrdersCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ProfilePositionsCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProfilePositionsCase extends USRoute {
        public ProfilePositionsCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ReferralCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "Lcom/polymarket/data/EUTMParameters;", "associated2", "Lcom/polymarket/data/EReferralLinkType;", "<init>", "(Ljava/lang/String;Lcom/polymarket/data/EUTMParameters;Lcom/polymarket/data/EReferralLinkType;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Lcom/polymarket/data/EUTMParameters;", "getAssociated2", "()Lcom/polymarket/data/EReferralLinkType;", ApiConstant.KEY_CODE, "getCode", "utm", "getUtm", "linkType", "getLinkType", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ReferralCase extends USRoute {
        private final String associated0;
        private final EUTMParameters associated1;
        private final EReferralLinkType associated2;
        private final String code;
        private final EReferralLinkType linkType;
        private final EUTMParameters utm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReferralCase(String str, EUTMParameters eUTMParameters, EReferralLinkType eReferralLinkType) {
            super(null);
            str.getClass();
            eReferralLinkType.getClass();
            this.associated0 = str;
            this.associated1 = eUTMParameters;
            this.associated2 = eReferralLinkType;
            this.code = str;
            this.utm = eUTMParameters;
            this.linkType = eReferralLinkType;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final EUTMParameters getAssociated1() {
            return this.associated1;
        }

        public final EReferralLinkType getAssociated2() {
            return this.associated2;
        }

        public final String getCode() {
            return this.code;
        }

        public final EReferralLinkType getLinkType() {
            return this.linkType;
        }

        public final EUTMParameters getUtm() {
            return this.utm;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ReferralShareCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ReferralShareCase extends USRoute {
        public ReferralShareCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$RfiVerificationCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RfiVerificationCase extends USRoute {
        public RfiVerificationCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SettingsCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "Lcom/polymarket/usdependencies/USRoute$SettingsPage;", "<init>", "(Lcom/polymarket/usdependencies/USRoute$SettingsPage;)V", "getAssociated0", "()Lcom/polymarket/usdependencies/USRoute$SettingsPage;", "page", "getPage", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SettingsCase extends USRoute {
        private final SettingsPage associated0;
        private final SettingsPage page;

        public SettingsCase(SettingsPage settingsPage) {
            super(null);
            this.associated0 = settingsPage;
            this.page = settingsPage;
        }

        public final SettingsPage getAssociated0() {
            return this.associated0;
        }

        public final SettingsPage getPage() {
            return this.page;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "associated2", "Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;", "<init>", "(Ljava/lang/String;Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "getAssociated2", "()Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;", "league", "getLeague", "team", "getTeam", "tab", "getTab", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SportsTeamCase extends USRoute {
        private final String associated0;
        private final SportsTeamReference associated1;
        private final SportsTeamTab associated2;
        private final String league;
        private final SportsTeamTab tab;
        private final SportsTeamReference team;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportsTeamCase(String str, SportsTeamReference sportsTeamReference, SportsTeamTab sportsTeamTab) {
            super(null);
            str.getClass();
            sportsTeamReference.getClass();
            this.associated0 = str;
            this.associated1 = sportsTeamReference;
            this.associated2 = sportsTeamTab;
            this.league = str;
            this.team = sportsTeamReference;
            this.tab = sportsTeamTab;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final SportsTeamReference getAssociated1() {
            return this.associated1;
        }

        public final SportsTeamTab getAssociated2() {
            return this.associated2;
        }

        public final String getLeague() {
            return this.league;
        }

        public final SportsTeamTab getTab() {
            return this.tab;
        }

        public final SportsTeamReference getTeam() {
            return this.team;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SquadCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "messageId", "getMessageId", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadCase extends USRoute {
        private final String associated0;
        private final String associated1;
        private final String id;
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadCase(String str, String str2) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.associated1 = str2;
            this.id = str;
            this.messageId = str2;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SquadInvitesCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "squadId", "getSquadId", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadInvitesCase extends USRoute {
        private final String associated0;
        private final String squadId;

        public SquadInvitesCase(String str) {
            super(null);
            this.associated0 = str;
            this.squadId = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getSquadId() {
            return this.squadId;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SquadJoinCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "token", "getToken", "referrer", "getReferrer", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadJoinCase extends USRoute {
        private final String associated0;
        private final String associated1;
        private final String referrer;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadJoinCase(String str, String str2) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.associated1 = str2;
            this.token = str;
            this.referrer = str2;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final String getToken() {
            return this.token;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SquadsCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadsCase extends USRoute {
        public SquadsCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SquadsTutorialCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadsTutorialCase extends USRoute {
        public SquadsTutorialCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SupportCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SupportCase extends USRoute {
        public SupportCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SystemNotificationSettingsCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SystemNotificationSettingsCase extends USRoute {
        public SystemNotificationSettingsCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$ThreeDSCallbackCase;", "Lcom/polymarket/usdependencies/USRoute;", "<init>", "()V", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ThreeDSCallbackCase extends USRoute {
        public ThreeDSCallbackCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$TournamentCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TournamentCase extends USRoute {
        private final int associated0;
        private final int id;

        public TournamentCase(int i) {
            super(null);
            this.associated0 = i;
            this.id = i;
        }

        public final int getAssociated0() {
            return this.associated0;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$UserProfileByNameCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserProfileByNameCase extends USRoute {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserProfileByNameCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$UserProfileByWalletCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserProfileByWalletCase extends USRoute {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserProfileByWalletCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$WaitlistReferralCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "getCode", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WaitlistReferralCase extends USRoute {
        private final String associated0;
        private final String code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitlistReferralCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.code = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$WithdrawalCase;", "Lcom/polymarket/usdependencies/USRoute;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "Lcom/polymarket/usdependencies/USRoute$FundsPage;", "associated2", "Lcom/polymarket/usdependencies/USRoute$FundsLink;", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/usdependencies/USRoute$FundsPage;Lcom/polymarket/usdependencies/USRoute$FundsLink;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Lcom/polymarket/usdependencies/USRoute$FundsPage;", "getAssociated2", "()Lcom/polymarket/usdependencies/USRoute$FundsLink;", "amount", "getAmount", "page", "getPage", ActionType.LINK, "getLink", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WithdrawalCase extends USRoute {
        private final EAmount amount;
        private final EAmount associated0;
        private final FundsPage associated1;
        private final FundsLink associated2;
        private final FundsLink link;
        private final FundsPage page;

        public WithdrawalCase(EAmount eAmount, FundsPage fundsPage, FundsLink fundsLink) {
            super(null);
            this.associated0 = eAmount;
            this.associated1 = fundsPage;
            this.associated2 = fundsLink;
            this.amount = eAmount;
            this.page = fundsPage;
            this.link = fundsLink;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final FundsPage getAssociated1() {
            return this.associated1;
        }

        public final FundsLink getAssociated2() {
            return this.associated2;
        }

        public final FundsLink getLink() {
            return this.link;
        }

        public final FundsPage getPage() {
            return this.page;
        }
    }

    public /* synthetic */ USRoute(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean Swift_isAllowedFromMicrosite(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native URI Swift_url_0(String className, URI base);

    public static final /* synthetic */ USRoute access$getCombos$cp() {
        return combos;
    }

    public static final /* synthetic */ USRoute access$getProfile$cp() {
        return profile;
    }

    public static final /* synthetic */ USRoute access$getProfileActivity$cp() {
        return profileActivity;
    }

    public static final /* synthetic */ USRoute access$getProfileOrders$cp() {
        return profileOrders;
    }

    public static final /* synthetic */ USRoute access$getProfilePositions$cp() {
        return profilePositions;
    }

    public static final /* synthetic */ USRoute access$getReferralShare$cp() {
        return referralShare;
    }

    public static final /* synthetic */ USRoute access$getRfiVerification$cp() {
        return rfiVerification;
    }

    public static final /* synthetic */ USRoute access$getSquads$cp() {
        return squads;
    }

    public static final /* synthetic */ USRoute access$getSquadsTutorial$cp() {
        return squadsTutorial;
    }

    public static final /* synthetic */ USRoute access$getSupport$cp() {
        return support;
    }

    public static final /* synthetic */ USRoute access$getSystemNotificationSettings$cp() {
        return systemNotificationSettings;
    }

    public static final /* synthetic */ USRoute access$getThreeDSCallback$cp() {
        return threeDSCallback;
    }

    public static /* synthetic */ URI url$default(USRoute uSRoute, URI uri, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                uri = null;
            }
            return uSRoute.url(uri);
        }
        py2.f("Super calls with default arguments not supported in this target, function: url");
        return null;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean isAllowedFromMicrosite() {
        return Swift_isAllowedFromMicrosite(getClass().getName());
    }

    public final URI url(URI base) {
        return Swift_url_0(getClass().getName(), base);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002PQB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001c\u0010)\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010*J$\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010,J\u0017\u00103\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00104\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010-H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00109\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010-H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010>\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010-H\u0082 J\u0015\u0010?\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010K\u001a\u00020\u0001H\u0016J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010N\u001a\u00020\u0019H\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010N\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u001a\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00105\u001a\u0004\u0018\u00010-2\b\u0010\u001a\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00100\"\u0004\b7\u00102R(\u0010:\u001a\u0004\u0018\u00010-2\b\u0010\u001a\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00100\"\u0004\b<\u00102R(\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010AX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006R"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;", "side", "getSide", "()Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;", "setSide", "(Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;)V", "Swift_side", "Swift_side_set", "value", "outcomeIndex", "getOutcomeIndex", "()Ljava/lang/Integer;", "setOutcomeIndex", "(Ljava/lang/Integer;)V", "Swift_outcomeIndex", "(J)Ljava/lang/Integer;", "Swift_outcomeIndex_set", "(JLjava/lang/Integer;)V", "", "conditionId", "getConditionId", "()Ljava/lang/String;", "setConditionId", "(Ljava/lang/String;)V", "Swift_conditionId", "Swift_conditionId_set", "source", "getSource", "setSource", "Swift_source", "Swift_source_set", "eventId", "getEventId", "setEventId", "Swift_eventId", "Swift_eventId_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Side", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RouteQueryEvent implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private RouteQueryEvent(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native String Swift_conditionId(long Swift_peer);

        private final native void Swift_conditionId_set(long Swift_peer, String value);

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_eventId(long Swift_peer);

        private final native void Swift_eventId_set(long Swift_peer, String value);

        private final native Integer Swift_outcomeIndex(long Swift_peer);

        private final native void Swift_outcomeIndex_set(long Swift_peer, Integer value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Side Swift_side(long Swift_peer);

        private final native void Swift_side_set(long Swift_peer, Side value);

        private final native String Swift_source(long Swift_peer);

        private final native void Swift_source_set(long Swift_peer, String value);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
        }

        public boolean equals(Object other) {
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getConditionId() {
            return Swift_conditionId(this.Swift_peer);
        }

        public final String getEventId() {
            return Swift_eventId(this.Swift_peer);
        }

        public final Integer getOutcomeIndex() {
            return Swift_outcomeIndex(this.Swift_peer);
        }

        public final Side getSide() {
            return Swift_side(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final String getSource() {
            return Swift_source(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new RouteQueryEvent(this);
        }

        public final void setConditionId(String str) {
            willmutate();
            try {
                Swift_conditionId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setEventId(String str) {
            willmutate();
            try {
                Swift_eventId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setOutcomeIndex(Integer num) {
            willmutate();
            try {
                Swift_outcomeIndex_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setSide(Side side) {
            willmutate();
            try {
                Swift_side_set(this.Swift_peer, side);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setSource(String str) {
            willmutate();
            try {
                Swift_source_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "buy", "sell", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Side implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Side[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Side buy = new Side("buy", 0, "BUY", null, 2, null);
            public static final Side sell = new Side("sell", 1, "SELL", null, 2, null);
            private final String rawValue;

            private static final /* synthetic */ Side[] $values() {
                return new Side[]{buy, sell};
            }

            static {
                Side[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Side(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Side valueOf(String str) {
                return (Side) Enum.valueOf(Side.class, str);
            }

            public static Side[] values() {
                return (Side[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ String getRawValue() {
                return getRawValue();
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Side init(String rawValue) {
                    rawValue.getClass();
                    if (Intrinsics.areEqual(rawValue, "BUY")) {
                        return Side.buy;
                    }
                    if (Intrinsics.areEqual(rawValue, "SELL")) {
                        return Side.sell;
                    }
                    return null;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private Side(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Companion;", "", "<init>", "()V", "Side", "Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent$Side;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Side Side(String rawValue) {
                rawValue.getClass();
                return Side.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public RouteQueryEvent(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EntryPoint;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "incomingURL", "notificationTap", "actionURL", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EntryPoint implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final EntryPoint incomingURL = new EntryPoint("incomingURL", 0, "incoming_url", null, 2, null);
        public static final EntryPoint notificationTap = new EntryPoint("notificationTap", 1, "notification_tap", null, 2, null);
        public static final EntryPoint actionURL = new EntryPoint("actionURL", 2, "action_url", null, 2, null);

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{incomingURL, notificationTap, actionURL};
        }

        static {
            EntryPoint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ EntryPoint(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EntryPoint$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$EntryPoint;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EntryPoint init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1827640874) {
                    if (hashCode != 1611860559) {
                        if (hashCode == 1852205030 && rawValue.equals("action_url")) {
                            return EntryPoint.actionURL;
                        }
                        return null;
                    }
                    if (rawValue.equals("notification_tap")) {
                        return EntryPoint.notificationTap;
                    }
                    return null;
                }
                if (!rawValue.equals("incoming_url")) {
                    return null;
                }
                return EntryPoint.incomingURL;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private EntryPoint(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EventTab;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chat", "playerProps", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventTab implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ EventTab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventTab chat = new EventTab("chat", 0, "chat", null, 2, null);
        public static final EventTab playerProps = new EventTab("playerProps", 1, "playerProps", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ EventTab[] $values() {
            return new EventTab[]{chat, playerProps};
        }

        static {
            EventTab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ EventTab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static EventTab valueOf(String str) {
            return (EventTab) Enum.valueOf(EventTab.class, str);
        }

        public static EventTab[] values() {
            return (EventTab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$EventTab$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$EventTab;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EventTab init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "chat")) {
                    return EventTab.chat;
                }
                if (Intrinsics.areEqual(rawValue, "playerProps")) {
                    return EventTab.playerProps;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private EventTab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$FundsLink;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "card", PlaceTypes.BANK, "paypal", "venmo", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FundsLink implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FundsLink[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final FundsLink card = new FundsLink("card", 0, "card", null, 2, null);
        public static final FundsLink bank = new FundsLink(PlaceTypes.BANK, 1, PlaceTypes.BANK, null, 2, null);
        public static final FundsLink paypal = new FundsLink("paypal", 2, "paypal", null, 2, null);
        public static final FundsLink venmo = new FundsLink("venmo", 3, "venmo", null, 2, null);

        private static final /* synthetic */ FundsLink[] $values() {
            return new FundsLink[]{card, bank, paypal, venmo};
        }

        static {
            FundsLink[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FundsLink(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FundsLink valueOf(String str) {
            return (FundsLink) Enum.valueOf(FundsLink.class, str);
        }

        public static FundsLink[] values() {
            return (FundsLink[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$FundsLink$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$FundsLink;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FundsLink init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -995205389:
                        if (!rawValue.equals("paypal")) {
                            return null;
                        }
                        return FundsLink.paypal;
                    case 3016252:
                        if (rawValue.equals(PlaceTypes.BANK)) {
                            return FundsLink.bank;
                        }
                        return null;
                    case 3046160:
                        if (rawValue.equals("card")) {
                            return FundsLink.card;
                        }
                        return null;
                    case 112093569:
                        if (rawValue.equals("venmo")) {
                            return FundsLink.venmo;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private FundsLink(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0013B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$FundsPage;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "paymentMethods", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FundsPage implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FundsPage[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FundsPage paymentMethods = new FundsPage("paymentMethods", 0, "payment-methods", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ FundsPage[] $values() {
            return new FundsPage[]{paymentMethods};
        }

        static {
            FundsPage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FundsPage(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FundsPage valueOf(String str) {
            return (FundsPage) Enum.valueOf(FundsPage.class, str);
        }

        public static FundsPage[] values() {
            return (FundsPage[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$FundsPage$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$FundsPage;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FundsPage init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "payment-methods")) {
                    return FundsPage.paymentMethods;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private FundsPage(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0013B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SettingsPage;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "taxDocuments", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SettingsPage implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SettingsPage[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SettingsPage taxDocuments = new SettingsPage("taxDocuments", 0, "tax-documents", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ SettingsPage[] $values() {
            return new SettingsPage[]{taxDocuments};
        }

        static {
            SettingsPage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SettingsPage(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SettingsPage valueOf(String str) {
            return (SettingsPage) Enum.valueOf(SettingsPage.class, str);
        }

        public static SettingsPage[] values() {
            return (SettingsPage[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SettingsPage$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$SettingsPage;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SettingsPage init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "tax-documents")) {
                    return SettingsPage.taxDocuments;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private SettingsPage(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "IdCase", "AbbreviationCase", "Companion", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference$AbbreviationCase;", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference$IdCase;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class SportsTeamReference implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamReference$AbbreviationCase;", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AbbreviationCase extends SportsTeamReference {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AbbreviationCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamReference$IdCase;", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class IdCase extends SportsTeamReference {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IdCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ SportsTeamReference(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamReference$Companion;", "", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "associated0", "", "abbreviation", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SportsTeamReference abbreviation(String associated0) {
                associated0.getClass();
                return new AbbreviationCase(associated0);
            }

            public final SportsTeamReference id(String associated0) {
                associated0.getClass();
                return new IdCase(associated0);
            }

            private Companion() {
            }
        }

        private SportsTeamReference() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chat", "games", "futures", "players", "roster", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SportsTeamTab implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SportsTeamTab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final SportsTeamTab chat = new SportsTeamTab("chat", 0, "chat", null, 2, null);
        public static final SportsTeamTab games = new SportsTeamTab("games", 1, "games", null, 2, null);
        public static final SportsTeamTab futures = new SportsTeamTab("futures", 2, "futures", null, 2, null);
        public static final SportsTeamTab players = new SportsTeamTab("players", 3, "players", null, 2, null);
        public static final SportsTeamTab roster = new SportsTeamTab("roster", 4, "roster", null, 2, null);

        private static final /* synthetic */ SportsTeamTab[] $values() {
            return new SportsTeamTab[]{chat, games, futures, players, roster};
        }

        static {
            SportsTeamTab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SportsTeamTab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SportsTeamTab valueOf(String str) {
            return (SportsTeamTab) Enum.valueOf(SportsTeamTab.class, str);
        }

        public static SportsTeamTab[] values() {
            return (SportsTeamTab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$SportsTeamTab$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SportsTeamTab init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -925192565:
                        if (!rawValue.equals("roster")) {
                            return null;
                        }
                        return SportsTeamTab.roster;
                    case -503567600:
                        if (rawValue.equals("futures")) {
                            return SportsTeamTab.futures;
                        }
                        return null;
                    case -493567566:
                        if (rawValue.equals("players")) {
                            return SportsTeamTab.players;
                        }
                        return null;
                    case 3052376:
                        if (rawValue.equals("chat")) {
                            return SportsTeamTab.chat;
                        }
                        return null;
                    case 98120385:
                        if (rawValue.equals("games")) {
                            return SportsTeamTab.games;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private SportsTeamTab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ(\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tJ*\u0010\u001c\u001a\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J*\u0010#\u001a\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J5\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J0\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010)\u001a\u00020*J\u000e\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\tJ$\u00104\u001a\u00020\u00052\u0006\u00101\u001a\u00020\t2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\b\b\u0002\u00107\u001a\u000208J\u001a\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\tJ\u001a\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\t2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\tJ\u0012\u0010?\u001a\u00020\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\tJ\u000e\u0010E\u001a\u00020\u00052\u0006\u0010=\u001a\u00020'J\"\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020I2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010JJ\u0012\u0010K\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010LJ\u001a\u0010W\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tJ\u000e\u0010X\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010[J\u0015\u0010\\\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010[H\u0082 J\u001a\u0010Y\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010]\u001a\u00020^J\u001d\u0010_\u001a\u0004\u0018\u00010\u00052\b\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010`\u001a\u00020^H\u0082 J\u0010\u0010a\u001a\u0004\u0018\u00010L2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010c\u001a\u0004\u0018\u00010 2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010d\u001a\u0004\u0018\u00010\"2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010f\u001a\u0004\u0018\u00010J2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010g\u001a\u0004\u0018\u00010^2\u0006\u0010b\u001a\u00020\tR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0015R\u0011\u0010A\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0015R\u0011\u0010C\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0015R\u0011\u0010M\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0015R\u0011\u0010O\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0015R\u0011\u0010Q\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0015R\u0011\u0010S\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0015R\u0011\u0010U\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0015¨\u0006h"}, d2 = {"Lcom/polymarket/usdependencies/USRoute$Companion;", "", "<init>", "()V", "home", "Lcom/polymarket/usdependencies/USRoute;", "tab", "Lcom/polymarket/data/EAppTab;", "categorySlug", "", "subtab", "event", "slug", "query", "Lcom/polymarket/usdependencies/USRoute$RouteQueryEvent;", "Lcom/polymarket/usdependencies/USRoute$EventTab;", "userProfileByName", "associated0", "userProfileByWallet", "profile", "getProfile", "()Lcom/polymarket/usdependencies/USRoute;", "profilePositions", "getProfilePositions", "profileOrders", "getProfileOrders", "profileActivity", "getProfileActivity", "deposit", "amount", "Lcom/polymarket/data/EAmount;", "page", "Lcom/polymarket/usdependencies/USRoute$FundsPage;", ActionType.LINK, "Lcom/polymarket/usdependencies/USRoute$FundsLink;", "withdrawal", "eventBuy", "eventSlug", "outcomeIndex", "", "marketSlug", "long", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/polymarket/usdependencies/USRoute;", "orderBook", "marketSideId", "eventSell", "positionId", "waitlistReferral", ApiConstant.KEY_CODE, "referralShare", "getReferralShare", "referral", "utm", "Lcom/polymarket/data/EUTMParameters;", "linkType", "Lcom/polymarket/data/EReferralLinkType;", "squadJoin", "token", "referrer", "squad", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "messageId", "squadInvites", "squadId", "squads", "getSquads", "squadsTutorial", "getSquadsTutorial", "tournament", "sportsTeam", "league", "team", "Lcom/polymarket/usdependencies/USRoute$SportsTeamReference;", "Lcom/polymarket/usdependencies/USRoute$SportsTeamTab;", "settings", "Lcom/polymarket/usdependencies/USRoute$SettingsPage;", "systemNotificationSettings", "getSystemNotificationSettings", "support", "getSupport", "combos", "getCombos", "threeDSCallback", "getThreeDSCallback", "rfiVerification", "getRfiVerification", "microsite", "hub", "parse", "url", "Ljava/net/URI;", "Swift_Companion_parse_1", "reportingUnparsedFrom", "Lcom/polymarket/usdependencies/USRoute$EntryPoint;", "Swift_Companion_parse_2", "entryPoint", "SettingsPage", "rawValue", "FundsPage", "FundsLink", "EventTab", "SportsTeamTab", "EntryPoint", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native USRoute Swift_Companion_parse_1(URI url);

        private final native USRoute Swift_Companion_parse_2(URI url, EntryPoint entryPoint);

        public static /* synthetic */ USRoute deposit$default(Companion companion, EAmount eAmount, FundsPage fundsPage, FundsLink fundsLink, int i, Object obj) {
            if ((i & 1) != 0) {
                eAmount = null;
            }
            if ((i & 2) != 0) {
                fundsPage = null;
            }
            if ((i & 4) != 0) {
                fundsLink = null;
            }
            return companion.deposit(eAmount, fundsPage, fundsLink);
        }

        public static /* synthetic */ USRoute event$default(Companion companion, String str, RouteQueryEvent routeQueryEvent, EventTab eventTab, int i, Object obj) {
            if ((i & 2) != 0) {
                routeQueryEvent = null;
            }
            if ((i & 4) != 0) {
                eventTab = null;
            }
            return companion.event(str, routeQueryEvent, eventTab);
        }

        public static /* synthetic */ USRoute eventBuy$default(Companion companion, String str, Integer num, String str2, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.eventBuy(str, num, str2, z);
        }

        public static /* synthetic */ USRoute home$default(Companion companion, EAppTab eAppTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                eAppTab = EAppTab.home;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.home(eAppTab, str, str2);
        }

        public static /* synthetic */ USRoute microsite$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.microsite(str, str2);
        }

        public static /* synthetic */ USRoute orderBook$default(Companion companion, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.orderBook(str, str2, str3, z);
        }

        public static /* synthetic */ USRoute referral$default(Companion companion, String str, EUTMParameters eUTMParameters, EReferralLinkType eReferralLinkType, int i, Object obj) {
            if ((i & 2) != 0) {
                eUTMParameters = null;
            }
            if ((i & 4) != 0) {
                eReferralLinkType = EReferralLinkType.refer;
            }
            return companion.referral(str, eUTMParameters, eReferralLinkType);
        }

        public static /* synthetic */ USRoute settings$default(Companion companion, SettingsPage settingsPage, int i, Object obj) {
            if ((i & 1) != 0) {
                settingsPage = null;
            }
            return companion.settings(settingsPage);
        }

        public static /* synthetic */ USRoute sportsTeam$default(Companion companion, String str, SportsTeamReference sportsTeamReference, SportsTeamTab sportsTeamTab, int i, Object obj) {
            if ((i & 4) != 0) {
                sportsTeamTab = null;
            }
            return companion.sportsTeam(str, sportsTeamReference, sportsTeamTab);
        }

        public static /* synthetic */ USRoute squad$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.squad(str, str2);
        }

        public static /* synthetic */ USRoute squadInvites$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.squadInvites(str);
        }

        public static /* synthetic */ USRoute squadJoin$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.squadJoin(str, str2);
        }

        public static /* synthetic */ USRoute withdrawal$default(Companion companion, EAmount eAmount, FundsPage fundsPage, FundsLink fundsLink, int i, Object obj) {
            if ((i & 1) != 0) {
                eAmount = null;
            }
            if ((i & 2) != 0) {
                fundsPage = null;
            }
            if ((i & 4) != 0) {
                fundsLink = null;
            }
            return companion.withdrawal(eAmount, fundsPage, fundsLink);
        }

        public final EntryPoint EntryPoint(String rawValue) {
            rawValue.getClass();
            return EntryPoint.INSTANCE.init(rawValue);
        }

        public final EventTab EventTab(String rawValue) {
            rawValue.getClass();
            return EventTab.INSTANCE.init(rawValue);
        }

        public final FundsLink FundsLink(String rawValue) {
            rawValue.getClass();
            return FundsLink.INSTANCE.init(rawValue);
        }

        public final FundsPage FundsPage(String rawValue) {
            rawValue.getClass();
            return FundsPage.INSTANCE.init(rawValue);
        }

        public final SettingsPage SettingsPage(String rawValue) {
            rawValue.getClass();
            return SettingsPage.INSTANCE.init(rawValue);
        }

        public final SportsTeamTab SportsTeamTab(String rawValue) {
            rawValue.getClass();
            return SportsTeamTab.INSTANCE.init(rawValue);
        }

        public final USRoute deposit(EAmount amount, FundsPage page, FundsLink link) {
            return new DepositCase(amount, page, link);
        }

        public final USRoute event(String slug, RouteQueryEvent query, EventTab tab) {
            return new EventCase(slug, query, tab);
        }

        public final USRoute eventBuy(String eventSlug, Integer outcomeIndex, String marketSlug, boolean r4) {
            eventSlug.getClass();
            return new EventBuyCase(eventSlug, outcomeIndex, marketSlug, r4);
        }

        public final USRoute eventSell(String positionId) {
            positionId.getClass();
            return new EventSellCase(positionId);
        }

        public final USRoute getCombos() {
            return USRoute.access$getCombos$cp();
        }

        public final USRoute getProfile() {
            return USRoute.access$getProfile$cp();
        }

        public final USRoute getProfileActivity() {
            return USRoute.access$getProfileActivity$cp();
        }

        public final USRoute getProfileOrders() {
            return USRoute.access$getProfileOrders$cp();
        }

        public final USRoute getProfilePositions() {
            return USRoute.access$getProfilePositions$cp();
        }

        public final USRoute getReferralShare() {
            return USRoute.access$getReferralShare$cp();
        }

        public final USRoute getRfiVerification() {
            return USRoute.access$getRfiVerification$cp();
        }

        public final USRoute getSquads() {
            return USRoute.access$getSquads$cp();
        }

        public final USRoute getSquadsTutorial() {
            return USRoute.access$getSquadsTutorial$cp();
        }

        public final USRoute getSupport() {
            return USRoute.access$getSupport$cp();
        }

        public final USRoute getSystemNotificationSettings() {
            return USRoute.access$getSystemNotificationSettings$cp();
        }

        public final USRoute getThreeDSCallback() {
            return USRoute.access$getThreeDSCallback$cp();
        }

        public final USRoute home(EAppTab tab, String categorySlug, String subtab) {
            tab.getClass();
            return new HomeCase(tab, categorySlug, subtab);
        }

        public final USRoute hub(String slug) {
            slug.getClass();
            return new HubCase(slug);
        }

        public final USRoute microsite(String id, String query) {
            id.getClass();
            return new MicrositeCase(id, query);
        }

        public final USRoute orderBook(String eventSlug, String marketSideId, String marketSlug, boolean r4) {
            eventSlug.getClass();
            return new OrderBookCase(eventSlug, marketSideId, marketSlug, r4);
        }

        public final USRoute parse(URI url, EntryPoint reportingUnparsedFrom) {
            reportingUnparsedFrom.getClass();
            return Swift_Companion_parse_2(url, reportingUnparsedFrom);
        }

        public final USRoute referral(String code, EUTMParameters utm, EReferralLinkType linkType) {
            code.getClass();
            linkType.getClass();
            return new ReferralCase(code, utm, linkType);
        }

        public final USRoute settings(SettingsPage page) {
            return new SettingsCase(page);
        }

        public final USRoute sportsTeam(String league, SportsTeamReference team, SportsTeamTab tab) {
            league.getClass();
            team.getClass();
            return new SportsTeamCase(league, team, tab);
        }

        public final USRoute squad(String id, String messageId) {
            id.getClass();
            return new SquadCase(id, messageId);
        }

        public final USRoute squadInvites(String squadId) {
            return new SquadInvitesCase(squadId);
        }

        public final USRoute squadJoin(String token, String referrer) {
            token.getClass();
            return new SquadJoinCase(token, referrer);
        }

        public final USRoute tournament(int id) {
            return new TournamentCase(id);
        }

        public final USRoute userProfileByName(String associated0) {
            associated0.getClass();
            return new UserProfileByNameCase(associated0);
        }

        public final USRoute userProfileByWallet(String associated0) {
            associated0.getClass();
            return new UserProfileByWalletCase(associated0);
        }

        public final USRoute waitlistReferral(String code) {
            code.getClass();
            return new WaitlistReferralCase(code);
        }

        public final USRoute withdrawal(EAmount amount, FundsPage page, FundsLink link) {
            return new WithdrawalCase(amount, page, link);
        }

        private Companion() {
        }

        public final USRoute parse(URI url) {
            return Swift_Companion_parse_1(url);
        }
    }

    private USRoute() {
    }
}
