package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction;", "", "<init>", "(Ljava/lang/String;I)V", "ReactionContent", "GiphyStickerData", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatMessageReaction {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientChatMessageReaction[] $VALUES;

    private static final /* synthetic */ ClientChatMessageReaction[] $values() {
        return new ClientChatMessageReaction[0];
    }

    static {
        ClientChatMessageReaction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ClientChatMessageReaction(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientChatMessageReaction valueOf(String str) {
        return (ClientChatMessageReaction) Enum.valueOf(ClientChatMessageReaction.class, str);
    }

    public static ClientChatMessageReaction[] values() {
        return (ClientChatMessageReaction[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "reactionId", "", "getReactionId", "()Ljava/lang/String;", "Swift_reactionId", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "EmojiCase", "RemoteImageCase", "GiphyStickerCase", "Companion", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$EmojiCase;", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$GiphyStickerCase;", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$RemoteImageCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class ReactionContent implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$EmojiCase;", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class EmojiCase extends ReactionContent {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmojiCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof EmojiCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((EmojiCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$GiphyStickerCase;", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "associated0", "Lcom/polymarket/clients/ClientChatMessageReaction$GiphyStickerData;", "<init>", "(Lcom/polymarket/clients/ClientChatMessageReaction$GiphyStickerData;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientChatMessageReaction$GiphyStickerData;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GiphyStickerCase extends ReactionContent {
            private final GiphyStickerData associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GiphyStickerCase(GiphyStickerData giphyStickerData) {
                super(null);
                giphyStickerData.getClass();
                this.associated0 = giphyStickerData;
            }

            public boolean equals(Object other) {
                if (!(other instanceof GiphyStickerCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((GiphyStickerCase) other).associated0);
            }

            public final GiphyStickerData getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$RemoteImageCase;", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class RemoteImageCase extends ReactionContent {
            private final String associated0;
            private final String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteImageCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.id = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof RemoteImageCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((RemoteImageCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        public /* synthetic */ ReactionContent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_reactionId(String className);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getReactionId() {
            return Swift_reactionId(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent$Companion;", "", "<init>", "()V", "emoji", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "associated0", "", "remoteImage", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "giphySticker", "Lcom/polymarket/clients/ClientChatMessageReaction$GiphyStickerData;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ReactionContent emoji(String associated0) {
                associated0.getClass();
                return new EmojiCase(associated0);
            }

            public final ReactionContent giphySticker(GiphyStickerData associated0) {
                associated0.getClass();
                return new GiphyStickerCase(associated0);
            }

            public final ReactionContent remoteImage(String id) {
                id.getClass();
                return new RemoteImageCase(id);
            }

            private Companion() {
            }
        }

        private ReactionContent() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010!\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\"J\u001c\u0010$\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\"J6\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082 ¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u00066"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageReaction$GiphyStickerData;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "giphyId", "", "url", "Ljava/net/URI;", "width", "", "height", "(Ljava/lang/String;Ljava/net/URI;Ljava/lang/Double;Ljava/lang/Double;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getGiphyId", "()Ljava/lang/String;", "Swift_giphyId", "getUrl", "()Ljava/net/URI;", "Swift_url", "getWidth", "()Ljava/lang/Double;", "Swift_width", "(J)Ljava/lang/Double;", "getHeight", "Swift_height", "Swift_constructor_0", "(Ljava/lang/String;Ljava/net/URI;Ljava/lang/Double;Ljava/lang/Double;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GiphyStickerData implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public GiphyStickerData(String str, URI uri, Double d, Double d2) {
            str.getClass();
            uri.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, uri, d, d2);
        }

        private final native long Swift_constructor_0(String giphyId, URI url, Double width, Double height);

        private final native String Swift_giphyId(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native Double Swift_height(long Swift_peer);

        private final native boolean Swift_isequal(GiphyStickerData lhs, GiphyStickerData rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native URI Swift_url(long Swift_peer);

        private final native Double Swift_width(long Swift_peer);

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
            if (!(other instanceof GiphyStickerData)) {
                return false;
            }
            return Swift_isequal(this, (GiphyStickerData) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getGiphyId() {
            return Swift_giphyId(this.Swift_peer);
        }

        public final Double getHeight() {
            return Swift_height(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final URI getUrl() {
            return Swift_url(this.Swift_peer);
        }

        public final Double getWidth() {
            return Swift_width(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public GiphyStickerData(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ GiphyStickerData(String str, URI uri, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uri, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2);
        }
    }
}
