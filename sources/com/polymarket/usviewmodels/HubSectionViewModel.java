package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 T2\u00020\u0001:\u0004QRSTB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 ¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010'\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010@\u001a\u00020)H\u0082 J\b\u0010A\u001a\u00020?H\u0016J\u0015\u0010B\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020EJ\u001d\u0010F\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010D\u001a\u00020EH\u0082 J\b\u0010G\u001a\u0004\u0018\u00010\u001fJ\u0017\u0010H\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020\fJ\u001d\u0010K\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010J\u001a\u00020\fH\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u0015H\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u0015H\u0082 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0011\u00100\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b7\u0010\u0012R$\u0010:\u001a\u00020)2\u0006\u00109\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010+\"\u0004\b;\u0010<¨\u0006U"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "capsules", "", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Capsule;", "getCapsules", "()Ljava/util/List;", "Swift_capsules", "selectedCapsuleID", "", "getSelectedCapsuleID", "()Ljava/lang/Integer;", "Swift_selectedCapsuleID", "(J)Ljava/lang/Integer;", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "Swift_searchQuery", "activeFeedViewModel", "Lcom/polymarket/usviewmodels/FeedViewModel;", "getActiveFeedViewModel", "()Lcom/polymarket/usviewmodels/FeedViewModel;", "Swift_activeFeedViewModel", "capsuleBarStyle", "Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle;", "getCapsuleBarStyle", "()Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle;", "Swift_capsuleBarStyle", "showsCapsuleBar", "", "getShowsCapsuleBar", "()Z", "Swift_showsCapsuleBar", "showsCapsuleSearch", "getShowsCapsuleSearch", "Swift_showsCapsuleSearch", "hasUnfilteredFeed", "getHasUnfilteredFeed", "Swift_hasUnfilteredFeed", "selectedCapsuleTitle", "getSelectedCapsuleTitle", "Swift_selectedCapsuleTitle", "visibleCapsules", "getVisibleCapsules", "Swift_visibleCapsules", "newValue", "isVisible", "setVisible", "(Z)V", "Swift_isVisible", "Swift_isVisible_set", "", "value", "setup", "Swift_setup_0", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "Swift_sendInput_2", "unfilteredFeedViewModel", "Swift_unfilteredFeedViewModel_3", "selectFeed", "label", "Swift_selectFeed_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Capsule", "CapsuleBarStyle", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HubSectionViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ HubSectionViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native FeedViewModel Swift_activeFeedViewModel(long Swift_peer);

    private final native CapsuleBarStyle Swift_capsuleBarStyle(long Swift_peer);

    private final native List<Capsule> Swift_capsules(long Swift_peer);

    private final native boolean Swift_hasUnfilteredFeed(long Swift_peer);

    private final native boolean Swift_isVisible(long Swift_peer);

    private final native void Swift_isVisible_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_searchQuery(long Swift_peer);

    private final native void Swift_selectFeed_4(long Swift_peer, String label);

    private final native Integer Swift_selectedCapsuleID(long Swift_peer);

    private final native String Swift_selectedCapsuleTitle(long Swift_peer);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_0(long Swift_peer);

    private final native boolean Swift_showsCapsuleBar(long Swift_peer);

    private final native boolean Swift_showsCapsuleSearch(long Swift_peer);

    private final native FeedViewModel Swift_unfilteredFeedViewModel_3(long Swift_peer);

    private final native List<Capsule> Swift_visibleCapsules(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final FeedViewModel getActiveFeedViewModel() {
        return Swift_activeFeedViewModel(getSwift_peer());
    }

    public final CapsuleBarStyle getCapsuleBarStyle() {
        return Swift_capsuleBarStyle(getSwift_peer());
    }

    public final List<Capsule> getCapsules() {
        return Swift_capsules(getSwift_peer());
    }

    public final boolean getHasUnfilteredFeed() {
        return Swift_hasUnfilteredFeed(getSwift_peer());
    }

    public final String getSearchQuery() {
        return Swift_searchQuery(getSwift_peer());
    }

    public final Integer getSelectedCapsuleID() {
        return Swift_selectedCapsuleID(getSwift_peer());
    }

    public final String getSelectedCapsuleTitle() {
        return Swift_selectedCapsuleTitle(getSwift_peer());
    }

    public final boolean getShowsCapsuleBar() {
        return Swift_showsCapsuleBar(getSwift_peer());
    }

    public final boolean getShowsCapsuleSearch() {
        return Swift_showsCapsuleSearch(getSwift_peer());
    }

    public final List<Capsule> getVisibleCapsules() {
        return Swift_visibleCapsules(getSwift_peer());
    }

    public final boolean isVisible() {
        return Swift_isVisible(getSwift_peer());
    }

    public final void selectFeed(String label) {
        label.getClass();
        Swift_selectFeed_4(getSwift_peer(), label);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setVisible(boolean z) {
        Swift_isVisible_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_0(getSwift_peer());
    }

    public final FeedViewModel unfilteredFeedViewModel() {
        return Swift_unfilteredFeedViewModel_3(getSwift_peer());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "hidden", "scrolling", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class CapsuleBarStyle implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ CapsuleBarStyle[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CapsuleBarStyle hidden = new CapsuleBarStyle("hidden", 0, "hidden", null, 2, null);
        public static final CapsuleBarStyle scrolling = new CapsuleBarStyle("scrolling", 1, "scrolling", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ CapsuleBarStyle[] $values() {
            return new CapsuleBarStyle[]{hidden, scrolling};
        }

        static {
            CapsuleBarStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ CapsuleBarStyle(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static CapsuleBarStyle valueOf(String str) {
            return (CapsuleBarStyle) Enum.valueOf(CapsuleBarStyle.class, str);
        }

        public static CapsuleBarStyle[] values() {
            return (CapsuleBarStyle[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CapsuleBarStyle init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "hidden")) {
                    return CapsuleBarStyle.hidden;
                }
                if (Intrinsics.areEqual(rawValue, "scrolling")) {
                    return CapsuleBarStyle.scrolling;
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

        private CapsuleBarStyle(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnCapsuleSelectedCase", "OnSearchQueryChangedCase", "Companion", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input$OnCapsuleSelectedCase;", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input$OnSearchQueryChangedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Input$OnCapsuleSelectedCase;", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/Integer;)V", "getAssociated0", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCapsuleSelectedCase extends Input {
            private final Integer associated0;

            public OnCapsuleSelectedCase(Integer num) {
                super(null);
                this.associated0 = num;
            }

            public final Integer getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Input$OnSearchQueryChangedCase;", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Input$Companion;", "", "<init>", "()V", "onCapsuleSelected", "Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "associated0", "", "(Ljava/lang/Integer;)Lcom/polymarket/usviewmodels/HubSectionViewModel$Input;", "onSearchQueryChanged", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input onCapsuleSelected(Integer associated0) {
                return new OnCapsuleSelectedCase(associated0);
            }

            public final Input onSearchQueryChanged(String associated0) {
                associated0.getClass();
                return new OnSearchQueryChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "mock", "Lcom/polymarket/usviewmodels/HubSectionViewModel;", "Swift_Companion_mock_5", "CapsuleBarStyle", "Lcom/polymarket/usviewmodels/HubSectionViewModel$CapsuleBarStyle;", "rawValue", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(AppSceneType scene, String id);

        private final native HubSectionViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_1(appSceneType, str);
        }

        public final CapsuleBarStyle CapsuleBarStyle(String rawValue) {
            rawValue.getClass();
            return CapsuleBarStyle.INSTANCE.init(rawValue);
        }

        public final HubSectionViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\b\u0010%\u001a\u00020\u0002H\u0016J\u0015\u0010&\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020!0(2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0(2\u0006\u0010)\u001a\u00020\u0002H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/HubSectionViewModel$Capsule;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "(ILjava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/Integer;", "Swift_id", "getTitle", "()Ljava/lang/String;", "Swift_title", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Capsule implements Identifiable<Integer>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Capsule(int i, String str) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(i, str);
        }

        private final native long Swift_constructor_0(int id, String title);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native int Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Capsule lhs, Capsule rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof Capsule)) {
                return false;
            }
            return Swift_isequal(this, (Capsule) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.Identifiable
        public Integer getId() {
            return Integer.valueOf(Swift_id(this.Swift_peer));
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ Integer getId() {
            return getId();
        }

        public Capsule(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubSectionViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public HubSectionViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
