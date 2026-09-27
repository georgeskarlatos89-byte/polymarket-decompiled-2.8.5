package com.polymarket.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB;\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0012B\u0011\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010&\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\fH\u0082 J\u0015\u0010+\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010,\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\fH\u0082 J\u0015\u00101\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00102\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u000fH\u0082 J\u0015\u00105\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00106\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u000fH\u0082 J\u0015\u00109\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010:\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u000fH\u0082 J5\u0010;\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082 J\u0015\u0010<\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0082 J\b\u0010H\u001a\u00020\u0001H\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0J2\u0006\u0010K\u001a\u00020 H\u0016J\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001e0J2\u0006\u0010K\u001a\u00020 H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a\u0018\u00010>X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/polymarket/data/EEventConfig;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "generalEventsFormat", "Lcom/polymarket/data/OddsFormat;", "sportsEventsFormat", "showComments", "", "showXContent", "xycStatus", "(Lcom/polymarket/data/OddsFormat;Lcom/polymarket/data/OddsFormat;ZZZ)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getGeneralEventsFormat", "()Lcom/polymarket/data/OddsFormat;", "setGeneralEventsFormat", "(Lcom/polymarket/data/OddsFormat;)V", "Swift_generalEventsFormat", "Swift_generalEventsFormat_set", "value", "getSportsEventsFormat", "setSportsEventsFormat", "Swift_sportsEventsFormat", "Swift_sportsEventsFormat_set", "getShowComments", "()Z", "setShowComments", "(Z)V", "Swift_showComments", "Swift_showComments_set", "getShowXContent", "setShowXContent", "Swift_showXContent", "Swift_showXContent_set", "getXycStatus", "setXycStatus", "Swift_xycStatus", "Swift_xycStatus_set", "Swift_constructor_0", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EEventConfig implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EEventConfig(com.polymarket.data.OddsFormat r2, com.polymarket.data.OddsFormat r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.polymarket.data.OddsFormat r2 = com.polymarket.data.OddsFormat.percentage
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            com.polymarket.data.OddsFormat r3 = com.polymarket.data.OddsFormat.percentage
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EEventConfig.<init>(com.polymarket.data.OddsFormat, com.polymarket.data.OddsFormat, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final native long Swift_constructor_0(OddsFormat generalEventsFormat, OddsFormat sportsEventsFormat, boolean showComments, boolean showXContent, boolean xycStatus);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native OddsFormat Swift_generalEventsFormat(long Swift_peer);

    private final native void Swift_generalEventsFormat_set(long Swift_peer, OddsFormat value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_showComments(long Swift_peer);

    private final native void Swift_showComments_set(long Swift_peer, boolean value);

    private final native boolean Swift_showXContent(long Swift_peer);

    private final native void Swift_showXContent_set(long Swift_peer, boolean value);

    private final native OddsFormat Swift_sportsEventsFormat(long Swift_peer);

    private final native void Swift_sportsEventsFormat_set(long Swift_peer, OddsFormat value);

    private final native boolean Swift_xycStatus(long Swift_peer);

    private final native void Swift_xycStatus_set(long Swift_peer, boolean value);

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

    public final OddsFormat getGeneralEventsFormat() {
        return Swift_generalEventsFormat(this.Swift_peer);
    }

    public final boolean getShowComments() {
        return Swift_showComments(this.Swift_peer);
    }

    public final boolean getShowXContent() {
        return Swift_showXContent(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final OddsFormat getSportsEventsFormat() {
        return Swift_sportsEventsFormat(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final boolean getXycStatus() {
        return Swift_xycStatus(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EEventConfig(this);
    }

    public final void setGeneralEventsFormat(OddsFormat oddsFormat) {
        oddsFormat.getClass();
        willmutate();
        try {
            Swift_generalEventsFormat_set(this.Swift_peer, oddsFormat);
        } finally {
            didmutate();
        }
    }

    public final void setShowComments(boolean z) {
        willmutate();
        try {
            Swift_showComments_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setShowXContent(boolean z) {
        willmutate();
        try {
            Swift_showXContent_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSportsEventsFormat(OddsFormat oddsFormat) {
        oddsFormat.getClass();
        willmutate();
        try {
            Swift_sportsEventsFormat_set(this.Swift_peer, oddsFormat);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setXycStatus(boolean z) {
        willmutate();
        try {
            Swift_xycStatus_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nJ1\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventConfig$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/data/EEventConfig;", "generalEventsFormat", "Lcom/polymarket/data/OddsFormat;", "sportsEventsFormat", "showComments", "", "showXContent", "xycStatus", "Swift_Companion_mock_1", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EEventConfig Swift_Companion_mock_1(OddsFormat generalEventsFormat, OddsFormat sportsEventsFormat, boolean showComments, boolean showXContent, boolean xycStatus);

        public static /* synthetic */ EEventConfig mock$default(Companion companion, OddsFormat oddsFormat, OddsFormat oddsFormat2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            boolean z4;
            boolean z5;
            OddsFormat oddsFormat3;
            boolean z6;
            Companion companion2;
            OddsFormat oddsFormat4;
            if ((i & 1) != 0) {
                oddsFormat = OddsFormat.percentage;
            }
            if ((i & 2) != 0) {
                oddsFormat2 = OddsFormat.percentage;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            if ((i & 16) != 0) {
                z4 = false;
                z6 = z;
                z5 = z2;
                oddsFormat4 = oddsFormat;
                oddsFormat3 = oddsFormat2;
                companion2 = companion;
            } else {
                z4 = z3;
                z5 = z2;
                oddsFormat3 = oddsFormat2;
                z6 = z;
                companion2 = companion;
                oddsFormat4 = oddsFormat;
            }
            return companion2.mock(oddsFormat4, oddsFormat3, z6, z5, z4);
        }

        public final EEventConfig mock(OddsFormat generalEventsFormat, OddsFormat sportsEventsFormat, boolean showComments, boolean showXContent, boolean xycStatus) {
            generalEventsFormat.getClass();
            sportsEventsFormat.getClass();
            return Swift_Companion_mock_1(generalEventsFormat, sportsEventsFormat, showComments, showXContent, xycStatus);
        }

        private Companion() {
        }
    }

    public EEventConfig(OddsFormat oddsFormat, OddsFormat oddsFormat2, boolean z, boolean z2, boolean z3) {
        oddsFormat.getClass();
        oddsFormat2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(oddsFormat, oddsFormat2, z, z2, z3);
    }

    public EEventConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EEventConfig(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
