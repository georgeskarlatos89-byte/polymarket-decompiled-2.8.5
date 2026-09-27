package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010$H\u0082 J\u001b\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00103\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0,H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u0002040,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00109\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u0002040,H\u0082 J\u0015\u0010=\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010>\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010?\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010K\u001a\u00020\u0001H\u0016J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010N\u001a\u00020\u0019H\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170M2\u0006\u0010N\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u001a\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0,2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R0\u00105\u001a\b\u0012\u0004\u0012\u0002040,2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002040,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R$\u0010:\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R(\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010AX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006Q"}, d2 = {"Lcom/polymarket/data/ESquadCreateRequest;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", Keys.KEY_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Swift_name", "Swift_name_set", "value", "Lcom/polymarket/data/ESquadImage;", "image", "getImage", "()Lcom/polymarket/data/ESquadImage;", "setImage", "(Lcom/polymarket/data/ESquadImage;)V", "Swift_image", "Swift_image_set", "", "inviteeUserIds", "getInviteeUserIds", "()Ljava/util/List;", "setInviteeUserIds", "(Ljava/util/List;)V", "Swift_inviteeUserIds", "Swift_inviteeUserIds_set", "Lcom/polymarket/data/ESquadContactInvitee;", "contactInvitees", "getContactInvitees", "setContactInvitees", "Swift_contactInvitees", "Swift_contactInvitees_set", "idempotencyKey", "getIdempotencyKey", "setIdempotencyKey", "Swift_idempotencyKey", "Swift_idempotencyKey_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadCreateRequest implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquadCreateRequest(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native List<ESquadContactInvitee> Swift_contactInvitees(long Swift_peer);

    private final native void Swift_contactInvitees_set(long Swift_peer, List<ESquadContactInvitee> value);

    private final native String Swift_idempotencyKey(long Swift_peer);

    private final native void Swift_idempotencyKey_set(long Swift_peer, String value);

    private final native ESquadImage Swift_image(long Swift_peer);

    private final native void Swift_image_set(long Swift_peer, ESquadImage value);

    private final native List<String> Swift_inviteeUserIds(long Swift_peer);

    private final native void Swift_inviteeUserIds_set(long Swift_peer, List<String> value);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

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

    public final List<ESquadContactInvitee> getContactInvitees() {
        return Swift_contactInvitees(this.Swift_peer);
    }

    public final String getIdempotencyKey() {
        return Swift_idempotencyKey(this.Swift_peer);
    }

    public final ESquadImage getImage() {
        return Swift_image(this.Swift_peer);
    }

    public final List<String> getInviteeUserIds() {
        return Swift_inviteeUserIds(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
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
        return new ESquadCreateRequest(this);
    }

    public final void setContactInvitees(List<ESquadContactInvitee> list) {
        list.getClass();
        List<ESquadContactInvitee> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_contactInvitees_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setIdempotencyKey(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_idempotencyKey_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setImage(ESquadImage eSquadImage) {
        willmutate();
        try {
            Swift_image_set(this.Swift_peer, eSquadImage);
        } finally {
            didmutate();
        }
    }

    public final void setInviteeUserIds(List<String> list) {
        list.getClass();
        List<String> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_inviteeUserIds_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_name_set(this.Swift_peer, str);
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

    public ESquadCreateRequest(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
