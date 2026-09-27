package com.polymarket.data;

import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\u001e\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010#\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0082 J!\u0010$\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010*\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0082 J\b\u00108\u001a\u00020\u0001H\u0016J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0082 J\b\u0010?\u001a\u000203H\u0016J\u0015\u0010@\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020-0B2\u0006\u0010C\u001a\u000203H\u0016J\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020-0B2\u0006\u0010C\u001a\u000203H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0016\u0018\u00010,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006F"}, d2 = {"Lcom/polymarket/data/APIMoreTab;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "label", "", "image", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "Swift_label", "Swift_label_set", "value", "getImage", "setImage", "Swift_image", "Swift_image_set", "Swift_constructor_0", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIMoreTab implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public APIMoreTab(String str, String str2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2);
    }

    private final native long Swift_constructor_0(String label, String image);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_image(long Swift_peer);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native void Swift_image_set(long Swift_peer, String value);

    private final native boolean Swift_isequal(APIMoreTab lhs, APIMoreTab rhs);

    private final native String Swift_label(long Swift_peer);

    private final native void Swift_label_set(long Swift_peer, String value);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof APIMoreTab)) {
            return false;
        }
        return Swift_isequal(this, (APIMoreTab) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getImage() {
        return Swift_image(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final String getLabel() {
        return Swift_label(this.Swift_peer);
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
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new APIMoreTab(this);
    }

    public final void setImage(String str) {
        willmutate();
        try {
            Swift_image_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLabel(String str) {
        willmutate();
        try {
            Swift_label_set(this.Swift_peer, str);
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

    public APIMoreTab(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private APIMoreTab(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
