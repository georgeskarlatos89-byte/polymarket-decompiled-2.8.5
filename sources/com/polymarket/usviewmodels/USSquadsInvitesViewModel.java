package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.ESquad;
import com.polymarket.data.ESquadReceivedInvitation;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u85;
import defpackage.wmj;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003IJKB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001d\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010 \u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010#\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000bJ\u001d\u0010)\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020\u000bH\u0082 J\u0015\u0010-\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u00101\u001a\u00020\u0017J\u001f\u00102\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00103\u001a\u00020\u0017H\u0082 J\b\u00104\u001a\u000205H\u0016J\u0015\u00106\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u00107\u001a\u0002052\u0006\u00108\u001a\u000209H\u0096@¢\u0006\u0002\u0010:J3\u0010;\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00108\u001a\u0002092\u0014\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u0002050=H\u0082 J\u000e\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020AJ\u001d\u0010B\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010@\u001a\u00020AH\u0082 J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020GH\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020GH\u0082 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0011\u0010$\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0011\u0010+\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010.\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019¨\u0006L"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "invitations", "", "Lcom/polymarket/data/ESquadReceivedInvitation;", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Callbacks;", "(Ljava/util/List;Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Callbacks;)V", "getInvitations", "()Ljava/util/List;", "Swift_invitations", "invitePresentations", "Lcom/polymarket/usviewmodels/SquadsInviteRowPresentation;", "getInvitePresentations", "Swift_invitePresentations", "acceptingInviteRowId", "", "getAcceptingInviteRowId", "()Ljava/lang/String;", "Swift_acceptingInviteRowId", "navTitle", "getNavTitle", "Swift_navTitle", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "emptyStateSubtitle", "getEmptyStateSubtitle", "Swift_emptyStateSubtitle", "declineDialogTitle", "getDeclineDialogTitle", "Swift_declineDialogTitle", "declineDialogMessage", "for_", "Swift_declineDialogMessage_0", "invitation", "declineDialogConfirmTitle", "getDeclineDialogConfirmTitle", "Swift_declineDialogConfirmTitle", "declineDialogCancelTitle", "getDeclineDialogCancelTitle", "Swift_declineDialogCancelTitle", "withRowId", "Swift_invitation_1", "rowId", "setup", "", "Swift_setup_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSquadsInvitesViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ USSquadsInvitesViewModel(List list, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<ESquadReceivedInvitation>) ((i & 1) != 0 ? null : list), (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    private final native String Swift_acceptingInviteRowId(long Swift_peer);

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_declineDialogCancelTitle(long Swift_peer);

    private final native String Swift_declineDialogConfirmTitle(long Swift_peer);

    private final native String Swift_declineDialogMessage_0(long Swift_peer, ESquadReceivedInvitation invitation);

    private final native String Swift_declineDialogTitle(long Swift_peer);

    private final native String Swift_emptyStateSubtitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native ESquadReceivedInvitation Swift_invitation_1(long Swift_peer, String rowId);

    private final native List<ESquadReceivedInvitation> Swift_invitations(long Swift_peer);

    private final native List<SquadsInviteRowPresentation> Swift_invitePresentations(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(USSquadsInvitesViewModel uSSquadsInvitesViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        uSSquadsInvitesViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String declineDialogMessage(ESquadReceivedInvitation for_) {
        for_.getClass();
        return Swift_declineDialogMessage_0(getSwift_peer(), for_);
    }

    public final String getAcceptingInviteRowId() {
        return Swift_acceptingInviteRowId(getSwift_peer());
    }

    public final String getDeclineDialogCancelTitle() {
        return Swift_declineDialogCancelTitle(getSwift_peer());
    }

    public final String getDeclineDialogConfirmTitle() {
        return Swift_declineDialogConfirmTitle(getSwift_peer());
    }

    public final String getDeclineDialogTitle() {
        return Swift_declineDialogTitle(getSwift_peer());
    }

    public final String getEmptyStateSubtitle() {
        return Swift_emptyStateSubtitle(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final List<ESquadReceivedInvitation> getInvitations() {
        return Swift_invitations(getSwift_peer());
    }

    public final List<SquadsInviteRowPresentation> getInvitePresentations() {
        return Swift_invitePresentations(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final ESquadReceivedInvitation invitation(String withRowId) {
        withRowId.getClass();
        return Swift_invitation_1(getSwift_peer(), withRowId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new USSquadsInvitesViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidAppearCase", "OnPullToRefreshCase", "OnAcceptTappedCase", "OnConfirmAcceptCase", "OnDeclineTappedCase", "OnConfirmDeclineCase", "Companion", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnAcceptTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnConfirmAcceptCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnConfirmDeclineCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnDeclineTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnViewDidAppearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnAcceptTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAcceptTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAcceptTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnConfirmAcceptCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadReceivedInvitation;", "<init>", "(Lcom/polymarket/data/ESquadReceivedInvitation;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadReceivedInvitation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmAcceptCase extends Input {
            private final ESquadReceivedInvitation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConfirmAcceptCase(ESquadReceivedInvitation eSquadReceivedInvitation) {
                super(null);
                eSquadReceivedInvitation.getClass();
                this.associated0 = eSquadReceivedInvitation;
            }

            public final ESquadReceivedInvitation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnConfirmDeclineCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadReceivedInvitation;", "<init>", "(Lcom/polymarket/data/ESquadReceivedInvitation;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadReceivedInvitation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmDeclineCase extends Input {
            private final ESquadReceivedInvitation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConfirmDeclineCase(ESquadReceivedInvitation eSquadReceivedInvitation) {
                super(null);
                eSquadReceivedInvitation.getClass();
                this.associated0 = eSquadReceivedInvitation;
            }

            public final ESquadReceivedInvitation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnDeclineTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDeclineTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDeclineTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidAppear", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Input;", "onPullToRefresh", "getOnPullToRefresh", "onAcceptTapped", "associated0", "", "onConfirmAccept", "Lcom/polymarket/data/ESquadReceivedInvitation;", "onDeclineTapped", "onConfirmDecline", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input onAcceptTapped(String associated0) {
                associated0.getClass();
                return new OnAcceptTappedCase(associated0);
            }

            public final Input onConfirmAccept(ESquadReceivedInvitation associated0) {
                associated0.getClass();
                return new OnConfirmAcceptCase(associated0);
            }

            public final Input onConfirmDecline(ESquadReceivedInvitation associated0) {
                associated0.getClass();
                return new OnConfirmDeclineCase(associated0);
            }

            public final Input onDeclineTapped(String associated0) {
                associated0.getClass();
                return new OnDeclineTappedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\rH\u0082 ¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "invitations", "", "Lcom/polymarket/data/ESquadReceivedInvitation;", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel;", "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(List<ESquadReceivedInvitation> invitations, Callbacks callbacks);

        private final native USSquadsInvitesViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, List list, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(list, callbacks);
        }

        public final USSquadsInvitesViewModel mock() {
            return Swift_Companion_mock_6();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\rJ\u0015\u0010\u0014\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsInvitesViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onInviteAccepted", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquad;", "", "(Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnInviteAccepted", "()Lkotlin/jvm/functions/Function1;", "Swift_onInviteAccepted", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function1<? super ESquad, Unit> function1) {
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1);
        }

        private final native long Swift_constructor_0(Function1<? super ESquad, Unit> onInviteAccepted);

        private final native Function1<ESquad, Unit> Swift_onInviteAccepted(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ESquad eSquad) {
            eSquad.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ESquad eSquad) {
            return _init_$lambda$0(eSquad);
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

        public final Function1<ESquad, Unit> getOnInviteAccepted() {
            return Swift_onInviteAccepted(this.Swift_peer);
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

        public /* synthetic */ Callbacks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new wmj(25) : function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSquadsInvitesViewModel(List<ESquadReceivedInvitation> list, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, list, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public USSquadsInvitesViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
