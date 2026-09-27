package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.i31;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003QRSB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0082 J\u0015\u0010\u001c\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001d\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J\u0015\u0010$\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010%\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u001eH\u0082 J\u0015\u0010*\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010=\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J\u0015\u0010@\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010A\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J\b\u0010B\u001a\u00020\u0015H\u0016J\u0015\u0010C\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020FJ\u001d\u0010G\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010E\u001a\u00020FH\u0082 J\u0006\u0010H\u001a\u00020\u0015J\u0015\u0010I\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010J\u001a\u00020\u0015J\u0015\u0010K\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u001eH\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u001eH\u0082 R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0011\u00106\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b7\u0010.R$\u00109\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR$\u0010>\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001b¨\u0006T"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsPresentation;", "proposedBanner", "getProposedBanner", "()Lcom/polymarket/usviewmodels/BannerResolvedPositionsPresentation;", "setProposedBanner", "(Lcom/polymarket/usviewmodels/BannerResolvedPositionsPresentation;)V", "Swift_proposedBanner", "Swift_proposedBanner_set", "", "value", "", "isExpanded", "()Z", "setExpanded", "(Z)V", "Swift_isExpanded", "Swift_isExpanded_set", "", "currentCardIndex", "getCurrentCardIndex", "()I", "setCurrentCardIndex", "(I)V", "Swift_currentCardIndex", "Swift_currentCardIndex_set", "currentCardColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getCurrentCardColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_currentCardColor", "expandedTitle", "", "getExpandedTitle", "()Ljava/lang/String;", "Swift_expandedTitle", "expandedSubtitle", "getExpandedSubtitle", "Swift_expandedSubtitle", "seeAllButtonText", "getSeeAllButtonText", "Swift_seeAllButtonText", "collapsedText", "getCollapsedText", "Swift_collapsedText", "hasBeenSeen", "getHasBeenSeen", "setHasBeenSeen", "Swift_hasBeenSeen", "Swift_hasBeenSeen_set", "isDismissed", "setDismissed", "Swift_isDismissed", "Swift_isDismissed_set", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "Swift_sendInput_2", "markAsSeen", "Swift_markAsSeen_3", "completeDismissal", "Swift_completeDismissal_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerResolvedPositionsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BannerResolvedPositionsViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native String Swift_collapsedText(long Swift_peer);

    private final native void Swift_completeDismissal_4(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_currentCardColor(long Swift_peer);

    private final native int Swift_currentCardIndex(long Swift_peer);

    private final native void Swift_currentCardIndex_set(long Swift_peer, int value);

    private final native String Swift_expandedSubtitle(long Swift_peer);

    private final native String Swift_expandedTitle(long Swift_peer);

    private final native boolean Swift_hasBeenSeen(long Swift_peer);

    private final native void Swift_hasBeenSeen_set(long Swift_peer, boolean value);

    private final native boolean Swift_isDismissed(long Swift_peer);

    private final native void Swift_isDismissed_set(long Swift_peer, boolean value);

    private final native boolean Swift_isExpanded(long Swift_peer);

    private final native void Swift_isExpanded_set(long Swift_peer, boolean value);

    private final native void Swift_markAsSeen_3(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native BannerResolvedPositionsPresentation Swift_proposedBanner(long Swift_peer);

    private final native void Swift_proposedBanner_set(long Swift_peer, BannerResolvedPositionsPresentation value);

    private final native String Swift_seeAllButtonText(long Swift_peer);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void completeDismissal() {
        Swift_completeDismissal_4(getSwift_peer());
    }

    public final String getCollapsedText() {
        return Swift_collapsedText(getSwift_peer());
    }

    public final DesignTokens.SemanticColor getCurrentCardColor() {
        return Swift_currentCardColor(getSwift_peer());
    }

    public final int getCurrentCardIndex() {
        return Swift_currentCardIndex(getSwift_peer());
    }

    public final String getExpandedSubtitle() {
        return Swift_expandedSubtitle(getSwift_peer());
    }

    public final String getExpandedTitle() {
        return Swift_expandedTitle(getSwift_peer());
    }

    public final boolean getHasBeenSeen() {
        return Swift_hasBeenSeen(getSwift_peer());
    }

    public final BannerResolvedPositionsPresentation getProposedBanner() {
        return Swift_proposedBanner(getSwift_peer());
    }

    public final String getSeeAllButtonText() {
        return Swift_seeAllButtonText(getSwift_peer());
    }

    public final boolean isDismissed() {
        return Swift_isDismissed(getSwift_peer());
    }

    public final boolean isExpanded() {
        return Swift_isExpanded(getSwift_peer());
    }

    public final void markAsSeen() {
        Swift_markAsSeen_3(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setCurrentCardIndex(int i) {
        Swift_currentCardIndex_set(getSwift_peer(), i);
    }

    public final void setDismissed(boolean z) {
        Swift_isDismissed_set(getSwift_peer(), z);
    }

    public final void setExpanded(boolean z) {
        Swift_isExpanded_set(getSwift_peer(), z);
    }

    public final void setHasBeenSeen(boolean z) {
        Swift_hasBeenSeen_set(getSwift_peer(), z);
    }

    public final void setProposedBanner(BannerResolvedPositionsPresentation bannerResolvedPositionsPresentation) {
        Swift_proposedBanner_set(getSwift_peer(), bannerResolvedPositionsPresentation);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnTapCase", "OnDismissCase", "OnSeeAllCase", "OnCardIndexChangedCase", "Companion", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnCardIndexChangedCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnSeeAllCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnTapCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onTap = new OnTapCase();
        private static final Input onDismiss = new OnDismissCase();
        private static final Input onSeeAll = new OnSeeAllCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnCardIndexChangedCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCardIndexChangedCase extends Input {
            private final int associated0;

            public OnCardIndexChangedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissCase extends Input {
            public OnDismissCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnSeeAllCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSeeAllCase extends Input {
            public OnSeeAllCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$OnTapCase;", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTapCase extends Input {
            public OnTapCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnDismiss$cp() {
            return onDismiss;
        }

        public static final /* synthetic */ Input access$getOnSeeAll$cp() {
            return onSeeAll;
        }

        public static final /* synthetic */ Input access$getOnTap$cp() {
            return onTap;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input$Companion;", "", "<init>", "()V", "onTap", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "getOnTap", "()Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Input;", "onDismiss", "getOnDismiss", "onSeeAll", "getOnSeeAll", "onCardIndexChanged", "associated0", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnDismiss() {
                return Input.access$getOnDismiss$cp();
            }

            public final Input getOnSeeAll() {
                return Input.access$getOnSeeAll$cp();
            }

            public final Input getOnTap() {
                return Input.access$getOnTap$cp();
            }

            public final Input onCardIndexChanged(int associated0) {
                return new OnCardIndexChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerResolvedPositionsViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public BannerResolvedPositionsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\fJ\u0015\u0010\u0014\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010 \u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/BannerResolvedPositionsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onNavigateToHistory", "Lkotlin/Function0;", "", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnNavigateToHistory", "()Lkotlin/jvm/functions/Function0;", "Swift_onNavigateToHistory", "getOnDismiss", "Swift_onDismiss", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function0<Unit>) ((i & 1) != 0 ? new i31(17) : function0), (Function0<Unit>) ((i & 2) != 0 ? new i31(18) : function02));
        }

        private final native long Swift_constructor_0(Function0<Unit> onNavigateToHistory, Function0<Unit> onDismiss);

        private final native Function0<Unit> Swift_onDismiss(long Swift_peer);

        private final native Function0<Unit> Swift_onNavigateToHistory(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$0();
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

        public final Function0<Unit> getOnDismiss() {
            return Swift_onDismiss(this.Swift_peer);
        }

        public final Function0<Unit> getOnNavigateToHistory() {
            return Swift_onNavigateToHistory(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02) {
            function0.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
