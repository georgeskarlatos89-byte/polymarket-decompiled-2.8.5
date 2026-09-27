package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002hiB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBÃ\u0001\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\n\u0010 J\u0006\u0010%\u001a\u00020&J\u0015\u0010'\u001a\u00020&2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010*\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001c\u00102\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u00103J\u0015\u00105\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00107\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00109\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010A\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010D\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J¬\u0001\u0010O\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0082 ¢\u0006\u0002\u0010PJ\u0017\u0010U\u001a\u0004\u0018\u00010R2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010X\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010[\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010\\\u001a\u00020\u00112\b\u0010]\u001a\u0004\u0018\u00010^H\u0096\u0002J\u0019\u0010_\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u0000H\u0082 J\b\u0010b\u001a\u00020\u0019H\u0016J\u0015\u0010c\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020^0e2\u0006\u0010f\u001a\u00020\u0019H\u0016J\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020^0e2\u0006\u0010f\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010)R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010)R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bM\u0010;R\u0013\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010V\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0011\u0010Y\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bZ\u0010C¨\u0006j"}, d2 = {"Lcom/polymarket/data/EPromoBannerTemplate;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "type", "tagSlugs", "", "showOnProfile", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "actionTitle", "actionURL", "Ljava/net/URI;", "imageURL", "priority", "", "dismissible", "sheetTitle", "sheetBody", "sheetCaption", "sheetActionTitle", "sheetActionURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getType", "Swift_type", "getTagSlugs", "()Ljava/util/List;", "Swift_tagSlugs", "getShowOnProfile", "()Ljava/lang/Boolean;", "Swift_showOnProfile", "(J)Ljava/lang/Boolean;", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getActionTitle", "Swift_actionTitle", "getActionURL", "()Ljava/net/URI;", "Swift_actionURL", "getImageURL", "Swift_imageURL", "getPriority", "()I", "Swift_priority", "getDismissible", "()Z", "Swift_dismissible", "getSheetTitle", "Swift_sheetTitle", "getSheetBody", "Swift_sheetBody", "getSheetCaption", "Swift_sheetCaption", "getSheetActionTitle", "Swift_sheetActionTitle", "getSheetActionURL", "Swift_sheetActionURL", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)J", "knownTemplate", "Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate;", "getKnownTemplate", "()Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate;", "Swift_knownTemplate", "shouldShowOnProfile", "getShouldShowOnProfile", "Swift_shouldShowOnProfile", "hasSheet", "getHasSheet", "Swift_hasSheet", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "KnownTemplate", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EPromoBannerTemplate implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EPromoBannerTemplate(String str, String str2, List list, Boolean bool, String str3, String str4, String str5, URI uri, URI uri2, int i, boolean z, String str6, String str7, String str8, String str9, URI uri3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r6, r7, r8, r2, r9, r10, r11, r12, r13, r14, r15, r4, r34);
        String str10;
        String str11;
        List list2;
        Boolean bool2;
        String str12;
        String str13;
        URI uri4;
        URI uri5;
        int i3;
        boolean z2;
        String str14;
        String str15;
        String str16;
        String str17;
        URI uri6;
        if ((i2 & 1) != 0) {
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i2 & 2) != 0) {
            str11 = null;
        } else {
            str11 = str2;
        }
        if ((i2 & 4) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i2 & 8) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i2 & 16) != 0) {
            str12 = "";
        } else {
            str12 = str3;
        }
        if ((i2 & 32) != 0) {
            str13 = "";
        } else {
            str13 = str4;
        }
        String str18 = (i2 & 64) == 0 ? str5 : "";
        if ((i2 & 128) != 0) {
            uri4 = null;
        } else {
            uri4 = uri;
        }
        if ((i2 & 256) != 0) {
            uri5 = null;
        } else {
            uri5 = uri2;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 2048) != 0) {
            str14 = null;
        } else {
            str14 = str6;
        }
        if ((i2 & 4096) != 0) {
            str15 = null;
        } else {
            str15 = str7;
        }
        if ((i2 & 8192) != 0) {
            str16 = null;
        } else {
            str16 = str8;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str17 = null;
        } else {
            str17 = str9;
        }
        if ((i2 & 32768) != 0) {
            uri6 = null;
        } else {
            uri6 = uri3;
        }
    }

    private final native String Swift_actionTitle(long Swift_peer);

    private final native URI Swift_actionURL(long Swift_peer);

    private final native long Swift_constructor_0(String id, String type, List<String> tagSlugs, Boolean showOnProfile, String title, String subtitle, String actionTitle, URI actionURL, URI imageURL, int priority, boolean dismissible, String sheetTitle, String sheetBody, String sheetCaption, String sheetActionTitle, URI sheetActionURL);

    private final native boolean Swift_dismissible(long Swift_peer);

    private final native boolean Swift_hasSheet(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native boolean Swift_isequal(EPromoBannerTemplate lhs, EPromoBannerTemplate rhs);

    private final native KnownTemplate Swift_knownTemplate(long Swift_peer);

    private final native int Swift_priority(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_sheetActionTitle(long Swift_peer);

    private final native URI Swift_sheetActionURL(long Swift_peer);

    private final native String Swift_sheetBody(long Swift_peer);

    private final native String Swift_sheetCaption(long Swift_peer);

    private final native String Swift_sheetTitle(long Swift_peer);

    private final native boolean Swift_shouldShowOnProfile(long Swift_peer);

    private final native Boolean Swift_showOnProfile(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native List<String> Swift_tagSlugs(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native String Swift_type(long Swift_peer);

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
        if (!(other instanceof EPromoBannerTemplate)) {
            return false;
        }
        return Swift_isequal(this, (EPromoBannerTemplate) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getActionTitle() {
        return Swift_actionTitle(this.Swift_peer);
    }

    public final URI getActionURL() {
        return Swift_actionURL(this.Swift_peer);
    }

    public final boolean getDismissible() {
        return Swift_dismissible(this.Swift_peer);
    }

    public final boolean getHasSheet() {
        return Swift_hasSheet(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final KnownTemplate getKnownTemplate() {
        return Swift_knownTemplate(this.Swift_peer);
    }

    public final int getPriority() {
        return Swift_priority(this.Swift_peer);
    }

    public final String getSheetActionTitle() {
        return Swift_sheetActionTitle(this.Swift_peer);
    }

    public final URI getSheetActionURL() {
        return Swift_sheetActionURL(this.Swift_peer);
    }

    public final String getSheetBody() {
        return Swift_sheetBody(this.Swift_peer);
    }

    public final String getSheetCaption() {
        return Swift_sheetCaption(this.Swift_peer);
    }

    public final String getSheetTitle() {
        return Swift_sheetTitle(this.Swift_peer);
    }

    public final boolean getShouldShowOnProfile() {
        return Swift_shouldShowOnProfile(this.Swift_peer);
    }

    public final Boolean getShowOnProfile() {
        return Swift_showOnProfile(this.Swift_peer);
    }

    public final String getSubtitle() {
        return Swift_subtitle(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<String> getTagSlugs() {
        return Swift_tagSlugs(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final String getType() {
        return Swift_type(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "liquidityRewards", "depositPromo", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KnownTemplate implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ KnownTemplate[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final KnownTemplate liquidityRewards = new KnownTemplate("liquidityRewards", 0, "liquidity_rewards", null, 2, null);
        public static final KnownTemplate depositPromo = new KnownTemplate("depositPromo", 1, "deposit_promo", null, 2, null);

        private static final /* synthetic */ KnownTemplate[] $values() {
            return new KnownTemplate[]{liquidityRewards, depositPromo};
        }

        static {
            KnownTemplate[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ KnownTemplate(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static KnownTemplate valueOf(String str) {
            return (KnownTemplate) Enum.valueOf(KnownTemplate.class, str);
        }

        public static KnownTemplate[] values() {
            return (KnownTemplate[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KnownTemplate init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "liquidity_rewards")) {
                    return KnownTemplate.liquidityRewards;
                }
                if (Intrinsics.areEqual(rawValue, "deposit_promo")) {
                    return KnownTemplate.depositPromo;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private KnownTemplate(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromoBannerTemplate$Companion;", "", "<init>", "()V", "KnownTemplate", "Lcom/polymarket/data/EPromoBannerTemplate$KnownTemplate;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KnownTemplate KnownTemplate(String rawValue) {
            rawValue.getClass();
            return KnownTemplate.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public EPromoBannerTemplate(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public EPromoBannerTemplate(String str, String str2, List<String> list, Boolean bool, String str3, String str4, String str5, URI uri, URI uri2, int i, boolean z, String str6, String str7, String str8, String str9, URI uri3) {
        woa.A(str, str3, str4, str5);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, list, bool, str3, str4, str5, uri, uri2, i, z, str6, str7, str8, str9, uri3);
    }
}
