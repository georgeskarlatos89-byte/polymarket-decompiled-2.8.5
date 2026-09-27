package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB«\u0002\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010'J\u0006\u0010,\u001a\u00020-J\u0015\u0010.\u001a\u00020-2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u00020\u000fH\u0016J\u0015\u00106\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010=\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u0017\u0010@\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010G\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010I\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010K\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010M\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010O\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010Q\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010S\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010U\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010X\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010YJ\u001c\u0010[\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010]\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010_\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010a\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010c\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010g\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010i\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u001c\u0010k\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010>J\u0086\u0002\u0010l\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0082 ¢\u0006\u0002\u0010mJ\u0016\u0010n\u001a\b\u0012\u0004\u0012\u0002020o2\u0006\u0010p\u001a\u00020\u000fH\u0016J\u0017\u0010q\u001a\b\u0012\u0004\u0012\u0002020o2\u0006\u0010p\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b?\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bA\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bC\u00105R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bH\u0010<R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bJ\u0010<R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bL\u0010<R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bN\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bP\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bR\u0010<R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bT\u0010<R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bZ\u0010<R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\\\u0010<R\u0013\u0010 \u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b^\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b`\u0010<R\u0013\u0010\"\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bb\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010<R\u0013\u0010$\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010<R\u0013\u0010%\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bh\u0010<R\u0013\u0010&\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bj\u0010<¨\u0006s"}, d2 = {"Lcom/polymarket/data/ESportStatsFootballPlayer;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "position", "jerseyNumber", "", "imageUrl", "darkImageUrl", "teamId", "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "passingAttempts", "passingYards", "passingTouchdowns", "passingInterceptions", "passingCompletions", "rushingAttempts", "rushingYards", "rushingAvgYards", "", "rushingTouchdowns", "receivingTargets", "receptions", "receivingYards", "receivingTouchdowns", "fieldGoalsAttempted", "fieldGoalsMade", "fieldGoalsMade50", "extraPointsMade", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getPosition", "Swift_position", "getJerseyNumber", "()Ljava/lang/Integer;", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "getTeamId", "Swift_teamId", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "getPassingAttempts", "Swift_passingAttempts", "getPassingYards", "Swift_passingYards", "getPassingTouchdowns", "Swift_passingTouchdowns", "getPassingInterceptions", "Swift_passingInterceptions", "getPassingCompletions", "Swift_passingCompletions", "getRushingAttempts", "Swift_rushingAttempts", "getRushingYards", "Swift_rushingYards", "getRushingAvgYards", "()Ljava/lang/Double;", "Swift_rushingAvgYards", "(J)Ljava/lang/Double;", "getRushingTouchdowns", "Swift_rushingTouchdowns", "getReceivingTargets", "Swift_receivingTargets", "getReceptions", "Swift_receptions", "getReceivingYards", "Swift_receivingYards", "getReceivingTouchdowns", "Swift_receivingTouchdowns", "getFieldGoalsAttempted", "Swift_fieldGoalsAttempted", "getFieldGoalsMade", "Swift_fieldGoalsMade", "getFieldGoalsMade50", "Swift_fieldGoalsMade50", "getExtraPointsMade", "Swift_extraPointsMade", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportStatsFootballPlayer implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ESportStatsFootballPlayer(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Double d, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
        String str7;
        Integer num18;
        String str8;
        String str9;
        String str10;
        ESportLineupSoccerQualifier eSportLineupSoccerQualifier2;
        Integer num19;
        Integer num20;
        Integer num21;
        Integer num22;
        Integer num23;
        Integer num24;
        Integer num25;
        Double d2;
        Integer num26;
        Integer num27;
        Integer num28;
        Integer num29;
        Integer num30;
        Integer num31;
        Integer num32;
        Integer num33;
        Integer num34;
        if ((i & 4) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            num18 = null;
        } else {
            num18 = num;
        }
        if ((i & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i & 64) != 0) {
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i & 128) != 0) {
            eSportLineupSoccerQualifier2 = ESportLineupSoccerQualifier.unknown;
        } else {
            eSportLineupSoccerQualifier2 = eSportLineupSoccerQualifier;
        }
        if ((i & 256) != 0) {
            num19 = null;
        } else {
            num19 = num2;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            num20 = null;
        } else {
            num20 = num3;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            num21 = null;
        } else {
            num21 = num4;
        }
        if ((i & 2048) != 0) {
            num22 = null;
        } else {
            num22 = num5;
        }
        if ((i & 4096) != 0) {
            num23 = null;
        } else {
            num23 = num6;
        }
        if ((i & 8192) != 0) {
            num24 = null;
        } else {
            num24 = num7;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num25 = null;
        } else {
            num25 = num8;
        }
        if ((32768 & i) != 0) {
            d2 = null;
        } else {
            d2 = d;
        }
        if ((65536 & i) != 0) {
            num26 = null;
        } else {
            num26 = num9;
        }
        if ((131072 & i) != 0) {
            num27 = null;
        } else {
            num27 = num10;
        }
        if ((262144 & i) != 0) {
            num28 = null;
        } else {
            num28 = num11;
        }
        if ((524288 & i) != 0) {
            num29 = null;
        } else {
            num29 = num12;
        }
        if ((1048576 & i) != 0) {
            num30 = null;
        } else {
            num30 = num13;
        }
        if ((2097152 & i) != 0) {
            num31 = null;
        } else {
            num31 = num14;
        }
        if ((4194304 & i) != 0) {
            num32 = null;
        } else {
            num32 = num15;
        }
        if ((8388608 & i) != 0) {
            num33 = null;
        } else {
            num33 = num16;
        }
        if ((i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            num34 = null;
        } else {
            num34 = num17;
        }
    }

    private final native long Swift_constructor_0(String id, String name, String position, Integer jerseyNumber, String imageUrl, String darkImageUrl, String teamId, ESportLineupSoccerQualifier qualifier, Integer passingAttempts, Integer passingYards, Integer passingTouchdowns, Integer passingInterceptions, Integer passingCompletions, Integer rushingAttempts, Integer rushingYards, Double rushingAvgYards, Integer rushingTouchdowns, Integer receivingTargets, Integer receptions, Integer receivingYards, Integer receivingTouchdowns, Integer fieldGoalsAttempted, Integer fieldGoalsMade, Integer fieldGoalsMade50, Integer extraPointsMade);

    private final native String Swift_darkImageUrl(long Swift_peer);

    private final native Integer Swift_extraPointsMade(long Swift_peer);

    private final native Integer Swift_fieldGoalsAttempted(long Swift_peer);

    private final native Integer Swift_fieldGoalsMade(long Swift_peer);

    private final native Integer Swift_fieldGoalsMade50(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_imageUrl(long Swift_peer);

    private final native Integer Swift_jerseyNumber(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native Integer Swift_passingAttempts(long Swift_peer);

    private final native Integer Swift_passingCompletions(long Swift_peer);

    private final native Integer Swift_passingInterceptions(long Swift_peer);

    private final native Integer Swift_passingTouchdowns(long Swift_peer);

    private final native Integer Swift_passingYards(long Swift_peer);

    private final native String Swift_position(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

    private final native Integer Swift_receivingTargets(long Swift_peer);

    private final native Integer Swift_receivingTouchdowns(long Swift_peer);

    private final native Integer Swift_receivingYards(long Swift_peer);

    private final native Integer Swift_receptions(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Integer Swift_rushingAttempts(long Swift_peer);

    private final native Double Swift_rushingAvgYards(long Swift_peer);

    private final native Integer Swift_rushingTouchdowns(long Swift_peer);

    private final native Integer Swift_rushingYards(long Swift_peer);

    private final native String Swift_teamId(long Swift_peer);

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

    public final String getDarkImageUrl() {
        return Swift_darkImageUrl(this.Swift_peer);
    }

    public final Integer getExtraPointsMade() {
        return Swift_extraPointsMade(this.Swift_peer);
    }

    public final Integer getFieldGoalsAttempted() {
        return Swift_fieldGoalsAttempted(this.Swift_peer);
    }

    public final Integer getFieldGoalsMade() {
        return Swift_fieldGoalsMade(this.Swift_peer);
    }

    public final Integer getFieldGoalsMade50() {
        return Swift_fieldGoalsMade50(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final Integer getJerseyNumber() {
        return Swift_jerseyNumber(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final Integer getPassingAttempts() {
        return Swift_passingAttempts(this.Swift_peer);
    }

    public final Integer getPassingCompletions() {
        return Swift_passingCompletions(this.Swift_peer);
    }

    public final Integer getPassingInterceptions() {
        return Swift_passingInterceptions(this.Swift_peer);
    }

    public final Integer getPassingTouchdowns() {
        return Swift_passingTouchdowns(this.Swift_peer);
    }

    public final Integer getPassingYards() {
        return Swift_passingYards(this.Swift_peer);
    }

    public final String getPosition() {
        return Swift_position(this.Swift_peer);
    }

    public final ESportLineupSoccerQualifier getQualifier() {
        return Swift_qualifier(this.Swift_peer);
    }

    public final Integer getReceivingTargets() {
        return Swift_receivingTargets(this.Swift_peer);
    }

    public final Integer getReceivingTouchdowns() {
        return Swift_receivingTouchdowns(this.Swift_peer);
    }

    public final Integer getReceivingYards() {
        return Swift_receivingYards(this.Swift_peer);
    }

    public final Integer getReceptions() {
        return Swift_receptions(this.Swift_peer);
    }

    public final Integer getRushingAttempts() {
        return Swift_rushingAttempts(this.Swift_peer);
    }

    public final Double getRushingAvgYards() {
        return Swift_rushingAvgYards(this.Swift_peer);
    }

    public final Integer getRushingTouchdowns() {
        return Swift_rushingTouchdowns(this.Swift_peer);
    }

    public final Integer getRushingYards() {
        return Swift_rushingYards(this.Swift_peer);
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

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ESportStatsFootballPlayer(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Double d, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17) {
        str.getClass();
        str2.getClass();
        eSportLineupSoccerQualifier.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, num, str4, str5, str6, eSportLineupSoccerQualifier, num2, num3, num4, num5, num6, num7, num8, d, num9, num10, num11, num12, num13, num14, num15, num16, num17);
    }

    public ESportStatsFootballPlayer(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
