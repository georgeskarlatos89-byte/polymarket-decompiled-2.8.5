package com.polymarket.data;

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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020 J\u001d\u0010$\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010#\u001a\u00020 H\u0082 J\u0006\u0010%\u001a\u00020 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0006\u0010'\u001a\u00020\u0016J\u0015\u0010(\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0082 J\b\u00105\u001a\u00020\u0002H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u0018072\u0006\u00108\u001a\u00020\u001aH\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u0018072\u0006\u00108\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u001b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/polymarket/data/TextFieldConfig;", "Value", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "value", "getValue", "()Ljava/lang/Object;", "Swift_value", "getText", "", "Swift_getText_0", "setTextValue", "currentText", "Swift_setTextValue_1", "getPlaceholder", "Swift_getPlaceholder_2", "getIsValid", "Swift_getIsValid_3", "Swift_constructor_4", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextFieldConfig<Value> implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private TextFieldConfig(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_4(mutableStruct);
    }

    private final native long Swift_constructor_4(MutableStruct copy);

    private final native boolean Swift_getIsValid_3(long Swift_peer);

    private final native String Swift_getPlaceholder_2(long Swift_peer);

    private final native String Swift_getText_0(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native void Swift_setTextValue_1(long Swift_peer, String currentText);

    private final native Object Swift_value(long Swift_peer);

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

    public final boolean getIsValid() {
        return Swift_getIsValid_3(this.Swift_peer);
    }

    public final String getPlaceholder() {
        return Swift_getPlaceholder_2(this.Swift_peer);
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

    public final String getText() {
        return Swift_getText_0(this.Swift_peer);
    }

    public final Value getValue() {
        return (Value) Swift_value(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new TextFieldConfig(this);
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

    public final void setTextValue(String currentText) {
        currentText.getClass();
        willmutate();
        try {
            Swift_setTextValue_1(this.Swift_peer, currentText);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public TextFieldConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
