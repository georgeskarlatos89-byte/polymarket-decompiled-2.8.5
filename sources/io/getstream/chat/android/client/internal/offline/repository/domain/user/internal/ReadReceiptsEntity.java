package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ReadReceiptsEntity {
    public final boolean a;

    public ReadReceiptsEntity(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ReadReceiptsEntity) && this.a == ((ReadReceiptsEntity) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return m51.l("ReadReceiptsEntity(enabled=", ")", this.a);
    }
}
