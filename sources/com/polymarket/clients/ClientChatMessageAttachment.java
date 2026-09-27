package com.polymarket.clients;

import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageAttachment;", "Lskip/lib/Identifiable;", "", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ImageCase", "UserPositionCase", "ImageData", "Companion", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageCase;", "Lcom/polymarket/clients/ClientChatMessageAttachment$UserPositionCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientChatMessageAttachment implements Identifiable<String>, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageAttachment$ImageCase;", "Lcom/polymarket/clients/ClientChatMessageAttachment;", "associated0", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "<init>", "(Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ImageCase extends ClientChatMessageAttachment {
        private final ImageData associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageCase(ImageData imageData) {
            super(null);
            imageData.getClass();
            this.associated0 = imageData;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ImageCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((ImageCase) other).associated0);
        }

        public final ImageData getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageAttachment$UserPositionCase;", "Lcom/polymarket/clients/ClientChatMessageAttachment;", "associated0", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "<init>", "(Lcom/polymarket/clients/ClientChatPositionAttachment;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientChatPositionAttachment;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserPositionCase extends ClientChatMessageAttachment {
        private final ClientChatPositionAttachment associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserPositionCase(ClientChatPositionAttachment clientChatPositionAttachment) {
            super(null);
            clientChatPositionAttachment.getClass();
            this.associated0 = clientChatPositionAttachment;
        }

        public boolean equals(Object other) {
            if (!(other instanceof UserPositionCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((UserPositionCase) other).associated0);
        }

        public final ClientChatPositionAttachment getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    public /* synthetic */ ClientChatMessageAttachment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_id(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0082 ¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageAttachment$Companion;", "", "<init>", "()V", "image", "Lcom/polymarket/clients/ClientChatMessageAttachment;", "associated0", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "userPosition", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "images", "", "in_", "Swift_Companion_images_0", "attachments", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<ImageData> Swift_Companion_images_0(List<? extends ClientChatMessageAttachment> attachments);

        public final ClientChatMessageAttachment image(ImageData associated0) {
            associated0.getClass();
            return new ImageCase(associated0);
        }

        public final List<ImageData> images(List<? extends ClientChatMessageAttachment> in_) {
            in_.getClass();
            return Swift_Companion_images_0(in_);
        }

        public final ClientChatMessageAttachment userPosition(ClientChatPositionAttachment associated0) {
            associated0.getClass();
            return new UserPositionCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientChatMessageAttachment() {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBa\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\n\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001c\u0010)\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010*J\u001c\u0010,\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010*J\u001c\u0010/\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u00100J\u0017\u00102\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J^\u00106\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082 ¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001f\u00109\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082 J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\u0019\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0000H\u0082 J\b\u0010A\u001a\u00020BH\u0016J\u0015\u0010C\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020=0E2\u0006\u0010F\u001a\u00020BH\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020=0E2\u0006\u0010F\u001a\u00020BH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006I"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "url", "Ljava/net/URI;", "thumbnailURL", "width", "", "height", "size", "blurhash", "position", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "(Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Lcom/polymarket/clients/ClientChatPositionAttachment;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getUrl", "()Ljava/net/URI;", "Swift_url", "getThumbnailURL", "Swift_thumbnailURL", "getWidth", "()Ljava/lang/Double;", "Swift_width", "(J)Ljava/lang/Double;", "getHeight", "Swift_height", "getSize", "()Ljava/lang/Long;", "Swift_size", "(J)Ljava/lang/Long;", "getBlurhash", "Swift_blurhash", "getPosition", "()Lcom/polymarket/clients/ClientChatPositionAttachment;", "Swift_position", "Swift_constructor_0", "(Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Lcom/polymarket/clients/ClientChatPositionAttachment;)J", "withPosition", "Swift_withPosition_1", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ImageData implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ ImageData(String str, URI uri, URI uri2, Double d, Double d2, Long l, String str2, ClientChatPositionAttachment clientChatPositionAttachment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uri, (i & 4) != 0 ? null : uri2, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : clientChatPositionAttachment);
        }

        private final native String Swift_blurhash(long Swift_peer);

        private final native long Swift_constructor_0(String id, URI url, URI thumbnailURL, Double width, Double height, Long size, String blurhash, ClientChatPositionAttachment position);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native Double Swift_height(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(ImageData lhs, ImageData rhs);

        private final native ClientChatPositionAttachment Swift_position(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Long Swift_size(long Swift_peer);

        private final native URI Swift_thumbnailURL(long Swift_peer);

        private final native URI Swift_url(long Swift_peer);

        private final native Double Swift_width(long Swift_peer);

        private final native ImageData Swift_withPosition_1(long Swift_peer, ClientChatPositionAttachment position);

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
            if (!(other instanceof ImageData)) {
                return false;
            }
            return Swift_isequal(this, (ImageData) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getBlurhash() {
            return Swift_blurhash(this.Swift_peer);
        }

        public final Double getHeight() {
            return Swift_height(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final ClientChatPositionAttachment getPosition() {
            return Swift_position(this.Swift_peer);
        }

        public final Long getSize() {
            return Swift_size(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final URI getThumbnailURL() {
            return Swift_thumbnailURL(this.Swift_peer);
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

        public final ImageData withPosition(ClientChatPositionAttachment position) {
            return Swift_withPosition_1(this.Swift_peer, position);
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public ImageData(String str, URI uri, URI uri2, Double d, Double d2, Long l, String str2, ClientChatPositionAttachment clientChatPositionAttachment) {
            str.getClass();
            uri.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, uri, uri2, d, d2, l, str2, clientChatPositionAttachment);
        }

        public ImageData(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }
}
