package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010#\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010%2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010,\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0082 J\u0015\u0010/\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u00100\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010<\u001a\u00020\u0003H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00190>2\u0006\u0010?\u001a\u00020\u001bH\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190>2\u0006\u0010?\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001c\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR(\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u000102X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006B"}, d2 = {"Lcom/polymarket/data/ECampaignOptIn;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "campaignId", "getCampaignId", "()Ljava/lang/String;", "setCampaignId", "(Ljava/lang/String;)V", "Swift_campaignId", "Swift_campaignId_set", "value", "Ljava/util/Date;", "optedInAt", "getOptedInAt", "()Ljava/util/Date;", "setOptedInAt", "(Ljava/util/Date;)V", "Swift_optedInAt", "Swift_optedInAt_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ECampaignOptIn implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ECampaignOptIn(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native String Swift_campaignId(long Swift_peer);

    private final native void Swift_campaignId_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_id(long Swift_peer);

    private final native Date Swift_optedInAt(long Swift_peer);

    private final native void Swift_optedInAt_set(long Swift_peer, Date value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

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

    public final String getCampaignId() {
        return Swift_campaignId(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final Date getOptedInAt() {
        return Swift_optedInAt(this.Swift_peer);
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
        return new ECampaignOptIn(this);
    }

    public final void setCampaignId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_campaignId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setOptedInAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_optedInAt_set(this.Swift_peer, date2);
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

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ECampaignOptIn(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
