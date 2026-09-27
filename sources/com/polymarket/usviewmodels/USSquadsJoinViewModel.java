package com.polymarket.usviewmodels;

import com.polymarket.data.ESquad;
import com.polymarket.data.ESquadInvitePreview;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.hoj;
import defpackage.ug7;
import defpackage.wmj;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u0003345B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0016\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001a\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010%\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010(\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+J\u001d\u0010,\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020+H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0082 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010#\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0019¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsJoinViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "token", "", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Callbacks;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Callbacks;)V", "preview", "Lcom/polymarket/data/ESquadInvitePreview;", "getPreview", "()Lcom/polymarket/data/ESquadInvitePreview;", "Swift_preview", "isRedeeming", "", "()Z", "Swift_isRedeeming", "squadName", "getSquadName", "()Ljava/lang/String;", "Swift_squadName", "avatarPresentation", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "getAvatarPresentation", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatarPresentation", "memberCountText", "getMemberCountText", "Swift_memberCountText", "joinButtonTitle", "getJoinButtonTitle", "Swift_joinButtonTitle", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSquadsJoinViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onAcceptTapped", "onDismissed", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onAcceptTapped = new Input("onAcceptTapped", 0);
        public static final Input onDismissed = new Input("onDismissed", 1);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onAcceptTapped, onDismissed};
        }

        static {
            Input[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Input(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Input valueOf(String str) {
            return (Input) Enum.valueOf(Input.class, str);
        }

        public static Input[] values() {
            return (Input[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ USSquadsJoinViewModel(String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native SquadsProfileAvatarPresentation Swift_avatarPresentation(long Swift_peer);

    private final native boolean Swift_isRedeeming(long Swift_peer);

    private final native String Swift_joinButtonTitle(long Swift_peer);

    private final native String Swift_memberCountText(long Swift_peer);

    private final native ESquadInvitePreview Swift_preview(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_squadName(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final SquadsProfileAvatarPresentation getAvatarPresentation() {
        return Swift_avatarPresentation(getSwift_peer());
    }

    public final String getJoinButtonTitle() {
        return Swift_joinButtonTitle(getSwift_peer());
    }

    public final String getMemberCountText() {
        return Swift_memberCountText(getSwift_peer());
    }

    public final ESquadInvitePreview getPreview() {
        return Swift_preview(getSwift_peer());
    }

    public final String getSquadName() {
        return Swift_squadName(getSwift_peer());
    }

    public final boolean isRedeeming() {
        return Swift_isRedeeming(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "token", "", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USSquadsJoinViewModel;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(String token, Callbacks callbacks);

        private final native USSquadsJoinViewModel Swift_Companion_mock_3();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(str, callbacks);
        }

        public final USSquadsJoinViewModel mock() {
            return Swift_Companion_mock_3();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSquadsJoinViewModel(String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, str, callbacks), (SwiftPeerMarker) null);
        str.getClass();
        callbacks.getClass();
    }

    public USSquadsJoinViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBU\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\rJ\u0015\u0010\u0019\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JQ\u0010*\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010,\u001a\u00020\u001fH\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010,\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsJoinViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onPreviewReady", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquadInvitePreview;", "", "onJoined", "Lcom/polymarket/data/ESquad;", "onRefused", "Lkotlin/Function0;", "onRedeemFailed", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnPreviewReady", "()Lkotlin/jvm/functions/Function1;", "Swift_onPreviewReady", "getOnJoined", "Swift_onJoined", "getOnRefused", "()Lkotlin/jvm/functions/Function0;", "Swift_onRefused", "getOnRedeemFailed", "Swift_onRedeemFailed", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new wmj(26) : function1, (i & 2) != 0 ? new wmj(27) : function12, (i & 4) != 0 ? new hoj(17) : function0, (i & 8) != 0 ? new hoj(18) : function02);
        }

        private final native long Swift_constructor_0(Function1<? super ESquadInvitePreview, Unit> onPreviewReady, Function1<? super ESquad, Unit> onJoined, Function0<Unit> onRefused, Function0<Unit> onRedeemFailed);

        private final native Function1<ESquad, Unit> Swift_onJoined(long Swift_peer);

        private final native Function1<ESquadInvitePreview, Unit> Swift_onPreviewReady(long Swift_peer);

        private final native Function0<Unit> Swift_onRedeemFailed(long Swift_peer);

        private final native Function0<Unit> Swift_onRefused(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ESquadInvitePreview eSquadInvitePreview) {
            eSquadInvitePreview.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ESquad eSquad) {
            eSquad.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit c(ESquadInvitePreview eSquadInvitePreview) {
            return _init_$lambda$0(eSquadInvitePreview);
        }

        public static /* synthetic */ Unit d(ESquad eSquad) {
            return _init_$lambda$1(eSquad);
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

        public final Function1<ESquad, Unit> getOnJoined() {
            return Swift_onJoined(this.Swift_peer);
        }

        public final Function1<ESquadInvitePreview, Unit> getOnPreviewReady() {
            return Swift_onPreviewReady(this.Swift_peer);
        }

        public final Function0<Unit> getOnRedeemFailed() {
            return Swift_onRedeemFailed(this.Swift_peer);
        }

        public final Function0<Unit> getOnRefused() {
            return Swift_onRefused(this.Swift_peer);
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

        public Callbacks(Function1<? super ESquadInvitePreview, Unit> function1, Function1<? super ESquad, Unit> function12, Function0<Unit> function0, Function0<Unit> function02) {
            function1.getClass();
            function12.getClass();
            function0.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function0, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
