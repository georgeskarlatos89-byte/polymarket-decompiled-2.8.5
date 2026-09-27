package defpackage;

import io.getstream.chat.android.models.SyncStatus;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mhi {
    public static SyncStatus a(int i) {
        SyncStatus fromInt = SyncStatus.INSTANCE.fromInt(i);
        fromInt.getClass();
        return fromInt;
    }

    public static int b(SyncStatus syncStatus) {
        syncStatus.getClass();
        return syncStatus.getStatus();
    }
}
