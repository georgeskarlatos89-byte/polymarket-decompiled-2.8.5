package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;", "", Keys.KEY_NAME, "", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamChannelCustomDto {
    private final String image;
    private final String name;

    public DownstreamChannelCustomDto(String str, String str2) {
        this.name = str;
        this.image = str2;
    }

    public static /* synthetic */ DownstreamChannelCustomDto copy$default(DownstreamChannelCustomDto downstreamChannelCustomDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamChannelCustomDto.name;
        }
        if ((i & 2) != 0) {
            str2 = downstreamChannelCustomDto.image;
        }
        return downstreamChannelCustomDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final DownstreamChannelCustomDto copy(String name, String image) {
        return new DownstreamChannelCustomDto(name, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelCustomDto)) {
            return false;
        }
        DownstreamChannelCustomDto downstreamChannelCustomDto = (DownstreamChannelCustomDto) other;
        if (Intrinsics.areEqual(this.name, downstreamChannelCustomDto.name) && Intrinsics.areEqual(this.image, downstreamChannelCustomDto.image)) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.image;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return hdi.p("DownstreamChannelCustomDto(name=", this.name, ", image=", this.image, ")");
    }
}
