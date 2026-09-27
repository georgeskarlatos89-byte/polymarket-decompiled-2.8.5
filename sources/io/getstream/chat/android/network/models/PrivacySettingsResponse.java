package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/network/models/PrivacySettingsResponse;", "", "Lio/getstream/chat/android/network/models/DeliveryReceiptsResponse;", "deliveryReceipts", "Lio/getstream/chat/android/network/models/ReadReceiptsResponse;", "readReceipts", "Lio/getstream/chat/android/network/models/TypingIndicatorsResponse;", "typingIndicators", "<init>", "(Lio/getstream/chat/android/network/models/DeliveryReceiptsResponse;Lio/getstream/chat/android/network/models/ReadReceiptsResponse;Lio/getstream/chat/android/network/models/TypingIndicatorsResponse;)V", "copy", "(Lio/getstream/chat/android/network/models/DeliveryReceiptsResponse;Lio/getstream/chat/android/network/models/ReadReceiptsResponse;Lio/getstream/chat/android/network/models/TypingIndicatorsResponse;)Lio/getstream/chat/android/network/models/PrivacySettingsResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PrivacySettingsResponse {
    public final DeliveryReceiptsResponse a;
    public final ReadReceiptsResponse b;
    public final TypingIndicatorsResponse c;

    public /* synthetic */ PrivacySettingsResponse(DeliveryReceiptsResponse deliveryReceiptsResponse, ReadReceiptsResponse readReceiptsResponse, TypingIndicatorsResponse typingIndicatorsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deliveryReceiptsResponse, (i & 2) != 0 ? null : readReceiptsResponse, (i & 4) != 0 ? null : typingIndicatorsResponse);
    }

    public final PrivacySettingsResponse copy(@zca(name = "delivery_receipts") DeliveryReceiptsResponse deliveryReceipts, @zca(name = "read_receipts") ReadReceiptsResponse readReceipts, @zca(name = "typing_indicators") TypingIndicatorsResponse typingIndicators) {
        return new PrivacySettingsResponse(deliveryReceipts, readReceipts, typingIndicators);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsResponse)) {
            return false;
        }
        PrivacySettingsResponse privacySettingsResponse = (PrivacySettingsResponse) obj;
        if (Intrinsics.areEqual(this.a, privacySettingsResponse.a) && Intrinsics.areEqual(this.b, privacySettingsResponse.b) && Intrinsics.areEqual(this.c, privacySettingsResponse.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        DeliveryReceiptsResponse deliveryReceiptsResponse = this.a;
        if (deliveryReceiptsResponse == null) {
            hashCode = 0;
        } else {
            hashCode = Boolean.hashCode(deliveryReceiptsResponse.a);
        }
        int i2 = hashCode * 31;
        ReadReceiptsResponse readReceiptsResponse = this.b;
        if (readReceiptsResponse == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Boolean.hashCode(readReceiptsResponse.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        TypingIndicatorsResponse typingIndicatorsResponse = this.c;
        if (typingIndicatorsResponse != null) {
            i = Boolean.hashCode(typingIndicatorsResponse.a);
        }
        return i3 + i;
    }

    public final String toString() {
        return "PrivacySettingsResponse(deliveryReceipts=" + this.a + ", readReceipts=" + this.b + ", typingIndicators=" + this.c + ")";
    }

    public PrivacySettingsResponse(@zca(name = "delivery_receipts") DeliveryReceiptsResponse deliveryReceiptsResponse, @zca(name = "read_receipts") ReadReceiptsResponse readReceiptsResponse, @zca(name = "typing_indicators") TypingIndicatorsResponse typingIndicatorsResponse) {
        this.a = deliveryReceiptsResponse;
        this.b = readReceiptsResponse;
        this.c = typingIndicatorsResponse;
    }
}
