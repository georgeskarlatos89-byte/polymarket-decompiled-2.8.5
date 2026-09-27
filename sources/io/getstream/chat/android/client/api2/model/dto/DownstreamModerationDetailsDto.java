package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "", "original_text", "", "action", "error_msg", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getOriginal_text", "()Ljava/lang/String;", "getAction", "getError_msg", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamModerationDetailsDto {
    private final String action;
    private final String error_msg;
    private final Map<String, Object> extraData;
    private final String original_text;

    public DownstreamModerationDetailsDto(String str, String str2, String str3, Map<String, ? extends Object> map) {
        map.getClass();
        this.original_text = str;
        this.action = str2;
        this.error_msg = str3;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamModerationDetailsDto copy$default(DownstreamModerationDetailsDto downstreamModerationDetailsDto, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamModerationDetailsDto.original_text;
        }
        if ((i & 2) != 0) {
            str2 = downstreamModerationDetailsDto.action;
        }
        if ((i & 4) != 0) {
            str3 = downstreamModerationDetailsDto.error_msg;
        }
        if ((i & 8) != 0) {
            map = downstreamModerationDetailsDto.extraData;
        }
        return downstreamModerationDetailsDto.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginal_text() {
        return this.original_text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError_msg() {
        return this.error_msg;
    }

    public final Map<String, Object> component4() {
        return this.extraData;
    }

    public final DownstreamModerationDetailsDto copy(String original_text, String action, String error_msg, Map<String, ? extends Object> extraData) {
        extraData.getClass();
        return new DownstreamModerationDetailsDto(original_text, action, error_msg, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamModerationDetailsDto)) {
            return false;
        }
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = (DownstreamModerationDetailsDto) other;
        if (Intrinsics.areEqual(this.original_text, downstreamModerationDetailsDto.original_text) && Intrinsics.areEqual(this.action, downstreamModerationDetailsDto.action) && Intrinsics.areEqual(this.error_msg, downstreamModerationDetailsDto.error_msg) && Intrinsics.areEqual(this.extraData, downstreamModerationDetailsDto.extraData)) {
            return true;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getError_msg() {
        return this.error_msg;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getOriginal_text() {
        return this.original_text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.original_text;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.action;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.error_msg;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.extraData.hashCode() + ((i3 + i) * 31);
    }

    public String toString() {
        String str = this.original_text;
        String str2 = this.action;
        String str3 = this.error_msg;
        Map<String, Object> map = this.extraData;
        StringBuilder r = m51.r("DownstreamModerationDetailsDto(original_text=", str, ", action=", str2, ", error_msg=");
        r.append(str3);
        r.append(", extraData=");
        r.append(map);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ DownstreamModerationDetailsDto(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, map);
    }
}
