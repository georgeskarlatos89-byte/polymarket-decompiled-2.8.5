package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.d1c;
import defpackage.djj;
import defpackage.fl6;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.n6f;
import defpackage.sv6;
import defpackage.uof;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0084\u0001BÉ\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001d\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0\u001d\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010,2\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00103J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u00103J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u00108J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bH\u0010FJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eHÆ\u0003¢\u0006\u0004\bI\u0010>J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003¢\u0006\u0004\bJ\u0010>J\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eHÆ\u0003¢\u0006\u0004\bM\u0010>J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003¢\u0006\u0004\bN\u0010>J\u0012\u0010O\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u001c\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0\u001dHÆ\u0003¢\u0006\u0004\bS\u0010LJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bT\u0010BJÒ\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bW\u00103J\u0010\u0010X\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\bX\u0010FJ\u001a\u0010Z\u001a\u00020\b2\b\u0010Y\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\\\u001a\u0004\b]\u00103R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b^\u00103R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\\\u001a\u0004\b_\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\\\u001a\u0004\b`\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010c\u001a\u0004\bd\u0010:R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\be\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010a\u001a\u0004\bf\u00108R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bh\u0010>R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010i\u001a\u0004\bj\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\bl\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010k\u001a\u0004\bm\u0010BR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\bn\u0010BR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bp\u0010FR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010o\u001a\u0004\bq\u0010FR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\br\u0010FR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010g\u001a\u0004\bs\u0010>R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010g\u001a\u0004\bt\u0010>R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010u\u001a\u0004\bv\u0010LR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\bw\u0010>R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010g\u001a\u0004\bx\u0010>R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010y\u001a\u0004\bz\u0010PR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010{\u001a\u0004\b|\u0010RR&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010u\u001a\u0004\b}\u0010LR\u0019\u0010(\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u0010k\u001a\u0004\b~\u0010BR\u0011\u0010\u007f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010@R\u0013\u0010\u0080\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010@R\u0013\u0010\u0081\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010@R\u0013\u0010\u0082\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010@R\u0013\u0010\u0083\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010@¨\u0006\u0085\u0001"}, d2 = {"Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "role", Keys.KEY_NAME, "image", "", "invisible", "Ln6f;", "privacySettings", Keys.KEY_LANGUAGE, "banned", "", "Lio/getstream/chat/android/models/Device;", "devices", "online", "Ljava/util/Date;", "createdAt", "updatedAt", "lastActive", "", "totalUnreadCount", "unreadChannels", "unreadThreads", "Lio/getstream/chat/android/models/Mute;", "mutes", "teams", "", "teamsRole", "Lio/getstream/chat/android/models/ChannelMute;", "channelMutes", "blockedUserIds", "", "avgResponseTime", "Lio/getstream/chat/android/models/PushPreference;", "pushPreference", "", "extraData", "deactivatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ln6f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V", "fieldName", "", "getComparableField", "(Ljava/lang/String;)Ljava/lang/Comparable;", "Lio/getstream/chat/android/models/User$Builder;", "newBuilder", "()Lio/getstream/chat/android/models/User$Builder;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Ln6f;", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Z", "component11", "()Ljava/util/Date;", "component12", "component13", "component14", "()I", "component15", "component16", "component17", "component18", "component19", "()Ljava/util/Map;", "component20", "component21", "component22", "()Ljava/lang/Long;", "component23", "()Lio/getstream/chat/android/models/PushPreference;", "component24", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ln6f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)Lio/getstream/chat/android/models/User;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getRole", "getName", "getImage", "Ljava/lang/Boolean;", "getInvisible", "Ln6f;", "getPrivacySettings", "getLanguage", "getBanned", "Ljava/util/List;", "getDevices", "Z", "getOnline", "Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "getLastActive", "I", "getTotalUnreadCount", "getUnreadChannels", "getUnreadThreads", "getMutes", "getTeams", "Ljava/util/Map;", "getTeamsRole", "getChannelMutes", "getBlockedUserIds", "Ljava/lang/Long;", "getAvgResponseTime", "Lio/getstream/chat/android/models/PushPreference;", "getPushPreference", "getExtraData", "getDeactivatedAt", "isBanned", "isInvisible", "isTypingIndicatorsEnabled", "isReadReceiptsEnabled", "isDeliveryReceiptsEnabled", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class User implements CustomObject, ComparableFieldProvider {
    private final Long avgResponseTime;
    private final Boolean banned;
    private final List<String> blockedUserIds;
    private final List<ChannelMute> channelMutes;
    private final Date createdAt;
    private final Date deactivatedAt;
    private final List<Device> devices;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final Boolean invisible;
    private final String language;
    private final Date lastActive;
    private final List<Mute> mutes;
    private final String name;
    private final boolean online;
    private final n6f privacySettings;
    private final PushPreference pushPreference;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teamsRole;
    private final int totalUnreadCount;
    private final int unreadChannels;
    private final int unreadThreads;
    private final Date updatedAt;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public User(String str, String str2, String str3, String str4, Boolean bool, n6f n6fVar, String str5, Boolean bool2, List list, boolean z, Date date, Date date2, Date date3, int i, int i2, int i3, List list2, List list3, Map map, List list4, List list5, Long l, PushPreference pushPreference, Map map2, Date date4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r8, r2, r9, r10, r11, r13, r14, r15, r7, r12, r16, r17, r18, r19, r20, r21, r22, r23, r24, (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : date4);
        Map map3;
        Map map4;
        String str6 = (i4 & 1) != 0 ? "" : str;
        String str7 = (i4 & 2) != 0 ? "" : str2;
        String str8 = (i4 & 4) != 0 ? "" : str3;
        String str9 = (i4 & 8) != 0 ? "" : str4;
        Boolean bool3 = (i4 & 16) != 0 ? null : bool;
        n6f n6fVar2 = (i4 & 32) != 0 ? null : n6fVar;
        String str10 = (i4 & 64) == 0 ? str5 : "";
        Boolean bool4 = (i4 & 128) != 0 ? null : bool2;
        List emptyList = (i4 & 256) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i4 & Barcode.FORMAT_UPC_A) != 0 ? false : z;
        Date date5 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : date;
        Date date6 = (i4 & 2048) != 0 ? null : date2;
        Date date7 = (i4 & 4096) != 0 ? null : date3;
        int i5 = (i4 & 8192) != 0 ? 0 : i;
        int i6 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i2;
        int i7 = (i4 & 32768) != 0 ? 0 : i3;
        List emptyList2 = (i4 & 65536) != 0 ? CollectionsKt.emptyList() : list2;
        List emptyList3 = (i4 & 131072) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i4 & 262144) != 0) {
            map3 = zc7.a;
            map3.getClass();
        } else {
            map3 = map;
        }
        List emptyList4 = (i4 & 524288) != 0 ? CollectionsKt.emptyList() : list4;
        List emptyList5 = (i4 & 1048576) != 0 ? CollectionsKt.emptyList() : list5;
        Long l2 = (i4 & 2097152) != 0 ? null : l;
        PushPreference pushPreference2 = (i4 & 4194304) != 0 ? null : pushPreference;
        if ((i4 & 8388608) != 0) {
            map4 = zc7.a;
            map4.getClass();
        } else {
            map4 = map2;
        }
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, Boolean bool, n6f n6fVar, String str5, Boolean bool2, List list, boolean z, Date date, Date date2, Date date3, int i, int i2, int i3, List list2, List list3, Map map, List list4, List list5, Long l, PushPreference pushPreference, Map map2, Date date4, int i4, Object obj) {
        Date date5;
        Map map3;
        String str6 = (i4 & 1) != 0 ? user.id : str;
        String str7 = (i4 & 2) != 0 ? user.role : str2;
        String str8 = (i4 & 4) != 0 ? user.name : str3;
        String str9 = (i4 & 8) != 0 ? user.image : str4;
        Boolean bool3 = (i4 & 16) != 0 ? user.invisible : bool;
        n6f n6fVar2 = (i4 & 32) != 0 ? user.privacySettings : n6fVar;
        String str10 = (i4 & 64) != 0 ? user.language : str5;
        Boolean bool4 = (i4 & 128) != 0 ? user.banned : bool2;
        List list6 = (i4 & 256) != 0 ? user.devices : list;
        boolean z2 = (i4 & Barcode.FORMAT_UPC_A) != 0 ? user.online : z;
        Date date6 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? user.createdAt : date;
        Date date7 = (i4 & 2048) != 0 ? user.updatedAt : date2;
        Date date8 = (i4 & 4096) != 0 ? user.lastActive : date3;
        int i5 = (i4 & 8192) != 0 ? user.totalUnreadCount : i;
        String str11 = str6;
        int i6 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? user.unreadChannels : i2;
        int i7 = (i4 & 32768) != 0 ? user.unreadThreads : i3;
        List list7 = (i4 & 65536) != 0 ? user.mutes : list2;
        List list8 = (i4 & 131072) != 0 ? user.teams : list3;
        Map map4 = (i4 & 262144) != 0 ? user.teamsRole : map;
        List list9 = (i4 & 524288) != 0 ? user.channelMutes : list4;
        List list10 = (i4 & 1048576) != 0 ? user.blockedUserIds : list5;
        Long l2 = (i4 & 2097152) != 0 ? user.avgResponseTime : l;
        PushPreference pushPreference2 = (i4 & 4194304) != 0 ? user.pushPreference : pushPreference;
        Map map5 = (i4 & 8388608) != 0 ? user.extraData : map2;
        if ((i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            map3 = map5;
            date5 = user.deactivatedAt;
        } else {
            date5 = date4;
            map3 = map5;
        }
        return user.copy(str11, str7, str8, str9, bool3, n6fVar2, str10, bool4, list6, z2, date6, date7, date8, i5, i6, i7, list7, list8, map4, list9, list10, l2, pushPreference2, map3, date5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component13, reason: from getter */
    public final Date getLastActive() {
        return this.lastActive;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* renamed from: component15, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    /* renamed from: component16, reason: from getter */
    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    public final List<Mute> component17() {
        return this.mutes;
    }

    public final List<String> component18() {
        return this.teams;
    }

    public final Map<String, String> component19() {
        return this.teamsRole;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final List<ChannelMute> component20() {
        return this.channelMutes;
    }

    public final List<String> component21() {
        return this.blockedUserIds;
    }

    /* renamed from: component22, reason: from getter */
    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    /* renamed from: component23, reason: from getter */
    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final Map<String, Object> component24() {
        return this.extraData;
    }

    /* renamed from: component25, reason: from getter */
    public final Date getDeactivatedAt() {
        return this.deactivatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getInvisible() {
        return this.invisible;
    }

    /* renamed from: component6, reason: from getter */
    public final n6f getPrivacySettings() {
        return this.privacySettings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    public final List<Device> component9() {
        return this.devices;
    }

    public final User copy(String id, String role, String name, String image, Boolean invisible, n6f privacySettings, String language, Boolean banned, List<Device> devices, boolean online, Date createdAt, Date updatedAt, Date lastActive, int totalUnreadCount, int unreadChannels, int unreadThreads, List<Mute> mutes, List<String> teams, Map<String, String> teamsRole, List<ChannelMute> channelMutes, List<String> blockedUserIds, Long avgResponseTime, PushPreference pushPreference, Map<String, ? extends Object> extraData, Date deactivatedAt) {
        k84.p(id, role, name, image, language);
        devices.getClass();
        mutes.getClass();
        teams.getClass();
        teamsRole.getClass();
        channelMutes.getClass();
        blockedUserIds.getClass();
        extraData.getClass();
        return new User(id, role, name, image, invisible, privacySettings, language, banned, devices, online, createdAt, updatedAt, lastActive, totalUnreadCount, unreadChannels, unreadThreads, mutes, teams, teamsRole, channelMutes, blockedUserIds, avgResponseTime, pushPreference, extraData, deactivatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        if (Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.role, user.role) && Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.image, user.image) && Intrinsics.areEqual(this.invisible, user.invisible) && Intrinsics.areEqual(this.privacySettings, user.privacySettings) && Intrinsics.areEqual(this.language, user.language) && Intrinsics.areEqual(this.banned, user.banned) && Intrinsics.areEqual(this.devices, user.devices) && this.online == user.online && Intrinsics.areEqual(this.createdAt, user.createdAt) && Intrinsics.areEqual(this.updatedAt, user.updatedAt) && Intrinsics.areEqual(this.lastActive, user.lastActive) && this.totalUnreadCount == user.totalUnreadCount && this.unreadChannels == user.unreadChannels && this.unreadThreads == user.unreadThreads && Intrinsics.areEqual(this.mutes, user.mutes) && Intrinsics.areEqual(this.teams, user.teams) && Intrinsics.areEqual(this.teamsRole, user.teamsRole) && Intrinsics.areEqual(this.channelMutes, user.channelMutes) && Intrinsics.areEqual(this.blockedUserIds, user.blockedUserIds) && Intrinsics.areEqual(this.avgResponseTime, user.avgResponseTime) && Intrinsics.areEqual(this.pushPreference, user.pushPreference) && Intrinsics.areEqual(this.extraData, user.extraData) && Intrinsics.areEqual(this.deactivatedAt, user.deactivatedAt)) {
            return true;
        }
        return false;
    }

    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public final Boolean getBanned() {
        return this.banned;
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final List<ChannelMute> getChannelMutes() {
        return this.channelMutes;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r1.lastActive;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2.equals("lastActive") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r2.equals("created_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r2.equals("totalUnreadCount") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0127, code lost:
    
        return java.lang.Integer.valueOf(r1.totalUnreadCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r2.equals("createdAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r2.equals("deactivated_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return r1.deactivatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r2.equals("deactivatedAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if (r2.equals("updated_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.equals("avgResponseTime") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        if (r2.equals("avg_response_time") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (r2.equals("unreadThreads") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        return java.lang.Integer.valueOf(r1.unreadThreads);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (r2.equals("unreadChannels") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        return java.lang.Integer.valueOf(r1.unreadChannels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00af, code lost:
    
        return r1.avgResponseTime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        if (r2.equals("unread_threads") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        if (r2.equals("unread_channels") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011e, code lost:
    
        if (r2.equals("total_unread_count") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012e, code lost:
    
        if (r2.equals("updatedAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("last_active") == false) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f A[RETURN] */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Comparable<?> getComparableField(String fieldName) {
        Object obj;
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -1949194674:
                break;
            case -1906547302:
                break;
            case -1901805651:
                if (fieldName.equals("invisible")) {
                    return this.invisible;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                    return (Comparable) obj;
                }
                return null;
            case -1876650400:
                break;
            case -1721782503:
                break;
            case -1613589672:
                if (fieldName.equals(Keys.KEY_LANGUAGE)) {
                    return this.language;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case -1396343010:
                if (fieldName.equals("banned")) {
                    return this.banned;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case -1244799841:
                break;
            case -1012222381:
                if (fieldName.equals("online")) {
                    return Boolean.valueOf(this.online);
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case -731568902:
                break;
            case -434082466:
                break;
            case -295464393:
                break;
            case -269980989:
                break;
            case 3355:
                if (fieldName.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return this.id;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3373707:
                if (fieldName.equals(Keys.KEY_NAME)) {
                    return this.name;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3506294:
                if (fieldName.equals("role")) {
                    return this.role;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 100313435:
                if (fieldName.equals("image")) {
                    return this.image;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 220552290:
                break;
            case 598371643:
                break;
            case 1189461180:
                break;
            case 1369680106:
                break;
            case 1408775484:
                break;
            case 1505031375:
                break;
            case 2125067936:
                break;
            default:
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getDeactivatedAt() {
        return this.deactivatedAt;
    }

    public final List<Device> getDevices() {
        return this.devices;
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

    public final String getImage() {
        return this.image;
    }

    public final Boolean getInvisible() {
        return this.invisible;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Date getLastActive() {
        return this.lastActive;
    }

    public final List<Mute> getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final n6f getPrivacySettings() {
        return this.privacySettings;
    }

    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Map<String, String> getTeamsRole() {
        return this.teamsRole;
    }

    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int e = hdi.e(hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.role), 31, this.name), 31, this.image);
        Boolean bool = this.invisible;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        n6f n6fVar = this.privacySettings;
        if (n6fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = n6fVar.hashCode();
        }
        int e2 = hdi.e((i2 + hashCode2) * 31, 31, this.language);
        Boolean bool2 = this.banned;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int g = hdi.g(hdi.f((e2 + hashCode3) * 31, 31, this.devices), 31, this.online);
        Date date = this.createdAt;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i3 = (g + hashCode4) * 31;
        Date date2 = this.updatedAt;
        if (date2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date2.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        Date date3 = this.lastActive;
        if (date3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = date3.hashCode();
        }
        int f = hdi.f(hdi.f(sv6.c(this.teamsRole, hdi.f(hdi.f(woa.b(this.unreadThreads, woa.b(this.unreadChannels, woa.b(this.totalUnreadCount, (i4 + hashCode6) * 31, 31), 31), 31), 31, this.mutes), 31, this.teams), 31), 31, this.channelMutes), 31, this.blockedUserIds);
        Long l = this.avgResponseTime;
        if (l == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l.hashCode();
        }
        int i5 = (f + hashCode7) * 31;
        PushPreference pushPreference = this.pushPreference;
        if (pushPreference == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = pushPreference.hashCode();
        }
        int c = sv6.c(this.extraData, (i5 + hashCode8) * 31, 31);
        Date date4 = this.deactivatedAt;
        if (date4 != null) {
            i = date4.hashCode();
        }
        return c + i;
    }

    public final boolean isBanned() {
        return Intrinsics.areEqual(this.banned, Boolean.TRUE);
    }

    public final boolean isDeliveryReceiptsEnabled() {
        fl6 fl6Var;
        n6f n6fVar = this.privacySettings;
        if (n6fVar != null && (fl6Var = n6fVar.b) != null) {
            return fl6Var.a;
        }
        return true;
    }

    public final boolean isInvisible() {
        return Intrinsics.areEqual(this.invisible, Boolean.TRUE);
    }

    public final boolean isReadReceiptsEnabled() {
        uof uofVar;
        n6f n6fVar = this.privacySettings;
        if (n6fVar != null && (uofVar = n6fVar.c) != null) {
            return uofVar.a;
        }
        return true;
    }

    public final boolean isTypingIndicatorsEnabled() {
        djj djjVar;
        n6f n6fVar = this.privacySettings;
        if (n6fVar != null && (djjVar = n6fVar.a) != null) {
            return djjVar.a;
        }
        return true;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.role;
        String str3 = this.name;
        String str4 = this.image;
        Boolean bool = this.invisible;
        n6f n6fVar = this.privacySettings;
        String str5 = this.language;
        Boolean bool2 = this.banned;
        List<Device> list = this.devices;
        boolean z = this.online;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.lastActive;
        int i = this.totalUnreadCount;
        int i2 = this.unreadChannels;
        int i3 = this.unreadThreads;
        List<Mute> list2 = this.mutes;
        List<String> list3 = this.teams;
        Map<String, String> map = this.teamsRole;
        List<ChannelMute> list4 = this.channelMutes;
        List<String> list5 = this.blockedUserIds;
        Long l = this.avgResponseTime;
        PushPreference pushPreference = this.pushPreference;
        Map<String, Object> map2 = this.extraData;
        Date date4 = this.deactivatedAt;
        StringBuilder r = m51.r("User(id=", str, ", role=", str2, ", name=");
        k84.q(r, str3, ", image=", str4, ", invisible=");
        r.append(bool);
        r.append(", privacySettings=");
        r.append(n6fVar);
        r.append(", language=");
        r.append(str5);
        r.append(", banned=");
        r.append(bool2);
        r.append(", devices=");
        r.append(list);
        r.append(", online=");
        r.append(z);
        r.append(", createdAt=");
        sv6.B(r, date, ", updatedAt=", date2, ", lastActive=");
        r.append(date3);
        r.append(", totalUnreadCount=");
        r.append(i);
        r.append(", unreadChannels=");
        k84.i(i2, i3, ", unreadThreads=", ", mutes=", r);
        ace.D(r, list2, ", teams=", list3, ", teamsRole=");
        r.append(map);
        r.append(", channelMutes=");
        r.append(list4);
        r.append(", blockedUserIds=");
        r.append(list5);
        r.append(", avgResponseTime=");
        r.append(l);
        r.append(", pushPreference=");
        r.append(pushPreference);
        r.append(", extraData=");
        r.append(map2);
        r.append(", deactivatedAt=");
        return sv6.q(r, date4, ")");
    }

    public User(String str, String str2, String str3, String str4, Boolean bool, n6f n6fVar, String str5, Boolean bool2, List<Device> list, boolean z, Date date, Date date2, Date date3, int i, int i2, int i3, List<Mute> list2, List<String> list3, Map<String, String> map, List<ChannelMute> list4, List<String> list5, Long l, PushPreference pushPreference, Map<String, ? extends Object> map2, Date date4) {
        k84.p(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        list4.getClass();
        list5.getClass();
        map2.getClass();
        this.id = str;
        this.role = str2;
        this.name = str3;
        this.image = str4;
        this.invisible = bool;
        this.privacySettings = n6fVar;
        this.language = str5;
        this.banned = bool2;
        this.devices = list;
        this.online = z;
        this.createdAt = date;
        this.updatedAt = date2;
        this.lastActive = date3;
        this.totalUnreadCount = i;
        this.unreadChannels = i2;
        this.unreadThreads = i3;
        this.mutes = list2;
        this.teams = list3;
        this.teamsRole = map;
        this.channelMutes = list4;
        this.blockedUserIds = list5;
        this.avgResponseTime = l;
        this.pushPreference = pushPreference;
        this.extraData = map2;
        this.deactivatedAt = date4;
    }

    public User() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\u001b\u0010 \u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010%¢\u0006\u0004\b*\u0010(J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010%¢\u0006\u0004\b,\u0010(J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00100J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020-¢\u0006\u0004\b4\u00100J\u001b\u00107\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001d¢\u0006\u0004\b7\u0010!J\u001b\u00109\u001a\u00020\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\u0004\b9\u0010!J!\u0010<\u001a\u00020\u00002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070:¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u00020\u00002\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001d¢\u0006\u0004\b@\u0010!J\u001b\u0010B\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\u0004\bB\u0010!J\u0015\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JJ!\u0010L\u001a\u00020\u00002\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0004\bL\u0010=J\u0017\u0010N\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010%¢\u0006\u0004\bN\u0010(J\r\u0010O\u001a\u00020\u0004¢\u0006\u0004\bO\u0010PR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010QR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010QR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010QR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010SR\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010QR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010TR\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010UR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u0010)\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010VR\u0018\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010VR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010WR\u0016\u00101\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010WR\u0016\u00103\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010WR\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010TR\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010TR\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010XR\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010TR\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010TR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010YR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ZR\"\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010XR\u0018\u0010M\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010V¨\u0006["}, d2 = {"Lio/getstream/chat/android/models/User$Builder;", "", "<init>", "()V", "Lio/getstream/chat/android/models/User;", "user", "(Lio/getstream/chat/android/models/User;)V", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "withId", "(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;", "role", "withRole", Keys.KEY_NAME, "withName", "image", "withImage", "", "invisible", "withInvisible", "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/User$Builder;", "Ln6f;", "privacySettings", "withPrivacySettings", "(Ln6f;)Lio/getstream/chat/android/models/User$Builder;", Keys.KEY_LANGUAGE, "withLanguage", "banned", "withBanned", "", "Lio/getstream/chat/android/models/Device;", "devices", "withDevices", "(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;", "online", "withOnline", "(Z)Lio/getstream/chat/android/models/User$Builder;", "Ljava/util/Date;", "createdAt", "withCreatedAt", "(Ljava/util/Date;)Lio/getstream/chat/android/models/User$Builder;", "updatedAt", "withUpdatedAt", "lastActive", "withLastActive", "", "totalUnreadCount", "withTotalUnreadCount", "(I)Lio/getstream/chat/android/models/User$Builder;", "unreadChannels", "withUnreadChannels", "unreadThreads", "withUnreadThreads", "Lio/getstream/chat/android/models/Mute;", "mutes", "withMutes", "teams", "withTeams", "", "teamsRole", "withTeamsRole", "(Ljava/util/Map;)Lio/getstream/chat/android/models/User$Builder;", "Lio/getstream/chat/android/models/ChannelMute;", "channelMutes", "withChannelMutes", "blockedUserIds", "withBlockedUserIds", "", "avgResponseTime", "withAvgResponseTime", "(J)Lio/getstream/chat/android/models/User$Builder;", "Lio/getstream/chat/android/models/PushPreference;", "pushPreference", "withPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)Lio/getstream/chat/android/models/User$Builder;", "extraData", "withExtraData", "deactivatedAt", "withDeactivatedAt", "build", "()Lio/getstream/chat/android/models/User;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Ln6f;", "Ljava/util/List;", "Z", "Ljava/util/Date;", "I", "Ljava/util/Map;", "Ljava/lang/Long;", "Lio/getstream/chat/android/models/PushPreference;", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private Long avgResponseTime;
        private Boolean banned;
        private List<String> blockedUserIds;
        private List<ChannelMute> channelMutes;
        private Date createdAt;
        private Date deactivatedAt;
        private List<Device> devices;
        private Map<String, ? extends Object> extraData;
        private String id;
        private String image;
        private Boolean invisible;
        private String language;
        private Date lastActive;
        private List<Mute> mutes;
        private String name;
        private boolean online;
        private n6f privacySettings;
        private PushPreference pushPreference;
        private String role;
        private List<String> teams;
        private Map<String, String> teamsRole;
        private int totalUnreadCount;
        private int unreadChannels;
        private int unreadThreads;
        private Date updatedAt;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(User user) {
            this();
            user.getClass();
            this.id = user.getId();
            this.role = user.getRole();
            this.name = user.getName();
            this.image = user.getImage();
            this.invisible = user.getInvisible();
            this.privacySettings = user.getPrivacySettings();
            this.language = user.getLanguage();
            this.banned = user.getBanned();
            this.devices = user.getDevices();
            this.online = user.getOnline();
            this.createdAt = user.getCreatedAt();
            this.updatedAt = user.getUpdatedAt();
            this.lastActive = user.getLastActive();
            this.totalUnreadCount = user.getTotalUnreadCount();
            this.unreadChannels = user.getUnreadChannels();
            this.unreadThreads = user.getUnreadThreads();
            this.mutes = user.getMutes();
            this.teams = user.getTeams();
            this.teamsRole = user.getTeamsRole();
            this.channelMutes = user.getChannelMutes();
            this.blockedUserIds = user.getBlockedUserIds();
            this.avgResponseTime = user.getAvgResponseTime();
            this.pushPreference = user.getPushPreference();
            this.extraData = user.getExtraData();
            this.deactivatedAt = user.getDeactivatedAt();
        }

        public final User build() {
            return new User(this.id, this.role, this.name, this.image, this.invisible, this.privacySettings, this.language, this.banned, this.devices, this.online, this.createdAt, this.updatedAt, this.lastActive, this.totalUnreadCount, this.unreadChannels, this.unreadThreads, this.mutes, this.teams, this.teamsRole, this.channelMutes, this.blockedUserIds, this.avgResponseTime, this.pushPreference, d1c.p(this.extraData), this.deactivatedAt);
        }

        public final Builder withAvgResponseTime(long avgResponseTime) {
            this.avgResponseTime = Long.valueOf(avgResponseTime);
            return this;
        }

        public final Builder withBanned(Boolean banned) {
            this.banned = banned;
            return this;
        }

        public final Builder withBlockedUserIds(List<String> blockedUserIds) {
            blockedUserIds.getClass();
            this.blockedUserIds = blockedUserIds;
            return this;
        }

        public final Builder withChannelMutes(List<ChannelMute> channelMutes) {
            channelMutes.getClass();
            this.channelMutes = channelMutes;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withDeactivatedAt(Date deactivatedAt) {
            this.deactivatedAt = deactivatedAt;
            return this;
        }

        public final Builder withDevices(List<Device> devices) {
            devices.getClass();
            this.devices = devices;
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

        public final Builder withImage(String image) {
            image.getClass();
            this.image = image;
            return this;
        }

        public final Builder withInvisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }

        public final Builder withLanguage(String language) {
            language.getClass();
            this.language = language;
            return this;
        }

        public final Builder withLastActive(Date lastActive) {
            this.lastActive = lastActive;
            return this;
        }

        public final Builder withMutes(List<Mute> mutes) {
            mutes.getClass();
            this.mutes = mutes;
            return this;
        }

        public final Builder withName(String name) {
            name.getClass();
            this.name = name;
            return this;
        }

        public final Builder withOnline(boolean online) {
            this.online = online;
            return this;
        }

        public final Builder withPrivacySettings(n6f privacySettings) {
            this.privacySettings = privacySettings;
            return this;
        }

        public final Builder withPushPreference(PushPreference pushPreference) {
            this.pushPreference = pushPreference;
            return this;
        }

        public final Builder withRole(String role) {
            role.getClass();
            this.role = role;
            return this;
        }

        public final Builder withTeams(List<String> teams) {
            teams.getClass();
            this.teams = teams;
            return this;
        }

        public final Builder withTeamsRole(Map<String, String> teamsRole) {
            teamsRole.getClass();
            this.teamsRole = teamsRole;
            return this;
        }

        public final Builder withTotalUnreadCount(int totalUnreadCount) {
            this.totalUnreadCount = totalUnreadCount;
            return this;
        }

        public final Builder withUnreadChannels(int unreadChannels) {
            this.unreadChannels = unreadChannels;
            return this;
        }

        public final Builder withUnreadThreads(int unreadThreads) {
            this.unreadThreads = unreadThreads;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder() {
            this.id = "";
            this.role = "";
            this.name = "";
            this.image = "";
            this.language = "";
            this.devices = CollectionsKt.emptyList();
            this.mutes = CollectionsKt.emptyList();
            this.teams = CollectionsKt.emptyList();
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.teamsRole = zc7Var;
            this.channelMutes = CollectionsKt.emptyList();
            this.blockedUserIds = CollectionsKt.emptyList();
            this.extraData = new LinkedHashMap();
        }
    }
}
