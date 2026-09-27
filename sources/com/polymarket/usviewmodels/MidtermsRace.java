package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0084\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\b\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBa\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u001bB\u0011\b\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u001dJ\u0006\u0010\"\u001a\u00020#J\u0015\u0010$\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0015\u0010+\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010,\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010-\u001a\u00020\u0002H\u0082 J\u0015\u00100\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00101\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010-\u001a\u00020\u0002H\u0082 J\u0015\u00106\u001a\u00020\u00102\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00107\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010=\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010A\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\u00152\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010G\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010M\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0017H\u0082 J\u001c\u0010R\u001a\u0004\u0018\u00010\u00192\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 ¢\u0006\u0002\u0010SJ$\u0010T\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010UJ\u0017\u0010X\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010Y\u001a\u00020#2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0082 Jf\u0010Z\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0002\u0010[J\u0017\u0010^\u001a\u0004\u0018\u00010\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0010\u0010_\u001a\u0004\u0018\u00010\u00122\u0006\u0010`\u001a\u00020aJ\u001f\u0010b\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010`\u001a\u00020aH\u0082 J\u001c\u0010g\u001a\u0004\u0018\u00010d2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 ¢\u0006\u0002\u0010hJ\u0015\u0010i\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0082 J\b\u0010v\u001a\u00020\u0003H\u0016J\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010lH\u0096\u0002J\u0019\u0010z\u001a\u00020x2\u0006\u0010{\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u0000H\u0082 J\u0016\u0010}\u001a\b\u0012\u0004\u0012\u00020l0~2\u0006\u0010\u007f\u001a\u00020\u0019H\u0016J\u0018\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020l0~2\u0006\u0010\u007f\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R(\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*R\u0013\u0010\\\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b]\u0010IR\u0013\u0010c\u001a\u0004\u0018\u00010d8F¢\u0006\u0006\u001a\u0004\be\u0010fR(\u0010j\u001a\u0010\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020#\u0018\u00010kX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006\u0085\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRace;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "region", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "leading", "Lcom/polymarket/usviewmodels/MidtermsRace$Side;", "trailing", "volume", "Lcom/polymarket/data/EAmount;", "wireRating", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "wireBucket", "", "eventSlug", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRegion;Lcom/polymarket/usviewmodels/MidtermsRace$Side;Lcom/polymarket/usviewmodels/MidtermsRace$Side;Lcom/polymarket/data/EAmount;Lcom/polymarket/usviewmodels/MidtermsRaceRating;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getTitle", "setTitle", "Swift_title", "Swift_title_set", "getRegion", "()Lcom/polymarket/usviewmodels/MidtermsRegion;", "setRegion", "(Lcom/polymarket/usviewmodels/MidtermsRegion;)V", "Swift_region", "Swift_region_set", "getLeading", "()Lcom/polymarket/usviewmodels/MidtermsRace$Side;", "setLeading", "(Lcom/polymarket/usviewmodels/MidtermsRace$Side;)V", "Swift_leading", "Swift_leading_set", "getTrailing", "setTrailing", "Swift_trailing", "Swift_trailing_set", "getVolume", "()Lcom/polymarket/data/EAmount;", "setVolume", "(Lcom/polymarket/data/EAmount;)V", "Swift_volume", "Swift_volume_set", "getWireRating", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "setWireRating", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating;)V", "Swift_wireRating", "Swift_wireRating_set", "getWireBucket", "()Ljava/lang/Integer;", "setWireBucket", "(Ljava/lang/Integer;)V", "Swift_wireBucket", "(J)Ljava/lang/Integer;", "Swift_wireBucket_set", "(JLjava/lang/Integer;)V", "getEventSlug", "setEventSlug", "Swift_eventSlug", "Swift_eventSlug_set", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRegion;Lcom/polymarket/usviewmodels/MidtermsRace$Side;Lcom/polymarket/usviewmodels/MidtermsRace$Side;Lcom/polymarket/data/EAmount;Lcom/polymarket/usviewmodels/MidtermsRaceRating;Ljava/lang/Integer;Ljava/lang/String;)J", "rating", "getRating", "Swift_rating", "side", "slot", "Lcom/polymarket/usviewmodels/MidtermsRace$Slot;", "Swift_side_1", "leadingShare", "", "getLeadingShare", "()Ljava/lang/Double;", "Swift_leadingShare", "(J)Ljava/lang/Double;", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Slot", "Side", "MarketRef", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MidtermsRace implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRace$Slot;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "leading", "trailing", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Slot implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Slot[] $VALUES;
        public static final Slot leading = new Slot("leading", 0);
        public static final Slot trailing = new Slot("trailing", 1);

        private static final /* synthetic */ Slot[] $values() {
            return new Slot[]{leading, trailing};
        }

        static {
            Slot[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Slot(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Slot valueOf(String str) {
            return (Slot) Enum.valueOf(Slot.class, str);
        }

        public static Slot[] values() {
            return (Slot[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public MidtermsRace(String str, String str2, MidtermsRegion midtermsRegion, Side side, Side side2, EAmount eAmount, MidtermsRaceRating midtermsRaceRating, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        midtermsRegion.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, midtermsRegion, side, side2, eAmount, midtermsRaceRating, num, str3);
    }

    private final native long Swift_constructor_0(String id, String title, MidtermsRegion region, Side leading, Side trailing, EAmount volume, MidtermsRaceRating wireRating, Integer wireBucket, String eventSlug);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native void Swift_eventSlug_set(long Swift_peer, String value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isequal(MidtermsRace lhs, MidtermsRace rhs);

    private final native Side Swift_leading(long Swift_peer);

    private final native Double Swift_leadingShare(long Swift_peer);

    private final native void Swift_leading_set(long Swift_peer, Side value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native MidtermsRaceRating Swift_rating(long Swift_peer);

    private final native MidtermsRegion Swift_region(long Swift_peer);

    private final native void Swift_region_set(long Swift_peer, MidtermsRegion value);

    private final native void Swift_release(long Swift_peer);

    private final native Side Swift_side_1(long Swift_peer, Slot slot);

    private final native String Swift_title(long Swift_peer);

    private final native void Swift_title_set(long Swift_peer, String value);

    private final native Side Swift_trailing(long Swift_peer);

    private final native void Swift_trailing_set(long Swift_peer, Side value);

    private final native EAmount Swift_volume(long Swift_peer);

    private final native void Swift_volume_set(long Swift_peer, EAmount value);

    private final native Integer Swift_wireBucket(long Swift_peer);

    private final native void Swift_wireBucket_set(long Swift_peer, Integer value);

    private final native MidtermsRaceRating Swift_wireRating(long Swift_peer);

    private final native void Swift_wireRating_set(long Swift_peer, MidtermsRaceRating value);

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
        if (!(other instanceof MidtermsRace)) {
            return false;
        }
        return Swift_isequal(this, (MidtermsRace) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getEventSlug() {
        return Swift_eventSlug(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final Side getLeading() {
        return Swift_leading(this.Swift_peer);
    }

    public final Double getLeadingShare() {
        return Swift_leadingShare(this.Swift_peer);
    }

    public final MidtermsRaceRating getRating() {
        return Swift_rating(this.Swift_peer);
    }

    public final MidtermsRegion getRegion() {
        return Swift_region(this.Swift_peer);
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

    public final Side getTrailing() {
        return Swift_trailing(this.Swift_peer);
    }

    public final EAmount getVolume() {
        return Swift_volume(this.Swift_peer);
    }

    public final Integer getWireBucket() {
        return Swift_wireBucket(this.Swift_peer);
    }

    public final MidtermsRaceRating getWireRating() {
        return Swift_wireRating(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new MidtermsRace(this);
    }

    public final void setEventSlug(String str) {
        willmutate();
        try {
            Swift_eventSlug_set(this.Swift_peer, str);
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

    public final void setLeading(Side side) {
        Side side2 = (Side) StructKt.sref$default(side, null, 1, null);
        willmutate();
        try {
            Swift_leading_set(this.Swift_peer, side2);
        } finally {
            didmutate();
        }
    }

    public final void setRegion(MidtermsRegion midtermsRegion) {
        midtermsRegion.getClass();
        willmutate();
        try {
            Swift_region_set(this.Swift_peer, midtermsRegion);
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
        str.getClass();
        willmutate();
        try {
            Swift_title_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setTrailing(Side side) {
        Side side2 = (Side) StructKt.sref$default(side, null, 1, null);
        willmutate();
        try {
            Swift_trailing_set(this.Swift_peer, side2);
        } finally {
            didmutate();
        }
    }

    public final void setVolume(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_volume_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setWireBucket(Integer num) {
        willmutate();
        try {
            Swift_wireBucket_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setWireRating(MidtermsRaceRating midtermsRaceRating) {
        MidtermsRaceRating midtermsRaceRating2 = (MidtermsRaceRating) StructKt.sref$default(midtermsRaceRating, null, 1, null);
        willmutate();
        try {
            Swift_wireRating_set(this.Swift_peer, midtermsRaceRating2);
        } finally {
            didmutate();
        }
    }

    public final Side side(Slot slot) {
        slot.getClass();
        return Swift_side_1(this.Swift_peer, slot);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001f\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010 \u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\fH\u0082 J\u0015\u0010$\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010%\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\fH\u0082 J\u001d\u0010&\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082 J\u0015\u0010'\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0082 J\b\u00104\u001a\u00020\u0001H\u0016J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u00108\u001a\u0002062\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000H\u0082 J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020*0<2\u0006\u0010=\u001a\u00020\u0019H\u0016J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020*0<2\u0006\u0010=\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0016\u0018\u00010)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006@"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "slug", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getSlug", "setSlug", "Swift_slug", "Swift_slug_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MarketRef implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public MarketRef(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2);
        }

        private final native long Swift_constructor_0(String id, String slug);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native String Swift_id(long Swift_peer);

        private final native void Swift_id_set(long Swift_peer, String value);

        private final native boolean Swift_isequal(MarketRef lhs, MarketRef rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_slug(long Swift_peer);

        private final native void Swift_slug_set(long Swift_peer, String value);

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
            if (!(other instanceof MarketRef)) {
                return false;
            }
            return Swift_isequal(this, (MarketRef) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new MarketRef(this);
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

        public final void setSlug(String str) {
            str.getClass();
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

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public MarketRef(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private MarketRef(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001iB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBS\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0017\u0010'\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010(\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010.\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010/\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u000eH\u0082 J\u0015\u00102\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00103\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u000eH\u0082 J\u001c\u00108\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00109J$\u0010:\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0011H\u0082 ¢\u0006\u0002\u0010;J\u0017\u0010@\u001a\u0004\u0018\u00010\u00132\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010A\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010E\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010I\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082 JT\u0010J\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0082 ¢\u0006\u0002\u0010KJ\u001c\u0010O\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010PJ\u0015\u0010Q\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0082 J\b\u0010^\u001a\u00020\u0001H\u0016J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0019\u0010b\u001a\u00020`2\u0006\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0000H\u0082 J\u0016\u0010e\u001a\b\u0012\u0004\u0012\u00020T0f2\u0006\u0010g\u001a\u00020!H\u0016J\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020T0f2\u0006\u0010g\u001a\u00020!H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R(\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R(\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010+\"\u0004\bG\u0010-R\u0013\u0010L\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bM\u0010NR(\u0010R\u001a\u0010\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u001e\u0018\u00010SX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006j"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRace$Side;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "partyLabel", "", Keys.KEY_NAME, "probability", "", "market", "Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;", "candidateId", "partyId", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "getParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "setParty", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;)V", "Swift_party", "Swift_party_set", "value", "getPartyLabel", "()Ljava/lang/String;", "setPartyLabel", "(Ljava/lang/String;)V", "Swift_partyLabel", "Swift_partyLabel_set", "getName", "setName", "Swift_name", "Swift_name_set", "getProbability", "()Ljava/lang/Double;", "setProbability", "(Ljava/lang/Double;)V", "Swift_probability", "(J)Ljava/lang/Double;", "Swift_probability_set", "(JLjava/lang/Double;)V", "getMarket", "()Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;", "setMarket", "(Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;)V", "Swift_market", "Swift_market_set", "getCandidateId", "setCandidateId", "Swift_candidateId", "Swift_candidateId_set", "getPartyId", "setPartyId", "Swift_partyId", "Swift_partyId_set", "Swift_constructor_0", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/usviewmodels/MidtermsRace$MarketRef;Ljava/lang/String;Ljava/lang/String;)J", "percent", "getPercent", "()Ljava/lang/Integer;", "Swift_percent", "(J)Ljava/lang/Integer;", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Side implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ Side(MidtermsRaceRating.Party party, String str, String str2, Double d, MarketRef marketRef, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(party, str, str2, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : marketRef, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }

        private final native String Swift_candidateId(long Swift_peer);

        private final native void Swift_candidateId_set(long Swift_peer, String value);

        private final native long Swift_constructor_0(MidtermsRaceRating.Party party, String partyLabel, String name, Double probability, MarketRef market, String candidateId, String partyId);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native boolean Swift_isequal(Side lhs, Side rhs);

        private final native MarketRef Swift_market(long Swift_peer);

        private final native void Swift_market_set(long Swift_peer, MarketRef value);

        private final native String Swift_name(long Swift_peer);

        private final native void Swift_name_set(long Swift_peer, String value);

        private final native MidtermsRaceRating.Party Swift_party(long Swift_peer);

        private final native String Swift_partyId(long Swift_peer);

        private final native void Swift_partyId_set(long Swift_peer, String value);

        private final native String Swift_partyLabel(long Swift_peer);

        private final native void Swift_partyLabel_set(long Swift_peer, String value);

        private final native void Swift_party_set(long Swift_peer, MidtermsRaceRating.Party value);

        private final native Integer Swift_percent(long Swift_peer);

        private final native Double Swift_probability(long Swift_peer);

        private final native void Swift_probability_set(long Swift_peer, Double value);

        private final native Function0<Object> Swift_projectionImpl(int options);

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

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Side)) {
                return false;
            }
            return Swift_isequal(this, (Side) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getCandidateId() {
            return Swift_candidateId(this.Swift_peer);
        }

        public final MarketRef getMarket() {
            return Swift_market(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final MidtermsRaceRating.Party getParty() {
            return Swift_party(this.Swift_peer);
        }

        public final String getPartyId() {
            return Swift_partyId(this.Swift_peer);
        }

        public final String getPartyLabel() {
            return Swift_partyLabel(this.Swift_peer);
        }

        public final Integer getPercent() {
            return Swift_percent(this.Swift_peer);
        }

        public final Double getProbability() {
            return Swift_probability(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Side(this);
        }

        public final void setCandidateId(String str) {
            willmutate();
            try {
                Swift_candidateId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setMarket(MarketRef marketRef) {
            MarketRef marketRef2 = (MarketRef) StructKt.sref$default(marketRef, null, 1, null);
            willmutate();
            try {
                Swift_market_set(this.Swift_peer, marketRef2);
            } finally {
                didmutate();
            }
        }

        public final void setName(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_name_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setParty(MidtermsRaceRating.Party party) {
            willmutate();
            try {
                Swift_party_set(this.Swift_peer, party);
            } finally {
                didmutate();
            }
        }

        public final void setPartyId(String str) {
            willmutate();
            try {
                Swift_partyId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setPartyLabel(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_partyLabel_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setProbability(Double d) {
            willmutate();
            try {
                Swift_probability_set(this.Swift_peer, d);
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

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Side(MidtermsRaceRating.Party party, String str, String str2, Double d, MarketRef marketRef, String str3, String str4) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(party, str, str2, d, marketRef, str3, str4);
        }

        public Side(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Side(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    public MidtermsRace(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ MidtermsRace(String str, String str2, MidtermsRegion midtermsRegion, Side side, Side side2, EAmount eAmount, MidtermsRaceRating midtermsRaceRating, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, midtermsRegion, side, side2, eAmount, midtermsRaceRating, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str3);
    }

    private MidtermsRace(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
