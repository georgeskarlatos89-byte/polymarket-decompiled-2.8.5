package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u008b\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u000eH\u0016J\u0015\u0010(\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010-\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010.J\u0015\u00101\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00103\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00105\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010.J\u0017\u00107\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010@\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0080\u0001\u0010C\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020$0F2\u0006\u0010G\u001a\u00020\u000eH\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020$0F2\u0006\u0010G\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b6\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b8\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b:\u0010'R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010'R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010'¨\u0006J"}, d2 = {"Lcom/polymarket/data/ESportLineupFootballPlayer;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "jerseyNumber", "", "starter", "", "played", "order", "imageUrl", "darkImageUrl", "position", "group", "injuryStatus", "Lcom/polymarket/data/ESportLineupFootballInjuryStatus;", "rosterStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupFootballInjuryStatus;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getJerseyNumber", "()Ljava/lang/Integer;", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "getStarter", "()Z", "Swift_starter", "getPlayed", "Swift_played", "getOrder", "Swift_order", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "getPosition", "Swift_position", "getGroup", "Swift_group", "getInjuryStatus", "()Lcom/polymarket/data/ESportLineupFootballInjuryStatus;", "Swift_injuryStatus", "getRosterStatus", "Swift_rosterStatus", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupFootballInjuryStatus;Ljava/lang/String;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportLineupFootballPlayer implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ESportLineupFootballPlayer(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, String str3, String str4, String str5, String str6, ESportLineupFootballInjuryStatus eSportLineupFootballInjuryStatus, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        Integer num3;
        boolean z3;
        boolean z4;
        Integer num4;
        String str8;
        String str9;
        String str10;
        String str11;
        ESportLineupFootballInjuryStatus eSportLineupFootballInjuryStatus2;
        String str12;
        if ((i & 4) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 32) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 128) != 0) {
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i & 256) != 0) {
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str11 = null;
        } else {
            str11 = str6;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            eSportLineupFootballInjuryStatus2 = ESportLineupFootballInjuryStatus.unspecified;
        } else {
            eSportLineupFootballInjuryStatus2 = eSportLineupFootballInjuryStatus;
        }
        if ((i & 2048) != 0) {
            str12 = null;
        } else {
            str12 = str7;
        }
    }

    private final native long Swift_constructor_0(String id, String name, Integer jerseyNumber, boolean starter, boolean played, Integer order, String imageUrl, String darkImageUrl, String position, String group, ESportLineupFootballInjuryStatus injuryStatus, String rosterStatus);

    private final native String Swift_darkImageUrl(long Swift_peer);

    private final native String Swift_group(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_imageUrl(long Swift_peer);

    private final native ESportLineupFootballInjuryStatus Swift_injuryStatus(long Swift_peer);

    private final native Integer Swift_jerseyNumber(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native Integer Swift_order(long Swift_peer);

    private final native boolean Swift_played(long Swift_peer);

    private final native String Swift_position(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_rosterStatus(long Swift_peer);

    private final native boolean Swift_starter(long Swift_peer);

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

    public final String getGroup() {
        return Swift_group(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final ESportLineupFootballInjuryStatus getInjuryStatus() {
        return Swift_injuryStatus(this.Swift_peer);
    }

    public final Integer getJerseyNumber() {
        return Swift_jerseyNumber(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final Integer getOrder() {
        return Swift_order(this.Swift_peer);
    }

    public final boolean getPlayed() {
        return Swift_played(this.Swift_peer);
    }

    public final String getPosition() {
        return Swift_position(this.Swift_peer);
    }

    public final String getRosterStatus() {
        return Swift_rosterStatus(this.Swift_peer);
    }

    public final boolean getStarter() {
        return Swift_starter(this.Swift_peer);
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

    public ESportLineupFootballPlayer(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, String str3, String str4, String str5, String str6, ESportLineupFootballInjuryStatus eSportLineupFootballInjuryStatus, String str7) {
        str.getClass();
        str2.getClass();
        eSportLineupFootballInjuryStatus.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, num, z, z2, num2, str3, str4, str5, str6, eSportLineupFootballInjuryStatus, str7);
    }

    public ESportLineupFootballPlayer(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
