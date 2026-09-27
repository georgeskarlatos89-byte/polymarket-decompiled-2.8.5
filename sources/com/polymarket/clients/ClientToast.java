package com.polymarket.clients;

import com.polymarket.data.EMarketImageContext;
import com.polymarket.data.ESquad;
import com.polymarket.designtokens.Icon;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 p2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0004mnopB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010\u001f\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020\u0002H\u0082 J\u0015\u0010'\u001a\u00020!2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010(\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020!H\u0082 J\u0015\u0010,\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010-\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020\u0002H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00102\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00109\u001a\u0004\u0018\u0001032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010:\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u000103H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010;2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010B\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010;H\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010C2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010J\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010CH\u0082 J\u001c\u0010Q\u001a\u0004\u0018\u00010K2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 ¢\u0006\u0002\u0010RJ$\u0010S\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010KH\u0082 ¢\u0006\u0002\u0010TJ\u0015\u0010U\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010b\u001a\u00020\u0003H\u0016J\u0013\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010XH\u0096\u0002J\u0019\u0010f\u001a\u00020d2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u0000H\u0082 J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020X0j2\u0006\u0010k\u001a\u00020\u0017H\u0016J\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020X0j2\u0006\u0010k\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR(\u00104\u001a\u0004\u0018\u0001032\b\u0010\u0018\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010<\u001a\u0004\u0018\u00010;2\b\u0010\u0018\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010\u0018\u001a\u0004\u0018\u00010C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0018\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010V\u001a\u0010\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0014\u0018\u00010WX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006q"}, d2 = {"Lcom/polymarket/clients/ClientToast;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "Lcom/polymarket/clients/ClientToast$Style;", "style", "getStyle", "()Lcom/polymarket/clients/ClientToast$Style;", "setStyle", "(Lcom/polymarket/clients/ClientToast$Style;)V", "Swift_style", "Swift_style_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "Swift_title", "Swift_title_set", "body", "getBody", "setBody", "Swift_body", "Swift_body_set", "Lcom/polymarket/clients/ClientToast$Media;", "media", "getMedia", "()Lcom/polymarket/clients/ClientToast$Media;", "setMedia", "(Lcom/polymarket/clients/ClientToast$Media;)V", "Swift_media", "Swift_media_set", "Lcom/polymarket/designtokens/Icon;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "getIcon", "()Lcom/polymarket/designtokens/Icon;", "setIcon", "(Lcom/polymarket/designtokens/Icon;)V", "Swift_icon", "Swift_icon_set", "Lcom/polymarket/clients/ClientToast$Action;", "action", "getAction", "()Lcom/polymarket/clients/ClientToast$Action;", "setAction", "(Lcom/polymarket/clients/ClientToast$Action;)V", "Swift_action", "Swift_action_set", "", "displayDuration", "getDisplayDuration", "()Ljava/lang/Double;", "setDisplayDuration", "(Ljava/lang/Double;)V", "Swift_displayDuration", "(J)Ljava/lang/Double;", "Swift_displayDuration_set", "(JLjava/lang/Double;)V", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Style", "Media", "Action", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientToast implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/ClientToast$Style;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "error", "success", "warning", "info", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Style implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style error = new Style("error", 0);
        public static final Style success = new Style("success", 1);
        public static final Style warning = new Style("warning", 2);
        public static final Style info = new Style("info", 3);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{error, success, warning, info};
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

    private ClientToast(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native Action Swift_action(long Swift_peer);

    private final native void Swift_action_set(long Swift_peer, Action value);

    private final native String Swift_body(long Swift_peer);

    private final native void Swift_body_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native Double Swift_displayDuration(long Swift_peer);

    private final native void Swift_displayDuration_set(long Swift_peer, Double value);

    private final native Icon Swift_icon(long Swift_peer);

    private final native void Swift_icon_set(long Swift_peer, Icon value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isequal(ClientToast lhs, ClientToast rhs);

    private final native Media Swift_media(long Swift_peer);

    private final native void Swift_media_set(long Swift_peer, Media value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientToast)) {
            return false;
        }
        return Swift_isequal(this, (ClientToast) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Action getAction() {
        return Swift_action(this.Swift_peer);
    }

    public final String getBody() {
        return Swift_body(this.Swift_peer);
    }

    public final Double getDisplayDuration() {
        return Swift_displayDuration(this.Swift_peer);
    }

    public final Icon getIcon() {
        return Swift_icon(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final Media getMedia() {
        return Swift_media(this.Swift_peer);
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
        return new ClientToast(this);
    }

    public final void setAction(Action action) {
        willmutate();
        try {
            Swift_action_set(this.Swift_peer, action);
        } finally {
            didmutate();
        }
    }

    public final void setBody(String str) {
        willmutate();
        try {
            Swift_body_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayDuration(Double d) {
        willmutate();
        try {
            Swift_displayDuration_set(this.Swift_peer, d);
        } finally {
            didmutate();
        }
    }

    public final void setIcon(Icon icon) {
        willmutate();
        try {
            Swift_icon_set(this.Swift_peer, icon);
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

    public final void setMedia(Media media) {
        willmutate();
        try {
            Swift_media_set(this.Swift_peer, media);
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
        str.getClass();
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/polymarket/clients/ClientToast$Action;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OpenURLCase", "Companion", "Lcom/polymarket/clients/ClientToast$Action$OpenURLCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class Action implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientToast$Action$OpenURLCase;", "Lcom/polymarket/clients/ClientToast$Action;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class OpenURLCase extends Action {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenURLCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public boolean equals(Object other) {
                if (!(other instanceof OpenURLCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((OpenURLCase) other).associated0);
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientToast$Action$Companion;", "", "<init>", "()V", "openURL", "Lcom/polymarket/clients/ClientToast$Action;", "associated0", "Ljava/net/URI;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Action openURL(URI associated0) {
                associated0.getClass();
                return new OpenURLCase(associated0);
            }

            private Companion() {
            }
        }

        private Action() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ClientToast$Media;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "MarketCase", "SquadCase", "RemoteCase", "Companion", "Lcom/polymarket/clients/ClientToast$Media$MarketCase;", "Lcom/polymarket/clients/ClientToast$Media$RemoteCase;", "Lcom/polymarket/clients/ClientToast$Media$SquadCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class Media implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientToast$Media$MarketCase;", "Lcom/polymarket/clients/ClientToast$Media;", "associated0", "Lcom/polymarket/data/EMarketImageContext;", "<init>", "(Lcom/polymarket/data/EMarketImageContext;)V", "getAssociated0", "()Lcom/polymarket/data/EMarketImageContext;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MarketCase extends Media {
            private final EMarketImageContext associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarketCase(EMarketImageContext eMarketImageContext) {
                super(null);
                eMarketImageContext.getClass();
                this.associated0 = eMarketImageContext;
            }

            public boolean equals(Object other) {
                if (!(other instanceof MarketCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((MarketCase) other).associated0);
            }

            public final EMarketImageContext getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ClientToast$Media$RemoteCase;", "Lcom/polymarket/clients/ClientToast$Media;", "associated0", "Ljava/net/URI;", "associated1", "", "<init>", "(Ljava/net/URI;Z)V", "getAssociated0", "()Ljava/net/URI;", "getAssociated1", "()Z", "circular", "getCircular", "equals", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class RemoteCase extends Media {
            private final URI associated0;
            private final boolean associated1;
            private final boolean circular;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteCase(URI uri, boolean z) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
                this.associated1 = z;
                this.circular = z;
            }

            public boolean equals(Object other) {
                if (!(other instanceof RemoteCase)) {
                    return false;
                }
                RemoteCase remoteCase = (RemoteCase) other;
                if (!Intrinsics.areEqual(this.associated0, remoteCase.associated0) || this.associated1 != remoteCase.associated1) {
                    return false;
                }
                return true;
            }

            public final URI getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }

            public final boolean getCircular() {
                return this.circular;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientToast$Media$SquadCase;", "Lcom/polymarket/clients/ClientToast$Media;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SquadCase extends Media {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SquadCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public boolean equals(Object other) {
                if (!(other instanceof SquadCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((SquadCase) other).associated0);
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Media(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientToast$Media$Companion;", "", "<init>", "()V", "market", "Lcom/polymarket/clients/ClientToast$Media;", "associated0", "Lcom/polymarket/data/EMarketImageContext;", "squad", "Lcom/polymarket/data/ESquad;", "remote", "Ljava/net/URI;", "circular", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Media market(EMarketImageContext associated0) {
                associated0.getClass();
                return new MarketCase(associated0);
            }

            public final Media remote(URI associated0, boolean circular) {
                associated0.getClass();
                return new RemoteCase(associated0, circular);
            }

            public final Media squad(ESquad associated0) {
                associated0.getClass();
                return new SquadCase(associated0);
            }

            private Companion() {
            }
        }

        private Media() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ClientToast(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
