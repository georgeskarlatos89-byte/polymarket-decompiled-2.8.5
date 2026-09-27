package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EError;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.ETournamentGameUS;
import com.polymarket.data.ETournamentPhaseUS;
import com.polymarket.data.ETournamentUS;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import defpackage.c1j;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 |2\u00020\u0001:\u0003z{|B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\u001a\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0015\u0010\"\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010#\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\nH\u0082 J\u0015\u0010(\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010)\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00101\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010*H\u0082 J\u0015\u00105\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010;\u001a\b\u0012\u0004\u0012\u000208072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u0001082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010B\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010J\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0CH\u0082 J\u001b\u0010N\u001a\b\u0012\u0004\u0012\u00020\f0C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010O\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0CH\u0082 J\u0015\u0010R\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020V0U2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u0010]\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020V0UH\u0082 J\u001b\u0010c\u001a\b\u0012\u0004\u0012\u00020^072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010d\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020^07H\u0082 J\u0017\u0010k\u001a\u0004\u0018\u00010e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010l\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010eH\u0082 J\u0015\u0010n\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010o\u001a\u00020\u001bH\u0016J\u0015\u0010p\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010q\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020sJ\u001d\u0010t\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010r\u001a\u00020sH\u0082 J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010x\u001a\u00020\nH\u0016J\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010x\u001a\u00020\nH\u0082 R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010$\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0012\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u00106\u001a\b\u0012\u0004\u0012\u000208078F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010<\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010@\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bA\u0010%R0\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0C2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0C2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010F\"\u0004\bM\u0010HR\u0011\u0010P\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001fR\u0011\u0010S\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bS\u0010%R<\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020V0U2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020V0U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R0\u0010_\u001a\b\u0012\u0004\u0012\u00020^072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020^078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010:\"\u0004\ba\u0010bR(\u0010f\u001a\u0004\u0018\u00010e2\b\u0010\u0012\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bm\u0010%¨\u0006}"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "tournamentId", "", "initialName", "", "reservesHeroSpace", "", "callbacks", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Callbacks;", "(ILjava/lang/String;ZLcom/polymarket/usviewmodels/TournamentBracketViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/ETournamentUS;", "tournament", "getTournament", "()Lcom/polymarket/data/ETournamentUS;", "setTournament", "(Lcom/polymarket/data/ETournamentUS;)V", "Swift_tournament", "Swift_tournament_set", "", "value", "selectedPhaseIndex", "getSelectedPhaseIndex", "()I", "setSelectedPhaseIndex", "(I)V", "Swift_selectedPhaseIndex", "Swift_selectedPhaseIndex_set", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "navTitle", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "phases", "", "Lcom/polymarket/data/ETournamentPhaseUS;", "getPhases", "()Ljava/util/List;", "Swift_phases", "currentPhase", "getCurrentPhase", "()Lcom/polymarket/data/ETournamentPhaseUS;", "Swift_currentPhase", "hasDivisions", "getHasDivisions", "Swift_hasDivisions", "", "selectedDivisions", "getSelectedDivisions", "()Ljava/util/Set;", "setSelectedDivisions", "(Ljava/util/Set;)V", "Swift_selectedDivisions", "Swift_selectedDivisions_set", "selectedTeamIds", "getSelectedTeamIds", "setSelectedTeamIds", "Swift_selectedTeamIds", "Swift_selectedTeamIds_set", "filterBadgeCount", "getFilterBadgeCount", "Swift_filterBadgeCount", "isFiltering", "Swift_isFiltering", "", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "eventViewModelsByGameId", "getEventViewModelsByGameId", "()Ljava/util/Map;", "setEventViewModelsByGameId", "(Ljava/util/Map;)V", "Swift_eventViewModelsByGameId", "Swift_eventViewModelsByGameId_set", "Lcom/polymarket/data/ESportsTeam;", "additionalFilterableTeams", "getAdditionalFilterableTeams", "setAdditionalFilterableTeams", "(Ljava/util/List;)V", "Swift_additionalFilterableTeams", "Swift_additionalFilterableTeams_set", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel;", "filterVM", "getFilterVM", "()Lcom/polymarket/usviewmodels/TournamentFilterViewModel;", "setFilterVM", "(Lcom/polymarket/usviewmodels/TournamentFilterViewModel;)V", "Swift_filterVM", "Swift_filterVM_set", "getReservesHeroSpace", "Swift_reservesHeroSpace", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TournamentBracketViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ TournamentBracketViewModel(int i, String str, boolean z, Callbacks callbacks, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native List<ESportsTeam> Swift_additionalFilterableTeams(long Swift_peer);

    private final native void Swift_additionalFilterableTeams_set(long Swift_peer, List<ESportsTeam> value);

    private final native ETournamentPhaseUS Swift_currentPhase(long Swift_peer);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native Map<Integer, USEventCardViewModel> Swift_eventViewModelsByGameId(long Swift_peer);

    private final native void Swift_eventViewModelsByGameId_set(long Swift_peer, Map<Integer, USEventCardViewModel> value);

    private final native int Swift_filterBadgeCount(long Swift_peer);

    private final native TournamentFilterViewModel Swift_filterVM(long Swift_peer);

    private final native void Swift_filterVM_set(long Swift_peer, TournamentFilterViewModel value);

    private final native boolean Swift_hasDivisions(long Swift_peer);

    private final native boolean Swift_isFiltering(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native String Swift_navTitle(long Swift_peer);

    private final native List<ETournamentPhaseUS> Swift_phases(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native boolean Swift_reservesHeroSpace(long Swift_peer);

    private final native Set<String> Swift_selectedDivisions(long Swift_peer);

    private final native void Swift_selectedDivisions_set(long Swift_peer, Set<String> value);

    private final native int Swift_selectedPhaseIndex(long Swift_peer);

    private final native void Swift_selectedPhaseIndex_set(long Swift_peer, int value);

    private final native Set<String> Swift_selectedTeamIds(long Swift_peer);

    private final native void Swift_selectedTeamIds_set(long Swift_peer, Set<String> value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native ETournamentUS Swift_tournament(long Swift_peer);

    private final native void Swift_tournament_set(long Swift_peer, ETournamentUS value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<ESportsTeam> getAdditionalFilterableTeams() {
        return Swift_additionalFilterableTeams(getSwift_peer());
    }

    public final ETournamentPhaseUS getCurrentPhase() {
        return Swift_currentPhase(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final Map<Integer, USEventCardViewModel> getEventViewModelsByGameId() {
        return Swift_eventViewModelsByGameId(getSwift_peer());
    }

    public final int getFilterBadgeCount() {
        return Swift_filterBadgeCount(getSwift_peer());
    }

    public final TournamentFilterViewModel getFilterVM() {
        return Swift_filterVM(getSwift_peer());
    }

    public final boolean getHasDivisions() {
        return Swift_hasDivisions(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final List<ETournamentPhaseUS> getPhases() {
        return Swift_phases(getSwift_peer());
    }

    public final boolean getReservesHeroSpace() {
        return Swift_reservesHeroSpace(getSwift_peer());
    }

    public final Set<String> getSelectedDivisions() {
        return Swift_selectedDivisions(getSwift_peer());
    }

    public final int getSelectedPhaseIndex() {
        return Swift_selectedPhaseIndex(getSwift_peer());
    }

    public final Set<String> getSelectedTeamIds() {
        return Swift_selectedTeamIds(getSwift_peer());
    }

    public final ETournamentUS getTournament() {
        return Swift_tournament(getSwift_peer());
    }

    public final boolean isFiltering() {
        return Swift_isFiltering(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAdditionalFilterableTeams(List<ESportsTeam> list) {
        list.getClass();
        Swift_additionalFilterableTeams_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setEventViewModelsByGameId(Map<Integer, USEventCardViewModel> map) {
        map.getClass();
        Swift_eventViewModelsByGameId_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setFilterVM(TournamentFilterViewModel tournamentFilterViewModel) {
        Swift_filterVM_set(getSwift_peer(), tournamentFilterViewModel);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setSelectedDivisions(Set<String> set) {
        set.getClass();
        Swift_selectedDivisions_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    public final void setSelectedPhaseIndex(int i) {
        Swift_selectedPhaseIndex_set(getSwift_peer(), i);
    }

    public final void setSelectedTeamIds(Set<String> set) {
        set.getClass();
        Swift_selectedTeamIds_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    public final void setTournament(ETournamentUS eTournamentUS) {
        Swift_tournament_set(getSwift_peer(), (ETournamentUS) StructKt.sref$default(eTournamentUS, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnPhaseSelectedCase", "OnRetryCase", "OnGameSelectedCase", "OnViewWillAppearCase", "OnViewWillDisappearCase", "OnShowFilterCase", "OnFilterAppliedCase", "Companion", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnFilterAppliedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnGameSelectedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnPhaseSelectedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnShowFilterCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewWillAppearCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewWillDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onViewWillAppear = new OnViewWillAppearCase();
        private static final Input onViewWillDisappear = new OnViewWillDisappearCase();
        private static final Input onShowFilter = new OnShowFilterCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnFilterAppliedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "associated0", "", "", "associated1", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "getAssociated0", "()Ljava/util/Set;", "getAssociated1", "divisions", "getDivisions", "teamIds", "getTeamIds", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFilterAppliedCase extends Input {
            private final Set<String> associated0;
            private final Set<String> associated1;
            private final Set<String> divisions;
            private final Set<String> teamIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFilterAppliedCase(Set<String> set, Set<String> set2) {
                super(null);
                set.getClass();
                set2.getClass();
                this.associated0 = set;
                this.associated1 = set2;
                this.divisions = set;
                this.teamIds = set2;
            }

            public final Set<String> getAssociated0() {
                return this.associated0;
            }

            public final Set<String> getAssociated1() {
                return this.associated1;
            }

            public final Set<String> getDivisions() {
                return this.divisions;
            }

            public final Set<String> getTeamIds() {
                return this.teamIds;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnGameSelectedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "associated0", "Lcom/polymarket/data/ETournamentGameUS;", "<init>", "(Lcom/polymarket/data/ETournamentGameUS;)V", "getAssociated0", "()Lcom/polymarket/data/ETournamentGameUS;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnGameSelectedCase extends Input {
            private final ETournamentGameUS associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnGameSelectedCase(ETournamentGameUS eTournamentGameUS) {
                super(null);
                eTournamentGameUS.getClass();
                this.associated0 = eTournamentGameUS;
            }

            public final ETournamentGameUS getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnPhaseSelectedCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPhaseSelectedCase extends Input {
            private final int associated0;

            public OnPhaseSelectedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnShowFilterCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowFilterCase extends Input {
            public OnShowFilterCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewWillAppearCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillAppearCase extends Input {
            public OnViewWillAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$OnViewWillDisappearCase;", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnShowFilter$cp() {
            return onShowFilter;
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
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\"\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Input;", "onPhaseSelected", "associated0", "", "onRetry", "getOnRetry", "onGameSelected", "Lcom/polymarket/data/ETournamentGameUS;", "onViewWillAppear", "getOnViewWillAppear", "onViewWillDisappear", "getOnViewWillDisappear", "onShowFilter", "getOnShowFilter", "onFilterApplied", "divisions", "", "", "teamIds", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnShowFilter() {
                return Input.access$getOnShowFilter$cp();
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

            public final Input onFilterApplied(Set<String> divisions, Set<String> teamIds) {
                divisions.getClass();
                teamIds.getClass();
                return new OnFilterAppliedCase(divisions, teamIds);
            }

            public final Input onGameSelected(ETournamentGameUS associated0) {
                associated0.getClass();
                return new OnGameSelectedCase(associated0);
            }

            public final Input onPhaseSelected(int associated0) {
                return new OnPhaseSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "tournamentId", "", "initialName", "", "reservesHeroSpace", "", "callbacks", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/TournamentBracketViewModel;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(int tournamentId, String initialName, boolean reservesHeroSpace, Callbacks callbacks);

        private final native TournamentBracketViewModel Swift_Companion_mock_3(int tournamentId);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, int i, String str, boolean z, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(i, str, z, callbacks);
        }

        public static /* synthetic */ TournamentBracketViewModel mock$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return companion.mock(i);
        }

        public final TournamentBracketViewModel mock(int tournamentId) {
            return Swift_Companion_mock_3(tournamentId);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentBracketViewModel(int i, String str, boolean z, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, i, str, z, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public TournamentBracketViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\rJ\u0015\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J)\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentBracketViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onGameSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/ETournamentGameUS;", "", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "(Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, USEventCardViewModel.Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super ETournamentGameUS, Unit>) function1, r1);
            USEventCardViewModel.Callbacks callbacks2;
            function1 = (i & 1) != 0 ? new c1j(14) : function1;
            if ((i & 2) != 0) {
                callbacks2 = new USEventCardViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null);
            } else {
                callbacks2 = callbacks;
            }
        }

        private final native long Swift_constructor_0(Function1<? super ETournamentGameUS, Unit> onGameSelected, USEventCardViewModel.Callbacks sportsEventCallbacks);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ETournamentGameUS eTournamentGameUS) {
            eTournamentGameUS.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ETournamentGameUS eTournamentGameUS) {
            return _init_$lambda$0(eTournamentGameUS);
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function1<? super ETournamentGameUS, Unit> function1, USEventCardViewModel.Callbacks callbacks) {
            function1.getClass();
            callbacks.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, callbacks);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
