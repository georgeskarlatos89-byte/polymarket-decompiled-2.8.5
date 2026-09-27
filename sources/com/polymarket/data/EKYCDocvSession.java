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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010%\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010&\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010-\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00101\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\u000eH\u0082 J+\u00102\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u00106\u001a\u0004\u0018\u00010\u000e2\u0006\u00107\u001a\u00020\u001bJ\u001f\u00108\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00107\u001a\u00020\u001bH\u0082 J\u0015\u0010;\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010<\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0082 J\b\u0010H\u001a\u00020\u0001H\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0J2\u0006\u0010K\u001a\u00020\u001fH\u0016J\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001d0J2\u0006\u0010K\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0013\u00103\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0011\u00109\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0018\u0018\u00010>X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/polymarket/data/EKYCDocvSession;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "docv", "Lcom/polymarket/data/APIKYCDocvUS;", "consumedDocvToken", "", "retiredDocvToken", "(Lcom/polymarket/data/APIKYCDocvUS;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getDocv", "()Lcom/polymarket/data/APIKYCDocvUS;", "setDocv", "(Lcom/polymarket/data/APIKYCDocvUS;)V", "Swift_docv", "Swift_docv_set", "value", "getConsumedDocvToken", "()Ljava/lang/String;", "setConsumedDocvToken", "(Ljava/lang/String;)V", "Swift_consumedDocvToken", "Swift_consumedDocvToken_set", "getRetiredDocvToken", "setRetiredDocvToken", "Swift_retiredDocvToken", "Swift_retiredDocvToken_set", "Swift_constructor_0", "resumableDocvToken", "getResumableDocvToken", "Swift_resumableDocvToken", "resumableToken", "hasCompletedCapture", "Swift_resumableToken_1", "isServedTokenRetired", "()Z", "Swift_isServedTokenRetired", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EKYCDocvSession implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ EKYCDocvSession(APIKYCDocvUS aPIKYCDocvUS, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aPIKYCDocvUS, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    private final native long Swift_constructor_0(APIKYCDocvUS docv, String consumedDocvToken, String retiredDocvToken);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native String Swift_consumedDocvToken(long Swift_peer);

    private final native void Swift_consumedDocvToken_set(long Swift_peer, String value);

    private final native APIKYCDocvUS Swift_docv(long Swift_peer);

    private final native void Swift_docv_set(long Swift_peer, APIKYCDocvUS value);

    private final native boolean Swift_isServedTokenRetired(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_resumableDocvToken(long Swift_peer);

    private final native String Swift_resumableToken_1(long Swift_peer, boolean hasCompletedCapture);

    private final native String Swift_retiredDocvToken(long Swift_peer);

    private final native void Swift_retiredDocvToken_set(long Swift_peer, String value);

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

    public final String getConsumedDocvToken() {
        return Swift_consumedDocvToken(this.Swift_peer);
    }

    public final APIKYCDocvUS getDocv() {
        return Swift_docv(this.Swift_peer);
    }

    public final String getResumableDocvToken() {
        return Swift_resumableDocvToken(this.Swift_peer);
    }

    public final String getRetiredDocvToken() {
        return Swift_retiredDocvToken(this.Swift_peer);
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

    public final boolean isServedTokenRetired() {
        return Swift_isServedTokenRetired(this.Swift_peer);
    }

    public final String resumableToken(boolean hasCompletedCapture) {
        return Swift_resumableToken_1(this.Swift_peer, hasCompletedCapture);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EKYCDocvSession(this);
    }

    public final void setConsumedDocvToken(String str) {
        willmutate();
        try {
            Swift_consumedDocvToken_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setDocv(APIKYCDocvUS aPIKYCDocvUS) {
        willmutate();
        try {
            Swift_docv_set(this.Swift_peer, aPIKYCDocvUS);
        } finally {
            didmutate();
        }
    }

    public final void setRetiredDocvToken(String str) {
        willmutate();
        try {
            Swift_retiredDocvToken_set(this.Swift_peer, str);
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

    public EKYCDocvSession(APIKYCDocvUS aPIKYCDocvUS, String str, String str2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(aPIKYCDocvUS, str, str2);
    }

    public EKYCDocvSession(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EKYCDocvSession(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
