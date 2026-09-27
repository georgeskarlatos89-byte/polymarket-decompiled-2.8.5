package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0083\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Ju\u0010=\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0?2\u0006\u0010@\u001a\u00020$H\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0?2\u0006\u0010@\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010&¨\u0006C"}, d2 = {"Lcom/polymarket/data/ESportStatsSoccerTeam;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "colorHex", "logo", "abbreviation", "longLogo", "longLogoDark", "shortLogo", "shortLogoDark", "record", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "getColorHex", "Swift_colorHex", "getLogo", "Swift_logo", "getAbbreviation", "Swift_abbreviation", "getLongLogo", "Swift_longLogo", "getLongLogoDark", "Swift_longLogoDark", "getShortLogo", "Swift_shortLogo", "getShortLogoDark", "Swift_shortLogoDark", "getRecord", "Swift_record", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportStatsSoccerTeam implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ESportStatsSoccerTeam(java.lang.String r15, java.lang.String r16, com.polymarket.data.ESportLineupSoccerQualifier r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.polymarket.data.ESportLineupSoccerQualifier r1 = com.polymarket.data.ESportLineupSoccerQualifier.unknown
            r5 = r1
            goto Lc
        La:
            r5 = r17
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r18
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            r7 = r2
            goto L1d
        L1b:
            r7 = r19
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L23
            r8 = r2
            goto L25
        L23:
            r8 = r20
        L25:
            r1 = r0 & 64
            if (r1 == 0) goto L2b
            r9 = r2
            goto L2d
        L2b:
            r9 = r21
        L2d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L33
            r10 = r2
            goto L35
        L33:
            r10 = r22
        L35:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3b
            r11 = r2
            goto L3d
        L3b:
            r11 = r23
        L3d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L43
            r12 = r2
            goto L45
        L43:
            r12 = r24
        L45:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4f
            r13 = r2
            r3 = r15
            r4 = r16
            r2 = r14
            goto L55
        L4f:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
        L55:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.ESportStatsSoccerTeam.<init>(java.lang.String, java.lang.String, com.polymarket.data.ESportLineupSoccerQualifier, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final native String Swift_abbreviation(long Swift_peer);

    private final native String Swift_colorHex(long Swift_peer);

    private final native long Swift_constructor_0(String id, String name, ESportLineupSoccerQualifier qualifier, String colorHex, String logo, String abbreviation, String longLogo, String longLogoDark, String shortLogo, String shortLogoDark, String record);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_logo(long Swift_peer);

    private final native String Swift_longLogo(long Swift_peer);

    private final native String Swift_longLogoDark(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

    private final native String Swift_record(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_shortLogo(long Swift_peer);

    private final native String Swift_shortLogoDark(long Swift_peer);

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
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getAbbreviation() {
        return Swift_abbreviation(this.Swift_peer);
    }

    public final String getColorHex() {
        return Swift_colorHex(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getLogo() {
        return Swift_logo(this.Swift_peer);
    }

    public final String getLongLogo() {
        return Swift_longLogo(this.Swift_peer);
    }

    public final String getLongLogoDark() {
        return Swift_longLogoDark(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final ESportLineupSoccerQualifier getQualifier() {
        return Swift_qualifier(this.Swift_peer);
    }

    public final String getRecord() {
        return Swift_record(this.Swift_peer);
    }

    public final String getShortLogo() {
        return Swift_shortLogo(this.Swift_peer);
    }

    public final String getShortLogoDark() {
        return Swift_shortLogoDark(this.Swift_peer);
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

    public ESportStatsSoccerTeam(String str, String str2, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        str.getClass();
        str2.getClass();
        eSportLineupSoccerQualifier.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, eSportLineupSoccerQualifier, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public ESportStatsSoccerTeam(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
