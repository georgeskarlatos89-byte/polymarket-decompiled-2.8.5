package com.polymarket.designtokens;

import com.polymarket.designtokens.DesignTokens;
import defpackage.pc0;
import defpackage.qc0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.InOut;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001f\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u001f\u0010\u001c\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020'2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010/\u001a\u00020,2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\b\u00107\u001a\u000208H\u0016J\u0014\u00109\u001a\u00020\u00132\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0015\u0010=\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u0002030?2\u0006\u0010@\u001a\u000208H\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u0002030?2\u0006\u0010@\u001a\u000208H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006C"}, d2 = {"Lcom/polymarket/designtokens/HexColorPair;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "lightHex", "", "darkHex", "(Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getLightHex", "()Ljava/lang/String;", "Swift_lightHex", "getDarkHex", "Swift_darkHex", "Swift_constructor_0", "fillingMissingDarkHex", "Swift_fillingMissingDarkHex_1", "droppingEmptyHexes", "getDroppingEmptyHexes", "()Lcom/polymarket/designtokens/HexColorPair;", "Swift_droppingEmptyHexes", "tuple", "Lkotlin/Pair;", "getTuple", "()Lkotlin/Pair;", "Swift_tuple", "semanticColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getSemanticColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_semanticColor", "paletteColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getPaletteColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_paletteColor", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HexColorPair implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public HexColorPair(String str, String str2) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2);
    }

    private final native long Swift_constructor_0(String lightHex, String darkHex);

    private final native String Swift_darkHex(long Swift_peer);

    private final native HexColorPair Swift_droppingEmptyHexes(long Swift_peer);

    private final native HexColorPair Swift_fillingMissingDarkHex_1(long Swift_peer, String darkHex);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(HexColorPair lhs, HexColorPair rhs);

    private final native String Swift_lightHex(long Swift_peer);

    private final native DesignTokens.PaletteColor Swift_paletteColor(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_semanticColor(long Swift_peer);

    private final native Pair<String, String> Swift_tuple(long Swift_peer);

    public static /* synthetic */ Hasher a(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    public static /* synthetic */ Unit b(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
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
        if (!(other instanceof HexColorPair)) {
            return false;
        }
        return Swift_isequal(this, (HexColorPair) other);
    }

    public final HexColorPair fillingMissingDarkHex(String darkHex) {
        return Swift_fillingMissingDarkHex_1(this.Swift_peer, darkHex);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getDarkHex() {
        return Swift_darkHex(this.Swift_peer);
    }

    public final HexColorPair getDroppingEmptyHexes() {
        return Swift_droppingEmptyHexes(this.Swift_peer);
    }

    public final String getLightHex() {
        return Swift_lightHex(this.Swift_peer);
    }

    public final DesignTokens.PaletteColor getPaletteColor() {
        return Swift_paletteColor(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getSemanticColor() {
        return Swift_semanticColor(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Pair<String, String> getTuple() {
        return Swift_tuple(this.Swift_peer);
    }

    public final void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Long.valueOf(Swift_hashvalue(this.Swift_peer)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new pc0(obj, 19), new qc0(obj, 16)));
        return ((Hasher) obj.a).getResult();
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public HexColorPair(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ HexColorPair(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
