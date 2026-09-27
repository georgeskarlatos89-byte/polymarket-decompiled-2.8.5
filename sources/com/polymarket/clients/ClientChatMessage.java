package com.polymarket.clients;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientChatMessageReaction;
import com.polymarket.clients.ClientChatUser;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.foundation.UUID;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBé\u0001\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\"\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0018¢\u0006\u0004\b\u000b\u0010+B\u0011\b\u0012\u0012\u0006\u0010,\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010-J\u0006\u00102\u001a\u000203J\u0015\u00104\u001a\u0002032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0015\u00107\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010:\u001a\u00020\u000f2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010\u00112\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010@\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010E\u001a\u00020\u00162\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010S\u001a\u0002032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010T\u001a\u0004\u0018\u00010\u001eH\u0082 J\u0015\u0010W\u001a\u00020 2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010Y\u001a\u00020\"2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010[\u001a\u0004\u0018\u00010\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010\\\u001a\u00020\"2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010c\u001a\u0004\u0018\u00010'2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010d\u001a\u0002032\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010T\u001a\u0004\u0018\u00010'H\u0082 J\u001b\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010h\u001a\b\u0012\u0004\u0012\u00020*0\u00182\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 JÑ\u0001\u0010i\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00182\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0018H\u0082 J\u0015\u0010j\u001a\u00060\u0007j\u0002`\b2\u0006\u0010,\u001a\u00020\u0003H\u0082 J\b\u0010x\u001a\u00020\u0003H\u0016J\u0013\u0010y\u001a\u00020\"2\b\u0010z\u001a\u0004\u0018\u00010mH\u0096\u0002J\u0019\u0010{\u001a\u00020\"2\u0006\u0010|\u001a\u00020\u00002\u0006\u0010}\u001a\u00020\u0000H\u0082 J\b\u0010~\u001a\u00020sH\u0016J\u0015\u0010\u007f\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0019\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020m0\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020sH\u0016J\u001a\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020m0\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020sH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188F¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bK\u00106R(\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010M\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010XR\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bZ\u0010?R\u0011\u0010$\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b$\u0010XR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188F¢\u0006\u0006\u001a\u0004\b]\u0010GR(\u0010&\u001a\u0004\u0018\u00010'2\b\u0010M\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00188F¢\u0006\u0006\u001a\u0004\be\u0010GR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00188F¢\u0006\u0006\u001a\u0004\bg\u0010GR(\u0010k\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u000203\u0018\u00010lX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020sX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w¨\u0006\u0087\u0001"}, d2 = {"Lcom/polymarket/clients/ClientChatMessage;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "channelId", "Lcom/polymarket/clients/ClientChatChannelID;", "user", "Lcom/polymarket/clients/ClientChatUser;", "createdAt", "Ljava/util/Date;", "updatedAt", "content", "Lcom/polymarket/clients/ClientChatMessageContentType;", "attachments", "", "Lcom/polymarket/clients/ClientChatMessageAttachment;", "groupedReactions", "Lcom/polymarket/clients/ClientChatMessage$GroupedReaction;", "replyToMessageId", "quotedMessage", "Lcom/polymarket/clients/ClientChatQuotedMessage;", "type", "Lcom/polymarket/clients/ClientChatMessageType;", "isPinned", "", "pinnedAt", "isDeleted", "customImageIds", "authorPositionSnapshot", "Lcom/polymarket/clients/ClientChatPositionSnapshot;", "mentionedUsers", "mentionedEvents", "Lcom/polymarket/clients/ClientChatEventMention;", "(Ljava/lang/String;Lcom/polymarket/clients/ClientChatChannelID;Lcom/polymarket/clients/ClientChatUser;Ljava/util/Date;Ljava/util/Date;Lcom/polymarket/clients/ClientChatMessageContentType;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/polymarket/clients/ClientChatQuotedMessage;Lcom/polymarket/clients/ClientChatMessageType;ZLjava/util/Date;ZLjava/util/List;Lcom/polymarket/clients/ClientChatPositionSnapshot;Ljava/util/List;Ljava/util/List;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getChannelId", "()Lcom/polymarket/clients/ClientChatChannelID;", "Swift_channelId", "getUser", "()Lcom/polymarket/clients/ClientChatUser;", "Swift_user", "getCreatedAt", "()Ljava/util/Date;", "Swift_createdAt", "getUpdatedAt", "Swift_updatedAt", "getContent", "()Lcom/polymarket/clients/ClientChatMessageContentType;", "Swift_content", "getAttachments", "()Ljava/util/List;", "Swift_attachments", "getGroupedReactions", "Swift_groupedReactions", "getReplyToMessageId", "Swift_replyToMessageId", "newValue", "getQuotedMessage", "()Lcom/polymarket/clients/ClientChatQuotedMessage;", "setQuotedMessage", "(Lcom/polymarket/clients/ClientChatQuotedMessage;)V", "Swift_quotedMessage", "Swift_quotedMessage_set", "value", "getType", "()Lcom/polymarket/clients/ClientChatMessageType;", "Swift_type", "()Z", "Swift_isPinned", "getPinnedAt", "Swift_pinnedAt", "Swift_isDeleted", "getCustomImageIds", "Swift_customImageIds", "getAuthorPositionSnapshot", "()Lcom/polymarket/clients/ClientChatPositionSnapshot;", "setAuthorPositionSnapshot", "(Lcom/polymarket/clients/ClientChatPositionSnapshot;)V", "Swift_authorPositionSnapshot", "Swift_authorPositionSnapshot_set", "getMentionedUsers", "Swift_mentionedUsers", "getMentionedEvents", "Swift_mentionedEvents", "Swift_constructor_0", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "GroupedReaction", "ReactionsPreview", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatMessage implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ClientChatMessage(String str, ClientChatChannelID clientChatChannelID, ClientChatUser clientChatUser, Date date, Date date2, ClientChatMessageContentType clientChatMessageContentType, List list, List list2, String str2, ClientChatQuotedMessage clientChatQuotedMessage, ClientChatMessageType clientChatMessageType, boolean z, Date date3, boolean z2, List list3, ClientChatPositionSnapshot clientChatPositionSnapshot, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, clientChatChannelID, r6, date, r8, clientChatMessageContentType, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        ClientChatUser clientChatUser2;
        Date date4;
        List list6;
        List list7;
        String str3;
        ClientChatQuotedMessage clientChatQuotedMessage2;
        ClientChatMessageType clientChatMessageType2;
        boolean z3;
        Date date5;
        boolean z4;
        List list8;
        ClientChatPositionSnapshot clientChatPositionSnapshot2;
        List list9;
        List list10;
        if ((i & 4) != 0) {
            clientChatUser2 = null;
        } else {
            clientChatUser2 = clientChatUser;
        }
        if ((i & 16) != 0) {
            date4 = null;
        } else {
            date4 = date2;
        }
        if ((i & 64) != 0) {
            list6 = null;
        } else {
            list6 = list;
        }
        if ((i & 128) != 0) {
            list7 = null;
        } else {
            list7 = list2;
        }
        if ((i & 256) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            clientChatQuotedMessage2 = null;
        } else {
            clientChatQuotedMessage2 = clientChatQuotedMessage;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            clientChatMessageType2 = ClientChatMessageType.user;
        } else {
            clientChatMessageType2 = clientChatMessageType;
        }
        if ((i & 2048) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 4096) != 0) {
            date5 = null;
        } else {
            date5 = date3;
        }
        if ((i & 8192) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            list8 = null;
        } else {
            list8 = list3;
        }
        if ((32768 & i) != 0) {
            clientChatPositionSnapshot2 = null;
        } else {
            clientChatPositionSnapshot2 = clientChatPositionSnapshot;
        }
        if ((65536 & i) != 0) {
            list9 = null;
        } else {
            list9 = list4;
        }
        if ((i & 131072) != 0) {
            list10 = null;
        } else {
            list10 = list5;
        }
    }

    private final native List<ClientChatMessageAttachment> Swift_attachments(long Swift_peer);

    private final native ClientChatPositionSnapshot Swift_authorPositionSnapshot(long Swift_peer);

    private final native void Swift_authorPositionSnapshot_set(long Swift_peer, ClientChatPositionSnapshot value);

    private final native ClientChatChannelID Swift_channelId(long Swift_peer);

    private final native long Swift_constructor_0(String id, ClientChatChannelID channelId, ClientChatUser user, Date createdAt, Date updatedAt, ClientChatMessageContentType content, List<? extends ClientChatMessageAttachment> attachments, List<GroupedReaction> groupedReactions, String replyToMessageId, ClientChatQuotedMessage quotedMessage, ClientChatMessageType type, boolean isPinned, Date pinnedAt, boolean isDeleted, List<String> customImageIds, ClientChatPositionSnapshot authorPositionSnapshot, List<ClientChatUser> mentionedUsers, List<ClientChatEventMention> mentionedEvents);

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native ClientChatMessageContentType Swift_content(long Swift_peer);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native List<String> Swift_customImageIds(long Swift_peer);

    private final native List<GroupedReaction> Swift_groupedReactions(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isDeleted(long Swift_peer);

    private final native boolean Swift_isPinned(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatMessage lhs, ClientChatMessage rhs);

    private final native List<ClientChatEventMention> Swift_mentionedEvents(long Swift_peer);

    private final native List<ClientChatUser> Swift_mentionedUsers(long Swift_peer);

    private final native Date Swift_pinnedAt(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ClientChatQuotedMessage Swift_quotedMessage(long Swift_peer);

    private final native void Swift_quotedMessage_set(long Swift_peer, ClientChatQuotedMessage value);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_replyToMessageId(long Swift_peer);

    private final native ClientChatMessageType Swift_type(long Swift_peer);

    private final native Date Swift_updatedAt(long Swift_peer);

    private final native ClientChatUser Swift_user(long Swift_peer);

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
        if (!(other instanceof ClientChatMessage)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatMessage) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<ClientChatMessageAttachment> getAttachments() {
        return Swift_attachments(this.Swift_peer);
    }

    public final ClientChatPositionSnapshot getAuthorPositionSnapshot() {
        return Swift_authorPositionSnapshot(this.Swift_peer);
    }

    public final ClientChatChannelID getChannelId() {
        return Swift_channelId(this.Swift_peer);
    }

    public final ClientChatMessageContentType getContent() {
        return Swift_content(this.Swift_peer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final List<String> getCustomImageIds() {
        return Swift_customImageIds(this.Swift_peer);
    }

    public final List<GroupedReaction> getGroupedReactions() {
        return Swift_groupedReactions(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final List<ClientChatEventMention> getMentionedEvents() {
        return Swift_mentionedEvents(this.Swift_peer);
    }

    public final List<ClientChatUser> getMentionedUsers() {
        return Swift_mentionedUsers(this.Swift_peer);
    }

    public final Date getPinnedAt() {
        return Swift_pinnedAt(this.Swift_peer);
    }

    public final ClientChatQuotedMessage getQuotedMessage() {
        return Swift_quotedMessage(this.Swift_peer);
    }

    public final String getReplyToMessageId() {
        return Swift_replyToMessageId(this.Swift_peer);
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

    public final ClientChatMessageType getType() {
        return Swift_type(this.Swift_peer);
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public final ClientChatUser getUser() {
        return Swift_user(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isDeleted() {
        return Swift_isDeleted(this.Swift_peer);
    }

    public final boolean isPinned() {
        return Swift_isPinned(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientChatMessage(this);
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

    public final void setQuotedMessage(ClientChatQuotedMessage clientChatQuotedMessage) {
        ClientChatQuotedMessage clientChatQuotedMessage2 = (ClientChatQuotedMessage) StructKt.sref$default(clientChatQuotedMessage, null, 1, null);
        willmutate();
        try {
            Swift_quotedMessage_set(this.Swift_peer, clientChatQuotedMessage2);
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
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\b\u0010%\u001a\u00020\u000eH\u0016J\u0015\u0010&\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020!0(2\u0006\u0010)\u001a\u00020\u000eH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0(2\u0006\u0010)\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/polymarket/clients/ClientChatMessage$ReactionsPreview;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "visibleReactions", "", "Lcom/polymarket/clients/ClientChatMessage$GroupedReaction;", "totalCount", "", "(Ljava/util/List;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getVisibleReactions", "()Ljava/util/List;", "Swift_visibleReactions", "getTotalCount", "()I", "Swift_totalCount", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ReactionsPreview implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int maxVisibleReactions = 8;
        private long Swift_peer;

        public ReactionsPreview(List<GroupedReaction> list, int i) {
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, i);
        }

        private final native long Swift_constructor_0(List<GroupedReaction> visibleReactions, int totalCount);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(ReactionsPreview lhs, ReactionsPreview rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_totalCount(long Swift_peer);

        private final native List<GroupedReaction> Swift_visibleReactions(long Swift_peer);

        public static final /* synthetic */ int access$getMaxVisibleReactions$cp() {
            return maxVisibleReactions;
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
            if (other == this) {
                return true;
            }
            if (!(other instanceof ReactionsPreview)) {
                return false;
            }
            return Swift_isequal(this, (ReactionsPreview) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final int getTotalCount() {
            return Swift_totalCount(this.Swift_peer);
        }

        public final List<GroupedReaction> getVisibleReactions() {
            return Swift_visibleReactions(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientChatMessage$ReactionsPreview$Companion;", "", "<init>", "()V", "maxVisibleReactions", "", "getMaxVisibleReactions", "()I", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getMaxVisibleReactions() {
                return ReactionsPreview.access$getMaxVisibleReactions$cp();
            }

            private Companion() {
            }
        }

        public ReactionsPreview(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011J[\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011H\u0082 J,\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ)\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082 ¨\u0006\u001e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessage$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/clients/ClientChatMessage;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "channelId", "Lcom/polymarket/clients/ClientChatChannelID;", "user", "Lcom/polymarket/clients/ClientChatUser;", "createdAt", "Ljava/util/Date;", "content", "Lcom/polymarket/clients/ClientChatMessageContentType;", "attachments", "", "Lcom/polymarket/clients/ClientChatMessageAttachment;", "type", "Lcom/polymarket/clients/ClientChatMessageType;", "customImageIds", "Swift_Companion_mock_1", "mockPinned", "text", "displayName", "isVerified", "", "isEmployee", "Swift_Companion_mockPinned_2", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientChatMessage Swift_Companion_mockPinned_2(String text, String displayName, boolean isVerified, boolean isEmployee);

        private final native ClientChatMessage Swift_Companion_mock_1(String id, ClientChatChannelID channelId, ClientChatUser user, Date createdAt, ClientChatMessageContentType content, List<? extends ClientChatMessageAttachment> attachments, ClientChatMessageType type, List<String> customImageIds);

        public static /* synthetic */ ClientChatMessage mock$default(Companion companion, String str, ClientChatChannelID clientChatChannelID, ClientChatUser clientChatUser, Date date, ClientChatMessageContentType clientChatMessageContentType, List list, ClientChatMessageType clientChatMessageType, List list2, int i, Object obj) {
            String str2;
            ClientChatChannelID clientChatChannelID2;
            ClientChatUser clientChatUser2;
            ClientChatMessageContentType clientChatMessageContentType2;
            List list3;
            ClientChatMessageType clientChatMessageType2;
            List list4;
            Companion companion2;
            Date date2;
            if ((i & 1) != 0) {
                str2 = new UUID().getUuidString();
            } else {
                str2 = str;
            }
            if ((i & 2) != 0) {
                clientChatChannelID2 = ClientChatChannelID.INSTANCE.event("sports-nfl");
            } else {
                clientChatChannelID2 = clientChatChannelID;
            }
            if ((i & 4) != 0) {
                clientChatUser2 = ClientChatUser.Companion.mock$default(ClientChatUser.INSTANCE, null, null, null, null, false, false, false, false, false, null, 1023, null);
            } else {
                clientChatUser2 = clientChatUser;
            }
            if ((i & 16) != 0) {
                clientChatMessageContentType2 = ClientChatMessageContentType.INSTANCE.text("Sample message");
            } else {
                clientChatMessageContentType2 = clientChatMessageContentType;
            }
            if ((i & 32) != 0) {
                list3 = null;
            } else {
                list3 = list;
            }
            if ((i & 64) != 0) {
                clientChatMessageType2 = ClientChatMessageType.user;
            } else {
                clientChatMessageType2 = clientChatMessageType;
            }
            if ((i & 128) != 0) {
                list4 = null;
                date2 = date;
                companion2 = companion;
            } else {
                list4 = list2;
                companion2 = companion;
                date2 = date;
            }
            return companion2.mock(str2, clientChatChannelID2, clientChatUser2, date2, clientChatMessageContentType2, list3, clientChatMessageType2, list4);
        }

        public static /* synthetic */ ClientChatMessage mockPinned$default(Companion companion, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "Alex";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return companion.mockPinned(str, str2, z, z2);
        }

        public final ClientChatMessage mock(String id, ClientChatChannelID channelId, ClientChatUser user, Date createdAt, ClientChatMessageContentType content, List<? extends ClientChatMessageAttachment> attachments, ClientChatMessageType type, List<String> customImageIds) {
            id.getClass();
            channelId.getClass();
            createdAt.getClass();
            content.getClass();
            type.getClass();
            return Swift_Companion_mock_1(id, channelId, user, createdAt, content, attachments, type, customImageIds);
        }

        public final ClientChatMessage mockPinned(String text, String displayName, boolean isVerified, boolean isEmployee) {
            text.getClass();
            displayName.getClass();
            return Swift_Companion_mockPinned_2(text, displayName, isVerified, isEmployee);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00017B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001f\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J%\u0010'\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0015\u0010*\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0082 J\b\u00101\u001a\u00020\u000fH\u0016J\u0015\u00102\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\u000fH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u00068"}, d2 = {"Lcom/polymarket/clients/ClientChatMessage$GroupedReaction;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "content", "Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "count", "", "currentUserReacted", "", "(Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;IZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getContent", "()Lcom/polymarket/clients/ClientChatMessageReaction$ReactionContent;", "Swift_content", "getCount", "()I", "Swift_count", "getCurrentUserReacted", "()Z", "Swift_currentUserReacted", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "Swift_constructor_0", "emoji", "getEmoji", "Swift_emoji", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GroupedReaction implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public GroupedReaction(ClientChatMessageReaction.ReactionContent reactionContent, int i, boolean z) {
            reactionContent.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(reactionContent, i, z);
        }

        private final native long Swift_constructor_0(ClientChatMessageReaction.ReactionContent content, int count, boolean currentUserReacted);

        private final native ClientChatMessageReaction.ReactionContent Swift_content(long Swift_peer);

        private final native int Swift_count(long Swift_peer);

        private final native boolean Swift_currentUserReacted(long Swift_peer);

        private final native String Swift_emoji(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(GroupedReaction lhs, GroupedReaction rhs);

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
            if (!(other instanceof GroupedReaction)) {
                return false;
            }
            return Swift_isequal(this, (GroupedReaction) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final ClientChatMessageReaction.ReactionContent getContent() {
            return Swift_content(this.Swift_peer);
        }

        public final int getCount() {
            return Swift_count(this.Swift_peer);
        }

        public final boolean getCurrentUserReacted() {
            return Swift_currentUserReacted(this.Swift_peer);
        }

        public final String getEmoji() {
            return Swift_emoji(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
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

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public GroupedReaction(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ClientChatMessage(String str, ClientChatChannelID clientChatChannelID, ClientChatUser clientChatUser, Date date, Date date2, ClientChatMessageContentType clientChatMessageContentType, List<? extends ClientChatMessageAttachment> list, List<GroupedReaction> list2, String str2, ClientChatQuotedMessage clientChatQuotedMessage, ClientChatMessageType clientChatMessageType, boolean z, Date date3, boolean z2, List<String> list3, ClientChatPositionSnapshot clientChatPositionSnapshot, List<ClientChatUser> list4, List<ClientChatEventMention> list5) {
        str.getClass();
        clientChatChannelID.getClass();
        date.getClass();
        clientChatMessageContentType.getClass();
        clientChatMessageType.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, clientChatChannelID, clientChatUser, date, date2, clientChatMessageContentType, list, list2, str2, clientChatQuotedMessage, clientChatMessageType, z, date3, z2, list3, clientChatPositionSnapshot, list4, list5);
    }

    public ClientChatMessage(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ClientChatMessage(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }
}
