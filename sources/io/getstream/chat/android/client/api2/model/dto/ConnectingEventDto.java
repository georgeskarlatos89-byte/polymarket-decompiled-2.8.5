package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ConnectingEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ConnectingEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectingEventDto(String str, ExactDate exactDate) {
        super(null);
        str.getClass();
        exactDate.getClass();
        this.type = str;
        this.created_at = exactDate;
    }

    public static /* synthetic */ ConnectingEventDto copy$default(ConnectingEventDto connectingEventDto, String str, ExactDate exactDate, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectingEventDto.type;
        }
        if ((i & 2) != 0) {
            exactDate = connectingEventDto.created_at;
        }
        return connectingEventDto.copy(str, exactDate);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final ConnectingEventDto copy(String type, ExactDate created_at) {
        type.getClass();
        created_at.getClass();
        return new ConnectingEventDto(type, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectingEventDto)) {
            return false;
        }
        ConnectingEventDto connectingEventDto = (ConnectingEventDto) other;
        if (Intrinsics.areEqual(this.type, connectingEventDto.type) && Intrinsics.areEqual(this.created_at, connectingEventDto.created_at)) {
            return true;
        }
        return false;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.created_at.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "ConnectingEventDto(type=" + this.type + ", created_at=" + this.created_at + ")";
    }
}
