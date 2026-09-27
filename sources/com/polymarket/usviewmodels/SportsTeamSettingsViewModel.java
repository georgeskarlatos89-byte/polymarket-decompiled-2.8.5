package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientChatUser;
import com.polymarket.data.ESportsTeam;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.SportsTeamHeroPresentation;
import com.polymarket.usviewmodels.USSquadsSettingsViewModel;
import defpackage.h6h;
import defpackage.u85;
import defpackage.ug7;
import defpackage.wgg;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 X2\u00020\u0001:\u0004UVWXB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00103\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00106\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00109\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010?\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010@\u001a\u00020AH\u0016J\u0015\u0010B\u001a\u00020A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020EH\u0096@¢\u0006\u0002\u0010FJ3\u0010G\u001a\u00020A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010D\u001a\u00020E2\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010J\u0012\u0004\u0012\u00020A0IH\u0082 J\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020MJ\u001d\u0010N\u001a\u00020A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010L\u001a\u00020MH\u0082 J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020SH\u0016J\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020SH\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00198F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010.\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u00101\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0011\u00104\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u0011\u00107\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R\u0011\u0010:\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b;\u0010\u0016R\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b>\u0010\u0016¨\u0006Y"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "parent", "Lcom/polymarket/usviewmodels/SportsTeamViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/SportsTeamViewModel;Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Callbacks;)V", "team", "Lcom/polymarket/data/ESportsTeam;", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "stats", "", "Lcom/polymarket/usviewmodels/SportsTeamHeroPresentation$Stat;", "getStats", "()Ljava/util/List;", "Swift_stats", "isFavorited", "", "()Z", "Swift_isFavorited", "showsChatOptions", "getShowsChatOptions", "Swift_showsChatOptions", "muteState", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$MuteState;", "getMuteState", "()Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$MuteState;", "Swift_muteState", "memberRows", "Lcom/polymarket/usviewmodels/SquadsSettingsUserRowPresentation;", "getMemberRows", "Swift_memberRows", "hasLoadedMembers", "getHasLoadedMembers", "Swift_hasLoadedMembers", "muteOptionTitle", "getMuteOptionTitle", "Swift_muteOptionTitle", "muteMenuTitle", "getMuteMenuTitle", "Swift_muteMenuTitle", "favoriteOptionTitle", "getFavoriteOptionTitle", "Swift_favoriteOptionTitle", "membersSectionTitle", "getMembersSectionTitle", "Swift_membersSectionTitle", "inviteNewMembersTitle", "getInviteNewMembersTitle", "Swift_inviteNewMembersTitle", "setup", "", "Swift_setup_1", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_2", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "Swift_sendInput_3", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "MuteState", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportsTeamSettingsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$MuteState;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "unmuted", "muted", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MuteState implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MuteState[] $VALUES;
        public static final MuteState unmuted = new MuteState("unmuted", 0);
        public static final MuteState muted = new MuteState("muted", 1);

        private static final /* synthetic */ MuteState[] $values() {
            return new MuteState[]{unmuted, muted};
        }

        static {
            MuteState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private MuteState(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MuteState valueOf(String str) {
            return (MuteState) Enum.valueOf(MuteState.class, str);
        }

        public static MuteState[] values() {
            return (MuteState[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsTeamSettingsViewModel(SportsTeamViewModel sportsTeamViewModel, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, sportsTeamViewModel, callbacks), (SwiftPeerMarker) null);
        sportsTeamViewModel.getClass();
        callbacks.getClass();
    }

    private final native void Swift_callback_performLoad_2(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_favoriteOptionTitle(long Swift_peer);

    private final native boolean Swift_hasLoadedMembers(long Swift_peer);

    private final native String Swift_inviteNewMembersTitle(long Swift_peer);

    private final native boolean Swift_isFavorited(long Swift_peer);

    private final native List<SquadsSettingsUserRowPresentation> Swift_memberRows(long Swift_peer);

    private final native String Swift_membersSectionTitle(long Swift_peer);

    private final native String Swift_muteMenuTitle(long Swift_peer);

    private final native String Swift_muteOptionTitle(long Swift_peer);

    private final native MuteState Swift_muteState(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showsChatOptions(long Swift_peer);

    private final native List<SportsTeamHeroPresentation.Stat> Swift_stats(long Swift_peer);

    private final native ESportsTeam Swift_team(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_2(SportsTeamSettingsViewModel sportsTeamSettingsViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        sportsTeamSettingsViewModel.Swift_callback_performLoad_2(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getFavoriteOptionTitle() {
        return Swift_favoriteOptionTitle(getSwift_peer());
    }

    public final boolean getHasLoadedMembers() {
        return Swift_hasLoadedMembers(getSwift_peer());
    }

    public final String getInviteNewMembersTitle() {
        return Swift_inviteNewMembersTitle(getSwift_peer());
    }

    public final List<SquadsSettingsUserRowPresentation> getMemberRows() {
        return Swift_memberRows(getSwift_peer());
    }

    public final String getMembersSectionTitle() {
        return Swift_membersSectionTitle(getSwift_peer());
    }

    public final String getMuteMenuTitle() {
        return Swift_muteMenuTitle(getSwift_peer());
    }

    public final String getMuteOptionTitle() {
        return Swift_muteOptionTitle(getSwift_peer());
    }

    public final MuteState getMuteState() {
        return Swift_muteState(getSwift_peer());
    }

    public final boolean getShowsChatOptions() {
        return Swift_showsChatOptions(getSwift_peer());
    }

    public final List<SportsTeamHeroPresentation.Stat> getStats() {
        return Swift_stats(getSwift_peer());
    }

    public final ESportsTeam getTeam() {
        return Swift_team(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isFavorited() {
        return Swift_isFavorited(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SportsTeamSettingsViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidAppearCase", "OnShareCase", "OnToggleFavoriteCase", "OnMuteChatCase", "OnUnmuteChatCase", "OnInviteNewMembersCase", "OnMemberSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnInviteNewMembersCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnMemberSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnMuteChatCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnToggleFavoriteCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnUnmuteChatCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnViewDidAppearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onShare = new OnShareCase();
        private static final Input onToggleFavorite = new OnToggleFavoriteCase();
        private static final Input onUnmuteChat = new OnUnmuteChatCase();
        private static final Input onInviteNewMembers = new OnInviteNewMembersCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnInviteNewMembersCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteNewMembersCase extends Input {
            public OnInviteNewMembersCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnMemberSelectedCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMemberSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMemberSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnMuteChatCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "<init>", "(Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMuteChatCase extends Input {
            private final USSquadsSettingsViewModel.MuteDuration associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMuteChatCase(USSquadsSettingsViewModel.MuteDuration muteDuration) {
                super(null);
                muteDuration.getClass();
                this.associated0 = muteDuration;
            }

            public final USSquadsSettingsViewModel.MuteDuration getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnToggleFavoriteCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleFavoriteCase extends Input {
            public OnToggleFavoriteCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnUnmuteChatCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnUnmuteChatCase extends Input {
            public OnUnmuteChatCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnInviteNewMembers$cp() {
            return onInviteNewMembers;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnToggleFavorite$cp() {
            return onToggleFavorite;
        }

        public static final /* synthetic */ Input access$getOnUnmuteChat$cp() {
            return onUnmuteChat;
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
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidAppear", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Input;", "onShare", "getOnShare", "onToggleFavorite", "getOnToggleFavorite", "onMuteChat", "associated0", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "onUnmuteChat", "getOnUnmuteChat", "onInviteNewMembers", "getOnInviteNewMembers", "onMemberSelected", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnInviteNewMembers() {
                return Input.access$getOnInviteNewMembers$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnToggleFavorite() {
                return Input.access$getOnToggleFavorite$cp();
            }

            public final Input getOnUnmuteChat() {
                return Input.access$getOnUnmuteChat$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input onMemberSelected(String associated0) {
                associated0.getClass();
                return new OnMemberSelectedCase(associated0);
            }

            public final Input onMuteChat(USSquadsSettingsViewModel.MuteDuration associated0) {
                associated0.getClass();
                return new OnMuteChatCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "parent", "Lcom/polymarket/usviewmodels/SportsTeamViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel;", "team", "Lcom/polymarket/data/ESportsTeam;", "Swift_Companion_mock_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(SportsTeamViewModel parent, Callbacks callbacks);

        private final native SportsTeamSettingsViewModel Swift_Companion_mock_4(ESportsTeam team);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, SportsTeamViewModel sportsTeamViewModel, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(sportsTeamViewModel, callbacks);
        }

        public final SportsTeamSettingsViewModel mock(ESportsTeam team) {
            team.getClass();
            return Swift_Companion_mock_4(team);
        }

        private Companion() {
        }
    }

    public SportsTeamSettingsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ SportsTeamSettingsViewModel(SportsTeamViewModel sportsTeamViewModel, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportsTeamViewModel, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\rJ\u0015\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010(\u001a\u00020\u001eH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010(\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamSettingsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onShare", "Lkotlin/Function1;", "Ljava/net/URI;", "", "onMemberSelected", "Lkotlin/Function2;", "Lcom/polymarket/clients/ClientChatUser;", "Lcom/polymarket/usviewmodels/USChatViewModel;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnShare", "()Lkotlin/jvm/functions/Function1;", "Swift_onShare", "getOnMemberSelected", "()Lkotlin/jvm/functions/Function2;", "Swift_onMemberSelected", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super URI, Unit>) ((i & 1) != 0 ? new h6h(17) : function1), (Function2<? super ClientChatUser, ? super USChatViewModel, Unit>) ((i & 2) != 0 ? new wgg(23) : function2));
        }

        private final native long Swift_constructor_0(Function1<? super URI, Unit> onShare, Function2<? super ClientChatUser, ? super USChatViewModel, Unit> onMemberSelected);

        private final native Function2<ClientChatUser, USChatViewModel, Unit> Swift_onMemberSelected(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onShare(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ClientChatUser clientChatUser, USChatViewModel uSChatViewModel) {
            clientChatUser.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(URI uri) {
            return _init_$lambda$0(uri);
        }

        public static /* synthetic */ Unit b(ClientChatUser clientChatUser, USChatViewModel uSChatViewModel) {
            return _init_$lambda$1(clientChatUser, uSChatViewModel);
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

        public final Function2<ClientChatUser, USChatViewModel, Unit> getOnMemberSelected() {
            return Swift_onMemberSelected(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
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

        public Callbacks(Function1<? super URI, Unit> function1, Function2<? super ClientChatUser, ? super USChatViewModel, Unit> function2) {
            function1.getClass();
            function2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function2);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
