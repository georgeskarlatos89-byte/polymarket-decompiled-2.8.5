package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EEvent;
import com.polymarket.data.EExploreFeed;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import defpackage.hoj;
import defpackage.wmj;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0090\u00012\u00020\u0001:\b\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0015\u0010\u001f\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0015\u0010'\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010(\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020!H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010.\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020)0\u000fH\u0082 J\u0015\u00101\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00102\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0017\u00109\u001a\u0004\u0018\u0001032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010:\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u000103H\u0082 J\u0015\u0010=\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010V\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010p\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020@0m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010t\u001a\b\u0012\u0004\u0012\u00020@0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010u\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020@0\u000fH\u0082 J\b\u0010v\u001a\u00020\u0018H\u0016J\u0015\u0010w\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010x\u001a\u00020\u0018H\u0016J\u0015\u0010y\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010z\u001a\u0004\u0018\u00010)2\u0006\u0010{\u001a\u00020!J\u001f\u0010|\u001a\u0004\u0018\u00010)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010}\u001a\u00020!H\u0082 J\u000f\u0010~\u001a\u00020\u00182\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0082 J\u000f\u0010\u0082\u0001\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0083\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\"\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J\u001c\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020)0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R$\u0010/\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR(\u00104\u001a\u0004\u0018\u0001032\b\u0010\u000e\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010;\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u000f8F¢\u0006\u0006\u001a\u0004\bA\u0010\u0013R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010\u0013R\u0013\u0010G\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010K\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001cR\u0011\u0010N\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bO\u0010\u001cR\u0011\u0010Q\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bR\u0010\u001cR\u0011\u0010T\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bU\u0010\u001cR\u0011\u0010W\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bX\u0010\u001cR\u0011\u0010Z\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b[\u0010$R\u0011\u0010]\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b^\u0010$R\u0011\u0010`\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\ba\u0010$R\u0011\u0010c\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bd\u0010$R\u0011\u0010f\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bg\u0010$R\u0011\u0010i\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bj\u0010$R\u001d\u0010l\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020@0m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR0\u0010q\u001a\b\u0012\u0004\u0012\u00020@0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020@0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\u0013\"\u0004\bs\u0010\u0015R\u001f\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100m8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010o¨\u0006\u0091\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/USSearchViewModel$Callbacks;", "configuration", "Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;", "(Lcom/polymarket/usviewmodels/USSearchViewModel$Callbacks;Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;)V", "newValue", "", "Lcom/polymarket/data/APIEventTag;", "categories", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "Swift_categories", "Swift_categories_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "Swift_searchQuery", "Swift_searchQuery_set", "Lcom/polymarket/data/EEvent;", "searchResults", "getSearchResults", "setSearchResults", "Swift_searchResults", "Swift_searchResults_set", "isAwaitingResults", "setAwaitingResults", "Swift_isAwaitingResults", "Swift_isAwaitingResults_set", "Lcom/polymarket/data/EExploreFeed;", "exploreFeed", "getExploreFeed", "()Lcom/polymarket/data/EExploreFeed;", "setExploreFeed", "(Lcom/polymarket/data/EExploreFeed;)V", "Swift_exploreFeed", "Swift_exploreFeed_set", "isLoadingExplore", "setLoadingExplore", "Swift_isLoadingExplore", "Swift_isLoadingExplore_set", "suggestedListEventViewModels", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "getSuggestedListEventViewModels", "Swift_suggestedListEventViewModels", "exploreSections", "Lcom/polymarket/data/EExploreFeed$Section;", "getExploreSections", "Swift_exploreSections", "specialEvent", "getSpecialEvent", "()Lcom/polymarket/data/EEvent;", "Swift_specialEvent", "showBrowse", "getShowBrowse", "Swift_showBrowse", "showSearchLoading", "getShowSearchLoading", "Swift_showSearchLoading", "showSearchEmpty", "getShowSearchEmpty", "Swift_showSearchEmpty", "hasSuggestedEvents", "getHasSuggestedEvents", "Swift_hasSuggestedEvents", "hasCategories", "getHasCategories", "Swift_hasCategories", "navTitle", "getNavTitle", "Swift_navTitle", "searchPlaceholder", "getSearchPlaceholder", "Swift_searchPlaceholder", "noResultsText", "getNoResultsText", "Swift_noResultsText", "resultsSectionTitle", "getResultsSectionTitle", "Swift_resultsSectionTitle", "suggestedSectionTitle", "getSuggestedSectionTitle", "Swift_suggestedSectionTitle", "categoriesSectionTitle", "getCategoriesSectionTitle", "Swift_categoriesSectionTitle", "exploreEventViewModelsById", "", "getExploreEventViewModelsById", "()Ljava/util/Map;", "Swift_exploreEventViewModelsById", "searchResultEventViewModels", "getSearchResultEventViewModels", "setSearchResultEventViewModels", "Swift_searchResultEventViewModels", "Swift_searchResultEventViewModels_set", "setup", "Swift_setup_1", "handleBecomeForeground", "Swift_handleBecomeForeground_2", "exploreEvent", "for_", "Swift_exploreEvent_3", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "Swift_sendInput_4", "setCallbacks", "Swift_setCallbacks_5", "sectionCategoryTabs", "getSectionCategoryTabs", "Swift_sectionCategoryTabs", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Configuration", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSearchViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ USSearchViewModel(Callbacks callbacks, Configuration configuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks, (i & 2) != 0 ? Configuration.INSTANCE.getDefault() : configuration);
    }

    private final native List<APIEventTag> Swift_categories(long Swift_peer);

    private final native String Swift_categoriesSectionTitle(long Swift_peer);

    private final native void Swift_categories_set(long Swift_peer, List<APIEventTag> value);

    private final native Map<String, USEventCardViewModel> Swift_exploreEventViewModelsById(long Swift_peer);

    private final native EEvent Swift_exploreEvent_3(long Swift_peer, String id);

    private final native EExploreFeed Swift_exploreFeed(long Swift_peer);

    private final native void Swift_exploreFeed_set(long Swift_peer, EExploreFeed value);

    private final native List<EExploreFeed.Section> Swift_exploreSections(long Swift_peer);

    private final native void Swift_handleBecomeForeground_2(long Swift_peer);

    private final native boolean Swift_hasCategories(long Swift_peer);

    private final native boolean Swift_hasSuggestedEvents(long Swift_peer);

    private final native boolean Swift_isAwaitingResults(long Swift_peer);

    private final native void Swift_isAwaitingResults_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isLoadingExplore(long Swift_peer);

    private final native void Swift_isLoadingExplore_set(long Swift_peer, boolean value);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native String Swift_navTitle(long Swift_peer);

    private final native String Swift_noResultsText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_resultsSectionTitle(long Swift_peer);

    private final native String Swift_searchPlaceholder(long Swift_peer);

    private final native String Swift_searchQuery(long Swift_peer);

    private final native void Swift_searchQuery_set(long Swift_peer, String value);

    private final native List<USEventCardViewModel> Swift_searchResultEventViewModels(long Swift_peer);

    private final native void Swift_searchResultEventViewModels_set(long Swift_peer, List<USEventCardViewModel> value);

    private final native List<EEvent> Swift_searchResults(long Swift_peer);

    private final native void Swift_searchResults_set(long Swift_peer, List<EEvent> value);

    private final native Map<String, APIEventTag> Swift_sectionCategoryTabs(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_5(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showBrowse(long Swift_peer);

    private final native boolean Swift_showSearchEmpty(long Swift_peer);

    private final native boolean Swift_showSearchLoading(long Swift_peer);

    private final native EEvent Swift_specialEvent(long Swift_peer);

    private final native List<USEventCardViewModel> Swift_suggestedListEventViewModels(long Swift_peer);

    private final native String Swift_suggestedSectionTitle(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EEvent exploreEvent(String for_) {
        for_.getClass();
        return Swift_exploreEvent_3(getSwift_peer(), for_);
    }

    public final List<APIEventTag> getCategories() {
        return Swift_categories(getSwift_peer());
    }

    public final String getCategoriesSectionTitle() {
        return Swift_categoriesSectionTitle(getSwift_peer());
    }

    public final Map<String, USEventCardViewModel> getExploreEventViewModelsById() {
        return Swift_exploreEventViewModelsById(getSwift_peer());
    }

    public final EExploreFeed getExploreFeed() {
        return Swift_exploreFeed(getSwift_peer());
    }

    public final List<EExploreFeed.Section> getExploreSections() {
        return Swift_exploreSections(getSwift_peer());
    }

    public final boolean getHasCategories() {
        return Swift_hasCategories(getSwift_peer());
    }

    public final boolean getHasSuggestedEvents() {
        return Swift_hasSuggestedEvents(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getNoResultsText() {
        return Swift_noResultsText(getSwift_peer());
    }

    public final String getResultsSectionTitle() {
        return Swift_resultsSectionTitle(getSwift_peer());
    }

    public final String getSearchPlaceholder() {
        return Swift_searchPlaceholder(getSwift_peer());
    }

    public final String getSearchQuery() {
        return Swift_searchQuery(getSwift_peer());
    }

    public final List<USEventCardViewModel> getSearchResultEventViewModels() {
        return Swift_searchResultEventViewModels(getSwift_peer());
    }

    public final List<EEvent> getSearchResults() {
        return Swift_searchResults(getSwift_peer());
    }

    public final Map<String, APIEventTag> getSectionCategoryTabs() {
        return Swift_sectionCategoryTabs(getSwift_peer());
    }

    public final boolean getShowBrowse() {
        return Swift_showBrowse(getSwift_peer());
    }

    public final boolean getShowSearchEmpty() {
        return Swift_showSearchEmpty(getSwift_peer());
    }

    public final boolean getShowSearchLoading() {
        return Swift_showSearchLoading(getSwift_peer());
    }

    public final EEvent getSpecialEvent() {
        return Swift_specialEvent(getSwift_peer());
    }

    public final List<USEventCardViewModel> getSuggestedListEventViewModels() {
        return Swift_suggestedListEventViewModels(getSwift_peer());
    }

    public final String getSuggestedSectionTitle() {
        return Swift_suggestedSectionTitle(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_2(getSwift_peer());
    }

    public final boolean isAwaitingResults() {
        return Swift_isAwaitingResults(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isLoadingExplore() {
        return Swift_isLoadingExplore(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setAwaitingResults(boolean z) {
        Swift_isAwaitingResults_set(getSwift_peer(), z);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_5(getSwift_peer(), callbacks);
    }

    public final void setCategories(List<APIEventTag> list) {
        list.getClass();
        Swift_categories_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setExploreFeed(EExploreFeed eExploreFeed) {
        Swift_exploreFeed_set(getSwift_peer(), eExploreFeed);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setLoadingExplore(boolean z) {
        Swift_isLoadingExplore_set(getSwift_peer(), z);
    }

    public final void setSearchQuery(String str) {
        str.getClass();
        Swift_searchQuery_set(getSwift_peer(), str);
    }

    public final void setSearchResultEventViewModels(List<USEventCardViewModel> list) {
        list.getClass();
        Swift_searchResultEventViewModels_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSearchResults(List<EEvent> list) {
        list.getClass();
        Swift_searchResults_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBO\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010-\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JE\u0010.\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d002\u0006\u00101\u001a\u00020\u000bH\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d002\u0006\u00101\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010 ¨\u00064"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "minSearchCharacters", "", "searchLimit", "debounceMilliseconds", "suggestedLookbackHours", "suggestedWindowHours", "suggestedFetchLimit", "suggestedMaxCount", "(IIIIIII)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getMinSearchCharacters", "()I", "Swift_minSearchCharacters", "getSearchLimit", "Swift_searchLimit", "getDebounceMilliseconds", "Swift_debounceMilliseconds", "getSuggestedLookbackHours", "Swift_suggestedLookbackHours", "getSuggestedWindowHours", "Swift_suggestedWindowHours", "getSuggestedFetchLimit", "Swift_suggestedFetchLimit", "getSuggestedMaxCount", "Swift_suggestedMaxCount", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Configuration implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public /* synthetic */ Configuration(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? 2 : i, (i8 & 2) != 0 ? 20 : i2, (i8 & 4) != 0 ? 300 : i3, (i8 & 8) != 0 ? 4 : i4, (i8 & 16) != 0 ? 48 : i5, (i8 & 32) != 0 ? 50 : i6, (i8 & 64) != 0 ? 3 : i7);
        }

        private final native long Swift_constructor_0(int minSearchCharacters, int searchLimit, int debounceMilliseconds, int suggestedLookbackHours, int suggestedWindowHours, int suggestedFetchLimit, int suggestedMaxCount);

        private final native int Swift_debounceMilliseconds(long Swift_peer);

        private final native int Swift_minSearchCharacters(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_searchLimit(long Swift_peer);

        private final native int Swift_suggestedFetchLimit(long Swift_peer);

        private final native int Swift_suggestedLookbackHours(long Swift_peer);

        private final native int Swift_suggestedMaxCount(long Swift_peer);

        private final native int Swift_suggestedWindowHours(long Swift_peer);

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

        public final int getDebounceMilliseconds() {
            return Swift_debounceMilliseconds(this.Swift_peer);
        }

        public final int getMinSearchCharacters() {
            return Swift_minSearchCharacters(this.Swift_peer);
        }

        public final int getSearchLimit() {
            return Swift_searchLimit(this.Swift_peer);
        }

        public final int getSuggestedFetchLimit() {
            return Swift_suggestedFetchLimit(this.Swift_peer);
        }

        public final int getSuggestedLookbackHours() {
            return Swift_suggestedLookbackHours(this.Swift_peer);
        }

        public final int getSuggestedMaxCount() {
            return Swift_suggestedMaxCount(this.Swift_peer);
        }

        public final int getSuggestedWindowHours() {
            return Swift_suggestedWindowHours(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration$Companion;", "", "<init>", "()V", "default", "Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;", "getDefault", "()Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;", "Swift_Companion_default", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Configuration Swift_Companion_default();

            public final Configuration getDefault() {
                return Swift_Companion_default();
            }

            private Companion() {
            }
        }

        public Configuration(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(i, i2, i3, i4, i5, i6, i7);
        }

        public Configuration(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnViewWillAppearCase", "OnSearchQueryChangedCase", "OnClearSearchCase", "OnCategorySelectedCase", "OnEventSelectedCase", "OnOpenURLCase", "OnContactSupportCase", "OnSectionEventSelectedCase", "OnSpecialEventSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnCategorySelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnClearSearchCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSearchQueryChangedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSectionEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSpecialEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnViewWillAppearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onViewWillAppear = new OnViewWillAppearCase();
        private static final Input onClearSearch = new OnClearSearchCase();
        private static final Input onContactSupport = new OnContactSupportCase();
        private static final Input onSpecialEventSelected = new OnSpecialEventSelectedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnCategorySelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "associated0", "Lcom/polymarket/data/APIEventTag;", "<init>", "(Lcom/polymarket/data/APIEventTag;)V", "getAssociated0", "()Lcom/polymarket/data/APIEventTag;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCategorySelectedCase extends Input {
            private final APIEventTag associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCategorySelectedCase(APIEventTag aPIEventTag) {
                super(null);
                aPIEventTag.getClass();
                this.associated0 = aPIEventTag;
            }

            public final APIEventTag getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnClearSearchCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnClearSearchCase extends Input {
            public OnClearSearchCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactSupportCase extends Input {
            public OnContactSupportCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "associated0", "Lcom/polymarket/data/EEvent;", "<init>", "(Lcom/polymarket/data/EEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventSelectedCase extends Input {
            private final EEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventSelectedCase(EEvent eEvent) {
                super(null);
                eEvent.getClass();
                this.associated0 = eEvent;
            }

            public final EEvent getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSearchQueryChangedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchQueryChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchQueryChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSectionEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "associated0", "Lcom/polymarket/data/EEvent;", "<init>", "(Lcom/polymarket/data/EEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSectionEventSelectedCase extends Input {
            private final EEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSectionEventSelectedCase(EEvent eEvent) {
                super(null);
                eEvent.getClass();
                this.associated0 = eEvent;
            }

            public final EEvent getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnSpecialEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSpecialEventSelectedCase extends Input {
            public OnSpecialEventSelectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$OnViewWillAppearCase;", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillAppearCase extends Input {
            public OnViewWillAppearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnClearSearch$cp() {
            return onClearSearch;
        }

        public static final /* synthetic */ Input access$getOnContactSupport$cp() {
            return onContactSupport;
        }

        public static final /* synthetic */ Input access$getOnSpecialEventSelected$cp() {
            return onSpecialEventSelected;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnViewWillAppear$cp() {
            return onViewWillAppear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USSearchViewModel$Input;", "onViewWillAppear", "getOnViewWillAppear", "onSearchQueryChanged", "associated0", "", "onClearSearch", "getOnClearSearch", "onCategorySelected", "Lcom/polymarket/data/APIEventTag;", "onEventSelected", "Lcom/polymarket/data/EEvent;", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "getOnContactSupport", "onSectionEventSelected", "onSpecialEventSelected", "getOnSpecialEventSelected", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnClearSearch() {
                return Input.access$getOnClearSearch$cp();
            }

            public final Input getOnContactSupport() {
                return Input.access$getOnContactSupport$cp();
            }

            public final Input getOnSpecialEventSelected() {
                return Input.access$getOnSpecialEventSelected$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnViewWillAppear() {
                return Input.access$getOnViewWillAppear$cp();
            }

            public final Input onCategorySelected(APIEventTag associated0) {
                associated0.getClass();
                return new OnCategorySelectedCase(associated0);
            }

            public final Input onEventSelected(EEvent associated0) {
                associated0.getClass();
                return new OnEventSelectedCase(associated0);
            }

            public final Input onOpenURL(URI associated0) {
                associated0.getClass();
                return new OnOpenURLCase(associated0);
            }

            public final Input onSearchQueryChanged(String associated0) {
                associated0.getClass();
                return new OnSearchQueryChangedCase(associated0);
            }

            public final Input onSectionEventSelected(EEvent associated0) {
                associated0.getClass();
                return new OnSectionEventSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/USSearchViewModel$Callbacks;", "configuration", "Lcom/polymarket/usviewmodels/USSearchViewModel$Configuration;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks, Configuration configuration);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks, Configuration configuration) {
            return companion.Swift_Companion_constructor_0(callbacks, configuration);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSearchViewModel(Callbacks callbacks, Configuration configuration) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks, configuration), (SwiftPeerMarker) null);
        callbacks.getClass();
        configuration.getClass();
    }

    public USSearchViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0093\u0001\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\rJ\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0089\u0001\u00106\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\"0\u00152\u0006\u00108\u001a\u00020$H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\"0\u00152\u0006\u00108\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b/\u00100R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010&R\u001f\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010&¨\u0006;"}, d2 = {"Lcom/polymarket/usviewmodels/USSearchViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCategorySelected", "Lkotlin/Function1;", "Lcom/polymarket/data/APIEventTag;", "", "onEventSelected", "Lcom/polymarket/data/EEvent;", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "Lkotlin/Function0;", "onSpecialEventSelected", "onSpecialEventLoaded", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCategorySelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onCategorySelected", "getOnEventSelected", "Swift_onEventSelected", "getSportsEventCallbacks", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "Swift_sportsEventCallbacks", "getOnOpenURL", "Swift_onOpenURL", "getOnContactSupport", "()Lkotlin/jvm/functions/Function0;", "Swift_onContactSupport", "getOnSpecialEventSelected", "Swift_onSpecialEventSelected", "getOnSpecialEventLoaded", "Swift_onSpecialEventLoaded", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, USEventCardViewModel.Callbacks callbacks, Function1 function13, Function0 function0, Function1 function14, Function1 function15, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r0, r1, r3, r2, r4, r5, r23);
            Function1 function16;
            Function1 function17;
            USEventCardViewModel.Callbacks callbacks2;
            Function1 function18;
            Function0 function02;
            Function1 function19;
            Function1 function110;
            if ((i & 1) != 0) {
                function16 = new wmj(18);
            } else {
                function16 = function1;
            }
            if ((i & 2) != 0) {
                function17 = new wmj(19);
            } else {
                function17 = function12;
            }
            if ((i & 4) != 0) {
                callbacks2 = new USEventCardViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null);
            } else {
                callbacks2 = callbacks;
            }
            if ((i & 8) != 0) {
                function18 = new wmj(20);
            } else {
                function18 = function13;
            }
            if ((i & 16) != 0) {
                function02 = new hoj(13);
            } else {
                function02 = function0;
            }
            if ((i & 32) != 0) {
                function19 = new wmj(21);
            } else {
                function19 = function14;
            }
            if ((i & 64) != 0) {
                function110 = new wmj(22);
            } else {
                function110 = function15;
            }
        }

        private final native long Swift_constructor_0(Function1<? super APIEventTag, Unit> onCategorySelected, Function1<? super EEvent, Unit> onEventSelected, USEventCardViewModel.Callbacks sportsEventCallbacks, Function1<? super URI, Unit> onOpenURL, Function0<Unit> onContactSupport, Function1<? super EEvent, Unit> onSpecialEventSelected, Function1<? super EEvent, Unit> onSpecialEventLoaded);

        private final native Function1<APIEventTag, Unit> Swift_onCategorySelected(long Swift_peer);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onEventSelected(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onSpecialEventLoaded(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onSpecialEventSelected(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native USEventCardViewModel.Callbacks Swift_sportsEventCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0(APIEventTag aPIEventTag) {
            aPIEventTag.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EEvent eEvent) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EEvent eEvent) {
            return _init_$lambda$5(eEvent);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit c(APIEventTag aPIEventTag) {
            return _init_$lambda$0(aPIEventTag);
        }

        public static /* synthetic */ Unit d(EEvent eEvent) {
            return _init_$lambda$1(eEvent);
        }

        public static /* synthetic */ Unit e(URI uri) {
            return _init_$lambda$2(uri);
        }

        public static /* synthetic */ Unit f(EEvent eEvent) {
            return _init_$lambda$4(eEvent);
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

        public final Function1<APIEventTag, Unit> getOnCategorySelected() {
            return Swift_onCategorySelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnEventSelected() {
            return Swift_onEventSelected(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnSpecialEventLoaded() {
            return Swift_onSpecialEventLoaded(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnSpecialEventSelected() {
            return Swift_onSpecialEventSelected(this.Swift_peer);
        }

        public final USEventCardViewModel.Callbacks getSportsEventCallbacks() {
            return Swift_sportsEventCallbacks(this.Swift_peer);
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

        public Callbacks(Function1<? super APIEventTag, Unit> function1, Function1<? super EEvent, Unit> function12, USEventCardViewModel.Callbacks callbacks, Function1<? super URI, Unit> function13, Function0<Unit> function0, Function1<? super EEvent, Unit> function14, Function1<? super EEvent, Unit> function15) {
            function1.getClass();
            function12.getClass();
            callbacks.getClass();
            function13.getClass();
            function0.getClass();
            function14.getClass();
            function15.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, callbacks, function13, function0, function14, function15);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
