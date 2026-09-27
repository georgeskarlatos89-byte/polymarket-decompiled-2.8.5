package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ghB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBc\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010%\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010&\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010'\u001a\u00020\fH\u0082 J\u0015\u0010*\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010'\u001a\u00020\fH\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010/\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00103\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00107\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010<\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010=\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010'\u001a\u00020\u0012H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u00142\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010C\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010G\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082 JW\u0010H\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010L\u001a\u00020J2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010M\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0082 J\b\u0010[\u001a\u00020\u0001H\u0016J\u0013\u0010\\\u001a\u00020J2\b\u0010]\u001a\u0004\u0018\u00010PH\u0096\u0002J\u0019\u0010^\u001a\u00020J2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u0000H\u0082 J\b\u0010a\u001a\u00020VH\u0016J\u0015\u0010b\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010c\u001a\b\u0012\u0004\u0012\u00020P0d2\u0006\u0010e\u001a\u00020VH\u0016J\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020P0d2\u0006\u0010e\u001a\u00020VH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R(\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R$\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R\u0011\u0010I\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bI\u0010KR(\u0010N\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u001e\u0018\u00010OX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006i"}, d2 = {"Lcom/polymarket/data/EHub;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "imageURL", "iconURL", "status", "Lcom/polymarket/data/EHub$Status;", "startTime", "Ljava/util/Date;", "slug", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EHub$Status;Ljava/util/Date;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getTitle", "setTitle", "Swift_title", "Swift_title_set", "getSubtitle", "setSubtitle", "Swift_subtitle", "Swift_subtitle_set", "getImageURL", "setImageURL", "Swift_imageURL", "Swift_imageURL_set", "getIconURL", "setIconURL", "Swift_iconURL", "Swift_iconURL_set", "getStatus", "()Lcom/polymarket/data/EHub$Status;", "setStatus", "(Lcom/polymarket/data/EHub$Status;)V", "Swift_status", "Swift_status_set", "getStartTime", "()Ljava/util/Date;", "setStartTime", "(Ljava/util/Date;)V", "Swift_startTime", "Swift_startTime_set", "getSlug", "setSlug", "Swift_slug", "Swift_slug_set", "Swift_constructor_0", "isActive", "", "()Z", "Swift_isActive", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Status", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EHub implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ EHub(String str, String str2, String str3, String str4, String str5, Status status, Date date, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? Status.unknown : status, (i & 64) != 0 ? null : date, (i & 128) != 0 ? null : str6);
    }

    private final native long Swift_constructor_0(String id, String title, String subtitle, String imageURL, String iconURL, Status status, Date startTime, String slug);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_iconURL(long Swift_peer);

    private final native void Swift_iconURL_set(long Swift_peer, String value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native String Swift_imageURL(long Swift_peer);

    private final native void Swift_imageURL_set(long Swift_peer, String value);

    private final native boolean Swift_isActive(long Swift_peer);

    private final native boolean Swift_isequal(EHub lhs, EHub rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_slug(long Swift_peer);

    private final native void Swift_slug_set(long Swift_peer, String value);

    private final native Date Swift_startTime(long Swift_peer);

    private final native void Swift_startTime_set(long Swift_peer, Date value);

    private final native Status Swift_status(long Swift_peer);

    private final native void Swift_status_set(long Swift_peer, Status value);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof EHub)) {
            return false;
        }
        return Swift_isequal(this, (EHub) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getIconURL() {
        return Swift_iconURL(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final String getSlug() {
        return Swift_slug(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Date getStartTime() {
        return Swift_startTime(this.Swift_peer);
    }

    public final Status getStatus() {
        return Swift_status(this.Swift_peer);
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
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isActive() {
        return Swift_isActive(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EHub(this);
    }

    public final void setIconURL(String str) {
        willmutate();
        try {
            Swift_iconURL_set(this.Swift_peer, str);
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

    public final void setImageURL(String str) {
        willmutate();
        try {
            Swift_imageURL_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setSlug(String str) {
        willmutate();
        try {
            Swift_slug_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStartTime(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_startTime_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setStatus(Status status) {
        status.getClass();
        willmutate();
        try {
            Swift_status_set(this.Swift_peer, status);
        } finally {
            didmutate();
        }
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EHub$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "active", "archived", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Status implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status active = new Status("active", 0, "HUB_STATUS_ACTIVE", null, 2, null);
        public static final Status archived = new Status("archived", 1, "HUB_STATUS_ARCHIVED", null, 2, null);
        public static final Status unknown = new Status("unknown", 2, "unknown", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{active, archived, unknown};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Status(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EHub$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EHub$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -284840886) {
                    if (hashCode != 1592855049) {
                        if (hashCode == 1665010213 && rawValue.equals("HUB_STATUS_ARCHIVED")) {
                            return Status.archived;
                        }
                        return null;
                    }
                    if (rawValue.equals("HUB_STATUS_ACTIVE")) {
                        return Status.active;
                    }
                    return null;
                }
                if (!rawValue.equals("unknown")) {
                    return null;
                }
                return Status.unknown;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Status(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ5\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0082 J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/EHub$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/data/EHub;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "status", "Lcom/polymarket/data/EHub$Status;", "startTime", "Ljava/util/Date;", "Swift_Companion_mock_1", "Status", "rawValue", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EHub Swift_Companion_mock_1(String id, String title, String subtitle, Status status, Date startTime);

        public static /* synthetic */ EHub mock$default(Companion companion, String str, String str2, String str3, Status status, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "hub-1";
            }
            if ((i & 2) != 0) {
                str2 = "2026 Midterms";
            }
            if ((i & 4) != 0) {
                str3 = "Prediction Hub";
            }
            if ((i & 8) != 0) {
                status = Status.active;
            }
            if ((i & 16) != 0) {
                date = null;
            }
            Date date2 = date;
            String str4 = str3;
            return companion.mock(str, str2, str4, status, date2);
        }

        public final Status Status(String rawValue) {
            rawValue.getClass();
            return Status.INSTANCE.init(rawValue);
        }

        public final EHub mock(String id, String title, String subtitle, Status status, Date startTime) {
            id.getClass();
            title.getClass();
            status.getClass();
            return Swift_Companion_mock_1(id, title, subtitle, status, startTime);
        }

        private Companion() {
        }
    }

    public EHub(String str, String str2, String str3, String str4, String str5, Status status, Date date, String str6) {
        str.getClass();
        str2.getClass();
        status.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5, status, date, str6);
    }

    public EHub(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EHub(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
