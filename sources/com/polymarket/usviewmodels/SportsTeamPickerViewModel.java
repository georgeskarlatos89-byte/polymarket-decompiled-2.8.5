package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EError;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.ETournamentGroupUS;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.h6h;
import defpackage.k2h;
import defpackage.u85;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Set;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 W2\u00020\u0001:\u0003UVWB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bBK\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0007\u0010\u0014J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020\nJ\u001d\u0010>\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010=\u001a\u00020\nH\u0082 J\u0015\u0010@\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010A\u001a\u00020BH\u0016J\u0015\u0010C\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020FH\u0096@¢\u0006\u0002\u0010GJ3\u0010H\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010E\u001a\u00020F2\u0014\u0010I\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010K\u0012\u0004\u0012\u00020B0JH\u0082 J\u000e\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020NJ\u001d\u0010O\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010M\u001a\u00020NH\u0082 J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020+H\u0016J\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020+H\u0082 R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u00104R\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u00104R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b?\u00104¨\u0006X"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "leagueSlug", "", "seededGroups", "", "Lcom/polymarket/data/ETournamentGroupUS;", "seededTeams", "Lcom/polymarket/data/ESportsTeam;", "entrySource", "Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource;", "callbacks", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Callbacks;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource;Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Callbacks;)V", "conferences", "Lcom/polymarket/usviewmodels/SportsTeamPickerConference;", "getConferences", "()Ljava/util/List;", "Swift_conferences", "selectedTeamIds", "", "getSelectedTeamIds", "()Ljava/util/Set;", "Swift_selectedTeamIds", "isCommitting", "", "()Z", "Swift_isCommitting", "error", "Lcom/polymarket/data/EError;", "getError", "()Lcom/polymarket/data/EError;", "Swift_error", "isLoaded", "Swift_isLoaded", "selectedCount", "", "getSelectedCount", "()I", "Swift_selectedCount", "showsContinueButton", "getShowsContinueButton", "Swift_showsContinueButton", "headline", "getHeadline", "()Ljava/lang/String;", "Swift_headline", "subtitle", "getSubtitle", "Swift_subtitle", "continueButtonTitle", "getContinueButtonTitle", "Swift_continueButtonTitle", "isTeamSelected", "teamId", "Swift_isTeamSelected_0", "getLeagueSlug", "Swift_leagueSlug", "setup", "", "Swift_setup_2", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_3", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "Swift_sendInput_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportsTeamPickerViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ SportsTeamPickerViewModel(String str, List list, List list2, SportsTeamPickerEntrySource sportsTeamPickerEntrySource, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : sportsTeamPickerEntrySource, (i & 16) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native void Swift_callback_performLoad_3(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native List<SportsTeamPickerConference> Swift_conferences(long Swift_peer);

    private final native String Swift_continueButtonTitle(long Swift_peer);

    private final native EError Swift_error(long Swift_peer);

    private final native String Swift_headline(long Swift_peer);

    private final native boolean Swift_isCommitting(long Swift_peer);

    private final native boolean Swift_isLoaded(long Swift_peer);

    private final native boolean Swift_isTeamSelected_0(long Swift_peer, String teamId);

    private final native String Swift_leagueSlug(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_selectedCount(long Swift_peer);

    private final native Set<String> Swift_selectedTeamIds(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_2(long Swift_peer);

    private final native boolean Swift_showsContinueButton(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_3(SportsTeamPickerViewModel sportsTeamPickerViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        sportsTeamPickerViewModel.Swift_callback_performLoad_3(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<SportsTeamPickerConference> getConferences() {
        return Swift_conferences(getSwift_peer());
    }

    public final String getContinueButtonTitle() {
        return Swift_continueButtonTitle(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final String getHeadline() {
        return Swift_headline(getSwift_peer());
    }

    public final String getLeagueSlug() {
        return Swift_leagueSlug(getSwift_peer());
    }

    public final int getSelectedCount() {
        return Swift_selectedCount(getSwift_peer());
    }

    public final Set<String> getSelectedTeamIds() {
        return Swift_selectedTeamIds(getSwift_peer());
    }

    public final boolean getShowsContinueButton() {
        return Swift_showsContinueButton(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final boolean isCommitting() {
        return Swift_isCommitting(getSwift_peer());
    }

    public final boolean isLoaded() {
        return Swift_isLoaded(getSwift_peer());
    }

    public final boolean isTeamSelected(String teamId) {
        teamId.getClass();
        return Swift_isTeamSelected_0(getSwift_peer(), teamId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SportsTeamPickerViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnTeamToggledCase", "OnContinueCase", "OnDismissedCase", "OnRetryCase", "Companion", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnDismissedCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnTeamToggledCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onContinue = new OnContinueCase();
        private static final Input onDismissed = new OnDismissedCase();
        private static final Input onRetry = new OnRetryCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnDismissedCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissedCase extends Input {
            public OnDismissedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnTeamToggledCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "teamId", "getTeamId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTeamToggledCase extends Input {
            private final String associated0;
            private final String teamId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTeamToggledCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.teamId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getTeamId() {
                return this.teamId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnDismissed$cp() {
            return onDismissed;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Input;", "onTeamToggled", "teamId", "", "onContinue", "getOnContinue", "onDismissed", "getOnDismissed", "onRetry", "getOnRetry", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnDismissed() {
                return Input.access$getOnDismissed$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onTeamToggled(String teamId) {
                teamId.getClass();
                return new OnTeamToggledCase(teamId);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0013H\u0082 ¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "leagueSlug", "", "seededGroups", "", "Lcom/polymarket/data/ETournamentGroupUS;", "seededTeams", "Lcom/polymarket/data/ESportsTeam;", "entrySource", "Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource;", "callbacks", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel;", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(String leagueSlug, List<ETournamentGroupUS> seededGroups, List<ESportsTeam> seededTeams, SportsTeamPickerEntrySource entrySource, Callbacks callbacks);

        private final native SportsTeamPickerViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, String str, List list, List list2, SportsTeamPickerEntrySource sportsTeamPickerEntrySource, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(str, list, list2, sportsTeamPickerEntrySource, callbacks);
        }

        public final SportsTeamPickerViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\rJ\u0015\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onContinueToTeam", "Lkotlin/Function1;", "Lcom/polymarket/data/ESportsTeam;", "", "onDone", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnContinueToTeam", "()Lkotlin/jvm/functions/Function1;", "Swift_onContinueToTeam", "getOnDone", "()Lkotlin/jvm/functions/Function0;", "Swift_onDone", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super ESportsTeam, Unit>) ((i & 1) != 0 ? new h6h(15) : function1), (Function0<Unit>) ((i & 2) != 0 ? new k2h(18) : function0));
        }

        private final native long Swift_constructor_0(Function1<? super ESportsTeam, Unit> onContinueToTeam, Function0<Unit> onDone);

        private final native Function1<ESportsTeam, Unit> Swift_onContinueToTeam(long Swift_peer);

        private final native Function0<Unit> Swift_onDone(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ESportsTeam eSportsTeam) {
            eSportsTeam.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b(ESportsTeam eSportsTeam) {
            return _init_$lambda$0(eSportsTeam);
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

        public final Function1<ESportsTeam, Unit> getOnContinueToTeam() {
            return Swift_onContinueToTeam(this.Swift_peer);
        }

        public final Function0<Unit> getOnDone() {
            return Swift_onDone(this.Swift_peer);
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

        public Callbacks(Function1<? super ESportsTeam, Unit> function1, Function0<Unit> function0) {
            function1.getClass();
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsTeamPickerViewModel(String str, List<ETournamentGroupUS> list, List<ESportsTeam> list2, SportsTeamPickerEntrySource sportsTeamPickerEntrySource, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, str, list, list2, sportsTeamPickerEntrySource, callbacks), (SwiftPeerMarker) null);
        str.getClass();
        callbacks.getClass();
    }

    public SportsTeamPickerViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
