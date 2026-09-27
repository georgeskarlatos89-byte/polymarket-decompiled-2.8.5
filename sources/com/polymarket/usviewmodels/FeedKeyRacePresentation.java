package com.polymarket.usviewmodels;

import com.polymarket.designtokens.HexColorPair;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010*\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u0015\u0010-\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JH\u0010.\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 ¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u001dH\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010,¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/FeedKeyRacePresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "matchupText", "leading", "Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;", "trailing", "leadingShare", "", "isHydrated", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;Ljava/lang/Double;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getMatchupText", "Swift_matchupText", "getLeading", "()Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;", "Swift_leading", "getTrailing", "Swift_trailing", "getLeadingShare", "()Ljava/lang/Double;", "Swift_leadingShare", "(J)Ljava/lang/Double;", "()Z", "Swift_isHydrated", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;Ljava/lang/Double;Z)J", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Side", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedKeyRacePresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public FeedKeyRacePresentation(String str, String str2, Side side, Side side2, Double d, boolean z) {
        str.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, side, side2, d, z);
    }

    private final native long Swift_constructor_0(String title, String matchupText, Side leading, Side trailing, Double leadingShare, boolean isHydrated);

    private final native boolean Swift_isHydrated(long Swift_peer);

    private final native boolean Swift_isequal(FeedKeyRacePresentation lhs, FeedKeyRacePresentation rhs);

    private final native Side Swift_leading(long Swift_peer);

    private final native Double Swift_leadingShare(long Swift_peer);

    private final native String Swift_matchupText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

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
        if (!(other instanceof FeedKeyRacePresentation)) {
            return false;
        }
        return Swift_isequal(this, (FeedKeyRacePresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Side getLeading() {
        return Swift_leading(this.Swift_peer);
    }

    public final Double getLeadingShare() {
        return Swift_leadingShare(this.Swift_peer);
    }

    public final String getMatchupText() {
        return Swift_matchupText(this.Swift_peer);
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

    public final boolean isHydrated() {
        return Swift_isHydrated(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public FeedKeyRacePresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ FeedKeyRacePresentation(String str, String str2, Side side, Side side2, Double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : side, (i & 8) != 0 ? null : side2, (i & 16) != 0 ? null : d, z);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBM\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010.\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010/JP\u00100\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/FeedKeyRacePresentation$Side;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", Keys.KEY_NAME, "", "partyAbbreviation", "color", "Lcom/polymarket/designtokens/HexColorPair;", "textColor", "imageURL", "oddsText", "probability", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getName", "()Ljava/lang/String;", "Swift_name", "getPartyAbbreviation", "Swift_partyAbbreviation", "getColor", "()Lcom/polymarket/designtokens/HexColorPair;", "Swift_color", "getTextColor", "Swift_textColor", "getImageURL", "Swift_imageURL", "getOddsText", "Swift_oddsText", "getProbability", "()Ljava/lang/Double;", "Swift_probability", "(J)Ljava/lang/Double;", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Side implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Side(String str, String str2, HexColorPair hexColorPair, HexColorPair hexColorPair2, String str3, String str4, Double d) {
            str.getClass();
            str2.getClass();
            hexColorPair.getClass();
            hexColorPair2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, hexColorPair, hexColorPair2, str3, str4, d);
        }

        private final native HexColorPair Swift_color(long Swift_peer);

        private final native long Swift_constructor_0(String name, String partyAbbreviation, HexColorPair color, HexColorPair textColor, String imageURL, String oddsText, Double probability);

        private final native String Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isequal(Side lhs, Side rhs);

        private final native String Swift_name(long Swift_peer);

        private final native String Swift_oddsText(long Swift_peer);

        private final native String Swift_partyAbbreviation(long Swift_peer);

        private final native Double Swift_probability(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native HexColorPair Swift_textColor(long Swift_peer);

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

        public final HexColorPair getColor() {
            return Swift_color(this.Swift_peer);
        }

        public final String getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final String getOddsText() {
            return Swift_oddsText(this.Swift_peer);
        }

        public final String getPartyAbbreviation() {
            return Swift_partyAbbreviation(this.Swift_peer);
        }

        public final Double getProbability() {
            return Swift_probability(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final HexColorPair getTextColor() {
            return Swift_textColor(this.Swift_peer);
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

        public /* synthetic */ Side(String str, String str2, HexColorPair hexColorPair, HexColorPair hexColorPair2, String str3, String str4, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, hexColorPair, hexColorPair2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : d);
        }
    }
}
