package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007bcdefghB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010)\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00103\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00106\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00109\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010C2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010H2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010O\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010P\u001a\u0004\u0018\u00010HH\u0082 J\u0015\u0010Q\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010]\u001a\u00020\u0001H\u0016J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00170_2\u0006\u0010`\u001a\u00020\u0019H\u0016J\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00170_2\u0006\u0010`\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0011\u0010'\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00104\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b5\u00102R\u0013\u00107\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b8\u00102R\u0013\u0010:\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b;\u00102R\u0013\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010G\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010SX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006i"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "getId", "()Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "Swift_id", Keys.KEY_NAME, "", "getName", "()Ljava/lang/String;", "Swift_name", "description", "getDescription", "Swift_description", "headline", "getHeadline", "Swift_headline", "status", "Lcom/polymarket/data/APICompetitionPromo$Status;", "getStatus", "()Lcom/polymarket/data/APICompetitionPromo$Status;", "Swift_status", "startTime", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "Swift_startTime", "endTime", "getEndTime", "Swift_endTime", "createdAt", "getCreatedAt", "Swift_createdAt", "updatedAt", "getUpdatedAt", "Swift_updatedAt", "image", "Ljava/net/URI;", "getImage", "()Ljava/net/URI;", "Swift_image", "detailSheet", "Lcom/polymarket/data/APICompetitionPromo$DetailSheet;", "getDetailSheet", "()Lcom/polymarket/data/APICompetitionPromo$DetailSheet;", "Swift_detailSheet", "newValue", "Lcom/polymarket/data/APICompetitionPromo$Participation;", "participation", "getParticipation", "()Lcom/polymarket/data/APICompetitionPromo$Participation;", "setParticipation", "(Lcom/polymarket/data/APICompetitionPromo$Participation;)V", "Swift_participation", "Swift_participation_set", "value", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "CompetitionID", "Status", "Participation", "Participant", "DetailSheet", "SheetContent", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APICompetitionPromo implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0002./B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140+2\u0006\u0010,\u001a\u00020\u0016H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140+2\u0006\u0010,\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$DetailSheet;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "headerTitle", "", "getHeaderTitle", "()Ljava/lang/String;", "Swift_headerTitle", "footer", "getFooter", "Swift_footer", "contentList", "", "Lcom/polymarket/data/APICompetitionPromo$SheetContent;", "getContentList", "()Ljava/util/List;", "Swift_contentList", "cta", "Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA;", "getCta", "()Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA;", "Swift_cta", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "CTA", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DetailSheet implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public DetailSheet(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native List<SheetContent> Swift_contentList(long Swift_peer);

        private final native CTA Swift_cta(long Swift_peer);

        private final native String Swift_footer(long Swift_peer);

        private final native String Swift_headerTitle(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<SheetContent> getContentList() {
            return Swift_contentList(this.Swift_peer);
        }

        public final CTA getCta() {
            return Swift_cta(this.Swift_peer);
        }

        public final String getFooter() {
            return Swift_footer(this.Swift_peer);
        }

        public final String getHeaderTitle() {
            return Swift_headerTitle(this.Swift_peer);
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
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"2\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\"2\u0006\u0010#\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "label", "", "getLabel", "()Ljava/lang/String;", "Swift_label", "action", "Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action;", "getAction", "()Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action;", "Swift_action", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Action", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CTA implements SwiftPeerBridged, SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private long Swift_peer;

            public CTA(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            private final native Action Swift_action(long Swift_peer);

            private final native String Swift_label(long Swift_peer);

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
                if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                    return false;
                }
                return true;
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Action getAction() {
                return Swift_action(this.Swift_peer);
            }

            public final String getLabel() {
                return Swift_label(this.Swift_peer);
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "join", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Action implements RawRepresentable<String>, SwiftProjecting {
                private static final /* synthetic */ ug7 $ENTRIES;
                private static final /* synthetic */ Action[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final Action join = new Action("join", 0, "JOIN", null, 2, null);
                public static final Action unknown = new Action("unknown", 1, "UNKNOWN", null, 2, null);
                private final String rawValue;

                private static final /* synthetic */ Action[] $values() {
                    return new Action[]{join, unknown};
                }

                static {
                    Action[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = ww4.b($values);
                    INSTANCE = new Companion(null);
                }

                public /* synthetic */ Action(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i, str2, (i2 & 2) != 0 ? null : r4);
                }

                private final native Function0<Object> Swift_projectionImpl(int options);

                public static ug7 getEntries() {
                    return $ENTRIES;
                }

                public static Action valueOf(String str) {
                    return (Action) Enum.valueOf(Action.class, str);
                }

                public static Action[] values() {
                    return (Action[]) $VALUES.clone();
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
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes4.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final Action init(String rawValue) {
                        rawValue.getClass();
                        if (Intrinsics.areEqual(rawValue, "JOIN")) {
                            return Action.join;
                        }
                        if (Intrinsics.areEqual(rawValue, "UNKNOWN")) {
                            return Action.unknown;
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

                private Action(String str, int i, String str2, Void r4) {
                    this.rawValue = str2;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Companion;", "", "<init>", "()V", "Action", "Lcom/polymarket/data/APICompetitionPromo$DetailSheet$CTA$Action;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Action Action(String rawValue) {
                    rawValue.getClass();
                    return Action.INSTANCE.init(rawValue);
                }

                private Companion() {
                }
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010-\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010.J\u001c\u00101\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010.J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u0014032\u0006\u00104\u001a\u00020\u0016H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014032\u0006\u00104\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010*\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00067"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$Participant;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "competitionID", "Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "getCompetitionID", "()Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "Swift_competitionID", "userID", "", "getUserID", "()Ljava/lang/String;", "Swift_userID", "joinedAt", "Ljava/util/Date;", "getJoinedAt", "()Ljava/util/Date;", "Swift_joinedAt", "active", "getActive", "()Z", "Swift_active", "pnl", "getPnl", "()Ljava/lang/Integer;", "Swift_pnl", "(J)Ljava/lang/Integer;", "rank", "getRank", "Swift_rank", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Participant implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Participant(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native boolean Swift_active(long Swift_peer);

        private final native CompetitionID Swift_competitionID(long Swift_peer);

        private final native Date Swift_joinedAt(long Swift_peer);

        private final native Integer Swift_pnl(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Integer Swift_rank(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_userID(long Swift_peer);

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

        public final boolean getActive() {
            return Swift_active(this.Swift_peer);
        }

        public final CompetitionID getCompetitionID() {
            return Swift_competitionID(this.Swift_peer);
        }

        public final Date getJoinedAt() {
            return Swift_joinedAt(this.Swift_peer);
        }

        public final Integer getPnl() {
            return Swift_pnl(this.Swift_peer);
        }

        public final Integer getRank() {
            return Swift_rank(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getUserID() {
            return Swift_userID(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001a\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010#\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010'\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010$J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140)2\u0006\u0010*\u001a\u00020\u0016H\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140)2\u0006\u0010*\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006-"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$Participation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "active", "getActive", "()Z", "Swift_active", "joinedAt", "Ljava/util/Date;", "getJoinedAt", "()Ljava/util/Date;", "Swift_joinedAt", "pnl", "getPnl", "()Ljava/lang/Integer;", "Swift_pnl", "(J)Ljava/lang/Integer;", "rank", "getRank", "Swift_rank", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Participation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Participation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native boolean Swift_active(long Swift_peer);

        private final native Date Swift_joinedAt(long Swift_peer);

        private final native Integer Swift_pnl(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Integer Swift_rank(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getActive() {
            return Swift_active(this.Swift_peer);
        }

        public final Date getJoinedAt() {
            return Swift_joinedAt(this.Swift_peer);
        }

        public final Integer getPnl() {
            return Swift_pnl(this.Swift_peer);
        }

        public final Integer getRank() {
            return Swift_rank(this.Swift_peer);
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
    }

    private APICompetitionPromo(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native String Swift_description(long Swift_peer);

    private final native DetailSheet Swift_detailSheet(long Swift_peer);

    private final native Date Swift_endTime(long Swift_peer);

    private final native String Swift_headline(long Swift_peer);

    private final native CompetitionID Swift_id(long Swift_peer);

    private final native URI Swift_image(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native Participation Swift_participation(long Swift_peer);

    private final native void Swift_participation_set(long Swift_peer, Participation value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_startTime(long Swift_peer);

    private final native Status Swift_status(long Swift_peer);

    private final native Date Swift_updatedAt(long Swift_peer);

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

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final String getDescription() {
        return Swift_description(this.Swift_peer);
    }

    public final DetailSheet getDetailSheet() {
        return Swift_detailSheet(this.Swift_peer);
    }

    public final Date getEndTime() {
        return Swift_endTime(this.Swift_peer);
    }

    public final String getHeadline() {
        return Swift_headline(this.Swift_peer);
    }

    public final CompetitionID getId() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImage() {
        return Swift_image(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final Participation getParticipation() {
        return Swift_participation(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Date getStartTime() {
        return Swift_startTime(this.Swift_peer);
    }

    public final Status getStatus() {
        return Swift_status(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new APICompetitionPromo(this);
    }

    public final void setParticipation(Participation participation) {
        willmutate();
        try {
            Swift_participation_set(this.Swift_peer, participation);
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002()B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140%2\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140%2\u0006\u0010&\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "body", "getBody", "Swift_body", "context", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "getContext", "()Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "Swift_context", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SheetContextContext", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SheetContent implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public SheetContent(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native String Swift_body(long Swift_peer);

        private final native SheetContextContext Swift_context(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getBody() {
            return Swift_body(this.Swift_peer);
        }

        public final SheetContextContext getContext() {
            return Swift_context(this.Swift_peer);
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
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "JobCase", "StreakCase", "JobContext", "StreakContext", "Companion", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobCase;", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static abstract class SheetContextContext implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobCase;", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "associated0", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext;", "<init>", "(Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext;)V", "getAssociated0", "()Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class JobCase extends SheetContextContext {
                private final JobContext associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JobCase(JobContext jobContext) {
                    super(null);
                    jobContext.getClass();
                    this.associated0 = jobContext;
                }

                public final JobContext getAssociated0() {
                    return this.associated0;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002!\"B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "attributes", "", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext$Attribute;", "getAttributes", "()Ljava/util/List;", "Swift_attributes", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Attribute", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class JobContext implements SwiftPeerBridged, SwiftProjecting {
                private long Swift_peer;

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010!\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext$Attribute;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "label", "", "getLabel", "()Ljava/lang/String;", "Swift_label", "value", "getValue", "Swift_value", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes4.dex */
                public static final class Attribute implements SwiftPeerBridged, SwiftProjecting {
                    private long Swift_peer;

                    public Attribute(long j, SwiftPeerMarker swiftPeerMarker) {
                        BridgeSupportKt.getSwiftObjectNil();
                        this.Swift_peer = j;
                    }

                    private final native String Swift_label(long Swift_peer);

                    private final native Function0<Object> Swift_projectionImpl(int options);

                    private final native void Swift_release(long Swift_peer);

                    private final native String Swift_value(long Swift_peer);

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

                    public final String getLabel() {
                        return Swift_label(this.Swift_peer);
                    }

                    public final long getSwift_peer() {
                        return this.Swift_peer;
                    }

                    public final String getValue() {
                        return Swift_value(this.Swift_peer);
                    }

                    public int hashCode() {
                        return Long.hashCode(this.Swift_peer);
                    }

                    public final void setSwift_peer(long j) {
                        this.Swift_peer = j;
                    }
                }

                public JobContext(long j, SwiftPeerMarker swiftPeerMarker) {
                    BridgeSupportKt.getSwiftObjectNil();
                    this.Swift_peer = j;
                }

                private final native List<Attribute> Swift_attributes(long Swift_peer);

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
                    if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                        return false;
                    }
                    return true;
                }

                public final void finalize() {
                    Swift_release(this.Swift_peer);
                    this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                }

                public final List<Attribute> getAttributes() {
                    return Swift_attributes(this.Swift_peer);
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
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakCase;", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "associated0", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakContext;", "<init>", "(Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakContext;)V", "getAssociated0", "()Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakContext;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class StreakCase extends SheetContextContext {
                private final StreakContext associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StreakCase(StreakContext streakContext) {
                    super(null);
                    streakContext.getClass();
                    this.associated0 = streakContext;
                }

                public final StreakContext getAssociated0() {
                    return this.associated0;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001a\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006#"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakContext;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "currentStreak", "getCurrentStreak", "()I", "Swift_currentStreak", "longestStreak", "getLongestStreak", "Swift_longestStreak", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class StreakContext implements SwiftPeerBridged, SwiftProjecting {
                private long Swift_peer;

                public StreakContext(long j, SwiftPeerMarker swiftPeerMarker) {
                    BridgeSupportKt.getSwiftObjectNil();
                    this.Swift_peer = j;
                }

                private final native int Swift_currentStreak(long Swift_peer);

                private final native int Swift_longestStreak(long Swift_peer);

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
                    if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                        return false;
                    }
                    return true;
                }

                public final void finalize() {
                    Swift_release(this.Swift_peer);
                    this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                }

                public final int getCurrentStreak() {
                    return Swift_currentStreak(this.Swift_peer);
                }

                public final int getLongestStreak() {
                    return Swift_longestStreak(this.Swift_peer);
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
            }

            public /* synthetic */ SheetContextContext(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$Companion;", "", "<init>", "()V", "job", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext;", "associated0", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$JobContext;", "streak", "Lcom/polymarket/data/APICompetitionPromo$SheetContent$SheetContextContext$StreakContext;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SheetContextContext job(JobContext associated0) {
                    associated0.getClass();
                    return new JobCase(associated0);
                }

                public final SheetContextContext streak(StreakContext associated0) {
                    associated0.getClass();
                    return new StreakCase(associated0);
                }

                private Companion() {
                }
            }

            private SheetContextContext() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "active", "inactive", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Status implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status active = new Status("active", 0, "COMPETITION_STATUS_ACTIVE", null, 2, null);
        public static final Status inactive = new Status("inactive", 1, "COMPETITION_STATUS_INACTIVE", null, 2, null);
        public static final Status unknown = new Status("unknown", 2, "COMPETITION_STATUS_UNKNOWN", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{active, inactive, unknown};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Status(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APICompetitionPromo$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1770231944) {
                    if (hashCode != -535433901) {
                        if (hashCode == 1458374525 && rawValue.equals("COMPETITION_STATUS_UNKNOWN")) {
                            return Status.unknown;
                        }
                        return null;
                    }
                    if (rawValue.equals("COMPETITION_STATUS_ACTIVE")) {
                        return Status.active;
                    }
                    return null;
                }
                if (!rawValue.equals("COMPETITION_STATUS_INACTIVE")) {
                    return null;
                }
                return Status.inactive;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Status(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$Companion;", "", "<init>", "()V", "Status", "Lcom/polymarket/data/APICompetitionPromo$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Status Status(String rawValue) {
            rawValue.getClass();
            return Status.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public APICompetitionPromo(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u0017\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u0019\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0082 J\b\u0010#\u001a\u00020$H\u0016J\u0015\u0010%\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\u0006\u0010(\u001a\u00020$H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\u0006\u0010(\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006+"}, d2 = {"Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "value", "", "(Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getValue", "()Ljava/lang/String;", "Swift_value", "Swift_constructor_0", "description", "getDescription", "Swift_description", "toString", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CompetitionID implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public CompetitionID(String str) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str);
        }

        private final native long Swift_constructor_0(String value);

        private final native String Swift_description(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(CompetitionID lhs, CompetitionID rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_value(long Swift_peer);

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
            if (!(other instanceof CompetitionID)) {
                return false;
            }
            return Swift_isequal(this, (CompetitionID) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getValue() {
            return Swift_value(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public String toString() {
            return getDescription();
        }

        public CompetitionID(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
