package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.ESportsTeam;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.SportsTeamSettingsViewModel;
import com.polymarket.usviewmodels.USChatViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 w2\u00020\u0001:\u0005stuvwB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0011\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0015\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%J#\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020%H\u0082 J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020%J\u001d\u0010)\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020%H\u0082 J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\u001d\u0010+\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020%H\u0082 J\u0010\u0010,\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010-\u001a\u0004\u0018\u00010#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0015\u00102\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u0001092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010?\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u00020N2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020N0\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010V\u001a\u00020\f2\u0006\u0010W\u001a\u00020NJ\u001d\u0010X\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010W\u001a\u00020NH\u0082 J\u001b\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010`\u001a\u00020Z2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020ZJ\u001d\u0010c\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010b\u001a\u00020ZH\u0082 J\u0010\u0010d\u001a\u0004\u0018\u00010%2\u0006\u0010b\u001a\u00020ZJ\u001f\u0010e\u001a\u0004\u0018\u00010%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010b\u001a\u00020ZH\u0082 J\b\u0010f\u001a\u00020gH\u0016J\u0015\u0010h\u001a\u00020g2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010i\u001a\u00020g2\u0006\u0010j\u001a\u00020kJ\u001d\u0010l\u001a\u00020g2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010j\u001a\u00020kH\u0082 J\u0016\u0010m\u001a\b\u0012\u0004\u0012\u00020o0n2\u0006\u0010p\u001a\u00020qH\u0016J\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n2\u0006\u0010p\u001a\u00020qH\u0082 R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u0010\u0014R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010E\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\u0010R\u0013\u0010H\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020N0\"8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\"8F¢\u0006\u0006\u001a\u0004\b[\u0010TR\u0011\u0010]\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006x"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "teamId", "getTeamId", "()Ljava/lang/String;", "Swift_teamId", "isFavorited", "", "()Z", "Swift_isFavorited", "selectedAppIconName", "getSelectedAppIconName", "Swift_selectedAppIconName", "hasSetTeamAppIconFromBanner", "getHasSetTeamAppIconFromBanner", "Swift_hasSetTeamAppIconFromBanner", "appIconBannerPresentation", "Lcom/polymarket/usviewmodels/SportsTeamAppIconBannerPresentation;", "getAppIconBannerPresentation", "()Lcom/polymarket/usviewmodels/SportsTeamAppIconBannerPresentation;", "Swift_appIconBannerPresentation", "eventVMs", "", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "for_", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "Swift_eventVMs_1", "tab", "didLoad", "Swift_didLoad_2", "showsEmptyState", "Swift_showsEmptyState_3", "eventViewModel", "Swift_eventViewModel_4", "heroPresentation", "Lcom/polymarket/usviewmodels/SportsTeamHeroPresentation;", "getHeroPresentation", "()Lcom/polymarket/usviewmodels/SportsTeamHeroPresentation;", "Swift_heroPresentation", "headerPresentation", "Lcom/polymarket/usviewmodels/SportsTeamHeaderPresentation;", "getHeaderPresentation", "()Lcom/polymarket/usviewmodels/SportsTeamHeaderPresentation;", "Swift_headerPresentation", "chatVM", "Lcom/polymarket/usviewmodels/USChatViewModel;", "getChatVM", "()Lcom/polymarket/usviewmodels/USChatViewModel;", "Swift_chatVM", "supportsChat", "getSupportsChat", "Swift_supportsChat", "shareURL", "Ljava/net/URI;", "getShareURL", "()Ljava/net/URI;", "Swift_shareURL", "inviteRewardBadge", "getInviteRewardBadge", "Swift_inviteRewardBadge", "rosterPresentation", "Lcom/polymarket/usviewmodels/SportsTeamRosterPresentation;", "getRosterPresentation", "()Lcom/polymarket/usviewmodels/SportsTeamRosterPresentation;", "Swift_rosterPresentation", "selectedRosterSeason", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "getSelectedRosterSeason", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "Swift_selectedRosterSeason", "rosterSeasons", "getRosterSeasons", "()Ljava/util/List;", "Swift_rosterSeasons", "rosterSeasonTitle", "season", "Swift_rosterSeasonTitle_5", "sections", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "getSections", "Swift_sections", "initialSection", "getInitialSection", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "Swift_initialSection", "tabTitle", "section", "Swift_tabTitle_6", "eventsTab", "Swift_eventsTab_7", "setup", "", "Swift_setup_10", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "Swift_sendInput_11", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "EventsTab", "Section", "RosterSeason", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SportsTeamViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ SportsTeamViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native SportsTeamAppIconBannerPresentation Swift_appIconBannerPresentation(long Swift_peer);

    private final native USChatViewModel Swift_chatVM(long Swift_peer);

    private final native boolean Swift_didLoad_2(long Swift_peer, EventsTab tab);

    private final native List<USEventCardViewModel> Swift_eventVMs_1(long Swift_peer, EventsTab tab);

    private final native USEventCardViewModel Swift_eventViewModel_4(long Swift_peer, String id);

    private final native EventsTab Swift_eventsTab_7(long Swift_peer, Section section);

    private final native boolean Swift_hasSetTeamAppIconFromBanner(long Swift_peer);

    private final native SportsTeamHeaderPresentation Swift_headerPresentation(long Swift_peer);

    private final native SportsTeamHeroPresentation Swift_heroPresentation(long Swift_peer);

    private final native Section Swift_initialSection(long Swift_peer);

    private final native String Swift_inviteRewardBadge(long Swift_peer);

    private final native boolean Swift_isFavorited(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native SportsTeamRosterPresentation Swift_rosterPresentation(long Swift_peer);

    private final native String Swift_rosterSeasonTitle_5(long Swift_peer, RosterSeason season);

    private final native List<RosterSeason> Swift_rosterSeasons(long Swift_peer);

    private final native List<Section> Swift_sections(long Swift_peer);

    private final native String Swift_selectedAppIconName(long Swift_peer);

    private final native RosterSeason Swift_selectedRosterSeason(long Swift_peer);

    private final native void Swift_sendInput_11(long Swift_peer, Input input);

    private final native void Swift_setup_10(long Swift_peer);

    private final native URI Swift_shareURL(long Swift_peer);

    private final native boolean Swift_showsEmptyState_3(long Swift_peer, EventsTab tab);

    private final native boolean Swift_supportsChat(long Swift_peer);

    private final native String Swift_tabTitle_6(long Swift_peer, Section section);

    private final native String Swift_teamId(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean didLoad(EventsTab tab) {
        tab.getClass();
        return Swift_didLoad_2(getSwift_peer(), tab);
    }

    public final List<USEventCardViewModel> eventVMs(EventsTab for_) {
        for_.getClass();
        return Swift_eventVMs_1(getSwift_peer(), for_);
    }

    public final USEventCardViewModel eventViewModel(String id) {
        id.getClass();
        return Swift_eventViewModel_4(getSwift_peer(), id);
    }

    public final EventsTab eventsTab(Section section) {
        section.getClass();
        return Swift_eventsTab_7(getSwift_peer(), section);
    }

    public final SportsTeamAppIconBannerPresentation getAppIconBannerPresentation() {
        return Swift_appIconBannerPresentation(getSwift_peer());
    }

    public final USChatViewModel getChatVM() {
        return Swift_chatVM(getSwift_peer());
    }

    public final boolean getHasSetTeamAppIconFromBanner() {
        return Swift_hasSetTeamAppIconFromBanner(getSwift_peer());
    }

    public final SportsTeamHeaderPresentation getHeaderPresentation() {
        return Swift_headerPresentation(getSwift_peer());
    }

    public final SportsTeamHeroPresentation getHeroPresentation() {
        return Swift_heroPresentation(getSwift_peer());
    }

    public final Section getInitialSection() {
        return Swift_initialSection(getSwift_peer());
    }

    public final String getInviteRewardBadge() {
        return Swift_inviteRewardBadge(getSwift_peer());
    }

    public final SportsTeamRosterPresentation getRosterPresentation() {
        return Swift_rosterPresentation(getSwift_peer());
    }

    public final List<RosterSeason> getRosterSeasons() {
        return Swift_rosterSeasons(getSwift_peer());
    }

    public final List<Section> getSections() {
        return Swift_sections(getSwift_peer());
    }

    public final String getSelectedAppIconName() {
        return Swift_selectedAppIconName(getSwift_peer());
    }

    public final RosterSeason getSelectedRosterSeason() {
        return Swift_selectedRosterSeason(getSwift_peer());
    }

    public final URI getShareURL() {
        return Swift_shareURL(getSwift_peer());
    }

    public final boolean getSupportsChat() {
        return Swift_supportsChat(getSwift_peer());
    }

    public final String getTeamId() {
        return Swift_teamId(getSwift_peer());
    }

    public final boolean isFavorited() {
        return Swift_isFavorited(getSwift_peer());
    }

    public final String rosterSeasonTitle(RosterSeason season) {
        season.getClass();
        return Swift_rosterSeasonTitle_5(getSwift_peer(), season);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_11(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_10(getSwift_peer());
    }

    public final boolean showsEmptyState(EventsTab for_) {
        for_.getClass();
        return Swift_showsEmptyState_3(getSwift_peer(), for_);
    }

    public final String tabTitle(Section section) {
        section.getClass();
        return Swift_tabTitle_6(getSwift_peer(), section);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "games", "futures", "players", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class EventsTab implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ EventsTab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final EventsTab games = new EventsTab("games", 0, "games", null, 2, null);
        public static final EventsTab futures = new EventsTab("futures", 1, "futures", null, 2, null);
        public static final EventsTab players = new EventsTab("players", 2, "players", null, 2, null);

        private static final /* synthetic */ EventsTab[] $values() {
            return new EventsTab[]{games, futures, players};
        }

        static {
            EventsTab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ EventsTab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static EventsTab valueOf(String str) {
            return (EventsTab) Enum.valueOf(EventsTab.class, str);
        }

        public static EventsTab[] values() {
            return (EventsTab[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<EventsTab> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<EventsTab> getAllCases() {
                return ArrayKt.arrayOf(EventsTab.games, EventsTab.futures, EventsTab.players);
            }

            public final EventsTab init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -503567600) {
                    if (hashCode != -493567566) {
                        if (hashCode == 98120385 && rawValue.equals("games")) {
                            return EventsTab.games;
                        }
                        return null;
                    }
                    if (rawValue.equals("players")) {
                        return EventsTab.players;
                    }
                    return null;
                }
                if (!rawValue.equals("futures")) {
                    return null;
                }
                return EventsTab.futures;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private EventsTab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001f2\u00020\u0001:\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000e !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnViewWillAppearCase", "OnViewDidAppearCase", "OnViewWillDisappearCase", "OnViewDidDisappearCase", "OnTabSelectedCase", "OnToggleFavoriteCase", "OnOpenSettingsCase", "OnInviteFriendsCase", "OnSetTeamAppIconCase", "OnEventsNearBottomCase", "OnEventsRefreshRequestedCase", "OnEventSelectedCase", "OnRosterSeasonSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventsNearBottomCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventsRefreshRequestedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnRosterSeasonSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnSetTeamAppIconCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnTabSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnToggleFavoriteCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidDisappearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewWillAppearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewWillDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onViewWillAppear = new OnViewWillAppearCase();
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onViewWillDisappear = new OnViewWillDisappearCase();
        private static final Input onViewDidDisappear = new OnViewDidDisappearCase();
        private static final Input onToggleFavorite = new OnToggleFavoriteCase();
        private static final Input onOpenSettings = new OnOpenSettingsCase();
        private static final Input onInviteFriends = new OnInviteFriendsCase();
        private static final Input onSetTeamAppIcon = new OnSetTeamAppIconCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventsNearBottomCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "<init>", "(Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventsNearBottomCase extends Input {
            private final EventsTab associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventsNearBottomCase(EventsTab eventsTab) {
                super(null);
                eventsTab.getClass();
                this.associated0 = eventsTab;
            }

            public final EventsTab getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnEventsRefreshRequestedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "<init>", "(Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventsRefreshRequestedCase extends Input {
            private final EventsTab associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventsRefreshRequestedCase(EventsTab eventsTab) {
                super(null);
                eventsTab.getClass();
                this.associated0 = eventsTab;
            }

            public final EventsTab getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteFriendsCase extends Input {
            public OnInviteFriendsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenSettingsCase extends Input {
            public OnOpenSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnRosterSeasonSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "<init>", "(Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRosterSeasonSelectedCase extends Input {
            private final RosterSeason associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRosterSeasonSelectedCase(RosterSeason rosterSeason) {
                super(null);
                rosterSeason.getClass();
                this.associated0 = rosterSeason;
            }

            public final RosterSeason getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnSetTeamAppIconCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetTeamAppIconCase extends Input {
            public OnSetTeamAppIconCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnTabSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "<init>", "(Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTabSelectedCase extends Input {
            private final Section associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTabSelectedCase(Section section) {
                super(null);
                section.getClass();
                this.associated0 = section;
            }

            public final Section getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnToggleFavoriteCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleFavoriteCase extends Input {
            public OnToggleFavoriteCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidDisappearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidDisappearCase extends Input {
            public OnViewDidDisappearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewWillAppearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillAppearCase extends Input {
            public OnViewWillAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$OnViewWillDisappearCase;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillDisappearCase extends Input {
            public OnViewWillDisappearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnInviteFriends$cp() {
            return onInviteFriends;
        }

        public static final /* synthetic */ Input access$getOnOpenSettings$cp() {
            return onOpenSettings;
        }

        public static final /* synthetic */ Input access$getOnSetTeamAppIcon$cp() {
            return onSetTeamAppIcon;
        }

        public static final /* synthetic */ Input access$getOnToggleFavorite$cp() {
            return onToggleFavorite;
        }

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        public static final /* synthetic */ Input access$getOnViewDidDisappear$cp() {
            return onViewDidDisappear;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnViewWillAppear$cp() {
            return onViewWillAppear;
        }

        public static final /* synthetic */ Input access$getOnViewWillDisappear$cp() {
            return onViewWillDisappear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/SportsTeamViewModel$Input;", "onViewWillAppear", "getOnViewWillAppear", "onViewDidAppear", "getOnViewDidAppear", "onViewWillDisappear", "getOnViewWillDisappear", "onViewDidDisappear", "getOnViewDidDisappear", "onTabSelected", "associated0", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "onToggleFavorite", "getOnToggleFavorite", "onOpenSettings", "getOnOpenSettings", "onInviteFriends", "getOnInviteFriends", "onSetTeamAppIcon", "getOnSetTeamAppIcon", "onEventsNearBottom", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "onEventsRefreshRequested", "onEventSelected", "", "onRosterSeasonSelected", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnInviteFriends() {
                return Input.access$getOnInviteFriends$cp();
            }

            public final Input getOnOpenSettings() {
                return Input.access$getOnOpenSettings$cp();
            }

            public final Input getOnSetTeamAppIcon() {
                return Input.access$getOnSetTeamAppIcon$cp();
            }

            public final Input getOnToggleFavorite() {
                return Input.access$getOnToggleFavorite$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input getOnViewDidDisappear() {
                return Input.access$getOnViewDidDisappear$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnViewWillAppear() {
                return Input.access$getOnViewWillAppear$cp();
            }

            public final Input getOnViewWillDisappear() {
                return Input.access$getOnViewWillDisappear$cp();
            }

            public final Input onEventSelected(String associated0) {
                associated0.getClass();
                return new OnEventSelectedCase(associated0);
            }

            public final Input onEventsNearBottom(EventsTab associated0) {
                associated0.getClass();
                return new OnEventsNearBottomCase(associated0);
            }

            public final Input onEventsRefreshRequested(EventsTab associated0) {
                associated0.getClass();
                return new OnEventsRefreshRequestedCase(associated0);
            }

            public final Input onRosterSeasonSelected(RosterSeason associated0) {
                associated0.getClass();
                return new OnRosterSeasonSelectedCase(associated0);
            }

            public final Input onTabSelected(Section associated0) {
                associated0.getClass();
                return new OnTabSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "preseason", "regular", "postseason", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RosterSeason implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RosterSeason[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final RosterSeason preseason = new RosterSeason("preseason", 0, "PRE", null, 2, null);
        public static final RosterSeason regular = new RosterSeason("regular", 1, "REG", null, 2, null);
        public static final RosterSeason postseason = new RosterSeason("postseason", 2, "PST", null, 2, null);

        private static final /* synthetic */ RosterSeason[] $values() {
            return new RosterSeason[]{preseason, regular, postseason};
        }

        static {
            RosterSeason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ RosterSeason(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RosterSeason valueOf(String str) {
            return (RosterSeason) Enum.valueOf(RosterSeason.class, str);
        }

        public static RosterSeason[] values() {
            return (RosterSeason[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<RosterSeason> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<RosterSeason> getAllCases() {
                return ArrayKt.arrayOf(RosterSeason.preseason, RosterSeason.regular, RosterSeason.postseason);
            }

            public final RosterSeason init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != 79491) {
                    if (hashCode != 79537) {
                        if (hashCode == 81012 && rawValue.equals("REG")) {
                            return RosterSeason.regular;
                        }
                        return null;
                    }
                    if (rawValue.equals("PST")) {
                        return RosterSeason.postseason;
                    }
                    return null;
                }
                if (!rawValue.equals("PRE")) {
                    return null;
                }
                return RosterSeason.preseason;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private RosterSeason(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chat", "games", "futures", "players", "roster", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Section implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Section chat = new Section("chat", 0, "chat", null, 2, null);
        public static final Section games = new Section("games", 1, "games", null, 2, null);
        public static final Section futures = new Section("futures", 2, "futures", null, 2, null);
        public static final Section players = new Section("players", 3, "players", null, 2, null);
        public static final Section roster = new Section("roster", 4, "roster", null, 2, null);

        private static final /* synthetic */ Section[] $values() {
            return new Section[]{chat, games, futures, players, roster};
        }

        static {
            Section[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Section(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Section> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Section> getAllCases() {
                return ArrayKt.arrayOf(Section.chat, Section.games, Section.futures, Section.players, Section.roster);
            }

            public final Section init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -925192565:
                        if (!rawValue.equals("roster")) {
                            return null;
                        }
                        return Section.roster;
                    case -503567600:
                        if (rawValue.equals("futures")) {
                            return Section.futures;
                        }
                        return null;
                    case -493567566:
                        if (rawValue.equals("players")) {
                            return Section.players;
                        }
                        return null;
                    case 3052376:
                        if (rawValue.equals("chat")) {
                            return Section.chat;
                        }
                        return null;
                    case 98120385:
                        if (rawValue.equals("games")) {
                            return Section.games;
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

        private Section(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u001f\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0082 J\u0082\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2$\u0010\"\u001a \u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050#J\u0085\u0001\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2$\u0010\"\u001a \u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050#H\u0082 J\u000e\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u0007J\u0010\u0010.\u001a\u0004\u0018\u00010\u00162\u0006\u0010-\u001a\u00020\u0007J\u0010\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020\u0007¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "logDefaultedNoOp", "", Keys.KEY_NAME, "", "Swift_Companion_logDefaultedNoOp_0", "Swift_Companion_constructor_8", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "create", "Lcom/polymarket/usviewmodels/SportsTeamViewModel;", "team", "Lcom/polymarket/data/ESportsTeam;", "entrySource", "Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "initialSection", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$Section;", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "chatCallbacks", "Lcom/polymarket/usviewmodels/USChatViewModel$Callbacks;", "settingsCallbacks", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Callbacks;", "onOpenSettings", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel;", "onInviteFriends", "Lkotlin/Function0;", "onChatPositionBuy", "Lkotlin/Function4;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "Lcom/polymarket/data/EEvent;", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "Swift_Companion_create_9", "mock", "Swift_Companion_mock_12", "EventsTab", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$EventsTab;", "rawValue", "Section", "RosterSeason", "Lcom/polymarket/usviewmodels/SportsTeamViewModel$RosterSeason;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_8(AppSceneType scene, String id);

        private final native SportsTeamViewModel Swift_Companion_create_9(ESportsTeam team, SportsTeamEntrySource entrySource, Section initialSection, USEventCardViewModel.Callbacks sportsEventCallbacks, USChatViewModel.Callbacks chatCallbacks, SportsTeamSettingsViewModel.Callbacks settingsCallbacks, Function1<? super SportsTeamSettingsViewModel, Unit> onOpenSettings, Function0<Unit> onInviteFriends, Function4<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, ? super TradeEntrySource, Unit> onChatPositionBuy);

        private final native void Swift_Companion_logDefaultedNoOp_0(String name);

        private final native SportsTeamViewModel Swift_Companion_mock_12(ESportsTeam team);

        public static final /* synthetic */ long access$Swift_Companion_constructor_8(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_8(appSceneType, str);
        }

        public final EventsTab EventsTab(String rawValue) {
            rawValue.getClass();
            return EventsTab.INSTANCE.init(rawValue);
        }

        public final RosterSeason RosterSeason(String rawValue) {
            rawValue.getClass();
            return RosterSeason.INSTANCE.init(rawValue);
        }

        public final Section Section(String rawValue) {
            rawValue.getClass();
            return Section.INSTANCE.init(rawValue);
        }

        public final SportsTeamViewModel create(ESportsTeam team, SportsTeamEntrySource entrySource, Section initialSection, USEventCardViewModel.Callbacks sportsEventCallbacks, USChatViewModel.Callbacks chatCallbacks, SportsTeamSettingsViewModel.Callbacks settingsCallbacks, Function1<? super SportsTeamSettingsViewModel, Unit> onOpenSettings, Function0<Unit> onInviteFriends, Function4<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, ? super TradeEntrySource, Unit> onChatPositionBuy) {
            team.getClass();
            sportsEventCallbacks.getClass();
            chatCallbacks.getClass();
            settingsCallbacks.getClass();
            onOpenSettings.getClass();
            onInviteFriends.getClass();
            onChatPositionBuy.getClass();
            return Swift_Companion_create_9(team, entrySource, initialSection, sportsEventCallbacks, chatCallbacks, settingsCallbacks, onOpenSettings, onInviteFriends, onChatPositionBuy);
        }

        public final void logDefaultedNoOp(String name) {
            name.getClass();
            Swift_Companion_logDefaultedNoOp_0(name);
        }

        public final SportsTeamViewModel mock(ESportsTeam team) {
            team.getClass();
            return Swift_Companion_mock_12(team);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsTeamViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_8(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public SportsTeamViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
