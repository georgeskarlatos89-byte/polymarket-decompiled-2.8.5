package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "Lio/getstream/chat/android/client/api2/model/dto/VideoCallDto;", "roomId", "", "roomName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getRoomName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class HMSDto implements VideoCallDto {

    @zca(name = "room_id")
    private final String roomId;

    @zca(name = "room_name")
    private final String roomName;

    public HMSDto(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.roomId = str;
        this.roomName = str2;
    }

    public static /* synthetic */ HMSDto copy$default(HMSDto hMSDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hMSDto.roomId;
        }
        if ((i & 2) != 0) {
            str2 = hMSDto.roomName;
        }
        return hMSDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    public final HMSDto copy(String roomId, String roomName) {
        roomId.getClass();
        roomName.getClass();
        return new HMSDto(roomId, roomName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSDto)) {
            return false;
        }
        HMSDto hMSDto = (HMSDto) other;
        if (Intrinsics.areEqual(this.roomId, hMSDto.roomId) && Intrinsics.areEqual(this.roomName, hMSDto.roomName)) {
            return true;
        }
        return false;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public int hashCode() {
        return this.roomName.hashCode() + (this.roomId.hashCode() * 31);
    }

    public String toString() {
        return hdi.p("HMSDto(roomId=", this.roomId, ", roomName=", this.roomName, ")");
    }
}
