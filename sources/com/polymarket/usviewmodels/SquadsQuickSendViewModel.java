package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientChatMessageAttachment;
import com.polymarket.data.ESquad;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.moh;
import defpackage.u85;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0003Z[\\B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010BC\b\u0016\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012\u0012\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0018J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010:\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010F\u001a\u00020GH\u0016J\u0015\u0010H\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ3\u0010M\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010J\u001a\u00020K2\u0014\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020G0\u0014H\u0082 J\u000e\u0010P\u001a\u00020G2\u0006\u0010Q\u001a\u00020RJ\u001d\u0010S\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010Q\u001a\u00020RH\u0082 J\u0006\u0010T\u001a\u00020GJ\u0015\u0010U\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010W\u001a\u00020XH\u0016J\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010W\u001a\u00020XH\u0082 R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0011\u0010'\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u00102\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0011\u00105\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b6\u0010-R\u0011\u00108\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b9\u0010-R\u0011\u0010;\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0011\u0010>\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006]"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "content", "Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/SquadsQuickSendContent;Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;)V", "invitee", "Lcom/polymarket/usviewmodels/SquadsQuickSendInvitee;", "(Lcom/polymarket/usviewmodels/SquadsQuickSendInvitee;Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;)V", "photoPositionContent", "Lkotlin/Function0;", "makePhotoAttachment", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;)V", "tiles", "", "Lcom/polymarket/usviewmodels/SquadsQuickSendTilePresentation;", "getTiles", "()Ljava/util/List;", "Swift_tiles", "hasLoadedSquads", "", "getHasLoadedSquads", "()Z", "Swift_hasLoadedSquads", "showsQuickSend", "getShowsQuickSend", "Swift_showsQuickSend", "showsCreateSquadPrompt", "getShowsCreateSquadPrompt", "Swift_showsCreateSquadPrompt", "createSquadPromptTitle", "", "getCreateSquadPromptTitle", "()Ljava/lang/String;", "Swift_createSquadPromptTitle", "createSquadPromptSubtitle", "getCreateSquadPromptSubtitle", "Swift_createSquadPromptSubtitle", "createSquadButtonTitle", "getCreateSquadButtonTitle", "Swift_createSquadButtonTitle", "createSquadTileTitle", "getCreateSquadTileTitle", "Swift_createSquadTileTitle", "sendToAllTitle", "getSendToAllTitle", "Swift_sendToAllTitle", "showsSendToAll", "getShowsSendToAll", "Swift_showsSendToAll", "showsCreateSquadTile", "getShowsCreateSquadTile", "Swift_showsCreateSquadTile", "createSquadContext", "Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;", "getCreateSquadContext", "()Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;", "Swift_createSquadContext", "setup", "", "Swift_setup_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "Swift_sendInput_5", "resetSends", "Swift_resetSends_6", "Swift_projection", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsQuickSendViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsQuickSendViewModel(Function0<SquadsQuickSendContent> function0, Function1<? super Continuation<? super ClientChatMessageAttachment.ImageData>, ? extends Object> function1, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, function0, function1, callbacks), (SwiftPeerMarker) null);
        function0.getClass();
        function1.getClass();
        callbacks.getClass();
    }

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_createSquadButtonTitle(long Swift_peer);

    private final native SquadsViewModelCreateSquadContext Swift_createSquadContext(long Swift_peer);

    private final native String Swift_createSquadPromptSubtitle(long Swift_peer);

    private final native String Swift_createSquadPromptTitle(long Swift_peer);

    private final native String Swift_createSquadTileTitle(long Swift_peer);

    private final native boolean Swift_hasLoadedSquads(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_resetSends_6(long Swift_peer);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native String Swift_sendToAllTitle(long Swift_peer);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_showsCreateSquadPrompt(long Swift_peer);

    private final native boolean Swift_showsCreateSquadTile(long Swift_peer);

    private final native boolean Swift_showsQuickSend(long Swift_peer);

    private final native boolean Swift_showsSendToAll(long Swift_peer);

    private final native List<SquadsQuickSendTilePresentation> Swift_tiles(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(SquadsQuickSendViewModel squadsQuickSendViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        squadsQuickSendViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getCreateSquadButtonTitle() {
        return Swift_createSquadButtonTitle(getSwift_peer());
    }

    public final SquadsViewModelCreateSquadContext getCreateSquadContext() {
        return Swift_createSquadContext(getSwift_peer());
    }

    public final String getCreateSquadPromptSubtitle() {
        return Swift_createSquadPromptSubtitle(getSwift_peer());
    }

    public final String getCreateSquadPromptTitle() {
        return Swift_createSquadPromptTitle(getSwift_peer());
    }

    public final String getCreateSquadTileTitle() {
        return Swift_createSquadTileTitle(getSwift_peer());
    }

    public final boolean getHasLoadedSquads() {
        return Swift_hasLoadedSquads(getSwift_peer());
    }

    public final String getSendToAllTitle() {
        return Swift_sendToAllTitle(getSwift_peer());
    }

    public final boolean getShowsCreateSquadPrompt() {
        return Swift_showsCreateSquadPrompt(getSwift_peer());
    }

    public final boolean getShowsCreateSquadTile() {
        return Swift_showsCreateSquadTile(getSwift_peer());
    }

    public final boolean getShowsQuickSend() {
        return Swift_showsQuickSend(getSwift_peer());
    }

    public final boolean getShowsSendToAll() {
        return Swift_showsSendToAll(getSwift_peer());
    }

    public final List<SquadsQuickSendTilePresentation> getTiles() {
        return Swift_tiles(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SquadsQuickSendViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void resetSends() {
        Swift_resetSends_6(getSwift_peer());
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
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnSquadTappedCase", "OnSendToAllTappedCase", "OnCreateSquadTappedCase", "OnSquadCreatedCase", "OnDraftSquadAbandonedCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnCreateSquadTappedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnDraftSquadAbandonedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSendToAllTappedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSquadCreatedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSquadTappedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onSendToAllTapped = new OnSendToAllTappedCase();
        private static final Input onCreateSquadTapped = new OnCreateSquadTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnCreateSquadTappedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCreateSquadTappedCase extends Input {
            public OnCreateSquadTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnDraftSquadAbandonedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDraftSquadAbandonedCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDraftSquadAbandonedCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSendToAllTappedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSendToAllTappedCase extends Input {
            public OnSendToAllTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSquadCreatedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSquadCreatedCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSquadCreatedCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$OnSquadTappedCase;", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSquadTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSquadTappedCase(String str) {
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

        public static final /* synthetic */ Input access$getOnCreateSquadTapped$cp() {
            return onCreateSquadTapped;
        }

        public static final /* synthetic */ Input access$getOnSendToAllTapped$cp() {
            return onSendToAllTapped;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input$Companion;", "", "<init>", "()V", "onSquadTapped", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "associated0", "", "onSendToAllTapped", "getOnSendToAllTapped", "()Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Input;", "onCreateSquadTapped", "getOnCreateSquadTapped", "onSquadCreated", "Lcom/polymarket/data/ESquad;", "onDraftSquadAbandoned", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCreateSquadTapped() {
                return Input.access$getOnCreateSquadTapped$cp();
            }

            public final Input getOnSendToAllTapped() {
                return Input.access$getOnSendToAllTapped$cp();
            }

            public final Input onDraftSquadAbandoned(ESquad associated0) {
                associated0.getClass();
                return new OnDraftSquadAbandonedCase(associated0);
            }

            public final Input onSquadCreated(ESquad associated0) {
                associated0.getClass();
                return new OnSquadCreatedCase(associated0);
            }

            public final Input onSquadTapped(String associated0) {
                associated0.getClass();
                return new OnSquadTappedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001d\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0082 JJ\u0010\u000e\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00102\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00122\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0018H\u0082 ¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "content", "Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;", "Swift_Companion_constructor_1", "invitee", "Lcom/polymarket/usviewmodels/SquadsQuickSendInvitee;", "Swift_Companion_constructor_2", "photoPositionContent", "Lkotlin/Function0;", "makePhotoAttachment", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;)J", "mock", "Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel;", "Swift_Companion_mock_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(SquadsQuickSendContent content, Callbacks callbacks);

        private final native long Swift_Companion_constructor_1(SquadsQuickSendInvitee invitee, Callbacks callbacks);

        private final native long Swift_Companion_constructor_2(Function0<SquadsQuickSendContent> photoPositionContent, Function1<? super Continuation<? super ClientChatMessageAttachment.ImageData>, ? extends Object> makePhotoAttachment, Callbacks callbacks);

        private final native SquadsQuickSendViewModel Swift_Companion_mock_7();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, SquadsQuickSendContent squadsQuickSendContent, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(squadsQuickSendContent, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, SquadsQuickSendInvitee squadsQuickSendInvitee, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(squadsQuickSendInvitee, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, Function0 function0, Function1 function1, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(function0, function1, callbacks);
        }

        public final SquadsQuickSendViewModel mock() {
            return Swift_Companion_mock_7();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\fJ\u0015\u0010\u0013\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCreateSquad", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCreateSquad", "()Lkotlin/jvm/functions/Function0;", "Swift_onCreateSquad", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function0<Unit> function0) {
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0);
        }

        private final native long Swift_constructor_0(Function0<Unit> onCreateSquad);

        private final native Function0<Unit> Swift_onCreateSquad(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
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

        public final Function0<Unit> getOnCreateSquad() {
            return Swift_onCreateSquad(this.Swift_peer);
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

        public /* synthetic */ Callbacks(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new moh(9) : function0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsQuickSendViewModel(SquadsQuickSendContent squadsQuickSendContent, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, squadsQuickSendContent, callbacks), (SwiftPeerMarker) null);
        squadsQuickSendContent.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ SquadsQuickSendViewModel(SquadsQuickSendContent squadsQuickSendContent, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(squadsQuickSendContent, (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsQuickSendViewModel(SquadsQuickSendInvitee squadsQuickSendInvitee, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, squadsQuickSendInvitee, callbacks), (SwiftPeerMarker) null);
        squadsQuickSendInvitee.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ SquadsQuickSendViewModel(SquadsQuickSendInvitee squadsQuickSendInvitee, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(squadsQuickSendInvitee, (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    public SquadsQuickSendViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ SquadsQuickSendViewModel(Function0 function0, Function1 function1, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i & 4) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }
}
