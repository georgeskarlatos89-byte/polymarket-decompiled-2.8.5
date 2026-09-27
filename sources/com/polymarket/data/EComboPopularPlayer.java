package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
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
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBW\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\t\u0010\u0015B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u0010H\u0016J\u0015\u0010)\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\fH\u0082 J\u0015\u0010.\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010/\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\fH\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00103\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\fH\u0082 J\u001c\u00108\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00109J$\u0010:\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0082 ¢\u0006\u0002\u0010;J\u0017\u0010>\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010?\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u00132\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010E\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\u00132\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010I\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0082 JT\u0010J\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0002\u0010KJ\u0015\u0010L\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0016\u001a\u00020\u0001H\u0082 J\b\u0010X\u001a\u00020\u0001H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\"0Z2\u0006\u0010[\u001a\u00020\u0010H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0Z2\u0006\u0010[\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\r\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R(\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010$\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010$\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001d\u0018\u00010NX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006^"}, d2 = {"Lcom/polymarket/data/EComboPopularPlayer;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "teamId", "jerseyNumber", "", "position", "jerseyImageURL", "Ljava/net/URI;", "jerseyDarkImageURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getName", "setName", "Swift_name", "Swift_name_set", "getTeamId", "setTeamId", "Swift_teamId", "Swift_teamId_set", "getJerseyNumber", "()Ljava/lang/Integer;", "setJerseyNumber", "(Ljava/lang/Integer;)V", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "Swift_jerseyNumber_set", "(JLjava/lang/Integer;)V", "getPosition", "setPosition", "Swift_position", "Swift_position_set", "getJerseyImageURL", "()Ljava/net/URI;", "setJerseyImageURL", "(Ljava/net/URI;)V", "Swift_jerseyImageURL", "Swift_jerseyImageURL_set", "getJerseyDarkImageURL", "setJerseyDarkImageURL", "Swift_jerseyDarkImageURL", "Swift_jerseyDarkImageURL_set", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;)J", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboPopularPlayer implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EComboPopularPlayer(String str, String str2, String str3, Integer num, String str4, URI uri, URI uri2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r0, r1, r3, r4, r5, r16);
        String str5;
        String str6;
        Integer num2;
        String str7;
        URI uri3;
        URI uri4;
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 32) != 0) {
            uri3 = null;
        } else {
            uri3 = uri;
        }
        if ((i & 64) != 0) {
            uri4 = null;
        } else {
            uri4 = uri2;
        }
    }

    private final native long Swift_constructor_0(String id, String name, String teamId, Integer jerseyNumber, String position, URI jerseyImageURL, URI jerseyDarkImageURL);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native URI Swift_jerseyDarkImageURL(long Swift_peer);

    private final native void Swift_jerseyDarkImageURL_set(long Swift_peer, URI value);

    private final native URI Swift_jerseyImageURL(long Swift_peer);

    private final native void Swift_jerseyImageURL_set(long Swift_peer, URI value);

    private final native Integer Swift_jerseyNumber(long Swift_peer);

    private final native void Swift_jerseyNumber_set(long Swift_peer, Integer value);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

    private final native String Swift_position(long Swift_peer);

    private final native void Swift_position_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_teamId(long Swift_peer);

    private final native void Swift_teamId_set(long Swift_peer, String value);

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

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getJerseyDarkImageURL() {
        return Swift_jerseyDarkImageURL(this.Swift_peer);
    }

    public final URI getJerseyImageURL() {
        return Swift_jerseyImageURL(this.Swift_peer);
    }

    public final Integer getJerseyNumber() {
        return Swift_jerseyNumber(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final String getPosition() {
        return Swift_position(this.Swift_peer);
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

    public final String getTeamId() {
        return Swift_teamId(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EComboPopularPlayer(this);
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

    public final void setJerseyDarkImageURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_jerseyDarkImageURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setJerseyImageURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_jerseyImageURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setJerseyNumber(Integer num) {
        willmutate();
        try {
            Swift_jerseyNumber_set(this.Swift_peer, num);
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

    public final void setPosition(String str) {
        willmutate();
        try {
            Swift_position_set(this.Swift_peer, str);
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

    public final void setTeamId(String str) {
        willmutate();
        try {
            Swift_teamId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public EComboPopularPlayer(String str, String str2, String str3, Integer num, String str4, URI uri, URI uri2) {
        str.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, num, str4, uri, uri2);
    }

    public EComboPopularPlayer(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EComboPopularPlayer(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
