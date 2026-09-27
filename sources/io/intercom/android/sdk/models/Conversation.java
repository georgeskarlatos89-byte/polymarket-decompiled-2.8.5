package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.c1c;
import defpackage.hdi;
import defpackage.m51;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020F0EJ\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\bJ\f\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\bJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020HJ\u0006\u0010M\u001a\u00020HJ\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\t\u0010U\u001a\u00020\u0010HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010\\\u001a\u00020\u0019HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jû\u0001\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010d\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010f\u001a\u00020gH×\u0001J\t\u0010h\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010)R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'¨\u0006i"}, d2 = {"Lio/intercom/android/sdk/models/Conversation;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "isRead", "", "participantBuilderList", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "partBuilderList", "Lio/intercom/android/sdk/models/Part$Builder;", "groupConversationParticipantIds", "lastParticipatingAdminBuilder", "Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", "preventEndUserReplies", "inboundConversationsDisabled", "notificationStatus", "state", "isInbound", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "uiFlags", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "header", "Lio/intercom/android/sdk/models/Header;", "conversationEndedButton", "Lio/intercom/android/sdk/models/ConversationEndedButton;", "footerNotice", "Lio/intercom/android/sdk/models/FooterNotice;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "teamIntro", "specialNotice", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;Lio/intercom/android/sdk/models/ComposerState;ZZLjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/Ticket;Lio/intercom/android/sdk/models/ConversationUiFlags;Lio/intercom/android/sdk/models/Header;Lio/intercom/android/sdk/models/ConversationEndedButton;Lio/intercom/android/sdk/models/FooterNotice;Lio/intercom/android/sdk/models/PoweredBy;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Z", "getParticipantBuilderList", "()Ljava/util/List;", "getPartBuilderList", "getGroupConversationParticipantIds", "getLastParticipatingAdminBuilder", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getPreventEndUserReplies", "getInboundConversationsDisabled", "getNotificationStatus", "getState", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "getUiFlags", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getConversationEndedButton", "()Lio/intercom/android/sdk/models/ConversationEndedButton;", "getFooterNotice", "()Lio/intercom/android/sdk/models/FooterNotice;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getTeamIntro", "getSpecialNotice", "getParticipants", "", "Lio/intercom/android/sdk/models/Participant;", "parts", "Lio/intercom/android/sdk/models/Part;", "groupConversationParticipants", "lastParticipatingAdmin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "lastPart", "getLastAdminPart", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Conversation {
    public static final int $stable = 8;

    @SerializedName("composer_state")
    private final ComposerState composerState;

    @SerializedName("conversation_ended_button")
    private final ConversationEndedButton conversationEndedButton;

    @SerializedName("footer_notice")
    private final FooterNotice footerNotice;

    @SerializedName("group_conversation_participant_ids")
    private final List<String> groupConversationParticipantIds;
    private final Header header;
    private final String id;

    @SerializedName("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @SerializedName("is_inbound")
    private final boolean isInbound;

    @SerializedName("read")
    private final boolean isRead;

    @SerializedName("last_participating_admin")
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @SerializedName("notification_status")
    private final String notificationStatus;

    @SerializedName("conversation_parts")
    private final List<Part.Builder> partBuilderList;

    @SerializedName("participants")
    private final List<Participant.Builder> participantBuilderList;

    @SerializedName("powered_by")
    private final PoweredBy poweredBy;

    @SerializedName("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @SerializedName("special_notice")
    private final String specialNotice;
    private final String state;

    @SerializedName("team_intro")
    private final String teamIntro;
    private final Ticket ticket;
    private final String title;

    @SerializedName("ui_flags")
    private final ConversationUiFlags uiFlags;

    public /* synthetic */ Conversation(String str, String str2, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? CollectionsKt.emptyList() : list3, (i & 64) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i & 128) != 0 ? ComposerState.INSTANCE.getNULL() : composerState, (i & 256) != 0 ? false : z2, (i & Barcode.FORMAT_UPC_A) != 0 ? false : z3, (i & Barcode.FORMAT_UPC_E) != 0 ? "" : str3, (i & 2048) == 0 ? str4 : "", (i & 4096) == 0 ? z4 : false, (i & 8192) != 0 ? null : ticket, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ConversationUiFlags.INSTANCE.getDEFAULT() : conversationUiFlags, (i & 32768) != 0 ? null : header, (i & 65536) != 0 ? null : conversationEndedButton, (i & 131072) != 0 ? null : footerNotice, (i & 262144) != 0 ? null : poweredBy, (i & 524288) != 0 ? null : str5, (i & 1048576) != 0 ? null : str6);
    }

    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, String str2, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        String str9 = (i & 1) != 0 ? conversation.id : str;
        String str10 = (i & 2) != 0 ? conversation.title : str2;
        boolean z5 = (i & 4) != 0 ? conversation.isRead : z;
        List list4 = (i & 8) != 0 ? conversation.participantBuilderList : list;
        List list5 = (i & 16) != 0 ? conversation.partBuilderList : list2;
        List list6 = (i & 32) != 0 ? conversation.groupConversationParticipantIds : list3;
        LastParticipatingAdmin.Builder builder2 = (i & 64) != 0 ? conversation.lastParticipatingAdminBuilder : builder;
        ComposerState composerState2 = (i & 128) != 0 ? conversation.composerState : composerState;
        boolean z6 = (i & 256) != 0 ? conversation.preventEndUserReplies : z2;
        boolean z7 = (i & Barcode.FORMAT_UPC_A) != 0 ? conversation.inboundConversationsDisabled : z3;
        String str11 = (i & Barcode.FORMAT_UPC_E) != 0 ? conversation.notificationStatus : str3;
        String str12 = (i & 2048) != 0 ? conversation.state : str4;
        boolean z8 = (i & 4096) != 0 ? conversation.isInbound : z4;
        Ticket ticket2 = (i & 8192) != 0 ? conversation.ticket : ticket;
        String str13 = str9;
        ConversationUiFlags conversationUiFlags2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? conversation.uiFlags : conversationUiFlags;
        Header header2 = (i & 32768) != 0 ? conversation.header : header;
        ConversationEndedButton conversationEndedButton2 = (i & 65536) != 0 ? conversation.conversationEndedButton : conversationEndedButton;
        FooterNotice footerNotice2 = (i & 131072) != 0 ? conversation.footerNotice : footerNotice;
        PoweredBy poweredBy2 = (i & 262144) != 0 ? conversation.poweredBy : poweredBy;
        String str14 = (i & 524288) != 0 ? conversation.teamIntro : str5;
        if ((i & 1048576) != 0) {
            str8 = str14;
            str7 = conversation.specialNotice;
        } else {
            str7 = str6;
            str8 = str14;
        }
        return conversation.copy(str13, str10, z5, list4, list5, list6, builder2, composerState2, z6, z7, str11, str12, z8, ticket2, conversationUiFlags2, header2, conversationEndedButton2, footerNotice2, poweredBy2, str8, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsInbound() {
        return this.isInbound;
    }

    /* renamed from: component14, reason: from getter */
    public final Ticket getTicket() {
        return this.ticket;
    }

    /* renamed from: component15, reason: from getter */
    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    /* renamed from: component16, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component17, reason: from getter */
    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    /* renamed from: component18, reason: from getter */
    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    /* renamed from: component19, reason: from getter */
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component20, reason: from getter */
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    /* renamed from: component21, reason: from getter */
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final List<Participant.Builder> component4() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> component5() {
        return this.partBuilderList;
    }

    public final List<String> component6() {
        return this.groupConversationParticipantIds;
    }

    /* renamed from: component7, reason: from getter */
    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    /* renamed from: component8, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final Conversation copy(String id, String title, boolean isRead, List<Participant.Builder> participantBuilderList, List<Part.Builder> partBuilderList, List<String> groupConversationParticipantIds, LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, ComposerState composerState, boolean preventEndUserReplies, boolean inboundConversationsDisabled, String notificationStatus, String state, boolean isInbound, Ticket ticket, ConversationUiFlags uiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String teamIntro, String specialNotice) {
        id.getClass();
        title.getClass();
        participantBuilderList.getClass();
        partBuilderList.getClass();
        groupConversationParticipantIds.getClass();
        lastParticipatingAdminBuilder.getClass();
        composerState.getClass();
        notificationStatus.getClass();
        state.getClass();
        uiFlags.getClass();
        return new Conversation(id, title, isRead, participantBuilderList, partBuilderList, groupConversationParticipantIds, lastParticipatingAdminBuilder, composerState, preventEndUserReplies, inboundConversationsDisabled, notificationStatus, state, isInbound, ticket, uiFlags, header, conversationEndedButton, footerNotice, poweredBy, teamIntro, specialNotice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        if (Intrinsics.areEqual(this.id, conversation.id) && Intrinsics.areEqual(this.title, conversation.title) && this.isRead == conversation.isRead && Intrinsics.areEqual(this.participantBuilderList, conversation.participantBuilderList) && Intrinsics.areEqual(this.partBuilderList, conversation.partBuilderList) && Intrinsics.areEqual(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && Intrinsics.areEqual(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && Intrinsics.areEqual(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && Intrinsics.areEqual(this.notificationStatus, conversation.notificationStatus) && Intrinsics.areEqual(this.state, conversation.state) && this.isInbound == conversation.isInbound && Intrinsics.areEqual(this.ticket, conversation.ticket) && Intrinsics.areEqual(this.uiFlags, conversation.uiFlags) && Intrinsics.areEqual(this.header, conversation.header) && Intrinsics.areEqual(this.conversationEndedButton, conversation.conversationEndedButton) && Intrinsics.areEqual(this.footerNotice, conversation.footerNotice) && Intrinsics.areEqual(this.poweredBy, conversation.poweredBy) && Intrinsics.areEqual(this.teamIntro, conversation.teamIntro) && Intrinsics.areEqual(this.specialNotice, conversation.specialNotice)) {
            return true;
        }
        return false;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final Part getLastAdminPart() {
        Part part;
        List<Part> parts = parts();
        ListIterator<Part> listIterator = parts.listIterator(parts.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                part = listIterator.previous();
                if (part.isAdmin()) {
                    break;
                }
            } else {
                part = null;
                break;
            }
        }
        Part part2 = part;
        if (part2 == null) {
            Part part3 = Part.NULL;
            part3.getClass();
            return part3;
        }
        return part2;
    }

    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        int a = c1c.a(CollectionsKt.w(list));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Participant.Builder builder : list) {
            Pair pair = new Pair(builder.build().getId(), builder.build());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final Ticket getTicket() {
        return this.ticket;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int g = hdi.g(hdi.e(hdi.e(hdi.g(hdi.g((this.composerState.hashCode() + ((this.lastParticipatingAdminBuilder.hashCode() + hdi.f(hdi.f(hdi.f(hdi.g(hdi.e(this.id.hashCode() * 31, 31, this.title), 31, this.isRead), 31, this.participantBuilderList), 31, this.partBuilderList), 31, this.groupConversationParticipantIds)) * 31)) * 31, 31, this.preventEndUserReplies), 31, this.inboundConversationsDisabled), 31, this.notificationStatus), 31, this.state), 31, this.isInbound);
        Ticket ticket = this.ticket;
        int i = 0;
        if (ticket == null) {
            hashCode = 0;
        } else {
            hashCode = ticket.hashCode();
        }
        int hashCode7 = (this.uiFlags.hashCode() + ((g + hashCode) * 31)) * 31;
        Header header = this.header;
        if (header == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = header.hashCode();
        }
        int i2 = (hashCode7 + hashCode2) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        if (conversationEndedButton == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = conversationEndedButton.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        FooterNotice footerNotice = this.footerNotice;
        if (footerNotice == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = footerNotice.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        PoweredBy poweredBy = this.poweredBy;
        if (poweredBy == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = poweredBy.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str = this.teamIntro;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str2 = this.specialNotice;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i6 + i;
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final Part lastPart() {
        Part part = (Part) CollectionsKt.S(parts());
        if (part == null) {
            Part part2 = Part.NULL;
            part2.getClass();
            return part2;
        }
        return part;
    }

    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin build = this.lastParticipatingAdminBuilder.build();
        build.getClass();
        return build;
    }

    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part build = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(build.getParticipantId());
            if (participant != null) {
                build.setParticipant(participant);
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", participantBuilderList=");
        sb.append(this.participantBuilderList);
        sb.append(", partBuilderList=");
        sb.append(this.partBuilderList);
        sb.append(", groupConversationParticipantIds=");
        sb.append(this.groupConversationParticipantIds);
        sb.append(", lastParticipatingAdminBuilder=");
        sb.append(this.lastParticipatingAdminBuilder);
        sb.append(", composerState=");
        sb.append(this.composerState);
        sb.append(", preventEndUserReplies=");
        sb.append(this.preventEndUserReplies);
        sb.append(", inboundConversationsDisabled=");
        sb.append(this.inboundConversationsDisabled);
        sb.append(", notificationStatus=");
        sb.append(this.notificationStatus);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", isInbound=");
        sb.append(this.isInbound);
        sb.append(", ticket=");
        sb.append(this.ticket);
        sb.append(", uiFlags=");
        sb.append(this.uiFlags);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", conversationEndedButton=");
        sb.append(this.conversationEndedButton);
        sb.append(", footerNotice=");
        sb.append(this.footerNotice);
        sb.append(", poweredBy=");
        sb.append(this.poweredBy);
        sb.append(", teamIntro=");
        sb.append(this.teamIntro);
        sb.append(", specialNotice=");
        return m51.m(sb, this.specialNotice, ')');
    }

    public Conversation(String str, String str2, boolean z, List<Participant.Builder> list, List<Part.Builder> list2, List<String> list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        builder.getClass();
        composerState.getClass();
        str3.getClass();
        str4.getClass();
        conversationUiFlags.getClass();
        this.id = str;
        this.title = str2;
        this.isRead = z;
        this.participantBuilderList = list;
        this.partBuilderList = list2;
        this.groupConversationParticipantIds = list3;
        this.lastParticipatingAdminBuilder = builder;
        this.composerState = composerState;
        this.preventEndUserReplies = z2;
        this.inboundConversationsDisabled = z3;
        this.notificationStatus = str3;
        this.state = str4;
        this.isInbound = z4;
        this.ticket = ticket;
        this.uiFlags = conversationUiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str5;
        this.specialNotice = str6;
    }

    public Conversation() {
        this(null, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097151, null);
    }
}
