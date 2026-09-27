package com.polymarket.data;

import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140/2\u0006\u00100\u001a\u00020\u0016H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140/2\u0006\u00100\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u0013\u0010%\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/polymarket/data/ELinkedAccount;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "userId", "", "getUserId", "()Ljava/lang/String;", "Swift_userId", "aeroUserId", "getAeroUserId", "Swift_aeroUserId", AttributeType.PHONE, "getPhone", "Swift_phone", "email", "getEmail", "Swift_email", "displayMessage", "getDisplayMessage", "Swift_displayMessage", "paymentMethods", "", "Lcom/polymarket/data/EPaymentMethod;", "getPaymentMethods", "()Ljava/util/List;", "Swift_paymentMethods", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ELinkedAccount implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ELinkedAccount(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_aeroUserId(long Swift_peer);

    private final native String Swift_displayMessage(long Swift_peer);

    private final native String Swift_email(long Swift_peer);

    private final native List<EPaymentMethod> Swift_paymentMethods(long Swift_peer);

    private final native String Swift_phone(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_userId(long Swift_peer);

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

    public final String getAeroUserId() {
        return Swift_aeroUserId(this.Swift_peer);
    }

    public final String getDisplayMessage() {
        return Swift_displayMessage(this.Swift_peer);
    }

    public final String getEmail() {
        return Swift_email(this.Swift_peer);
    }

    public final List<EPaymentMethod> getPaymentMethods() {
        return Swift_paymentMethods(this.Swift_peer);
    }

    public final String getPhone() {
        return Swift_phone(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getUserId() {
        return Swift_userId(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }
}
