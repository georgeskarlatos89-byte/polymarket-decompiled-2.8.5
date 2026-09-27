package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB§\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u001dJ\u0006\u0010\"\u001a\u00020#J\u0015\u0010$\u001a\u00020#2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0015\u0010,\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00105\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00107\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010E\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010H\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0091\u0001\u0010K\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020'0M2\u0006\u0010N\u001a\u00020)H\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020'0M2\u0006\u0010N\u001a\u00020)H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b6\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b8\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b:\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b>\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bB\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010+R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bI\u0010+¨\u0006Q"}, d2 = {"Lcom/polymarket/data/ESportTimelineFootballEntry;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "occurredAt", "Ljava/util/Date;", "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "displayType", "Lcom/polymarket/data/ESportTimelineEntryDisplayType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "playIcon", "playIconDark", "playerIconUrl", "clockLabel", "periodLabel", "groupKey", "showsInScoringPlays", "", "scoringSummary", "(Ljava/lang/String;Ljava/util/Date;Lcom/polymarket/data/ESportLineupSoccerQualifier;Lcom/polymarket/data/ESportTimelineEntryDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getOccurredAt", "()Ljava/util/Date;", "Swift_occurredAt", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "getDisplayType", "()Lcom/polymarket/data/ESportTimelineEntryDisplayType;", "Swift_displayType", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getPlayIcon", "Swift_playIcon", "getPlayIconDark", "Swift_playIconDark", "getPlayerIconUrl", "Swift_playerIconUrl", "getClockLabel", "Swift_clockLabel", "getPeriodLabel", "Swift_periodLabel", "getGroupKey", "Swift_groupKey", "getShowsInScoringPlays", "()Z", "Swift_showsInScoringPlays", "getScoringSummary", "Swift_scoringSummary", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportTimelineFootballEntry implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ESportTimelineFootballEntry(String str, Date date, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, ESportTimelineEntryDisplayType eSportTimelineEntryDisplayType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r30);
        Date date2;
        ESportLineupSoccerQualifier eSportLineupSoccerQualifier2;
        ESportTimelineEntryDisplayType eSportTimelineEntryDisplayType2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z2;
        String str19;
        if ((i & 2) != 0) {
            date2 = null;
        } else {
            date2 = date;
        }
        if ((i & 4) != 0) {
            eSportLineupSoccerQualifier2 = ESportLineupSoccerQualifier.unknown;
        } else {
            eSportLineupSoccerQualifier2 = eSportLineupSoccerQualifier;
        }
        if ((i & 8) != 0) {
            eSportTimelineEntryDisplayType2 = ESportTimelineEntryDisplayType.unspecified;
        } else {
            eSportTimelineEntryDisplayType2 = eSportTimelineEntryDisplayType;
        }
        if ((i & 16) != 0) {
            str11 = null;
        } else {
            str11 = str2;
        }
        if ((i & 32) != 0) {
            str12 = null;
        } else {
            str12 = str3;
        }
        if ((i & 64) != 0) {
            str13 = null;
        } else {
            str13 = str4;
        }
        if ((i & 128) != 0) {
            str14 = null;
        } else {
            str14 = str5;
        }
        if ((i & 256) != 0) {
            str15 = null;
        } else {
            str15 = str6;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str16 = null;
        } else {
            str16 = str7;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str17 = null;
        } else {
            str17 = str8;
        }
        if ((i & 2048) != 0) {
            str18 = null;
        } else {
            str18 = str9;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8192) != 0) {
            str19 = null;
        } else {
            str19 = str10;
        }
    }

    private final native String Swift_clockLabel(long Swift_peer);

    private final native long Swift_constructor_0(String id, Date occurredAt, ESportLineupSoccerQualifier qualifier, ESportTimelineEntryDisplayType displayType, String title, String subtitle, String playIcon, String playIconDark, String playerIconUrl, String clockLabel, String periodLabel, String groupKey, boolean showsInScoringPlays, String scoringSummary);

    private final native ESportTimelineEntryDisplayType Swift_displayType(long Swift_peer);

    private final native String Swift_groupKey(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native Date Swift_occurredAt(long Swift_peer);

    private final native String Swift_periodLabel(long Swift_peer);

    private final native String Swift_playIcon(long Swift_peer);

    private final native String Swift_playIconDark(long Swift_peer);

    private final native String Swift_playerIconUrl(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_scoringSummary(long Swift_peer);

    private final native boolean Swift_showsInScoringPlays(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

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

    public final String getClockLabel() {
        return Swift_clockLabel(this.Swift_peer);
    }

    public final ESportTimelineEntryDisplayType getDisplayType() {
        return Swift_displayType(this.Swift_peer);
    }

    public final String getGroupKey() {
        return Swift_groupKey(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final Date getOccurredAt() {
        return Swift_occurredAt(this.Swift_peer);
    }

    public final String getPeriodLabel() {
        return Swift_periodLabel(this.Swift_peer);
    }

    public final String getPlayIcon() {
        return Swift_playIcon(this.Swift_peer);
    }

    public final String getPlayIconDark() {
        return Swift_playIconDark(this.Swift_peer);
    }

    public final String getPlayerIconUrl() {
        return Swift_playerIconUrl(this.Swift_peer);
    }

    public final ESportLineupSoccerQualifier getQualifier() {
        return Swift_qualifier(this.Swift_peer);
    }

    public final String getScoringSummary() {
        return Swift_scoringSummary(this.Swift_peer);
    }

    public final boolean getShowsInScoringPlays() {
        return Swift_showsInScoringPlays(this.Swift_peer);
    }

    public final String getSubtitle() {
        return Swift_subtitle(this.Swift_peer);
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

    public ESportTimelineFootballEntry(String str, Date date, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, ESportTimelineEntryDisplayType eSportTimelineEntryDisplayType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        str.getClass();
        eSportLineupSoccerQualifier.getClass();
        eSportTimelineEntryDisplayType.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, date, eSportLineupSoccerQualifier, eSportTimelineEntryDisplayType, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
    }

    public ESportTimelineFootballEntry(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
