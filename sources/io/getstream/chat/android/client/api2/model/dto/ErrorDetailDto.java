package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;", "", ApiConstant.KEY_CODE, "", "messages", "", "", "<init>", "(ILjava/util/List;)V", "getCode", "()I", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ErrorDetailDto {
    private final int code;
    private final List<String> messages;

    public /* synthetic */ ErrorDetailDto(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorDetailDto copy$default(ErrorDetailDto errorDetailDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = errorDetailDto.code;
        }
        if ((i2 & 2) != 0) {
            list = errorDetailDto.messages;
        }
        return errorDetailDto.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final List<String> component2() {
        return this.messages;
    }

    public final ErrorDetailDto copy(int code, List<String> messages) {
        messages.getClass();
        return new ErrorDetailDto(code, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDetailDto)) {
            return false;
        }
        ErrorDetailDto errorDetailDto = (ErrorDetailDto) other;
        if (this.code == errorDetailDto.code && Intrinsics.areEqual(this.messages, errorDetailDto.messages)) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<String> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public String toString() {
        return "ErrorDetailDto(code=" + this.code + ", messages=" + this.messages + ")";
    }

    public ErrorDetailDto(int i, List<String> list) {
        list.getClass();
        this.code = i;
        this.messages = list;
    }

    public ErrorDetailDto() {
        this(0, null, 3, null);
    }
}
