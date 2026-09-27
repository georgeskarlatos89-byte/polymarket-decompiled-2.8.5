package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001^B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB]\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u000b\u0010\u0019B\u0011\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u001bJ\u0006\u0010 \u001a\u00020!J\u0015\u0010\"\u001a\u00020!2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010'\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00112\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u00101\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00102\u001a\u00020!2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u00103\u001a\u00020\u0013H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u00107\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010;\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010@\u001a\u00020=2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010B\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J]\u0010C\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0082 J\u0015\u0010D\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001a\u001a\u00020\u0003H\u0082 J\b\u0010R\u001a\u00020\u0003H\u0016J\u0013\u0010S\u001a\u00020\u00132\b\u0010T\u001a\u0004\u0018\u00010GH\u0096\u0002J\u0019\u0010U\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0000H\u0082 J\b\u0010X\u001a\u00020MH\u0016J\u0015\u0010Y\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020G0[2\u0006\u0010\\\u001a\u00020MH\u0016J\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020G0[2\u0006\u0010\\\u001a\u00020MH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u0010\u0012\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010.\"\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010$R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0018\u0010.R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010A\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bA\u0010.R(\u0010E\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020!\u0018\u00010FX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006_"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeContactPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "displayName", "subtitle", "avatarImageData", "", "isEnabled", "", "phoneNumber", "avatarSeed", "avatarUrl", "Ljava/net/URI;", "isPendingInvite", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZLjava/lang/String;Ljava/lang/String;Ljava/net/URI;Z)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getDisplayName", "Swift_displayName", "getSubtitle", "Swift_subtitle", "getAvatarImageData", "()[B", "Swift_avatarImageData", "newValue", "()Z", "setEnabled", "(Z)V", "Swift_isEnabled", "Swift_isEnabled_set", "value", "getPhoneNumber", "Swift_phoneNumber", "getAvatarSeed", "Swift_avatarSeed", "getAvatarUrl", "()Ljava/net/URI;", "Swift_avatarUrl", "Swift_isPendingInvite", "trailingAccessory", "Lcom/polymarket/usviewmodels/SquadsComposeContactAccessory;", "getTrailingAccessory", "()Lcom/polymarket/usviewmodels/SquadsComposeContactAccessory;", "Swift_trailingAccessory", "isDimmed", "Swift_isDimmed", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsComposeContactPresentation implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SquadsComposeContactPresentation(String str, String str2, String str3, byte[] bArr, boolean z, String str4, String str5, URI uri, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bArr, z, str4, str5, r10, r11);
        URI uri2;
        boolean z3;
        if ((i & 128) != 0) {
            uri2 = null;
        } else {
            uri2 = uri;
        }
        if ((i & 256) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
    }

    private final native byte[] Swift_avatarImageData(long Swift_peer);

    private final native String Swift_avatarSeed(long Swift_peer);

    private final native URI Swift_avatarUrl(long Swift_peer);

    private final native long Swift_constructor_0(String id, String displayName, String subtitle, byte[] avatarImageData, boolean isEnabled, String phoneNumber, String avatarSeed, URI avatarUrl, boolean isPendingInvite);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native String Swift_displayName(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isDimmed(long Swift_peer);

    private final native boolean Swift_isEnabled(long Swift_peer);

    private final native void Swift_isEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPendingInvite(long Swift_peer);

    private final native boolean Swift_isequal(SquadsComposeContactPresentation lhs, SquadsComposeContactPresentation rhs);

    private final native String Swift_phoneNumber(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native SquadsComposeContactAccessory Swift_trailingAccessory(long Swift_peer);

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
        if (!(other instanceof SquadsComposeContactPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsComposeContactPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final byte[] getAvatarImageData() {
        return Swift_avatarImageData(this.Swift_peer);
    }

    public final String getAvatarSeed() {
        return Swift_avatarSeed(this.Swift_peer);
    }

    public final URI getAvatarUrl() {
        return Swift_avatarUrl(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getPhoneNumber() {
        return Swift_phoneNumber(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSubtitle() {
        return Swift_subtitle(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final SquadsComposeContactAccessory getTrailingAccessory() {
        return Swift_trailingAccessory(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isDimmed() {
        return Swift_isDimmed(this.Swift_peer);
    }

    public final boolean isEnabled() {
        return Swift_isEnabled(this.Swift_peer);
    }

    public final boolean isPendingInvite() {
        return Swift_isPendingInvite(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new SquadsComposeContactPresentation(this);
    }

    public final void setEnabled(boolean z) {
        willmutate();
        try {
            Swift_isEnabled_set(this.Swift_peer, z);
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

    public SquadsComposeContactPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public SquadsComposeContactPresentation(String str, String str2, String str3, byte[] bArr, boolean z, String str4, String str5, URI uri, boolean z2) {
        g.x(str, str2, str5);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, bArr, z, str4, str5, uri, z2);
    }

    private SquadsComposeContactPresentation(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
