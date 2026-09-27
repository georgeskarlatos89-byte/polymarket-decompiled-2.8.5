package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "", "typing_indicators", "Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;", "delivery_receipts", "Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;", "read_receipts", "Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;)V", "getTyping_indicators", "()Lio/getstream/chat/android/client/api2/model/dto/TypingIndicatorsDto;", "getDelivery_receipts", "()Lio/getstream/chat/android/client/api2/model/dto/DeliveryReceiptsDto;", "getRead_receipts", "()Lio/getstream/chat/android/client/api2/model/dto/ReadReceiptsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PrivacySettingsDto {
    private final DeliveryReceiptsDto delivery_receipts;
    private final ReadReceiptsDto read_receipts;
    private final TypingIndicatorsDto typing_indicators;

    public /* synthetic */ PrivacySettingsDto(TypingIndicatorsDto typingIndicatorsDto, DeliveryReceiptsDto deliveryReceiptsDto, ReadReceiptsDto readReceiptsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typingIndicatorsDto, (i & 2) != 0 ? null : deliveryReceiptsDto, (i & 4) != 0 ? null : readReceiptsDto);
    }

    public static /* synthetic */ PrivacySettingsDto copy$default(PrivacySettingsDto privacySettingsDto, TypingIndicatorsDto typingIndicatorsDto, DeliveryReceiptsDto deliveryReceiptsDto, ReadReceiptsDto readReceiptsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typingIndicatorsDto = privacySettingsDto.typing_indicators;
        }
        if ((i & 2) != 0) {
            deliveryReceiptsDto = privacySettingsDto.delivery_receipts;
        }
        if ((i & 4) != 0) {
            readReceiptsDto = privacySettingsDto.read_receipts;
        }
        return privacySettingsDto.copy(typingIndicatorsDto, deliveryReceiptsDto, readReceiptsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TypingIndicatorsDto getTyping_indicators() {
        return this.typing_indicators;
    }

    /* renamed from: component2, reason: from getter */
    public final DeliveryReceiptsDto getDelivery_receipts() {
        return this.delivery_receipts;
    }

    /* renamed from: component3, reason: from getter */
    public final ReadReceiptsDto getRead_receipts() {
        return this.read_receipts;
    }

    public final PrivacySettingsDto copy(TypingIndicatorsDto typing_indicators, DeliveryReceiptsDto delivery_receipts, ReadReceiptsDto read_receipts) {
        return new PrivacySettingsDto(typing_indicators, delivery_receipts, read_receipts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySettingsDto)) {
            return false;
        }
        PrivacySettingsDto privacySettingsDto = (PrivacySettingsDto) other;
        if (Intrinsics.areEqual(this.typing_indicators, privacySettingsDto.typing_indicators) && Intrinsics.areEqual(this.delivery_receipts, privacySettingsDto.delivery_receipts) && Intrinsics.areEqual(this.read_receipts, privacySettingsDto.read_receipts)) {
            return true;
        }
        return false;
    }

    public final DeliveryReceiptsDto getDelivery_receipts() {
        return this.delivery_receipts;
    }

    public final ReadReceiptsDto getRead_receipts() {
        return this.read_receipts;
    }

    public final TypingIndicatorsDto getTyping_indicators() {
        return this.typing_indicators;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        TypingIndicatorsDto typingIndicatorsDto = this.typing_indicators;
        int i = 0;
        if (typingIndicatorsDto == null) {
            hashCode = 0;
        } else {
            hashCode = typingIndicatorsDto.hashCode();
        }
        int i2 = hashCode * 31;
        DeliveryReceiptsDto deliveryReceiptsDto = this.delivery_receipts;
        if (deliveryReceiptsDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = deliveryReceiptsDto.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ReadReceiptsDto readReceiptsDto = this.read_receipts;
        if (readReceiptsDto != null) {
            i = readReceiptsDto.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "PrivacySettingsDto(typing_indicators=" + this.typing_indicators + ", delivery_receipts=" + this.delivery_receipts + ", read_receipts=" + this.read_receipts + ")";
    }

    public PrivacySettingsDto(TypingIndicatorsDto typingIndicatorsDto, DeliveryReceiptsDto deliveryReceiptsDto, ReadReceiptsDto readReceiptsDto) {
        this.typing_indicators = typingIndicatorsDto;
        this.delivery_receipts = deliveryReceiptsDto;
        this.read_receipts = readReceiptsDto;
    }

    public PrivacySettingsDto() {
        this(null, null, null, 7, null);
    }
}
