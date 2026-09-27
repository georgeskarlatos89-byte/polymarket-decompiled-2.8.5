package com.polymarket.usviewmodels;

import com.checkout.components.wallet.BuildConfig;
import com.polymarket.designtokens.HexColorPair;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0091\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u001cJ\u0006\u0010!\u001a\u00020\"J\u0015\u0010#\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00106\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010:\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010>\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010@\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010B\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010D\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010F\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010I\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0K2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000e\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020QJ\u001d\u0010R\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010P\u001a\u00020QH\u0082 J\u000e\u0010S\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020QJ\u001d\u0010T\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010P\u001a\u00020QH\u0082 J\u000e\u0010U\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020QJ\u001d\u0010V\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010P\u001a\u00020QH\u0082 J\u000e\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020YJ\u001d\u0010Z\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010[\u001a\u00020YH\u0082 J\u000e\u0010\\\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020YJ\u001d\u0010]\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010[\u001a\u00020YH\u0082 J\u000e\u0010^\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020YJ\u001d\u0010_\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010[\u001a\u00020YH\u0082 J\u000e\u0010`\u001a\u00020a2\u0006\u0010X\u001a\u00020bJ\u001d\u0010c\u001a\u00020a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010d\u001a\u00020bH\u0082 J\u0095\u0001\u0010e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0082 J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0096\u0002J\u0019\u0010j\u001a\u00020g2\u0006\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0000H\u0082 J\b\u0010m\u001a\u00020nH\u0016J\u0015\u0010o\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010p\u001a\b\u0012\u0004\u0012\u00020i0q2\u0006\u0010r\u001a\u00020nH\u0016J\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020i0q2\u0006\u0010r\u001a\u00020nH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010%R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010%R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b?\u0010%R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010G\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bH\u0010%R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000b0K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006u"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "partyDemocrat", "Lcom/polymarket/designtokens/HexColorPair;", "partyRepublican", "typographyDemocrat", "typographyRepublican", "tossup", "leanDemocrat", "likelyDemocrat", "safeDemocrat", "heldDemocrat", "leanRepublican", "likelyRepublican", "safeRepublican", "heldRepublican", "partyIndependent", "leanIndependent", "likelyIndependent", "safeIndependent", "(Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getPartyDemocrat", "()Lcom/polymarket/designtokens/HexColorPair;", "Swift_partyDemocrat", "getPartyRepublican", "Swift_partyRepublican", "getTypographyDemocrat", "Swift_typographyDemocrat", "getTypographyRepublican", "Swift_typographyRepublican", "getTossup", "Swift_tossup", "getLeanDemocrat", "Swift_leanDemocrat", "getLikelyDemocrat", "Swift_likelyDemocrat", "getSafeDemocrat", "Swift_safeDemocrat", "getHeldDemocrat", "Swift_heldDemocrat", "getLeanRepublican", "Swift_leanRepublican", "getLikelyRepublican", "Swift_likelyRepublican", "getSafeRepublican", "Swift_safeRepublican", "getHeldRepublican", "Swift_heldRepublican", "getPartyIndependent", "Swift_partyIndependent", "getLeanIndependent", "Swift_leanIndependent", "getLikelyIndependent", "Swift_likelyIndependent", "getSafeIndependent", "Swift_safeIndependent", "partyOther", "getPartyOther", "Swift_partyOther", "allColors", "", "getAllColors", "()Ljava/util/List;", "Swift_allColors", "partyColor", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_partyColor_0", "partyTextColor", "Swift_partyTextColor_1", "heldColor", "Swift_heldColor_2", "mapFill", "for_", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "Swift_mapFill_3", "rating", "legendColor", "Swift_legendColor_4", "blipColor", "Swift_blipColor_5", "blipHaloAlpha", "", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;", "Swift_blipHaloAlpha_6", "bucket", "Swift_constructor_7", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MidtermsPolymapPalette implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public MidtermsPolymapPalette(HexColorPair hexColorPair, HexColorPair hexColorPair2, HexColorPair hexColorPair3, HexColorPair hexColorPair4, HexColorPair hexColorPair5, HexColorPair hexColorPair6, HexColorPair hexColorPair7, HexColorPair hexColorPair8, HexColorPair hexColorPair9, HexColorPair hexColorPair10, HexColorPair hexColorPair11, HexColorPair hexColorPair12, HexColorPair hexColorPair13, HexColorPair hexColorPair14, HexColorPair hexColorPair15, HexColorPair hexColorPair16, HexColorPair hexColorPair17) {
        hexColorPair.getClass();
        hexColorPair2.getClass();
        hexColorPair3.getClass();
        hexColorPair4.getClass();
        hexColorPair5.getClass();
        hexColorPair6.getClass();
        hexColorPair7.getClass();
        hexColorPair8.getClass();
        hexColorPair9.getClass();
        hexColorPair10.getClass();
        hexColorPair11.getClass();
        hexColorPair12.getClass();
        hexColorPair13.getClass();
        hexColorPair14.getClass();
        hexColorPair15.getClass();
        hexColorPair16.getClass();
        hexColorPair17.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_7(hexColorPair, hexColorPair2, hexColorPair3, hexColorPair4, hexColorPair5, hexColorPair6, hexColorPair7, hexColorPair8, hexColorPair9, hexColorPair10, hexColorPair11, hexColorPair12, hexColorPair13, hexColorPair14, hexColorPair15, hexColorPair16, hexColorPair17);
    }

    private final native List<HexColorPair> Swift_allColors(long Swift_peer);

    private final native HexColorPair Swift_blipColor_5(long Swift_peer, MidtermsRaceRating rating);

    private final native double Swift_blipHaloAlpha_6(long Swift_peer, MidtermsRaceRating.Bucket bucket);

    private final native long Swift_constructor_7(HexColorPair partyDemocrat, HexColorPair partyRepublican, HexColorPair typographyDemocrat, HexColorPair typographyRepublican, HexColorPair tossup, HexColorPair leanDemocrat, HexColorPair likelyDemocrat, HexColorPair safeDemocrat, HexColorPair heldDemocrat, HexColorPair leanRepublican, HexColorPair likelyRepublican, HexColorPair safeRepublican, HexColorPair heldRepublican, HexColorPair partyIndependent, HexColorPair leanIndependent, HexColorPair likelyIndependent, HexColorPair safeIndependent);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native HexColorPair Swift_heldColor_2(long Swift_peer, MidtermsRaceRating.Party party);

    private final native HexColorPair Swift_heldDemocrat(long Swift_peer);

    private final native HexColorPair Swift_heldRepublican(long Swift_peer);

    private final native boolean Swift_isequal(MidtermsPolymapPalette lhs, MidtermsPolymapPalette rhs);

    private final native HexColorPair Swift_leanDemocrat(long Swift_peer);

    private final native HexColorPair Swift_leanIndependent(long Swift_peer);

    private final native HexColorPair Swift_leanRepublican(long Swift_peer);

    private final native HexColorPair Swift_legendColor_4(long Swift_peer, MidtermsRaceRating rating);

    private final native HexColorPair Swift_likelyDemocrat(long Swift_peer);

    private final native HexColorPair Swift_likelyIndependent(long Swift_peer);

    private final native HexColorPair Swift_likelyRepublican(long Swift_peer);

    private final native HexColorPair Swift_mapFill_3(long Swift_peer, MidtermsRaceRating rating);

    private final native HexColorPair Swift_partyColor_0(long Swift_peer, MidtermsRaceRating.Party party);

    private final native HexColorPair Swift_partyDemocrat(long Swift_peer);

    private final native HexColorPair Swift_partyIndependent(long Swift_peer);

    private final native HexColorPair Swift_partyOther(long Swift_peer);

    private final native HexColorPair Swift_partyRepublican(long Swift_peer);

    private final native HexColorPair Swift_partyTextColor_1(long Swift_peer, MidtermsRaceRating.Party party);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native HexColorPair Swift_safeDemocrat(long Swift_peer);

    private final native HexColorPair Swift_safeIndependent(long Swift_peer);

    private final native HexColorPair Swift_safeRepublican(long Swift_peer);

    private final native HexColorPair Swift_tossup(long Swift_peer);

    private final native HexColorPair Swift_typographyDemocrat(long Swift_peer);

    private final native HexColorPair Swift_typographyRepublican(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final HexColorPair blipColor(MidtermsRaceRating for_) {
        for_.getClass();
        return Swift_blipColor_5(this.Swift_peer, for_);
    }

    public final double blipHaloAlpha(MidtermsRaceRating.Bucket for_) {
        for_.getClass();
        return Swift_blipHaloAlpha_6(this.Swift_peer, for_);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MidtermsPolymapPalette)) {
            return false;
        }
        return Swift_isequal(this, (MidtermsPolymapPalette) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<HexColorPair> getAllColors() {
        return Swift_allColors(this.Swift_peer);
    }

    public final HexColorPair getHeldDemocrat() {
        return Swift_heldDemocrat(this.Swift_peer);
    }

    public final HexColorPair getHeldRepublican() {
        return Swift_heldRepublican(this.Swift_peer);
    }

    public final HexColorPair getLeanDemocrat() {
        return Swift_leanDemocrat(this.Swift_peer);
    }

    public final HexColorPair getLeanIndependent() {
        return Swift_leanIndependent(this.Swift_peer);
    }

    public final HexColorPair getLeanRepublican() {
        return Swift_leanRepublican(this.Swift_peer);
    }

    public final HexColorPair getLikelyDemocrat() {
        return Swift_likelyDemocrat(this.Swift_peer);
    }

    public final HexColorPair getLikelyIndependent() {
        return Swift_likelyIndependent(this.Swift_peer);
    }

    public final HexColorPair getLikelyRepublican() {
        return Swift_likelyRepublican(this.Swift_peer);
    }

    public final HexColorPair getPartyDemocrat() {
        return Swift_partyDemocrat(this.Swift_peer);
    }

    public final HexColorPair getPartyIndependent() {
        return Swift_partyIndependent(this.Swift_peer);
    }

    public final HexColorPair getPartyOther() {
        return Swift_partyOther(this.Swift_peer);
    }

    public final HexColorPair getPartyRepublican() {
        return Swift_partyRepublican(this.Swift_peer);
    }

    public final HexColorPair getSafeDemocrat() {
        return Swift_safeDemocrat(this.Swift_peer);
    }

    public final HexColorPair getSafeIndependent() {
        return Swift_safeIndependent(this.Swift_peer);
    }

    public final HexColorPair getSafeRepublican() {
        return Swift_safeRepublican(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final HexColorPair getTossup() {
        return Swift_tossup(this.Swift_peer);
    }

    public final HexColorPair getTypographyDemocrat() {
        return Swift_typographyDemocrat(this.Swift_peer);
    }

    public final HexColorPair getTypographyRepublican() {
        return Swift_typographyRepublican(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final HexColorPair heldColor(MidtermsRaceRating.Party party) {
        party.getClass();
        return Swift_heldColor_2(this.Swift_peer, party);
    }

    public final HexColorPair legendColor(MidtermsRaceRating for_) {
        for_.getClass();
        return Swift_legendColor_4(this.Swift_peer, for_);
    }

    public final HexColorPair mapFill(MidtermsRaceRating for_) {
        for_.getClass();
        return Swift_mapFill_3(this.Swift_peer, for_);
    }

    public final HexColorPair partyColor(MidtermsRaceRating.Party party) {
        party.getClass();
        return Swift_partyColor_0(this.Swift_peer, party);
    }

    public final HexColorPair partyTextColor(MidtermsRaceRating.Party party) {
        party.getClass();
        return Swift_partyTextColor_1(this.Swift_peer, party);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPalette$Companion;", "", "<init>", "()V", BuildConfig.FLAVOR, "Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;", "getStandard", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;", "Swift_Companion_standard", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native MidtermsPolymapPalette Swift_Companion_standard();

        public final MidtermsPolymapPalette getStandard() {
            return Swift_Companion_standard();
        }

        private Companion() {
        }
    }

    public MidtermsPolymapPalette(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
