package com.polymarket.data;

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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010'\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010,\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010-\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b0.2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00105\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0.H\u0082 J\u0015\u0010;\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010<\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0015\u0010@\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010A\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0015\u0010E\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010F\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0015\u0010J\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010K\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0015\u0010L\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010X\u001a\u00020\u0001H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170Z2\u0006\u0010[\u001a\u00020\u0019H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170Z2\u0006\u0010[\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R0\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0.2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010=\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u00108\"\u0004\b?\u0010:R$\u0010B\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R$\u0010G\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u00108\"\u0004\bI\u0010:R(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010NX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006^"}, d2 = {"Lcom/polymarket/data/EIntegrityCheck;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "currentVersion", "getCurrentVersion", "()Ljava/lang/String;", "setCurrentVersion", "(Ljava/lang/String;)V", "Swift_currentVersion", "Swift_currentVersion_set", "value", "minVersion", "getMinVersion", "setMinVersion", "Swift_minVersion", "Swift_minVersion_set", "appName", "getAppName", "setAppName", "Swift_appName", "Swift_appName_set", "", "appPlatforms", "getAppPlatforms", "()Ljava/util/List;", "setAppPlatforms", "(Ljava/util/List;)V", "Swift_appPlatforms", "Swift_appPlatforms_set", "waitlistEnabled", "getWaitlistEnabled", "()Z", "setWaitlistEnabled", "(Z)V", "Swift_waitlistEnabled", "Swift_waitlistEnabled_set", "expired", "getExpired", "setExpired", "Swift_expired", "Swift_expired_set", "maintenanceMode", "getMaintenanceMode", "setMaintenanceMode", "Swift_maintenanceMode", "Swift_maintenanceMode_set", "integrityDenied", "getIntegrityDenied", "setIntegrityDenied", "Swift_integrityDenied", "Swift_integrityDenied_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EIntegrityCheck implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EIntegrityCheck(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native String Swift_appName(long Swift_peer);

    private final native void Swift_appName_set(long Swift_peer, String value);

    private final native List<String> Swift_appPlatforms(long Swift_peer);

    private final native void Swift_appPlatforms_set(long Swift_peer, List<String> value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_currentVersion(long Swift_peer);

    private final native void Swift_currentVersion_set(long Swift_peer, String value);

    private final native boolean Swift_expired(long Swift_peer);

    private final native void Swift_expired_set(long Swift_peer, boolean value);

    private final native boolean Swift_integrityDenied(long Swift_peer);

    private final native void Swift_integrityDenied_set(long Swift_peer, boolean value);

    private final native boolean Swift_maintenanceMode(long Swift_peer);

    private final native void Swift_maintenanceMode_set(long Swift_peer, boolean value);

    private final native String Swift_minVersion(long Swift_peer);

    private final native void Swift_minVersion_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_waitlistEnabled(long Swift_peer);

    private final native void Swift_waitlistEnabled_set(long Swift_peer, boolean value);

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

    public final String getAppName() {
        return Swift_appName(this.Swift_peer);
    }

    public final List<String> getAppPlatforms() {
        return Swift_appPlatforms(this.Swift_peer);
    }

    public final String getCurrentVersion() {
        return Swift_currentVersion(this.Swift_peer);
    }

    public final boolean getExpired() {
        return Swift_expired(this.Swift_peer);
    }

    public final boolean getIntegrityDenied() {
        return Swift_integrityDenied(this.Swift_peer);
    }

    public final boolean getMaintenanceMode() {
        return Swift_maintenanceMode(this.Swift_peer);
    }

    public final String getMinVersion() {
        return Swift_minVersion(this.Swift_peer);
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

    public final boolean getWaitlistEnabled() {
        return Swift_waitlistEnabled(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EIntegrityCheck(this);
    }

    public final void setAppName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_appName_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setAppPlatforms(List<String> list) {
        list.getClass();
        List<String> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_appPlatforms_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setCurrentVersion(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_currentVersion_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setExpired(boolean z) {
        willmutate();
        try {
            Swift_expired_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setIntegrityDenied(boolean z) {
        willmutate();
        try {
            Swift_integrityDenied_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setMaintenanceMode(boolean z) {
        willmutate();
        try {
            Swift_maintenanceMode_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setMinVersion(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_minVersion_set(this.Swift_peer, str);
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

    public final void setWaitlistEnabled(boolean z) {
        willmutate();
        try {
            Swift_waitlistEnabled_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public EIntegrityCheck(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
