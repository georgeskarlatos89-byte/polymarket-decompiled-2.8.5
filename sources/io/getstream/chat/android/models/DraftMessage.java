package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.hdi;
import defpackage.sv6;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001HB\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004H\u0016J9\u0010,\u001a\u0002H-\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010-*\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H-0\r2\u0006\u0010/\u001a\u0002H.2\u0006\u00100\u001a\u0002H-H\u0002¢\u0006\u0002\u00101J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u000206H\u0007J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¡\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006I"}, d2 = {"Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "cid", "text", "parentId", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "extraData", "", "", "silent", "", "showInChannel", "replyMessage", "Lio/getstream/chat/android/models/Message;", "command", "args", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCid", "getText", "getParentId", "getAttachments", "()Ljava/util/List;", "getMentionedUsersIds", "getExtraData", "()Ljava/util/Map;", "getSilent", "()Z", "getShowInChannel", "getReplyMessage", "()Lio/getstream/chat/android/models/Message;", "getCommand", "getArgs", "getComparableField", "", "fieldName", "get", "B", "A", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "identifierHash", "", "toString", "newBuilder", "Lio/getstream/chat/android/models/DraftMessage$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DraftMessage implements CustomObject, ComparableFieldProvider {
    private final String args;
    private final List<Attachment> attachments;
    private final String cid;
    private final String command;
    private final Map<String, Object> extraData;
    private final String id;
    private final List<String> mentionedUsersIds;
    private final String parentId;
    private final Message replyMessage;
    private final boolean showInChannel;
    private final boolean silent;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DraftMessage(String str, String str2, String str3, String str4, List list, List list2, Map map, boolean z, boolean z2, Message message, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r2, r1, r4, r5, r6, r7, r8, r9, r10, r24);
        String str7;
        List list3;
        List list4;
        Map map2;
        boolean z3;
        Message message2;
        String str8;
        String str9;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        String str10 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            list3 = CollectionsKt.emptyList();
        } else {
            list3 = list;
        }
        if ((i & 32) != 0) {
            list4 = CollectionsKt.emptyList();
        } else {
            list4 = list2;
        }
        if ((i & 64) != 0) {
            map2 = zc7.a;
            map2.getClass();
        } else {
            map2 = map;
        }
        if ((i & 128) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i & 256) == 0 ? z2 : false;
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            message2 = null;
        } else {
            message2 = message;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str8 = null;
        } else {
            str8 = str5;
        }
        if ((i & 2048) != 0) {
            str9 = null;
        } else {
            str9 = str6;
        }
    }

    public static /* synthetic */ DraftMessage copy$default(DraftMessage draftMessage, String str, String str2, String str3, String str4, List list, List list2, Map map, boolean z, boolean z2, Message message, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = draftMessage.cid;
        }
        if ((i & 4) != 0) {
            str3 = draftMessage.text;
        }
        if ((i & 8) != 0) {
            str4 = draftMessage.parentId;
        }
        if ((i & 16) != 0) {
            list = draftMessage.attachments;
        }
        if ((i & 32) != 0) {
            list2 = draftMessage.mentionedUsersIds;
        }
        if ((i & 64) != 0) {
            map = draftMessage.extraData;
        }
        if ((i & 128) != 0) {
            z = draftMessage.silent;
        }
        if ((i & 256) != 0) {
            z2 = draftMessage.showInChannel;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            message = draftMessage.replyMessage;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str5 = draftMessage.command;
        }
        if ((i & 2048) != 0) {
            str6 = draftMessage.args;
        }
        String str7 = str5;
        String str8 = str6;
        boolean z3 = z2;
        Message message2 = message;
        Map map2 = map;
        boolean z4 = z;
        List list3 = list;
        List list4 = list2;
        return draftMessage.copy(str, str2, str3, str4, list3, list4, map2, z4, z3, message2, str7, str8);
    }

    private final <A, B> B get(Map<A, ? extends B> map, A a, B b) {
        B b2 = map.get(a);
        if (b2 == null) {
            return b;
        }
        return b2;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Message getReplyMessage() {
        return this.replyMessage;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* renamed from: component12, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final List<Attachment> component5() {
        return this.attachments;
    }

    public final List<String> component6() {
        return this.mentionedUsersIds;
    }

    public final Map<String, Object> component7() {
        return this.extraData;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final DraftMessage copy(String id, String cid, String text, String parentId, List<Attachment> attachments, List<String> mentionedUsersIds, Map<String, ? extends Object> extraData, boolean silent, boolean showInChannel, Message replyMessage, String command, String args) {
        id.getClass();
        cid.getClass();
        text.getClass();
        attachments.getClass();
        mentionedUsersIds.getClass();
        extraData.getClass();
        return new DraftMessage(id, cid, text, parentId, attachments, mentionedUsersIds, extraData, silent, showInChannel, replyMessage, command, args);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftMessage)) {
            return false;
        }
        DraftMessage draftMessage = (DraftMessage) other;
        if (Intrinsics.areEqual(this.id, draftMessage.id) && Intrinsics.areEqual(this.cid, draftMessage.cid) && Intrinsics.areEqual(this.text, draftMessage.text) && Intrinsics.areEqual(this.parentId, draftMessage.parentId) && Intrinsics.areEqual(this.attachments, draftMessage.attachments) && Intrinsics.areEqual(this.mentionedUsersIds, draftMessage.mentionedUsersIds) && Intrinsics.areEqual(this.extraData, draftMessage.extraData) && this.silent == draftMessage.silent && this.showInChannel == draftMessage.showInChannel && Intrinsics.areEqual(this.replyMessage, draftMessage.replyMessage) && Intrinsics.areEqual(this.command, draftMessage.command) && Intrinsics.areEqual(this.args, draftMessage.args)) {
            return true;
        }
        return false;
    }

    public final String getArgs() {
        return this.args;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2.equals("parent_id") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        return r1.parentId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r2.equals("parentId") == false) goto L30;
     */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -902327211:
                if (fieldName.equals("silent")) {
                    return Boolean.valueOf(this.silent);
                }
                break;
            case 3355:
                if (fieldName.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return this.id;
                }
                break;
            case 98494:
                if (fieldName.equals("cid")) {
                    return this.cid;
                }
                break;
            case 3556653:
                if (fieldName.equals("text")) {
                    return this.text;
                }
                break;
            case 1175162725:
                break;
            case 2070327504:
                break;
        }
        Object obj = getExtraData().get(fieldName);
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        return null;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t) {
        return (T) super.getExtraValue(str, t);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMentionedUsersIds() {
        return this.mentionedUsersIds;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Message getReplyMessage() {
        return this.replyMessage;
    }

    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int e = hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.cid), 31, this.text);
        String str = this.parentId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = hdi.g(hdi.g(sv6.c(this.extraData, hdi.f(hdi.f((e + hashCode) * 31, 31, this.attachments), 31, this.mentionedUsersIds), 31), 31, this.silent), 31, this.showInChannel);
        Message message = this.replyMessage;
        if (message == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = message.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        String str2 = this.command;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.args;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final long identifierHash() {
        int hashCode = this.id.hashCode();
        String str = this.parentId;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        return hashCode;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Message(id=\"");
        sb.append(this.id);
        sb.append("\", text=\"");
        sb.append(this.text);
        sb.append("\", cid=\"");
        sb.append(this.cid);
        sb.append("\"");
        if (this.parentId != null) {
            sb.append(", parentId=");
            sb.append(this.parentId);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (!this.mentionedUsersIds.isEmpty()) {
            sb.append(", mentionedUsersIds=");
            sb.append(this.mentionedUsersIds);
        }
        sb.append(", silent=");
        sb.append(this.silent);
        sb.append(", showInChannel=");
        sb.append(this.showInChannel);
        if (this.replyMessage != null) {
            sb.append(", replyMessage=");
            sb.append(this.replyMessage);
        }
        if (this.command != null) {
            sb.append(", command=\"");
            sb.append(this.command);
            sb.append("\"");
        }
        if (this.args != null) {
            sb.append(", args=\"");
            sb.append(this.args);
            sb.append("\"");
        }
        if (!getExtraData().isEmpty()) {
            sb.append(", extraData=");
            sb.append(getExtraData());
        }
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\u001a\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lio/getstream/chat/android/models/DraftMessage$Builder;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/DraftMessage;", "(Lio/getstream/chat/android/models/DraftMessage;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "cid", "text", "parentId", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "extraData", "", "silent", "", "showInChannel", "replyMessage", "Lio/getstream/chat/android/models/Message;", "command", "args", "withId", "withCid", "withText", "withParentId", "withAttachments", "withMentionedUsersIds", "withExtraData", "withSilent", "withShowInChannel", "withReplyMessage", "withCommand", "withArgs", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private String args;
        private List<Attachment> attachments;
        private String cid;
        private String command;
        private Map<String, ? extends Object> extraData;
        private String id;
        private List<String> mentionedUsersIds;
        private String parentId;
        private Message replyMessage;
        private boolean showInChannel;
        private boolean silent;
        private String text;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(DraftMessage draftMessage) {
            this();
            draftMessage.getClass();
            this.id = draftMessage.getId();
            this.cid = draftMessage.getCid();
            this.text = draftMessage.getText();
            this.parentId = draftMessage.getParentId();
            this.attachments = draftMessage.getAttachments();
            this.mentionedUsersIds = draftMessage.getMentionedUsersIds();
            this.extraData = draftMessage.getExtraData();
            this.silent = draftMessage.getSilent();
            this.showInChannel = draftMessage.getShowInChannel();
            this.replyMessage = draftMessage.getReplyMessage();
            this.command = draftMessage.getCommand();
            this.args = draftMessage.getArgs();
        }

        public final DraftMessage build() {
            return new DraftMessage(this.id, this.cid, this.text, this.parentId, this.attachments, this.mentionedUsersIds, this.extraData, this.silent, this.showInChannel, this.replyMessage, this.command, this.args);
        }

        public final Builder withArgs(String args) {
            this.args = args;
            return this;
        }

        public final Builder withAttachments(List<Attachment> attachments) {
            attachments.getClass();
            this.attachments = attachments;
            return this;
        }

        public final Builder withCid(String cid) {
            cid.getClass();
            this.cid = cid;
            return this;
        }

        public final Builder withCommand(String command) {
            this.command = command;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            extraData.getClass();
            this.extraData = extraData;
            return this;
        }

        public final Builder withId(String id) {
            id.getClass();
            this.id = id;
            return this;
        }

        public final Builder withMentionedUsersIds(List<String> mentionedUsersIds) {
            mentionedUsersIds.getClass();
            this.mentionedUsersIds = mentionedUsersIds;
            return this;
        }

        public final Builder withParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public final Builder withReplyMessage(Message replyMessage) {
            this.replyMessage = replyMessage;
            return this;
        }

        public final Builder withShowInChannel(boolean showInChannel) {
            this.showInChannel = showInChannel;
            return this;
        }

        public final Builder withSilent(boolean silent) {
            this.silent = silent;
            return this;
        }

        public final Builder withText(String text) {
            text.getClass();
            this.text = text;
            return this;
        }

        public Builder() {
            this.id = "";
            this.cid = "";
            this.text = "";
            this.attachments = CollectionsKt.emptyList();
            this.mentionedUsersIds = CollectionsKt.emptyList();
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.extraData = zc7Var;
        }
    }

    public DraftMessage(String str, String str2, String str3, String str4, List<Attachment> list, List<String> list2, Map<String, ? extends Object> map, boolean z, boolean z2, Message message, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.id = str;
        this.cid = str2;
        this.text = str3;
        this.parentId = str4;
        this.attachments = list;
        this.mentionedUsersIds = list2;
        this.extraData = map;
        this.silent = z;
        this.showInChannel = z2;
        this.replyMessage = message;
        this.command = str5;
        this.args = str6;
    }

    public DraftMessage() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, 4095, null);
    }
}
