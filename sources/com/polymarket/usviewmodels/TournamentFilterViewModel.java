package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.ESportsTeam;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 [2\u00020\u0001:\u0005WXYZ[B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001e\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010#\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010(\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00100\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010)H\u0082 J\u0015\u00104\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020)J\u001d\u0010:\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010;\u001a\u00020)H\u0082 J\u000e\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020)J\u001d\u0010>\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010;\u001a\u00020)H\u0082 J\u000e\u0010?\u001a\u00020\u00102\u0006\u00109\u001a\u00020)J\u001d\u0010@\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010;\u001a\u00020)H\u0082 J\u000e\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020CJ\u001d\u0010D\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010B\u001a\u00020CH\u0082 J\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100F2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010M\u001a\b\u0012\u0004\u0012\u00020K0F2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0F2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020KH\u0016J\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020KH\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u000e\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b6\u00103R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020K0F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020O0F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010H¨\u0006\\"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "config", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Config;Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Callbacks;)V", "newValue", "", "", "selectedDivisions", "getSelectedDivisions", "()Ljava/util/Set;", "setSelectedDivisions", "(Ljava/util/Set;)V", "Swift_selectedDivisions", "Swift_selectedDivisions_set", "", "value", "selectedTeamIds", "getSelectedTeamIds", "setSelectedTeamIds", "Swift_selectedTeamIds", "Swift_selectedTeamIds_set", "pendingDivisions", "getPendingDivisions", "setPendingDivisions", "Swift_pendingDivisions", "Swift_pendingDivisions_set", "pendingTeamIds", "getPendingTeamIds", "setPendingTeamIds", "Swift_pendingTeamIds", "Swift_pendingTeamIds_set", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "activeFilterType", "getActiveFilterType", "()Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "setActiveFilterType", "(Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;)V", "Swift_activeFilterType", "Swift_activeFilterType_set", "divisionsValueText", "getDivisionsValueText", "()Ljava/lang/String;", "Swift_divisionsValueText", "teamsValueText", "getTeamsValueText", "Swift_teamsValueText", "applyButtonTitle", "for_", "Swift_applyButtonTitle_0", "type", "isAllSelected", "", "Swift_isAllSelected_1", "selectAllButtonTitle", "Swift_selectAllButtonTitle_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "Swift_sendInput_4", "divisionNames", "", "getDivisionNames", "()Ljava/util/List;", "Swift_divisionNames", "divisionTeamCounts", "", "getDivisionTeamCounts", "Swift_divisionTeamCounts", "teamItems", "Lcom/polymarket/data/ESportsTeam;", "getTeamItems", "Swift_teamItems", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Config", "Callbacks", "FilterType", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TournamentFilterViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "divisions", "teams", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FilterType implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FilterType[] $VALUES;
        public static final FilterType divisions = new FilterType("divisions", 0);
        public static final FilterType teams = new FilterType("teams", 1);

        private static final /* synthetic */ FilterType[] $values() {
            return new FilterType[]{divisions, teams};
        }

        static {
            FilterType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private FilterType(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FilterType valueOf(String str) {
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }

        public static FilterType[] values() {
            return (FilterType[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentFilterViewModel(Config config, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_3(INSTANCE, config, callbacks), (SwiftPeerMarker) null);
        config.getClass();
        callbacks.getClass();
    }

    private final native FilterType Swift_activeFilterType(long Swift_peer);

    private final native void Swift_activeFilterType_set(long Swift_peer, FilterType value);

    private final native String Swift_applyButtonTitle_0(long Swift_peer, FilterType type);

    private final native List<String> Swift_divisionNames(long Swift_peer);

    private final native List<Integer> Swift_divisionTeamCounts(long Swift_peer);

    private final native String Swift_divisionsValueText(long Swift_peer);

    private final native boolean Swift_isAllSelected_1(long Swift_peer, FilterType type);

    private final native Set<String> Swift_pendingDivisions(long Swift_peer);

    private final native void Swift_pendingDivisions_set(long Swift_peer, Set<String> value);

    private final native Set<String> Swift_pendingTeamIds(long Swift_peer);

    private final native void Swift_pendingTeamIds_set(long Swift_peer, Set<String> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_selectAllButtonTitle_2(long Swift_peer, FilterType type);

    private final native Set<String> Swift_selectedDivisions(long Swift_peer);

    private final native void Swift_selectedDivisions_set(long Swift_peer, Set<String> value);

    private final native Set<String> Swift_selectedTeamIds(long Swift_peer);

    private final native void Swift_selectedTeamIds_set(long Swift_peer, Set<String> value);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native List<ESportsTeam> Swift_teamItems(long Swift_peer);

    private final native String Swift_teamsValueText(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String applyButtonTitle(FilterType for_) {
        for_.getClass();
        return Swift_applyButtonTitle_0(getSwift_peer(), for_);
    }

    public final FilterType getActiveFilterType() {
        return Swift_activeFilterType(getSwift_peer());
    }

    public List<String> getDivisionNames() {
        return Swift_divisionNames(getSwift_peer());
    }

    public List<Integer> getDivisionTeamCounts() {
        return Swift_divisionTeamCounts(getSwift_peer());
    }

    public final String getDivisionsValueText() {
        return Swift_divisionsValueText(getSwift_peer());
    }

    public final Set<String> getPendingDivisions() {
        return Swift_pendingDivisions(getSwift_peer());
    }

    public final Set<String> getPendingTeamIds() {
        return Swift_pendingTeamIds(getSwift_peer());
    }

    public final Set<String> getSelectedDivisions() {
        return Swift_selectedDivisions(getSwift_peer());
    }

    public final Set<String> getSelectedTeamIds() {
        return Swift_selectedTeamIds(getSwift_peer());
    }

    public List<ESportsTeam> getTeamItems() {
        return Swift_teamItems(getSwift_peer());
    }

    public final String getTeamsValueText() {
        return Swift_teamsValueText(getSwift_peer());
    }

    public final boolean isAllSelected(FilterType for_) {
        for_.getClass();
        return Swift_isAllSelected_1(getSwift_peer(), for_);
    }

    public final String selectAllButtonTitle(FilterType for_) {
        for_.getClass();
        return Swift_selectAllButtonTitle_2(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setActiveFilterType(FilterType filterType) {
        Swift_activeFilterType_set(getSwift_peer(), filterType);
    }

    public final void setPendingDivisions(Set<String> set) {
        set.getClass();
        Swift_pendingDivisions_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    public final void setPendingTeamIds(Set<String> set) {
        set.getClass();
        Swift_pendingTeamIds_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    public final void setSelectedDivisions(Set<String> set) {
        set.getClass();
        Swift_selectedDivisions_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    public final void setSelectedTeamIds(Set<String> set) {
        set.getClass();
        Swift_selectedTeamIds_set(getSwift_peer(), (Set) StructKt.sref$default(set, null, 1, null));
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnDivisionToggledCase", "OnTeamToggledCase", "OnSelectAllDivisionsCase", "OnSelectAllTeamsCase", "OnDetailStepEnteredCase", "OnApplyCase", "Companion", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnApplyCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnDetailStepEnteredCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnDivisionToggledCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnSelectAllDivisionsCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnSelectAllTeamsCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnTeamToggledCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onSelectAllDivisions = new OnSelectAllDivisionsCase();
        private static final Input onSelectAllTeams = new OnSelectAllTeamsCase();
        private static final Input onApply = new OnApplyCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnApplyCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnApplyCase extends Input {
            public OnApplyCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnDetailStepEnteredCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "<init>", "(Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDetailStepEnteredCase extends Input {
            private final FilterType associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDetailStepEnteredCase(FilterType filterType) {
                super(null);
                filterType.getClass();
                this.associated0 = filterType;
            }

            public final FilterType getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnDivisionToggledCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", Keys.KEY_NAME, "getName", "isChecked", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDivisionToggledCase extends Input {
            private final String associated0;
            private final boolean associated1;
            private final boolean isChecked;
            private final String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDivisionToggledCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
                this.name = str;
                this.isChecked = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }

            public final String getName() {
                return this.name;
            }

            /* renamed from: isChecked, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnSelectAllDivisionsCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectAllDivisionsCase extends Input {
            public OnSelectAllDivisionsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnSelectAllTeamsCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectAllTeamsCase extends Input {
            public OnSelectAllTeamsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$OnTeamToggledCase;", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", "teamId", "getTeamId", "isChecked", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTeamToggledCase extends Input {
            private final String associated0;
            private final boolean associated1;
            private final boolean isChecked;
            private final String teamId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTeamToggledCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
                this.teamId = str;
                this.isChecked = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }

            public final String getTeamId() {
                return this.teamId;
            }

            /* renamed from: isChecked, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnApply$cp() {
            return onApply;
        }

        public static final /* synthetic */ Input access$getOnSelectAllDivisions$cp() {
            return onSelectAllDivisions;
        }

        public static final /* synthetic */ Input access$getOnSelectAllTeams$cp() {
            return onSelectAllTeams;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input$Companion;", "", "<init>", "()V", "onDivisionToggled", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", Keys.KEY_NAME, "", "isChecked", "", "onTeamToggled", "teamId", "onSelectAllDivisions", "getOnSelectAllDivisions", "()Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Input;", "onSelectAllTeams", "getOnSelectAllTeams", "onDetailStepEntered", "associated0", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$FilterType;", "onApply", "getOnApply", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnApply() {
                return Input.access$getOnApply$cp();
            }

            public final Input getOnSelectAllDivisions() {
                return Input.access$getOnSelectAllDivisions$cp();
            }

            public final Input getOnSelectAllTeams() {
                return Input.access$getOnSelectAllTeams$cp();
            }

            public final Input onDetailStepEntered(FilterType associated0) {
                associated0.getClass();
                return new OnDetailStepEnteredCase(associated0);
            }

            public final Input onDivisionToggled(String name, boolean isChecked) {
                name.getClass();
                return new OnDivisionToggledCase(name, isChecked);
            }

            public final Input onTeamToggled(String teamId, boolean isChecked) {
                teamId.getClass();
                return new OnTeamToggledCase(teamId, isChecked);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_3", "", "Lskip/bridge/SwiftObjectPointer;", "config", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/TournamentFilterViewModel;", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_3(Config config, Callbacks callbacks);

        private final native TournamentFilterViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_3(Companion companion, Config config, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_3(config, callbacks);
        }

        public final TournamentFilterViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    public TournamentFilterViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012&\b\u0002\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0015\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J3\u0010\u001e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J3\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052$\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0082 J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\"\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onFilterApplied", "Lkotlin/Function2;", "", "", "", "(Lkotlin/jvm/functions/Function2;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnFilterApplied", "()Lkotlin/jvm/functions/Function2;", "Swift_onFilterApplied", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function2<? super Set<String>, ? super Set<String>, Unit> function2) {
            function2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function2);
        }

        private final native long Swift_constructor_0(Function2<? super Set<String>, ? super Set<String>, Unit> onFilterApplied);

        private final native Function2<Set<String>, Set<String>, Unit> Swift_onFilterApplied(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(Set set, Set set2) {
            set.getClass();
            set2.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(Set set, Set set2) {
            return _init_$lambda$0(set, set2);
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

        public final Function2<Set<String>, Set<String>, Unit> getOnFilterApplied() {
            return Swift_onFilterApplied(this.Swift_peer);
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

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Callbacks(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new zyi(6) : function2);
        }
    }

    public /* synthetic */ TournamentFilterViewModel(Config config, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(config, (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB[\b\u0016\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u000eH\u0016J'\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J_\u0010+\u001a\u00060\u0004j\u0002`\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0-2\u0006\u0010.\u001a\u00020\u000eH\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0-2\u0006\u0010.\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R%\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentFilterViewModel$Config;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "divisions", "", "Lkotlin/Pair;", "", "", "teams", "Lcom/polymarket/data/ESportsTeam;", "selectedDivisions", "", "selectedTeamIds", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getDivisions", "()Ljava/util/List;", "Swift_divisions", "getTeams", "Swift_teams", "getSelectedDivisions", "()Ljava/util/Set;", "Swift_selectedDivisions", "getSelectedTeamIds", "Swift_selectedTeamIds", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Config implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Config(List<Pair<String, Integer>> list, List<Pair<ESportsTeam, String>> list2, Set<String> set, Set<String> set2) {
            list.getClass();
            list2.getClass();
            set.getClass();
            set2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, list2, set, set2);
        }

        private final native long Swift_constructor_0(List<Pair<String, Integer>> divisions, List<Pair<ESportsTeam, String>> teams, Set<String> selectedDivisions, Set<String> selectedTeamIds);

        private final native List<Pair<String, Integer>> Swift_divisions(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Set<String> Swift_selectedDivisions(long Swift_peer);

        private final native Set<String> Swift_selectedTeamIds(long Swift_peer);

        private final native List<Pair<ESportsTeam, String>> Swift_teams(long Swift_peer);

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

        public final List<Pair<String, Integer>> getDivisions() {
            return Swift_divisions(this.Swift_peer);
        }

        public final Set<String> getSelectedDivisions() {
            return Swift_selectedDivisions(this.Swift_peer);
        }

        public final Set<String> getSelectedTeamIds() {
            return Swift_selectedTeamIds(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final List<Pair<ESportsTeam, String>> getTeams() {
            return Swift_teams(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Config(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
