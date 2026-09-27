package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002STB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB5\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\t\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010)\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u0015\u0010/\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00100\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u000fH\u0082 J\u0015\u00105\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00106\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u0011H\u0082 J\u0015\u0010;\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010<\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u0013H\u0082 J3\u0010=\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u0015\u0010A\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010B\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0015\u001a\u00020\u0001H\u0082 J\b\u0010N\u001a\u00020\u0001H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020 0P2\u0006\u0010Q\u001a\u00020\"H\u0016J\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020 0P2\u0006\u0010Q\u001a\u00020\"H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010>\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b?\u0010@R(\u0010C\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c\u0018\u00010DX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006U"}, d2 = {"Lcom/polymarket/data/ESquadsTutorialConfig;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "slides", "", "Lcom/polymarket/data/ESquadsTutorialSlide;", "allowsDismissal", "", "showCloseAfter", "", "finalAction", "Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;", "(Ljava/util/List;ZDLcom/polymarket/data/ESquadsTutorialConfig$FinalAction;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getSlides", "()Ljava/util/List;", "setSlides", "(Ljava/util/List;)V", "Swift_slides", "Swift_slides_set", "value", "getAllowsDismissal", "()Z", "setAllowsDismissal", "(Z)V", "Swift_allowsDismissal", "Swift_allowsDismissal_set", "getShowCloseAfter", "()D", "setShowCloseAfter", "(D)V", "Swift_showCloseAfter", "Swift_showCloseAfter_set", "getFinalAction", "()Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;", "setFinalAction", "(Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;)V", "Swift_finalAction", "Swift_finalAction_set", "Swift_constructor_0", "immediatelyDismissable", "getImmediatelyDismissable", "()Lcom/polymarket/data/ESquadsTutorialConfig;", "Swift_immediatelyDismissable", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "FinalAction", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadsTutorialConfig implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ ESquadsTutorialConfig(List list, boolean z, double d, FinalAction finalAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? 5.0d : d, (i & 8) != 0 ? FinalAction.createSquad : finalAction);
    }

    private final native boolean Swift_allowsDismissal(long Swift_peer);

    private final native void Swift_allowsDismissal_set(long Swift_peer, boolean value);

    private final native long Swift_constructor_0(List<ESquadsTutorialSlide> slides, boolean allowsDismissal, double showCloseAfter, FinalAction finalAction);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native FinalAction Swift_finalAction(long Swift_peer);

    private final native void Swift_finalAction_set(long Swift_peer, FinalAction value);

    private final native ESquadsTutorialConfig Swift_immediatelyDismissable(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_showCloseAfter(long Swift_peer);

    private final native void Swift_showCloseAfter_set(long Swift_peer, double value);

    private final native List<ESquadsTutorialSlide> Swift_slides(long Swift_peer);

    private final native void Swift_slides_set(long Swift_peer, List<ESquadsTutorialSlide> value);

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

    public final boolean getAllowsDismissal() {
        return Swift_allowsDismissal(this.Swift_peer);
    }

    public final FinalAction getFinalAction() {
        return Swift_finalAction(this.Swift_peer);
    }

    public final ESquadsTutorialConfig getImmediatelyDismissable() {
        return Swift_immediatelyDismissable(this.Swift_peer);
    }

    public final double getShowCloseAfter() {
        return Swift_showCloseAfter(this.Swift_peer);
    }

    public final List<ESquadsTutorialSlide> getSlides() {
        return Swift_slides(this.Swift_peer);
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
        return new ESquadsTutorialConfig(this);
    }

    public final void setAllowsDismissal(boolean z) {
        willmutate();
        try {
            Swift_allowsDismissal_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setFinalAction(FinalAction finalAction) {
        finalAction.getClass();
        willmutate();
        try {
            Swift_finalAction_set(this.Swift_peer, finalAction);
        } finally {
            didmutate();
        }
    }

    public final void setShowCloseAfter(double d) {
        willmutate();
        try {
            Swift_showCloseAfter_set(this.Swift_peer, d);
        } finally {
            didmutate();
        }
    }

    public final void setSlides(List<ESquadsTutorialSlide> list) {
        list.getClass();
        List<ESquadsTutorialSlide> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_slides_set(this.Swift_peer, list2);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "createSquad", ActionType.DISMISS, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FinalAction implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FinalAction[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FinalAction createSquad = new FinalAction("createSquad", 0, "createSquad", null, 2, null);
        public static final FinalAction dismiss = new FinalAction(ActionType.DISMISS, 1, ActionType.DISMISS, null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ FinalAction[] $values() {
            return new FinalAction[]{createSquad, dismiss};
        }

        static {
            FinalAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FinalAction(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FinalAction valueOf(String str) {
            return (FinalAction) Enum.valueOf(FinalAction.class, str);
        }

        public static FinalAction[] values() {
            return (FinalAction[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FinalAction init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "createSquad")) {
                    return FinalAction.createSquad;
                }
                if (Intrinsics.areEqual(rawValue, ActionType.DISMISS)) {
                    return FinalAction.dismiss;
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

        private FinalAction(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquadsTutorialConfig$Companion;", "", "<init>", "()V", "FinalAction", "Lcom/polymarket/data/ESquadsTutorialConfig$FinalAction;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinalAction FinalAction(String rawValue) {
            rawValue.getClass();
            return FinalAction.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public ESquadsTutorialConfig(List<ESquadsTutorialSlide> list, boolean z, double d, FinalAction finalAction) {
        list.getClass();
        finalAction.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, z, d, finalAction);
    }

    public ESquadsTutorialConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ESquadsTutorialConfig(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
