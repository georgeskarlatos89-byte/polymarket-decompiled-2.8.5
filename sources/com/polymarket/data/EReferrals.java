package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0091\u0001\u0092\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010)\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0019H\u0082 J\u001c\u00100\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00101J$\u00102\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u00103J\u001c\u00107\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00101J$\u00108\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u00103J\u0015\u0010?\u001a\u0002092\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010@\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000209H\u0082 J\u0015\u0010D\u001a\u0002092\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010E\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000209H\u0082 J\u0015\u0010J\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010K\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010P\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010T\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010U\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010Y\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010Z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010^\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010_\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010c\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010d\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010i\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010m\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010n\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010r\u001a\u0002092\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010s\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000209H\u0082 J\u0015\u0010w\u001a\u0002092\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010x\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000209H\u0082 J\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020z0y2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J$\u0010\u0081\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020z0yH\u0082 J\u0016\u0010\u0082\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010\u008c\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010+\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00104\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R$\u0010:\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010<\"\u0004\bC\u0010>R$\u0010F\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010L\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 R(\u0010Q\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R(\u0010V\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R(\u0010[\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u001e\"\u0004\b]\u0010 R(\u0010`\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010 R(\u0010e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u001e\"\u0004\bg\u0010 R(\u0010j\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010\u001e\"\u0004\bl\u0010 R$\u0010o\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010<\"\u0004\bq\u0010>R$\u0010t\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010<\"\u0004\bv\u0010>R0\u0010{\u001a\b\u0012\u0004\u0012\u00020z0y2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020z0y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR.\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0084\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u0089\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010&\"\u0005\b\u008b\u0001\u0010(¨\u0006\u0093\u0001"}, d2 = {"Lcom/polymarket/data/EReferrals;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "referralCode", "getReferralCode", "()Ljava/lang/String;", "setReferralCode", "(Ljava/lang/String;)V", "Swift_referralCode", "Swift_referralCode_set", "value", "usedCount", "getUsedCount", "()I", "setUsedCount", "(I)V", "Swift_usedCount", "Swift_usedCount_set", "redemptionCap", "getRedemptionCap", "()Ljava/lang/Integer;", "setRedemptionCap", "(Ljava/lang/Integer;)V", "Swift_redemptionCap", "(J)Ljava/lang/Integer;", "Swift_redemptionCap_set", "(JLjava/lang/Integer;)V", "numUsesLeft", "getNumUsesLeft", "setNumUsesLeft", "Swift_numUsesLeft", "Swift_numUsesLeft_set", "Lcom/polymarket/data/EAmount;", "referrerAmount", "getReferrerAmount", "()Lcom/polymarket/data/EAmount;", "setReferrerAmount", "(Lcom/polymarket/data/EAmount;)V", "Swift_referrerAmount", "Swift_referrerAmount_set", "refereeAmount", "getRefereeAmount", "setRefereeAmount", "Swift_refereeAmount", "Swift_refereeAmount_set", "isActive", "()Z", "setActive", "(Z)V", "Swift_isActive", "Swift_isActive_set", "headline", "getHeadline", "setHeadline", "Swift_headline", "Swift_headline_set", "subheadline", "getSubheadline", "setSubheadline", "Swift_subheadline", "Swift_subheadline_set", "displayText", "getDisplayText", "setDisplayText", "Swift_displayText", "Swift_displayText_set", "shareMessageText", "getShareMessageText", "setShareMessageText", "Swift_shareMessageText", "Swift_shareMessageText_set", "inviteCardTitle", "getInviteCardTitle", "setInviteCardTitle", "Swift_inviteCardTitle", "Swift_inviteCardTitle_set", "codeCaptionText", "getCodeCaptionText", "setCodeCaptionText", "Swift_codeCaptionText", "Swift_codeCaptionText_set", "shareUrl", "getShareUrl", "setShareUrl", "Swift_shareUrl", "Swift_shareUrl_set", "totalBonusAmountIssued", "getTotalBonusAmountIssued", "setTotalBonusAmountIssued", "Swift_totalBonusAmountIssued", "Swift_totalBonusAmountIssued_set", "bonusAmountLeftToIssue", "getBonusAmountLeftToIssue", "setBonusAmountLeftToIssue", "Swift_bonusAmountLeftToIssue", "Swift_bonusAmountLeftToIssue_set", "", "Lcom/polymarket/data/EReferrals$ReferredUser;", "referredUsers", "getReferredUsers", "()Ljava/util/List;", "setReferredUsers", "(Ljava/util/List;)V", "Swift_referredUsers", "Swift_referredUsers_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ReferredUser", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EReferrals implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EReferrals(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native EAmount Swift_bonusAmountLeftToIssue(long Swift_peer);

    private final native void Swift_bonusAmountLeftToIssue_set(long Swift_peer, EAmount value);

    private final native String Swift_codeCaptionText(long Swift_peer);

    private final native void Swift_codeCaptionText_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_displayText(long Swift_peer);

    private final native void Swift_displayText_set(long Swift_peer, String value);

    private final native String Swift_headline(long Swift_peer);

    private final native void Swift_headline_set(long Swift_peer, String value);

    private final native String Swift_inviteCardTitle(long Swift_peer);

    private final native void Swift_inviteCardTitle_set(long Swift_peer, String value);

    private final native boolean Swift_isActive(long Swift_peer);

    private final native void Swift_isActive_set(long Swift_peer, boolean value);

    private final native Integer Swift_numUsesLeft(long Swift_peer);

    private final native void Swift_numUsesLeft_set(long Swift_peer, Integer value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Integer Swift_redemptionCap(long Swift_peer);

    private final native void Swift_redemptionCap_set(long Swift_peer, Integer value);

    private final native EAmount Swift_refereeAmount(long Swift_peer);

    private final native void Swift_refereeAmount_set(long Swift_peer, EAmount value);

    private final native String Swift_referralCode(long Swift_peer);

    private final native void Swift_referralCode_set(long Swift_peer, String value);

    private final native List<ReferredUser> Swift_referredUsers(long Swift_peer);

    private final native void Swift_referredUsers_set(long Swift_peer, List<ReferredUser> value);

    private final native EAmount Swift_referrerAmount(long Swift_peer);

    private final native void Swift_referrerAmount_set(long Swift_peer, EAmount value);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_shareMessageText(long Swift_peer);

    private final native void Swift_shareMessageText_set(long Swift_peer, String value);

    private final native String Swift_shareUrl(long Swift_peer);

    private final native void Swift_shareUrl_set(long Swift_peer, String value);

    private final native String Swift_subheadline(long Swift_peer);

    private final native void Swift_subheadline_set(long Swift_peer, String value);

    private final native EAmount Swift_totalBonusAmountIssued(long Swift_peer);

    private final native void Swift_totalBonusAmountIssued_set(long Swift_peer, EAmount value);

    private final native int Swift_usedCount(long Swift_peer);

    private final native void Swift_usedCount_set(long Swift_peer, int value);

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

    public final EAmount getBonusAmountLeftToIssue() {
        return Swift_bonusAmountLeftToIssue(this.Swift_peer);
    }

    public final String getCodeCaptionText() {
        return Swift_codeCaptionText(this.Swift_peer);
    }

    public final String getDisplayText() {
        return Swift_displayText(this.Swift_peer);
    }

    public final String getHeadline() {
        return Swift_headline(this.Swift_peer);
    }

    public final String getInviteCardTitle() {
        return Swift_inviteCardTitle(this.Swift_peer);
    }

    public final Integer getNumUsesLeft() {
        return Swift_numUsesLeft(this.Swift_peer);
    }

    public final Integer getRedemptionCap() {
        return Swift_redemptionCap(this.Swift_peer);
    }

    public final EAmount getRefereeAmount() {
        return Swift_refereeAmount(this.Swift_peer);
    }

    public final String getReferralCode() {
        return Swift_referralCode(this.Swift_peer);
    }

    public final List<ReferredUser> getReferredUsers() {
        return Swift_referredUsers(this.Swift_peer);
    }

    public final EAmount getReferrerAmount() {
        return Swift_referrerAmount(this.Swift_peer);
    }

    public final String getShareMessageText() {
        return Swift_shareMessageText(this.Swift_peer);
    }

    public final String getShareUrl() {
        return Swift_shareUrl(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSubheadline() {
        return Swift_subheadline(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final EAmount getTotalBonusAmountIssued() {
        return Swift_totalBonusAmountIssued(this.Swift_peer);
    }

    public final int getUsedCount() {
        return Swift_usedCount(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isActive() {
        return Swift_isActive(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EReferrals(this);
    }

    public final void setActive(boolean z) {
        willmutate();
        try {
            Swift_isActive_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setBonusAmountLeftToIssue(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_bonusAmountLeftToIssue_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setCodeCaptionText(String str) {
        willmutate();
        try {
            Swift_codeCaptionText_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayText(String str) {
        willmutate();
        try {
            Swift_displayText_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setHeadline(String str) {
        willmutate();
        try {
            Swift_headline_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setInviteCardTitle(String str) {
        willmutate();
        try {
            Swift_inviteCardTitle_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setNumUsesLeft(Integer num) {
        willmutate();
        try {
            Swift_numUsesLeft_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setRedemptionCap(Integer num) {
        willmutate();
        try {
            Swift_redemptionCap_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setRefereeAmount(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_refereeAmount_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setReferralCode(String str) {
        willmutate();
        try {
            Swift_referralCode_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setReferredUsers(List<ReferredUser> list) {
        list.getClass();
        List<ReferredUser> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_referredUsers_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setReferrerAmount(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_referrerAmount_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setShareMessageText(String str) {
        willmutate();
        try {
            Swift_shareMessageText_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setShareUrl(String str) {
        willmutate();
        try {
            Swift_shareUrl_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSubheadline(String str) {
        willmutate();
        try {
            Swift_subheadline_set(this.Swift_peer, str);
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

    public final void setTotalBonusAmountIssued(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_totalBonusAmountIssued_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setUsedCount(int i) {
        willmutate();
        try {
            Swift_usedCount_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001]B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBM\b\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u000b\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010+\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010,\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010-\u001a\u00020\u0002H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00101\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00105\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u00112\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010;\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0015\u0010@\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010A\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010-\u001a\u00020\u0013H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\u00152\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010G\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0015\u0010J\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 JE\u0010K\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0015\u0010L\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0082 J\b\u0010X\u001a\u00020\u0003H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020#0Z2\u0006\u0010[\u001a\u00020%H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020#0Z2\u0006\u0010[\u001a\u00020%H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R(\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010(R(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e\u0018\u00010NX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006^"}, d2 = {"Lcom/polymarket/data/EReferrals$ReferredUser;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTripOptions.KEY_EXTERNAL_ID, "userId", "username", "profileImageURL", "Ljava/net/URI;", "referrerAmount", "Lcom/polymarket/data/EAmount;", "creditedAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Lcom/polymarket/data/EAmount;Ljava/util/Date;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "Swift_externalId", "Swift_externalId_set", "value", "getUserId", "setUserId", "Swift_userId", "Swift_userId_set", "getUsername", "setUsername", "Swift_username", "Swift_username_set", "getProfileImageURL", "()Ljava/net/URI;", "setProfileImageURL", "(Ljava/net/URI;)V", "Swift_profileImageURL", "Swift_profileImageURL_set", "getReferrerAmount", "()Lcom/polymarket/data/EAmount;", "setReferrerAmount", "(Lcom/polymarket/data/EAmount;)V", "Swift_referrerAmount", "Swift_referrerAmount_set", "getCreditedAt", "()Ljava/util/Date;", "setCreditedAt", "(Ljava/util/Date;)V", "Swift_creditedAt", "Swift_creditedAt_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ReferredUser implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ReferredUser(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.net.URI r5, com.polymarket.data.EAmount r6, java.util.Date r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lc
                r3 = r0
            Lc:
                r9 = r8 & 4
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L16
                r5 = r0
            L16:
                r9 = r8 & 16
                if (r9 == 0) goto L20
                com.polymarket.data.EAmount$Companion r6 = com.polymarket.data.EAmount.INSTANCE
                com.polymarket.data.EAmount r6 = r6.getZeroUSD()
            L20:
                r8 = r8 & 32
                if (r8 == 0) goto L2c
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L33
            L2c:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L33:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EReferrals.ReferredUser.<init>(java.lang.String, java.lang.String, java.lang.String, java.net.URI, com.polymarket.data.EAmount, java.util.Date, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final native long Swift_constructor_0(String externalId, String userId, String username, URI profileImageURL, EAmount referrerAmount, Date creditedAt);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Date Swift_creditedAt(long Swift_peer);

        private final native void Swift_creditedAt_set(long Swift_peer, Date value);

        private final native String Swift_externalId(long Swift_peer);

        private final native void Swift_externalId_set(long Swift_peer, String value);

        private final native String Swift_id(long Swift_peer);

        private final native URI Swift_profileImageURL(long Swift_peer);

        private final native void Swift_profileImageURL_set(long Swift_peer, URI value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EAmount Swift_referrerAmount(long Swift_peer);

        private final native void Swift_referrerAmount_set(long Swift_peer, EAmount value);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_userId(long Swift_peer);

        private final native void Swift_userId_set(long Swift_peer, String value);

        private final native String Swift_username(long Swift_peer);

        private final native void Swift_username_set(long Swift_peer, String value);

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

        public final Date getCreditedAt() {
            return Swift_creditedAt(this.Swift_peer);
        }

        public final String getExternalId() {
            return Swift_externalId(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final URI getProfileImageURL() {
            return Swift_profileImageURL(this.Swift_peer);
        }

        public final EAmount getReferrerAmount() {
            return Swift_referrerAmount(this.Swift_peer);
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

        public final String getUserId() {
            return Swift_userId(this.Swift_peer);
        }

        public final String getUsername() {
            return Swift_username(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new ReferredUser(this);
        }

        public final void setCreditedAt(Date date) {
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_creditedAt_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        public final void setExternalId(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_externalId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setProfileImageURL(URI uri) {
            URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
            willmutate();
            try {
                Swift_profileImageURL_set(this.Swift_peer, uri2);
            } finally {
                didmutate();
            }
        }

        public final void setReferrerAmount(EAmount eAmount) {
            eAmount.getClass();
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_referrerAmount_set(this.Swift_peer, eAmount2);
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

        public final void setUserId(String str) {
            willmutate();
            try {
                Swift_userId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setUsername(String str) {
            willmutate();
            try {
                Swift_username_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public ReferredUser(String str, String str2, String str3, URI uri, EAmount eAmount, Date date) {
            str.getClass();
            eAmount.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, eAmount, date);
        }

        public ReferredUser(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private ReferredUser(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    public EReferrals(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
