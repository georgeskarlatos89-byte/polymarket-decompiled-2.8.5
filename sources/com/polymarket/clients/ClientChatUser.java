package com.polymarket.clients;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.k84;
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
import skip.foundation.UUID;
import skip.lib.MutableStruct;
import skip.lib.StringKt;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001nB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBo\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u0018B\u0011\b\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010'\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010(\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\fH\u0082 J\u0015\u0010,\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010-\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\fH\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00101\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00107\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u0010;\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010<\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0012H\u0082 J\u0015\u0010>\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010?\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0012H\u0082 J\u0015\u0010A\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010B\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0012H\u0082 J\u0015\u0010D\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010E\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0012H\u0082 J\u0015\u0010G\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010H\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0012H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010L\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\fH\u0082 Jc\u0010M\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010P\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010S\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010T\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0001H\u0082 J\b\u0010b\u001a\u00020\u0001H\u0016J\u0013\u0010c\u001a\u00020\u00122\b\u0010d\u001a\u0004\u0018\u00010WH\u0096\u0002J\u0019\u0010e\u001a\u00020\u00122\u0006\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0000H\u0082 J\b\u0010h\u001a\u00020]H\u0016J\u0015\u0010i\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020W0k2\u0006\u0010l\u001a\u00020]H\u0016J\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020W0k2\u0006\u0010l\u001a\u00020]H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u00108\"\u0004\b9\u0010:R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u00108\"\u0004\b=\u0010:R$\u0010\u0014\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u00108\"\u0004\b@\u0010:R$\u0010\u0015\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u00108\"\u0004\bC\u0010:R$\u0010\u0016\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u00108\"\u0004\bF\u0010:R(\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u0011\u0010N\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bO\u0010$R\u0013\u0010Q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bR\u0010$R(\u0010U\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020 \u0018\u00010VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020]X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006o"}, d2 = {"Lcom/polymarket/clients/ClientChatUser;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "displayName", "username", "avatarURL", "Ljava/net/URI;", "isActive", "", "isModerator", "isMuted", "isVerified", "isEmployee", "nickname", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;ZZZZZLjava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getDisplayName", "setDisplayName", "Swift_displayName", "Swift_displayName_set", "getUsername", "setUsername", "Swift_username", "Swift_username_set", "getAvatarURL", "()Ljava/net/URI;", "setAvatarURL", "(Ljava/net/URI;)V", "Swift_avatarURL", "Swift_avatarURL_set", "()Z", "setActive", "(Z)V", "Swift_isActive", "Swift_isActive_set", "setModerator", "Swift_isModerator", "Swift_isModerator_set", "setMuted", "Swift_isMuted", "Swift_isMuted_set", "setVerified", "Swift_isVerified", "Swift_isVerified_set", "setEmployee", "Swift_isEmployee", "Swift_isEmployee_set", "getNickname", "setNickname", "Swift_nickname", "Swift_nickname_set", "Swift_constructor_0", "mentionToken", "getMentionToken", "Swift_mentionToken", "usernameMentionToken", "getUsernameMentionToken", "Swift_usernameMentionToken", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatUser implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ ClientChatUser(String str, String str2, String str3, URI uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str4);
    }

    private final native URI Swift_avatarURL(long Swift_peer);

    private final native void Swift_avatarURL_set(long Swift_peer, URI value);

    private final native long Swift_constructor_0(String id, String displayName, String username, URI avatarURL, boolean isActive, boolean isModerator, boolean isMuted, boolean isVerified, boolean isEmployee, String nickname);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native String Swift_displayName(long Swift_peer);

    private final native void Swift_displayName_set(long Swift_peer, String value);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isActive(long Swift_peer);

    private final native void Swift_isActive_set(long Swift_peer, boolean value);

    private final native boolean Swift_isEmployee(long Swift_peer);

    private final native void Swift_isEmployee_set(long Swift_peer, boolean value);

    private final native boolean Swift_isModerator(long Swift_peer);

    private final native void Swift_isModerator_set(long Swift_peer, boolean value);

    private final native boolean Swift_isMuted(long Swift_peer);

    private final native void Swift_isMuted_set(long Swift_peer, boolean value);

    private final native boolean Swift_isVerified(long Swift_peer);

    private final native void Swift_isVerified_set(long Swift_peer, boolean value);

    private final native boolean Swift_isequal(ClientChatUser lhs, ClientChatUser rhs);

    private final native String Swift_mentionToken(long Swift_peer);

    private final native String Swift_nickname(long Swift_peer);

    private final native void Swift_nickname_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_username(long Swift_peer);

    private final native String Swift_usernameMentionToken(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientChatUser)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatUser) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final URI getAvatarURL() {
        return Swift_avatarURL(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getMentionToken() {
        return Swift_mentionToken(this.Swift_peer);
    }

    public final String getNickname() {
        return Swift_nickname(this.Swift_peer);
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

    public final String getUsername() {
        return Swift_username(this.Swift_peer);
    }

    public final String getUsernameMentionToken() {
        return Swift_usernameMentionToken(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isActive() {
        return Swift_isActive(this.Swift_peer);
    }

    public final boolean isEmployee() {
        return Swift_isEmployee(this.Swift_peer);
    }

    public final boolean isModerator() {
        return Swift_isModerator(this.Swift_peer);
    }

    public final boolean isMuted() {
        return Swift_isMuted(this.Swift_peer);
    }

    public final boolean isVerified() {
        return Swift_isVerified(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientChatUser(this);
    }

    public final void setActive(boolean z) {
        willmutate();
        try {
            Swift_isActive_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setAvatarURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_avatarURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_displayName_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setEmployee(boolean z) {
        willmutate();
        try {
            Swift_isEmployee_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setModerator(boolean z) {
        willmutate();
        try {
            Swift_isModerator_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setMuted(boolean z) {
        willmutate();
        try {
            Swift_isMuted_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setNickname(String str) {
        willmutate();
        try {
            Swift_nickname_set(this.Swift_peer, str);
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

    public final void setUsername(String str) {
        willmutate();
        try {
            Swift_username_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setVerified(boolean z) {
        willmutate();
        try {
            Swift_isVerified_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007J_\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0082 ¨\u0006\u0014"}, d2 = {"Lcom/polymarket/clients/ClientChatUser$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/clients/ClientChatUser;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "displayName", "username", "avatarURL", "Ljava/net/URI;", "isActive", "", "isModerator", "isMuted", "isVerified", "isEmployee", "nickname", "Swift_Companion_mock_1", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientChatUser Swift_Companion_mock_1(String id, String displayName, String username, URI avatarURL, boolean isActive, boolean isModerator, boolean isMuted, boolean isVerified, boolean isEmployee, String nickname);

        public static /* synthetic */ ClientChatUser mock$default(Companion companion, String str, String str2, String str3, URI uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, int i, Object obj) {
            String str5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            String str6;
            URI uri2;
            String str7;
            String str8;
            Companion companion2;
            if ((i & 1) != 0) {
                str = k84.g("user_", StringKt.prefix(new UUID().getUuidString(), 8));
            }
            if ((i & 2) != 0) {
                str2 = "Alex";
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                uri = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                z3 = false;
            }
            if ((i & 128) != 0) {
                z4 = false;
            }
            if ((i & 256) != 0) {
                z5 = false;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                str5 = null;
                z8 = z4;
                z6 = z5;
                z10 = z2;
                z7 = z3;
                uri2 = uri;
                z9 = z;
                str8 = str2;
                str6 = str3;
                companion2 = companion;
                str7 = str;
            } else {
                str5 = str4;
                z6 = z5;
                z7 = z3;
                z8 = z4;
                z9 = z;
                z10 = z2;
                str6 = str3;
                uri2 = uri;
                str7 = str;
                str8 = str2;
                companion2 = companion;
            }
            return companion2.mock(str7, str8, str6, uri2, z9, z10, z7, z8, z6, str5);
        }

        public final ClientChatUser mock(String id, String displayName, String username, URI avatarURL, boolean isActive, boolean isModerator, boolean isMuted, boolean isVerified, boolean isEmployee, String nickname) {
            id.getClass();
            displayName.getClass();
            return Swift_Companion_mock_1(id, displayName, username, avatarURL, isActive, isModerator, isMuted, isVerified, isEmployee, nickname);
        }

        private Companion() {
        }
    }

    public ClientChatUser(String str, String str2, String str3, URI uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4) {
        str.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, z, z2, z3, z4, z5, str4);
    }

    public ClientChatUser(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ClientChatUser(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
