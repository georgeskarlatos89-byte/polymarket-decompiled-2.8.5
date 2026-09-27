package com.polymarket.clients;

import com.polymarket.designtokens.Icon;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0007vwxyz{|B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010\u001f\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020\u0002H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010!2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010(\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010-\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00102\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u000204032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010;\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020403H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010@\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010A2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010H\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010AH\u0082 J\u0015\u0010O\u001a\u00020I2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010P\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010 \u001a\u00020IH\u0082 J\u0017\u0010W\u001a\u0004\u0018\u00010Q2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010X\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010QH\u0082 J\u0017\u0010\\\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010]\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0082 J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0096\u0002J\u0019\u0010b\u001a\u00020_2\u0006\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0000H\u0082 J\u0015\u0010e\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010q\u001a\u00020\u0003H\u0016J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020a0s2\u0006\u0010t\u001a\u00020\u0017H\u0016J\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020a0s2\u0006\u0010t\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0018\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR0\u00105\u001a\b\u0012\u0004\u0012\u000204032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u000204038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010<\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0018\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u0018\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010Y\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010\u001b\"\u0004\b[\u0010\u001dR(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u0014\u0018\u00010gX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006}"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "Lcom/polymarket/clients/ClientHeroSheet$Image;", "image", "getImage", "()Lcom/polymarket/clients/ClientHeroSheet$Image;", "setImage", "(Lcom/polymarket/clients/ClientHeroSheet$Image;)V", "Swift_image", "Swift_image_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "Swift_title", "Swift_title_set", "subtitle", "getSubtitle", "setSubtitle", "Swift_subtitle", "Swift_subtitle_set", "", "Lcom/polymarket/clients/ClientHeroSheet$Action;", "actions", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "Swift_actions", "Swift_actions_set", "caption", "getCaption", "setCaption", "Swift_caption", "Swift_caption_set", "Lcom/polymarket/clients/ClientHeroSheet$Accent;", "accent", "getAccent", "()Lcom/polymarket/clients/ClientHeroSheet$Accent;", "setAccent", "(Lcom/polymarket/clients/ClientHeroSheet$Accent;)V", "Swift_accent", "Swift_accent_set", "Lcom/polymarket/clients/ClientHeroSheet$Dismissal;", "dismissal", "getDismissal", "()Lcom/polymarket/clients/ClientHeroSheet$Dismissal;", "setDismissal", "(Lcom/polymarket/clients/ClientHeroSheet$Dismissal;)V", "Swift_dismissal", "Swift_dismissal_set", "Lcom/polymarket/clients/ClientHeroSheet$Analytics;", "analytics", "getAnalytics", "()Lcom/polymarket/clients/ClientHeroSheet$Analytics;", "setAnalytics", "(Lcom/polymarket/clients/ClientHeroSheet$Analytics;)V", "Swift_analytics", "Swift_analytics_set", "debugInfo", "getDebugInfo", "setDebugInfo", "Swift_debugInfo", "Swift_debugInfo_set", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Analytics", "Image", "Accent", "Dismissal", "DismissMethod", "Action", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientHeroSheet implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Dismissal;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "swipe", "swipeAndClose", "locked", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Dismissal implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Dismissal[] $VALUES;
        public static final Dismissal swipe = new Dismissal("swipe", 0);
        public static final Dismissal swipeAndClose = new Dismissal("swipeAndClose", 1);
        public static final Dismissal locked = new Dismissal("locked", 2);

        private static final /* synthetic */ Dismissal[] $values() {
            return new Dismissal[]{swipe, swipeAndClose, locked};
        }

        static {
            Dismissal[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Dismissal(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Dismissal valueOf(String str) {
            return (Dismissal) Enum.valueOf(Dismissal.class, str);
        }

        public static Dismissal[] values() {
            return (Dismissal[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private ClientHeroSheet(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native Accent Swift_accent(long Swift_peer);

    private final native void Swift_accent_set(long Swift_peer, Accent value);

    private final native List<Action> Swift_actions(long Swift_peer);

    private final native void Swift_actions_set(long Swift_peer, List<Action> value);

    private final native Analytics Swift_analytics(long Swift_peer);

    private final native void Swift_analytics_set(long Swift_peer, Analytics value);

    private final native String Swift_caption(long Swift_peer);

    private final native void Swift_caption_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_debugInfo(long Swift_peer);

    private final native void Swift_debugInfo_set(long Swift_peer, String value);

    private final native Dismissal Swift_dismissal(long Swift_peer);

    private final native void Swift_dismissal_set(long Swift_peer, Dismissal value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native Image Swift_image(long Swift_peer);

    private final native void Swift_image_set(long Swift_peer, Image value);

    private final native boolean Swift_isequal(ClientHeroSheet lhs, ClientHeroSheet rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native void Swift_subtitle_set(long Swift_peer, String value);

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
        if (!(other instanceof ClientHeroSheet)) {
            return false;
        }
        return Swift_isequal(this, (ClientHeroSheet) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Accent getAccent() {
        return Swift_accent(this.Swift_peer);
    }

    public final List<Action> getActions() {
        return Swift_actions(this.Swift_peer);
    }

    public final Analytics getAnalytics() {
        return Swift_analytics(this.Swift_peer);
    }

    public final String getCaption() {
        return Swift_caption(this.Swift_peer);
    }

    public final String getDebugInfo() {
        return Swift_debugInfo(this.Swift_peer);
    }

    public final Dismissal getDismissal() {
        return Swift_dismissal(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final Image getImage() {
        return Swift_image(this.Swift_peer);
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

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientHeroSheet(this);
    }

    public final void setAccent(Accent accent) {
        willmutate();
        try {
            Swift_accent_set(this.Swift_peer, accent);
        } finally {
            didmutate();
        }
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

    public final void setAnalytics(Analytics analytics) {
        willmutate();
        try {
            Swift_analytics_set(this.Swift_peer, analytics);
        } finally {
            didmutate();
        }
    }

    public final void setCaption(String str) {
        willmutate();
        try {
            Swift_caption_set(this.Swift_peer, str);
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

    public final void setDismissal(Dismissal dismissal) {
        dismissal.getClass();
        willmutate();
        try {
            Swift_dismissal_set(this.Swift_peer, dismissal);
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

    public final void setImage(Image image) {
        willmutate();
        try {
            Swift_image_set(this.Swift_peer, image);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSubtitle(String str) {
        willmutate();
        try {
            Swift_subtitle_set(this.Swift_peer, str);
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
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u000289B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J0\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0019\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u000e\u0010/\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00100J+\u00101\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u00110\"H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020$052\u0006\u00106\u001a\u00020\u0014H\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020$052\u0006\u00106\u001a\u00020\u0014H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR'\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Action;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "role", "Lcom/polymarket/clients/ClientHeroSheet$Action$Role;", "getRole", "()Lcom/polymarket/clients/ClientHeroSheet$Action$Role;", "Swift_role", "didSelect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "getDidSelect", "()Lkotlin/jvm/functions/Function1;", "Swift_didSelect", "(J)Lkotlin/jvm/functions/Function1;", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "executeAction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_executeAction_0", "f_callback", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Role", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Action implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Action(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native void Swift_callback_executeAction_0(long Swift_peer, Function1<? super Throwable, Unit> f_callback);

        private final native Function1<Continuation<? super Unit>, Object> Swift_didSelect(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Action lhs, Action rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Role Swift_role(long Swift_peer);

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
            Object run = Async.INSTANCE.run(new ClientHeroSheet$Action$executeAction$2(this, null), continuation);
            if (run == u85.COROUTINE_SUSPENDED) {
                return run;
            }
            return Unit.INSTANCE;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function1<Continuation<? super Unit>, Object> getDidSelect() {
            return Swift_didSelect(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Role getRole() {
            return Swift_role(this.Swift_peer);
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
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0015"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Action$Role;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "primary", "secondary", "destructive", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Role implements RawRepresentable<Integer>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Role[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int rawValue;
            public static final Role primary = new Role("primary", 0, 0, null, 2, null);
            public static final Role secondary = new Role("secondary", 1, 1, null, 2, null);
            public static final Role destructive = new Role("destructive", 2, 2, null, 2, null);

            private static final /* synthetic */ Role[] $values() {
                return new Role[]{primary, secondary, destructive};
            }

            static {
                Role[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Role(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, (i3 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Role valueOf(String str) {
                return (Role) Enum.valueOf(Role.class, str);
            }

            public static Role[] values() {
                return (Role[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Action$Role$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientHeroSheet$Action$Role;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Role init(int rawValue) {
                    if (rawValue != 0) {
                        if (rawValue != 1) {
                            if (rawValue != 2) {
                                return null;
                            }
                            return Role.destructive;
                        }
                        return Role.secondary;
                    }
                    return Role.primary;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ Integer getRawValue() {
                return getRawValue();
            }

            private Role(String str, int i, int i2, Void r4) {
                this.rawValue = i2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Action$Companion;", "", "<init>", "()V", "Role", "Lcom/polymarket/clients/ClientHeroSheet$Action$Role;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Role Role(int rawValue) {
                return Role.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Accent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "AutoCase", "ColorsCase", "Companion", "Lcom/polymarket/clients/ClientHeroSheet$Accent$AutoCase;", "Lcom/polymarket/clients/ClientHeroSheet$Accent$ColorsCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class Accent implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Accent auto = new AutoCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Accent$AutoCase;", "Lcom/polymarket/clients/ClientHeroSheet$Accent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AutoCase extends Accent {
            public AutoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Accent$ColorsCase;", "Lcom/polymarket/clients/ClientHeroSheet$Accent;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Ljava/util/List;", "baseHex", "getBaseHex", "highlightHexes", "getHighlightHexes", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ColorsCase extends Accent {
            private final String associated0;
            private final List<String> associated1;
            private final String baseHex;
            private final List<String> highlightHexes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColorsCase(String str, List<String> list) {
                super(null);
                str.getClass();
                list.getClass();
                this.associated0 = str;
                this.associated1 = list;
                this.baseHex = str;
                this.highlightHexes = list;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final List<String> getAssociated1() {
                return this.associated1;
            }

            public final String getBaseHex() {
                return this.baseHex;
            }

            public final List<String> getHighlightHexes() {
                return this.highlightHexes;
            }
        }

        public /* synthetic */ Accent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Accent access$getAuto$cp() {
            return auto;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Accent$Companion;", "", "<init>", "()V", "auto", "Lcom/polymarket/clients/ClientHeroSheet$Accent;", "getAuto", "()Lcom/polymarket/clients/ClientHeroSheet$Accent;", "colors", "baseHex", "", "highlightHexes", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Accent colors(String baseHex, List<String> highlightHexes) {
                baseHex.getClass();
                highlightHexes.getClass();
                return new ColorsCase(baseHex, highlightHexes);
            }

            public final Accent getAuto() {
                return Accent.access$getAuto$cp();
            }

            private Companion() {
            }
        }

        private Accent() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$DismissMethod;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "action", "closeButton", "other", "swipe", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DismissMethod implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ DismissMethod[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DismissMethod action = new DismissMethod("action", 0, "action", null, 2, null);
        public static final DismissMethod closeButton = new DismissMethod("closeButton", 1, "close_button", null, 2, null);
        public static final DismissMethod other = new DismissMethod("other", 2, "other", null, 2, null);
        public static final DismissMethod swipe = new DismissMethod("swipe", 3, "swipe", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ DismissMethod[] $values() {
            return new DismissMethod[]{action, closeButton, other, swipe};
        }

        static {
            DismissMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ DismissMethod(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static DismissMethod valueOf(String str) {
            return (DismissMethod) Enum.valueOf(DismissMethod.class, str);
        }

        public static DismissMethod[] values() {
            return (DismissMethod[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$DismissMethod$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientHeroSheet$DismissMethod;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DismissMethod init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1678958759:
                        if (!rawValue.equals("close_button")) {
                            return null;
                        }
                        return DismissMethod.closeButton;
                    case -1422950858:
                        if (rawValue.equals("action")) {
                            return DismissMethod.action;
                        }
                        return null;
                    case 106069776:
                        if (rawValue.equals("other")) {
                            return DismissMethod.other;
                        }
                        return null;
                    case 109854522:
                        if (rawValue.equals("swipe")) {
                            return DismissMethod.swipe;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private DismissMethod(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Image;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "IconCase", "RemoteCase", "Companion", "Lcom/polymarket/clients/ClientHeroSheet$Image$IconCase;", "Lcom/polymarket/clients/ClientHeroSheet$Image$RemoteCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class Image implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Image$IconCase;", "Lcom/polymarket/clients/ClientHeroSheet$Image;", "associated0", "Lcom/polymarket/designtokens/Icon;", "<init>", "(Lcom/polymarket/designtokens/Icon;)V", "getAssociated0", "()Lcom/polymarket/designtokens/Icon;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class IconCase extends Image {
            private final Icon associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCase(Icon icon) {
                super(null);
                icon.getClass();
                this.associated0 = icon;
            }

            public boolean equals(Object other) {
                if (!(other instanceof IconCase) || this.associated0 != ((IconCase) other).associated0) {
                    return false;
                }
                return true;
            }

            public final Icon getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Image$RemoteCase;", "Lcom/polymarket/clients/ClientHeroSheet$Image;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class RemoteCase extends Image {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof RemoteCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((RemoteCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Image(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Image$Companion;", "", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/clients/ClientHeroSheet$Image;", "associated0", "Lcom/polymarket/designtokens/Icon;", "remote", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Image icon(Icon associated0) {
                associated0.getClass();
                return new IconCase(associated0);
            }

            public final Image remote(String associated0) {
                associated0.getClass();
                return new RemoteCase(associated0);
            }

            private Companion() {
            }
        }

        private Image() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Companion;", "", "<init>", "()V", "DismissMethod", "Lcom/polymarket/clients/ClientHeroSheet$DismissMethod;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DismissMethod DismissMethod(String rawValue) {
            rawValue.getClass();
            return DismissMethod.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ClientHeroSheet(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rH\u0082 J\u0015\u0010 \u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0015\u0010%\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000e\u0010&\u001a\u00020\"2\u0006\u0010)\u001a\u00020*J\u001d\u0010+\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010)\u001a\u00020*H\u0082 J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u000bJ\u001d\u0010.\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010-\u001a\u00020\u000bH\u0082 J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u0018H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u0006;"}, d2 = {"Lcom/polymarket/clients/ClientHeroSheet$Analytics;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sheetId", "", "properties", "", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSheetId", "()Ljava/lang/String;", "Swift_sheetId", "getProperties", "()Ljava/util/Map;", "Swift_properties", "Swift_constructor_0", "Swift_constructor_1", "shownInput", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getShownInput", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_shownInput", "dismissedInput", "getDismissedInput", "Swift_dismissedInput", "dismissMethod", "Lcom/polymarket/clients/ClientHeroSheet$DismissMethod;", "Swift_dismissedInput_2", "actionInput", "actionId", "Swift_actionInput_3", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Analytics implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Analytics(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, map);
        }

        private final native ClientAnalyticsInput Swift_actionInput_3(long Swift_peer, String actionId);

        private final native long Swift_constructor_0(String sheetId, Map<String, String> properties);

        private final native long Swift_constructor_1(String sheetId);

        private final native ClientAnalyticsInput Swift_dismissedInput(long Swift_peer);

        private final native ClientAnalyticsInput Swift_dismissedInput_2(long Swift_peer, DismissMethod dismissMethod);

        private final native boolean Swift_isequal(Analytics lhs, Analytics rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Map<String, String> Swift_properties(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_sheetId(long Swift_peer);

        private final native ClientAnalyticsInput Swift_shownInput(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput actionInput(String actionId) {
            actionId.getClass();
            return Swift_actionInput_3(this.Swift_peer, actionId);
        }

        public final ClientAnalyticsInput dismissedInput(DismissMethod dismissMethod) {
            dismissMethod.getClass();
            return Swift_dismissedInput_2(this.Swift_peer, dismissMethod);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            return Swift_isequal(this, (Analytics) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final ClientAnalyticsInput getDismissedInput() {
            return Swift_dismissedInput(this.Swift_peer);
        }

        public final Map<String, String> getProperties() {
            return Swift_properties(this.Swift_peer);
        }

        public final String getSheetId() {
            return Swift_sheetId(this.Swift_peer);
        }

        public final ClientAnalyticsInput getShownInput() {
            return Swift_shownInput(this.Swift_peer);
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

        public Analytics(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public Analytics(String str) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(str);
        }
    }
}
