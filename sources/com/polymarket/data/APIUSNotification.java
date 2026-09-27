package com.polymarket.data;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
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
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0088\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB©\u0001\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u001fJ\u0006\u0010$\u001a\u00020%J\u0015\u0010&\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0015\u00101\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00102\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00103\u001a\u00020\fH\u0082 J\u0015\u00106\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00107\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00103\u001a\u00020\fH\u0082 J\u0015\u0010:\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010;\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00103\u001a\u00020\fH\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010?\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010C\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010H\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010I\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00103\u001a\u00020\u0012H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\u00142\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010O\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010\u00142\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010S\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0017\u0010X\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010Y\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0082 J\u0017\u0010\\\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010]\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0082 J\u0017\u0010`\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010a\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0082 J\u0017\u0010d\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010e\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010i\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010l\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010m\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00103\u001a\u0004\u0018\u00010\fH\u0082 J\u0091\u0001\u0010n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010s\u001a\u00020p2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010v\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010w\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001e\u001a\u00020\u0001H\u0082 J\t\u0010\u0083\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020+H\u0016J\u001a\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020+H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R$\u0010\u000e\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010.\"\u0004\b=\u00100R(\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R$\u0010\u0011\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR(\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR(\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR(\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR(\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010.\"\u0004\bg\u00100R(\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010.\"\u0004\bk\u00100R\u0011\u0010o\u001a\u00020p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010t\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bu\u0010.R(\u0010x\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020%\u0018\u00010yX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001d\u0010~\u001a\u00020+X\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/polymarket/data/APIUSNotification;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "category", "group", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "body", "unread", "", "createdAt", "Ljava/util/Date;", "updatedAt", "iconURL", "Ljava/net/URI;", "iconDarkURL", "imageURL", "actionURL", "actionLabel", "referenceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/net/URI;Ljava/net/URI;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getCategory", "setCategory", "Swift_category", "Swift_category_set", "getGroup", "setGroup", "Swift_group", "Swift_group_set", "getTitle", "setTitle", "Swift_title", "Swift_title_set", "getBody", "setBody", "Swift_body", "Swift_body_set", "getUnread", "()Z", "setUnread", "(Z)V", "Swift_unread", "Swift_unread_set", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "Swift_createdAt", "Swift_createdAt_set", "getUpdatedAt", "setUpdatedAt", "Swift_updatedAt", "Swift_updatedAt_set", "getIconURL", "()Ljava/net/URI;", "setIconURL", "(Ljava/net/URI;)V", "Swift_iconURL", "Swift_iconURL_set", "getIconDarkURL", "setIconDarkURL", "Swift_iconDarkURL", "Swift_iconDarkURL_set", "getImageURL", "setImageURL", "Swift_imageURL", "Swift_imageURL_set", "getActionURL", "setActionURL", "Swift_actionURL", "Swift_actionURL_set", "getActionLabel", "setActionLabel", "Swift_actionLabel", "Swift_actionLabel_set", "getReferenceId", "setReferenceId", "Swift_referenceId", "Swift_referenceId_set", "Swift_constructor_0", "resolvedAction", "Lcom/polymarket/data/ResolvedAction;", "getResolvedAction", "()Lcom/polymarket/data/ResolvedAction;", "Swift_resolvedAction", "formattedTimestamp", "getFormattedTimestamp", "Swift_formattedTimestamp", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIUSNotification implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ APIUSNotification(String str, String str2, String str3, String str4, String str5, boolean z, Date date, Date date2, URI uri, URI uri2, URI uri3, URI uri4, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r30);
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z2;
        Date date3;
        Date date4;
        URI uri5;
        URI uri6;
        URI uri7;
        URI uri8;
        String str12;
        String str13;
        if ((i & 1) != 0) {
            str8 = "";
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            str9 = "";
        } else {
            str9 = str2;
        }
        String str14 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            str10 = null;
        } else {
            str10 = str4;
        }
        if ((i & 16) != 0) {
            str11 = null;
        } else {
            str11 = str5;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 64) != 0) {
            date3 = null;
        } else {
            date3 = date;
        }
        if ((i & 128) != 0) {
            date4 = null;
        } else {
            date4 = date2;
        }
        if ((i & 256) != 0) {
            uri5 = null;
        } else {
            uri5 = uri;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            uri6 = null;
        } else {
            uri6 = uri2;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            uri7 = null;
        } else {
            uri7 = uri3;
        }
        if ((i & 2048) != 0) {
            uri8 = null;
        } else {
            uri8 = uri4;
        }
        if ((i & 4096) != 0) {
            str12 = null;
        } else {
            str12 = str6;
        }
        if ((i & 8192) != 0) {
            str13 = null;
        } else {
            str13 = str7;
        }
    }

    private final native String Swift_actionLabel(long Swift_peer);

    private final native void Swift_actionLabel_set(long Swift_peer, String value);

    private final native URI Swift_actionURL(long Swift_peer);

    private final native void Swift_actionURL_set(long Swift_peer, URI value);

    private final native String Swift_body(long Swift_peer);

    private final native void Swift_body_set(long Swift_peer, String value);

    private final native String Swift_category(long Swift_peer);

    private final native void Swift_category_set(long Swift_peer, String value);

    private final native long Swift_constructor_0(String id, String category, String group, String title, String body, boolean unread, Date createdAt, Date updatedAt, URI iconURL, URI iconDarkURL, URI imageURL, URI actionURL, String actionLabel, String referenceId);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native void Swift_createdAt_set(long Swift_peer, Date value);

    private final native String Swift_formattedTimestamp(long Swift_peer);

    private final native String Swift_group(long Swift_peer);

    private final native void Swift_group_set(long Swift_peer, String value);

    private final native URI Swift_iconDarkURL(long Swift_peer);

    private final native void Swift_iconDarkURL_set(long Swift_peer, URI value);

    private final native URI Swift_iconURL(long Swift_peer);

    private final native void Swift_iconURL_set(long Swift_peer, URI value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native void Swift_imageURL_set(long Swift_peer, URI value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_referenceId(long Swift_peer);

    private final native void Swift_referenceId_set(long Swift_peer, String value);

    private final native void Swift_release(long Swift_peer);

    private final native ResolvedAction Swift_resolvedAction(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native void Swift_title_set(long Swift_peer, String value);

    private final native boolean Swift_unread(long Swift_peer);

    private final native void Swift_unread_set(long Swift_peer, boolean value);

    private final native Date Swift_updatedAt(long Swift_peer);

    private final native void Swift_updatedAt_set(long Swift_peer, Date value);

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

    public final String getActionLabel() {
        return Swift_actionLabel(this.Swift_peer);
    }

    public final URI getActionURL() {
        return Swift_actionURL(this.Swift_peer);
    }

    public final String getBody() {
        return Swift_body(this.Swift_peer);
    }

    public final String getCategory() {
        return Swift_category(this.Swift_peer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final String getFormattedTimestamp() {
        return Swift_formattedTimestamp(this.Swift_peer);
    }

    public final String getGroup() {
        return Swift_group(this.Swift_peer);
    }

    public final URI getIconDarkURL() {
        return Swift_iconDarkURL(this.Swift_peer);
    }

    public final URI getIconURL() {
        return Swift_iconURL(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final String getReferenceId() {
        return Swift_referenceId(this.Swift_peer);
    }

    public final ResolvedAction getResolvedAction() {
        return Swift_resolvedAction(this.Swift_peer);
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

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final boolean getUnread() {
        return Swift_unread(this.Swift_peer);
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new APIUSNotification(this);
    }

    public final void setActionLabel(String str) {
        willmutate();
        try {
            Swift_actionLabel_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setActionURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_actionURL_set(this.Swift_peer, uri2);
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

    public final void setCategory(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_category_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setCreatedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_createdAt_set(this.Swift_peer, date2);
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

    public final void setIconDarkURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_iconDarkURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setIconURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_iconURL_set(this.Swift_peer, uri2);
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

    public final void setImageURL(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_imageURL_set(this.Swift_peer, uri2);
        } finally {
            didmutate();
        }
    }

    public final void setReferenceId(String str) {
        willmutate();
        try {
            Swift_referenceId_set(this.Swift_peer, str);
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

    public final void setTitle(String str) {
        willmutate();
        try {
            Swift_title_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setUnread(boolean z) {
        willmutate();
        try {
            Swift_unread_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setUpdatedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_updatedAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\t\u0010\u000b\u001a\u00020\u0005H\u0082 J\t\u0010\u000e\u001a\u00020\u0005H\u0082 J\t\u0010\u0011\u001a\u00020\u0005H\u0082 J\t\u0010\u0014\u001a\u00020\u0005H\u0082 J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/APIUSNotification$Companion;", "", "<init>", "()V", "mockRouteOrderFill", "Lcom/polymarket/data/APIUSNotification;", "getMockRouteOrderFill", "()Lcom/polymarket/data/APIUSNotification;", "Swift_Companion_mockRouteOrderFill", "mockExternal", "getMockExternal", "Swift_Companion_mockExternal", "mockInfoOnly", "getMockInfoOnly", "Swift_Companion_mockInfoOnly", "mockResolution", "getMockResolution", "Swift_Companion_mockResolution", "mockWithImage", "getMockWithImage", "Swift_Companion_mockWithImage", "mockAll", "", "getMockAll", "()Ljava/util/List;", "Swift_Companion_mockAll", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<APIUSNotification> Swift_Companion_mockAll();

        private final native APIUSNotification Swift_Companion_mockExternal();

        private final native APIUSNotification Swift_Companion_mockInfoOnly();

        private final native APIUSNotification Swift_Companion_mockResolution();

        private final native APIUSNotification Swift_Companion_mockRouteOrderFill();

        private final native APIUSNotification Swift_Companion_mockWithImage();

        public final List<APIUSNotification> getMockAll() {
            return Swift_Companion_mockAll();
        }

        public final APIUSNotification getMockExternal() {
            return Swift_Companion_mockExternal();
        }

        public final APIUSNotification getMockInfoOnly() {
            return Swift_Companion_mockInfoOnly();
        }

        public final APIUSNotification getMockResolution() {
            return Swift_Companion_mockResolution();
        }

        public final APIUSNotification getMockRouteOrderFill() {
            return Swift_Companion_mockRouteOrderFill();
        }

        public final APIUSNotification getMockWithImage() {
            return Swift_Companion_mockWithImage();
        }

        private Companion() {
        }
    }

    public APIUSNotification(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public APIUSNotification(String str, String str2, String str3, String str4, String str5, boolean z, Date date, Date date2, URI uri, URI uri2, URI uri3, URI uri4, String str6, String str7) {
        g.x(str, str2, str3);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5, z, date, date2, uri, uri2, uri3, uri4, str6, str7);
    }

    private APIUSNotification(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}
