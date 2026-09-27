package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.APIMoreTab;
import com.polymarket.data.EError;
import com.polymarket.data.EEvent;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.ETournamentGameUS;
import com.polymarket.data.ETournamentUS;
import com.polymarket.data.OddsFormat;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.MicrositeWebViewModel;
import com.polymarket.usviewmodels.PortfolioSummaryViewModel;
import com.polymarket.usviewmodels.SportsTeamViewModel;
import com.polymarket.usviewmodels.USHomePremadeCombosRailViewModel;
import com.polymarket.usviewmodels.USSportsCategoryViewModel;
import defpackage.qej;
import defpackage.qx7;
import defpackage.unj;
import defpackage.wmj;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u008b\u00012\u00020\u0001:\n\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fH\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010'\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020 H\u0082 J\u001c\u0010.\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 ¢\u0006\u0002\u0010/J$\u00100\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010(H\u0082 ¢\u0006\u0002\u00101J\u0015\u00107\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00108\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J\u0015\u0010;\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010<\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J\u0015\u0010C\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010D\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020=H\u0082 J\u0015\u0010G\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010H\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010P\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010IH\u0082 J\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010V\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020Q0\u000fH\u0082 J\u0015\u0010[\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010`\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J\u0015\u0010b\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010j\u001a\u00020\u0018H\u0016J\u0015\u0010k\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010l\u001a\u00020\u00182\u0006\u0010m\u001a\u00020nJ\u001d\u0010o\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010m\u001a\u00020nH\u0082 J\u000e\u0010p\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010q\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0010\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010t\u001a\u00020QJ\u001f\u0010u\u001a\u0004\u0018\u00010s2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010t\u001a\u00020QH\u0082 J\u001b\u0010y\u001a\b\u0012\u0004\u0012\u00020w0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u000f2\b\u0010|\u001a\u0004\u0018\u00010sJ%\u0010}\u001a\b\u0012\u0004\u0012\u00020{0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010~\u001a\u0004\u0018\u00010sH\u0082 J\u000f\u0010\u007f\u001a\u00020\u00182\u0007\u0010\u0080\u0001\u001a\u00020(J\u001f\u0010\u0081\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0080\u0001\u001a\u00020(H\u0082 J\u001a\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020 H\u0016J\u001b\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00020 H\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R$\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u000e\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00103\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00109\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010>\u001a\u00020=2\u0006\u0010\u000e\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010E\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00104\"\u0004\bF\u00106R(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u000e\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR0\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020Q0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0013\"\u0004\bT\u0010\u0015R\u0011\u0010W\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR$\u0010\\\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u00104\"\u0004\b^\u00106R\u0011\u0010a\u001a\u0002028F¢\u0006\u0006\u001a\u0004\ba\u00104R\u0011\u0010c\u001a\u0002028F¢\u0006\u0006\u001a\u0004\bd\u00104R\u0013\u0010f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020w0\u000f8F¢\u0006\u0006\u001a\u0004\bx\u0010\u0013¨\u0006\u008c\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/USHomeViewModel$Callbacks;", "notificationsFeedVM", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;", "(Lcom/polymarket/usviewmodels/USHomeViewModel$Callbacks;Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;)V", "newValue", "", "Lcom/polymarket/usviewmodels/USHomeCategory;", "availableCategories", "getAvailableCategories", "()Ljava/util/List;", "setAvailableCategories", "(Ljava/util/List;)V", "Swift_availableCategories", "Swift_availableCategories_set", "", "value", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "displayViewModels", "getDisplayViewModels", "setDisplayViewModels", "Swift_displayViewModels", "Swift_displayViewModels_set", "", "selectedCategoryIndex", "getSelectedCategoryIndex", "()I", "setSelectedCategoryIndex", "(I)V", "Swift_selectedCategoryIndex", "Swift_selectedCategoryIndex_set", "", "scrollProgress", "getScrollProgress", "()Ljava/lang/Double;", "setScrollProgress", "(Ljava/lang/Double;)V", "Swift_scrollProgress", "(J)Ljava/lang/Double;", "Swift_scrollProgress_set", "(JLjava/lang/Double;)V", "", "isScrollingProgrammatically", "()Z", "setScrollingProgrammatically", "(Z)V", "Swift_isScrollingProgrammatically", "Swift_isScrollingProgrammatically_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "Lcom/polymarket/data/OddsFormat;", "currentOddsFormat", "getCurrentOddsFormat", "()Lcom/polymarket/data/OddsFormat;", "setCurrentOddsFormat", "(Lcom/polymarket/data/OddsFormat;)V", "Swift_currentOddsFormat", "Swift_currentOddsFormat_set", "isHomeReady", "setHomeReady", "Swift_isHomeReady", "Swift_isHomeReady_set", "Lcom/polymarket/data/EError;", "categoriesError", "getCategoriesError", "()Lcom/polymarket/data/EError;", "setCategoriesError", "(Lcom/polymarket/data/EError;)V", "Swift_categoriesError", "Swift_categoriesError_set", "Lcom/polymarket/data/ETournamentUS;", "tournaments", "getTournaments", "setTournaments", "Swift_tournaments", "Swift_tournaments_set", "depositButtonText", "", "getDepositButtonText", "()Ljava/lang/String;", "Swift_depositButtonText", "hasUnreadNotifications", "getHasUnreadNotifications", "setHasUnreadNotifications", "Swift_hasUnreadNotifications", "Swift_hasUnreadNotifications_set", "isBuildComboFooterEnabled", "Swift_isBuildComboFooterEnabled", "showBuildComboButtonFooter", "getShowBuildComboButtonFooter", "Swift_showBuildComboButtonFooter", "selectedCategory", "getSelectedCategory", "()Lcom/polymarket/usviewmodels/USHomeCategory;", "Swift_selectedCategory", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "Swift_sendInput_2", "setCallbacks", "Swift_setCallbacks_3", "featuredTournamentTab", "Lcom/polymarket/data/APIEventTag;", "tournament", "Swift_featuredTournamentTab_4", "signupWallCandidateEvents", "Lcom/polymarket/data/EEvent;", "getSignupWallCandidateEvents", "Swift_signupWallCandidateEvents", "heroCandidates", "Lcom/polymarket/data/ETournamentGameUS;", "for_", "Swift_heroCandidates_5", "tab", "handleScrollProgress", "newProgress", "Swift_handleScrollProgress_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "DisplayViewModelType", "LoadingConfig", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USHomeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USHomeViewModel(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r0);
        Callbacks callbacks2;
        NotificationsFeedViewModel notificationsFeedViewModel2;
        if ((i & 1) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        } else {
            callbacks2 = callbacks;
        }
        if ((i & 2) != 0) {
            notificationsFeedViewModel2 = null;
        } else {
            notificationsFeedViewModel2 = notificationsFeedViewModel;
        }
    }

    private final native List<USHomeCategory> Swift_availableCategories(long Swift_peer);

    private final native void Swift_availableCategories_set(long Swift_peer, List<? extends USHomeCategory> value);

    private final native EError Swift_categoriesError(long Swift_peer);

    private final native void Swift_categoriesError_set(long Swift_peer, EError value);

    private final native OddsFormat Swift_currentOddsFormat(long Swift_peer);

    private final native void Swift_currentOddsFormat_set(long Swift_peer, OddsFormat value);

    private final native String Swift_depositButtonText(long Swift_peer);

    private final native List<DisplayViewModelType> Swift_displayViewModels(long Swift_peer);

    private final native void Swift_displayViewModels_set(long Swift_peer, List<? extends DisplayViewModelType> value);

    private final native APIEventTag Swift_featuredTournamentTab_4(long Swift_peer, ETournamentUS tournament);

    private final native void Swift_handleScrollProgress_6(long Swift_peer, double newProgress);

    private final native boolean Swift_hasUnreadNotifications(long Swift_peer);

    private final native void Swift_hasUnreadNotifications_set(long Swift_peer, boolean value);

    private final native List<ETournamentGameUS> Swift_heroCandidates_5(long Swift_peer, APIEventTag tab);

    private final native boolean Swift_isBuildComboFooterEnabled(long Swift_peer);

    private final native boolean Swift_isHomeReady(long Swift_peer);

    private final native void Swift_isHomeReady_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isScrollingProgrammatically(long Swift_peer);

    private final native void Swift_isScrollingProgrammatically_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Double Swift_scrollProgress(long Swift_peer);

    private final native void Swift_scrollProgress_set(long Swift_peer, Double value);

    private final native USHomeCategory Swift_selectedCategory(long Swift_peer);

    private final native int Swift_selectedCategoryIndex(long Swift_peer);

    private final native void Swift_selectedCategoryIndex_set(long Swift_peer, int value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_3(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showBuildComboButtonFooter(long Swift_peer);

    private final native List<EEvent> Swift_signupWallCandidateEvents(long Swift_peer);

    private final native List<ETournamentUS> Swift_tournaments(long Swift_peer);

    private final native void Swift_tournaments_set(long Swift_peer, List<ETournamentUS> value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final APIEventTag featuredTournamentTab(ETournamentUS tournament) {
        tournament.getClass();
        return Swift_featuredTournamentTab_4(getSwift_peer(), tournament);
    }

    public final List<USHomeCategory> getAvailableCategories() {
        return Swift_availableCategories(getSwift_peer());
    }

    public final EError getCategoriesError() {
        return Swift_categoriesError(getSwift_peer());
    }

    public final OddsFormat getCurrentOddsFormat() {
        return Swift_currentOddsFormat(getSwift_peer());
    }

    public final String getDepositButtonText() {
        return Swift_depositButtonText(getSwift_peer());
    }

    public final List<DisplayViewModelType> getDisplayViewModels() {
        return Swift_displayViewModels(getSwift_peer());
    }

    public final boolean getHasUnreadNotifications() {
        return Swift_hasUnreadNotifications(getSwift_peer());
    }

    public final Double getScrollProgress() {
        return Swift_scrollProgress(getSwift_peer());
    }

    public final USHomeCategory getSelectedCategory() {
        return Swift_selectedCategory(getSwift_peer());
    }

    public final int getSelectedCategoryIndex() {
        return Swift_selectedCategoryIndex(getSwift_peer());
    }

    public final boolean getShowBuildComboButtonFooter() {
        return Swift_showBuildComboButtonFooter(getSwift_peer());
    }

    public final List<EEvent> getSignupWallCandidateEvents() {
        return Swift_signupWallCandidateEvents(getSwift_peer());
    }

    public final List<ETournamentUS> getTournaments() {
        return Swift_tournaments(getSwift_peer());
    }

    public final void handleScrollProgress(double newProgress) {
        Swift_handleScrollProgress_6(getSwift_peer(), newProgress);
    }

    public final List<ETournamentGameUS> heroCandidates(APIEventTag for_) {
        return Swift_heroCandidates_5(getSwift_peer(), for_);
    }

    public final boolean isBuildComboFooterEnabled() {
        return Swift_isBuildComboFooterEnabled(getSwift_peer());
    }

    public final boolean isHomeReady() {
        return Swift_isHomeReady(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isScrollingProgrammatically() {
        return Swift_isScrollingProgrammatically(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAvailableCategories(List<? extends USHomeCategory> list) {
        list.getClass();
        Swift_availableCategories_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_3(getSwift_peer(), callbacks);
    }

    public final void setCategoriesError(EError eError) {
        Swift_categoriesError_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setCurrentOddsFormat(OddsFormat oddsFormat) {
        oddsFormat.getClass();
        Swift_currentOddsFormat_set(getSwift_peer(), oddsFormat);
    }

    public final void setDisplayViewModels(List<? extends DisplayViewModelType> list) {
        list.getClass();
        Swift_displayViewModels_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setHasUnreadNotifications(boolean z) {
        Swift_hasUnreadNotifications_set(getSwift_peer(), z);
    }

    public final void setHomeReady(boolean z) {
        Swift_isHomeReady_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setScrollProgress(Double d) {
        Swift_scrollProgress_set(getSwift_peer(), d);
    }

    public final void setScrollingProgrammatically(boolean z) {
        Swift_isScrollingProgrammatically_set(getSwift_peer(), z);
    }

    public final void setSelectedCategoryIndex(int i) {
        Swift_selectedCategoryIndex_set(getSwift_peer(), i);
    }

    public final void setTournaments(List<ETournamentUS> list) {
        list.getClass();
        Swift_tournaments_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "Lskip/lib/Identifiable;", "", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "className", "category", "Lcom/polymarket/usviewmodels/USHomeCategory;", "getCategory", "()Lcom/polymarket/usviewmodels/USHomeCategory;", "Swift_category", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "HomeFeedCase", "SportsCategoryListCase", "TagCategoryCase", "MoreComingCase", "Companion", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$HomeFeedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$MoreComingCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$SportsCategoryListCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$TagCategoryCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class DisplayViewModelType implements Identifiable<String>, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$HomeFeedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "associated0", "Lcom/polymarket/usviewmodels/USHomeFeedViewModel;", "<init>", "(Lcom/polymarket/usviewmodels/USHomeFeedViewModel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USHomeFeedViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class HomeFeedCase extends DisplayViewModelType {
            private final USHomeFeedViewModel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeFeedCase(USHomeFeedViewModel uSHomeFeedViewModel) {
                super(null);
                uSHomeFeedViewModel.getClass();
                this.associated0 = uSHomeFeedViewModel;
            }

            public final USHomeFeedViewModel getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$MoreComingCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "associated0", "Lcom/polymarket/usviewmodels/MoreComingViewModel;", "associated1", "Lcom/polymarket/data/APIMoreTab;", "<init>", "(Lcom/polymarket/usviewmodels/MoreComingViewModel;Lcom/polymarket/data/APIMoreTab;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MoreComingViewModel;", "getAssociated1", "()Lcom/polymarket/data/APIMoreTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class MoreComingCase extends DisplayViewModelType {
            private final MoreComingViewModel associated0;
            private final APIMoreTab associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoreComingCase(MoreComingViewModel moreComingViewModel, APIMoreTab aPIMoreTab) {
                super(null);
                moreComingViewModel.getClass();
                aPIMoreTab.getClass();
                this.associated0 = moreComingViewModel;
                this.associated1 = aPIMoreTab;
            }

            public final MoreComingViewModel getAssociated0() {
                return this.associated0;
            }

            public final APIMoreTab getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$SportsCategoryListCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "associated0", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;", "<init>", "(Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class SportsCategoryListCase extends DisplayViewModelType {
            private final USSportsCategoryViewModel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsCategoryListCase(USSportsCategoryViewModel uSSportsCategoryViewModel) {
                super(null);
                uSSportsCategoryViewModel.getClass();
                this.associated0 = uSSportsCategoryViewModel;
            }

            public final USSportsCategoryViewModel getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$TagCategoryCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "associated0", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel;", "<init>", "(Lcom/polymarket/usviewmodels/USTagCategoryViewModel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USTagCategoryViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class TagCategoryCase extends DisplayViewModelType {
            private final USTagCategoryViewModel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TagCategoryCase(USTagCategoryViewModel uSTagCategoryViewModel) {
                super(null);
                uSTagCategoryViewModel.getClass();
                this.associated0 = uSTagCategoryViewModel;
            }

            public final USTagCategoryViewModel getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ DisplayViewModelType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native USHomeCategory Swift_category(String className);

        private final native String Swift_id(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final USHomeCategory getCategory() {
            return Swift_category(getClass().getName());
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType$Companion;", "", "<init>", "()V", "homeFeed", "Lcom/polymarket/usviewmodels/USHomeViewModel$DisplayViewModelType;", "associated0", "Lcom/polymarket/usviewmodels/USHomeFeedViewModel;", "sportsCategoryList", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;", "tagCategory", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel;", "moreComing", "Lcom/polymarket/usviewmodels/MoreComingViewModel;", "associated1", "Lcom/polymarket/data/APIMoreTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DisplayViewModelType homeFeed(USHomeFeedViewModel associated0) {
                associated0.getClass();
                return new HomeFeedCase(associated0);
            }

            public final DisplayViewModelType moreComing(MoreComingViewModel associated0, APIMoreTab associated1) {
                associated0.getClass();
                associated1.getClass();
                return new MoreComingCase(associated0, associated1);
            }

            public final DisplayViewModelType sportsCategoryList(USSportsCategoryViewModel associated0) {
                associated0.getClass();
                return new SportsCategoryListCase(associated0);
            }

            public final DisplayViewModelType tagCategory(USTagCategoryViewModel associated0) {
                associated0.getClass();
                return new TagCategoryCase(associated0);
            }

            private Companion() {
            }
        }

        private DisplayViewModelType() {
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000f!\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnWillAppearCase", "OnWillDisappearCase", "OnCategorySelectedCase", "OnRetryCase", "OnDepositCase", "OnNotificationsCase", "OnHomeTabTappedCase", "OnOpenURLCase", "OnContactSupportCase", "OnTournamentSelectedCase", "OnTeamSelectedCase", "OnDeeplinkCategoryCase", "OnHubDeepLinkCase", "OnBuildComboButtonFooterButtonPressedCase", "Companion", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnBuildComboButtonFooterButtonPressedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnCategorySelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnDeeplinkCategoryCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnHomeTabTappedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnHubDeepLinkCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnNotificationsCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnTeamSelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnTournamentSelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnWillAppearCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnWillDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onWillAppear = new OnWillAppearCase();
        private static final Input onWillDisappear = new OnWillDisappearCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onDeposit = new OnDepositCase();
        private static final Input onNotifications = new OnNotificationsCase();
        private static final Input onHomeTabTapped = new OnHomeTabTappedCase();
        private static final Input onContactSupport = new OnContactSupportCase();
        private static final Input onBuildComboButtonFooterButtonPressed = new OnBuildComboButtonFooterButtonPressedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnBuildComboButtonFooterButtonPressedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuildComboButtonFooterButtonPressedCase extends Input {
            public OnBuildComboButtonFooterButtonPressedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnCategorySelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCategorySelectedCase extends Input {
            private final int associated0;

            public OnCategorySelectedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactSupportCase extends Input {
            public OnContactSupportCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnDeeplinkCategoryCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "slug", "getSlug", "subtab", "getSubtab", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDeeplinkCategoryCase extends Input {
            private final String associated0;
            private final String associated1;
            private final String slug;
            private final String subtab;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDeeplinkCategoryCase(String str, String str2) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.slug = str;
                this.subtab = str2;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getSlug() {
                return this.slug;
            }

            public final String getSubtab() {
                return this.subtab;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDepositCase extends Input {
            public OnDepositCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnHomeTabTappedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHomeTabTappedCase extends Input {
            public OnHomeTabTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnHubDeepLinkCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "hubId", "getHubId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHubDeepLinkCase extends Input {
            private final String associated0;
            private final String hubId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnHubDeepLinkCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.hubId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getHubId() {
                return this.hubId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnNotificationsCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNotificationsCase extends Input {
            public OnNotificationsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenURLCase extends Input {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOpenURLCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnTeamSelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "associated1", "Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "associated2", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "<init>", "(Lcom/polymarket/data/ESportsTeam;Lcom/polymarket/usviewmodels/SportsTeamEntrySource;Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;)V", "getAssociated0", "()Lcom/polymarket/data/ESportsTeam;", "getAssociated1", "()Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "getAssociated2", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTeamSelectedCase extends Input {
            private final ESportsTeam associated0;
            private final SportsTeamEntrySource associated1;
            private final SportsTeamViewModel.Section associated2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTeamSelectedCase(ESportsTeam eSportsTeam, SportsTeamEntrySource sportsTeamEntrySource, SportsTeamViewModel.Section section) {
                super(null);
                eSportsTeam.getClass();
                sportsTeamEntrySource.getClass();
                this.associated0 = eSportsTeam;
                this.associated1 = sportsTeamEntrySource;
                this.associated2 = section;
            }

            public final ESportsTeam getAssociated0() {
                return this.associated0;
            }

            public final SportsTeamEntrySource getAssociated1() {
                return this.associated1;
            }

            public final SportsTeamViewModel.Section getAssociated2() {
                return this.associated2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnTournamentSelectedCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "associated0", "Lcom/polymarket/data/ETournamentUS;", "associated1", "Lcom/polymarket/data/APIEventTag;", "associated2", "Lcom/polymarket/usviewmodels/SportsHubEntrySource;", "<init>", "(Lcom/polymarket/data/ETournamentUS;Lcom/polymarket/data/APIEventTag;Lcom/polymarket/usviewmodels/SportsHubEntrySource;)V", "getAssociated0", "()Lcom/polymarket/data/ETournamentUS;", "getAssociated1", "()Lcom/polymarket/data/APIEventTag;", "getAssociated2", "()Lcom/polymarket/usviewmodels/SportsHubEntrySource;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTournamentSelectedCase extends Input {
            private final ETournamentUS associated0;
            private final APIEventTag associated1;
            private final SportsHubEntrySource associated2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTournamentSelectedCase(ETournamentUS eTournamentUS, APIEventTag aPIEventTag, SportsHubEntrySource sportsHubEntrySource) {
                super(null);
                eTournamentUS.getClass();
                sportsHubEntrySource.getClass();
                this.associated0 = eTournamentUS;
                this.associated1 = aPIEventTag;
                this.associated2 = sportsHubEntrySource;
            }

            public final ETournamentUS getAssociated0() {
                return this.associated0;
            }

            public final APIEventTag getAssociated1() {
                return this.associated1;
            }

            public final SportsHubEntrySource getAssociated2() {
                return this.associated2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnWillAppearCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWillAppearCase extends Input {
            public OnWillAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$OnWillDisappearCase;", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWillDisappearCase extends Input {
            public OnWillDisappearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnBuildComboButtonFooterButtonPressed$cp() {
            return onBuildComboButtonFooterButtonPressed;
        }

        public static final /* synthetic */ Input access$getOnContactSupport$cp() {
            return onContactSupport;
        }

        public static final /* synthetic */ Input access$getOnDeposit$cp() {
            return onDeposit;
        }

        public static final /* synthetic */ Input access$getOnHomeTabTapped$cp() {
            return onHomeTabTapped;
        }

        public static final /* synthetic */ Input access$getOnNotifications$cp() {
            return onNotifications;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnWillAppear$cp() {
            return onWillAppear;
        }

        public static final /* synthetic */ Input access$getOnWillDisappear$cp() {
            return onWillDisappear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0018J \u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 J\"\u0010!\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020#2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010$J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007¨\u0006-"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USHomeViewModel$Input;", "onWillAppear", "getOnWillAppear", "onWillDisappear", "getOnWillDisappear", "onCategorySelected", "associated0", "", "onRetry", "getOnRetry", "onDeposit", "getOnDeposit", "onNotifications", "getOnNotifications", "onHomeTabTapped", "getOnHomeTabTapped", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "getOnContactSupport", "onTournamentSelected", "Lcom/polymarket/data/ETournamentUS;", "associated1", "Lcom/polymarket/data/APIEventTag;", "associated2", "Lcom/polymarket/usviewmodels/SportsHubEntrySource;", "onTeamSelected", "Lcom/polymarket/data/ESportsTeam;", "Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "onDeeplinkCategory", "slug", "", "subtab", "onHubDeepLink", "hubId", "onBuildComboButtonFooterButtonPressed", "getOnBuildComboButtonFooterButtonPressed", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Input onDeeplinkCategory$default(Companion companion, String str, String str2, int i, Object obj) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return companion.onDeeplinkCategory(str, str2);
            }

            public static /* synthetic */ Input onTeamSelected$default(Companion companion, ESportsTeam eSportsTeam, SportsTeamEntrySource sportsTeamEntrySource, SportsTeamViewModel.Section section, int i, Object obj) {
                if ((i & 4) != 0) {
                    section = null;
                }
                return companion.onTeamSelected(eSportsTeam, sportsTeamEntrySource, section);
            }

            public final Input getOnBuildComboButtonFooterButtonPressed() {
                return Input.access$getOnBuildComboButtonFooterButtonPressed$cp();
            }

            public final Input getOnContactSupport() {
                return Input.access$getOnContactSupport$cp();
            }

            public final Input getOnDeposit() {
                return Input.access$getOnDeposit$cp();
            }

            public final Input getOnHomeTabTapped() {
                return Input.access$getOnHomeTabTapped$cp();
            }

            public final Input getOnNotifications() {
                return Input.access$getOnNotifications$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnWillAppear() {
                return Input.access$getOnWillAppear$cp();
            }

            public final Input getOnWillDisappear() {
                return Input.access$getOnWillDisappear$cp();
            }

            public final Input onCategorySelected(int associated0) {
                return new OnCategorySelectedCase(associated0);
            }

            public final Input onDeeplinkCategory(String slug, String subtab) {
                slug.getClass();
                return new OnDeeplinkCategoryCase(slug, subtab);
            }

            public final Input onHubDeepLink(String hubId) {
                hubId.getClass();
                return new OnHubDeepLinkCase(hubId);
            }

            public final Input onOpenURL(URI associated0) {
                associated0.getClass();
                return new OnOpenURLCase(associated0);
            }

            public final Input onTeamSelected(ESportsTeam associated0, SportsTeamEntrySource associated1, SportsTeamViewModel.Section associated2) {
                associated0.getClass();
                associated1.getClass();
                return new OnTeamSelectedCase(associated0, associated1, associated2);
            }

            public final Input onTournamentSelected(ETournamentUS associated0, APIEventTag associated1, SportsHubEntrySource associated2) {
                associated0.getClass();
                associated2.getClass();
                return new OnTournamentSelectedCase(associated0, associated1, associated2);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/USHomeViewModel$Callbacks;", "notificationsFeedVM", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedVM);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel) {
            return companion.Swift_Companion_constructor_0(callbacks, notificationsFeedViewModel);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\r\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$LoadingConfig;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "()V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "Swift_constructor", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LoadingConfig implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public LoadingConfig() {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor();
        }

        private final native long Swift_constructor();

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public LoadingConfig(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USHomeViewModel(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks, notificationsFeedViewModel), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public USHomeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b2\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u0002:\u0001lB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB¥\u0003\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b\u0012\"\b\u0002\u0010!\u001a\u001c\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\"\u0012\"\b\u0002\u0010%\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\r0\"\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u00101J\u0006\u00106\u001a\u00020\rJ\u0015\u00107\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020\fH\u0016J!\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010J\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010R\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010U\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010X\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010^\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010a\u001a\u00020,2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010c\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010e\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010g\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jÿ\u0002\u0010h\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2 \u0010!\u001a\u001c\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\"2 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\r0\"2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020;0\u000f2\u0006\u0010j\u001a\u00020\fH\u0016J\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020;0\u000f2\u0006\u0010j\u001a\u00020\fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010>R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010>R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010AR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\bQ\u0010AR\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bY\u0010>R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b[\u0010>R\u001d\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b]\u0010>R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bb\u0010>R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bd\u0010>R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bf\u0010>¨\u0006m"}, d2 = {"Lcom/polymarket/usviewmodels/USHomeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onSelectedCategoryIndexChanged", "Lkotlin/Function1;", "", "", "onDeposit", "Lkotlin/Function0;", "onReferFriends", "onNotifications", "onNavigateToProfile", "onNavigateToLive", "onOpenURL", "Ljava/net/URI;", "onOpenMicrosite", "Lcom/polymarket/usviewmodels/MicrositeWebViewModel$Config;", "onContactSupport", "onCategorySelectionHaptic", "positionsSummaryCallbacks", "Lcom/polymarket/usviewmodels/PortfolioSummaryViewModel$Callbacks;", "sportsCategoryCallbacks", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;", "onCategorySelected", "Lcom/polymarket/data/APIEventTag;", "onBuildCombosCategorySelected", "onTournamentSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/ETournamentUS;", "Lcom/polymarket/usviewmodels/SportsHubEntrySource;", "onTeamSelected", "Lcom/polymarket/data/ESportsTeam;", "Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "onCarouselEventSelected", "Lcom/polymarket/data/EEvent;", "premadeCombosCallbacks", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "onHubSelected", "", "onHubEntryAppeared", "onHubDeepLinkResolved", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/polymarket/usviewmodels/PortfolioSummaryViewModel$Callbacks;Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "getOnSelectedCategoryIndexChanged", "()Lkotlin/jvm/functions/Function1;", "Swift_onSelectedCategoryIndexChanged", "getOnDeposit", "()Lkotlin/jvm/functions/Function0;", "Swift_onDeposit", "getOnReferFriends", "Swift_onReferFriends", "getOnNotifications", "Swift_onNotifications", "getOnNavigateToProfile", "Swift_onNavigateToProfile", "getOnNavigateToLive", "Swift_onNavigateToLive", "getOnOpenURL", "Swift_onOpenURL", "getOnOpenMicrosite", "Swift_onOpenMicrosite", "getOnContactSupport", "Swift_onContactSupport", "getOnCategorySelectionHaptic", "Swift_onCategorySelectionHaptic", "getPositionsSummaryCallbacks", "()Lcom/polymarket/usviewmodels/PortfolioSummaryViewModel$Callbacks;", "Swift_positionsSummaryCallbacks", "getSportsCategoryCallbacks", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;", "Swift_sportsCategoryCallbacks", "getOnCategorySelected", "Swift_onCategorySelected", "getOnBuildCombosCategorySelected", "Swift_onBuildCombosCategorySelected", "getOnCarouselEventSelected", "Swift_onCarouselEventSelected", "getPremadeCombosCallbacks", "()Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "Swift_premadeCombosCallbacks", "getOnHubSelected", "Swift_onHubSelected", "getOnHubEntryAppeared", "Swift_onHubEntryAppeared", "getOnHubDeepLinkResolved", "Swift_onHubDeepLinkResolved", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function12, Function1 function13, Function0 function06, Function0 function07, PortfolioSummaryViewModel.Callbacks callbacks, USSportsCategoryViewModel.Callbacks callbacks2, Function1 function14, Function1 function15, Function3 function3, Function3 function32, Function1 function16, USHomePremadeCombosRailViewModel.Callbacks callbacks3, Function1 function17, Function1 function18, Function1 function19, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r21, r43, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r22, r23, r24, r40, r2, r42);
            Function1 function110;
            Function0 function08;
            Function0 function09;
            Function0 function010;
            Function0 function011;
            Function0 function012;
            Function1 function111;
            Function1 function112;
            Function0 function013;
            Function0 function014;
            PortfolioSummaryViewModel.Callbacks callbacks4;
            USSportsCategoryViewModel.Callbacks callbacks5;
            Function1 function113;
            Function1 function114;
            Function3 function33;
            Function1 function115;
            Function3 function34;
            Function3 function35;
            Function1 function116;
            Function1 function117;
            Function0 function015;
            USHomePremadeCombosRailViewModel.Callbacks callbacks6;
            Function1 function118;
            USHomePremadeCombosRailViewModel.Callbacks callbacks7;
            Function1 function119;
            Function1 function120;
            Function1 function121;
            if ((i & 1) != 0) {
                function110 = new wmj(2);
            } else {
                function110 = function1;
            }
            if ((i & 2) != 0) {
                function08 = new qej(28);
            } else {
                function08 = function0;
            }
            if ((i & 4) != 0) {
                function09 = new qej(22);
            } else {
                function09 = function02;
            }
            if ((i & 8) != 0) {
                function010 = new qej(23);
            } else {
                function010 = function03;
            }
            if ((i & 16) != 0) {
                function011 = new qej(24);
            } else {
                function011 = function04;
            }
            if ((i & 32) != 0) {
                function012 = new qej(25);
            } else {
                function012 = function05;
            }
            if ((i & 64) != 0) {
                function111 = new wmj(3);
            } else {
                function111 = function12;
            }
            if ((i & 128) != 0) {
                function112 = new wmj(4);
            } else {
                function112 = function13;
            }
            if ((i & 256) != 0) {
                function013 = new qej(26);
            } else {
                function013 = function06;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function014 = new qej(27);
            } else {
                function014 = function07;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                callbacks4 = new PortfolioSummaryViewModel.Callbacks(null, null, null, null, 15, null);
            } else {
                callbacks4 = callbacks;
            }
            if ((i & 2048) != 0) {
                callbacks5 = new USSportsCategoryViewModel.Callbacks(null, null, null, null, null, 31, null);
            } else {
                callbacks5 = callbacks2;
            }
            if ((i & 4096) != 0) {
                function113 = new wmj(5);
            } else {
                function113 = function14;
            }
            if ((i & 8192) != 0) {
                function114 = new wmj(6);
            } else {
                function114 = function15;
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                function33 = new qx7(29);
            } else {
                function33 = function3;
            }
            if ((i & 32768) != 0) {
                function115 = function110;
                function34 = new unj(0);
            } else {
                function115 = function110;
                function34 = function32;
            }
            if ((i & 65536) != 0) {
                function35 = function34;
                function116 = new wmj(7);
            } else {
                function35 = function34;
                function116 = function16;
            }
            if ((i & 131072) != 0) {
                function117 = function116;
                function015 = function08;
                callbacks6 = new USHomePremadeCombosRailViewModel.Callbacks(null, null, 3, null);
            } else {
                function117 = function116;
                function015 = function08;
                callbacks6 = callbacks3;
            }
            if ((i & 262144) != 0) {
                function118 = new wmj(8);
            } else {
                function118 = function17;
            }
            if ((i & 524288) != 0) {
                callbacks7 = callbacks6;
                function119 = new wmj(9);
            } else {
                callbacks7 = callbacks6;
                function119 = function18;
            }
            if ((i & 1048576) != 0) {
                function121 = function118;
                function120 = new wmj(10);
            } else {
                function120 = function19;
                function121 = function118;
            }
        }

        private final native long Swift_constructor_0(Function1<? super Integer, Unit> onSelectedCategoryIndexChanged, Function0<Unit> onDeposit, Function0<Unit> onReferFriends, Function0<Unit> onNotifications, Function0<Unit> onNavigateToProfile, Function0<Unit> onNavigateToLive, Function1<? super URI, Unit> onOpenURL, Function1<? super MicrositeWebViewModel.Config, Unit> onOpenMicrosite, Function0<Unit> onContactSupport, Function0<Unit> onCategorySelectionHaptic, PortfolioSummaryViewModel.Callbacks positionsSummaryCallbacks, USSportsCategoryViewModel.Callbacks sportsCategoryCallbacks, Function1<? super APIEventTag, Unit> onCategorySelected, Function1<? super APIEventTag, Unit> onBuildCombosCategorySelected, Function3<? super ETournamentUS, ? super APIEventTag, ? super SportsHubEntrySource, Unit> onTournamentSelected, Function3<? super ESportsTeam, ? super SportsTeamEntrySource, ? super SportsTeamViewModel.Section, Unit> onTeamSelected, Function1<? super EEvent, Unit> onCarouselEventSelected, USHomePremadeCombosRailViewModel.Callbacks premadeCombosCallbacks, Function1<? super String, Unit> onHubSelected, Function1<? super String, Unit> onHubEntryAppeared, Function1<? super String, Unit> onHubDeepLinkResolved);

        private final native Function1<APIEventTag, Unit> Swift_onBuildCombosCategorySelected(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onCarouselEventSelected(long Swift_peer);

        private final native Function1<APIEventTag, Unit> Swift_onCategorySelected(long Swift_peer);

        private final native Function0<Unit> Swift_onCategorySelectionHaptic(long Swift_peer);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function0<Unit> Swift_onDeposit(long Swift_peer);

        private final native Function1<String, Unit> Swift_onHubDeepLinkResolved(long Swift_peer);

        private final native Function1<String, Unit> Swift_onHubEntryAppeared(long Swift_peer);

        private final native Function1<String, Unit> Swift_onHubSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onNavigateToLive(long Swift_peer);

        private final native Function0<Unit> Swift_onNavigateToProfile(long Swift_peer);

        private final native Function0<Unit> Swift_onNotifications(long Swift_peer);

        private final native Function1<MicrositeWebViewModel.Config, Unit> Swift_onOpenMicrosite(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function0<Unit> Swift_onReferFriends(long Swift_peer);

        private final native Function1<Integer, Unit> Swift_onSelectedCategoryIndexChanged(long Swift_peer);

        private final native PortfolioSummaryViewModel.Callbacks Swift_positionsSummaryCallbacks(long Swift_peer);

        private final native USHomePremadeCombosRailViewModel.Callbacks Swift_premadeCombosCallbacks(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native USSportsCategoryViewModel.Callbacks Swift_sportsCategoryCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0(int i) {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10(APIEventTag aPIEventTag) {
            aPIEventTag.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$11(APIEventTag aPIEventTag) {
            aPIEventTag.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$12(ETournamentUS eTournamentUS, APIEventTag aPIEventTag, SportsHubEntrySource sportsHubEntrySource) {
            eTournamentUS.getClass();
            sportsHubEntrySource.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$13(ESportsTeam eSportsTeam, SportsTeamEntrySource sportsTeamEntrySource, SportsTeamViewModel.Section section) {
            eSportsTeam.getClass();
            sportsTeamEntrySource.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$14(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$15(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$16(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$17(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(MicrositeWebViewModel.Config config) {
            config.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$8();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit c(URI uri) {
            return _init_$lambda$6(uri);
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit e(APIEventTag aPIEventTag) {
            return _init_$lambda$11(aPIEventTag);
        }

        public static /* synthetic */ Unit f(APIEventTag aPIEventTag) {
            return _init_$lambda$10(aPIEventTag);
        }

        public static /* synthetic */ Unit g(String str) {
            return _init_$lambda$15(str);
        }

        public static /* synthetic */ Unit h(String str) {
            return _init_$lambda$17(str);
        }

        public static /* synthetic */ Unit i(EEvent eEvent) {
            return _init_$lambda$14(eEvent);
        }

        public static /* synthetic */ Unit j(String str) {
            return _init_$lambda$16(str);
        }

        public static /* synthetic */ Unit k() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit l(MicrositeWebViewModel.Config config) {
            return _init_$lambda$7(config);
        }

        public static /* synthetic */ Unit m() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit n() {
            return _init_$lambda$9();
        }

        public static /* synthetic */ Unit o(ESportsTeam eSportsTeam, SportsTeamEntrySource sportsTeamEntrySource, SportsTeamViewModel.Section section) {
            return _init_$lambda$13(eSportsTeam, sportsTeamEntrySource, section);
        }

        public static /* synthetic */ Unit p(int i) {
            return _init_$lambda$0(i);
        }

        public static /* synthetic */ Unit q() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit r(ETournamentUS eTournamentUS, APIEventTag aPIEventTag, SportsHubEntrySource sportsHubEntrySource) {
            return _init_$lambda$12(eTournamentUS, aPIEventTag, sportsHubEntrySource);
        }

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
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

        public final Function1<APIEventTag, Unit> getOnBuildCombosCategorySelected() {
            return Swift_onBuildCombosCategorySelected(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnCarouselEventSelected() {
            return Swift_onCarouselEventSelected(this.Swift_peer);
        }

        public final Function1<APIEventTag, Unit> getOnCategorySelected() {
            return Swift_onCategorySelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnCategorySelectionHaptic() {
            return Swift_onCategorySelectionHaptic(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function0<Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnHubDeepLinkResolved() {
            return Swift_onHubDeepLinkResolved(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnHubEntryAppeared() {
            return Swift_onHubEntryAppeared(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnHubSelected() {
            return Swift_onHubSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnNavigateToLive() {
            return Swift_onNavigateToLive(this.Swift_peer);
        }

        public final Function0<Unit> getOnNavigateToProfile() {
            return Swift_onNavigateToProfile(this.Swift_peer);
        }

        public final Function0<Unit> getOnNotifications() {
            return Swift_onNotifications(this.Swift_peer);
        }

        public final Function1<MicrositeWebViewModel.Config, Unit> getOnOpenMicrosite() {
            return Swift_onOpenMicrosite(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
        }

        public final Function0<Unit> getOnReferFriends() {
            return Swift_onReferFriends(this.Swift_peer);
        }

        public final Function1<Integer, Unit> getOnSelectedCategoryIndexChanged() {
            return Swift_onSelectedCategoryIndexChanged(this.Swift_peer);
        }

        public final PortfolioSummaryViewModel.Callbacks getPositionsSummaryCallbacks() {
            return Swift_positionsSummaryCallbacks(this.Swift_peer);
        }

        public final USHomePremadeCombosRailViewModel.Callbacks getPremadeCombosCallbacks() {
            return Swift_premadeCombosCallbacks(this.Swift_peer);
        }

        public final USSportsCategoryViewModel.Callbacks getSportsCategoryCallbacks() {
            return Swift_sportsCategoryCallbacks(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function1<? super Integer, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function1<? super URI, Unit> function12, Function1<? super MicrositeWebViewModel.Config, Unit> function13, Function0<Unit> function06, Function0<Unit> function07, PortfolioSummaryViewModel.Callbacks callbacks, USSportsCategoryViewModel.Callbacks callbacks2, Function1<? super APIEventTag, Unit> function14, Function1<? super APIEventTag, Unit> function15, Function3<? super ETournamentUS, ? super APIEventTag, ? super SportsHubEntrySource, Unit> function3, Function3<? super ESportsTeam, ? super SportsTeamEntrySource, ? super SportsTeamViewModel.Section, Unit> function32, Function1<? super EEvent, Unit> function16, USHomePremadeCombosRailViewModel.Callbacks callbacks3, Function1<? super String, Unit> function17, Function1<? super String, Unit> function18, Function1<? super String, Unit> function19) {
            function1.getClass();
            function0.getClass();
            function02.getClass();
            function03.getClass();
            function04.getClass();
            function05.getClass();
            function12.getClass();
            function13.getClass();
            function06.getClass();
            function07.getClass();
            callbacks.getClass();
            callbacks2.getClass();
            function14.getClass();
            function15.getClass();
            function3.getClass();
            function32.getClass();
            function16.getClass();
            callbacks3.getClass();
            function17.getClass();
            function18.getClass();
            function19.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0, function02, function03, function04, function05, function12, function13, function06, function07, callbacks, callbacks2, function14, function15, function3, function32, function16, callbacks3, function17, function18, function19);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
