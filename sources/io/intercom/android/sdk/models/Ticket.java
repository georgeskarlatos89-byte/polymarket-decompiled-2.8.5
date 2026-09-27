package io.intercom.android.sdk.models;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.gson.annotations.SerializedName;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hdi;
import defpackage.ix2;
import defpackage.k84;
import defpackage.m51;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.models.Participant;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0004GHIJB±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0012HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010?\u001a\u00020\u0010HÆ\u0003J¸\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0010HÇ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010D\u001a\u00020EH×\u0001J\t\u0010F\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0016\u0010.R\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(¨\u0006K"}, d2 = {"Lio/intercom/android/sdk/models/Ticket;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "publicId", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "description", "iconUrl", "emoji", "currentStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "statusList", "", "attributes", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "ticketTypeId", "", "assignee", "Lio/intercom/android/sdk/models/Participant$Builder;", "conversationId", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isRead", "", "latestStatusUpdatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;JLio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getPublicId", "getTitle", "getDescription", "getIconUrl", "getEmoji", "getCurrentStatus", "()Lio/intercom/android/sdk/models/Ticket$Status;", "getStatusList", "()Ljava/util/List;", "getAttributes", "getTicketTypeId", "()J", "getAssignee", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getConversationId", "getConversationButton", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatestStatusUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;JLio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)Lio/intercom/android/sdk/models/Ticket;", "equals", "other", "hashCode", "", "toString", "Status", "TicketAttribute", "ConversationButton", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Ticket {

    @SerializedName("assignee")
    private final Participant.Builder assignee;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("conversation_button")
    private final ConversationButton conversationButton;

    @SerializedName(CreateTicketDestinationKt.CONVERSATION_ID)
    private final String conversationId;

    @SerializedName("current_status")
    private final Status currentStatus;

    @SerializedName("description")
    private final String description;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    private final String id;

    @SerializedName("read")
    private final Boolean isRead;

    @SerializedName("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @SerializedName("public_ticket_id")
    private final String publicId;

    @SerializedName("status_list")
    private final List<Status> statusList;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final long ticketTypeId;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE)
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "text", "", "<init>", "(Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ConversationButton {
        public static final int $stable = 0;

        @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON)
        private final IconType icon;

        @SerializedName("text")
        private final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "CONVERSATION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class IconType {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ IconType[] $VALUES;

            @SerializedName("send")
            public static final IconType SEND = new IconType("SEND", 0);

            @SerializedName("conversation")
            public static final IconType CONVERSATION = new IconType("CONVERSATION", 1);

            private static final /* synthetic */ IconType[] $values() {
                return new IconType[]{SEND, CONVERSATION};
            }

            static {
                IconType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
            }

            private IconType(String str, int i) {
            }

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) $VALUES.clone();
            }
        }

        public ConversationButton(IconType iconType, String str) {
            str.getClass();
            this.icon = iconType;
            this.text = str;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final IconType getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ConversationButton copy(IconType icon, String text) {
            text.getClass();
            return new ConversationButton(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) other;
            if (this.icon == conversationButton.icon && Intrinsics.areEqual(this.text, conversationButton.text)) {
                return true;
            }
            return false;
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode;
            IconType iconType = this.icon;
            if (iconType == null) {
                hashCode = 0;
            } else {
                hashCode = iconType.hashCode();
            }
            return this.text.hashCode() + (hashCode * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationButton(icon=");
            sb.append(this.icon);
            sb.append(", text=");
            return m51.m(sb, this.text, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r6, r7, r2, r9, r8, r10, r14, r11, r4, r12, r13, r35);
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Status status2;
        List list3;
        List list4;
        long j3;
        Participant.Builder builder2;
        String str13;
        ConversationButton conversationButton2;
        Boolean bool2;
        long j4;
        if ((i & 1) != 0) {
            str8 = "";
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            str10 = "";
        } else {
            str10 = str3;
        }
        if ((i & 8) != 0) {
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        String str14 = (i & 32) == 0 ? str6 : "";
        if ((i & 64) != 0) {
            status2 = new Status(null, null, null, false, 0L, 31, null);
        } else {
            status2 = status;
        }
        if ((i & 128) != 0) {
            list3 = CollectionsKt.emptyList();
        } else {
            list3 = list;
        }
        if ((i & 256) != 0) {
            list4 = CollectionsKt.emptyList();
        } else {
            list4 = list2;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            builder2 = new Participant.Builder();
        } else {
            builder2 = builder;
        }
        if ((i & 2048) != 0) {
            str13 = null;
        } else {
            str13 = str7;
        }
        if ((i & 4096) != 0) {
            conversationButton2 = null;
        } else {
            conversationButton2 = conversationButton;
        }
        if ((i & 8192) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
    }

    public static final /* synthetic */ Ticket access$getNULL$cp() {
        return NULL;
    }

    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Status status2;
        List list3;
        List list4;
        long j3;
        Participant.Builder builder2;
        String str14;
        ConversationButton conversationButton2;
        Boolean bool2;
        long j4;
        Boolean bool3;
        String str15;
        Ticket ticket2;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        Status status3;
        List list5;
        List list6;
        long j5;
        Participant.Builder builder3;
        String str21;
        ConversationButton conversationButton3;
        if ((i & 1) != 0) {
            str8 = ticket.id;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            str9 = ticket.publicId;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            str10 = ticket.title;
        } else {
            str10 = str3;
        }
        if ((i & 8) != 0) {
            str11 = ticket.description;
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            str12 = ticket.iconUrl;
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            str13 = ticket.emoji;
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            status2 = ticket.currentStatus;
        } else {
            status2 = status;
        }
        if ((i & 128) != 0) {
            list3 = ticket.statusList;
        } else {
            list3 = list;
        }
        if ((i & 256) != 0) {
            list4 = ticket.attributes;
        } else {
            list4 = list2;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            j3 = ticket.ticketTypeId;
        } else {
            j3 = j;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            builder2 = ticket.assignee;
        } else {
            builder2 = builder;
        }
        if ((i & 2048) != 0) {
            str14 = ticket.conversationId;
        } else {
            str14 = str7;
        }
        if ((i & 4096) != 0) {
            conversationButton2 = ticket.conversationButton;
        } else {
            conversationButton2 = conversationButton;
        }
        String str22 = str8;
        if ((i & 8192) != 0) {
            bool2 = ticket.isRead;
        } else {
            bool2 = bool;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            bool3 = bool2;
            j4 = ticket.latestStatusUpdatedAt;
            str16 = str9;
            str17 = str10;
            str18 = str11;
            str19 = str12;
            str20 = str13;
            status3 = status2;
            list5 = list3;
            list6 = list4;
            j5 = j3;
            builder3 = builder2;
            str21 = str14;
            conversationButton3 = conversationButton2;
            str15 = str22;
            ticket2 = ticket;
        } else {
            j4 = j2;
            bool3 = bool2;
            str15 = str22;
            ticket2 = ticket;
            str16 = str9;
            str17 = str10;
            str18 = str11;
            str19 = str12;
            str20 = str13;
            status3 = status2;
            list5 = list3;
            list6 = list4;
            j5 = j3;
            builder3 = builder2;
            str21 = str14;
            conversationButton3 = conversationButton2;
        }
        return ticket2.copy(str15, str16, str17, str18, str19, str20, status3, list5, list6, j5, builder3, str21, conversationButton3, bool3, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTicketTypeId() {
        return this.ticketTypeId;
    }

    /* renamed from: component11, reason: from getter */
    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    /* renamed from: component12, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component13, reason: from getter */
    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component15, reason: from getter */
    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component7, reason: from getter */
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final List<Status> component8() {
        return this.statusList;
    }

    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    public final Ticket copy(String id, String publicId, String title, String description, String iconUrl, String emoji, Status currentStatus, List<Status> statusList, List<? extends TicketAttribute> attributes, long ticketTypeId, Participant.Builder assignee, String conversationId, ConversationButton conversationButton, Boolean isRead, long latestStatusUpdatedAt) {
        k84.p(id, title, description, iconUrl, emoji);
        currentStatus.getClass();
        statusList.getClass();
        attributes.getClass();
        assignee.getClass();
        return new Ticket(id, publicId, title, description, iconUrl, emoji, currentStatus, statusList, attributes, ticketTypeId, assignee, conversationId, conversationButton, isRead, latestStatusUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) other;
        if (Intrinsics.areEqual(this.id, ticket.id) && Intrinsics.areEqual(this.publicId, ticket.publicId) && Intrinsics.areEqual(this.title, ticket.title) && Intrinsics.areEqual(this.description, ticket.description) && Intrinsics.areEqual(this.iconUrl, ticket.iconUrl) && Intrinsics.areEqual(this.emoji, ticket.emoji) && Intrinsics.areEqual(this.currentStatus, ticket.currentStatus) && Intrinsics.areEqual(this.statusList, ticket.statusList) && Intrinsics.areEqual(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && Intrinsics.areEqual(this.assignee, ticket.assignee) && Intrinsics.areEqual(this.conversationId, ticket.conversationId) && Intrinsics.areEqual(this.conversationButton, ticket.conversationButton) && Intrinsics.areEqual(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt) {
            return true;
        }
        return false;
    }

    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.id.hashCode() * 31;
        String str = this.publicId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.assignee.hashCode() + woa.d(hdi.f(hdi.f((this.currentStatus.hashCode() + hdi.e(hdi.e(hdi.e(hdi.e((hashCode4 + hashCode) * 31, 31, this.title), 31, this.description), 31, this.iconUrl), 31, this.emoji)) * 31, 31, this.statusList), 31, this.attributes), 31, this.ticketTypeId)) * 31;
        String str2 = this.conversationId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        ConversationButton conversationButton = this.conversationButton;
        if (conversationButton == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = conversationButton.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Boolean bool = this.isRead;
        if (bool != null) {
            i = bool.hashCode();
        }
        return Long.hashCode(this.latestStatusUpdatedAt) + ((i3 + i) * 31);
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ticket(id=");
        sb.append(this.id);
        sb.append(", publicId=");
        sb.append(this.publicId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", emoji=");
        sb.append(this.emoji);
        sb.append(", currentStatus=");
        sb.append(this.currentStatus);
        sb.append(", statusList=");
        sb.append(this.statusList);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", ticketTypeId=");
        sb.append(this.ticketTypeId);
        sb.append(", assignee=");
        sb.append(this.assignee);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationButton=");
        sb.append(this.conversationButton);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", latestStatusUpdatedAt=");
        return ix2.n(sb, this.latestStatusUpdatedAt, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/Ticket;", "getNULL", "()Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ticket getNULL() {
            return Ticket.access$getNULL$cp();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B9\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0007H&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;)V", "getId", "()Ljava/lang/String;", "getIdentifier", "getName", "getRequired", "()Z", "getType", "()Lio/intercom/android/sdk/models/TicketAttributeType;", "hasValue", "PrimitiveAttribute", "ListAttribute", "DateTimeAttribute", "FilesAttribute", "UnSupported", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
        private final String id;

        @SerializedName("identifier")
        private final String identifier;

        @SerializedName(Keys.KEY_NAME)
        private final String name;

        @SerializedName("required")
        private final boolean required;

        @SerializedName("type")
        private final TicketAttributeType type;

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, ticketAttributeType, null);
        }

        public final String getId() {
            return this.id;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "hasValue", "File", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final List<File> value;

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "url", "fileType", "Lio/intercom/android/sdk/models/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "getFileType", "()Lio/intercom/android/sdk/models/FileType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* data */ class File {
                public static final int $stable = 0;

                @SerializedName("media_type")
                private final FileType fileType;

                @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
                private final String id;

                @SerializedName(Keys.KEY_NAME)
                private final String name;

                @SerializedName("url")
                private final String url;

                public File(String str, String str2, String str3, FileType fileType) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    fileType.getClass();
                    this.id = str;
                    this.name = str2;
                    this.url = str3;
                    this.fileType = fileType;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = file.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component3, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component4, reason: from getter */
                public final FileType getFileType() {
                    return this.fileType;
                }

                public final File copy(String id, String name, String url, FileType fileType) {
                    id.getClass();
                    name.getClass();
                    url.getClass();
                    fileType.getClass();
                    return new File(id, name, url, fileType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof File)) {
                        return false;
                    }
                    File file = (File) other;
                    if (Intrinsics.areEqual(this.id, file.id) && Intrinsics.areEqual(this.name, file.name) && Intrinsics.areEqual(this.url, file.url) && this.fileType == file.fileType) {
                        return true;
                    }
                    return false;
                }

                public final FileType getFileType() {
                    return this.fileType;
                }

                public final String getId() {
                    return this.id;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.fileType.hashCode() + hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.name), 31, this.url);
                }

                public String toString() {
                    return "File(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, List<File> list) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                list.getClass();
                this.value = list;
            }

            public final List<File> getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, ticketAttributeType, list);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final Object value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, Object obj) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                obj.getClass();
                this.value = obj;
            }

            public final Object getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.T(this.value.toString());
            }

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z, ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType) {
            this.id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, ticketAttributeType);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.T(this.value);
            }

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.T(this.value);
            }

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "identifier", Keys.KEY_NAME, "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.T(this.value);
            }

            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Status;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "type", "statusDetail", "isCurrentStatus", "", "createdDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getTitle", "()Ljava/lang/String;", "getType", "getStatusDetail", "()Z", "getCreatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Status {
        public static final int $stable = 0;

        @SerializedName("created_date")
        private final long createdDate;

        @SerializedName("is_current_status")
        private final boolean isCurrentStatus;

        @SerializedName("status_detail")
        private final String statusDetail;

        @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE)
        private final String title;

        @SerializedName("type")
        private final String type;

        public /* synthetic */ Status(String str, String str2, String str3, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.title;
            }
            if ((i & 2) != 0) {
                str2 = status.type;
            }
            if ((i & 4) != 0) {
                str3 = status.statusDetail;
            }
            if ((i & 8) != 0) {
                z = status.isCurrentStatus;
            }
            if ((i & 16) != 0) {
                j = status.createdDate;
            }
            long j2 = j;
            return status.copy(str, str2, str3, z, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStatusDetail() {
            return this.statusDetail;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCurrentStatus() {
            return this.isCurrentStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final Status copy(String title, String type, String statusDetail, boolean isCurrentStatus, long createdDate) {
            title.getClass();
            type.getClass();
            statusDetail.getClass();
            return new Status(title, type, statusDetail, isCurrentStatus, createdDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            if (Intrinsics.areEqual(this.title, status.title) && Intrinsics.areEqual(this.type, status.type) && Intrinsics.areEqual(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate) {
                return true;
            }
            return false;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final String getStatusDetail() {
            return this.statusDetail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.createdDate) + hdi.g(hdi.e(hdi.e(this.title.hashCode() * 31, 31, this.type), 31, this.statusDetail), 31, this.isCurrentStatus);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Status(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", statusDetail=");
            sb.append(this.statusDetail);
            sb.append(", isCurrentStatus=");
            sb.append(this.isCurrentStatus);
            sb.append(", createdDate=");
            return ix2.n(sb, this.createdDate, ')');
        }

        public Status(String str, String str2, String str3, boolean z, long j) {
            g.x(str, str2, str3);
            this.title = str;
            this.type = str2;
            this.statusDetail = str3;
            this.isCurrentStatus = z;
            this.createdDate = j;
        }

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List<Status> list, List<? extends TicketAttribute> list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2) {
        k84.p(str, str3, str4, str5, str6);
        status.getClass();
        list.getClass();
        list2.getClass();
        builder.getClass();
        this.id = str;
        this.publicId = str2;
        this.title = str3;
        this.description = str4;
        this.iconUrl = str5;
        this.emoji = str6;
        this.currentStatus = status;
        this.statusList = list;
        this.attributes = list2;
        this.ticketTypeId = j;
        this.assignee = builder;
        this.conversationId = str7;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j2;
    }

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0L, 32767, null);
    }
}
