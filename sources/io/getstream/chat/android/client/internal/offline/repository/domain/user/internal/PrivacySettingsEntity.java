package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PrivacySettingsEntity {
    public final TypingIndicatorsEntity a;
    public final ReadReceiptsEntity b;
    public final DeliveryReceiptsEntity c;

    public /* synthetic */ PrivacySettingsEntity(TypingIndicatorsEntity typingIndicatorsEntity, ReadReceiptsEntity readReceiptsEntity, DeliveryReceiptsEntity deliveryReceiptsEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typingIndicatorsEntity, (i & 2) != 0 ? null : readReceiptsEntity, (i & 4) != 0 ? null : deliveryReceiptsEntity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsEntity)) {
            return false;
        }
        PrivacySettingsEntity privacySettingsEntity = (PrivacySettingsEntity) obj;
        if (Intrinsics.areEqual(this.a, privacySettingsEntity.a) && Intrinsics.areEqual(this.b, privacySettingsEntity.b) && Intrinsics.areEqual(this.c, privacySettingsEntity.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        TypingIndicatorsEntity typingIndicatorsEntity = this.a;
        if (typingIndicatorsEntity == null) {
            hashCode = 0;
        } else {
            hashCode = Boolean.hashCode(typingIndicatorsEntity.a);
        }
        int i2 = hashCode * 31;
        ReadReceiptsEntity readReceiptsEntity = this.b;
        if (readReceiptsEntity == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Boolean.hashCode(readReceiptsEntity.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        DeliveryReceiptsEntity deliveryReceiptsEntity = this.c;
        if (deliveryReceiptsEntity != null) {
            i = Boolean.hashCode(deliveryReceiptsEntity.a);
        }
        return i3 + i;
    }

    public final String toString() {
        return "PrivacySettingsEntity(typingIndicators=" + this.a + ", readReceipts=" + this.b + ", deliveryReceipts=" + this.c + ")";
    }

    public PrivacySettingsEntity(TypingIndicatorsEntity typingIndicatorsEntity, ReadReceiptsEntity readReceiptsEntity, DeliveryReceiptsEntity deliveryReceiptsEntity) {
        this.a = typingIndicatorsEntity;
        this.b = readReceiptsEntity;
        this.c = deliveryReceiptsEntity;
    }
}
