package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.k2h;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 R2\u00020\u0001:\u0003PQRB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0011\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010 \u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010#\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\nJ\u001d\u0010>\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010=\u001a\u00020\nH\u0082 J\u0010\u0010?\u001a\u0004\u0018\u00010\u00142\u0006\u0010@\u001a\u00020\nJ\u001f\u0010A\u001a\u0004\u0018\u00010\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010B\u001a\u00020\nH\u0082 J\b\u0010C\u001a\u00020DH\u0016J\u0015\u0010E\u001a\u00020D2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HJ\u001d\u0010I\u001a\u00020D2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010G\u001a\u00020HH\u0082 J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020NH\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020NH\u0082 R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010!\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0010R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0011\u0010*\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0011\u0010-\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0011\u00100\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\u0011\u00103\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001fR\u0011\u00106\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u0010\u0010R\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\u0010¨\u0006S"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "squadId", "", "callbacks", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Callbacks;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Callbacks;)V", "searchText", "getSearchText", "()Ljava/lang/String;", "Swift_searchText", "visibleUsers", "", "Lcom/polymarket/usviewmodels/SquadsComposeContactPresentation;", "getVisibleUsers", "()Ljava/util/List;", "Swift_visibleUsers", "selectedUserIds", "", "getSelectedUserIds", "()Ljava/util/Set;", "Swift_selectedUserIds", "isSendingInvites", "", "()Z", "Swift_isSendingInvites", "navTitle", "getNavTitle", "Swift_navTitle", "confirmTitle", "getConfirmTitle", "Swift_confirmTitle", "searchPlaceholder", "getSearchPlaceholder", "Swift_searchPlaceholder", "canConfirmSelection", "getCanConfirmSelection", "Swift_canConfirmSelection", "showsNoSearchResults", "getShowsNoSearchResults", "Swift_showsNoSearchResults", "noSearchResultsTitle", "getNoSearchResultsTitle", "Swift_noSearchResultsTitle", "showsEmptyState", "getShowsEmptyState", "Swift_showsEmptyState", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "inviteFriendsButtonTitle", "getInviteFriendsButtonTitle", "Swift_inviteFriendsButtonTitle", "isUserSelected", "userId", "Swift_isUserSelected_0", "user", "for_", "Swift_user_1", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "setup", "", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "Swift_sendInput_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsInviteUsersViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsInviteUsersViewModel(String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, str, callbacks), (SwiftPeerMarker) null);
        str.getClass();
        callbacks.getClass();
    }

    private final native boolean Swift_canConfirmSelection(long Swift_peer);

    private final native String Swift_confirmTitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native String Swift_inviteFriendsButtonTitle(long Swift_peer);

    private final native boolean Swift_isSendingInvites(long Swift_peer);

    private final native boolean Swift_isUserSelected_0(long Swift_peer, String userId);

    private final native String Swift_navTitle(long Swift_peer);

    private final native String Swift_noSearchResultsTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_searchPlaceholder(long Swift_peer);

    private final native String Swift_searchText(long Swift_peer);

    private final native Set<String> Swift_selectedUserIds(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_showsEmptyState(long Swift_peer);

    private final native boolean Swift_showsNoSearchResults(long Swift_peer);

    private final native SquadsComposeContactPresentation Swift_user_1(long Swift_peer, String id);

    private final native List<SquadsComposeContactPresentation> Swift_visibleUsers(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getCanConfirmSelection() {
        return Swift_canConfirmSelection(getSwift_peer());
    }

    public final String getConfirmTitle() {
        return Swift_confirmTitle(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final String getInviteFriendsButtonTitle() {
        return Swift_inviteFriendsButtonTitle(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getNoSearchResultsTitle() {
        return Swift_noSearchResultsTitle(getSwift_peer());
    }

    public final String getSearchPlaceholder() {
        return Swift_searchPlaceholder(getSwift_peer());
    }

    public final String getSearchText() {
        return Swift_searchText(getSwift_peer());
    }

    public final Set<String> getSelectedUserIds() {
        return Swift_selectedUserIds(getSwift_peer());
    }

    public final boolean getShowsEmptyState() {
        return Swift_showsEmptyState(getSwift_peer());
    }

    public final boolean getShowsNoSearchResults() {
        return Swift_showsNoSearchResults(getSwift_peer());
    }

    public final List<SquadsComposeContactPresentation> getVisibleUsers() {
        return Swift_visibleUsers(getSwift_peer());
    }

    public final boolean isSendingInvites() {
        return Swift_isSendingInvites(getSwift_peer());
    }

    public final boolean isUserSelected(String userId) {
        userId.getClass();
        return Swift_isUserSelected_0(getSwift_peer(), userId);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    public final SquadsComposeContactPresentation user(String for_) {
        for_.getClass();
        return Swift_user_1(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnToggleUserCase", "OnSearchTextChangedCase", "OnConfirmSelectionCase", "OnInviteFriendsTappedCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnConfirmSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnInviteFriendsTappedCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnToggleUserCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onConfirmSelection = new OnConfirmSelectionCase();
        private static final Input onInviteFriendsTapped = new OnInviteFriendsTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnConfirmSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmSelectionCase extends Input {
            public OnConfirmSelectionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnInviteFriendsTappedCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteFriendsTappedCase extends Input {
            public OnInviteFriendsTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchTextChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchTextChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$OnToggleUserCase;", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleUserCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnToggleUserCase(String str) {
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

        public static final /* synthetic */ Input access$getOnConfirmSelection$cp() {
            return onConfirmSelection;
        }

        public static final /* synthetic */ Input access$getOnInviteFriendsTapped$cp() {
            return onInviteFriendsTapped;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input$Companion;", "", "<init>", "()V", "onToggleUser", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "associated0", "", "onSearchTextChanged", "onConfirmSelection", "getOnConfirmSelection", "()Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Input;", "onInviteFriendsTapped", "getOnInviteFriendsTapped", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnConfirmSelection() {
                return Input.access$getOnConfirmSelection$cp();
            }

            public final Input getOnInviteFriendsTapped() {
                return Input.access$getOnInviteFriendsTapped$cp();
            }

            public final Input onSearchTextChanged(String associated0) {
                associated0.getClass();
                return new OnSearchTextChangedCase(associated0);
            }

            public final Input onToggleUser(String associated0) {
                associated0.getClass();
                return new OnToggleUserCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "squadId", "", "callbacks", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel;", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(String squadId, Callbacks callbacks);

        private final native SquadsInviteUsersViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(str, callbacks);
        }

        public final SquadsInviteUsersViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    public SquadsInviteUsersViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ SquadsInviteUsersViewModel(String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\fJ\u0015\u0010\u0014\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010 \u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInviteUsersViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onInvitesSent", "Lkotlin/Function0;", "", "onInviteFriends", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnInvitesSent", "()Lkotlin/jvm/functions/Function0;", "Swift_onInvitesSent", "getOnInviteFriends", "Swift_onInviteFriends", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function0<Unit>) ((i & 1) != 0 ? new k2h(27) : function0), (Function0<Unit>) ((i & 2) != 0 ? new k2h(28) : function02));
        }

        private final native long Swift_constructor_0(Function0<Unit> onInvitesSent, Function0<Unit> onInviteFriends);

        private final native Function0<Unit> Swift_onInviteFriends(long Swift_peer);

        private final native Function0<Unit> Swift_onInvitesSent(long Swift_peer);

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

        public final Function0<Unit> getOnInviteFriends() {
            return Swift_onInviteFriends(this.Swift_peer);
        }

        public final Function0<Unit> getOnInvitesSent() {
            return Swift_onInvitesSent(this.Swift_peer);
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
