package com.polymarket.clients;

import com.polymarket.designtokens.Icon;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0004rstuB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010\u001f\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020\u0002H\u0082 J\u0015\u0010'\u001a\u00020!2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010(\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020!H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010-\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00102\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J#\u0010;\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J+\u0010<\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u000103H\u0082 J\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020>0=2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010E\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020>0=H\u0082 J\u0015\u0010L\u001a\u00020F2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010M\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020FH\u0082 J\u0017\u0010Q\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010R\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010Y\u001a\u0004\u0018\u00010S2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010Z\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010SH\u0082 J\u0013\u0010[\u001a\u00020F2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0096\u0002J\u0019\u0010^\u001a\u00020F2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u0000H\u0082 J\u0015\u0010a\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010m\u001a\u00020\u0003H\u0016J\u0016\u0010n\u001a\b\u0012\u0004\u0012\u00020]0o2\u0006\u0010p\u001a\u00020\u0017H\u0016J\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020]0o2\u0006\u0010p\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR@\u00106\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001032\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R0\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020>0=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010G\u001a\u00020F2\u0006\u0010\u0018\u001a\u00020F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010N\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u0010\u001dR(\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\u0018\u001a\u0004\u0018\u00010S8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010b\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u0014\u0018\u00010cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006v"}, d2 = {"Lcom/polymarket/clients/ClientAlert;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "Lcom/polymarket/clients/ClientAlert$Style;", "style", "getStyle", "()Lcom/polymarket/clients/ClientAlert$Style;", "setStyle", "(Lcom/polymarket/clients/ClientAlert$Style;)V", "Swift_style", "Swift_style_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "Swift_title", "Swift_title_set", "message", "getMessage", "setMessage", "Swift_message", "Swift_message_set", "Lkotlin/Pair;", "Lcom/polymarket/designtokens/Icon;", "Lcom/polymarket/designtokens/Icon$Metadata;", "iconTuple", "getIconTuple", "()Lkotlin/Pair;", "setIconTuple", "(Lkotlin/Pair;)V", "Swift_iconTuple", "Swift_iconTuple_set", "", "Lcom/polymarket/clients/ClientAlert$Action;", "actions", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "Swift_actions", "Swift_actions_set", "", "canSwipeDismiss", "getCanSwipeDismiss", "()Z", "setCanSwipeDismiss", "(Z)V", "Swift_canSwipeDismiss", "Swift_canSwipeDismiss_set", "debugInfo", "getDebugInfo", "setDebugInfo", "Swift_debugInfo", "Swift_debugInfo_set", "Lcom/polymarket/clients/ClientAlert$ShownAnalytics;", "shownAnalytics", "getShownAnalytics", "()Lcom/polymarket/clients/ClientAlert$ShownAnalytics;", "setShownAnalytics", "(Lcom/polymarket/clients/ClientAlert$ShownAnalytics;)V", "Swift_shownAnalytics", "Swift_shownAnalytics_set", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ShownAnalytics", "Style", "Action", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientAlert implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientAlert$Style;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "none", "info", "error", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Style implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style none = new Style("none", 0);
        public static final Style info = new Style("info", 1);
        public static final Style error = new Style("error", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{none, info, error};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Style(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private ClientAlert(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native List<Action> Swift_actions(long Swift_peer);

    private final native void Swift_actions_set(long Swift_peer, List<Action> value);

    private final native boolean Swift_canSwipeDismiss(long Swift_peer);

    private final native void Swift_canSwipeDismiss_set(long Swift_peer, boolean value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_debugInfo(long Swift_peer);

    private final native void Swift_debugInfo_set(long Swift_peer, String value);

    private final native Pair<Icon, Icon.Metadata> Swift_iconTuple(long Swift_peer);

    private final native void Swift_iconTuple_set(long Swift_peer, Pair<? extends Icon, Icon.Metadata> value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isequal(ClientAlert lhs, ClientAlert rhs);

    private final native String Swift_message(long Swift_peer);

    private final native void Swift_message_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ShownAnalytics Swift_shownAnalytics(long Swift_peer);

    private final native void Swift_shownAnalytics_set(long Swift_peer, ShownAnalytics value);

    private final native Style Swift_style(long Swift_peer);

    private final native void Swift_style_set(long Swift_peer, Style value);

    private final native String Swift_title(long Swift_peer);

    private final native void Swift_title_set(long Swift_peer, String value);

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
        if (!(other instanceof ClientAlert)) {
            return false;
        }
        return Swift_isequal(this, (ClientAlert) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<Action> getActions() {
        return Swift_actions(this.Swift_peer);
    }

    public final boolean getCanSwipeDismiss() {
        return Swift_canSwipeDismiss(this.Swift_peer);
    }

    public final String getDebugInfo() {
        return Swift_debugInfo(this.Swift_peer);
    }

    public final Pair<Icon, Icon.Metadata> getIconTuple() {
        return Swift_iconTuple(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getMessage() {
        return Swift_message(this.Swift_peer);
    }

    public final ShownAnalytics getShownAnalytics() {
        return Swift_shownAnalytics(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Style getStyle() {
        return Swift_style(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientAlert(this);
    }

    public final void setActions(List<Action> list) {
        list.getClass();
        List<Action> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_actions_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setCanSwipeDismiss(boolean z) {
        willmutate();
        try {
            Swift_canSwipeDismiss_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setDebugInfo(String str) {
        willmutate();
        try {
            Swift_debugInfo_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setIconTuple(Pair<? extends Icon, Icon.Metadata> pair) {
        willmutate();
        try {
            Swift_iconTuple_set(this.Swift_peer, pair);
        } finally {
            didmutate();
        }
    }

    public void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setMessage(String str) {
        willmutate();
        try {
            Swift_message_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setShownAnalytics(ShownAnalytics shownAnalytics) {
        willmutate();
        try {
            Swift_shownAnalytics_set(this.Swift_peer, shownAnalytics);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStyle(Style style) {
        style.getClass();
        willmutate();
        try {
            Swift_style_set(this.Swift_peer, style);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setTitle(String str) {
        willmutate();
        try {
            Swift_title_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002>?B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J0\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010(J\u001d\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010*2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0019\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u000e\u00104\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00105J+\u00106\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0004\u0012\u00020\u00110\"H\u0082 J\u0006\u00109\u001a\u00020\u0011J\u0015\u0010:\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010<\u001a\u00020\u0014H\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010<\u001a\u00020\u0014H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR'\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006@"}, d2 = {"Lcom/polymarket/clients/ClientAlert$Action;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "style", "Lcom/polymarket/clients/ClientAlert$Action$Style;", "getStyle", "()Lcom/polymarket/clients/ClientAlert$Action$Style;", "Swift_style", "didSelect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "getDidSelect", "()Lkotlin/jvm/functions/Function1;", "Swift_didSelect", "(J)Lkotlin/jvm/functions/Function1;", "afterDismiss", "Lkotlin/Function0;", "getAfterDismiss", "()Lkotlin/jvm/functions/Function0;", "Swift_afterDismiss", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "executeAction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_executeAction_0", "f_callback", "", "executeAfterDismiss", "Swift_executeAfterDismiss_1", "Swift_projection", "options", "Swift_projectionImpl", "Style", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Action implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Action(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native Function0<Unit> Swift_afterDismiss(long Swift_peer);

        private final native void Swift_callback_executeAction_0(long Swift_peer, Function1<? super Throwable, Unit> f_callback);

        private final native Function1<Continuation<? super Unit>, Object> Swift_didSelect(long Swift_peer);

        private final native void Swift_executeAfterDismiss_1(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Action lhs, Action rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Style Swift_style(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        public static final /* synthetic */ void access$Swift_callback_executeAction_0(Action action, long j, Function1 function1) {
            action.Swift_callback_executeAction_0(j, function1);
        }

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
            if (!(other instanceof Action)) {
                return false;
            }
            return Swift_isequal(this, (Action) other);
        }

        public final Object executeAction(Continuation<? super Unit> continuation) {
            Object run = Async.INSTANCE.run(new ClientAlert$Action$executeAction$2(this, null), continuation);
            if (run == u85.COROUTINE_SUSPENDED) {
                return run;
            }
            return Unit.INSTANCE;
        }

        public final void executeAfterDismiss() {
            Swift_executeAfterDismiss_1(this.Swift_peer);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function0<Unit> getAfterDismiss() {
            return Swift_afterDismiss(this.Swift_peer);
        }

        public final Function1<Continuation<? super Unit>, Object> getDidSelect() {
            return Swift_didSelect(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Style getStyle() {
            return Swift_style(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0016"}, d2 = {"Lcom/polymarket/clients/ClientAlert$Action$Style;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "default", "cancel", "destructive", "plain", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Style implements RawRepresentable<Integer>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int rawValue;

            /* renamed from: default, reason: not valid java name */
            public static final Style f0default = new Style("default", 0, 0, null, 2, null);
            public static final Style cancel = new Style("cancel", 1, 1, null, 2, null);
            public static final Style destructive = new Style("destructive", 2, 2, null, 2, null);
            public static final Style plain = new Style("plain", 3, 3, null, 2, null);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{f0default, cancel, destructive, plain};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Style(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, (i3 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // skip.lib.RawRepresentable
            public Integer getRawValue() {
                return Integer.valueOf(this.rawValue);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientAlert$Action$Style$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientAlert$Action$Style;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Style init(int rawValue) {
                    if (rawValue != 0) {
                        if (rawValue != 1) {
                            if (rawValue != 2) {
                                if (rawValue != 3) {
                                    return null;
                                }
                                return Style.plain;
                            }
                            return Style.destructive;
                        }
                        return Style.cancel;
                    }
                    return Style.f0default;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ Integer getRawValue() {
                return getRawValue();
            }

            private Style(String str, int i, int i2, Void r4) {
                this.rawValue = i2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientAlert$Action$Companion;", "", "<init>", "()V", "Style", "Lcom/polymarket/clients/ClientAlert$Action$Style;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Style Style(int rawValue) {
                return Style.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ClientAlert(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rH\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u0017H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/polymarket/clients/ClientAlert$ShownAnalytics;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "properties", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getProperties", "()Ljava/util/Map;", "Swift_properties", "Swift_constructor_0", MetricTracker.Object.INPUT, "Lcom/polymarket/clients/ClientAnalyticsInput;", "getInput", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_input", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ShownAnalytics implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ShownAnalytics(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, map);
        }

        private final native long Swift_constructor_0(String id, Map<String, String> properties);

        private final native String Swift_id(long Swift_peer);

        private final native ClientAnalyticsInput Swift_input(long Swift_peer);

        private final native boolean Swift_isequal(ShownAnalytics lhs, ShownAnalytics rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Map<String, String> Swift_properties(long Swift_peer);

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

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShownAnalytics)) {
                return false;
            }
            return Swift_isequal(this, (ShownAnalytics) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final ClientAnalyticsInput getInput() {
            return Swift_input(this.Swift_peer);
        }

        public final Map<String, String> getProperties() {
            return Swift_properties(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public ShownAnalytics(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
