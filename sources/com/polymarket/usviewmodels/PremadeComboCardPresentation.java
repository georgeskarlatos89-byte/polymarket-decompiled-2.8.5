package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.data.EMarketImageContext;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003GHIB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBk\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00103\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00106\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 Jo\u0010;\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\u0019\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000H\u0082 J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020?0D2\u0006\u0010E\u001a\u00020\u000fH\u0016J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020?0D2\u0006\u0010E\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010$¨\u0006J"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "legCount", "", RadarTripOptions.KEY_LEGS, "", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Leg;", "visibleLegs", "viewMoreText", "stakeText", "payout", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "tradersText", "volumeText", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getLegCount", "()I", "Swift_legCount", "getLegs", "()Ljava/util/List;", "Swift_legs", "getVisibleLegs", "Swift_visibleLegs", "getViewMoreText", "Swift_viewMoreText", "getStakeText", "Swift_stakeText", "getPayout", "()Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "Swift_payout", "getTradersText", "Swift_tradersText", "getVolumeText", "Swift_volumeText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Leg", "Payout", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PremadeComboCardPresentation implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public PremadeComboCardPresentation(String str, String str2, int i, List<Leg> list, List<Leg> list2, String str3, String str4, Payout payout, String str5, String str6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str4.getClass();
        payout.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, i, list, list2, str3, str4, payout, str5, str6);
    }

    private final native long Swift_constructor_0(String id, String title, int legCount, List<Leg> legs, List<Leg> visibleLegs, String viewMoreText, String stakeText, Payout payout, String tradersText, String volumeText);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isequal(PremadeComboCardPresentation lhs, PremadeComboCardPresentation rhs);

    private final native int Swift_legCount(long Swift_peer);

    private final native List<Leg> Swift_legs(long Swift_peer);

    private final native Payout Swift_payout(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_stakeText(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native String Swift_tradersText(long Swift_peer);

    private final native String Swift_viewMoreText(long Swift_peer);

    private final native List<Leg> Swift_visibleLegs(long Swift_peer);

    private final native String Swift_volumeText(long Swift_peer);

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
        if (!(other instanceof PremadeComboCardPresentation)) {
            return false;
        }
        return Swift_isequal(this, (PremadeComboCardPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final int getLegCount() {
        return Swift_legCount(this.Swift_peer);
    }

    public final List<Leg> getLegs() {
        return Swift_legs(this.Swift_peer);
    }

    public final Payout getPayout() {
        return Swift_payout(this.Swift_peer);
    }

    public final String getStakeText() {
        return Swift_stakeText(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final String getTradersText() {
        return Swift_tradersText(this.Swift_peer);
    }

    public final String getViewMoreText() {
        return Swift_viewMoreText(this.Swift_peer);
    }

    public final List<Leg> getVisibleLegs() {
        return Swift_visibleLegs(this.Swift_peer);
    }

    public final String getVolumeText() {
        return Swift_volumeText(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "LoadingCase", "ValueCase", "UnavailableCase", "Companion", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$LoadingCase;", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$UnavailableCase;", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$ValueCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Payout implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Payout loading = new LoadingCase();
        private static final Payout unavailable = new UnavailableCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$LoadingCase;", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadingCase extends Payout {
            public LoadingCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$UnavailableCase;", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class UnavailableCase extends Payout {
            public UnavailableCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$ValueCase;", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ValueCase extends Payout {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValueCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ValueCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((ValueCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Payout(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Payout access$getLoading$cp() {
            return loading;
        }

        public static final /* synthetic */ Payout access$getUnavailable$cp() {
            return unavailable;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout$Companion;", "", "<init>", "()V", "loading", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "getLoading", "()Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Payout;", "value", "associated0", "", "unavailable", "getUnavailable", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Payout getLoading() {
                return Payout.access$getLoading$cp();
            }

            public final Payout getUnavailable() {
                return Payout.access$getUnavailable$cp();
            }

            public final Payout value(String associated0) {
                associated0.getClass();
                return new ValueCase(associated0);
            }

            private Companion() {
            }
        }

        private Payout() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBG\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010,\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JK\u00100\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0013\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/PremadeComboCardPresentation$Leg;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "selectionTitle", "marketLabel", "oddsText", "showsNoBadge", "", "imageContent", "Lcom/polymarket/data/EMarketImageContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/polymarket/data/EMarketImageContext;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getSelectionTitle", "Swift_selectionTitle", "getMarketLabel", "Swift_marketLabel", "getOddsText", "Swift_oddsText", "getShowsNoBadge", "()Z", "Swift_showsNoBadge", "getImageContent", "()Lcom/polymarket/data/EMarketImageContext;", "Swift_imageContent", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Leg implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Leg(String str, String str2, String str3, String str4, String str5, boolean z, EMarketImageContext eMarketImageContext) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5, z, eMarketImageContext);
        }

        private final native long Swift_constructor_0(String id, String title, String selectionTitle, String marketLabel, String oddsText, boolean showsNoBadge, EMarketImageContext imageContent);

        private final native String Swift_id(long Swift_peer);

        private final native EMarketImageContext Swift_imageContent(long Swift_peer);

        private final native boolean Swift_isequal(Leg lhs, Leg rhs);

        private final native String Swift_marketLabel(long Swift_peer);

        private final native String Swift_oddsText(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_selectionTitle(long Swift_peer);

        private final native boolean Swift_showsNoBadge(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof Leg)) {
                return false;
            }
            return Swift_isequal(this, (Leg) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final EMarketImageContext getImageContent() {
            return Swift_imageContent(this.Swift_peer);
        }

        public final String getMarketLabel() {
            return Swift_marketLabel(this.Swift_peer);
        }

        public final String getOddsText() {
            return Swift_oddsText(this.Swift_peer);
        }

        public final String getSelectionTitle() {
            return Swift_selectionTitle(this.Swift_peer);
        }

        public final boolean getShowsNoBadge() {
            return Swift_showsNoBadge(this.Swift_peer);
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

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Leg(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public PremadeComboCardPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
