package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ReminderInfoEntity {
    public final Date a;
    public final Date b;
    public final Date c;

    public ReminderInfoEntity(Date date, Date date2, Date date3) {
        date2.getClass();
        date3.getClass();
        this.a = date;
        this.b = date2;
        this.c = date3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderInfoEntity)) {
            return false;
        }
        ReminderInfoEntity reminderInfoEntity = (ReminderInfoEntity) obj;
        if (Intrinsics.areEqual(this.a, reminderInfoEntity.a) && Intrinsics.areEqual(this.b, reminderInfoEntity.b) && Intrinsics.areEqual(this.c, reminderInfoEntity.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Date date = this.a;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.c.hashCode() + woa.f(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReminderInfoEntity(remindAt=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", updatedAt=");
        return sv6.q(sb, this.c, ")");
    }
}
