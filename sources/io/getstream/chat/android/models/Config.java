package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.woa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0018HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003J£\u0002\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010_\u001a\u00020\b2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0018HÖ\u0001J\t\u0010b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010+R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010+R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)¨\u0006c"}, d2 = {"Lio/getstream/chat/android/models/Config;", "", "createdAt", "Ljava/util/Date;", "updatedAt", Keys.KEY_NAME, "", "typingEventsEnabled", "", "readEventsEnabled", "deliveryEventsEnabled", "connectEventsEnabled", "searchEnabled", "isReactionsEnabled", "isThreadEnabled", "muteEnabled", "uploadsEnabled", "urlEnrichmentEnabled", "customEventsEnabled", "pushNotificationsEnabled", "skipLastMsgUpdateForSystemMsgs", "pollsEnabled", "messageRetention", "maxMessageLength", "", "automod", "automodBehavior", "blocklistBehavior", "commands", "", "Lio/getstream/chat/android/models/Command;", "messageRemindersEnabled", "sharedLocationsEnabled", "markMessagesPending", "pushLevel", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getName", "()Ljava/lang/String;", "getTypingEventsEnabled", "()Z", "getReadEventsEnabled", "getDeliveryEventsEnabled", "getConnectEventsEnabled", "getSearchEnabled", "getMuteEnabled", "getUploadsEnabled", "getUrlEnrichmentEnabled", "getCustomEventsEnabled", "getPushNotificationsEnabled", "getSkipLastMsgUpdateForSystemMsgs", "getPollsEnabled", "getMessageRetention", "getMaxMessageLength", "()I", "getAutomod", "getAutomodBehavior", "getBlocklistBehavior", "getCommands", "()Ljava/util/List;", "getMessageRemindersEnabled", "getSharedLocationsEnabled", "getMarkMessagesPending", "getPushLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Config {
    private final String automod;
    private final String automodBehavior;
    private final String blocklistBehavior;
    private final List<Command> commands;
    private final boolean connectEventsEnabled;
    private final Date createdAt;
    private final boolean customEventsEnabled;
    private final boolean deliveryEventsEnabled;
    private final boolean isReactionsEnabled;
    private final boolean isThreadEnabled;
    private final boolean markMessagesPending;
    private final int maxMessageLength;
    private final boolean messageRemindersEnabled;
    private final String messageRetention;
    private final boolean muteEnabled;
    private final String name;
    private final boolean pollsEnabled;
    private final String pushLevel;
    private final boolean pushNotificationsEnabled;
    private final boolean readEventsEnabled;
    private final boolean searchEnabled;
    private final boolean sharedLocationsEnabled;
    private final boolean skipLastMsgUpdateForSystemMsgs;
    private final boolean typingEventsEnabled;
    private final Date updatedAt;
    private final boolean uploadsEnabled;
    private final boolean urlEnrichmentEnabled;

    public /* synthetic */ Config(Date date, Date date2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i, String str3, String str4, String str5, List list, boolean z15, boolean z16, boolean z17, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : date, (i2 & 2) != 0 ? null : date2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? true : z4, (i2 & 128) != 0 ? true : z5, (i2 & 256) != 0 ? true : z6, (i2 & Barcode.FORMAT_UPC_A) != 0 ? true : z7, (i2 & Barcode.FORMAT_UPC_E) != 0 ? true : z8, (i2 & 2048) != 0 ? true : z9, (i2 & 4096) != 0 ? true : z10, (i2 & 8192) != 0 ? false : z11, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z12, (i2 & 32768) != 0 ? false : z13, (i2 & 65536) != 0 ? false : z14, (i2 & 131072) != 0 ? "infinite" : str2, (i2 & 262144) != 0 ? 5000 : i, (i2 & 524288) != 0 ? "disabled" : str3, (i2 & 1048576) != 0 ? "" : str4, (i2 & 2097152) == 0 ? str5 : "", (i2 & 4194304) != 0 ? new ArrayList() : list, (i2 & 8388608) != 0 ? false : z15, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z16, (i2 & 33554432) == 0 ? z17 : false, (i2 & 67108864) != 0 ? null : str6);
    }

    public static /* synthetic */ Config copy$default(Config config, Date date, Date date2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i, String str3, String str4, String str5, List list, boolean z15, boolean z16, boolean z17, String str6, int i2, Object obj) {
        String str7;
        boolean z18;
        Date date3 = (i2 & 1) != 0 ? config.createdAt : date;
        Date date4 = (i2 & 2) != 0 ? config.updatedAt : date2;
        String str8 = (i2 & 4) != 0 ? config.name : str;
        boolean z19 = (i2 & 8) != 0 ? config.typingEventsEnabled : z;
        boolean z20 = (i2 & 16) != 0 ? config.readEventsEnabled : z2;
        boolean z21 = (i2 & 32) != 0 ? config.deliveryEventsEnabled : z3;
        boolean z22 = (i2 & 64) != 0 ? config.connectEventsEnabled : z4;
        boolean z23 = (i2 & 128) != 0 ? config.searchEnabled : z5;
        boolean z24 = (i2 & 256) != 0 ? config.isReactionsEnabled : z6;
        boolean z25 = (i2 & Barcode.FORMAT_UPC_A) != 0 ? config.isThreadEnabled : z7;
        boolean z26 = (i2 & Barcode.FORMAT_UPC_E) != 0 ? config.muteEnabled : z8;
        boolean z27 = (i2 & 2048) != 0 ? config.uploadsEnabled : z9;
        boolean z28 = (i2 & 4096) != 0 ? config.urlEnrichmentEnabled : z10;
        boolean z29 = (i2 & 8192) != 0 ? config.customEventsEnabled : z11;
        Date date5 = date3;
        boolean z30 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? config.pushNotificationsEnabled : z12;
        boolean z31 = (i2 & 32768) != 0 ? config.skipLastMsgUpdateForSystemMsgs : z13;
        boolean z32 = (i2 & 65536) != 0 ? config.pollsEnabled : z14;
        String str9 = (i2 & 131072) != 0 ? config.messageRetention : str2;
        int i3 = (i2 & 262144) != 0 ? config.maxMessageLength : i;
        String str10 = (i2 & 524288) != 0 ? config.automod : str3;
        String str11 = (i2 & 1048576) != 0 ? config.automodBehavior : str4;
        String str12 = (i2 & 2097152) != 0 ? config.blocklistBehavior : str5;
        List list2 = (i2 & 4194304) != 0 ? config.commands : list;
        boolean z33 = (i2 & 8388608) != 0 ? config.messageRemindersEnabled : z15;
        boolean z34 = (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? config.sharedLocationsEnabled : z16;
        boolean z35 = (i2 & 33554432) != 0 ? config.markMessagesPending : z17;
        if ((i2 & 67108864) != 0) {
            z18 = z35;
            str7 = config.pushLevel;
        } else {
            str7 = str6;
            z18 = z35;
        }
        return config.copy(date5, date4, str8, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, str9, i3, str10, str11, str12, list2, z33, z34, z18, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsThreadEnabled() {
        return this.isThreadEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getMuteEnabled() {
        return this.muteEnabled;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getUploadsEnabled() {
        return this.uploadsEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUrlEnrichmentEnabled() {
        return this.urlEnrichmentEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getCustomEventsEnabled() {
        return this.customEventsEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getSkipLastMsgUpdateForSystemMsgs() {
        return this.skipLastMsgUpdateForSystemMsgs;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final String getMessageRetention() {
        return this.messageRetention;
    }

    /* renamed from: component19, reason: from getter */
    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAutomod() {
        return this.automod;
    }

    /* renamed from: component21, reason: from getter */
    public final String getAutomodBehavior() {
        return this.automodBehavior;
    }

    /* renamed from: component22, reason: from getter */
    public final String getBlocklistBehavior() {
        return this.blocklistBehavior;
    }

    public final List<Command> component23() {
        return this.commands;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getMessageRemindersEnabled() {
        return this.messageRemindersEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getSharedLocationsEnabled() {
        return this.sharedLocationsEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getMarkMessagesPending() {
        return this.markMessagesPending;
    }

    /* renamed from: component27, reason: from getter */
    public final String getPushLevel() {
        return this.pushLevel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTypingEventsEnabled() {
        return this.typingEventsEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReadEventsEnabled() {
        return this.readEventsEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDeliveryEventsEnabled() {
        return this.deliveryEventsEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getConnectEventsEnabled() {
        return this.connectEventsEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSearchEnabled() {
        return this.searchEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    public final Config copy(Date createdAt, Date updatedAt, String name, boolean typingEventsEnabled, boolean readEventsEnabled, boolean deliveryEventsEnabled, boolean connectEventsEnabled, boolean searchEnabled, boolean isReactionsEnabled, boolean isThreadEnabled, boolean muteEnabled, boolean uploadsEnabled, boolean urlEnrichmentEnabled, boolean customEventsEnabled, boolean pushNotificationsEnabled, boolean skipLastMsgUpdateForSystemMsgs, boolean pollsEnabled, String messageRetention, int maxMessageLength, String automod, String automodBehavior, String blocklistBehavior, List<Command> commands, boolean messageRemindersEnabled, boolean sharedLocationsEnabled, boolean markMessagesPending, String pushLevel) {
        k84.p(name, messageRetention, automod, automodBehavior, blocklistBehavior);
        commands.getClass();
        return new Config(createdAt, updatedAt, name, typingEventsEnabled, readEventsEnabled, deliveryEventsEnabled, connectEventsEnabled, searchEnabled, isReactionsEnabled, isThreadEnabled, muteEnabled, uploadsEnabled, urlEnrichmentEnabled, customEventsEnabled, pushNotificationsEnabled, skipLastMsgUpdateForSystemMsgs, pollsEnabled, messageRetention, maxMessageLength, automod, automodBehavior, blocklistBehavior, commands, messageRemindersEnabled, sharedLocationsEnabled, markMessagesPending, pushLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        if (Intrinsics.areEqual(this.createdAt, config.createdAt) && Intrinsics.areEqual(this.updatedAt, config.updatedAt) && Intrinsics.areEqual(this.name, config.name) && this.typingEventsEnabled == config.typingEventsEnabled && this.readEventsEnabled == config.readEventsEnabled && this.deliveryEventsEnabled == config.deliveryEventsEnabled && this.connectEventsEnabled == config.connectEventsEnabled && this.searchEnabled == config.searchEnabled && this.isReactionsEnabled == config.isReactionsEnabled && this.isThreadEnabled == config.isThreadEnabled && this.muteEnabled == config.muteEnabled && this.uploadsEnabled == config.uploadsEnabled && this.urlEnrichmentEnabled == config.urlEnrichmentEnabled && this.customEventsEnabled == config.customEventsEnabled && this.pushNotificationsEnabled == config.pushNotificationsEnabled && this.skipLastMsgUpdateForSystemMsgs == config.skipLastMsgUpdateForSystemMsgs && this.pollsEnabled == config.pollsEnabled && Intrinsics.areEqual(this.messageRetention, config.messageRetention) && this.maxMessageLength == config.maxMessageLength && Intrinsics.areEqual(this.automod, config.automod) && Intrinsics.areEqual(this.automodBehavior, config.automodBehavior) && Intrinsics.areEqual(this.blocklistBehavior, config.blocklistBehavior) && Intrinsics.areEqual(this.commands, config.commands) && this.messageRemindersEnabled == config.messageRemindersEnabled && this.sharedLocationsEnabled == config.sharedLocationsEnabled && this.markMessagesPending == config.markMessagesPending && Intrinsics.areEqual(this.pushLevel, config.pushLevel)) {
            return true;
        }
        return false;
    }

    public final String getAutomod() {
        return this.automod;
    }

    public final String getAutomodBehavior() {
        return this.automodBehavior;
    }

    public final String getBlocklistBehavior() {
        return this.blocklistBehavior;
    }

    public final List<Command> getCommands() {
        return this.commands;
    }

    public final boolean getConnectEventsEnabled() {
        return this.connectEventsEnabled;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getCustomEventsEnabled() {
        return this.customEventsEnabled;
    }

    public final boolean getDeliveryEventsEnabled() {
        return this.deliveryEventsEnabled;
    }

    public final boolean getMarkMessagesPending() {
        return this.markMessagesPending;
    }

    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    public final boolean getMessageRemindersEnabled() {
        return this.messageRemindersEnabled;
    }

    public final String getMessageRetention() {
        return this.messageRetention;
    }

    public final boolean getMuteEnabled() {
        return this.muteEnabled;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    public final String getPushLevel() {
        return this.pushLevel;
    }

    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    public final boolean getReadEventsEnabled() {
        return this.readEventsEnabled;
    }

    public final boolean getSearchEnabled() {
        return this.searchEnabled;
    }

    public final boolean getSharedLocationsEnabled() {
        return this.sharedLocationsEnabled;
    }

    public final boolean getSkipLastMsgUpdateForSystemMsgs() {
        return this.skipLastMsgUpdateForSystemMsgs;
    }

    public final boolean getTypingEventsEnabled() {
        return this.typingEventsEnabled;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean getUploadsEnabled() {
        return this.uploadsEnabled;
    }

    public final boolean getUrlEnrichmentEnabled() {
        return this.urlEnrichmentEnabled;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Date date = this.createdAt;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = hashCode * 31;
        Date date2 = this.updatedAt;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int g = hdi.g(hdi.g(hdi.g(hdi.f(hdi.e(hdi.e(hdi.e(woa.b(this.maxMessageLength, hdi.e(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.e((i2 + hashCode2) * 31, 31, this.name), 31, this.typingEventsEnabled), 31, this.readEventsEnabled), 31, this.deliveryEventsEnabled), 31, this.connectEventsEnabled), 31, this.searchEnabled), 31, this.isReactionsEnabled), 31, this.isThreadEnabled), 31, this.muteEnabled), 31, this.uploadsEnabled), 31, this.urlEnrichmentEnabled), 31, this.customEventsEnabled), 31, this.pushNotificationsEnabled), 31, this.skipLastMsgUpdateForSystemMsgs), 31, this.pollsEnabled), 31, this.messageRetention), 31), 31, this.automod), 31, this.automodBehavior), 31, this.blocklistBehavior), 31, this.commands), 31, this.messageRemindersEnabled), 31, this.sharedLocationsEnabled), 31, this.markMessagesPending);
        String str = this.pushLevel;
        if (str != null) {
            i = str.hashCode();
        }
        return g + i;
    }

    public final boolean isReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    public final boolean isThreadEnabled() {
        return this.isThreadEnabled;
    }

    public String toString() {
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        String str = this.name;
        boolean z = this.typingEventsEnabled;
        boolean z2 = this.readEventsEnabled;
        boolean z3 = this.deliveryEventsEnabled;
        boolean z4 = this.connectEventsEnabled;
        boolean z5 = this.searchEnabled;
        boolean z6 = this.isReactionsEnabled;
        boolean z7 = this.isThreadEnabled;
        boolean z8 = this.muteEnabled;
        boolean z9 = this.uploadsEnabled;
        boolean z10 = this.urlEnrichmentEnabled;
        boolean z11 = this.customEventsEnabled;
        boolean z12 = this.pushNotificationsEnabled;
        boolean z13 = this.skipLastMsgUpdateForSystemMsgs;
        boolean z14 = this.pollsEnabled;
        String str2 = this.messageRetention;
        int i = this.maxMessageLength;
        String str3 = this.automod;
        String str4 = this.automodBehavior;
        String str5 = this.blocklistBehavior;
        List<Command> list = this.commands;
        boolean z15 = this.messageRemindersEnabled;
        boolean z16 = this.sharedLocationsEnabled;
        boolean z17 = this.markMessagesPending;
        String str6 = this.pushLevel;
        StringBuilder sb = new StringBuilder("Config(createdAt=");
        sb.append(date);
        sb.append(", updatedAt=");
        sb.append(date2);
        sb.append(", name=");
        ace.A(str, ", typingEventsEnabled=", ", readEventsEnabled=", sb, z);
        hdi.B(sb, z2, ", deliveryEventsEnabled=", z3, ", connectEventsEnabled=");
        hdi.B(sb, z4, ", searchEnabled=", z5, ", isReactionsEnabled=");
        hdi.B(sb, z6, ", isThreadEnabled=", z7, ", muteEnabled=");
        hdi.B(sb, z8, ", uploadsEnabled=", z9, ", urlEnrichmentEnabled=");
        hdi.B(sb, z10, ", customEventsEnabled=", z11, ", pushNotificationsEnabled=");
        hdi.B(sb, z12, ", skipLastMsgUpdateForSystemMsgs=", z13, ", pollsEnabled=");
        m51.y(", messageRetention=", str2, ", maxMessageLength=", sb, z14);
        woa.u(i, ", automod=", str3, ", automodBehavior=", sb);
        k84.q(sb, str4, ", blocklistBehavior=", str5, ", commands=");
        sb.append(list);
        sb.append(", messageRemindersEnabled=");
        sb.append(z15);
        sb.append(", sharedLocationsEnabled=");
        hdi.B(sb, z16, ", markMessagesPending=", z17, ", pushLevel=");
        return woa.r(sb, str6, ")");
    }

    public Config(Date date, Date date2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i, String str3, String str4, String str5, List<Command> list, boolean z15, boolean z16, boolean z17, String str6) {
        k84.p(str, str2, str3, str4, str5);
        list.getClass();
        this.createdAt = date;
        this.updatedAt = date2;
        this.name = str;
        this.typingEventsEnabled = z;
        this.readEventsEnabled = z2;
        this.deliveryEventsEnabled = z3;
        this.connectEventsEnabled = z4;
        this.searchEnabled = z5;
        this.isReactionsEnabled = z6;
        this.isThreadEnabled = z7;
        this.muteEnabled = z8;
        this.uploadsEnabled = z9;
        this.urlEnrichmentEnabled = z10;
        this.customEventsEnabled = z11;
        this.pushNotificationsEnabled = z12;
        this.skipLastMsgUpdateForSystemMsgs = z13;
        this.pollsEnabled = z14;
        this.messageRetention = str2;
        this.maxMessageLength = i;
        this.automod = str3;
        this.automodBehavior = str4;
        this.blocklistBehavior = str5;
        this.commands = list;
        this.messageRemindersEnabled = z15;
        this.sharedLocationsEnabled = z16;
        this.markMessagesPending = z17;
        this.pushLevel = str6;
    }

    public Config() {
        this(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, null, 134217727, null);
    }
}
