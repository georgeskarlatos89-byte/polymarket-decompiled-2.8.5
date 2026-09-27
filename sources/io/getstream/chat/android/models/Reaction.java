package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.d1c;
import defpackage.hdi;
import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001KB«\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u00102\u001a\u00020\u0004J\u0016\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001042\u0006\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u000207H\u0007J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010<\u001a\u00020\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u00ad\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010G\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u001c¨\u0006L"}, d2 = {"Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "messageId", "", "type", "score", "", "user", "Lio/getstream/chat/android/models/User;", "userId", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "deletedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "extraData", "", "", "enforceUnique", "", "skipPush", "emojiCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getType", "getScore", "()I", "getUser", "()Lio/getstream/chat/android/models/User;", "getUserId", "getCreatedAt", "()Ljava/util/Date;", "getCreatedLocallyAt", "getUpdatedAt", "getDeletedAt", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getExtraData", "()Ljava/util/Map;", "getEnforceUnique", "()Z", "getSkipPush", "getEmojiCode", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "fetchUserId", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/Reaction$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Reaction implements CustomObject, ComparableFieldProvider {
    private final Date createdAt;
    private final Date createdLocallyAt;
    private final Date deletedAt;
    private final String emojiCode;
    private final boolean enforceUnique;
    private final Map<String, Object> extraData;
    private final String messageId;
    private final int score;
    private final boolean skipPush;
    private final SyncStatus syncStatus;
    private final String type;
    private final Date updatedAt;
    private final User user;
    private final String userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Reaction(String str, String str2, int i, User user, String str3, Date date, Date date2, Date date3, Date date4, SyncStatus syncStatus, Map map, boolean z, boolean z2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r2, r8, r9, r10, r11, r12, r13, r14, r5, r31);
        String str5;
        String str6;
        int i3;
        User user2;
        Date date5;
        Date date6;
        Date date7;
        Date date8;
        SyncStatus syncStatus2;
        Map map2;
        boolean z3;
        String str7;
        if ((i2 & 1) != 0) {
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            user2 = null;
        } else {
            user2 = user;
        }
        String str8 = (i2 & 16) == 0 ? str3 : "";
        if ((i2 & 32) != 0) {
            date5 = null;
        } else {
            date5 = date;
        }
        if ((i2 & 64) != 0) {
            date6 = null;
        } else {
            date6 = date2;
        }
        if ((i2 & 128) != 0) {
            date7 = null;
        } else {
            date7 = date3;
        }
        if ((i2 & 256) != 0) {
            date8 = null;
        } else {
            date8 = date4;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            syncStatus2 = SyncStatus.COMPLETED;
        } else {
            syncStatus2 = syncStatus;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            map2 = zc7.a;
            map2.getClass();
        } else {
            map2 = map;
        }
        if ((i2 & 2048) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i2 & 4096) == 0 ? z2 : false;
        if ((i2 & 8192) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, String str2, int i, User user, String str3, Date date, Date date2, Date date3, Date date4, SyncStatus syncStatus, Map map, boolean z, boolean z2, String str4, int i2, Object obj) {
        String str5;
        String str6;
        int i3;
        User user2;
        String str7;
        Date date5;
        Date date6;
        Date date7;
        Date date8;
        SyncStatus syncStatus2;
        Map map2;
        boolean z3;
        boolean z4;
        String str8;
        if ((i2 & 1) != 0) {
            str5 = reaction.messageId;
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            str6 = reaction.type;
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            i3 = reaction.score;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            user2 = reaction.user;
        } else {
            user2 = user;
        }
        if ((i2 & 16) != 0) {
            str7 = reaction.userId;
        } else {
            str7 = str3;
        }
        if ((i2 & 32) != 0) {
            date5 = reaction.createdAt;
        } else {
            date5 = date;
        }
        if ((i2 & 64) != 0) {
            date6 = reaction.createdLocallyAt;
        } else {
            date6 = date2;
        }
        if ((i2 & 128) != 0) {
            date7 = reaction.updatedAt;
        } else {
            date7 = date3;
        }
        if ((i2 & 256) != 0) {
            date8 = reaction.deletedAt;
        } else {
            date8 = date4;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            syncStatus2 = reaction.syncStatus;
        } else {
            syncStatus2 = syncStatus;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            map2 = reaction.extraData;
        } else {
            map2 = map;
        }
        if ((i2 & 2048) != 0) {
            z3 = reaction.enforceUnique;
        } else {
            z3 = z;
        }
        if ((i2 & 4096) != 0) {
            z4 = reaction.skipPush;
        } else {
            z4 = z2;
        }
        if ((i2 & 8192) != 0) {
            str8 = reaction.emojiCode;
        } else {
            str8 = str4;
        }
        return reaction.copy(str5, str6, i3, user2, str7, date5, date6, date7, date8, syncStatus2, map2, z3, z4, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component10, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final Map<String, Object> component11() {
        return this.extraData;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getEnforceUnique() {
        return this.enforceUnique;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSkipPush() {
        return this.skipPush;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEmojiCode() {
        return this.emojiCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final Reaction copy(String messageId, String type, int score, User user, String userId, Date createdAt, Date createdLocallyAt, Date updatedAt, Date deletedAt, SyncStatus syncStatus, Map<String, ? extends Object> extraData, boolean enforceUnique, boolean skipPush, String emojiCode) {
        messageId.getClass();
        type.getClass();
        userId.getClass();
        syncStatus.getClass();
        extraData.getClass();
        return new Reaction(messageId, type, score, user, userId, createdAt, createdLocallyAt, updatedAt, deletedAt, syncStatus, extraData, enforceUnique, skipPush, emojiCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) other;
        if (Intrinsics.areEqual(this.messageId, reaction.messageId) && Intrinsics.areEqual(this.type, reaction.type) && this.score == reaction.score && Intrinsics.areEqual(this.user, reaction.user) && Intrinsics.areEqual(this.userId, reaction.userId) && Intrinsics.areEqual(this.createdAt, reaction.createdAt) && Intrinsics.areEqual(this.createdLocallyAt, reaction.createdLocallyAt) && Intrinsics.areEqual(this.updatedAt, reaction.updatedAt) && Intrinsics.areEqual(this.deletedAt, reaction.deletedAt) && this.syncStatus == reaction.syncStatus && Intrinsics.areEqual(this.extraData, reaction.extraData) && this.enforceUnique == reaction.enforceUnique && this.skipPush == reaction.skipPush && Intrinsics.areEqual(this.emojiCode, reaction.emojiCode)) {
            return true;
        }
        return false;
    }

    public final String fetchUserId() {
        String id;
        User user = this.user;
        if (user != null && (id = user.getId()) != null) {
            return id;
        }
        return this.userId;
    }

    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        if (!Intrinsics.areEqual(fieldName, "created_at") && !Intrinsics.areEqual(fieldName, "createdAt")) {
            Object obj = getExtraData().get(fieldName);
            if (obj instanceof Comparable) {
                return (Comparable) obj;
            }
            return null;
        }
        return this.createdAt;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final boolean getEnforceUnique() {
        return this.enforceUnique;
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
        return this.messageId + this.type + this.score + fetchUserId();
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int getScore() {
        return this.score;
    }

    public final boolean getSkipPush() {
        return this.skipPush;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int b = woa.b(this.score, hdi.e(this.messageId.hashCode() * 31, 31, this.type), 31);
        User user = this.user;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int e = hdi.e((b + hashCode) * 31, 31, this.userId);
        Date date = this.createdAt;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        Date date2 = this.createdLocallyAt;
        if (date2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Date date3 = this.updatedAt;
        if (date3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Date date4 = this.deletedAt;
        if (date4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date4.hashCode();
        }
        int g = hdi.g(hdi.g(sv6.c(this.extraData, (this.syncStatus.hashCode() + ((i4 + hashCode5) * 31)) * 31, 31), 31, this.enforceUnique), 31, this.skipPush);
        String str = this.emojiCode;
        if (str != null) {
            i = str.hashCode();
        }
        return g + i;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.type;
        int i = this.score;
        User user = this.user;
        String str3 = this.userId;
        Date date = this.createdAt;
        Date date2 = this.createdLocallyAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        SyncStatus syncStatus = this.syncStatus;
        Map<String, Object> map = this.extraData;
        boolean z = this.enforceUnique;
        boolean z2 = this.skipPush;
        String str4 = this.emojiCode;
        StringBuilder r = m51.r("Reaction(messageId=", str, ", type=", str2, ", score=");
        r.append(i);
        r.append(", user=");
        r.append(user);
        r.append(", userId=");
        sv6.A(r, str3, ", createdAt=", date, ", createdLocallyAt=");
        sv6.B(r, date2, ", updatedAt=", date3, ", deletedAt=");
        r.append(date4);
        r.append(", syncStatus=");
        r.append(syncStatus);
        r.append(", extraData=");
        r.append(map);
        r.append(", enforceUnique=");
        r.append(z);
        r.append(", skipPush=");
        r.append(z2);
        r.append(", emojiCode=");
        r.append(str4);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010%\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0017J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u0006\u0010(\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lio/getstream/chat/android/models/Reaction$Builder;", "", "<init>", "()V", MetricTracker.Object.REACTION, "Lio/getstream/chat/android/models/Reaction;", "(Lio/getstream/chat/android/models/Reaction;)V", "messageId", "", "type", "score", "", "user", "Lio/getstream/chat/android/models/User;", "userId", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "deletedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "extraData", "", "enforceUnique", "", "emojiCode", "withMessageId", "withType", "withScore", "withUser", "withUserId", "withCreatedAt", "withCreatedLocallyAt", "withUpdatedAt", "withDeletedAt", "withSyncStatus", "withExtraData", "withEnforceUnique", "withEmojiCode", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private Date createdAt;
        private Date createdLocallyAt;
        private Date deletedAt;
        private String emojiCode;
        private boolean enforceUnique;
        private Map<String, ? extends Object> extraData;
        private String messageId;
        private int score;
        private SyncStatus syncStatus;
        private String type;
        private Date updatedAt;
        private User user;
        private String userId;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Reaction reaction) {
            this();
            reaction.getClass();
            this.messageId = reaction.getMessageId();
            this.type = reaction.getType();
            this.score = reaction.getScore();
            this.user = reaction.getUser();
            this.userId = reaction.getUserId();
            this.createdAt = reaction.getCreatedAt();
            this.createdLocallyAt = reaction.getCreatedLocallyAt();
            this.updatedAt = reaction.getUpdatedAt();
            this.deletedAt = reaction.getDeletedAt();
            this.syncStatus = reaction.getSyncStatus();
            this.extraData = reaction.getExtraData();
            this.enforceUnique = reaction.getEnforceUnique();
            this.emojiCode = reaction.getEmojiCode();
        }

        public final Reaction build() {
            return new Reaction(this.messageId, this.type, this.score, this.user, this.userId, this.createdAt, this.createdLocallyAt, this.updatedAt, this.deletedAt, this.syncStatus, d1c.p(this.extraData), this.enforceUnique, false, this.emojiCode, 4096, null);
        }

        public final Builder messageId(String messageId) {
            messageId.getClass();
            this.messageId = messageId;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedLocallyAt(Date createdLocallyAt) {
            this.createdLocallyAt = createdLocallyAt;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withEmojiCode(String emojiCode) {
            this.emojiCode = emojiCode;
            return this;
        }

        public final Builder withEnforceUnique(boolean enforceUnique) {
            this.enforceUnique = enforceUnique;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            extraData.getClass();
            this.extraData = extraData;
            return this;
        }

        public final Builder withMessageId(String messageId) {
            messageId.getClass();
            this.messageId = messageId;
            return this;
        }

        public final Builder withScore(int score) {
            this.score = score;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            syncStatus.getClass();
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withType(String type) {
            type.getClass();
            this.type = type;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withUser(User user) {
            this.user = user;
            return this;
        }

        public final Builder withUserId(String userId) {
            userId.getClass();
            this.userId = userId;
            return this;
        }

        public Builder() {
            this.messageId = "";
            this.type = "";
            this.userId = "";
            this.syncStatus = SyncStatus.COMPLETED;
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.extraData = zc7Var;
        }
    }

    public Reaction(String str, String str2, int i, User user, String str3, Date date, Date date2, Date date3, Date date4, SyncStatus syncStatus, Map<String, ? extends Object> map, boolean z, boolean z2, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        syncStatus.getClass();
        map.getClass();
        this.messageId = str;
        this.type = str2;
        this.score = i;
        this.user = user;
        this.userId = str3;
        this.createdAt = date;
        this.createdLocallyAt = date2;
        this.updatedAt = date3;
        this.deletedAt = date4;
        this.syncStatus = syncStatus;
        this.extraData = map;
        this.enforceUnique = z;
        this.skipPush = z2;
        this.emojiCode = str4;
    }

    public Reaction() {
        this(null, null, 0, null, null, null, null, null, null, null, null, false, false, null, 16383, null);
    }
}
