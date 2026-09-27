package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "channel_cid", "", "quoted_message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "parent_id", "parent_message", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "getChannel_cid", "()Ljava/lang/String;", "getQuoted_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getParent_id", "getParent_message", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamDraftDto {
    private final String channel_cid;
    private final DownstreamDraftMessageDto message;
    private final String parent_id;
    private final DownstreamMessageDto parent_message;
    private final DownstreamMessageDto quoted_message;

    public DownstreamDraftDto(DownstreamDraftMessageDto downstreamDraftMessageDto, String str, DownstreamMessageDto downstreamMessageDto, String str2, DownstreamMessageDto downstreamMessageDto2) {
        downstreamDraftMessageDto.getClass();
        str.getClass();
        this.message = downstreamDraftMessageDto;
        this.channel_cid = str;
        this.quoted_message = downstreamMessageDto;
        this.parent_id = str2;
        this.parent_message = downstreamMessageDto2;
    }

    public static /* synthetic */ DownstreamDraftDto copy$default(DownstreamDraftDto downstreamDraftDto, DownstreamDraftMessageDto downstreamDraftMessageDto, String str, DownstreamMessageDto downstreamMessageDto, String str2, DownstreamMessageDto downstreamMessageDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamDraftMessageDto = downstreamDraftDto.message;
        }
        if ((i & 2) != 0) {
            str = downstreamDraftDto.channel_cid;
        }
        if ((i & 4) != 0) {
            downstreamMessageDto = downstreamDraftDto.quoted_message;
        }
        if ((i & 8) != 0) {
            str2 = downstreamDraftDto.parent_id;
        }
        if ((i & 16) != 0) {
            downstreamMessageDto2 = downstreamDraftDto.parent_message;
        }
        DownstreamMessageDto downstreamMessageDto3 = downstreamMessageDto2;
        DownstreamMessageDto downstreamMessageDto4 = downstreamMessageDto;
        return downstreamDraftDto.copy(downstreamDraftMessageDto, str, downstreamMessageDto4, str2, downstreamMessageDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamDraftMessageDto getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* renamed from: component3, reason: from getter */
    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    /* renamed from: component5, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final DownstreamDraftDto copy(DownstreamDraftMessageDto message, String channel_cid, DownstreamMessageDto quoted_message, String parent_id, DownstreamMessageDto parent_message) {
        message.getClass();
        channel_cid.getClass();
        return new DownstreamDraftDto(message, channel_cid, quoted_message, parent_id, parent_message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamDraftDto)) {
            return false;
        }
        DownstreamDraftDto downstreamDraftDto = (DownstreamDraftDto) other;
        if (Intrinsics.areEqual(this.message, downstreamDraftDto.message) && Intrinsics.areEqual(this.channel_cid, downstreamDraftDto.channel_cid) && Intrinsics.areEqual(this.quoted_message, downstreamDraftDto.quoted_message) && Intrinsics.areEqual(this.parent_id, downstreamDraftDto.parent_id) && Intrinsics.areEqual(this.parent_message, downstreamDraftDto.parent_message)) {
            return true;
        }
        return false;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final DownstreamDraftMessageDto getMessage() {
        return this.message;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int e = hdi.e(this.message.hashCode() * 31, 31, this.channel_cid);
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        int i = 0;
        if (downstreamMessageDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamMessageDto.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        String str = this.parent_id;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        DownstreamMessageDto downstreamMessageDto2 = this.parent_message;
        if (downstreamMessageDto2 != null) {
            i = downstreamMessageDto2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "DownstreamDraftDto(message=" + this.message + ", channel_cid=" + this.channel_cid + ", quoted_message=" + this.quoted_message + ", parent_id=" + this.parent_id + ", parent_message=" + this.parent_message + ")";
    }

    public /* synthetic */ DownstreamDraftDto(DownstreamDraftMessageDto downstreamDraftMessageDto, String str, DownstreamMessageDto downstreamMessageDto, String str2, DownstreamMessageDto downstreamMessageDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamDraftMessageDto, str, (i & 4) != 0 ? null : downstreamMessageDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : downstreamMessageDto2);
    }
}
