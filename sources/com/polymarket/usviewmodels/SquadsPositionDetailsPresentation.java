package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000234B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J7\u0010(\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0013\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u001bH\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010&¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "valueTitle", "", "valueText", "emphasis", "Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation$Emphasis;", "deltaText", "isDeltaGain", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation$Emphasis;Ljava/lang/String;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getValueTitle", "()Ljava/lang/String;", "Swift_valueTitle", "getValueText", "Swift_valueText", "getEmphasis", "()Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation$Emphasis;", "Swift_emphasis", "getDeltaText", "Swift_deltaText", "()Z", "Swift_isDeltaGain", "Swift_constructor_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Emphasis", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsPositionDetailsPresentation implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation$Emphasis;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "neutral", "gain", "loss", "muted", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Emphasis implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Emphasis[] $VALUES;
        public static final Emphasis neutral = new Emphasis("neutral", 0);
        public static final Emphasis gain = new Emphasis("gain", 1);
        public static final Emphasis loss = new Emphasis("loss", 2);
        public static final Emphasis muted = new Emphasis("muted", 3);

        private static final /* synthetic */ Emphasis[] $values() {
            return new Emphasis[]{neutral, gain, loss, muted};
        }

        static {
            Emphasis[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Emphasis(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Emphasis valueOf(String str) {
            return (Emphasis) Enum.valueOf(Emphasis.class, str);
        }

        public static Emphasis[] values() {
            return (Emphasis[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public SquadsPositionDetailsPresentation(String str, String str2, Emphasis emphasis, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        emphasis.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(str, str2, emphasis, str3, z);
    }

    private final native long Swift_constructor_1(String valueTitle, String valueText, Emphasis emphasis, String deltaText, boolean isDeltaGain);

    private final native String Swift_deltaText(long Swift_peer);

    private final native Emphasis Swift_emphasis(long Swift_peer);

    private final native boolean Swift_isDeltaGain(long Swift_peer);

    private final native boolean Swift_isequal(SquadsPositionDetailsPresentation lhs, SquadsPositionDetailsPresentation rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_valueText(long Swift_peer);

    private final native String Swift_valueTitle(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof SquadsPositionDetailsPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsPositionDetailsPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getDeltaText() {
        return Swift_deltaText(this.Swift_peer);
    }

    public final Emphasis getEmphasis() {
        return Swift_emphasis(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getValueText() {
        return Swift_valueText(this.Swift_peer);
    }

    public final String getValueTitle() {
        return Swift_valueTitle(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isDeltaGain() {
        return Swift_isDeltaGain(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eJ=\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation$Companion;", "", "<init>", "()V", "resolve", "Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation;", "state", "Lcom/polymarket/usviewmodels/SquadsPositionCardState;", "toWinText", "", "currentValueText", "zeroValueText", "deltaText", "isDeltaGain", "", "Swift_Companion_resolve_0", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SquadsPositionDetailsPresentation Swift_Companion_resolve_0(SquadsPositionCardState state, String toWinText, String currentValueText, String zeroValueText, String deltaText, boolean isDeltaGain);

        public final SquadsPositionDetailsPresentation resolve(SquadsPositionCardState state, String toWinText, String currentValueText, String zeroValueText, String deltaText, boolean isDeltaGain) {
            state.getClass();
            toWinText.getClass();
            zeroValueText.getClass();
            return Swift_Companion_resolve_0(state, toWinText, currentValueText, zeroValueText, deltaText, isDeltaGain);
        }

        private Companion() {
        }
    }

    public SquadsPositionDetailsPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ SquadsPositionDetailsPresentation(String str, String str2, Emphasis emphasis, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, emphasis, (i & 8) != 0 ? null : str3, z);
    }
}
