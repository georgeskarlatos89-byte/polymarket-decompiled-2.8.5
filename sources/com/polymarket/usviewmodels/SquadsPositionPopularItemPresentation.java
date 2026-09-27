package com.polymarket.usviewmodels;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003@ABB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBO\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\n\u0010\u0019J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0015\u0010 \u001a\u00020\u001f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010(\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00101\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00103\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00104\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JM\u00105\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0082 J\u0013\u00106\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\u0019\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0082 J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002080=2\u0006\u0010>\u001a\u00020\"H\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002080=2\u0006\u0010>\u001a\u00020\"H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u00102R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u00102¨\u0006C"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation;", "Lskip/lib/Identifiable;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "kind", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "originator", "Lcom/polymarket/usviewmodels/SquadsPopularOriginatorPresentation;", "joinedMembers", "", "Lcom/polymarket/usviewmodels/SquadsRowMemberPresentation;", "joinedCountText", "", "isJoinEnabled", "", "isJoinedByViewer", "(Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;Lcom/polymarket/usviewmodels/SquadsPopularOriginatorPresentation;Ljava/util/List;Ljava/lang/String;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "Swift_id", "getKind", "()Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "Swift_kind", "getOriginator", "()Lcom/polymarket/usviewmodels/SquadsPopularOriginatorPresentation;", "Swift_originator", "getJoinedMembers", "()Ljava/util/List;", "Swift_joinedMembers", "getJoinedCountText", "()Ljava/lang/String;", "Swift_joinedCountText", "()Z", "Swift_isJoinEnabled", "Swift_isJoinedByViewer", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ID", "Kind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsPositionPopularItemPresentation implements Identifiable<ID>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SquadsPositionPopularItemPresentation(ID id, Kind kind, SquadsPopularOriginatorPresentation squadsPopularOriginatorPresentation, List list, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(id, kind, r3, list, str, r6, r7);
        boolean z3;
        SquadsPopularOriginatorPresentation squadsPopularOriginatorPresentation2 = (i & 4) != 0 ? null : squadsPopularOriginatorPresentation;
        boolean z4 = (i & 32) != 0 ? true : z;
        if ((i & 64) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
    }

    private final native long Swift_constructor_0(ID id, Kind kind, SquadsPopularOriginatorPresentation originator, List<SquadsRowMemberPresentation> joinedMembers, String joinedCountText, boolean isJoinEnabled, boolean isJoinedByViewer);

    private final native ID Swift_id(long Swift_peer);

    private final native boolean Swift_isJoinEnabled(long Swift_peer);

    private final native boolean Swift_isJoinedByViewer(long Swift_peer);

    private final native boolean Swift_isequal(SquadsPositionPopularItemPresentation lhs, SquadsPositionPopularItemPresentation rhs);

    private final native String Swift_joinedCountText(long Swift_peer);

    private final native List<SquadsRowMemberPresentation> Swift_joinedMembers(long Swift_peer);

    private final native Kind Swift_kind(long Swift_peer);

    private final native SquadsPopularOriginatorPresentation Swift_originator(long Swift_peer);

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
        if (!(other instanceof SquadsPositionPopularItemPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsPositionPopularItemPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // skip.lib.Identifiable
    public ID getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getJoinedCountText() {
        return Swift_joinedCountText(this.Swift_peer);
    }

    public final List<SquadsRowMemberPresentation> getJoinedMembers() {
        return Swift_joinedMembers(this.Swift_peer);
    }

    public final Kind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final SquadsPopularOriginatorPresentation getOriginator() {
        return Swift_originator(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isJoinEnabled() {
        return Swift_isJoinEnabled(this.Swift_peer);
    }

    public final boolean isJoinedByViewer() {
        return Swift_isJoinedByViewer(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ComboCase", "EventCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID$ComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID$EventCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class ID implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID$ComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ComboCase extends ID {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComboCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ComboCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((ComboCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID$EventCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EventCase extends ID {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof EventCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((EventCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        public /* synthetic */ ID(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID$Companion;", "", "<init>", "()V", "combo", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "associated0", "", "event", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ID combo(String associated0) {
                associated0.getClass();
                return new ComboCase(associated0);
            }

            public final ID event(String associated0) {
                associated0.getClass();
                return new EventCase(associated0);
            }

            private Companion() {
            }
        }

        private ID() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ComboCase", "EventCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind$ComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind$EventCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Kind implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind$ComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "countText", "getCountText", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ComboCase extends Kind {
            private final String associated0;
            private final String countText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComboCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.countText = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ComboCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((ComboCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getCountText() {
                return this.countText;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind$EventCase;", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "associated0", "Lcom/polymarket/usviewmodels/SquadsPopularEventPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsPopularEventPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsPopularEventPresentation;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EventCase extends Kind {
            private final SquadsPopularEventPresentation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventCase(SquadsPopularEventPresentation squadsPopularEventPresentation) {
                super(null);
                squadsPopularEventPresentation.getClass();
                this.associated0 = squadsPopularEventPresentation;
            }

            public boolean equals(Object other) {
                if (!(other instanceof EventCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((EventCase) other).associated0);
            }

            public final SquadsPopularEventPresentation getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Kind(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind$Companion;", "", "<init>", "()V", "combo", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$Kind;", "countText", "", "event", "associated0", "Lcom/polymarket/usviewmodels/SquadsPopularEventPresentation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind combo(String countText) {
                countText.getClass();
                return new ComboCase(countText);
            }

            public final Kind event(SquadsPopularEventPresentation associated0) {
                associated0.getClass();
                return new EventCase(associated0);
            }

            private Companion() {
            }
        }

        private Kind() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ ID getId() {
        return getId();
    }

    public SquadsPositionPopularItemPresentation(ID id, Kind kind, SquadsPopularOriginatorPresentation squadsPopularOriginatorPresentation, List<SquadsRowMemberPresentation> list, String str, boolean z, boolean z2) {
        id.getClass();
        kind.getClass();
        list.getClass();
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(id, kind, squadsPopularOriginatorPresentation, list, str, z, z2);
    }

    public SquadsPositionPopularItemPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
