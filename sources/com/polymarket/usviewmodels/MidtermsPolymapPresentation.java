package com.polymarket.usviewmodels;

import com.polymarket.data.EAmericanState;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u0002:\nWXYZ[\\]^_`B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB}\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\b\u0010\"J\u0006\u0010'\u001a\u00020(J\u0015\u0010)\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010:\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010G\u001a\u00020\u001f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010J\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u007f\u0010K\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0082 J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\u0019\u0010P\u001a\u00020M2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0000H\u0082 J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020O0T2\u0006\u0010U\u001a\u00020+H\u0016J\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020O0T2\u0006\u0010U\u001a\u00020+H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010-R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010-R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006a"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "chambers", "", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Chamber;", "selectedChamberID", "", "balanceOfPower", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower;", "map", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Map;", "selector", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Selector;", "filters", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Filter;", "activeRatings", "", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "raceRows", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow;", "headline", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline;", "picker", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker;", "palette", "Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;", "(Ljava/util/List;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Map;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Selector;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker;Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getChambers", "()Ljava/util/List;", "Swift_chambers", "getSelectedChamberID", "()Ljava/lang/String;", "Swift_selectedChamberID", "getBalanceOfPower", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower;", "Swift_balanceOfPower", "getMap", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Map;", "Swift_map", "getSelector", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Selector;", "Swift_selector", "getFilters", "Swift_filters", "getActiveRatings", "()Ljava/util/Set;", "Swift_activeRatings", "getRaceRows", "Swift_raceRows", "getHeadline", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline;", "Swift_headline", "getPicker", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker;", "Swift_picker", "getPalette", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPalette;", "Swift_palette", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Chamber", "BalanceOfPower", "Focus", "Map", "Selector", "Filter", "RaceRow", "Headline", "Picker", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MidtermsPolymapPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBS\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010 J\u001c\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JR\u0010-\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082 ¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u000bH\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "democratProjected", "", "republicanProjected", "democratCurrentText", "", "republicanCurrentText", "seatsToWinText", "segments", "", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getDemocratProjected", "()Ljava/lang/Integer;", "Swift_democratProjected", "(J)Ljava/lang/Integer;", "getRepublicanProjected", "Swift_republicanProjected", "getDemocratCurrentText", "()Ljava/lang/String;", "Swift_democratCurrentText", "getRepublicanCurrentText", "Swift_republicanCurrentText", "getSeatsToWinText", "Swift_seatsToWinText", "getSegments", "()Ljava/util/List;", "Swift_segments", "Swift_constructor_0", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Segment", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BalanceOfPower implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ BalanceOfPower(Integer num, Integer num2, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, list);
        }

        private final native long Swift_constructor_0(Integer democratProjected, Integer republicanProjected, String democratCurrentText, String republicanCurrentText, String seatsToWinText, List<Segment> segments);

        private final native String Swift_democratCurrentText(long Swift_peer);

        private final native Integer Swift_democratProjected(long Swift_peer);

        private final native boolean Swift_isequal(BalanceOfPower lhs, BalanceOfPower rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_republicanCurrentText(long Swift_peer);

        private final native Integer Swift_republicanProjected(long Swift_peer);

        private final native String Swift_seatsToWinText(long Swift_peer);

        private final native List<Segment> Swift_segments(long Swift_peer);

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
            if (!(other instanceof BalanceOfPower)) {
                return false;
            }
            return Swift_isequal(this, (BalanceOfPower) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDemocratCurrentText() {
            return Swift_democratCurrentText(this.Swift_peer);
        }

        public final Integer getDemocratProjected() {
            return Swift_democratProjected(this.Swift_peer);
        }

        public final String getRepublicanCurrentText() {
            return Swift_republicanCurrentText(this.Swift_peer);
        }

        public final Integer getRepublicanProjected() {
            return Swift_republicanProjected(this.Swift_peer);
        }

        public final String getSeatsToWinText() {
            return Swift_seatsToWinText(this.Swift_peer);
        }

        public final List<Segment> getSegments() {
            return Swift_segments(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002)*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\rH\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "kind", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "count", "", "(Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getKind", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "Swift_kind", "getCount", "()I", "Swift_count", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Kind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Segment implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Segment(Kind kind, int i) {
                kind.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(kind, i);
            }

            private final native long Swift_constructor_0(Kind kind, int count);

            private final native int Swift_count(long Swift_peer);

            private final native boolean Swift_isequal(Segment lhs, Segment rhs);

            private final native Kind Swift_kind(long Swift_peer);

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

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Segment)) {
                    return false;
                }
                return Swift_isequal(this, (Segment) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final int getCount() {
                return Swift_count(this.Swift_peer);
            }

            public final Kind getKind() {
                return Swift_kind(this.Swift_peer);
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

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "HeldCase", "RatingCase", "UnratedCase", "Companion", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$HeldCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$RatingCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$UnratedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static abstract class Kind implements SwiftProjecting {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Kind unrated = new UnratedCase();

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$HeldCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes5.dex */
                public static final class HeldCase extends Kind {
                    private final MidtermsRaceRating.Party associated0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public HeldCase(MidtermsRaceRating.Party party) {
                        super(null);
                        party.getClass();
                        this.associated0 = party;
                    }

                    public boolean equals(Object other) {
                        if (!(other instanceof HeldCase) || this.associated0 != ((HeldCase) other).associated0) {
                            return false;
                        }
                        return true;
                    }

                    public final MidtermsRaceRating.Party getAssociated0() {
                        return this.associated0;
                    }

                    public int hashCode() {
                        return Hasher.INSTANCE.combine(1, this.associated0);
                    }
                }

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$RatingCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes5.dex */
                public static final class RatingCase extends Kind {
                    private final MidtermsRaceRating associated0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public RatingCase(MidtermsRaceRating midtermsRaceRating) {
                        super(null);
                        midtermsRaceRating.getClass();
                        this.associated0 = midtermsRaceRating;
                    }

                    public boolean equals(Object other) {
                        if (!(other instanceof RatingCase)) {
                            return false;
                        }
                        return Intrinsics.areEqual(this.associated0, ((RatingCase) other).associated0);
                    }

                    public final MidtermsRaceRating getAssociated0() {
                        return this.associated0;
                    }

                    public int hashCode() {
                        return Hasher.INSTANCE.combine(1, this.associated0);
                    }
                }

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$UnratedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes5.dex */
                public static final class UnratedCase extends Kind {
                    public UnratedCase() {
                        super(null);
                    }
                }

                public /* synthetic */ Kind(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final native Function0<Object> Swift_projectionImpl(int options);

                public static final /* synthetic */ Kind access$getUnrated$cp() {
                    return unrated;
                }

                @Override // skip.lib.SwiftProjecting
                public Function0<Object> Swift_projection(int options) {
                    return Swift_projectionImpl(options);
                }

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind$Companion;", "", "<init>", "()V", "held", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "rating", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "unrated", "getUnrated", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$BalanceOfPower$Segment$Kind;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes5.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final Kind getUnrated() {
                        return Kind.access$getUnrated$cp();
                    }

                    public final Kind held(MidtermsRaceRating.Party associated0) {
                        associated0.getClass();
                        return new HeldCase(associated0);
                    }

                    public final Kind rating(MidtermsRaceRating associated0) {
                        associated0.getClass();
                        return new RatingCase(associated0);
                    }

                    private Companion() {
                    }
                }

                private Kind() {
                }
            }

            public Segment(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public BalanceOfPower(Integer num, Integer num2, String str, String str2, String str3, List<Segment> list) {
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(num, num2, str, str2, str3, list);
        }

        public BalanceOfPower(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public MidtermsPolymapPresentation(List<Chamber> list, String str, BalanceOfPower balanceOfPower, Map map, Selector selector, List<Filter> list2, Set<MidtermsRaceRating> set, List<RaceRow> list3, Headline headline, Picker picker, MidtermsPolymapPalette midtermsPolymapPalette) {
        list.getClass();
        str.getClass();
        balanceOfPower.getClass();
        map.getClass();
        selector.getClass();
        list2.getClass();
        set.getClass();
        list3.getClass();
        picker.getClass();
        midtermsPolymapPalette.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, str, balanceOfPower, map, selector, list2, set, list3, headline, picker, midtermsPolymapPalette);
    }

    private final native Set<MidtermsRaceRating> Swift_activeRatings(long Swift_peer);

    private final native BalanceOfPower Swift_balanceOfPower(long Swift_peer);

    private final native List<Chamber> Swift_chambers(long Swift_peer);

    private final native long Swift_constructor_0(List<Chamber> chambers, String selectedChamberID, BalanceOfPower balanceOfPower, Map map, Selector selector, List<Filter> filters, Set<MidtermsRaceRating> activeRatings, List<RaceRow> raceRows, Headline headline, Picker picker, MidtermsPolymapPalette palette);

    private final native List<Filter> Swift_filters(long Swift_peer);

    private final native Headline Swift_headline(long Swift_peer);

    private final native boolean Swift_isequal(MidtermsPolymapPresentation lhs, MidtermsPolymapPresentation rhs);

    private final native Map Swift_map(long Swift_peer);

    private final native MidtermsPolymapPalette Swift_palette(long Swift_peer);

    private final native Picker Swift_picker(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<RaceRow> Swift_raceRows(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_selectedChamberID(long Swift_peer);

    private final native Selector Swift_selector(long Swift_peer);

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
        if (!(other instanceof MidtermsPolymapPresentation)) {
            return false;
        }
        return Swift_isequal(this, (MidtermsPolymapPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Set<MidtermsRaceRating> getActiveRatings() {
        return Swift_activeRatings(this.Swift_peer);
    }

    public final BalanceOfPower getBalanceOfPower() {
        return Swift_balanceOfPower(this.Swift_peer);
    }

    public final List<Chamber> getChambers() {
        return Swift_chambers(this.Swift_peer);
    }

    public final List<Filter> getFilters() {
        return Swift_filters(this.Swift_peer);
    }

    public final Headline getHeadline() {
        return Swift_headline(this.Swift_peer);
    }

    public final Map getMap() {
        return Swift_map(this.Swift_peer);
    }

    public final MidtermsPolymapPalette getPalette() {
        return Swift_palette(this.Swift_peer);
    }

    public final Picker getPicker() {
        return Swift_picker(this.Swift_peer);
    }

    public final List<RaceRow> getRaceRows() {
        return Swift_raceRows(this.Swift_peer);
    }

    public final String getSelectedChamberID() {
        return Swift_selectedChamberID(this.Swift_peer);
    }

    public final Selector getSelector() {
        return Swift_selector(this.Swift_peer);
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000212B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB3\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\u0019\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001c¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "emptyMessage", "items", "", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker$Item;", "selectedID", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getEmptyMessage", "Swift_emptyMessage", "getItems", "()Ljava/util/List;", "Swift_items", "getSelectedID", "Swift_selectedID", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Item", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Picker implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Picker(String str, String str2, List<Item> list, String str3) {
            ace.B(str, str2, list);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, list, str3);
        }

        private final native long Swift_constructor_0(String title, String emptyMessage, List<Item> items, String selectedID);

        private final native String Swift_emptyMessage(long Swift_peer);

        private final native boolean Swift_isequal(Picker lhs, Picker rhs);

        private final native List<Item> Swift_items(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_selectedID(long Swift_peer);

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
            if (!(other instanceof Picker)) {
                return false;
            }
            return Swift_isequal(this, (Picker) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getEmptyMessage() {
            return Swift_emptyMessage(this.Swift_peer);
        }

        public final List<Item> getItems() {
            return Swift_items(this.Swift_peer);
        }

        public final String getSelectedID() {
            return Swift_selectedID(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001c\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Picker$Item;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "(Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Item implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Item(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2);
            }

            private final native long Swift_constructor_0(String id, String title);

            private final native String Swift_id(long Swift_peer);

            private final native boolean Swift_isequal(Item lhs, Item rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

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
                if (!(other instanceof Item)) {
                    return false;
                }
                return Swift_isequal(this, (Item) other);
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

            public Item(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public Picker(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Picker(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i & 8) != 0 ? null : str3);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002;<B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBE\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010.\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JC\u0010/\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006="}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "rating", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "leading", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow$Side;", "trailing", "leadingShare", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRaceRating;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow$Side;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow$Side;D)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getRating", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "Swift_rating", "getLeading", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow$Side;", "Swift_leading", "getTrailing", "Swift_trailing", "getLeadingShare", "()D", "Swift_leadingShare", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Side", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RaceRow implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public RaceRow(String str, String str2, MidtermsRaceRating midtermsRaceRating, Side side, Side side2, double d) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, midtermsRaceRating, side, side2, d);
        }

        private final native long Swift_constructor_0(String id, String title, MidtermsRaceRating rating, Side leading, Side trailing, double leadingShare);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(RaceRow lhs, RaceRow rhs);

        private final native Side Swift_leading(long Swift_peer);

        private final native double Swift_leadingShare(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native MidtermsRaceRating Swift_rating(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native Side Swift_trailing(long Swift_peer);

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
            if (!(other instanceof RaceRow)) {
                return false;
            }
            return Swift_isequal(this, (RaceRow) other);
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

        public final Side getLeading() {
            return Swift_leading(this.Swift_peer);
        }

        public final double getLeadingShare() {
            return Swift_leadingShare(this.Swift_peer);
        }

        public final MidtermsRaceRating getRating() {
            return Swift_rating(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010%\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J@\u0010)\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\u0019\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020.032\u0006\u00104\u001a\u00020\u0010H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020.032\u0006\u00104\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u00067"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$RaceRow$Side;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "outcomeLabel", "", Keys.KEY_NAME, "percent", "", "oddsText", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_party", "getOutcomeLabel", "()Ljava/lang/String;", "Swift_outcomeLabel", "getName", "Swift_name", "getPercent", "()Ljava/lang/Integer;", "Swift_percent", "(J)Ljava/lang/Integer;", "getOddsText", "Swift_oddsText", "Swift_constructor_0", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Side implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Side(MidtermsRaceRating.Party party, String str, String str2, Integer num, String str3) {
                str.getClass();
                str2.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(party, str, str2, num, str3);
            }

            private final native long Swift_constructor_0(MidtermsRaceRating.Party party, String outcomeLabel, String name, Integer percent, String oddsText);

            private final native boolean Swift_isequal(Side lhs, Side rhs);

            private final native String Swift_name(long Swift_peer);

            private final native String Swift_oddsText(long Swift_peer);

            private final native String Swift_outcomeLabel(long Swift_peer);

            private final native MidtermsRaceRating.Party Swift_party(long Swift_peer);

            private final native Integer Swift_percent(long Swift_peer);

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

            public final String getName() {
                return Swift_name(this.Swift_peer);
            }

            public final String getOddsText() {
                return Swift_oddsText(this.Swift_peer);
            }

            public final String getOutcomeLabel() {
                return Swift_outcomeLabel(this.Swift_peer);
            }

            public final MidtermsRaceRating.Party getParty() {
                return Swift_party(this.Swift_peer);
            }

            public final Integer getPercent() {
                return Swift_percent(this.Swift_peer);
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

            public Side(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ Side(MidtermsRaceRating.Party party, String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : party, str, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3);
            }
        }

        public RaceRow(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ RaceRow(String str, String str2, MidtermsRaceRating midtermsRaceRating, Side side, Side side2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : midtermsRaceRating, (i & 8) != 0 ? null : side, (i & 16) != 0 ? null : side2, d);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Selector;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "hasSelection", "", "(Ljava/lang/String;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getHasSelection", "()Z", "Swift_hasSelection", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Selector implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Selector(String str, boolean z) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, z);
        }

        private final native long Swift_constructor_0(String title, boolean hasSelection);

        private final native boolean Swift_hasSelection(long Swift_peer);

        private final native boolean Swift_isequal(Selector lhs, Selector rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof Selector)) {
                return false;
            }
            return Swift_isequal(this, (Selector) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getHasSelection() {
            return Swift_hasSelection(this.Swift_peer);
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

        public Selector(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000234B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0082 J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u001bH\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r8F¢\u0006\u0006\u001a\u0004\b%\u0010 ¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "text", "", "highlightedFragments", "", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "sides", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline$Side;", "(Ljava/lang/String;Ljava/util/List;Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getText", "()Ljava/lang/String;", "Swift_text", "getHighlightedFragments", "()Ljava/util/List;", "Swift_highlightedFragments", "getParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_party", "getSides", "Swift_sides", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Side", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Headline implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Headline(String str, List<String> list, MidtermsRaceRating.Party party, List<Side> list2) {
            str.getClass();
            list.getClass();
            party.getClass();
            list2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, list, party, list2);
        }

        private final native long Swift_constructor_0(String text, List<String> highlightedFragments, MidtermsRaceRating.Party party, List<Side> sides);

        private final native List<String> Swift_highlightedFragments(long Swift_peer);

        private final native boolean Swift_isequal(Headline lhs, Headline rhs);

        private final native MidtermsRaceRating.Party Swift_party(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Side> Swift_sides(long Swift_peer);

        private final native String Swift_text(long Swift_peer);

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
            if (!(other instanceof Headline)) {
                return false;
            }
            return Swift_isequal(this, (Headline) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<String> getHighlightedFragments() {
            return Swift_highlightedFragments(this.Swift_peer);
        }

        public final MidtermsRaceRating.Party getParty() {
            return Swift_party(this.Swift_peer);
        }

        public final List<Side> getSides() {
            return Swift_sides(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getText() {
            return Swift_text(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0013\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u001aH\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010#¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Headline$Side;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "outcomeLabel", "", "oddsText", "isTradable", "", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/String;Ljava/lang/String;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_party", "getOutcomeLabel", "()Ljava/lang/String;", "Swift_outcomeLabel", "getOddsText", "Swift_oddsText", "()Z", "Swift_isTradable", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Side implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Side(MidtermsRaceRating.Party party, String str, String str2, boolean z) {
                party.getClass();
                str.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(party, str, str2, z);
            }

            private final native long Swift_constructor_0(MidtermsRaceRating.Party party, String outcomeLabel, String oddsText, boolean isTradable);

            private final native boolean Swift_isTradable(long Swift_peer);

            private final native boolean Swift_isequal(Side lhs, Side rhs);

            private final native String Swift_oddsText(long Swift_peer);

            private final native String Swift_outcomeLabel(long Swift_peer);

            private final native MidtermsRaceRating.Party Swift_party(long Swift_peer);

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

            public final String getOddsText() {
                return Swift_oddsText(this.Swift_peer);
            }

            public final String getOutcomeLabel() {
                return Swift_outcomeLabel(this.Swift_peer);
            }

            public final MidtermsRaceRating.Party getParty() {
                return Swift_party(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(this.Swift_peer);
            }

            public final boolean isTradable() {
                return Swift_isTradable(this.Swift_peer);
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public Side(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ Side(MidtermsRaceRating.Party party, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(party, str, (i & 4) != 0 ? null : str2, z);
            }
        }

        public Headline(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010$\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010%J6\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 ¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0010H\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Chamber;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "controlParty", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "controlPercent", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getControlParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_controlParty", "getControlPercent", "()Ljava/lang/Integer;", "Swift_controlPercent", "(J)Ljava/lang/Integer;", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;Ljava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Chamber implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Chamber(String str, String str2, MidtermsRaceRating.Party party, Integer num) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, party, num);
        }

        private final native long Swift_constructor_0(String id, String title, MidtermsRaceRating.Party controlParty, Integer controlPercent);

        private final native MidtermsRaceRating.Party Swift_controlParty(long Swift_peer);

        private final native Integer Swift_controlPercent(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Chamber lhs, Chamber rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof Chamber)) {
                return false;
            }
            return Swift_isequal(this, (Chamber) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final MidtermsRaceRating.Party getControlParty() {
            return Swift_controlParty(this.Swift_peer);
        }

        public final Integer getControlPercent() {
            return Swift_controlPercent(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
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

        public Chamber(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Chamber(String str, String str2, MidtermsRaceRating.Party party, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : party, (i & 8) != 0 ? null : num);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u000fH\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Filter;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "rating", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "count", "", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating;Ljava/lang/String;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getRating", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "Swift_rating", "getTitle", "()Ljava/lang/String;", "Swift_title", "getCount", "()I", "Swift_count", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Filter implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Filter(MidtermsRaceRating midtermsRaceRating, String str, int i) {
            midtermsRaceRating.getClass();
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(midtermsRaceRating, str, i);
        }

        private final native long Swift_constructor_0(MidtermsRaceRating rating, String title, int count);

        private final native int Swift_count(long Swift_peer);

        private final native boolean Swift_isequal(Filter lhs, Filter rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native MidtermsRaceRating Swift_rating(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof Filter)) {
                return false;
            }
            return Swift_isequal(this, (Filter) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final int getCount() {
            return Swift_count(this.Swift_peer);
        }

        public final MidtermsRaceRating getRating() {
            return Swift_rating(this.Swift_peer);
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

        public Filter(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Focus;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "region", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "ring", "", "(Lcom/polymarket/usviewmodels/MidtermsRegion;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getRegion", "()Lcom/polymarket/usviewmodels/MidtermsRegion;", "Swift_region", "getRing", "()Ljava/util/List;", "Swift_ring", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Focus implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Focus(MidtermsRegion midtermsRegion, List<? extends MidtermsRegion> list) {
            midtermsRegion.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(midtermsRegion, list);
        }

        private final native long Swift_constructor_0(MidtermsRegion region, List<? extends MidtermsRegion> ring);

        private final native boolean Swift_isequal(Focus lhs, Focus rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native MidtermsRegion Swift_region(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native List<MidtermsRegion> Swift_ring(long Swift_peer);

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
            if (!(other instanceof Focus)) {
                return false;
            }
            return Swift_isequal(this, (Focus) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final MidtermsRegion getRegion() {
            return Swift_region(this.Swift_peer);
        }

        public final List<MidtermsRegion> getRing() {
            return Swift_ring(this.Swift_peer);
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

        public Focus(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBQ\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JS\u0010(\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0011H\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0011H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R)\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r0\r8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00064"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Map;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "showsDistricts", "", "stateRatings", "", "Lcom/polymarket/data/EAmericanState;", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "districtRatings", "", "focus", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Focus;", "(ZLjava/util/Map;Ljava/util/Map;Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Focus;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getShowsDistricts", "()Z", "Swift_showsDistricts", "getStateRatings", "()Ljava/util/Map;", "Swift_stateRatings", "getDistrictRatings", "Swift_districtRatings", "getFocus", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation$Focus;", "Swift_focus", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Map implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Map(boolean z, java.util.Map<EAmericanState, MidtermsRaceRating> map, java.util.Map<EAmericanState, ? extends java.util.Map<Integer, MidtermsRaceRating>> map2, Focus focus) {
            map.getClass();
            map2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(z, map, map2, focus);
        }

        private final native long Swift_constructor_0(boolean showsDistricts, java.util.Map<EAmericanState, MidtermsRaceRating> stateRatings, java.util.Map<EAmericanState, ? extends java.util.Map<Integer, MidtermsRaceRating>> districtRatings, Focus focus);

        private final native java.util.Map<EAmericanState, java.util.Map<Integer, MidtermsRaceRating>> Swift_districtRatings(long Swift_peer);

        private final native Focus Swift_focus(long Swift_peer);

        private final native boolean Swift_isequal(Map lhs, Map rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native boolean Swift_showsDistricts(long Swift_peer);

        private final native java.util.Map<EAmericanState, MidtermsRaceRating> Swift_stateRatings(long Swift_peer);

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
            if (!(other instanceof Map)) {
                return false;
            }
            return Swift_isequal(this, (Map) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final java.util.Map<EAmericanState, java.util.Map<Integer, MidtermsRaceRating>> getDistrictRatings() {
            return Swift_districtRatings(this.Swift_peer);
        }

        public final Focus getFocus() {
            return Swift_focus(this.Swift_peer);
        }

        public final boolean getShowsDistricts() {
            return Swift_showsDistricts(this.Swift_peer);
        }

        public final java.util.Map<EAmericanState, MidtermsRaceRating> getStateRatings() {
            return Swift_stateRatings(this.Swift_peer);
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

        public Map(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Map(boolean z, java.util.Map map, java.util.Map map2, Focus focus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, map, map2, (i & 8) != 0 ? null : focus);
        }
    }

    public MidtermsPolymapPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ MidtermsPolymapPresentation(List list, String str, BalanceOfPower balanceOfPower, Map map, Selector selector, List list2, Set set, List list3, Headline headline, Picker picker, MidtermsPolymapPalette midtermsPolymapPalette, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, balanceOfPower, map, selector, list2, set, list3, (i & 256) != 0 ? null : headline, picker, midtermsPolymapPalette);
    }
}
