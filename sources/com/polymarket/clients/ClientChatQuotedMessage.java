package com.polymarket.clients;

import com.polymarket.clients.ClientChatMessageAttachment;
import com.polymarket.data.EChatReaction;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002opB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBo\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\t\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\t\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u001fJ\u0006\u0010$\u001a\u00020%J\u0015\u0010&\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010)\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00108\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010?\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010@\u001a\u0004\u0018\u00010\u0019H\u0082 Je\u0010A\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0015\u0010F\u001a\u00020C2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010K\u001a\u00020H2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010L\u001a\u0004\u0018\u00010M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0011J%\u0010P\u001a\u0004\u0018\u00010M2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0\u0011H\u0082 J\u0015\u0010T\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010U\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010V\u001a\u00020\u001cH\u0082 J\u0015\u0010W\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001e\u001a\u00020\u0001H\u0082 J\b\u0010c\u001a\u00020\u0001H\u0016J\u0013\u0010d\u001a\u00020\u00172\b\u0010e\u001a\u0004\u0018\u00010ZH\u0096\u0002J\u0019\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u0000H\u0082 J\b\u0010i\u001a\u00020CH\u0016J\u0015\u0010j\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020Z0l2\u0006\u0010m\u001a\u00020CH\u0016J\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020Z0l2\u0006\u0010m\u001a\u00020CH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118F¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u00107R(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u00109\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010R\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010(R(\u0010X\u001a\u0010\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020%\u0018\u00010YX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010_\u001a\u00020CX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010E\"\u0004\ba\u0010b¨\u0006q"}, d2 = {"Lcom/polymarket/clients/ClientChatQuotedMessage;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "author", "Lcom/polymarket/clients/ClientChatUser;", "text", "images", "", "Lcom/polymarket/clients/ClientChatMessageAttachment$ImageData;", "customImageIds", "positionAttachment", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "isDeleted", "", "authorPositionSnapshot", "Lcom/polymarket/clients/ClientChatPositionSnapshot;", "(Ljava/lang/String;Lcom/polymarket/clients/ClientChatUser;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/polymarket/clients/ClientChatPositionAttachment;ZLcom/polymarket/clients/ClientChatPositionSnapshot;)V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/clients/ClientChatMessage;", "(Lcom/polymarket/clients/ClientChatMessage;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getAuthor", "()Lcom/polymarket/clients/ClientChatUser;", "Swift_author", "getText", "Swift_text", "getImages", "()Ljava/util/List;", "Swift_images", "getCustomImageIds", "Swift_customImageIds", "getPositionAttachment", "()Lcom/polymarket/clients/ClientChatPositionAttachment;", "Swift_positionAttachment", "()Z", "Swift_isDeleted", "newValue", "getAuthorPositionSnapshot", "()Lcom/polymarket/clients/ClientChatPositionSnapshot;", "setAuthorPositionSnapshot", "(Lcom/polymarket/clients/ClientChatPositionSnapshot;)V", "Swift_authorPositionSnapshot", "Swift_authorPositionSnapshot_set", "value", "Swift_constructor_0", "imageCount", "", "getImageCount", "()I", "Swift_imageCount", "previewKind", "Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind;", "getPreviewKind", "()Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind;", "Swift_previewKind", "stickerURL", "Ljava/net/URI;", "in_", "Lcom/polymarket/data/EChatReaction;", "Swift_stickerURL_1", "reactions", "previewText", "getPreviewText", "Swift_previewText", "Swift_constructor_2", "message", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "PreviewKind", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatQuotedMessage implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ ClientChatQuotedMessage(String str, ClientChatUser clientChatUser, String str2, List list, List list2, ClientChatPositionAttachment clientChatPositionAttachment, boolean z, ClientChatPositionSnapshot clientChatPositionSnapshot, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : clientChatUser, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : clientChatPositionAttachment, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : clientChatPositionSnapshot);
    }

    private final native ClientChatUser Swift_author(long Swift_peer);

    private final native ClientChatPositionSnapshot Swift_authorPositionSnapshot(long Swift_peer);

    private final native void Swift_authorPositionSnapshot_set(long Swift_peer, ClientChatPositionSnapshot value);

    private final native long Swift_constructor_0(String id, ClientChatUser author, String text, List<ClientChatMessageAttachment.ImageData> images, List<String> customImageIds, ClientChatPositionAttachment positionAttachment, boolean isDeleted, ClientChatPositionSnapshot authorPositionSnapshot);

    private final native long Swift_constructor_2(ClientChatMessage message);

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native List<String> Swift_customImageIds(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native int Swift_imageCount(long Swift_peer);

    private final native List<ClientChatMessageAttachment.ImageData> Swift_images(long Swift_peer);

    private final native boolean Swift_isDeleted(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatQuotedMessage lhs, ClientChatQuotedMessage rhs);

    private final native ClientChatPositionAttachment Swift_positionAttachment(long Swift_peer);

    private final native PreviewKind Swift_previewKind(long Swift_peer);

    private final native String Swift_previewText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native URI Swift_stickerURL_1(long Swift_peer, List<EChatReaction> reactions);

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

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientChatQuotedMessage)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatQuotedMessage) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final ClientChatUser getAuthor() {
        return Swift_author(this.Swift_peer);
    }

    public final ClientChatPositionSnapshot getAuthorPositionSnapshot() {
        return Swift_authorPositionSnapshot(this.Swift_peer);
    }

    public final List<String> getCustomImageIds() {
        return Swift_customImageIds(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final int getImageCount() {
        return Swift_imageCount(this.Swift_peer);
    }

    public final List<ClientChatMessageAttachment.ImageData> getImages() {
        return Swift_images(this.Swift_peer);
    }

    public final ClientChatPositionAttachment getPositionAttachment() {
        return Swift_positionAttachment(this.Swift_peer);
    }

    public final PreviewKind getPreviewKind() {
        return Swift_previewKind(this.Swift_peer);
    }

    public final String getPreviewText() {
        return Swift_previewText(this.Swift_peer);
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

    public final String getText() {
        return Swift_text(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isDeleted() {
        return Swift_isDeleted(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientChatQuotedMessage(this);
    }

    public final void setAuthorPositionSnapshot(ClientChatPositionSnapshot clientChatPositionSnapshot) {
        ClientChatPositionSnapshot clientChatPositionSnapshot2 = (ClientChatPositionSnapshot) StructKt.sref$default(clientChatPositionSnapshot, null, 1, null);
        willmutate();
        try {
            Swift_authorPositionSnapshot_set(this.Swift_peer, clientChatPositionSnapshot2);
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

    public final URI stickerURL(List<EChatReaction> in_) {
        in_.getClass();
        return Swift_stickerURL_1(this.Swift_peer, in_);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "text", "position", "image", "sticker", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PreviewKind implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PreviewKind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final PreviewKind text = new PreviewKind("text", 0, "text", null, 2, null);
        public static final PreviewKind position = new PreviewKind("position", 1, "position", null, 2, null);
        public static final PreviewKind image = new PreviewKind("image", 2, "image", null, 2, null);
        public static final PreviewKind sticker = new PreviewKind("sticker", 3, "sticker", null, 2, null);

        private static final /* synthetic */ PreviewKind[] $values() {
            return new PreviewKind[]{text, position, image, sticker};
        }

        static {
            PreviewKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ PreviewKind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PreviewKind valueOf(String str) {
            return (PreviewKind) Enum.valueOf(PreviewKind.class, str);
        }

        public static PreviewKind[] values() {
            return (PreviewKind[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PreviewKind init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1890252483:
                        if (!rawValue.equals("sticker")) {
                            return null;
                        }
                        return PreviewKind.sticker;
                    case 3556653:
                        if (rawValue.equals("text")) {
                            return PreviewKind.text;
                        }
                        return null;
                    case 100313435:
                        if (rawValue.equals("image")) {
                            return PreviewKind.image;
                        }
                        return null;
                    case 747804969:
                        if (rawValue.equals("position")) {
                            return PreviewKind.position;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private PreviewKind(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientChatQuotedMessage$Companion;", "", "<init>", "()V", "PreviewKind", "Lcom/polymarket/clients/ClientChatQuotedMessage$PreviewKind;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreviewKind PreviewKind(String rawValue) {
            rawValue.getClass();
            return PreviewKind.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public ClientChatQuotedMessage(String str, ClientChatUser clientChatUser, String str2, List<ClientChatMessageAttachment.ImageData> list, List<String> list2, ClientChatPositionAttachment clientChatPositionAttachment, boolean z, ClientChatPositionSnapshot clientChatPositionSnapshot) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, clientChatUser, str2, list, list2, clientChatPositionAttachment, z, clientChatPositionSnapshot);
    }

    public ClientChatQuotedMessage(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public ClientChatQuotedMessage(ClientChatMessage clientChatMessage) {
        clientChatMessage.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(clientChatMessage);
    }

    private ClientChatQuotedMessage(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }
}
