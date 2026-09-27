package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APICompetitionPromo;
import com.polymarket.data.EPromotionCampaign;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.jbf;
import defpackage.k84;
import defpackage.l7f;
import defpackage.woa;
import io.intercom.android.sdk.metrics.MetricTracker;
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
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 .2\u00020\u0001:\u000b$%&'()*+,-.B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0016\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u001d\u0010\u001d\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0082 R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;)V", "visibleItems", "", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "getVisibleItems", "()Ljava/util/List;", "Swift_visibleItems", "hasContent", "", "getHasContent", "()Z", "Swift_hasContent", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Item", "DayPill", "OfferPresentation", "InviteFriendsPresentation", "ReminderPresentation", "ProgressPresentation", "LeaderboardPromoPresentation", "LeaderboardRankingPresentation", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PromotionsViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, null, 31, null) : callbacks);
    }

    private final native boolean Swift_hasContent(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native List<Item> Swift_visibleItems(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getHasContent() {
        return Swift_hasContent(getSwift_peer());
    }

    public final List<Item> getVisibleItems() {
        return Swift_visibleItems(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003,-.B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\b\u0010%\u001a\u00020&H\u0016J\u0015\u0010'\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020!0)2\u0006\u0010*\u001a\u00020&H\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020!0)2\u0006\u0010*\u001a\u00020&H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "Lskip/lib/Identifiable;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "variant", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "Swift_id", "getVariant", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "Swift_variant", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Variant", "ID", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Item implements Identifiable<ID>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Item(ID id, Variant variant) {
            id.getClass();
            variant.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(id, variant);
        }

        private final native long Swift_constructor_0(ID id, Variant variant);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native ID Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Item lhs, Item rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Variant Swift_variant(long Swift_peer);

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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.Identifiable
        public ID getId() {
            return Swift_id(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Variant getVariant() {
            return Swift_variant(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CampaignCase", "CompetitionCase", "InviteFriendsCase", "Companion", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$CampaignCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$CompetitionCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$InviteFriendsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static abstract class ID implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final ID inviteFriends = new InviteFriendsCase();

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$CampaignCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class CampaignCase extends ID {
                private final String associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CampaignCase(String str) {
                    super(null);
                    str.getClass();
                    this.associated0 = str;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof CampaignCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((CampaignCase) other).associated0);
                }

                public final String getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$CompetitionCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class CompetitionCase extends ID {
                private final String associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CompetitionCase(String str) {
                    super(null);
                    str.getClass();
                    this.associated0 = str;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof CompetitionCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((CompetitionCase) other).associated0);
                }

                public final String getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$InviteFriendsCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class InviteFriendsCase extends ID {
                public InviteFriendsCase() {
                    super(null);
                }
            }

            public /* synthetic */ ID(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static final /* synthetic */ ID access$getInviteFriends$cp() {
                return inviteFriends;
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID$Companion;", "", "<init>", "()V", "campaign", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "associated0", "", "competition", "inviteFriends", "getInviteFriends", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$ID;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ID campaign(String associated0) {
                    associated0.getClass();
                    return new CampaignCase(associated0);
                }

                public final ID competition(String associated0) {
                    associated0.getClass();
                    return new CompetitionCase(associated0);
                }

                public final ID getInviteFriends() {
                    return ID.access$getInviteFriends$cp();
                }

                private Companion() {
                }
            }

            private ID() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OfferCase", "ReminderCase", "ProgressCase", "LeaderboardPromoCase", "LeaderboardRankingCase", "InviteFriendsCase", "Companion", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$InviteFriendsCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$LeaderboardPromoCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$LeaderboardRankingCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$OfferCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$ProgressCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$ReminderCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static abstract class Variant implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$InviteFriendsCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$InviteFriendsPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$InviteFriendsPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$InviteFriendsPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class InviteFriendsCase extends Variant {
                private final InviteFriendsPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public InviteFriendsCase(InviteFriendsPresentation inviteFriendsPresentation) {
                    super(null);
                    inviteFriendsPresentation.getClass();
                    this.associated0 = inviteFriendsPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof InviteFriendsCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((InviteFriendsCase) other).associated0);
                }

                public final InviteFriendsPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$LeaderboardPromoCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardPromoPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardPromoPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardPromoPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class LeaderboardPromoCase extends Variant {
                private final LeaderboardPromoPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeaderboardPromoCase(LeaderboardPromoPresentation leaderboardPromoPresentation) {
                    super(null);
                    leaderboardPromoPresentation.getClass();
                    this.associated0 = leaderboardPromoPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof LeaderboardPromoCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((LeaderboardPromoCase) other).associated0);
                }

                public final LeaderboardPromoPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$LeaderboardRankingCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardRankingPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardRankingPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardRankingPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class LeaderboardRankingCase extends Variant {
                private final LeaderboardRankingPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeaderboardRankingCase(LeaderboardRankingPresentation leaderboardRankingPresentation) {
                    super(null);
                    leaderboardRankingPresentation.getClass();
                    this.associated0 = leaderboardRankingPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof LeaderboardRankingCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((LeaderboardRankingCase) other).associated0);
                }

                public final LeaderboardRankingPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$OfferCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class OfferCase extends Variant {
                private final OfferPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OfferCase(OfferPresentation offerPresentation) {
                    super(null);
                    offerPresentation.getClass();
                    this.associated0 = offerPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof OfferCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((OfferCase) other).associated0);
                }

                public final OfferPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$ProgressCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$ProgressPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$ProgressPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$ProgressPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class ProgressCase extends Variant {
                private final ProgressPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProgressCase(ProgressPresentation progressPresentation) {
                    super(null);
                    progressPresentation.getClass();
                    this.associated0 = progressPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof ProgressCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((ProgressCase) other).associated0);
                }

                public final ProgressPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$ReminderCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$ReminderPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$ReminderPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$ReminderPresentation;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class ReminderCase extends Variant {
                private final ReminderPresentation associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ReminderCase(ReminderPresentation reminderPresentation) {
                    super(null);
                    reminderPresentation.getClass();
                    this.associated0 = reminderPresentation;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof ReminderCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((ReminderCase) other).associated0);
                }

                public final ReminderPresentation getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            public /* synthetic */ Variant(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant$Companion;", "", "<init>", "()V", "offer", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item$Variant;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "reminder", "Lcom/polymarket/usviewmodels/PromotionsViewModel$ReminderPresentation;", "progress", "Lcom/polymarket/usviewmodels/PromotionsViewModel$ProgressPresentation;", "leaderboardPromo", "Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardPromoPresentation;", "leaderboardRanking", "Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardRankingPresentation;", "inviteFriends", "Lcom/polymarket/usviewmodels/PromotionsViewModel$InviteFriendsPresentation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Variant inviteFriends(InviteFriendsPresentation associated0) {
                    associated0.getClass();
                    return new InviteFriendsCase(associated0);
                }

                public final Variant leaderboardPromo(LeaderboardPromoPresentation associated0) {
                    associated0.getClass();
                    return new LeaderboardPromoCase(associated0);
                }

                public final Variant leaderboardRanking(LeaderboardRankingPresentation associated0) {
                    associated0.getClass();
                    return new LeaderboardRankingCase(associated0);
                }

                public final Variant offer(OfferPresentation associated0) {
                    associated0.getClass();
                    return new OfferCase(associated0);
                }

                public final Variant progress(ProgressPresentation associated0) {
                    associated0.getClass();
                    return new ProgressCase(associated0);
                }

                public final Variant reminder(ReminderPresentation associated0) {
                    associated0.getClass();
                    return new ReminderCase(associated0);
                }

                private Companion() {
                }
            }

            private Variant() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ ID getId() {
            return getId();
        }

        public Item(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAppearCase", "OnDisappearCase", "OnDataUpdatedCase", "OnRefreshCase", "OnItemActionCase", "OnHubTappedCase", "Companion", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnHubTappedCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnItemActionCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnRefreshCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAppear = new OnAppearCase();
        private static final Input onDisappear = new OnDisappearCase();
        private static final Input onDataUpdated = new OnDataUpdatedCase();
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onHubTapped = new OnHubTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDataUpdatedCase extends Input {
            public OnDataUpdatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDisappearCase extends Input {
            public OnDisappearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnHubTappedCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHubTappedCase extends Input {
            public OnHubTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnItemActionCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnItemActionCase extends Input {
            private final Item associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnItemActionCase(Item item) {
                super(null);
                item.getClass();
                this.associated0 = item;
            }

            public final Item getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAppear$cp() {
            return onAppear;
        }

        public static final /* synthetic */ Input access$getOnDataUpdated$cp() {
            return onDataUpdated;
        }

        public static final /* synthetic */ Input access$getOnDisappear$cp() {
            return onDisappear;
        }

        public static final /* synthetic */ Input access$getOnHubTapped$cp() {
            return onHubTapped;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Input$Companion;", "", "<init>", "()V", "onAppear", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "getOnAppear", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Input;", "onDisappear", "getOnDisappear", "onDataUpdated", "getOnDataUpdated", "onRefresh", "getOnRefresh", "onItemAction", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "onHubTapped", "getOnHubTapped", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnDataUpdated() {
                return Input.access$getOnDataUpdated$cp();
            }

            public final Input getOnDisappear() {
                return Input.access$getOnDisappear$cp();
            }

            public final Input getOnHubTapped() {
                return Input.access$getOnHubTapped$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input onItemAction(Item associated0) {
                associated0.getClass();
                return new OnItemActionCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0011\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0082 J$\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0082 ¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "appliedCodeToastText", "", "for_", "Swift_Companion_appliedCodeToastText_3", "enteredCode", "mock", "Lcom/polymarket/usviewmodels/PromotionsViewModel;", "withOfferCampaign", "", "withReminderCampaign", "withProgressCampaign", "Swift_Companion_mock_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_appliedCodeToastText_3(String enteredCode);

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native PromotionsViewModel Swift_Companion_mock_4(boolean withOfferCampaign, boolean withReminderCampaign, boolean withProgressCampaign);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public static /* synthetic */ PromotionsViewModel mock$default(Companion companion, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            return companion.mock(z, z2, z3);
        }

        public final String appliedCodeToastText(String for_) {
            for_.getClass();
            return Swift_Companion_appliedCodeToastText_3(for_);
        }

        public final PromotionsViewModel mock(boolean withOfferCampaign, boolean withReminderCampaign, boolean withProgressCampaign) {
            return Swift_Companion_mock_4(withOfferCampaign, withReminderCampaign, withProgressCampaign);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J7\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardPromoPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eyebrow", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "imageURL", "Ljava/net/URI;", "lightForeground", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getEyebrow", "()Ljava/lang/String;", "Swift_eyebrow", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "getLightForeground", "()Z", "Swift_lightForeground", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LeaderboardPromoPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public LeaderboardPromoPresentation(String str, String str2, String str3, URI uri, boolean z) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, z);
        }

        private final native long Swift_constructor_0(String eyebrow, String title, String subtitle, URI imageURL, boolean lightForeground);

        private final native String Swift_eyebrow(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isequal(LeaderboardPromoPresentation lhs, LeaderboardPromoPresentation rhs);

        private final native boolean Swift_lightForeground(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof LeaderboardPromoPresentation)) {
                return false;
            }
            return Swift_isequal(this, (LeaderboardPromoPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getEyebrow() {
            return Swift_eyebrow(this.Swift_peer);
        }

        public final URI getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final boolean getLightForeground() {
            return Swift_lightForeground(this.Swift_peer);
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
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public LeaderboardPromoPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ LeaderboardPromoPresentation(String str, String str2, String str3, URI uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : uri, z);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JI\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u0013\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\b\u00104\u001a\u000205H\u0016J\u0015\u00106\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000200082\u0006\u00109\u001a\u000205H\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000200082\u0006\u00109\u001a\u000205H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$LeaderboardRankingPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "username", "userID", "rankLine", "avatarURL", "Ljava/net/URI;", "imageURL", "lightForeground", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTitle", "()Ljava/lang/String;", "Swift_title", "getUsername", "Swift_username", "getUserID", "Swift_userID", "getRankLine", "Swift_rankLine", "getAvatarURL", "()Ljava/net/URI;", "Swift_avatarURL", "getImageURL", "Swift_imageURL", "getLightForeground", "()Z", "Swift_lightForeground", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LeaderboardRankingPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public LeaderboardRankingPresentation(String str, String str2, String str3, String str4, URI uri, URI uri2, boolean z) {
            woa.A(str, str2, str3, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, uri, uri2, z);
        }

        private final native URI Swift_avatarURL(long Swift_peer);

        private final native long Swift_constructor_0(String title, String username, String userID, String rankLine, URI avatarURL, URI imageURL, boolean lightForeground);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isequal(LeaderboardRankingPresentation lhs, LeaderboardRankingPresentation rhs);

        private final native boolean Swift_lightForeground(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_rankLine(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native String Swift_userID(long Swift_peer);

        private final native String Swift_username(long Swift_peer);

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
            if (!(other instanceof LeaderboardRankingPresentation)) {
                return false;
            }
            return Swift_isequal(this, (LeaderboardRankingPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final URI getAvatarURL() {
            return Swift_avatarURL(this.Swift_peer);
        }

        public final URI getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final boolean getLightForeground() {
            return Swift_lightForeground(this.Swift_peer);
        }

        public final String getRankLine() {
            return Swift_rankLine(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final String getUserID() {
            return Swift_userID(this.Swift_peer);
        }

        public final String getUsername() {
            return Swift_username(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public LeaderboardRankingPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ LeaderboardRankingPresentation(String str, String str2, String str3, String str4, URI uri, URI uri2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : uri, (i & 32) != 0 ? null : uri2, z);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB?\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JA\u0010,\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\b\u00103\u001a\u000204H\u0016J\u0015\u00105\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020/072\u0006\u00108\u001a\u000204H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020/072\u0006\u00108\u001a\u000204H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eyebrow", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "imageURL", "Ljava/net/URI;", "lightForeground", "", "referrer", "Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation$Referrer;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;ZLcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation$Referrer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getEyebrow", "()Ljava/lang/String;", "Swift_eyebrow", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "getLightForeground", "()Z", "Swift_lightForeground", "getReferrer", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation$Referrer;", "Swift_referrer", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Referrer", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class OfferPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public OfferPresentation(String str, String str2, String str3, URI uri, boolean z, Referrer referrer) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, z, referrer);
        }

        private final native long Swift_constructor_0(String eyebrow, String title, String subtitle, URI imageURL, boolean lightForeground, Referrer referrer);

        private final native String Swift_eyebrow(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isequal(OfferPresentation lhs, OfferPresentation rhs);

        private final native boolean Swift_lightForeground(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Referrer Swift_referrer(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof OfferPresentation)) {
                return false;
            }
            return Swift_isequal(this, (OfferPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getEyebrow() {
            return Swift_eyebrow(this.Swift_peer);
        }

        public final URI getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final boolean getLightForeground() {
            return Swift_lightForeground(this.Swift_peer);
        }

        public final Referrer getReferrer() {
            return Swift_referrer(this.Swift_peer);
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
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public OfferPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020(H\u0016J\u0015\u0010)\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation$Referrer;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "invitedByText", "", "username", "avatarURL", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getInvitedByText", "()Ljava/lang/String;", "Swift_invitedByText", "getUsername", "Swift_username", "getAvatarURL", "()Ljava/net/URI;", "Swift_avatarURL", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Referrer implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Referrer(String str, String str2, URI uri) {
                str.getClass();
                str2.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2, uri);
            }

            private final native URI Swift_avatarURL(long Swift_peer);

            private final native long Swift_constructor_0(String invitedByText, String username, URI avatarURL);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native String Swift_invitedByText(long Swift_peer);

            private final native boolean Swift_isequal(Referrer lhs, Referrer rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_username(long Swift_peer);

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
                if (!(other instanceof Referrer)) {
                    return false;
                }
                return Swift_isequal(this, (Referrer) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final URI getAvatarURL() {
                return Swift_avatarURL(this.Swift_peer);
            }

            public final String getInvitedByText() {
                return Swift_invitedByText(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getUsername() {
                return Swift_username(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public Referrer(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public /* synthetic */ OfferPresentation(String str, String str2, String str3, URI uri, boolean z, Referrer referrer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, uri, z, (i & 32) != 0 ? null : referrer);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J1\u0010\"\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\b\u0010*\u001a\u00020+H\u0016J\u0015\u0010,\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$InviteFriendsPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "progressText", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "imageURL", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getProgressText", "()Ljava/lang/String;", "Swift_progressText", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InviteFriendsPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public InviteFriendsPresentation(String str, String str2, String str3, URI uri) {
            str2.getClass();
            str3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, uri);
        }

        private final native long Swift_constructor_0(String progressText, String title, String subtitle, URI imageURL);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isequal(InviteFriendsPresentation lhs, InviteFriendsPresentation rhs);

        private final native String Swift_progressText(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof InviteFriendsPresentation)) {
                return false;
            }
            return Swift_isequal(this, (InviteFriendsPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final URI getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final String getProgressText() {
            return Swift_progressText(this.Swift_peer);
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
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public InviteFriendsPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBK\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JM\u0010.\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\b\u00106\u001a\u000207H\u0016J\u0015\u00108\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$ProgressPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eyebrow", "", "dayProgressText", "streakText", "earnedText", "earnedSuffix", "days", "", "Lcom/polymarket/usviewmodels/PromotionsViewModel$DayPill;", "deadline", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getEyebrow", "()Ljava/lang/String;", "Swift_eyebrow", "getDayProgressText", "Swift_dayProgressText", "getStreakText", "Swift_streakText", "getEarnedText", "Swift_earnedText", "getEarnedSuffix", "Swift_earnedSuffix", "getDays", "()Ljava/util/List;", "Swift_days", "getDeadline", "()Ljava/util/Date;", "Swift_deadline", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProgressPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ProgressPresentation(String str, String str2, String str3, String str4, String str5, List<DayPill> list, Date date) {
            k84.p(str, str2, str3, str4, str5);
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5, list, date);
        }

        private final native long Swift_constructor_0(String eyebrow, String dayProgressText, String streakText, String earnedText, String earnedSuffix, List<DayPill> days, Date deadline);

        private final native String Swift_dayProgressText(long Swift_peer);

        private final native List<DayPill> Swift_days(long Swift_peer);

        private final native Date Swift_deadline(long Swift_peer);

        private final native String Swift_earnedSuffix(long Swift_peer);

        private final native String Swift_earnedText(long Swift_peer);

        private final native String Swift_eyebrow(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(ProgressPresentation lhs, ProgressPresentation rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_streakText(long Swift_peer);

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
            if (!(other instanceof ProgressPresentation)) {
                return false;
            }
            return Swift_isequal(this, (ProgressPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDayProgressText() {
            return Swift_dayProgressText(this.Swift_peer);
        }

        public final List<DayPill> getDays() {
            return Swift_days(this.Swift_peer);
        }

        public final Date getDeadline() {
            return Swift_deadline(this.Swift_peer);
        }

        public final String getEarnedSuffix() {
            return Swift_earnedSuffix(this.Swift_peer);
        }

        public final String getEarnedText() {
            return Swift_earnedText(this.Swift_peer);
        }

        public final String getEyebrow() {
            return Swift_eyebrow(this.Swift_peer);
        }

        public final String getStreakText() {
            return Swift_streakText(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public ProgressPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ ProgressPresentation(String str, String str2, String str3, String str4, String str5, List list, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, list, (i & 64) != 0 ? null : date);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public PromotionsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020(H\u0016J\u0015\u0010)\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$DayPill;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "label", "", "dateText", "state", "Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getLabel", "()Ljava/lang/String;", "Swift_label", "getDateText", "Swift_dateText", "getState", "()Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "Swift_state", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DayPill implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public DayPill(String str, String str2, EPromotionCampaign.BonusDay.State state) {
            str.getClass();
            str2.getClass();
            state.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, state);
        }

        private final native long Swift_constructor_0(String label, String dateText, EPromotionCampaign.BonusDay.State state);

        private final native String Swift_dateText(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(DayPill lhs, DayPill rhs);

        private final native String Swift_label(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native EPromotionCampaign.BonusDay.State Swift_state(long Swift_peer);

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
            if (!(other instanceof DayPill)) {
                return false;
            }
            return Swift_isequal(this, (DayPill) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDateText() {
            return Swift_dateText(this.Swift_peer);
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
        }

        public final EPromotionCampaign.BonusDay.State getState() {
            return Swift_state(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public DayPill(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JE\u0010+\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\b\u00103\u001a\u000204H\u0016J\u0015\u00105\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020/072\u0006\u00108\u001a\u000204H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020/072\u0006\u00108\u001a\u000204H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$ReminderPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eyebrow", "", "dayProgressText", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "days", "", "Lcom/polymarket/usviewmodels/PromotionsViewModel$DayPill;", "deadline", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getEyebrow", "()Ljava/lang/String;", "Swift_eyebrow", "getDayProgressText", "Swift_dayProgressText", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getDays", "()Ljava/util/List;", "Swift_days", "getDeadline", "()Ljava/util/Date;", "Swift_deadline", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ReminderPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ReminderPresentation(String str, String str2, String str3, String str4, List<DayPill> list, Date date) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, list, date);
        }

        private final native long Swift_constructor_0(String eyebrow, String dayProgressText, String title, String subtitle, List<DayPill> days, Date deadline);

        private final native String Swift_dayProgressText(long Swift_peer);

        private final native List<DayPill> Swift_days(long Swift_peer);

        private final native Date Swift_deadline(long Swift_peer);

        private final native String Swift_eyebrow(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(ReminderPresentation lhs, ReminderPresentation rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof ReminderPresentation)) {
                return false;
            }
            return Swift_isequal(this, (ReminderPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDayProgressText() {
            return Swift_dayProgressText(this.Swift_peer);
        }

        public final List<DayPill> getDays() {
            return Swift_days(this.Swift_peer);
        }

        public final Date getDeadline() {
            return Swift_deadline(this.Swift_peer);
        }

        public final String getEyebrow() {
            return Swift_eyebrow(this.Swift_peer);
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
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public ReminderPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ ReminderPresentation(String str, String str2, String str3, String str4, List list, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, (i & 32) != 0 ? null : date);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBe\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\rJ\u0015\u0010\u001a\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J!\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J_\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\u0006\u0010/\u001a\u00020 H\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\u0006\u0010/\u001a\u00020 H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010'¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCampaignDetail", "Lkotlin/Function1;", "Lcom/polymarket/data/EPromotionCampaign;", "", "onCompetitionDetail", "Lcom/polymarket/data/APICompetitionPromo;", "onDeposit", "Lkotlin/Function0;", "onInviteFriends", "onPromotionsHub", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCampaignDetail", "()Lkotlin/jvm/functions/Function1;", "Swift_onCampaignDetail", "getOnCompetitionDetail", "Swift_onCompetitionDetail", "getOnDeposit", "()Lkotlin/jvm/functions/Function0;", "Swift_onDeposit", "getOnInviteFriends", "Swift_onInviteFriends", "getOnPromotionsHub", "Swift_onPromotionsHub", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new l7f(26) : function1, (i & 2) != 0 ? new l7f(27) : function12, (i & 4) != 0 ? new jbf(6) : function0, (i & 8) != 0 ? new jbf(7) : function02, (i & 16) != 0 ? new jbf(8) : function03);
        }

        private final native long Swift_constructor_0(Function1<? super EPromotionCampaign, Unit> onCampaignDetail, Function1<? super APICompetitionPromo, Unit> onCompetitionDetail, Function0<Unit> onDeposit, Function0<Unit> onInviteFriends, Function0<Unit> onPromotionsHub);

        private final native Function1<EPromotionCampaign, Unit> Swift_onCampaignDetail(long Swift_peer);

        private final native Function1<APICompetitionPromo, Unit> Swift_onCompetitionDetail(long Swift_peer);

        private final native Function0<Unit> Swift_onDeposit(long Swift_peer);

        private final native Function0<Unit> Swift_onInviteFriends(long Swift_peer);

        private final native Function0<Unit> Swift_onPromotionsHub(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EPromotionCampaign ePromotionCampaign) {
            ePromotionCampaign.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(APICompetitionPromo aPICompetitionPromo) {
            aPICompetitionPromo.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit b(APICompetitionPromo aPICompetitionPromo) {
            return _init_$lambda$1(aPICompetitionPromo);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit e(EPromotionCampaign ePromotionCampaign) {
            return _init_$lambda$0(ePromotionCampaign);
        }

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

        public final Function1<EPromotionCampaign, Unit> getOnCampaignDetail() {
            return Swift_onCampaignDetail(this.Swift_peer);
        }

        public final Function1<APICompetitionPromo, Unit> getOnCompetitionDetail() {
            return Swift_onCompetitionDetail(this.Swift_peer);
        }

        public final Function0<Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
        }

        public final Function0<Unit> getOnInviteFriends() {
            return Swift_onInviteFriends(this.Swift_peer);
        }

        public final Function0<Unit> getOnPromotionsHub() {
            return Swift_onPromotionsHub(this.Swift_peer);
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

        public Callbacks(Function1<? super EPromotionCampaign, Unit> function1, Function1<? super APICompetitionPromo, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            function1.getClass();
            function12.getClass();
            function0.getClass();
            function02.getClass();
            function03.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function0, function02, function03);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
