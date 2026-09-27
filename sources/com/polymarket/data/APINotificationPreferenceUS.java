package com.polymarket.data;

import com.appsflyer.AppsFlyerProperties;
import java.util.List;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBM\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0015\u0010(\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010)\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\fH\u0082 J\u0015\u0010-\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010.\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\fH\u0082 J\u0015\u00103\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00104\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u000fH\u0082 J\u0015\u00107\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00108\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u000fH\u0082 J\u0015\u0010;\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010<\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010*\u001a\u00020\u000fH\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010@\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010D\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 JI\u0010E\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010F\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0015\u001a\u00020\u0001H\u0082 J\b\u0010R\u001a\u00020\u0001H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020 0T2\u0006\u0010U\u001a\u00020\"H\u0016J\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020 0T2\u0006\u0010U\u001a\u00020\"H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00100\"\u0004\b6\u00102R$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00100\"\u0004\b:\u00102R(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R(\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R(\u0010G\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c\u0018\u00010HX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006X"}, d2 = {"Lcom/polymarket/data/APINotificationPreferenceUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "group", "", AppsFlyerProperties.CHANNEL, "enabled", "", "forceOn", "hasUserOverride", "groupDisplayLabel", "channelDisplayLabel", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "Swift_group", "Swift_group_set", "value", "getChannel", "setChannel", "Swift_channel", "Swift_channel_set", "getEnabled", "()Z", "setEnabled", "(Z)V", "Swift_enabled", "Swift_enabled_set", "getForceOn", "setForceOn", "Swift_forceOn", "Swift_forceOn_set", "getHasUserOverride", "setHasUserOverride", "Swift_hasUserOverride", "Swift_hasUserOverride_set", "getGroupDisplayLabel", "setGroupDisplayLabel", "Swift_groupDisplayLabel", "Swift_groupDisplayLabel_set", "getChannelDisplayLabel", "setChannelDisplayLabel", "Swift_channelDisplayLabel", "Swift_channelDisplayLabel_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APINotificationPreferenceUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ APINotificationPreferenceUS(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    private final native String Swift_channel(long Swift_peer);

    private final native String Swift_channelDisplayLabel(long Swift_peer);

    private final native void Swift_channelDisplayLabel_set(long Swift_peer, String value);

    private final native void Swift_channel_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(String group, String channel, boolean enabled, boolean forceOn, boolean hasUserOverride, String groupDisplayLabel, String channelDisplayLabel);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native boolean Swift_enabled(long Swift_peer);

    private final native void Swift_enabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_forceOn(long Swift_peer);

    private final native void Swift_forceOn_set(long Swift_peer, boolean value);

    private final native String Swift_group(long Swift_peer);

    private final native String Swift_groupDisplayLabel(long Swift_peer);

    private final native void Swift_groupDisplayLabel_set(long Swift_peer, String value);

    private final native void Swift_group_set(long Swift_peer, String value);

    private final native boolean Swift_hasUserOverride(long Swift_peer);

    private final native void Swift_hasUserOverride_set(long Swift_peer, boolean value);

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

    public final String getChannel() {
        return Swift_channel(this.Swift_peer);
    }

    public final String getChannelDisplayLabel() {
        return Swift_channelDisplayLabel(this.Swift_peer);
    }

    public final boolean getEnabled() {
        return Swift_enabled(this.Swift_peer);
    }

    public final boolean getForceOn() {
        return Swift_forceOn(this.Swift_peer);
    }

    public final String getGroup() {
        return Swift_group(this.Swift_peer);
    }

    public final String getGroupDisplayLabel() {
        return Swift_groupDisplayLabel(this.Swift_peer);
    }

    public final boolean getHasUserOverride() {
        return Swift_hasUserOverride(this.Swift_peer);
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
        return new APINotificationPreferenceUS(this);
    }

    public final void setChannel(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_channel_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setChannelDisplayLabel(String str) {
        willmutate();
        try {
            Swift_channelDisplayLabel_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setEnabled(boolean z) {
        willmutate();
        try {
            Swift_enabled_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setForceOn(boolean z) {
        willmutate();
        try {
            Swift_forceOn_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setGroup(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_group_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setGroupDisplayLabel(String str) {
        willmutate();
        try {
            Swift_groupDisplayLabel_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setHasUserOverride(boolean z) {
        willmutate();
        try {
            Swift_hasUserOverride_set(this.Swift_peer, z);
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/polymarket/data/APINotificationPreferenceUS$Companion;", "", "<init>", "()V", "mockAll", "", "Lcom/polymarket/data/APINotificationPreferenceUS;", "getMockAll", "()Ljava/util/List;", "Swift_Companion_mockAll", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<APINotificationPreferenceUS> Swift_Companion_mockAll();

        public final List<APINotificationPreferenceUS> getMockAll() {
            return Swift_Companion_mockAll();
        }

        private Companion() {
        }
    }

    public APINotificationPreferenceUS(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, z, z2, z3, str3, str4);
    }

    public APINotificationPreferenceUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private APINotificationPreferenceUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
