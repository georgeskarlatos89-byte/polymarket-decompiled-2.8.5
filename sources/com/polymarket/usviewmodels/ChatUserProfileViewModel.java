package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientChatUser;
import com.polymarket.data.EError;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.l83;
import defpackage.rx3;
import defpackage.u85;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
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
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u007f2\u00020\u0001:\u0003}~\u007fB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0082 J\u0015\u0010\u001d\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00106\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00109\u001a\u0004\u0018\u0001032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010>2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010U\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010X\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010[\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\\\u001a\u00020\u0017H\u0016J\u0015\u0010]\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010^\u001a\u00020\u00172\u0006\u0010_\u001a\u00020`H\u0096@¢\u0006\u0002\u0010aJ3\u0010b\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010_\u001a\u00020`2\u0014\u0010c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010e\u0012\u0004\u0012\u00020\u00170dH\u0082 J\u0010\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u000203J\u001f\u0010i\u001a\u0004\u0018\u00010g2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010j\u001a\u000203H\u0082 J\u000e\u0010k\u001a\u00020\u00172\u0006\u0010l\u001a\u00020mJ\u001d\u0010n\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010l\u001a\u00020mH\u0082 J\u0018\u0010o\u001a\u00020\u00172\b\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010r\u001a\u00020sJ'\u0010t\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010r\u001a\u00020sH\u0082 J\u0006\u0010u\u001a\u00020\u0017J\u0015\u0010v\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020y0x2\u0006\u0010z\u001a\u00020{H\u0016J\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020y0x2\u0006\u0010z\u001a\u00020{H\u0082 R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00107\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b8\u00105R\u0011\u0010:\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0013\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bB\u0010 R\u0011\u0010D\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bE\u00105R\u0011\u0010G\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bH\u00105R\u0011\u0010J\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bK\u00105R\u0011\u0010M\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bN\u00105R\u0011\u0010P\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bQ\u00105R\u0011\u0010S\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bT\u00105R\u0011\u0010V\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bW\u00105R\u0011\u0010Y\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bZ\u00105¨\u0006\u0080\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "user", "Lcom/polymarket/clients/ClientChatUser;", "positionScopeSource", "Lcom/polymarket/usviewmodels/USChatViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;", "(Lcom/polymarket/clients/ClientChatUser;Lcom/polymarket/usviewmodels/USChatViewModel;Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;)V", "newValue", "getCallbacks", "()Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "", "value", "quickSendVM", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel;", "getQuickSendVM", "()Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel;", "Swift_quickSendVM", "isSquadMate", "", "()Z", "Swift_isSquadMate", "positions", "", "Lcom/polymarket/usviewmodels/SquadsPositionRowPresentation;", "getPositions", "()Ljava/util/List;", "Swift_positions", "isLoading", "Swift_isLoading", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "showsPositions", "getShowsPositions", "Swift_showsPositions", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "Swift_displayName", "username", "getUsername", "Swift_username", "avatarUserId", "getAvatarUserId", "Swift_avatarUserId", "avatarUrl", "Ljava/net/URI;", "getAvatarUrl", "()Ljava/net/URI;", "Swift_avatarUrl", "isVerified", "Swift_isVerified", "reportMenuActionTitle", "getReportMenuActionTitle", "Swift_reportMenuActionTitle", "invitePromptTitle", "getInvitePromptTitle", "Swift_invitePromptTitle", "inviteSectionTitle", "getInviteSectionTitle", "Swift_inviteSectionTitle", "positionsSectionTitle", "getPositionsSectionTitle", "Swift_positionsSectionTitle", "positionsEmptyStateTitle", "getPositionsEmptyStateTitle", "Swift_positionsEmptyStateTitle", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "setup", "Swift_setup_1", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_2", "f_callback", "Lkotlin/Function1;", "", "positionEntity", "Lcom/polymarket/data/EUserPosition;", "forID", "Swift_positionEntity_3", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "Swift_sendInput_4", "recordJoin", "context", "Lcom/polymarket/usviewmodels/SquadsPositionJoinContext;", "execution", "Lcom/polymarket/usviewmodels/TradeExecution;", "Swift_recordJoin_5", "refreshAfterTrade", "Swift_refreshAfterTrade_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatUserProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ChatUserProfileViewModel(ClientChatUser clientChatUser, USChatViewModel uSChatViewModel, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientChatUser, (i & 2) != 0 ? null : uSChatViewModel, (i & 4) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native URI Swift_avatarUrl(long Swift_peer);

    private final native String Swift_avatarUserId(long Swift_peer);

    private final native void Swift_callback_performLoad_2(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native String Swift_invitePromptTitle(long Swift_peer);

    private final native String Swift_inviteSectionTitle(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isSquadMate(long Swift_peer);

    private final native boolean Swift_isVerified(long Swift_peer);

    private final native EError Swift_loadError(long Swift_peer);

    private final native EUserPosition Swift_positionEntity_3(long Swift_peer, String id);

    private final native List<SquadsPositionRowPresentation> Swift_positions(long Swift_peer);

    private final native String Swift_positionsEmptyStateTitle(long Swift_peer);

    private final native String Swift_positionsSectionTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native SquadsQuickSendViewModel Swift_quickSendVM(long Swift_peer);

    private final native void Swift_recordJoin_5(long Swift_peer, SquadsPositionJoinContext context, TradeExecution execution);

    private final native void Swift_refreshAfterTrade_6(long Swift_peer);

    private final native String Swift_reportMenuActionTitle(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showsPositions(long Swift_peer);

    private final native String Swift_username(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_2(ChatUserProfileViewModel chatUserProfileViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        chatUserProfileViewModel.Swift_callback_performLoad_2(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final URI getAvatarUrl() {
        return Swift_avatarUrl(getSwift_peer());
    }

    public final String getAvatarUserId() {
        return Swift_avatarUserId(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final String getDisplayName() {
        return Swift_displayName(getSwift_peer());
    }

    public final String getErrorRetryButtonTitle() {
        return Swift_errorRetryButtonTitle(getSwift_peer());
    }

    public final String getErrorSubtitle() {
        return Swift_errorSubtitle(getSwift_peer());
    }

    public final String getErrorTitle() {
        return Swift_errorTitle(getSwift_peer());
    }

    public final String getInvitePromptTitle() {
        return Swift_invitePromptTitle(getSwift_peer());
    }

    public final String getInviteSectionTitle() {
        return Swift_inviteSectionTitle(getSwift_peer());
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final List<SquadsPositionRowPresentation> getPositions() {
        return Swift_positions(getSwift_peer());
    }

    public final String getPositionsEmptyStateTitle() {
        return Swift_positionsEmptyStateTitle(getSwift_peer());
    }

    public final String getPositionsSectionTitle() {
        return Swift_positionsSectionTitle(getSwift_peer());
    }

    public final SquadsQuickSendViewModel getQuickSendVM() {
        return Swift_quickSendVM(getSwift_peer());
    }

    public final String getReportMenuActionTitle() {
        return Swift_reportMenuActionTitle(getSwift_peer());
    }

    public final boolean getShowsPositions() {
        return Swift_showsPositions(getSwift_peer());
    }

    public final String getUsername() {
        return Swift_username(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isSquadMate() {
        return Swift_isSquadMate(getSwift_peer());
    }

    public final boolean isVerified() {
        return Swift_isVerified(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new ChatUserProfileViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final EUserPosition positionEntity(String forID) {
        forID.getClass();
        return Swift_positionEntity_3(getSwift_peer(), forID);
    }

    public final void recordJoin(SquadsPositionJoinContext context, TradeExecution execution) {
        execution.getClass();
        Swift_recordJoin_5(getSwift_peer(), context, execution);
    }

    public final void refreshAfterTrade() {
        Swift_refreshAfterTrade_6(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), (Callbacks) StructKt.sref$default(callbacks, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnRetryCase", "OnTailCase", "OnFadeCase", "OnSellCase", "Companion", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnTailCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onRetry = new OnRetryCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFadeCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFadeCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSellCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$OnTailCase;", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTailCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTailCase(String str) {
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

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input$Companion;", "", "<init>", "()V", "onRetry", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "getOnRetry", "()Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Input;", "onTail", "associated0", "", "onFade", "onSell", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input onFade(String associated0) {
                associated0.getClass();
                return new OnFadeCase(associated0);
            }

            public final Input onSell(String associated0) {
                associated0.getClass();
                return new OnSellCase(associated0);
            }

            public final Input onTail(String associated0) {
                associated0.getClass();
                return new OnTailCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "user", "Lcom/polymarket/clients/ClientChatUser;", "positionScopeSource", "Lcom/polymarket/usviewmodels/USChatViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/ChatUserProfileViewModel;", "Swift_Companion_mock_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(ClientChatUser user, USChatViewModel positionScopeSource, Callbacks callbacks);

        private final native ChatUserProfileViewModel Swift_Companion_mock_7();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, ClientChatUser clientChatUser, USChatViewModel uSChatViewModel, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(clientChatUser, uSChatViewModel, callbacks);
        }

        public final ChatUserProfileViewModel mock() {
            return Swift_Companion_mock_7();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUserProfileViewModel(ClientChatUser clientChatUser, USChatViewModel uSChatViewModel, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, clientChatUser, uSChatViewModel, callbacks), (SwiftPeerMarker) null);
        clientChatUser.getClass();
        callbacks.getClass();
    }

    public ChatUserProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB[\b\u0016\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\t\u0010\u0015B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\rJ\u0015\u0010\u001d\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010-\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00102\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J!\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00106\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000fH\u0082 JW\u00107\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0015\u00108\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0016\u001a\u00020\u0001H\u0082 J\b\u0010A\u001a\u00020\u0001H\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010C\u001a\u00020#H\u0016J\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010C\u001a\u00020#H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010)\"\u0004\b0\u0010+R<\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R(\u00109\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001a\u0010<\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006F"}, d2 = {"Lcom/polymarket/usviewmodels/ChatUserProfileViewModel$Callbacks;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCreateSquad", "Lkotlin/Function0;", "", "onOpenPositionTrading", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/SquadsPositionTradeRequest;", "onOpenComboCheckout", "Lcom/polymarket/usviewmodels/SquadsComboJoinRequest;", "onOpenSell", "Lcom/polymarket/data/EUserPosition;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCreateSquad", "()Lkotlin/jvm/functions/Function0;", "Swift_onCreateSquad", "newValue", "getOnOpenPositionTrading", "()Lkotlin/jvm/functions/Function1;", "setOnOpenPositionTrading", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onOpenPositionTrading", "Swift_onOpenPositionTrading_set", "value", "getOnOpenComboCheckout", "setOnOpenComboCheckout", "Swift_onOpenComboCheckout", "Swift_onOpenComboCheckout_set", "getOnOpenSell", "setOnOpenSell", "Swift_onOpenSell", "Swift_onOpenSell_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "getSupdate", "setSupdate", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new l83(26) : function0, (i & 2) != 0 ? new rx3(3) : function1, (i & 4) != 0 ? new rx3(4) : function12, (i & 8) != 0 ? new rx3(5) : function13);
        }

        private final native long Swift_constructor_0(Function0<Unit> onCreateSquad, Function1<? super SquadsPositionTradeRequest, Unit> onOpenPositionTrading, Function1<? super SquadsComboJoinRequest, Unit> onOpenComboCheckout, Function1<? super EUserPosition, Unit> onOpenSell);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Function0<Unit> Swift_onCreateSquad(long Swift_peer);

        private final native Function1<SquadsComboJoinRequest, Unit> Swift_onOpenComboCheckout(long Swift_peer);

        private final native void Swift_onOpenComboCheckout_set(long Swift_peer, Function1<? super SquadsComboJoinRequest, Unit> value);

        private final native Function1<SquadsPositionTradeRequest, Unit> Swift_onOpenPositionTrading(long Swift_peer);

        private final native void Swift_onOpenPositionTrading_set(long Swift_peer, Function1<? super SquadsPositionTradeRequest, Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onOpenSell(long Swift_peer);

        private final native void Swift_onOpenSell_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            squadsPositionTradeRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(SquadsComboJoinRequest squadsComboJoinRequest) {
            squadsComboJoinRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit b(EUserPosition eUserPosition) {
            return _init_$lambda$3(eUserPosition);
        }

        public static /* synthetic */ Unit c(SquadsComboJoinRequest squadsComboJoinRequest) {
            return _init_$lambda$2(squadsComboJoinRequest);
        }

        public static /* synthetic */ Unit d(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            return _init_$lambda$1(squadsPositionTradeRequest);
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

        public final Function0<Unit> getOnCreateSquad() {
            return Swift_onCreateSquad(this.Swift_peer);
        }

        public final Function1<SquadsComboJoinRequest, Unit> getOnOpenComboCheckout() {
            return Swift_onOpenComboCheckout(this.Swift_peer);
        }

        public final Function1<SquadsPositionTradeRequest, Unit> getOnOpenPositionTrading() {
            return Swift_onOpenPositionTrading(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnOpenSell() {
            return Swift_onOpenSell(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
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
            return new Callbacks(this);
        }

        public final void setOnOpenComboCheckout(Function1<? super SquadsComboJoinRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenComboCheckout_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenPositionTrading(Function1<? super SquadsPositionTradeRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenPositionTrading_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenSell(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenSell_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
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

        public Callbacks(Function0<Unit> function0, Function1<? super SquadsPositionTradeRequest, Unit> function1, Function1<? super SquadsComboJoinRequest, Unit> function12, Function1<? super EUserPosition, Unit> function13) {
            function0.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1, function12, function13);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Callbacks(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
